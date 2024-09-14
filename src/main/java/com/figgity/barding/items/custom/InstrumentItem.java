package com.figgity.barding.items.custom;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;

import java.util.List;

public class InstrumentItem extends Item {

    public InstrumentItem(Properties pProperties, int durability) {
        super(pProperties.durability(durability));
    }

    @Override
    public int getUseDuration(ItemStack pItemStack) {
        return 50;
    }

    @Override
    public UseAnim getUseAnimation(ItemStack pItemStack) {
        return UseAnim.BOW;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pInteractionHand) {
        pPlayer.startUsingItem(pInteractionHand);
        return InteractionResultHolder.success(pPlayer.getItemInHand(pInteractionHand));
    }

    @Override
    public ItemStack finishUsingItem(ItemStack pItemStack, Level pWorld, LivingEntity pLivingEntity) {
        postUseItem(pItemStack, pLivingEntity, 400);
        return pItemStack;
    }

    public void postUseItem(ItemStack itemstack, LivingEntity entity, int cooldownTicks){
        itemstack.setDamageValue(itemstack.getDamageValue()-1);

        if(entity instanceof Player player) {
            player.getCooldowns().addCooldown(itemstack.getItem(), cooldownTicks);}
    }

    public void afflictAlliesInRange(Level world, MobEffectInstance effect, float range, LivingEntity entity) {
        List<Player> nearbyPlayers = world.getNearbyPlayers(TargetingConditions.DEFAULT, entity, AABB.ofSize(entity.getPosition(0f), range, range, range/2));

        for (int i=0; i<nearbyPlayers.size(); i++) {
            Player player = nearbyPlayers.get(i);
            player.addEffect(effect);
        }
    }

    //public void afflictHostilesInRange(Level world, MobEffectInstance effect, float range, LivingEntity entity) {
    //    List<Player> nearbyPlayers = world.getNearbyEntities(LivingEntity.class, TargetingConditions.DEFAULT, entity, AABB.ofSize(entity.getPosition(0f), range, range, range/2));

    //    for (int i=0; i<nearbyPlayers.size(); i++) {
    //        Player player = nearbyPlayers.get(i);
    //        player.addEffect(effect);
    //    }
    //}
}

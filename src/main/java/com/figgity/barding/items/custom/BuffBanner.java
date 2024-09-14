package com.figgity.barding.items.custom;

import com.figgity.barding.effects.EffectInit;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class BuffBanner extends InstrumentItem{
    public BuffBanner(Properties pProperties) {
        super(pProperties,35);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack pItemStack, Level pWorld, LivingEntity pLivingEntity) {
        MobEffectInstance effect = new MobEffectInstance(EffectInit.STRENGTH_INSPIRE.get(), 1000, 0);

        afflictAlliesInRange(pWorld, effect, 4, pLivingEntity);
        pLivingEntity.addEffect(effect);

        postUseItem(pItemStack, pLivingEntity, 400);
        return pItemStack;
    }
}

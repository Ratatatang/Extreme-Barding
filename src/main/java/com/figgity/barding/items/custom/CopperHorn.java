package com.figgity.barding.items.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class CopperHorn extends InstrumentItem{
    public CopperHorn(Properties pProperties) {
        super(pProperties, 35);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack pItemStack, Level pWorld, LivingEntity pLivingEntity) {
        MobEffectInstance effect = new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1000, 1);

        afflictAlliesInRange(pWorld, effect, 4, pLivingEntity);
        pLivingEntity.addEffect(effect);

        postUseItem(pItemStack, pLivingEntity, 400);
        return pItemStack;
    }
}

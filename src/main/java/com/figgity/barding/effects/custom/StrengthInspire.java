package com.figgity.barding.effects.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;

public class StrengthInspire extends RedNote{
    public StrengthInspire() {
        super();
    }

    @Override
    public String getDescriptionId() {
        return "effect.barding.strength_inspire";
    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        pLivingEntity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 10, pAmplifier));
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}

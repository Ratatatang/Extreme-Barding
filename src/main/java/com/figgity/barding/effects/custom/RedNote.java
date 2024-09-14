package com.figgity.barding.effects.custom;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.player.Player;

import java.util.Collection;
import java.util.UUID;

public class RedNote extends MobEffect {
    public RedNote() {
        super(MobEffectCategory.BENEFICIAL, -261373);
    }

    /*@Override
    public void addAttributeModifiers(LivingEntity pLivingEntity, AttributeMap pAttributeMap, int pAmplifier) {
        MobEffectInstance[] effects = (MobEffectInstance[]) pLivingEntity.getActiveEffects().toArray();


        for (int i=0; i<effects.length; i++) {
            int effectColor = effects[i].getEffect().getColor();

            if(effectColor == -261373){ }
        }

        super.addAttributeModifiers(pLivingEntity, pAttributeMap, pAmplifier);
    }*/
}

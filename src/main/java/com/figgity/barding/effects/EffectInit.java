package com.figgity.barding.effects;

import com.figgity.barding.ExtremeBarding;
import com.figgity.barding.effects.custom.DefenseInspire;
import com.figgity.barding.effects.custom.SpeedInspire;
import com.figgity.barding.effects.custom.StrengthInspire;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EffectInit {
    public static final DeferredRegister<MobEffect> Effects =
        DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, ExtremeBarding.MODID);

    public static final RegistryObject<StrengthInspire> STRENGTH_INSPIRE = Effects.register("strength_inspire",
            () -> new StrengthInspire());
    public static final RegistryObject<SpeedInspire> SPEED_INSPIRE = Effects.register("speed_inspire",
            () -> new SpeedInspire());
    public static final RegistryObject<DefenseInspire> DEFENSE_INSPIRE = Effects.register("defense_inspire",
            () -> new DefenseInspire());
}

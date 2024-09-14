package com.figgity.barding.items;

import com.figgity.barding.ExtremeBarding;
import com.figgity.barding.items.custom.BattBackup;
import com.figgity.barding.items.custom.BuffBanner;
import com.figgity.barding.items.custom.Concheror;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.figgity.barding.menu.CreativeTabInit.addToTab;

public class ItemInit {
    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExtremeBarding.MODID);

    public static final RegistryObject<BuffBanner> BUFF_BANNER = addToTab(Items.register("buff_banner",
            () -> new BuffBanner(new Item.Properties())));

    public static final RegistryObject<BattBackup> BATT_BACKUP = addToTab(Items.register("battalions_backup",
            () -> new BattBackup(new Item.Properties())));

    public static final RegistryObject<Concheror> CONCHEROR = addToTab(Items.register("concheror",
            () -> new Concheror(new Item.Properties())));
}

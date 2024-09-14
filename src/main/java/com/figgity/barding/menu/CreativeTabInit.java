package com.figgity.barding.menu;

import com.figgity.barding.ExtremeBarding;
import com.figgity.barding.items.ItemInit;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = ExtremeBarding.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> Tabs = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExtremeBarding.MODID);

    public static final List<Supplier<? extends ItemLike>> BARD_TAB_ITEMS = new ArrayList<>();

    public static final RegistryObject<CreativeModeTab> BARD_TAB = Tabs.register("bard_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.bard_tab"))
                    .icon(ItemInit.BUFF_BANNER.get()::getDefaultInstance)
                    .displayItems((displayParams, output) ->
                            BARD_TAB_ITEMS.forEach(itemLike -> output.accept(itemLike.get())))
                    .build()
    );

    public static <T extends Item> RegistryObject<T> addToTab(RegistryObject<T> itemLike) {
        BARD_TAB_ITEMS.add(itemLike);
        return itemLike;
    }
}

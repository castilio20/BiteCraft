package com.empando.bitecraft.screen;

import com.empando.bitecraft.BiteCraft;
import com.empando.bitecraft.screen.custom.CheesePressMenu;
import com.empando.bitecraft.screen.custom.DryingRackMenu;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.network.IContainerFactory;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModMenuTypes  {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(Registries.MENU, BiteCraft.MODID);

    public static final DeferredHolder<MenuType<?>, MenuType<CheesePressMenu>> CHEESE_PRESS_MENU =
            registerMenuType("cheese_press_menu", CheesePressMenu::new);
    public static final DeferredHolder<MenuType<?>, MenuType<DryingRackMenu>> DRYNG_RACK_MENU =
            registerMenuType("dryng_rack_menu", DryingRackMenu::new);

    private static <T extends AbstractContainerMenu>DeferredHolder<MenuType<?>, MenuType<T>> registerMenuType(String name,
                                                                                                              IContainerFactory<T> factory) {
        return MENUS.register(name, () -> IMenuTypeExtension.create(factory));
    }

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }}
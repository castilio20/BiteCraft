package com.castilio.bitecraft.util;

import net.minecraft.world.item.Items;
import net.neoforged.bus.api.SubscribeEvent;
import squeek.appleskin.api.event.TooltipOverlayEvent;

public class AppleSkinEventHandler {
    @SubscribeEvent
    public void onPreTooltipEvent(TooltipOverlayEvent.Pre event) {
        // hide the tooltip for regular apples
        if (event.itemStack.getItem() == Items.APPLE) {
            event.setCanceled(true);
        }
    }
}

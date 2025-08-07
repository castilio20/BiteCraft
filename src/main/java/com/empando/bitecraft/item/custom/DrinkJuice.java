package com.empando.bitecraft.item.custom;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

public class DrinkJuice extends Item {
        private static final int DRINK_DURATION = 32;

        public DrinkJuice(Item.Properties properties) {
            super(properties);
        }

        public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entityLiving) {
            if (entityLiving instanceof ServerPlayer serverplayer) {
                CriteriaTriggers.CONSUME_ITEM.trigger(serverplayer, stack);
                serverplayer.awardStat(Stats.ITEM_USED.get(this));
            }



            if (entityLiving instanceof Player player) {
                return ItemUtils.createFilledResult(stack, player, new ItemStack(Items.GLASS_BOTTLE), false);
            } else {
                stack.consume(1, entityLiving);
                return stack;
            }
        }

        public int getUseDuration(ItemStack stack, LivingEntity entity) {
            return 32;
        }

        public UseAnim getUseAnimation(ItemStack stack) {
            return UseAnim.DRINK;
        }

        public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
            return ItemUtils.startUsingInstantly(level, player, hand);
        }
}

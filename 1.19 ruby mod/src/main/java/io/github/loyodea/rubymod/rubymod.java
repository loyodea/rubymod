package io.github.loyodea.rubymod;

import io.github.loyodea.rubymod.init.BlockInit;
import io.github.loyodea.rubymod.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(rubymod.MODID)
public class rubymod {
    public static final String MODID = "rubymod";

    public rubymod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BlockInit.BLOCKS.register(bus);
        ItemInit.ITEMS.register(bus);
    }

    public static final CreativeModeTab TAB = new CreativeModeTab(MODID) {
        @Override
        public ItemStack makeIcon() {return ItemInit.RUBY_SWORD.get().getDefaultInstance();}
    };


}

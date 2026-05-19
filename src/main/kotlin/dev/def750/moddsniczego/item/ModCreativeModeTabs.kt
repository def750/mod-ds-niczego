package dev.def750.moddsniczego.item

import dev.def750.moddsniczego.ModDsNiczego
import net.minecraft.core.registries.Registries
import net.minecraft.network.chat.Component
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.ItemStack
import net.neoforged.neoforge.registries.DeferredRegister
import java.util.function.Supplier

object ModCreativeModeTabs {
    val REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ModDsNiczego.ID)

    val MOD_DS_NICZEGO = REGISTRY.register("mod_ds_niczego", Supplier {
        CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.${ModDsNiczego.ID}"))
            .icon { ItemStack(ModItems.MUSIC_DISCS.values.first().get()) }
            .displayItems { _, output ->
                ModItems.MUSIC_DISCS.values.forEach { disc ->
                    output.accept(disc.get())
                }
            }
            .build()
    })
}

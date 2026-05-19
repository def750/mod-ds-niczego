package dev.def750.moddsniczego.item

import dev.def750.moddsniczego.ModDsNiczego
import dev.def750.moddsniczego.disc.ModDiscDefinitions
import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceKey
import net.minecraft.world.item.Item
import net.minecraft.world.item.JukeboxSong
import net.minecraft.world.item.Rarity
import net.neoforged.neoforge.registries.DeferredRegister

object ModItems {
    val REGISTRY = DeferredRegister.createItems(ModDsNiczego.ID)

    val MUSIC_DISCS = ModDiscDefinitions.ALL.associate { disc ->
        disc.id to REGISTRY.register(disc.id) { location ->
            Item(
                Item.Properties()
                    .stacksTo(1)
                    .rarity(Rarity.RARE)
                    .jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, location))
            )
        }
    }
}

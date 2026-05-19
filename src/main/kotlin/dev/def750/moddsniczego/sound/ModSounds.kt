package dev.def750.moddsniczego.sound

import dev.def750.moddsniczego.ModDsNiczego
import dev.def750.moddsniczego.disc.ModDiscDefinitions
import net.minecraft.core.registries.Registries
import net.minecraft.sounds.SoundEvent
import net.neoforged.neoforge.registries.DeferredRegister

object ModSounds {
    val REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, ModDsNiczego.ID)

    val SOUNDS = ModDiscDefinitions.ALL.associate { disc ->
        disc.id to REGISTRY.register(disc.id) { location ->
            SoundEvent.createVariableRangeEvent(location)
        }
    }
}

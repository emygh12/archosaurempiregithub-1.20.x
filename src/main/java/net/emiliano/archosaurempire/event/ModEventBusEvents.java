package net.emiliano.archosaurempire.event;

import net.emiliano.archosaurempire.ArchosaurEmpire;
import net.emiliano.archosaurempire.entity.ModEntities;
import net.emiliano.archosaurempire.entity.custom.BaryonyxEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ArchosaurEmpire.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.BARYONYX.get(), BaryonyxEntity.createattributes().build());
    }
}

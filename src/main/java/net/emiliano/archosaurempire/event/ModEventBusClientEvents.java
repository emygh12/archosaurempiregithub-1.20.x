package net.emiliano.archosaurempire.event;

import net.emiliano.archosaurempire.ArchosaurEmpire;
import net.emiliano.archosaurempire.entity.client.BaryonyxModel;
import net.emiliano.archosaurempire.entity.client.ModModelLayers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegisterEvent;

@Mod.EventBusSubscriber(modid = ArchosaurEmpire.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.BARYONYX_LAYER, BaryonyxModel::createBodyLayer);
    }

}

package net.emiliano.archosaurempire.item;

import net.emiliano.archosaurempire.ArchosaurEmpire;
import net.emiliano.archosaurempire.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ArchosaurEmpire.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ARCHOSAUR_EMPIRE_TAB = CREATIVE_MODE_TABS.register("archosaur_empire_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FOSSIL.get()))
                    .title(Component.translatable("creativetab.archosaur_empire_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.FOSSIL.get());
                        pOutput.accept(ModItems.PLASTERED_FOSSIL.get());
                        pOutput.accept(ModItems.STONE_DUST.get());
                        pOutput.accept(ModItems.PLASTER.get());
                        pOutput.accept(ModItems.VELOCIRAPTOR_SKULL.get());
                        pOutput.accept(ModItems.VELOCIRAPTOR_FOOT.get());
                        pOutput.accept(ModItems.LEPTOCERATOPS_SKULL.get());
                        pOutput.accept(ModItems.LEPTOCERATOPS_TAIL.get());
                        pOutput.accept(ModItems.DILONG_JAW.get());
                        pOutput.accept(ModItems.DILONG_VERTEBRAE.get());
                        pOutput.accept(ModItems.OVIRAPTOR_JAW.get());
                        pOutput.accept(ModItems.OVIRAPTOR_MANUS.get());
                        pOutput.accept(ModItems.PACHYCEPHALOSAURUS_SKULL.get());
                        pOutput.accept(ModItems.PACHYCEPHALOSAURUS_SPIKES.get());
                        pOutput.accept(ModItems.EOTYRANNUS_SKULL.get());
                        pOutput.accept(ModItems.EOTYRANNUS_FEMUR.get());
                        pOutput.accept(ModItems.BARYONYX_SKULL.get());
                        pOutput.accept(ModItems.BARYONYX_FEMUR.get());
                        pOutput.accept(ModItems.EDMONTONIA_SKULL.get());
                        pOutput.accept(ModItems.EDMONTONIA_OSTEODERM.get());
                        pOutput.accept(ModItems.PACHYRHINOSAURUS_SKULL.get());
                        pOutput.accept(ModItems.PACHYRHINOSAURUS_FEMUR.get());
                        pOutput.accept(ModItems.MERAXES_SKULL.get());
                        pOutput.accept(ModItems.MERAXES_FOOT.get());
                        pOutput.accept(ModItems.BARYONYX_DNA.get());
                        pOutput.accept(ModItems.BARYONYX_SPAWN_EGG.get());
                        pOutput.accept(ModItems.EXTRACTER_ITEM.get());
                        pOutput.accept(ModItems.WIRES_ITEM.get());
                        pOutput.accept(ModItems.PCB.get());
                        pOutput.accept(ModItems.SYRINGE.get());


                        pOutput.accept(Items.BRUSH);

                        pOutput.accept(ModBlocks.FOSSIL_BLOCK.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

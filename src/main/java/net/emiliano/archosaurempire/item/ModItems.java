package net.emiliano.archosaurempire.item;

import net.emiliano.archosaurempire.ArchosaurEmpire;
import net.emiliano.archosaurempire.entity.ModEntities;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ArchosaurEmpire.MOD_ID);

    public static final RegistryObject<Item> FOSSIL = ITEMS.register("fossil",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLASTERED_FOSSIL = ITEMS.register("plastered_fossil",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STONE_DUST = ITEMS.register("stone_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PLASTER = ITEMS.register("plaster",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BARYONYX_SKULL = ITEMS.register("baryonyx_skull",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BARYONYX_FEMUR = ITEMS.register("baryonyx_femur",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> VELOCIRAPTOR_SKULL = ITEMS.register("velociraptor_skull",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> VELOCIRAPTOR_FOOT = ITEMS.register("velociraptor_foot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LEPTOCERATOPS_SKULL = ITEMS.register("leptoceratops_skull",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LEPTOCERATOPS_TAIL = ITEMS.register("leptoceratops_tail",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DILONG_JAW = ITEMS.register("dilong_jaw",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DILONG_VERTEBRAE = ITEMS.register("dilong_vertebrae",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> OVIRAPTOR_MANUS = ITEMS.register("oviraptor_manus",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> OVIRAPTOR_JAW = ITEMS.register("oviraptor_jaw",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PACHYCEPHALOSAURUS_SKULL = ITEMS.register("pachycephalosaurus_skull",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PACHYCEPHALOSAURUS_SPIKES = ITEMS.register("pachycephalosaurus_spikes",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EOTYRANNUS_SKULL = ITEMS.register("eotyrannus_skull",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EOTYRANNUS_FEMUR = ITEMS.register("eotyrannus_femur",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EDMONTONIA_SKULL = ITEMS.register("edmontonia_skull",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EDMONTONIA_OSTEODERM = ITEMS.register("edmontonia_osteoderm",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PACHYRHINOSAURUS_SKULL = ITEMS.register("pachyrhinosaurus_skull",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PACHYRHINOSAURUS_FEMUR = ITEMS.register("pachyrhinosaurus_femur",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MERAXES_SKULL = ITEMS.register("meraxes_skull",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MERAXES_FOOT = ITEMS.register("meraxes_foot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BARYONYX_DNA = ITEMS.register("baryonyx_dna",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EXTRACTER_ITEM = ITEMS.register("extracter_item",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WIRES_ITEM = ITEMS.register("wires_item",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PCB = ITEMS.register("pcb",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SYRINGE = ITEMS.register("syringe",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BARYONYX_SPAWN_EGG = ITEMS.register("baryonyx_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.BARYONYX, 0x3e6453, 0xc5d3e4, new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

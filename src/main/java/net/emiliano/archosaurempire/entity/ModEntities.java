package net.emiliano.archosaurempire.entity;

import net.emiliano.archosaurempire.ArchosaurEmpire;
import net.emiliano.archosaurempire.entity.custom.BaryonyxEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ArchosaurEmpire.MOD_ID);

    public static final RegistryObject<EntityType<BaryonyxEntity>> BARYONYX =
            ENTITY_TYPES.register("torso", () -> EntityType.Builder.of(BaryonyxEntity::new, MobCategory.CREATURE)
                    .sized(2.5f, 2.5f).build("torso"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}

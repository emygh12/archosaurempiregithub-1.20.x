package net.emiliano.archosaurempire.datagen;

import net.emiliano.archosaurempire.ArchosaurEmpire;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.GlobalLootModifierProvider;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, ArchosaurEmpire.MOD_ID);
    }

    @Override
    protected void start() {

    }
}

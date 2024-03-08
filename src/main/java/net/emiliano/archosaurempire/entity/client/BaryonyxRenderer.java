package net.emiliano.archosaurempire.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.emiliano.archosaurempire.ArchosaurEmpire;
import net.emiliano.archosaurempire.entity.custom.BaryonyxEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class BaryonyxRenderer extends MobRenderer<BaryonyxEntity, BaryonyxModel<BaryonyxEntity>> {
    public BaryonyxRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new BaryonyxModel<>(pContext.bakeLayer(ModModelLayers.BARYONYX_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(BaryonyxEntity baryonyxEntity) {
        return new ResourceLocation(ArchosaurEmpire.MOD_ID, "textures/entity/baryonyx_male.png");
    }

    @Override
    public void render(BaryonyxEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        if (pEntity.isBaby()) {
            pMatrixStack.scale(0.4f, 0.4f, 0.4f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}

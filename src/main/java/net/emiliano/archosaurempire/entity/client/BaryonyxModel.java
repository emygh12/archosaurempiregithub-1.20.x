package net.emiliano.archosaurempire.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.emiliano.archosaurempire.entity.animations.ModAnimationDefinitions;
import net.emiliano.archosaurempire.entity.custom.BaryonyxEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class BaryonyxModel<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart torso;
	private final ModelPart	cabeza;

	public BaryonyxModel(ModelPart root) {
		this.torso = root.getChild("torso");
		this.cabeza = torso.getChild("torso2").getChild("cuello").getChild("cabeza");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition torso = partdefinition.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(0, 51).addBox(-8.6F, -13.0F, -10.0F, 17.0F, 26.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -15.0F, 0.0F));

		PartDefinition torso2 = torso.addOrReplaceChild("torso2", CubeListBuilder.create().texOffs(0, 0).addBox(-6.5F, -13.0F, -27.0F, 14.0F, 23.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.6F, 1.0F, -7.0F));

		PartDefinition cuello = torso2.addOrReplaceChild("cuello", CubeListBuilder.create(), PartPose.offsetAndRotation(0.55F, -6.4068F, -26.136F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r1 = cuello.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(58, 25).addBox(-3.25F, -5.0F, -20.0F, 7.0F, 9.0F, 26.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, -5.5932F, 2.136F, -1.9199F, 0.0F, 0.0F));

		PartDefinition cabeza = cuello.addOrReplaceChild("cabeza", CubeListBuilder.create().texOffs(42, 130).addBox(-4.5F, -6.7071F, -14.0976F, 9.0F, 7.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(119, 128).addBox(-2.5F, -4.7071F, -32.0976F, 5.0F, 5.0F, 18.0F, new CubeDeformation(0.0F))
		.texOffs(0, 43).addBox(2.5F, 0.2929F, -30.0976F, 0.0F, 3.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(0, 15).addBox(-2.5F, 0.2929F, -30.0976F, 0.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -21.8861F, 10.2336F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r2 = cabeza.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(8, 54).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.7071F, -8.0976F, -0.7854F, 0.0F, 0.0F));

		PartDefinition mandibula = cabeza.addOrReplaceChild("mandibula", CubeListBuilder.create().texOffs(136, 67).addBox(-4.5F, -1.25F, -13.0F, 9.0F, 5.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(0, 133).addBox(-2.0F, -1.25F, -31.0F, 4.0F, 4.0F, 18.0F, new CubeDeformation(0.0F))
		.texOffs(0, 48).addBox(2.0F, -5.25F, -31.0F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(16, 17).addBox(-2.0F, -5.25F, -31.0F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.5429F, -1.0976F));

		PartDefinition L_Arm = torso2.addOrReplaceChild("L_Arm", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -3.0F, 3.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(7.0F, 4.0F, -21.0F));

		PartDefinition lclaws = L_Arm.addOrReplaceChild("lclaws", CubeListBuilder.create().texOffs(56, 0).addBox(4.0F, 8.0F, -30.0F, 4.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(20, 0).addBox(5.0F, 7.0F, -28.0F, 4.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(18, 15).addBox(5.0F, 7.0F, -26.0F, 4.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.0F, 8.0F, 28.0F));

		PartDefinition R_Arm = torso2.addOrReplaceChild("R_Arm", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, 0.0F, -3.0F, 3.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, 4.0F, -21.0F));

		PartDefinition rclaws = R_Arm.addOrReplaceChild("rclaws", CubeListBuilder.create().texOffs(18, 10).addBox(7.0F, 8.0F, -30.0F, 4.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(18, 5).addBox(6.0F, 7.0F, -28.0F, 4.0F, 5.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(12, 0).addBox(6.0F, 7.0F, -26.0F, 4.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.0F, 8.0F, 28.0F));

		PartDefinition cola = torso.addOrReplaceChild("cola", CubeListBuilder.create().texOffs(74, 60).addBox(-6.5F, -10.0F, 0.0F, 13.0F, 21.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.1F, -1.0F, 8.0F));

		PartDefinition cola2 = cola.addOrReplaceChild("cola2", CubeListBuilder.create().texOffs(0, 97).addBox(-5.5F, -8.0F, 0.0F, 11.0F, 17.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 16.0F));

		PartDefinition cola3 = cola2.addOrReplaceChild("cola3", CubeListBuilder.create().texOffs(56, 99).addBox(-4.0F, -6.0F, 0.0F, 8.0F, 13.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 15.0F));

		PartDefinition cola4 = cola3.addOrReplaceChild("cola4", CubeListBuilder.create().texOffs(114, 99).addBox(-2.5F, -5.0F, 0.0F, 5.0F, 10.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 16.0F));

		PartDefinition cola5 = cola4.addOrReplaceChild("cola5", CubeListBuilder.create().texOffs(85, 107).addBox(-1.5F, -3.0F, 0.0F, 3.0F, 6.0F, 23.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 17.0F));

		PartDefinition cola6 = cola5.addOrReplaceChild("cola6", CubeListBuilder.create().texOffs(118, 42).addBox(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 23.0F));

		PartDefinition piernaizquierda = torso.addOrReplaceChild("piernaizquierda", CubeListBuilder.create().texOffs(98, 0).addBox(-4.0F, -2.0F, -8.0F, 7.0F, 26.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(10.4F, -9.0F, 0.0F));

		PartDefinition bone5 = piernaizquierda.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(88, 136).addBox(-2.75F, 0.0F, -3.5F, 5.0F, 25.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.25F, 20.0F, 2.5F));

		PartDefinition bone6 = bone5.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(56, 0).addBox(-5.0F, -1.0F, -8.0F, 9.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.25F, 26.0F, -0.5F));

		PartDefinition piernaderecha = torso.addOrReplaceChild("piernaderecha", CubeListBuilder.create().texOffs(98, 0).addBox(-3.0F, -2.0F, -8.0F, 7.0F, 26.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(-10.6F, -9.0F, 0.0F));

		PartDefinition bone7 = piernaderecha.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(88, 136).addBox(-2.5F, 0.0F, -1.0F, 5.0F, 25.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, 20.0F, 0.0F));

		PartDefinition bone8 = bone7.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(56, 0).addBox(-5.0F, -1.0F, -8.0F, 9.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, 26.0F, 2.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}


	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

		this.animateWalk(ModAnimationDefinitions.BARY_GL_WALK, limbSwing, limbSwingAmount, 1.5f, 1.7f);
		this.animate(((BaryonyxEntity) entity).idleAnimationState, ModAnimationDefinitions.BARY_GL_IDLE, ageInTicks, 1f);
		this.animate(((BaryonyxEntity) entity).attackAnimationState, ModAnimationDefinitions.BARY_GL_ATTACK, ageInTicks, 1f);
	}

	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.cabeza.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.cabeza.xRot = pHeadPitch * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return torso;
	}
}
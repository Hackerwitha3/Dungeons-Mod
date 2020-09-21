package com.hackerwitha3.dungeons.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.merchant.villager.AbstractVillagerEntity;
import net.minecraft.entity.monster.AbstractIllagerEntity;
import net.minecraft.entity.monster.ZombieVillagerEntity;
import net.minecraft.entity.monster.ZombifiedPiglinEntity;
import net.minecraft.entity.monster.piglin.PiglinEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.registries.ForgeRegistries;

@OnlyIn(Dist.CLIENT)
public class EvocationRobeModel<T extends LivingEntity> extends BipedModel<T> {
    private final EquipmentSlotType slot;
    private final LivingEntity entity;
    private final ModelRenderer Everything;
    private final ModelRenderer LeftArm;
    private final ModelRenderer RightArm;
    private final ModelRenderer Body;
    private final ModelRenderer Head;
    private final ModelRenderer Middle;
    private final ModelRenderer Back;
    private final ModelRenderer Brim;

    public EvocationRobeModel(float modelSize, EquipmentSlotType slot, LivingEntity entity) {
        super(modelSize, 0.0F, 128, 64);
        this.slot = slot;
        this.entity = entity;
        textureWidth = 64;
        textureHeight = 64;

        Everything = new ModelRenderer(this);
        Everything.setRotationPoint(0.0F, 24.0F, 0.0F);

        LeftArm = new ModelRenderer(this);
        LeftArm.setRotationPoint(5.0F, -22.0F, 0.0F);
        Everything.addChild(LeftArm);
        LeftArm.setTextureOffset(16, 31).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, 1.0F, 1.0F);

        RightArm = new ModelRenderer(this);
        RightArm.setRotationPoint(-5.0F, -22.0F, 0.0F);
        Everything.addChild(RightArm);
        RightArm.setTextureOffset(0, 31).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 1.0F, 1.0F, 1.0F);

        Body = new ModelRenderer(this);
        Body.setRotationPoint(0.0F, -24.0F, 0.0F);
        Everything.addChild(Body);
        Body.setTextureOffset(0, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 1.0F, 1.0F, 1.0F);
        Body.setTextureOffset(0, 16).addBox(-4.0F, 12.5F, -2.0F, 8.0F, 4.0F, 4.0F, 1.0F, 1.0F, 1.0F);

        Head = new ModelRenderer(this);
        Head.setRotationPoint(0.0F, 0.0F, -5.0F);
        Everything.addChild(Head);
        setRotationAngle(Head, -0.1309F, 0.0F, 0.0F);

        boolean testificate =
                this.entity instanceof AbstractIllagerEntity ||
                        this.entity.getType() == ForgeRegistries.ENTITIES.getValue(new ResourceLocation("savageandravage:skeleton_villager")) ||
                        this.entity instanceof ZombieVillagerEntity ||
                        this.entity instanceof AbstractVillagerEntity ||
                        this.entity.getType() == ForgeRegistries.ENTITIES.getValue(new ResourceLocation("guardvillagers:guard"));

        int testificateHelmetShiftUp = testificate ? 2 : 0;

        Back = new ModelRenderer(this);
        Back.setRotationPoint(0.0F, -0.1141F, 11.2547F);
        Head.addChild(Back);
        setRotationAngle(Back, 1.0472F, 0.0F, 0.0F);
        Back.setTextureOffset(40, 25).addBox(-4.0F + 0.001F, -28.7859F + 13.125F - testificateHelmetShiftUp, 32.1453F - 22.75F - 0.25F, 7.99F, 6.0F, 4.0F, 0.5F, 0.5F, 0.5F);

        Middle = new ModelRenderer(this);
        Middle.setRotationPoint(0.0F, 0.0F, -5.0F);
        Head.addChild(Middle);
        Middle.setTextureOffset(32, 0).addBox(-4.0F, -46.0F + 26.0F - testificateHelmetShiftUp, -4.0F + 4.0F, 8.0F, 13.0F, 8.0F, 0.5F, 0.5F, 0.5F);

        Brim = new ModelRenderer(this);
        Brim.setRotationPoint(0.0F, 0.0F, 0.0F);
        Head.addChild(Brim);
        setRotationAngle(Brim, 0.1309F, 0.0F, 0.0F);
        Brim.setTextureOffset(0, 47).addBox(-8.0F, -33.7F + 26.0F - testificateHelmetShiftUp, -8.0F, 16.0F, 1.0F, 16.0F, 0.5F, 0.5F, 0.5F);

    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha){
        boolean testificate =
                this.entity instanceof AbstractIllagerEntity ||
                        this.entity.getType() == ForgeRegistries.ENTITIES.getValue(new ResourceLocation("savageandravage:skeleton_villager")) ||
                        this.entity instanceof ZombieVillagerEntity ||
                        this.entity instanceof AbstractVillagerEntity ||
                        this.entity.getType() == ForgeRegistries.ENTITIES.getValue(new ResourceLocation("guardvillagers:guard"));

        boolean piglin =
                this.entity instanceof PiglinEntity ||
                        this.entity instanceof ZombifiedPiglinEntity;



        if (this.slot == EquipmentSlotType.HEAD) {

            matrixStackIn.push();
            this.Head.copyModelAngles(this.bipedHead);
            if (this.entity.isChild()) {
                matrixStackIn.scale(0.8F, 0.8F, 0.8F);
                this.Head.setRotationPoint(0.0F, 15.0F, 0.0F);
            }
            this.Head.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
            matrixStackIn.pop();

        }

        if (this.slot == EquipmentSlotType.CHEST) {
            matrixStackIn.push();

            this.Body.copyModelAngles(this.bipedBody);
            this.LeftArm.copyModelAngles(this.bipedLeftArm);
            this.RightArm.copyModelAngles(this.bipedRightArm);
            if (this.entity.isChild()) {
                matrixStackIn.scale(0.5F, 0.5F, 0.5F);
                this.Body.setRotationPoint(0.0F, 24.0F, 0.0F);
                this.LeftArm.setRotationPoint(5.0F, 24.0F, 0.0F);
                this.RightArm.setRotationPoint(-5.0F, 24.0F, 0.0F);
            }
            this.LeftArm.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
            this.RightArm.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
            if (testificate) {
                matrixStackIn.scale(1.0F, 1.0F, 1.3F);
            }
            this.Body.render(matrixStackIn, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
            matrixStackIn.pop();
        }
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

package com.montanablackmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.montanablackmod.entity.MontanaBlackEntity;
import com.montanablackmod.client.model.Modelcustom_model;

public class MontanaBlackRenderer extends MobRenderer<MontanaBlackEntity, Modelcustom_model<MontanaBlackEntity>> {
	public MontanaBlackRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MontanaBlackEntity entity) {
		return new ResourceLocation("montanablack_mod:textures/entities/montanablack_skin.png");
	}
}

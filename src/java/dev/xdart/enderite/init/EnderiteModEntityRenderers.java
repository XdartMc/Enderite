/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.xdart.enderite.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import dev.xdart.enderite.client.renderer.EnderspiderRenderer;

@EventBusSubscriber(Dist.CLIENT)
public class EnderiteModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(EnderiteModEntities.ENDERSPIDER.get(), EnderspiderRenderer::new);
	}
}
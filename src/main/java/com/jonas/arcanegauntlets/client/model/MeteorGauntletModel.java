package com.jonas.arcanegauntlets.client.model;
import com.jonas.arcanegauntlets.item.MeteorGauntletItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public final class MeteorGauntletModel extends GeoModel<MeteorGauntletItem>{

    @Override
    public ResourceLocation getModelResource(MeteorGauntletItem object) {
        return ResourceLocation.fromNamespaceAndPath(
                "arcanegauntlets",
                "geo/meteor_gauntlet.geo.json"
        );

    }
    @Override
    public ResourceLocation getAnimationResource(MeteorGauntletItem object) {
        return ResourceLocation.fromNamespaceAndPath(
                "arcanegauntlets",
                "animations/meteor_gauntlet.animation.json"
        );
    }
    @Override
    public ResourceLocation getTextureResource(MeteorGauntletItem object) {
        return ResourceLocation.fromNamespaceAndPath(
                "arcanegauntlets",
                "textures/item/meteor_gauntlet.png"
        );
    }
}

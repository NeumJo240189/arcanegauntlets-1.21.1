package com.jonas.arcanegauntlets.client.renderer;
import com.jonas.arcanegauntlets.client.model.MeteorGauntletModel;
import com.jonas.arcanegauntlets.item.MeteorGauntletItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;


public final class MeteorGauntletRenderer extends GeoItemRenderer<MeteorGauntletItem>{

    public MeteorGauntletRenderer(){
        super(new MeteorGauntletModel());
    };
}

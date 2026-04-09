package j1;

import android.view.RenderNode;

/* loaded from: classes.dex */
public abstract class l {
    public static int a(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public static int b(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public static void c(RenderNode renderNode, int i10) {
        renderNode.setAmbientShadowColor(i10);
    }

    public static void d(RenderNode renderNode, int i10) {
        renderNode.setSpotShadowColor(i10);
    }
}

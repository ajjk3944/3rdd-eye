package s1;

import android.view.RenderNode;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class k {
    public static int a(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public static int b(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public static void c(RenderNode renderNode, int i4) {
        renderNode.setAmbientShadowColor(i4);
    }

    public static void d(RenderNode renderNode, int i4) {
        renderNode.setSpotShadowColor(i4);
    }
}

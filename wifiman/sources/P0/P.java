package p0;

import android.view.RenderNode;

/* loaded from: classes.dex */
final class P {

    /* renamed from: a, reason: collision with root package name */
    public static final P f57358a = new P();

    private P() {
    }

    public final int a(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public final int b(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public final void c(RenderNode renderNode, int i10) {
        renderNode.setAmbientShadowColor(i10);
    }

    public final void d(RenderNode renderNode, int i10) {
        renderNode.setSpotShadowColor(i10);
    }
}

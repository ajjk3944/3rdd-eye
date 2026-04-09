package androidx.compose.ui.platform;

import android.view.RenderNode;

/* renamed from: androidx.compose.ui.platform.h1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3924h1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C3924h1 f29390a = new C3924h1();

    private C3924h1() {
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

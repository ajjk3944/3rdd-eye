package j2;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class z1 extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27362a;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.f27362a) {
            case 0:
                nk.k.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                d.h.C(view);
                throw null;
            default:
                if (!(view instanceof s1.l) || (outline2 = ((s1.l) view).f33323e) == null) {
                    return;
                }
                outline.set(outline2);
                return;
        }
    }
}

package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class r81 extends zt0 {
    public final /* synthetic */ int p;
    public final /* synthetic */ t81 q;

    public /* synthetic */ r81(t81 t81Var, int i) {
        this.p = i;
        this.q = t81Var;
    }

    @Override // defpackage.y61
    public final void b() {
        View view;
        int i = this.p;
        t81 t81Var = this.q;
        switch (i) {
            case 0:
                if (t81Var.u && (view = t81Var.m) != null) {
                    view.setTranslationY(0.0f);
                    t81Var.j.setTranslationY(0.0f);
                }
                t81Var.j.setVisibility(8);
                t81Var.j.setTransitioning(false);
                t81Var.y = null;
                vq2 vq2Var = t81Var.q;
                if (vq2Var != null) {
                    vq2Var.n(t81Var.p);
                    t81Var.p = null;
                    t81Var.q = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = t81Var.i;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = e61.a;
                    r51.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                t81Var.y = null;
                t81Var.j.requestLayout();
                break;
        }
    }
}

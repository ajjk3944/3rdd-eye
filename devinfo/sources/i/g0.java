package i;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import e4.k0;
import e4.v0;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g0 extends com.bumptech.glide.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25297a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f25298b;

    public /* synthetic */ g0(i0 i0Var, int i4) {
        this.f25297a = i4;
        this.f25298b = i0Var;
    }

    @Override // e4.d1
    public final void d() {
        View view;
        int i4 = this.f25297a;
        i0 i0Var = this.f25298b;
        switch (i4) {
            case 0:
                if (i0Var.f25318q && (view = i0Var.f25311i) != null) {
                    view.setTranslationY(0.0f);
                    i0Var.f25309f.setTranslationY(0.0f);
                }
                i0Var.f25309f.setVisibility(8);
                i0Var.f25309f.setTransitioning(false);
                i0Var.f25323v = null;
                yb.i iVar = i0Var.f25314m;
                if (iVar != null) {
                    iVar.K(i0Var.f25313l);
                    i0Var.f25313l = null;
                    i0Var.f25314m = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = i0Var.f25308e;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = v0.f22405a;
                    k0.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                i0Var.f25323v = null;
                i0Var.f25309f.requestLayout();
                break;
        }
    }
}

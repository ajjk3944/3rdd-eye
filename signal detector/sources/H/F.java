package h;

import R.O;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import h0.C2351a;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class F extends com.bumptech.glide.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20273a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H f20274b;

    public /* synthetic */ F(H h6, int i) {
        this.f20273a = i;
        this.f20274b = h6;
    }

    @Override // R.T
    public final void c() {
        View view;
        int i = this.f20273a;
        H h6 = this.f20274b;
        switch (i) {
            case 0:
                if (h6.f20296p && (view = h6.f20289h) != null) {
                    view.setTranslationY(0.0f);
                    h6.f20286e.setTranslationY(0.0f);
                }
                h6.f20286e.setVisibility(8);
                h6.f20286e.setTransitioning(false);
                h6.f20300t = null;
                C2351a c2351a = h6.f20292l;
                if (c2351a != null) {
                    c2351a.L(h6.f20291k);
                    h6.f20291k = null;
                    h6.f20292l = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = h6.f20285d;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = O.f3270a;
                    R.D.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                h6.f20300t = null;
                h6.f20286e.requestLayout();
                break;
        }
    }
}

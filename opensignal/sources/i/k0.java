package i;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class k0 extends kc.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11068e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m0 f11069f;

    public /* synthetic */ k0(m0 m0Var, int i10) {
        this.f11068e = i10;
        this.f11069f = m0Var;
    }

    @Override // u3.m0
    public final void c() {
        View view;
        int i10 = this.f11068e;
        m0 m0Var = this.f11069f;
        switch (i10) {
            case 0:
                if (m0Var.f11085q && (view = m0Var.f11079i) != null) {
                    view.setTranslationY(0.0f);
                    m0Var.f11076f.setTranslationY(0.0f);
                }
                m0Var.f11076f.setVisibility(8);
                m0Var.f11076f.setTransitioning(false);
                m0Var.f11089u = null;
                io.sentry.internal.debugmeta.c cVar = m0Var.f11081m;
                if (cVar != null) {
                    cVar.w(m0Var.f11080l);
                    m0Var.f11080l = null;
                    m0Var.f11081m = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = m0Var.f11075e;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = u3.i0.f23177a;
                    u3.x.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                m0Var.f11089u = null;
                m0Var.f11076f.requestLayout();
                break;
        }
    }
}

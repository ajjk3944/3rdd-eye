package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class vg implements y50 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ vg(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.y50
    public final void a(b60 b60Var, t50 t50Var) {
        Window window;
        View viewPeekDecorView;
        switch (this.f) {
            case 0:
                i5 i5Var = (i5) this.g;
                if (t50Var == t50.ON_STOP && (window = i5Var.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                    viewPeekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                i5 i5Var2 = (i5) this.g;
                if (t50Var == t50.ON_DESTROY) {
                    i5Var2.g.f = null;
                    if (!i5Var2.isChangingConfigurations()) {
                        i5Var2.d().a();
                    }
                    ah ahVar = i5Var2.k;
                    i5 i5Var3 = ahVar.i;
                    i5Var3.getWindow().getDecorView().removeCallbacks(ahVar);
                    i5Var3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(ahVar);
                    break;
                }
                break;
            default:
                zs0 zs0Var = (zs0) this.g;
                if (t50Var != t50.ON_START) {
                    if (t50Var == t50.ON_STOP) {
                        zs0Var.h = false;
                        break;
                    }
                } else {
                    zs0Var.h = true;
                    break;
                }
                break;
        }
    }
}

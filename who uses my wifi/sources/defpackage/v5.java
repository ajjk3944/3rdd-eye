package defpackage;

import android.view.ViewGroup;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class v5 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ h6 g;

    public /* synthetic */ v5(h6 h6Var, int i) {
        this.f = i;
        this.g = h6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f) {
            case 0:
                h6 h6Var = this.g;
                if ((h6Var.e0 & 1) != 0) {
                    h6Var.v(0);
                }
                if ((h6Var.e0 & 4096) != 0) {
                    h6Var.v(108);
                }
                h6Var.d0 = false;
                h6Var.e0 = 0;
                break;
            default:
                h6 h6Var2 = this.g;
                h6Var2.B.showAtLocation(h6Var2.A, 55, 0, 0);
                w61 w61Var = h6Var2.D;
                if (w61Var != null) {
                    w61Var.b();
                }
                if (!h6Var2.E || (viewGroup = h6Var2.F) == null || !viewGroup.isLaidOut()) {
                    h6Var2.A.setAlpha(1.0f);
                    h6Var2.A.setVisibility(0);
                    break;
                } else {
                    h6Var2.A.setAlpha(0.0f);
                    w61 w61VarA = e61.a(h6Var2.A);
                    w61VarA.a(1.0f);
                    h6Var2.D = w61VarA;
                    w61VarA.d(new w5(0, this));
                    break;
                }
                break;
        }
    }
}

package defpackage;

import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class z11 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Toolbar g;

    public /* synthetic */ z11(Toolbar toolbar, int i) {
        this.f = i;
        this.g = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                b21 b21Var = this.g.R;
                sd0 sd0Var = b21Var == null ? null : b21Var.g;
                if (sd0Var != null) {
                    sd0Var.collapseActionView();
                    break;
                }
                break;
            default:
                this.g.m();
                break;
        }
    }
}

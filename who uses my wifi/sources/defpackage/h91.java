package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class h91 extends g91 {
    public y20 m;

    public h91(o91 o91Var, WindowInsets windowInsets) {
        super(o91Var, windowInsets);
        this.m = null;
    }

    @Override // defpackage.l91
    public o91 b() {
        return o91.g(null, this.c.consumeStableInsets());
    }

    @Override // defpackage.l91
    public o91 c() {
        return o91.g(null, this.c.consumeSystemWindowInsets());
    }

    @Override // defpackage.l91
    public final y20 h() {
        if (this.m == null) {
            WindowInsets windowInsets = this.c;
            this.m = y20.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.m;
    }

    @Override // defpackage.l91
    public boolean m() {
        return this.c.isConsumed();
    }

    @Override // defpackage.l91
    public void q(y20 y20Var) {
        this.m = y20Var;
    }
}

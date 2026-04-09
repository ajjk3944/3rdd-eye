package defpackage;

import android.view.ViewParent;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rk2 implements dn2 {
    public final ag2 f;
    public final mv2 g;
    public final a83 h;

    public rk2(ag2 ag2Var, mv2 mv2Var, a83 a83Var) {
        this.f = ag2Var;
        this.g = mv2Var;
        this.h = a83Var;
    }

    @Override // defpackage.dn2
    public final void D0() {
        ag2 ag2Var;
        String str;
        if (!((Boolean) tw1.e.c.a(mz1.Jd)).booleanValue() || (ag2Var = this.f) == null) {
            return;
        }
        ViewParent parent = ag2Var.p0().getParent();
        while (true) {
            if (parent == null) {
                str = "0";
                break;
            } else {
                if (parent.getClass().getName().startsWith("androidx.compose.ui")) {
                    str = "1";
                    break;
                }
                parent = parent.getParent();
            }
        }
        lv2 lv2VarA = this.g.a();
        lv2VarA.k("action", "hcp");
        lv2VarA.k("hcp", str);
        lv2VarA.i(this.h);
        lv2VarA.m();
    }
}

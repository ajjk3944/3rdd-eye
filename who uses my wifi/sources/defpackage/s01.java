package defpackage;

import android.graphics.Typeface;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class s01 extends g82 {
    public final /* synthetic */ ob1 r;
    public final /* synthetic */ u01 s;

    public s01(u01 u01Var, ob1 ob1Var) {
        this.s = u01Var;
        this.r = ob1Var;
    }

    @Override // defpackage.g82
    public final void o(int i) {
        this.s.n = true;
        this.r.p(i);
    }

    @Override // defpackage.g82
    public final void p(Typeface typeface) {
        u01 u01Var = this.s;
        u01Var.p = Typeface.create(typeface, u01Var.d);
        u01Var.n = true;
        this.r.q(u01Var.p, false);
    }
}

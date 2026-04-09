package defpackage;

import android.view.LayoutInflater;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class h5 implements ej0 {
    public final /* synthetic */ i5 a;

    public h5(i5 i5Var) {
        this.a = i5Var;
    }

    @Override // defpackage.ej0
    public final void a(ch chVar) {
        i5 i5Var = this.a;
        u5 u5VarM = i5Var.m();
        h6 h6Var = (h6) u5VarM;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(h6Var.p);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(h6Var);
        } else {
            layoutInflaterFrom.getFactory2();
        }
        ((vq2) i5Var.i.h).e("androidx:appcompat");
        u5VarM.c();
    }
}

package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class ld4 implements ks2, ng4 {
    public final /* synthetic */ ph4 f;

    public /* synthetic */ ld4(ad4 ad4Var, ph4 ph4Var, w34 w34Var) {
        this.f = ph4Var;
    }

    @Override // defpackage.ng4
    public int c(Object obj) {
        bg4 bg4Var = (bg4) obj;
        HashMap map = og4.a;
        String str = bg4Var.b;
        ph4 ph4Var = this.f;
        return ((str.equals(ph4Var.m) || str.equals(og4.c(ph4Var))) && bg4Var.f(ph4Var, false) && bg4Var.g(ph4Var)) ? 1 : 0;
    }

    public /* synthetic */ ld4(ph4 ph4Var) {
        this.f = ph4Var;
    }

    @Override // defpackage.ks2
    /* renamed from: c */
    public /* synthetic */ void mo12c(Object obj) {
        ((bd4) obj).g(this.f);
    }
}

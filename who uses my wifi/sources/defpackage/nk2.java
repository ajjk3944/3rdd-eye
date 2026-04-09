package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class nk2 implements ca4 {
    public final /* synthetic */ int a = 1;
    public final ga4 b;
    public final ga4 c;
    public final ll2 d;
    public final ga4 e;

    public nk2(p21 p21Var, ba4 ba4Var, ph2 ph2Var, ll2 ll2Var, qm2 qm2Var) {
        this.b = ba4Var;
        this.c = ph2Var;
        this.d = ll2Var;
        this.e = qm2Var;
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                return new up2(new lk2((Context) this.b.d(), ((ph2) this.c).a(), this.d.a(), ((qm2) this.e).a(), 0), md2.g);
            default:
                return new up2(new lk2((Context) this.b.d(), ((ph2) this.c).a(), this.d.a(), ((qm2) this.e).a(), 1), md2.g);
        }
    }

    public nk2(ba4 ba4Var, ph2 ph2Var, ll2 ll2Var, qm2 qm2Var) {
        this.b = ba4Var;
        this.c = ph2Var;
        this.d = ll2Var;
        this.e = qm2Var;
    }
}

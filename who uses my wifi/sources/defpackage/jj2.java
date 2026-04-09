package defpackage;

import android.content.Context;
import java.util.HashSet;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class jj2 implements ca4 {
    public final /* synthetic */ int a;
    public final ga4 b;
    public final ll2 c;

    public /* synthetic */ jj2(ll2 ll2Var, ga4 ga4Var, int i) {
        this.a = i;
        this.c = ll2Var;
        this.b = ga4Var;
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                return new ij2(this.c.a(), ((qh2) this.b).d());
            case 1:
                return new hm2(this.c.a());
            case 2:
                return new zp2(this.c.a(), (eb3) this.b.d());
            default:
                return new vp2((Context) this.b.d(), new HashSet(), this.c.a());
        }
    }

    public /* synthetic */ jj2(ba4 ba4Var, ll2 ll2Var, int i) {
        this.a = i;
        this.b = ba4Var;
        this.c = ll2Var;
    }
}

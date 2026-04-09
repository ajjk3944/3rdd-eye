package defpackage;

import android.util.Pair;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class td4 extends wm0 {
    public final jd4 a;
    public final pv2 b;
    public final boolean c;
    public final int d;
    public final long e;
    public final Boolean f;

    public td4(jd4 jd4Var, boolean z, int i, Boolean bool, pv2 pv2Var) {
        this.a = jd4Var;
        this.c = z;
        this.d = i;
        this.f = bool;
        this.b = pv2Var;
        hg4.C.k.getClass();
        this.e = System.currentTimeMillis();
    }

    @Override // defpackage.wm0
    public final void a(String str) {
        Pair pair = new Pair("sgf_reason", str);
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        hg4 hg4Var = hg4.C;
        hg4Var.k.getClass();
        Pair pair6 = new Pair("lat_ms", Long.toString(System.currentTimeMillis() - this.e));
        int i = this.d;
        Pair pair7 = new Pair("sgpc_rn", Integer.toString(i));
        Pair pair8 = new Pair("sgpc_lsu", String.valueOf(this.f));
        boolean z = this.c;
        a30.B(this.b, "sgpcf", pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("tpc", true != z ? "0" : "1"));
        hg4Var.k.getClass();
        this.a.b(z, new ge4(null, str, ((Long) x02.h.w()).longValue() + System.currentTimeMillis(), i));
    }

    @Override // defpackage.wm0
    public final void b(ug0 ug0Var) {
        Pair pair = new Pair("se", "query_g");
        Pair pair2 = new Pair("ad_format", "BANNER");
        Pair pair3 = new Pair("rtype", Integer.toString(6));
        Pair pair4 = new Pair("scar", "true");
        hg4 hg4Var = hg4.C;
        hg4Var.k.getClass();
        Pair pair5 = new Pair("lat_ms", Long.toString(System.currentTimeMillis() - this.e));
        int i = this.d;
        Pair pair6 = new Pair("sgpc_rn", Integer.toString(i));
        Pair pair7 = new Pair("sgpc_lsu", String.valueOf(this.f));
        boolean z = this.c;
        a30.B(this.b, "sgpcs", pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("tpc", true != z ? "0" : "1"));
        hg4Var.k.getClass();
        this.a.b(z, new ge4(ug0Var, "", ((Long) x02.h.w()).longValue() + System.currentTimeMillis(), i));
    }
}

package fb;

import android.util.Pair;
import com.google.android.gms.internal.ads.ud0;
import com.google.android.gms.internal.ads.zl;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a0 extends ib.a {

    /* renamed from: a, reason: collision with root package name */
    public final z f23869a;

    /* renamed from: b, reason: collision with root package name */
    public final ud0 f23870b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23871c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23872d;

    /* renamed from: e, reason: collision with root package name */
    public final long f23873e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f23874f;

    public a0(z zVar, boolean z3, int i4, Boolean bool, ud0 ud0Var) {
        this.f23869a = zVar;
        this.f23871c = z3;
        this.f23872d = i4;
        this.f23874f = bool;
        this.f23870b = ud0Var;
        ua.j.C.f35267k.getClass();
        this.f23873e = System.currentTimeMillis();
    }

    @Override // ib.a
    public final void a(String str) {
        Pair pair = new Pair("sgf_reason", str);
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        ua.j jVar = ua.j.C;
        jVar.f35267k.getClass();
        Pair pair6 = new Pair("lat_ms", Long.toString(System.currentTimeMillis() - this.f23873e));
        int i4 = this.f23872d;
        Pair pair7 = new Pair("sgpc_rn", Integer.toString(i4));
        Pair pair8 = new Pair("sgpc_lsu", String.valueOf(this.f23874f));
        boolean z3 = this.f23871c;
        u6.t.B(this.f23870b, "sgpcf", pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("tpc", true != z3 ? "0" : "1"));
        jVar.f35267k.getClass();
        this.f23869a.b(z3, new b0(null, str, ((Long) zl.f19116h.u()).longValue() + System.currentTimeMillis(), i4));
    }

    @Override // ib.a
    public final void b(o7.d dVar) {
        Pair pair = new Pair("se", "query_g");
        Pair pair2 = new Pair("ad_format", "BANNER");
        Pair pair3 = new Pair("rtype", Integer.toString(6));
        Pair pair4 = new Pair("scar", "true");
        ua.j jVar = ua.j.C;
        jVar.f35267k.getClass();
        Pair pair5 = new Pair("lat_ms", Long.toString(System.currentTimeMillis() - this.f23873e));
        int i4 = this.f23872d;
        Pair pair6 = new Pair("sgpc_rn", Integer.toString(i4));
        Pair pair7 = new Pair("sgpc_lsu", String.valueOf(this.f23874f));
        boolean z3 = this.f23871c;
        u6.t.B(this.f23870b, "sgpcs", pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("tpc", true != z3 ? "0" : "1"));
        jVar.f35267k.getClass();
        this.f23869a.b(z3, new b0(dVar, "", ((Long) zl.f19116h.u()).longValue() + System.currentTimeMillis(), i4));
    }
}

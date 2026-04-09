package bh;

import androidx.lifecycle.l0;
import com.liuzh.deviceinfo.pro.account.Sku;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w extends hg.e {

    /* renamed from: b, reason: collision with root package name */
    public final l0 f2244b;

    /* renamed from: c, reason: collision with root package name */
    public final l0 f2245c;

    /* renamed from: d, reason: collision with root package name */
    public final wi.e f2246d;

    /* renamed from: e, reason: collision with root package name */
    public final wi.e f2247e;

    /* renamed from: f, reason: collision with root package name */
    public final l0 f2248f;
    public final l0 g;

    /* renamed from: h, reason: collision with root package name */
    public final wi.e f2249h;

    /* renamed from: i, reason: collision with root package name */
    public final wi.e f2250i;
    public final l0 j;

    /* renamed from: k, reason: collision with root package name */
    public final l0 f2251k;

    /* renamed from: l, reason: collision with root package name */
    public final Sku f2252l;

    /* renamed from: m, reason: collision with root package name */
    public long f2253m;

    /* renamed from: n, reason: collision with root package name */
    public Sku f2254n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2255o;

    public w() {
        Sku sku;
        l0 l0Var = new l0();
        this.f2244b = l0Var;
        this.f2245c = l0Var;
        wi.e eVar = new wi.e();
        this.f2246d = eVar;
        this.f2247e = eVar;
        l0 l0Var2 = new l0();
        this.f2248f = l0Var2;
        this.g = l0Var2;
        wi.e eVar2 = new wi.e();
        this.f2249h = eVar2;
        this.f2250i = eVar2;
        l0 l0Var3 = new l0();
        this.j = l0Var3;
        this.f2251k = l0Var3;
        String string = c.f2189b.getString("key_cn_sku_config", null);
        try {
            Object objC = new com.google.gson.j().c((string == null || string.length() == 0) ? "{    \"sku_id\": 3,    \"ori_amount\": 9900,    \"amount\": 4600,    \"duration\": -1,    \"limit_time\": true,    \"hwpay_sku_id\": \"devinfo_pro_42\"}" : string, new xf.a(Sku.class));
            nk.k.b(objC);
            sku = (Sku) objC;
        } catch (com.google.gson.q e2) {
            wd.b.B(e2);
            Object objC2 = new com.google.gson.j().c("{    \"sku_id\": 3,    \"ori_amount\": 9900,    \"amount\": 4600,    \"duration\": -1,    \"limit_time\": true,    \"hwpay_sku_id\": \"devinfo_pro_42\"}", new xf.a(Sku.class));
            nk.k.b(objC2);
            sku = (Sku) objC2;
        }
        this.f2252l = sku;
    }

    public static final void g(w wVar, Throwable th2) {
        wi.e eVar = wVar.f2246d;
        String message = th2.getMessage();
        if (message == null) {
            message = a0.g.o("error@", th2);
        }
        eVar.h(message);
    }

    public static final void h(w wVar, Throwable th2) {
        wi.e eVar = wVar.f2246d;
        String message = th2.getMessage();
        if (message == null) {
            message = a0.g.o("error@", th2);
        }
        eVar.h(message);
        r5.c.t(false, wVar.f2244b);
    }

    public static final void i(w wVar, Throwable th2) {
        wi.e eVar = wVar.f2246d;
        String message = th2.getMessage();
        if (message == null) {
            message = a0.g.o("error@", th2);
        }
        eVar.h(message);
    }

    public static final void j(w wVar, Throwable th2) {
        wi.e eVar = wVar.f2246d;
        String message = th2.getMessage();
        if (message == null) {
            message = a0.g.o("error@", th2);
        }
        eVar.h(message);
        r5.c.t(false, wVar.f2244b);
    }

    public static final void k(w wVar, Throwable th2) {
        wi.e eVar = wVar.f2246d;
        String message = th2.getMessage();
        if (message == null) {
            message = a0.g.o("error@", th2);
        }
        eVar.h(message);
        r5.c.t(false, wVar.f2244b);
    }

    public static final void l(w wVar, Throwable th2) {
        wi.e eVar = wVar.f2246d;
        String message = th2.getMessage();
        if (message == null) {
            message = a0.g.o("error@", th2);
        }
        eVar.h(message);
    }

    public static final void m(w wVar, Throwable th2) {
        wi.e eVar = wVar.f2246d;
        String message = th2.getMessage();
        if (message == null) {
            message = a0.g.o("error@", th2);
        }
        eVar.h(message);
        wVar.f2254n = null;
        r5.c.t(false, wVar.f2244b);
    }
}

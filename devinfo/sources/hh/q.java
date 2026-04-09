package hh;

import androidx.lifecycle.l0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q extends hg.e {

    /* renamed from: b, reason: collision with root package name */
    public final wi.e f25117b;

    /* renamed from: c, reason: collision with root package name */
    public final wi.e f25118c;

    /* renamed from: d, reason: collision with root package name */
    public final l0 f25119d;

    /* renamed from: e, reason: collision with root package name */
    public final l0 f25120e;

    /* renamed from: f, reason: collision with root package name */
    public final l0 f25121f;
    public final l0 g;

    /* renamed from: h, reason: collision with root package name */
    public final l0 f25122h;

    /* renamed from: i, reason: collision with root package name */
    public final l0 f25123i;

    public q() {
        wi.e eVar = new wi.e();
        this.f25117b = eVar;
        this.f25118c = eVar;
        l0 l0Var = new l0();
        this.f25119d = l0Var;
        this.f25120e = l0Var;
        l0 l0Var2 = new l0();
        this.f25121f = l0Var2;
        this.g = l0Var2;
        l0 l0Var3 = new l0();
        this.f25122h = l0Var3;
        this.f25123i = l0Var3;
    }

    public static final void g(q qVar, Throwable th2) {
        wi.e eVar = qVar.f25117b;
        String message = th2.getMessage();
        if (message == null) {
            message = a0.g.o("error@", th2);
        }
        eVar.h(message);
    }
}

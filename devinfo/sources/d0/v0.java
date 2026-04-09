package d0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class v0 implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z0 f21857a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nk.u f21858b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nk.r f21859c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z1 f21860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nk.q f21861e;

    public /* synthetic */ v0(z0 z0Var, nk.u uVar, nk.r rVar, z1 z1Var, nk.q qVar) {
        this.f21857a = z0Var;
        this.f21858b = uVar;
        this.f21859c = rVar;
        this.f21860d = z1Var;
        this.f21861e = qVar;
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        z0 z0Var = this.f21857a;
        t0 t0VarT = z0.t((zk.h) z0Var.f21917f);
        if (t0VarT != null) {
            z0Var.u(t0VarT);
            nk.u uVar = this.f21858b;
            t0 t0VarA = ((t0) uVar.f29986a).a(t0VarT);
            uVar.f29986a = t0VarA;
            long j = t0VarA.f21842a;
            z1 z1Var = this.f21860d;
            this.f21859c.f29983a = z1Var.i(z1Var.e(j));
            this.f21861e.f29982a = !s0.a(r0 - fFloatValue);
        }
        return Boolean.valueOf(t0VarT != null);
    }
}

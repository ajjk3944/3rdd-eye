package d0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class c2 implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21687a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f21688b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21689c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f21690d;

    public /* synthetic */ c2(e2 e2Var, float f10, mk.c cVar) {
        this.f21689c = e2Var;
        this.f21688b = f10;
        this.f21690d = cVar;
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        long jRound;
        switch (this.f21687a) {
            case 0:
                e2 e2Var = (e2) this.f21689c;
                mk.c cVar = (mk.c) this.f21690d;
                long jLongValue = ((Long) obj).longValue();
                if (e2Var.f21713b == Long.MIN_VALUE) {
                    e2Var.f21713b = jLongValue;
                }
                float f10 = e2Var.f21716e;
                a0.n nVar = new a0.n(f10);
                float f11 = this.f21688b;
                a0.n nVar2 = e2.f21711f;
                if (f11 == 0.0f) {
                    jRound = e2Var.f21712a.g(new a0.n(f10), nVar2, e2Var.f21714c);
                } else {
                    double d10 = (jLongValue - e2Var.f21713b) / f11;
                    if (Double.isNaN(d10)) {
                        throw new IllegalArgumentException("Cannot round NaN value.");
                    }
                    jRound = Math.round(d10);
                }
                long j = jRound;
                float f12 = ((a0.n) e2Var.f21712a.r(j, nVar, nVar2, e2Var.f21714c)).f92a;
                e2Var.f21714c = (a0.n) e2Var.f21712a.j(j, nVar, nVar2, e2Var.f21714c);
                e2Var.f21713b = jLongValue;
                float f13 = e2Var.f21716e - f12;
                e2Var.f21716e = f12;
                cVar.invoke(Float.valueOf(f13));
                break;
            default:
                g2.s0 s0Var = (g2.s0) this.f21689c;
                g2.r0 r0Var = (g2.r0) obj;
                a0.e eVar = ((r0.v0) this.f21690d).f32679s;
                g2.r0.i(r0Var, s0Var, (int) (eVar != null ? ((Number) eVar.d()).floatValue() : this.f21688b), 0);
                break;
        }
        return yj.u.f37649a;
    }

    public /* synthetic */ c2(g2.s0 s0Var, r0.v0 v0Var, float f10) {
        this.f21689c = s0Var;
        this.f21690d = v0Var;
        this.f21688b = f10;
    }
}

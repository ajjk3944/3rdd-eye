package ma;

/* loaded from: classes.dex */
public final class q implements i, w6.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16552a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16553b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16554c;

    /* renamed from: d, reason: collision with root package name */
    public long f16555d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f16556e;

    /* renamed from: f, reason: collision with root package name */
    public String f16557f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16558g;

    /* renamed from: h, reason: collision with root package name */
    public long f16559h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16560i;
    public final Object j;
    public final Object k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f16561l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f16562m;

    /* renamed from: n, reason: collision with root package name */
    public Object f16563n;

    /* renamed from: o, reason: collision with root package name */
    public Object f16564o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f16565p;

    public q(w6.s sVar, boolean z10, boolean z11) {
        this.f16552a = 1;
        this.j = sVar;
        this.f16553b = z10;
        this.f16554c = z11;
        this.f16556e = new boolean[3];
        this.k = new v(7, 1);
        this.f16561l = new v(8, 1);
        this.f16562m = new v(6, 1);
        this.f16559h = -9223372036854775807L;
        this.f16565p = new a5.v();
    }

    @Override // ma.i
    public final void a() {
        switch (this.f16552a) {
            case 0:
                this.f16555d = 0L;
                this.f16560i = false;
                this.f16559h = -9223372036854775807L;
                qb.b.n(this.f16556e);
                ((v) this.k).f();
                ((v) this.f16561l).f();
                ((v) this.f16562m).f();
                p pVar = (p) this.f16564o;
                if (pVar != null) {
                    pVar.f16544i = false;
                    pVar.k = false;
                    o oVar = (o) pVar.f16551r;
                    oVar.f16523b = false;
                    oVar.f16522a = false;
                    break;
                }
                break;
            default:
                this.f16555d = 0L;
                this.f16560i = false;
                this.f16559h = -9223372036854775807L;
                u5.b.d(this.f16556e);
                ((v) this.k).f();
                ((v) this.f16561l).f();
                ((v) this.f16562m).f();
                p pVar2 = (p) this.f16564o;
                if (pVar2 != null) {
                    pVar2.f16544i = false;
                    pVar2.k = false;
                    o oVar2 = (o) pVar2.f16551r;
                    oVar2.f16523b = false;
                    oVar2.f16522a = false;
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0280  */
    @Override // w6.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(a5.v r24) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.q.b(a5.v):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0289  */
    @Override // ma.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(fb.f r24) {
        /*
            Method dump skipped, instructions count: 802
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.q.c(fb.f):void");
    }

    @Override // ma.i
    public final void d() {
        int i10 = this.f16552a;
    }

    @Override // ma.i
    public final void e(int i10, long j) {
        switch (this.f16552a) {
            case 0:
                if (j != -9223372036854775807L) {
                    this.f16559h = j;
                }
                this.f16560i = ((i10 & 2) != 0) | this.f16560i;
                break;
            default:
                if (j != -9223372036854775807L) {
                    this.f16559h = j;
                }
                this.f16560i = ((i10 & 2) != 0) | this.f16560i;
                break;
        }
    }

    @Override // ma.i
    public void f(ca.m mVar, g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.f16557f = g0Var.f16469f;
        g0Var.b();
        ca.x xVarN = mVar.n(g0Var.f16468e, 2);
        this.f16563n = xVarN;
        this.f16564o = new p(xVarN, this.f16553b, this.f16554c);
        ((c0) this.j).b(mVar, g0Var);
    }

    @Override // w6.f
    public void g(u5.m mVar, g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.f16557f = g0Var.f16469f;
        g0Var.b();
        u5.a0 a0VarMo36n = mVar.mo36n(g0Var.f16468e, 2);
        this.f16563n = a0VarMo36n;
        this.f16564o = new p(a0VarMo36n, this.f16553b, this.f16554c);
        ((w6.s) this.j).b(mVar, g0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(byte[] r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 836
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.q.h(byte[], int, int):void");
    }

    public q(c0 c0Var, boolean z10, boolean z11) {
        this.f16552a = 0;
        this.j = c0Var;
        this.f16553b = z10;
        this.f16554c = z11;
        this.f16556e = new boolean[3];
        this.k = new v(7, 0);
        this.f16561l = new v(8, 0);
        this.f16562m = new v(6, 0);
        this.f16559h = -9223372036854775807L;
        this.f16565p = new fb.f();
    }

    private final void i() {
    }

    private final void j() {
    }
}

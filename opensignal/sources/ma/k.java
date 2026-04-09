package ma;

/* loaded from: classes.dex */
public final class k implements i {

    /* renamed from: q, reason: collision with root package name */
    public static final double[] f16482q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    public String f16483a;

    /* renamed from: b, reason: collision with root package name */
    public ca.x f16484b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f16485c;

    /* renamed from: d, reason: collision with root package name */
    public final fb.f f16486d;

    /* renamed from: e, reason: collision with root package name */
    public final v f16487e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f16488f = new boolean[4];

    /* renamed from: g, reason: collision with root package name */
    public final j f16489g;

    /* renamed from: h, reason: collision with root package name */
    public long f16490h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16491i;
    public boolean j;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public long f16492l;

    /* renamed from: m, reason: collision with root package name */
    public long f16493m;

    /* renamed from: n, reason: collision with root package name */
    public long f16494n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f16495o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f16496p;

    public k(c0 c0Var) {
        this.f16485c = c0Var;
        j jVar = new j();
        jVar.f16481d = new byte[128];
        this.f16489g = jVar;
        if (c0Var != null) {
            this.f16487e = new v(178, 0);
            this.f16486d = new fb.f();
        } else {
            this.f16487e = null;
            this.f16486d = null;
        }
        this.f16492l = -9223372036854775807L;
        this.f16494n = -9223372036854775807L;
    }

    @Override // ma.i
    public final void a() {
        qb.b.n(this.f16488f);
        j jVar = this.f16489g;
        jVar.f16478a = false;
        jVar.f16479b = 0;
        jVar.f16480c = 0;
        v vVar = this.f16487e;
        if (vVar != null) {
            vVar.f();
        }
        this.f16490h = 0L;
        this.f16491i = false;
        this.f16492l = -9223372036854775807L;
        this.f16494n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f9  */
    @Override // ma.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(fb.f r23) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.k.c(fb.f):void");
    }

    @Override // ma.i
    public final void e(int i10, long j) {
        this.f16492l = j;
    }

    @Override // ma.i
    public final void f(ca.m mVar, g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.f16483a = g0Var.f16469f;
        g0Var.b();
        this.f16484b = mVar.n(g0Var.f16468e, 2);
        c0 c0Var = this.f16485c;
        if (c0Var != null) {
            c0Var.b(mVar, g0Var);
        }
    }

    @Override // ma.i
    public final void d() {
    }
}

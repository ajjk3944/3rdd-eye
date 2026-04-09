package ma;

/* loaded from: classes.dex */
public final class n implements i {

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f16512l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final c0 f16513a;

    /* renamed from: b, reason: collision with root package name */
    public final fb.f f16514b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f16515c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    public final l f16516d;

    /* renamed from: e, reason: collision with root package name */
    public final v f16517e;

    /* renamed from: f, reason: collision with root package name */
    public m f16518f;

    /* renamed from: g, reason: collision with root package name */
    public long f16519g;

    /* renamed from: h, reason: collision with root package name */
    public String f16520h;

    /* renamed from: i, reason: collision with root package name */
    public ca.x f16521i;
    public boolean j;
    public long k;

    public n(c0 c0Var) {
        this.f16513a = c0Var;
        l lVar = new l();
        lVar.f16502e = new byte[128];
        this.f16516d = lVar;
        this.k = -9223372036854775807L;
        this.f16517e = new v(178, 0);
        this.f16514b = new fb.f();
    }

    @Override // ma.i
    public final void a() {
        qb.b.n(this.f16515c);
        l lVar = this.f16516d;
        lVar.f16498a = false;
        lVar.f16500c = 0;
        lVar.f16499b = 0;
        m mVar = this.f16518f;
        if (mVar != null) {
            mVar.f16504b = false;
            mVar.f16505c = false;
            mVar.f16506d = false;
            mVar.f16507e = -1;
        }
        v vVar = this.f16517e;
        if (vVar != null) {
            vVar.f();
        }
        this.f16519g = 0L;
        this.k = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0230  */
    @Override // ma.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(fb.f r26) {
        /*
            Method dump skipped, instructions count: 667
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.n.c(fb.f):void");
    }

    @Override // ma.i
    public final void e(int i10, long j) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
    }

    @Override // ma.i
    public final void f(ca.m mVar, g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.f16520h = g0Var.f16469f;
        g0Var.b();
        ca.x xVarN = mVar.n(g0Var.f16468e, 2);
        this.f16521i = xVarN;
        this.f16518f = new m(0, xVarN);
        this.f16513a.b(mVar, g0Var);
    }

    @Override // ma.i
    public final void d() {
    }
}

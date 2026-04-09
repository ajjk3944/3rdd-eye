package ma;

/* loaded from: classes.dex */
public final class g implements i, w6.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16454a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16455b;

    /* renamed from: c, reason: collision with root package name */
    public String f16456c;

    /* renamed from: d, reason: collision with root package name */
    public int f16457d;

    /* renamed from: e, reason: collision with root package name */
    public int f16458e;

    /* renamed from: f, reason: collision with root package name */
    public int f16459f;

    /* renamed from: g, reason: collision with root package name */
    public long f16460g;

    /* renamed from: h, reason: collision with root package name */
    public int f16461h;

    /* renamed from: i, reason: collision with root package name */
    public long f16462i;
    public final Object j;
    public Object k;

    /* renamed from: l, reason: collision with root package name */
    public Object f16463l;

    public g(String str, int i10) {
        this.f16454a = i10;
        switch (i10) {
            case 1:
                this.j = new a5.v(new byte[18]);
                this.f16457d = 0;
                this.f16462i = -9223372036854775807L;
                this.f16455b = str;
                break;
            default:
                this.j = new fb.f(new byte[18]);
                this.f16457d = 0;
                this.f16462i = -9223372036854775807L;
                this.f16455b = str;
                break;
        }
    }

    @Override // ma.i
    public final void a() {
        switch (this.f16454a) {
            case 0:
                this.f16457d = 0;
                this.f16458e = 0;
                this.f16459f = 0;
                this.f16462i = -9223372036854775807L;
                break;
            default:
                this.f16457d = 0;
                this.f16458e = 0;
                this.f16459f = 0;
                this.f16462i = -9223372036854775807L;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0287  */
    @Override // w6.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(a5.v r28) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.g.b(a5.v):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0287  */
    @Override // ma.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(fb.f r28) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.g.c(fb.f):void");
    }

    @Override // ma.i
    public final void d() {
        int i10 = this.f16454a;
    }

    @Override // ma.i
    public final void e(int i10, long j) {
        switch (this.f16454a) {
            case 0:
                if (j != -9223372036854775807L) {
                    this.f16462i = j;
                    break;
                }
                break;
            default:
                if (j != -9223372036854775807L) {
                    this.f16462i = j;
                    break;
                }
                break;
        }
    }

    @Override // ma.i
    public void f(ca.m mVar, g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.f16456c = g0Var.f16469f;
        g0Var.b();
        this.k = mVar.n(g0Var.f16468e, 1);
    }

    @Override // w6.f
    public void g(u5.m mVar, g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.f16456c = g0Var.f16469f;
        g0Var.b();
        this.k = mVar.mo36n(g0Var.f16468e, 1);
    }

    private final void h() {
    }

    private final void i() {
    }
}

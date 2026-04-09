package w6;

import ma.g0;
import u5.a0;

/* loaded from: classes.dex */
public final class j implements f {

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f24304l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final s f24305a;

    /* renamed from: b, reason: collision with root package name */
    public final a5.v f24306b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f24307c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    public final i f24308d;

    /* renamed from: e, reason: collision with root package name */
    public final ma.v f24309e;

    /* renamed from: f, reason: collision with root package name */
    public ma.m f24310f;

    /* renamed from: g, reason: collision with root package name */
    public long f24311g;

    /* renamed from: h, reason: collision with root package name */
    public String f24312h;

    /* renamed from: i, reason: collision with root package name */
    public a0 f24313i;
    public boolean j;
    public long k;

    public j(s sVar) {
        this.f24305a = sVar;
        i iVar = new i();
        iVar.f24303e = new byte[128];
        this.f24308d = iVar;
        this.k = -9223372036854775807L;
        this.f24309e = new ma.v(178, 1);
        this.f24306b = new a5.v();
    }

    @Override // w6.f
    public final void a() {
        u5.b.d(this.f24307c);
        i iVar = this.f24308d;
        iVar.f24299a = false;
        iVar.f24301c = 0;
        iVar.f24300b = 0;
        ma.m mVar = this.f24310f;
        if (mVar != null) {
            mVar.f16504b = false;
            mVar.f16505c = false;
            mVar.f16506d = false;
            mVar.f16507e = -1;
        }
        ma.v vVar = this.f24309e;
        if (vVar != null) {
            vVar.f();
        }
        this.f24311g = 0L;
        this.k = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0231  */
    @Override // w6.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(a5.v r26) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.j.b(a5.v):void");
    }

    @Override // w6.f
    public final void e(int i10, long j) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
    }

    @Override // w6.f
    public final void g(u5.m mVar, g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.f24312h = g0Var.f16469f;
        g0Var.b();
        a0 a0VarMo36n = mVar.mo36n(g0Var.f16468e, 2);
        this.f24313i = a0VarMo36n;
        this.f24310f = new ma.m(1, a0VarMo36n);
        this.f24305a.b(mVar, g0Var);
    }

    @Override // w6.f
    public final void d() {
    }
}

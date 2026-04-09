package w6;

import ma.g0;
import u5.a0;

/* loaded from: classes.dex */
public final class h implements f {

    /* renamed from: q, reason: collision with root package name */
    public static final double[] f24283q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    public String f24284a;

    /* renamed from: b, reason: collision with root package name */
    public a0 f24285b;

    /* renamed from: c, reason: collision with root package name */
    public final s f24286c;

    /* renamed from: d, reason: collision with root package name */
    public final a5.v f24287d;

    /* renamed from: e, reason: collision with root package name */
    public final ma.v f24288e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f24289f = new boolean[4];

    /* renamed from: g, reason: collision with root package name */
    public final g f24290g;

    /* renamed from: h, reason: collision with root package name */
    public long f24291h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f24292i;
    public boolean j;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public long f24293l;

    /* renamed from: m, reason: collision with root package name */
    public long f24294m;

    /* renamed from: n, reason: collision with root package name */
    public long f24295n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f24296o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f24297p;

    public h(s sVar) {
        this.f24286c = sVar;
        g gVar = new g();
        gVar.f24282d = new byte[128];
        this.f24290g = gVar;
        if (sVar != null) {
            this.f24288e = new ma.v(178, 1);
            this.f24287d = new a5.v();
        } else {
            this.f24288e = null;
            this.f24287d = null;
        }
        this.f24293l = -9223372036854775807L;
        this.f24295n = -9223372036854775807L;
    }

    @Override // w6.f
    public final void a() {
        u5.b.d(this.f24289f);
        g gVar = this.f24290g;
        gVar.f24279a = false;
        gVar.f24280b = 0;
        gVar.f24281c = 0;
        ma.v vVar = this.f24288e;
        if (vVar != null) {
            vVar.f();
        }
        this.f24291h = 0L;
        this.f24292i = false;
        this.f24293l = -9223372036854775807L;
        this.f24295n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f9  */
    @Override // w6.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(a5.v r23) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.h.b(a5.v):void");
    }

    @Override // w6.f
    public final void e(int i10, long j) {
        this.f24293l = j;
    }

    @Override // w6.f
    public final void g(u5.m mVar, g0 g0Var) {
        g0Var.a();
        g0Var.b();
        this.f24284a = g0Var.f16469f;
        g0Var.b();
        this.f24285b = mVar.mo36n(g0Var.f16468e, 2);
        s sVar = this.f24286c;
        if (sVar != null) {
            sVar.b(mVar, g0Var);
        }
    }

    @Override // w6.f
    public final void d() {
    }
}

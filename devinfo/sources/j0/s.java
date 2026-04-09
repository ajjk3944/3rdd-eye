package j0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: s, reason: collision with root package name */
    public static final long f26956s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f26957t = 0;

    /* renamed from: a, reason: collision with root package name */
    public final xk.v f26958a;

    /* renamed from: b, reason: collision with root package name */
    public final p1.x f26959b;

    /* renamed from: c, reason: collision with root package name */
    public final a6.e f26960c;

    /* renamed from: d, reason: collision with root package name */
    public a0.z f26961d;

    /* renamed from: e, reason: collision with root package name */
    public a0.z f26962e;

    /* renamed from: f, reason: collision with root package name */
    public a0.z f26963f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final u0.d1 f26964h;

    /* renamed from: i, reason: collision with root package name */
    public final u0.d1 f26965i;
    public final u0.d1 j;

    /* renamed from: k, reason: collision with root package name */
    public final u0.d1 f26966k;

    /* renamed from: l, reason: collision with root package name */
    public long f26967l;

    /* renamed from: m, reason: collision with root package name */
    public long f26968m;

    /* renamed from: n, reason: collision with root package name */
    public s1.b f26969n;

    /* renamed from: o, reason: collision with root package name */
    public final a0.e f26970o;

    /* renamed from: p, reason: collision with root package name */
    public final a0.e f26971p;

    /* renamed from: q, reason: collision with root package name */
    public final u0.d1 f26972q;

    /* renamed from: r, reason: collision with root package name */
    public long f26973r;

    static {
        long j = Integer.MAX_VALUE;
        f26956s = (j & 4294967295L) | (j << 32);
    }

    public s(xk.v vVar, p1.x xVar, a6.e eVar) {
        this.f26958a = vVar;
        this.f26959b = xVar;
        this.f26960c = eVar;
        Boolean bool = Boolean.FALSE;
        this.f26964h = u0.q.r(bool);
        this.f26965i = u0.q.r(bool);
        this.j = u0.q.r(bool);
        this.f26966k = u0.q.r(bool);
        long j = f26956s;
        this.f26967l = j;
        this.f26968m = 0L;
        this.f26969n = xVar != null ? xVar.b() : null;
        this.f26970o = new a0.e(new d3.i(0L), a0.f.f48p, null, 12);
        this.f26971p = new a0.e(Float.valueOf(1.0f), a0.f.j, null, 12);
        this.f26972q = u0.q.r(new d3.i(0L));
        this.f26973r = j;
    }

    public final void a() {
        s1.b bVar = this.f26969n;
        a0.z zVar = this.f26961d;
        boolean zBooleanValue = ((Boolean) this.f26965i.getValue()).booleanValue();
        xk.v vVar = this.f26958a;
        ck.c cVar = null;
        if (zBooleanValue || zVar == null || bVar == null) {
            if (b()) {
                if (bVar != null) {
                    bVar.e(1.0f);
                }
                xk.x.v(vVar, null, null, new q(this, cVar, 0), 3);
                return;
            }
            return;
        }
        d(true);
        boolean zB = b();
        boolean z3 = !zB;
        if (!zB) {
            bVar.e(0.0f);
        }
        xk.x.v(vVar, null, null, new c0.d(z3, this, zVar, bVar, (ck.c) null), 3);
    }

    public final boolean b() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    public final void c() {
        p1.x xVar;
        boolean zBooleanValue = ((Boolean) this.f26964h.getValue()).booleanValue();
        xk.v vVar = this.f26958a;
        ck.c cVar = null;
        if (zBooleanValue) {
            f(false);
            xk.x.v(vVar, null, null, new q(this, cVar, 2), 3);
        }
        if (((Boolean) this.f26965i.getValue()).booleanValue()) {
            d(false);
            xk.x.v(vVar, null, null, new q(this, cVar, 3), 3);
        }
        if (b()) {
            e(false);
            xk.x.v(vVar, null, null, new q(this, cVar, 4), 3);
        }
        this.g = false;
        g(0L);
        this.f26967l = f26956s;
        s1.b bVar = this.f26969n;
        if (bVar != null && (xVar = this.f26959b) != null) {
            xVar.a(bVar);
        }
        this.f26969n = null;
        this.f26961d = null;
        this.f26963f = null;
        this.f26962e = null;
    }

    public final void d(boolean z3) {
        this.f26965i.setValue(Boolean.valueOf(z3));
    }

    public final void e(boolean z3) {
        this.j.setValue(Boolean.valueOf(z3));
    }

    public final void f(boolean z3) {
        this.f26964h.setValue(Boolean.valueOf(z3));
    }

    public final void g(long j) {
        this.f26972q.setValue(new d3.i(j));
    }
}

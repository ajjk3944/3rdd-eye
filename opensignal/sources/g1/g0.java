package g1;

/* loaded from: classes.dex */
public final class g0 implements t2.c {

    /* renamed from: b, reason: collision with root package name */
    public int f9218b;

    /* renamed from: c, reason: collision with root package name */
    public float f9219c;

    /* renamed from: d, reason: collision with root package name */
    public float f9220d;

    /* renamed from: e, reason: collision with root package name */
    public float f9221e;

    /* renamed from: f, reason: collision with root package name */
    public float f9222f;

    /* renamed from: g, reason: collision with root package name */
    public long f9223g;

    /* renamed from: h, reason: collision with root package name */
    public long f9224h;

    /* renamed from: i, reason: collision with root package name */
    public float f9225i;
    public long j;
    public i0 k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f9226l;

    /* renamed from: m, reason: collision with root package name */
    public long f9227m;

    /* renamed from: n, reason: collision with root package name */
    public t2.c f9228n;

    /* renamed from: o, reason: collision with root package name */
    public t2.i f9229o;

    /* renamed from: p, reason: collision with root package name */
    public int f9230p;

    /* renamed from: q, reason: collision with root package name */
    public f0 f9231q;

    public final void a(long j) {
        if (r.c(this.f9223g, j)) {
            return;
        }
        this.f9218b |= 64;
        this.f9223g = j;
    }

    public final void b(float f10) {
        if (this.f9222f == f10) {
            return;
        }
        this.f9218b |= 32;
        this.f9222f = f10;
    }

    public final void c(i0 i0Var) {
        if (br.l.a(this.k, i0Var)) {
            return;
        }
        this.f9218b |= 8192;
        this.k = i0Var;
    }

    public final void d(long j) {
        if (r.c(this.f9224h, j)) {
            return;
        }
        this.f9218b |= 128;
        this.f9224h = j;
    }

    @Override // t2.c
    public final float getDensity() {
        return this.f9228n.getDensity();
    }

    @Override // t2.c
    public final float y() {
        return this.f9228n.y();
    }
}

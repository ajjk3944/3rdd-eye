package p1;

import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.applovin.shadow.okio.internal.Buffer;
import com.google.android.gms.internal.measurement.d5;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h0 implements d3.c {

    /* renamed from: a, reason: collision with root package name */
    public int f30964a;

    /* renamed from: b, reason: collision with root package name */
    public float f30965b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f30966c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f30967d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f30968e;

    /* renamed from: f, reason: collision with root package name */
    public float f30969f;
    public float g;

    /* renamed from: h, reason: collision with root package name */
    public long f30970h;

    /* renamed from: i, reason: collision with root package name */
    public long f30971i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public long f30972k;

    /* renamed from: l, reason: collision with root package name */
    public j0 f30973l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f30974m;

    /* renamed from: n, reason: collision with root package name */
    public long f30975n;

    /* renamed from: o, reason: collision with root package name */
    public d3.c f30976o;

    /* renamed from: p, reason: collision with root package name */
    public d3.l f30977p;

    /* renamed from: q, reason: collision with root package name */
    public int f30978q;

    /* renamed from: r, reason: collision with root package name */
    public z f30979r;

    public h0() {
        long j = a0.f30947a;
        this.f30970h = j;
        this.f30971i = j;
        this.j = 8.0f;
        this.f30972k = m0.f31006a;
        this.f30973l = z.f31032b;
        this.f30975n = 9205357640488583168L;
        this.f30976o = d5.a();
        this.f30977p = d3.l.f21966a;
        this.f30978q = 3;
    }

    @Override // d3.c
    public final float C(int i4) {
        return i4 / a();
    }

    @Override // d3.c
    public final float D(float f10) {
        return f10 / a();
    }

    @Override // d3.c
    public final float F() {
        return this.f30976o.F();
    }

    @Override // d3.c
    public final float I(float f10) {
        return a() * f10;
    }

    @Override // d3.c
    public final /* synthetic */ int Q(float f10) {
        return d.h.i(this, f10);
    }

    @Override // d3.c
    public final /* synthetic */ long T(long j) {
        return d.h.m(j, this);
    }

    @Override // d3.c
    public final /* synthetic */ float W(long j) {
        return d.h.l(j, this);
    }

    @Override // d3.c
    public final float a() {
        return this.f30976o.a();
    }

    public final void b() {
        if (this.f30965b != 1.0f) {
            this.f30964a |= 1;
            this.f30965b = 1.0f;
        }
        if (this.f30966c != 1.0f) {
            this.f30964a |= 2;
            this.f30966c = 1.0f;
        }
        if (this.f30967d != 1.0f) {
            this.f30964a |= 4;
            this.f30967d = 1.0f;
        }
        d(0.0f);
        e(0.0f);
        if (this.g != 0.0f) {
            this.f30964a |= 32;
            this.g = 0.0f;
        }
        long j = a0.f30947a;
        if (!s.c(this.f30970h, j)) {
            this.f30964a |= 64;
            this.f30970h = j;
        }
        if (!s.c(this.f30971i, j)) {
            this.f30964a |= 128;
            this.f30971i = j;
        }
        if (this.j != 8.0f) {
            this.f30964a |= 2048;
            this.j = 8.0f;
        }
        long j8 = m0.f31006a;
        if (this.f30972k != j8) {
            this.f30964a |= Buffer.SEGMENTING_THRESHOLD;
            this.f30972k = j8;
        }
        j0 j0Var = this.f30973l;
        g0 g0Var = z.f31032b;
        if (!nk.k.a(j0Var, g0Var)) {
            this.f30964a |= Segment.SIZE;
            this.f30973l = g0Var;
        }
        if (this.f30974m) {
            this.f30964a |= Http2.INITIAL_MAX_FRAME_SIZE;
            this.f30974m = false;
        }
        if (this.f30978q != 3) {
            this.f30964a |= 524288;
            this.f30978q = 3;
        }
        this.f30975n = 9205357640488583168L;
        this.f30979r = null;
        this.f30964a = 0;
    }

    public final void d(float f10) {
        if (this.f30968e == f10) {
            return;
        }
        this.f30964a |= 8;
        this.f30968e = f10;
    }

    public final void e(float f10) {
        if (this.f30969f == f10) {
            return;
        }
        this.f30964a |= 16;
        this.f30969f = f10;
    }

    @Override // d3.c
    public final /* synthetic */ float o(long j) {
        return d.h.k(j, this);
    }

    @Override // d3.c
    public final long x(float f10) {
        return d.h.n(this, D(f10));
    }
}

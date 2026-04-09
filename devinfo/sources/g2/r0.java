package g2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class r0 implements d3.c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f24404a;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(r0 r0Var, s0 s0Var) {
        r0Var.getClass();
        if (s0Var instanceof i2.w0) {
            ((i2.w0) s0Var).z(r0Var.f24404a);
        }
    }

    public static void g(r0 r0Var, s0 s0Var, int i4, int i10) {
        r0Var.getClass();
        b(r0Var, s0Var);
        s0Var.R(d3.i.c((i10 & 4294967295L) | (i4 << 32), s0Var.f24412e), 0.0f, null);
    }

    public static void h(r0 r0Var, s0 s0Var, long j) {
        r0Var.getClass();
        b(r0Var, s0Var);
        s0Var.R(d3.i.c(j, s0Var.f24412e), 0.0f, null);
    }

    public static void i(r0 r0Var, s0 s0Var, int i4, int i10) {
        long j = (i4 << 32) | (i10 & 4294967295L);
        if (r0Var.e() == d3.l.f21966a || r0Var.f() == 0) {
            b(r0Var, s0Var);
            s0Var.R(d3.i.c(j, s0Var.f24412e), 0.0f, null);
        } else {
            int iF = (r0Var.f() - s0Var.f24408a) - ((int) (j >> 32));
            b(r0Var, s0Var);
            s0Var.R(d3.i.c((iF << 32) | (((int) (j & 4294967295L)) & 4294967295L), s0Var.f24412e), 0.0f, null);
        }
    }

    public static void j(r0 r0Var, s0 s0Var) {
        int i4 = u0.f24423b;
        t0 t0Var = t0.f24417b;
        long j = 0;
        long j8 = (j & 4294967295L) | (j << 32);
        if (r0Var.e() == d3.l.f21966a || r0Var.f() == 0) {
            b(r0Var, s0Var);
            s0Var.R(d3.i.c(j8, s0Var.f24412e), 0.0f, t0Var);
        } else {
            int iF = (r0Var.f() - s0Var.f24408a) - ((int) (j8 >> 32));
            b(r0Var, s0Var);
            s0Var.R(d3.i.c((iF << 32) | (((int) (j8 & 4294967295L)) & 4294967295L), s0Var.f24412e), 0.0f, t0Var);
        }
    }

    public static void l(r0 r0Var, s0 s0Var, mk.c cVar) {
        r0Var.getClass();
        long j = 0;
        b(r0Var, s0Var);
        s0Var.R(d3.i.c((j & 4294967295L) | (j << 32), s0Var.f24412e), 0.0f, cVar);
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

    public float d(n nVar) {
        return Float.NaN;
    }

    public abstract d3.l e();

    public abstract int f();

    @Override // d3.c
    public final /* synthetic */ float o(long j) {
        return d.h.k(j, this);
    }

    @Override // d3.c
    public final long x(float f10) {
        return d.h.n(this, D(f10));
    }
}

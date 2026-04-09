package g1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public k f24238a;

    /* renamed from: b, reason: collision with root package name */
    public long f24239b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24240c;

    /* renamed from: d, reason: collision with root package name */
    public int f24241d;

    public g(long j, k kVar) {
        int iA;
        int iNumberOfTrailingZeros;
        this.f24238a = kVar;
        this.f24239b = j;
        b7.w wVar = m.f24258a;
        if (j != 0) {
            k kVarD = d();
            long j8 = kVarD.f24253c;
            long[] jArr = kVarD.f24254d;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j9 = kVarD.f24252b;
                if (j9 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j9);
                } else {
                    long j10 = kVarD.f24251a;
                    if (j10 != 0) {
                        j8 += 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j10);
                    }
                }
                j = iNumberOfTrailingZeros + j8;
            }
            synchronized (m.f24260c) {
                iA = m.f24263f.a(j);
            }
        } else {
            iA = -1;
        }
        this.f24241d = iA;
    }

    public static void q(g gVar) {
        m.f24259b.u(gVar);
    }

    public final void a() {
        synchronized (m.f24260c) {
            b();
            p();
        }
    }

    public void b() {
        m.f24261d = m.f24261d.c(g());
    }

    public abstract void c();

    public k d() {
        return this.f24238a;
    }

    public abstract mk.c e();

    public abstract boolean f();

    public long g() {
        return this.f24239b;
    }

    public int h() {
        return 0;
    }

    public abstract mk.c i();

    public final g j() {
        yb.e eVar = m.f24259b;
        g gVar = (g) eVar.get();
        eVar.u(this);
        return gVar;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(x xVar);

    public final void o() {
        int i4 = this.f24241d;
        if (i4 >= 0) {
            m.v(i4);
            this.f24241d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(k kVar) {
        this.f24238a = kVar;
    }

    public void s(long j) {
        this.f24239b = j;
    }

    public void t(int i4) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract g u(mk.c cVar);
}

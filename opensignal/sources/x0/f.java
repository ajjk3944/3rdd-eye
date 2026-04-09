package x0;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public j f24697a;

    /* renamed from: b, reason: collision with root package name */
    public long f24698b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24699c;

    /* renamed from: d, reason: collision with root package name */
    public int f24700d;

    public f(long j, j jVar) {
        int iA;
        int iNumberOfTrailingZeros;
        this.f24697a = jVar;
        this.f24698b = j;
        lu.u uVar = l.f24715a;
        if (j != 0) {
            j jVarD = d();
            long j7 = jVarD.f24710g;
            long[] jArr = jVarD.f24711r;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j10 = jVarD.f24709d;
                if (j10 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j10);
                } else {
                    long j11 = jVarD.f24708a;
                    if (j11 != 0) {
                        j7 += 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j11);
                    }
                }
                j = iNumberOfTrailingZeros + j7;
            }
            synchronized (l.f24717c) {
                iA = l.f24720f.a(j);
            }
        } else {
            iA = -1;
        }
        this.f24700d = iA;
    }

    public static void q(f fVar) {
        l.f24716b.P(fVar);
    }

    public final void a() {
        synchronized (l.f24717c) {
            b();
            p();
        }
    }

    public void b() {
        l.f24718d = l.f24718d.b(g());
    }

    public abstract void c();

    public j d() {
        return this.f24697a;
    }

    public abstract ar.k e();

    public abstract boolean f();

    public long g() {
        return this.f24698b;
    }

    public int h() {
        return 0;
    }

    public abstract ar.k i();

    public final f j() {
        qm.c cVar = l.f24716b;
        f fVar = (f) cVar.get();
        cVar.P(this);
        return fVar;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(t tVar);

    public final void o() {
        int i10 = this.f24700d;
        if (i10 >= 0) {
            l.u(i10);
            this.f24700d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(j jVar) {
        this.f24697a = jVar;
    }

    public void s(long j) {
        this.f24698b = j;
    }

    public void t(int i10) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract f u(ar.k kVar);
}

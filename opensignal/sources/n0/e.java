package n0;

/* loaded from: classes.dex */
public final class e implements u0 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.p0 f17153a;

    /* renamed from: g, reason: collision with root package name */
    public Throwable f17155g;

    /* renamed from: d, reason: collision with root package name */
    public final Object f17154d = new Object();

    /* renamed from: r, reason: collision with root package name */
    public final v0.a f17156r = new v0.a(0);

    /* renamed from: x, reason: collision with root package name */
    public u.z f17157x = new u.z();

    /* renamed from: y, reason: collision with root package name */
    public u.z f17158y = new u.z();

    public e(androidx.lifecycle.p0 p0Var) {
        this.f17153a = p0Var;
    }

    @Override // pq.h
    public final pq.f Y(pq.g gVar) {
        return se.b.y(this, gVar);
    }

    @Override // pq.h
    public final Object Z(ar.n nVar, Object obj) {
        return nVar.w(obj, this);
    }

    public final void a(long j) {
        int i10;
        wt.g gVar;
        Object objK;
        synchronized (this.f17154d) {
            try {
                u.z zVar = this.f17157x;
                this.f17157x = this.f17158y;
                this.f17158y = zVar;
                v0.a aVar = this.f17156r;
                do {
                    i10 = aVar.get();
                } while (!aVar.compareAndSet(i10, ((((i10 >>> 27) & 15) + 1) & 15) << 27));
                int i11 = zVar.f23135b;
                for (int i12 = 0; i12 < i11; i12++) {
                    d dVar = (d) zVar.e(i12);
                    ar.k kVar = dVar.f17145a;
                    if (kVar != null && (gVar = dVar.f17146b) != null) {
                        try {
                            objK = kVar.a(Long.valueOf(j));
                        } catch (Throwable th2) {
                            objK = lf.t1.k(th2);
                        }
                        gVar.g(objK);
                    }
                }
                zVar.c();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // n0.u0
    public final Object i(ar.k kVar, rq.c cVar) {
        int i10;
        int i11;
        int i12;
        wt.g gVar = new wt.g(1, xu.l.D(cVar));
        gVar.v();
        d dVar = new d();
        dVar.f17145a = kVar;
        dVar.f17146b = gVar;
        br.u uVar = new br.u();
        uVar.f2915a = -1;
        synchronized (this.f17154d) {
            Throwable th2 = this.f17155g;
            if (th2 != null) {
                gVar.g(lf.t1.k(th2));
            } else {
                v0.a aVar = this.f17156r;
                do {
                    i10 = aVar.get();
                    i11 = i10 + 1;
                } while (!aVar.compareAndSet(i10, i11));
                boolean z10 = (134217727 & i11) == 1;
                uVar.f2915a = (i11 >>> 27) & 15;
                this.f17157x.a(dVar);
                gVar.x(new gt.j(dVar, this, uVar, 2));
                if (z10) {
                    try {
                        this.f17153a.c();
                    } catch (Throwable th3) {
                        synchronized (this.f17154d) {
                            try {
                                if (this.f17155g == null) {
                                    this.f17155g = th3;
                                    u.z zVar = this.f17157x;
                                    Object[] objArr = zVar.f23134a;
                                    int i13 = zVar.f23135b;
                                    for (int i14 = 0; i14 < i13; i14++) {
                                        wt.g gVar2 = ((d) objArr[i14]).f17146b;
                                        if (gVar2 != null) {
                                            gVar2.g(lf.t1.k(th3));
                                        }
                                    }
                                    this.f17157x.c();
                                    v0.a aVar2 = this.f17156r;
                                    do {
                                        i12 = aVar2.get();
                                    } while (!aVar2.compareAndSet(i12, ((((i12 >>> 27) & 15) + 1) & 15) << 27));
                                }
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    }
                }
            }
        }
        Object objU = gVar.u();
        qq.a aVar3 = qq.a.COROUTINE_SUSPENDED;
        return objU;
    }

    @Override // pq.h
    public final pq.h i0(pq.h hVar) {
        return se.b.M(this, hVar);
    }

    @Override // pq.h
    public final pq.h q(pq.g gVar) {
        return se.b.L(this, gVar);
    }
}

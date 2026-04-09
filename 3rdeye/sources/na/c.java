package na;

import na.b;

/* compiled from: ChronoLocalDateTime.java */
/* loaded from: classes3.dex */
public abstract class c<D extends b> extends pa.a implements qa.f, Comparable<c<?>> {
    public c() {
        super(false, 1);
    }

    @Override // pa.a, qa.f
    public qa.d adjustInto(qa.d dVar) {
        return dVar.r0(n0().o0(), qa.a.EPOCH_DAY).r0(o0().t0(), qa.a.NANO_OF_DAY);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && compareTo((c) obj) == 0;
    }

    public int hashCode() {
        return n0().hashCode() ^ o0().hashCode();
    }

    public abstract e i0(ma.q qVar);

    @Override // java.lang.Comparable
    /* renamed from: j0 */
    public int compareTo(c<?> cVar) {
        int iCompareTo = n0().compareTo(cVar.n0());
        return (iCompareTo == 0 && (iCompareTo = o0().compareTo(cVar.o0())) == 0) ? n0().k0().h().compareTo(cVar.n0().k0().h()) : iCompareTo;
    }

    @Override // pa.a, qa.d
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public c u(long j4, qa.b bVar) {
        return n0().k0().c(super.u(j4, bVar));
    }

    @Override // qa.d
    /* renamed from: l0 */
    public abstract c<D> q(long j4, qa.k kVar);

    public final long m0(ma.q qVar) {
        com.google.gson.internal.c.v(qVar, "offset");
        return ((n0().o0() * 86400) + o0().u0()) - qVar.f44150c;
    }

    public abstract D n0();

    public abstract ma.g o0();

    @Override // qa.d
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public abstract c r0(long j4, qa.h hVar);

    @Override // qa.d
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public c s0(ma.e eVar) {
        return n0().k0().c(eVar.adjustInto(this));
    }

    @Override // pa.a, I9.g, qa.e
    public <R> R query(qa.j<R> jVar) {
        if (jVar == qa.i.f45476b) {
            return (R) n0().k0();
        }
        if (jVar == qa.i.f45477c) {
            return (R) qa.b.NANOS;
        }
        if (jVar == qa.i.f45480f) {
            return (R) ma.e.D0(n0().o0());
        }
        if (jVar == qa.i.f45481g) {
            return (R) o0();
        }
        if (jVar == qa.i.f45478d || jVar == qa.i.f45475a || jVar == qa.i.f45479e) {
            return null;
        }
        return (R) super.query(jVar);
    }

    public String toString() {
        return n0().toString() + 'T' + o0().toString();
    }
}

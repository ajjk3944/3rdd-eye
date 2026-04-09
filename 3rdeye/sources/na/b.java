package na;

/* compiled from: ChronoLocalDate.java */
/* loaded from: classes3.dex */
public abstract class b extends pa.a implements qa.f, Comparable<b> {
    public b() {
        super(false, 1);
    }

    @Override // pa.a, qa.f
    public qa.d adjustInto(qa.d dVar) {
        return dVar.r0(o0(), qa.a.EPOCH_DAY);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && compareTo((b) obj) == 0;
    }

    public int hashCode() {
        long jO0 = o0();
        return ((int) (jO0 ^ (jO0 >>> 32))) ^ k0().hashCode();
    }

    public c<?> i0(ma.g gVar) {
        return new d(this, gVar);
    }

    @Override // pa.a, qa.e
    public boolean isSupported(qa.h hVar) {
        return hVar instanceof qa.a ? hVar.isDateBased() : hVar != null && hVar.isSupportedBy(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: j0 */
    public int compareTo(b bVar) {
        int iF = com.google.gson.internal.c.f(o0(), bVar.o0());
        if (iF != 0) {
            return iF;
        }
        return k0().h().compareTo(bVar.k0().h());
    }

    public abstract g k0();

    public h l0() {
        return k0().e(get(qa.a.ERA));
    }

    @Override // pa.a, qa.d
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public b u(long j4, qa.k kVar) {
        return k0().b(super.u(j4, kVar));
    }

    @Override // qa.d
    /* renamed from: n0 */
    public abstract b q(long j4, qa.k kVar);

    public long o0() {
        return getLong(qa.a.EPOCH_DAY);
    }

    @Override // qa.d
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public abstract b r0(long j4, qa.h hVar);

    @Override // qa.d
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public b s0(qa.f fVar) {
        return k0().b(fVar.adjustInto(this));
    }

    @Override // pa.a, I9.g, qa.e
    public <R> R query(qa.j<R> jVar) {
        if (jVar == qa.i.f45476b) {
            return (R) k0();
        }
        if (jVar == qa.i.f45477c) {
            return (R) qa.b.DAYS;
        }
        if (jVar == qa.i.f45480f) {
            return (R) ma.e.D0(o0());
        }
        if (jVar == qa.i.f45481g || jVar == qa.i.f45478d || jVar == qa.i.f45475a || jVar == qa.i.f45479e) {
            return null;
        }
        return (R) super.query(jVar);
    }

    public String toString() {
        long j4 = getLong(qa.a.YEAR_OF_ERA);
        long j10 = getLong(qa.a.MONTH_OF_YEAR);
        long j11 = getLong(qa.a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(k0().h());
        sb.append(" ");
        sb.append(l0());
        sb.append(" ");
        sb.append(j4);
        sb.append(j10 < 10 ? "-0" : "-");
        sb.append(j10);
        sb.append(j11 < 10 ? "-0" : "-");
        sb.append(j11);
        return sb.toString();
    }
}

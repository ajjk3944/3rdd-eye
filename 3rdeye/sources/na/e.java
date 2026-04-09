package na;

import na.b;

/* compiled from: ChronoZonedDateTime.java */
/* loaded from: classes3.dex */
public abstract class e<D extends b> extends pa.a implements Comparable<e<?>> {

    /* compiled from: ChronoZonedDateTime.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44428a;

        static {
            int[] iArr = new int[qa.a.values().length];
            f44428a = iArr;
            try {
                iArr[qa.a.INSTANT_SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44428a[qa.a.OFFSET_SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public e() {
        super(false, 1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && compareTo((e) obj) == 0;
    }

    @Override // pa.a, I9.g, qa.e
    public int get(qa.h hVar) {
        if (!(hVar instanceof qa.a)) {
            return super.get(hVar);
        }
        int i = a.f44428a[((qa.a) hVar).ordinal()];
        if (i != 1) {
            return i != 2 ? p0().get(hVar) : j0().f44150c;
        }
        throw new qa.l(com.google.android.gms.measurement.internal.a.f("Field too large for an int: ", hVar));
    }

    @Override // pa.a, qa.e
    public long getLong(qa.h hVar) {
        if (!(hVar instanceof qa.a)) {
            return hVar.getFrom(this);
        }
        int i = a.f44428a[((qa.a) hVar).ordinal()];
        return i != 1 ? i != 2 ? p0().getLong(hVar) : j0().f44150c : n0();
    }

    public int hashCode() {
        return (p0().hashCode() ^ j0().f44150c) ^ Integer.rotateLeft(k0().hashCode(), 3);
    }

    @Override // java.lang.Comparable
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public final int compareTo(e<?> eVar) {
        int iF = com.google.gson.internal.c.f(n0(), eVar.n0());
        return (iF == 0 && (iF = q0().f44113e - eVar.q0().f44113e) == 0 && (iF = p0().compareTo(eVar.p0())) == 0 && (iF = k0().b().compareTo(eVar.k0().b())) == 0) ? o0().k0().h().compareTo(eVar.o0().k0().h()) : iF;
    }

    public abstract ma.q j0();

    public abstract ma.p k0();

    @Override // pa.a, qa.d
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public e u(long j4, qa.b bVar) {
        return o0().k0().d(super.u(j4, bVar));
    }

    @Override // qa.d
    /* renamed from: m0 */
    public abstract e<D> q(long j4, qa.k kVar);

    public final long n0() {
        return ((o0().o0() * 86400) + q0().u0()) - j0().f44150c;
    }

    public D o0() {
        return (D) p0().n0();
    }

    public abstract c<D> p0();

    public ma.g q0() {
        return p0().o0();
    }

    @Override // pa.a, I9.g, qa.e
    public <R> R query(qa.j<R> jVar) {
        return (jVar == qa.i.f45475a || jVar == qa.i.f45478d) ? (R) k0() : jVar == qa.i.f45476b ? (R) o0().k0() : jVar == qa.i.f45477c ? (R) qa.b.NANOS : jVar == qa.i.f45479e ? (R) j0() : jVar == qa.i.f45480f ? (R) ma.e.D0(o0().o0()) : jVar == qa.i.f45481g ? (R) q0() : (R) super.query(jVar);
    }

    @Override // qa.d
    public abstract e r0(long j4, qa.h hVar);

    @Override // I9.g, qa.e
    public qa.m range(qa.h hVar) {
        return hVar instanceof qa.a ? (hVar == qa.a.INSTANT_SECONDS || hVar == qa.a.OFFSET_SECONDS) ? hVar.range() : p0().range(hVar) : hVar.rangeRefinedBy(this);
    }

    @Override // qa.d
    public e<D> s0(qa.f fVar) {
        return o0().k0().d(fVar.adjustInto(this));
    }

    public abstract e<D> t0(ma.p pVar);

    public String toString() {
        String str = p0().toString() + j0().f44151d;
        if (j0() == k0()) {
            return str;
        }
        return str + '[' + k0().toString() + ']';
    }

    public abstract e<D> u0(ma.p pVar);
}

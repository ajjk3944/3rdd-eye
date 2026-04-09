package ma;

import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import qa.i;

/* compiled from: OffsetDateTime.java */
/* loaded from: classes3.dex */
public final class j extends pa.a implements qa.f, Comparable<j>, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f44121e = 0;

    /* renamed from: c, reason: collision with root package name */
    public final f f44122c;

    /* renamed from: d, reason: collision with root package name */
    public final q f44123d;

    /* compiled from: OffsetDateTime.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44124a;

        static {
            int[] iArr = new int[qa.a.values().length];
            f44124a = iArr;
            try {
                iArr[qa.a.INSTANT_SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44124a[qa.a.OFFSET_SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        f fVar = f.f44102e;
        q qVar = q.i;
        fVar.getClass();
        new j(fVar, qVar);
        f fVar2 = f.f44103f;
        q qVar2 = q.f44149h;
        fVar2.getClass();
        new j(fVar2, qVar2);
    }

    public j(f fVar, q qVar) {
        super(false, 1);
        com.google.gson.internal.c.v(fVar, "dateTime");
        this.f44122c = fVar;
        com.google.gson.internal.c.v(qVar, "offset");
        this.f44123d = qVar;
    }

    public static j i0(d dVar, p pVar) {
        com.google.gson.internal.c.v(dVar, "instant");
        com.google.gson.internal.c.v(pVar, "zone");
        q qVarA = pVar.c().a(dVar);
        return new j(f.v0(dVar.f44091b, dVar.f44092c, qVarA), qVarA);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new m((byte) 69, this);
    }

    @Override // qa.d
    /* renamed from: D */
    public final qa.d r0(long j4, qa.h hVar) {
        if (!(hVar instanceof qa.a)) {
            return (j) hVar.adjustInto(this, j4);
        }
        qa.a aVar = (qa.a) hVar;
        int i = a.f44124a[aVar.ordinal()];
        f fVar = this.f44122c;
        q qVar = this.f44123d;
        return i != 1 ? i != 2 ? k0(fVar.p0(j4, hVar), qVar) : k0(fVar, q.j(aVar.checkValidIntValue(j4))) : i0(d.m0(j4, fVar.f44105d.f44113e), qVar);
    }

    @Override // pa.a, qa.f
    public final qa.d adjustInto(qa.d dVar) {
        qa.a aVar = qa.a.EPOCH_DAY;
        f fVar = this.f44122c;
        return dVar.r0(fVar.f44104c.o0(), aVar).r0(fVar.f44105d.t0(), qa.a.NANO_OF_DAY).r0(this.f44123d.f44150c, qa.a.OFFSET_SECONDS);
    }

    @Override // java.lang.Comparable
    public final int compareTo(j jVar) {
        j jVar2 = jVar;
        q qVar = jVar2.f44123d;
        q qVar2 = this.f44123d;
        boolean zEquals = qVar2.equals(qVar);
        f fVar = jVar2.f44122c;
        f fVar2 = this.f44122c;
        if (zEquals) {
            return fVar2.compareTo(fVar);
        }
        int iF = com.google.gson.internal.c.f(fVar2.m0(qVar2), fVar.m0(jVar2.f44123d));
        if (iF != 0) {
            return iF;
        }
        int i = fVar2.f44105d.f44113e - fVar.f44105d.f44113e;
        return i == 0 ? fVar2.compareTo(fVar) : i;
    }

    @Override // qa.d
    /* renamed from: e */
    public final qa.d s0(e eVar) {
        f fVar = this.f44122c;
        return k0(fVar.A0(eVar, fVar.f44105d), this.f44123d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f44122c.equals(jVar.f44122c) && this.f44123d.equals(jVar.f44123d)) {
                return true;
            }
        }
        return false;
    }

    @Override // pa.a, I9.g, qa.e
    public final int get(qa.h hVar) {
        if (!(hVar instanceof qa.a)) {
            return super.get(hVar);
        }
        int i = a.f44124a[((qa.a) hVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.f44122c.get(hVar) : this.f44123d.f44150c;
        }
        throw new ma.a(com.google.android.gms.measurement.internal.a.f("Field too large for an int: ", hVar));
    }

    @Override // pa.a, qa.e
    public final long getLong(qa.h hVar) {
        if (!(hVar instanceof qa.a)) {
            return hVar.getFrom(this);
        }
        int i = a.f44124a[((qa.a) hVar).ordinal()];
        q qVar = this.f44123d;
        f fVar = this.f44122c;
        return i != 1 ? i != 2 ? fVar.getLong(hVar) : qVar.f44150c : fVar.m0(qVar);
    }

    public final int hashCode() {
        return this.f44122c.hashCode() ^ this.f44123d.f44150c;
    }

    @Override // pa.a, qa.e
    public final boolean isSupported(qa.h hVar) {
        if (hVar instanceof qa.a) {
            return true;
        }
        return hVar != null && hVar.isSupportedBy(this);
    }

    @Override // qa.d
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public final j q(long j4, qa.k kVar) {
        return kVar instanceof qa.b ? k0(this.f44122c.l0(j4, kVar), this.f44123d) : (j) kVar.addTo(this, j4);
    }

    public final j k0(f fVar, q qVar) {
        return (this.f44122c == fVar && this.f44123d.equals(qVar)) ? this : new j(fVar, qVar);
    }

    @Override // pa.a, I9.g, qa.e
    public final <R> R query(qa.j<R> jVar) {
        if (jVar == qa.i.f45476b) {
            return (R) na.l.f44466d;
        }
        if (jVar == qa.i.f45477c) {
            return (R) qa.b.NANOS;
        }
        if (jVar == qa.i.f45479e || jVar == qa.i.f45478d) {
            return (R) this.f44123d;
        }
        i.f fVar = qa.i.f45480f;
        f fVar2 = this.f44122c;
        if (jVar == fVar) {
            return (R) fVar2.f44104c;
        }
        if (jVar == qa.i.f45481g) {
            return (R) fVar2.f44105d;
        }
        if (jVar == qa.i.f45475a) {
            return null;
        }
        return (R) super.query(jVar);
    }

    @Override // I9.g, qa.e
    public final qa.m range(qa.h hVar) {
        return hVar instanceof qa.a ? (hVar == qa.a.INSTANT_SECONDS || hVar == qa.a.OFFSET_SECONDS) ? hVar.range() : this.f44122c.range(hVar) : hVar.rangeRefinedBy(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v16, types: [ma.j] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // qa.d
    public final long t(qa.d dVar, qa.b bVar) {
        if (dVar instanceof j) {
            dVar = (j) dVar;
        } else {
            try {
                q qVarG = q.g(dVar);
                try {
                    dVar = new j(f.s0(dVar), qVarG);
                } catch (ma.a unused) {
                    dVar = i0(d.k0(dVar), qVarG);
                }
            } catch (ma.a unused2) {
                throw new ma.a("Unable to obtain OffsetDateTime from TemporalAccessor: " + dVar + ", type " + dVar.getClass().getName());
            }
        }
        if (!androidx.work.s.n(bVar)) {
            return bVar.between(this, dVar);
        }
        q qVar = dVar.f44123d;
        q qVar2 = this.f44123d;
        j jVar = dVar;
        if (!qVar2.equals(qVar)) {
            jVar = new j(dVar.f44122c.x0(qVar2.f44150c - qVar.f44150c), qVar2);
        }
        return this.f44122c.t(jVar.f44122c, bVar);
    }

    public final String toString() {
        return this.f44122c.toString() + this.f44123d.f44151d;
    }

    @Override // pa.a, qa.d
    public final qa.d u(long j4, qa.k kVar) {
        return j4 == Long.MIN_VALUE ? q(Long.MAX_VALUE, kVar).q(1L, kVar) : q(-j4, kVar);
    }
}

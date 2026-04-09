package ma;

import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* compiled from: OffsetTime.java */
/* loaded from: classes3.dex */
public final class k extends I9.g implements qa.d, qa.f, Comparable<k>, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f44125d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final g f44126b;

    /* renamed from: c, reason: collision with root package name */
    public final q f44127c;

    /* compiled from: OffsetTime.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44128a;

        static {
            int[] iArr = new int[qa.b.values().length];
            f44128a = iArr;
            try {
                iArr[qa.b.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44128a[qa.b.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44128a[qa.b.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44128a[qa.b.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44128a[qa.b.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44128a[qa.b.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f44128a[qa.b.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        g gVar = g.f44107f;
        q qVar = q.i;
        gVar.getClass();
        new k(gVar, qVar);
        g gVar2 = g.f44108g;
        q qVar2 = q.f44149h;
        gVar2.getClass();
        new k(gVar2, qVar2);
    }

    public k(g gVar, q qVar) {
        com.google.gson.internal.c.v(gVar, "time");
        this.f44126b = gVar;
        com.google.gson.internal.c.v(qVar, "offset");
        this.f44127c = qVar;
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new m((byte) 66, this);
    }

    @Override // qa.d
    /* renamed from: D */
    public final qa.d r0(long j4, qa.h hVar) {
        if (!(hVar instanceof qa.a)) {
            return (k) hVar.adjustInto(this, j4);
        }
        qa.a aVar = qa.a.OFFSET_SECONDS;
        g gVar = this.f44126b;
        return hVar == aVar ? k0(gVar, q.j(((qa.a) hVar).checkValidIntValue(j4))) : k0(gVar.p0(j4, hVar), this.f44127c);
    }

    @Override // qa.f
    public final qa.d adjustInto(qa.d dVar) {
        return dVar.r0(this.f44126b.t0(), qa.a.NANO_OF_DAY).r0(this.f44127c.f44150c, qa.a.OFFSET_SECONDS);
    }

    @Override // java.lang.Comparable
    public final int compareTo(k kVar) {
        k kVar2 = kVar;
        boolean zEquals = this.f44127c.equals(kVar2.f44127c);
        g gVar = this.f44126b;
        g gVar2 = kVar2.f44126b;
        if (zEquals) {
            return gVar.compareTo(gVar2);
        }
        int iF = com.google.gson.internal.c.f(j0(), kVar2.j0());
        return iF == 0 ? gVar.compareTo(gVar2) : iF;
    }

    @Override // qa.d
    /* renamed from: e */
    public final qa.d s0(e eVar) {
        return (k) eVar.adjustInto(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f44126b.equals(kVar.f44126b) && this.f44127c.equals(kVar.f44127c)) {
                return true;
            }
        }
        return false;
    }

    @Override // qa.e
    public final long getLong(qa.h hVar) {
        return hVar instanceof qa.a ? hVar == qa.a.OFFSET_SECONDS ? this.f44127c.f44150c : this.f44126b.getLong(hVar) : hVar.getFrom(this);
    }

    public final int hashCode() {
        return this.f44126b.hashCode() ^ this.f44127c.f44150c;
    }

    @Override // qa.d
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public final k q(long j4, qa.k kVar) {
        return kVar instanceof qa.b ? k0(this.f44126b.q(j4, kVar), this.f44127c) : (k) kVar.addTo(this, j4);
    }

    @Override // qa.e
    public final boolean isSupported(qa.h hVar) {
        return hVar instanceof qa.a ? hVar.isTimeBased() || hVar == qa.a.OFFSET_SECONDS : hVar != null && hVar.isSupportedBy(this);
    }

    public final long j0() {
        return this.f44126b.t0() - (this.f44127c.f44150c * 1000000000);
    }

    public final k k0(g gVar, q qVar) {
        return (this.f44126b == gVar && this.f44127c.equals(qVar)) ? this : new k(gVar, qVar);
    }

    @Override // I9.g, qa.e
    public final <R> R query(qa.j<R> jVar) {
        if (jVar == qa.i.f45477c) {
            return (R) qa.b.NANOS;
        }
        if (jVar == qa.i.f45479e || jVar == qa.i.f45478d) {
            return (R) this.f44127c;
        }
        if (jVar == qa.i.f45481g) {
            return (R) this.f44126b;
        }
        if (jVar == qa.i.f45476b || jVar == qa.i.f45480f || jVar == qa.i.f45475a) {
            return null;
        }
        return (R) super.query(jVar);
    }

    @Override // I9.g, qa.e
    public final qa.m range(qa.h hVar) {
        return hVar instanceof qa.a ? hVar == qa.a.OFFSET_SECONDS ? hVar.range() : this.f44126b.range(hVar) : hVar.rangeRefinedBy(this);
    }

    @Override // qa.d
    public final long t(qa.d dVar, qa.b bVar) {
        k kVar;
        if (dVar instanceof k) {
            kVar = (k) dVar;
        } else {
            try {
                kVar = new k(g.k0(dVar), q.g(dVar));
            } catch (ma.a unused) {
                throw new ma.a("Unable to obtain OffsetTime from TemporalAccessor: " + dVar + ", type " + dVar.getClass().getName());
            }
        }
        if (!androidx.work.s.n(bVar)) {
            return bVar.between(this, kVar);
        }
        long jJ0 = kVar.j0() - j0();
        switch (a.f44128a[bVar.ordinal()]) {
            case 1:
                return jJ0;
            case 2:
                return jJ0 / 1000;
            case 3:
                return jJ0 / 1000000;
            case 4:
                return jJ0 / 1000000000;
            case 5:
                return jJ0 / 60000000000L;
            case 6:
                return jJ0 / 3600000000000L;
            case 7:
                return jJ0 / 43200000000000L;
            default:
                throw new qa.l("Unsupported unit: " + bVar);
        }
    }

    public final String toString() {
        return this.f44126b.toString() + this.f44127c.f44151d;
    }

    @Override // qa.d
    public final qa.d u(long j4, qa.k kVar) {
        return j4 == Long.MIN_VALUE ? q(Long.MAX_VALUE, kVar).q(1L, kVar) : q(-j4, kVar);
    }
}

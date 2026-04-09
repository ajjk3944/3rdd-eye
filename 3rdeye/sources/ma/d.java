package ma;

import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* compiled from: Instant.java */
/* loaded from: classes3.dex */
public final class d extends I9.g implements qa.d, qa.f, Comparable<d>, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final d f44090d = new d(0, 0);

    /* renamed from: b, reason: collision with root package name */
    public final long f44091b;

    /* renamed from: c, reason: collision with root package name */
    public final int f44092c;

    /* compiled from: Instant.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44093a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f44094b;

        static {
            int[] iArr = new int[qa.b.values().length];
            f44094b = iArr;
            try {
                iArr[qa.b.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44094b[qa.b.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44094b[qa.b.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44094b[qa.b.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44094b[qa.b.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44094b[qa.b.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f44094b[qa.b.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f44094b[qa.b.DAYS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[qa.a.values().length];
            f44093a = iArr2;
            try {
                iArr2[qa.a.NANO_OF_SECOND.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f44093a[qa.a.MICRO_OF_SECOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f44093a[qa.a.MILLI_OF_SECOND.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f44093a[qa.a.INSTANT_SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        m0(-31557014167219200L, 0L);
        m0(31556889864403199L, 999999999L);
    }

    public d(long j4, int i) {
        this.f44091b = j4;
        this.f44092c = i;
    }

    public static d j0(int i, long j4) {
        if ((i | j4) == 0) {
            return f44090d;
        }
        if (j4 < -31557014167219200L || j4 > 31556889864403199L) {
            throw new ma.a("Instant exceeds minimum or maximum instant");
        }
        return new d(j4, i);
    }

    public static d k0(qa.e eVar) {
        try {
            return m0(eVar.getLong(qa.a.INSTANT_SECONDS), eVar.get(qa.a.NANO_OF_SECOND));
        } catch (ma.a e4) {
            throw new ma.a("Unable to obtain Instant from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName(), e4);
        }
    }

    public static d l0(long j4) {
        return j0(com.google.gson.internal.c.p(1000, j4) * 1000000, com.google.gson.internal.c.o(j4, 1000L));
    }

    public static d m0(long j4, long j10) {
        return j0(com.google.gson.internal.c.p(1000000000, j10), com.google.gson.internal.c.B(j4, com.google.gson.internal.c.o(j10, 1000000000L)));
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new m((byte) 2, this);
    }

    @Override // qa.d
    /* renamed from: D */
    public final qa.d r0(long j4, qa.h hVar) {
        if (!(hVar instanceof qa.a)) {
            return (d) hVar.adjustInto(this, j4);
        }
        qa.a aVar = (qa.a) hVar;
        aVar.checkValidValue(j4);
        int i = a.f44093a[aVar.ordinal()];
        int i10 = this.f44092c;
        long j10 = this.f44091b;
        if (i != 1) {
            if (i == 2) {
                int i11 = ((int) j4) * 1000;
                if (i11 != i10) {
                    return j0(i11, j10);
                }
            } else if (i == 3) {
                int i12 = ((int) j4) * 1000000;
                if (i12 != i10) {
                    return j0(i12, j10);
                }
            } else {
                if (i != 4) {
                    throw new qa.l(com.google.android.gms.measurement.internal.a.f("Unsupported field: ", hVar));
                }
                if (j4 != j10) {
                    return j0(i10, j4);
                }
            }
        } else if (j4 != i10) {
            return j0((int) j4, j10);
        }
        return this;
    }

    @Override // qa.f
    public final qa.d adjustInto(qa.d dVar) {
        return dVar.r0(this.f44091b, qa.a.INSTANT_SECONDS).r0(this.f44092c, qa.a.NANO_OF_SECOND);
    }

    @Override // qa.d
    /* renamed from: e */
    public final qa.d s0(e eVar) {
        return (d) eVar.adjustInto(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f44091b == dVar.f44091b && this.f44092c == dVar.f44092c) {
                return true;
            }
        }
        return false;
    }

    @Override // I9.g, qa.e
    public final int get(qa.h hVar) {
        if (!(hVar instanceof qa.a)) {
            return super.range(hVar).a(hVar.getFrom(this), hVar);
        }
        int i = a.f44093a[((qa.a) hVar).ordinal()];
        int i10 = this.f44092c;
        if (i == 1) {
            return i10;
        }
        if (i == 2) {
            return i10 / 1000;
        }
        if (i == 3) {
            return i10 / 1000000;
        }
        throw new qa.l(com.google.android.gms.measurement.internal.a.f("Unsupported field: ", hVar));
    }

    @Override // qa.e
    public final long getLong(qa.h hVar) {
        int i;
        if (!(hVar instanceof qa.a)) {
            return hVar.getFrom(this);
        }
        int i10 = a.f44093a[((qa.a) hVar).ordinal()];
        int i11 = this.f44092c;
        if (i10 == 1) {
            return i11;
        }
        if (i10 == 2) {
            i = i11 / 1000;
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    return this.f44091b;
                }
                throw new qa.l(com.google.android.gms.measurement.internal.a.f("Unsupported field: ", hVar));
            }
            i = i11 / 1000000;
        }
        return i;
    }

    public final int hashCode() {
        long j4 = this.f44091b;
        return (this.f44092c * 51) + ((int) (j4 ^ (j4 >>> 32)));
    }

    @Override // java.lang.Comparable
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public final int compareTo(d dVar) {
        int iF = com.google.gson.internal.c.f(this.f44091b, dVar.f44091b);
        return iF != 0 ? iF : this.f44092c - dVar.f44092c;
    }

    @Override // qa.e
    public final boolean isSupported(qa.h hVar) {
        return hVar instanceof qa.a ? hVar == qa.a.INSTANT_SECONDS || hVar == qa.a.NANO_OF_SECOND || hVar == qa.a.MICRO_OF_SECOND || hVar == qa.a.MILLI_OF_SECOND : hVar != null && hVar.isSupportedBy(this);
    }

    public final d n0(long j4, long j10) {
        if ((j4 | j10) == 0) {
            return this;
        }
        return m0(com.google.gson.internal.c.B(com.google.gson.internal.c.B(this.f44091b, j4), j10 / 1000000000), this.f44092c + (j10 % 1000000000));
    }

    @Override // qa.d
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public final d q(long j4, qa.k kVar) {
        if (!(kVar instanceof qa.b)) {
            return (d) kVar.addTo(this, j4);
        }
        switch (a.f44094b[((qa.b) kVar).ordinal()]) {
            case 1:
                return n0(0L, j4);
            case 2:
                return n0(j4 / 1000000, (j4 % 1000000) * 1000);
            case 3:
                return n0(j4 / 1000, (j4 % 1000) * 1000000);
            case 4:
                return n0(j4, 0L);
            case 5:
                return n0(com.google.gson.internal.c.D(60, j4), 0L);
            case 6:
                return n0(com.google.gson.internal.c.D(3600, j4), 0L);
            case 7:
                return n0(com.google.gson.internal.c.D(43200, j4), 0L);
            case 8:
                return n0(com.google.gson.internal.c.D(86400, j4), 0L);
            default:
                throw new qa.l("Unsupported unit: " + kVar);
        }
    }

    public final long p0(d dVar) {
        long jF = com.google.gson.internal.c.F(dVar.f44091b, this.f44091b);
        long j4 = dVar.f44092c - this.f44092c;
        return (jF <= 0 || j4 >= 0) ? (jF >= 0 || j4 <= 0) ? jF : jF + 1 : jF - 1;
    }

    public final long q0() {
        long j4 = this.f44091b;
        int i = this.f44092c;
        return j4 >= 0 ? com.google.gson.internal.c.B(com.google.gson.internal.c.E(j4, 1000L), i / 1000000) : com.google.gson.internal.c.F(com.google.gson.internal.c.E(j4 + 1, 1000L), 1000 - (i / 1000000));
    }

    @Override // I9.g, qa.e
    public final <R> R query(qa.j<R> jVar) {
        if (jVar == qa.i.f45477c) {
            return (R) qa.b.NANOS;
        }
        if (jVar == qa.i.f45480f || jVar == qa.i.f45481g || jVar == qa.i.f45476b || jVar == qa.i.f45475a || jVar == qa.i.f45478d || jVar == qa.i.f45479e) {
            return null;
        }
        return jVar.a(this);
    }

    @Override // qa.d
    public final long t(qa.d dVar, qa.b bVar) {
        d dVarK0 = k0(dVar);
        if (!androidx.work.s.n(bVar)) {
            return bVar.between(this, dVarK0);
        }
        int i = a.f44094b[bVar.ordinal()];
        int i10 = this.f44092c;
        long j4 = this.f44091b;
        switch (i) {
            case 1:
                return com.google.gson.internal.c.B(com.google.gson.internal.c.D(1000000000, com.google.gson.internal.c.F(dVarK0.f44091b, j4)), dVarK0.f44092c - i10);
            case 2:
                return com.google.gson.internal.c.B(com.google.gson.internal.c.D(1000000000, com.google.gson.internal.c.F(dVarK0.f44091b, j4)), dVarK0.f44092c - i10) / 1000;
            case 3:
                return com.google.gson.internal.c.F(dVarK0.q0(), q0());
            case 4:
                return p0(dVarK0);
            case 5:
                return p0(dVarK0) / 60;
            case 6:
                return p0(dVarK0) / 3600;
            case 7:
                return p0(dVarK0) / 43200;
            case 8:
                return p0(dVarK0) / 86400;
            default:
                throw new qa.l("Unsupported unit: " + bVar);
        }
    }

    public final String toString() {
        return oa.a.f44892f.a(this);
    }

    @Override // qa.d
    public final qa.d u(long j4, qa.k kVar) {
        return j4 == Long.MIN_VALUE ? q(Long.MAX_VALUE, kVar).q(1L, kVar) : q(-j4, kVar);
    }
}

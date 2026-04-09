package ma;

import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Locale;

/* compiled from: Year.java */
/* loaded from: classes3.dex */
public final class n extends I9.g implements qa.d, qa.f, Comparable<n>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f44136c = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f44137b;

    /* compiled from: Year.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44138a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f44139b;

        static {
            int[] iArr = new int[qa.b.values().length];
            f44139b = iArr;
            try {
                iArr[qa.b.YEARS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44139b[qa.b.DECADES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44139b[qa.b.CENTURIES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44139b[qa.b.MILLENNIA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44139b[qa.b.ERAS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[qa.a.values().length];
            f44138a = iArr2;
            try {
                iArr2[qa.a.YEAR_OF_ERA.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f44138a[qa.a.YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f44138a[qa.a.ERA.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static {
        oa.b bVar = new oa.b();
        bVar.i(qa.a.YEAR, 4, 10, oa.k.EXCEEDS_PAD);
        bVar.l(Locale.getDefault());
    }

    public n(int i) {
        this.f44137b = i;
    }

    public static n i0(int i) {
        qa.a.YEAR.checkValidValue(i);
        return new n(i);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new m((byte) 67, this);
    }

    @Override // qa.f
    public final qa.d adjustInto(qa.d dVar) {
        if (!na.g.f(dVar).equals(na.l.f44466d)) {
            throw new ma.a("Adjustment only supported on ISO date-time");
        }
        return dVar.r0(this.f44137b, qa.a.YEAR);
    }

    @Override // java.lang.Comparable
    public final int compareTo(n nVar) {
        return this.f44137b - nVar.f44137b;
    }

    @Override // qa.d
    /* renamed from: e */
    public final qa.d s0(e eVar) {
        return (n) eVar.adjustInto(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            if (this.f44137b == ((n) obj).f44137b) {
                return true;
            }
        }
        return false;
    }

    @Override // I9.g, qa.e
    public final int get(qa.h hVar) {
        return range(hVar).a(getLong(hVar), hVar);
    }

    @Override // qa.e
    public final long getLong(qa.h hVar) {
        if (!(hVar instanceof qa.a)) {
            return hVar.getFrom(this);
        }
        int i = a.f44138a[((qa.a) hVar).ordinal()];
        int i10 = this.f44137b;
        if (i == 1) {
            if (i10 < 1) {
                i10 = 1 - i10;
            }
            return i10;
        }
        if (i == 2) {
            return i10;
        }
        if (i == 3) {
            return i10 < 1 ? 0 : 1;
        }
        throw new qa.l(com.google.android.gms.measurement.internal.a.f("Unsupported field: ", hVar));
    }

    public final int hashCode() {
        return this.f44137b;
    }

    @Override // qa.e
    public final boolean isSupported(qa.h hVar) {
        return hVar instanceof qa.a ? hVar == qa.a.YEAR || hVar == qa.a.YEAR_OF_ERA || hVar == qa.a.ERA : hVar != null && hVar.isSupportedBy(this);
    }

    @Override // qa.d
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public final n q(long j4, qa.k kVar) {
        if (!(kVar instanceof qa.b)) {
            return (n) kVar.addTo(this, j4);
        }
        int i = a.f44139b[((qa.b) kVar).ordinal()];
        if (i == 1) {
            return k0(j4);
        }
        if (i == 2) {
            return k0(com.google.gson.internal.c.D(10, j4));
        }
        if (i == 3) {
            return k0(com.google.gson.internal.c.D(100, j4));
        }
        if (i == 4) {
            return k0(com.google.gson.internal.c.D(1000, j4));
        }
        if (i == 5) {
            qa.a aVar = qa.a.ERA;
            return p0(com.google.gson.internal.c.B(getLong(aVar), j4), aVar);
        }
        throw new qa.l("Unsupported unit: " + kVar);
    }

    public final n k0(long j4) {
        return j4 == 0 ? this : i0(qa.a.YEAR.checkValidIntValue(this.f44137b + j4));
    }

    @Override // qa.d
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public final n r0(long j4, qa.h hVar) {
        if (!(hVar instanceof qa.a)) {
            return (n) hVar.adjustInto(this, j4);
        }
        qa.a aVar = (qa.a) hVar;
        aVar.checkValidValue(j4);
        int i = a.f44138a[aVar.ordinal()];
        int i10 = this.f44137b;
        if (i == 1) {
            if (i10 < 1) {
                j4 = 1 - j4;
            }
            return i0((int) j4);
        }
        if (i == 2) {
            return i0((int) j4);
        }
        if (i == 3) {
            return getLong(qa.a.ERA) == j4 ? this : i0(1 - i10);
        }
        throw new qa.l(com.google.android.gms.measurement.internal.a.f("Unsupported field: ", hVar));
    }

    @Override // I9.g, qa.e
    public final <R> R query(qa.j<R> jVar) {
        if (jVar == qa.i.f45476b) {
            return (R) na.l.f44466d;
        }
        if (jVar == qa.i.f45477c) {
            return (R) qa.b.YEARS;
        }
        if (jVar == qa.i.f45480f || jVar == qa.i.f45481g || jVar == qa.i.f45478d || jVar == qa.i.f45475a || jVar == qa.i.f45479e) {
            return null;
        }
        return (R) super.query(jVar);
    }

    @Override // I9.g, qa.e
    public final qa.m range(qa.h hVar) {
        if (hVar == qa.a.YEAR_OF_ERA) {
            return qa.m.c(1L, this.f44137b <= 0 ? 1000000000L : 999999999L);
        }
        return super.range(hVar);
    }

    @Override // qa.d
    public final long t(qa.d dVar, qa.b bVar) {
        n nVarI0;
        if (dVar instanceof n) {
            nVarI0 = (n) dVar;
        } else {
            try {
                if (!na.l.f44466d.equals(na.g.f(dVar))) {
                    dVar = e.t0(dVar);
                }
                nVarI0 = i0(dVar.get(qa.a.YEAR));
            } catch (ma.a unused) {
                throw new ma.a("Unable to obtain Year from TemporalAccessor: " + dVar + ", type " + dVar.getClass().getName());
            }
        }
        if (!androidx.work.s.n(bVar)) {
            return bVar.between(this, nVarI0);
        }
        long j4 = nVarI0.f44137b - this.f44137b;
        int i = a.f44139b[bVar.ordinal()];
        if (i == 1) {
            return j4;
        }
        if (i == 2) {
            return j4 / 10;
        }
        if (i == 3) {
            return j4 / 100;
        }
        if (i == 4) {
            return j4 / 1000;
        }
        if (i == 5) {
            qa.a aVar = qa.a.ERA;
            return nVarI0.getLong(aVar) - getLong(aVar);
        }
        throw new qa.l("Unsupported unit: " + bVar);
    }

    public final String toString() {
        return Integer.toString(this.f44137b);
    }

    @Override // qa.d
    public final qa.d u(long j4, qa.k kVar) {
        return j4 == Long.MIN_VALUE ? q(Long.MAX_VALUE, kVar).q(1L, kVar) : q(-j4, kVar);
    }
}

package ma;

import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Locale;

/* compiled from: YearMonth.java */
/* loaded from: classes3.dex */
public final class o extends I9.g implements qa.d, qa.f, Comparable<o>, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f44140d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f44141b;

    /* renamed from: c, reason: collision with root package name */
    public final int f44142c;

    /* compiled from: YearMonth.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44143a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f44144b;

        static {
            int[] iArr = new int[qa.b.values().length];
            f44144b = iArr;
            try {
                iArr[qa.b.MONTHS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44144b[qa.b.YEARS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44144b[qa.b.DECADES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44144b[qa.b.CENTURIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44144b[qa.b.MILLENNIA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44144b[qa.b.ERAS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[qa.a.values().length];
            f44143a = iArr2;
            try {
                iArr2[qa.a.MONTH_OF_YEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f44143a[qa.a.PROLEPTIC_MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f44143a[qa.a.YEAR_OF_ERA.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f44143a[qa.a.YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f44143a[qa.a.ERA.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    static {
        oa.b bVar = new oa.b();
        bVar.i(qa.a.YEAR, 4, 10, oa.k.EXCEEDS_PAD);
        bVar.c('-');
        bVar.h(qa.a.MONTH_OF_YEAR, 2);
        bVar.l(Locale.getDefault());
    }

    public o(int i, int i10) {
        this.f44141b = i;
        this.f44142c = i10;
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new m((byte) 68, this);
    }

    @Override // qa.f
    public final qa.d adjustInto(qa.d dVar) {
        if (!na.g.f(dVar).equals(na.l.f44466d)) {
            throw new ma.a("Adjustment only supported on ISO date-time");
        }
        return dVar.r0(i0(), qa.a.PROLEPTIC_MONTH);
    }

    @Override // java.lang.Comparable
    public final int compareTo(o oVar) {
        o oVar2 = oVar;
        int i = this.f44141b - oVar2.f44141b;
        return i == 0 ? this.f44142c - oVar2.f44142c : i;
    }

    @Override // qa.d
    /* renamed from: e */
    public final qa.d s0(e eVar) {
        return (o) eVar.adjustInto(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f44141b == oVar.f44141b && this.f44142c == oVar.f44142c) {
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
        int i = a.f44143a[((qa.a) hVar).ordinal()];
        if (i == 1) {
            return this.f44142c;
        }
        if (i == 2) {
            return i0();
        }
        int i10 = this.f44141b;
        if (i == 3) {
            if (i10 < 1) {
                i10 = 1 - i10;
            }
            return i10;
        }
        if (i == 4) {
            return i10;
        }
        if (i == 5) {
            return i10 < 1 ? 0 : 1;
        }
        throw new qa.l(com.google.android.gms.measurement.internal.a.f("Unsupported field: ", hVar));
    }

    public final int hashCode() {
        return (this.f44142c << 27) ^ this.f44141b;
    }

    public final long i0() {
        return (this.f44141b * 12) + (this.f44142c - 1);
    }

    @Override // qa.e
    public final boolean isSupported(qa.h hVar) {
        return hVar instanceof qa.a ? hVar == qa.a.YEAR || hVar == qa.a.MONTH_OF_YEAR || hVar == qa.a.PROLEPTIC_MONTH || hVar == qa.a.YEAR_OF_ERA || hVar == qa.a.ERA : hVar != null && hVar.isSupportedBy(this);
    }

    @Override // qa.d
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public final o q(long j4, qa.k kVar) {
        if (!(kVar instanceof qa.b)) {
            return (o) kVar.addTo(this, j4);
        }
        switch (a.f44144b[((qa.b) kVar).ordinal()]) {
            case 1:
                return k0(j4);
            case 2:
                return l0(j4);
            case 3:
                return l0(com.google.gson.internal.c.D(10, j4));
            case 4:
                return l0(com.google.gson.internal.c.D(100, j4));
            case 5:
                return l0(com.google.gson.internal.c.D(1000, j4));
            case 6:
                qa.a aVar = qa.a.ERA;
                return p0(com.google.gson.internal.c.B(getLong(aVar), j4), aVar);
            default:
                throw new qa.l("Unsupported unit: " + kVar);
        }
    }

    public final o k0(long j4) {
        if (j4 == 0) {
            return this;
        }
        long j10 = (this.f44141b * 12) + (this.f44142c - 1) + j4;
        return m0(qa.a.YEAR.checkValidIntValue(com.google.gson.internal.c.o(j10, 12L)), com.google.gson.internal.c.p(12, j10) + 1);
    }

    public final o l0(long j4) {
        return j4 == 0 ? this : m0(qa.a.YEAR.checkValidIntValue(this.f44141b + j4), this.f44142c);
    }

    public final o m0(int i, int i10) {
        return (this.f44141b == i && this.f44142c == i10) ? this : new o(i, i10);
    }

    @Override // qa.d
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public final o r0(long j4, qa.h hVar) {
        if (!(hVar instanceof qa.a)) {
            return (o) hVar.adjustInto(this, j4);
        }
        qa.a aVar = (qa.a) hVar;
        aVar.checkValidValue(j4);
        int i = a.f44143a[aVar.ordinal()];
        int i10 = this.f44141b;
        if (i == 1) {
            int i11 = (int) j4;
            qa.a.MONTH_OF_YEAR.checkValidValue(i11);
            return m0(i10, i11);
        }
        if (i == 2) {
            return k0(j4 - getLong(qa.a.PROLEPTIC_MONTH));
        }
        int i12 = this.f44142c;
        if (i == 3) {
            if (i10 < 1) {
                j4 = 1 - j4;
            }
            int i13 = (int) j4;
            qa.a.YEAR.checkValidValue(i13);
            return m0(i13, i12);
        }
        if (i == 4) {
            int i14 = (int) j4;
            qa.a.YEAR.checkValidValue(i14);
            return m0(i14, i12);
        }
        if (i != 5) {
            throw new qa.l(com.google.android.gms.measurement.internal.a.f("Unsupported field: ", hVar));
        }
        if (getLong(qa.a.ERA) == j4) {
            return this;
        }
        int i15 = 1 - i10;
        qa.a.YEAR.checkValidValue(i15);
        return m0(i15, i12);
    }

    @Override // I9.g, qa.e
    public final <R> R query(qa.j<R> jVar) {
        if (jVar == qa.i.f45476b) {
            return (R) na.l.f44466d;
        }
        if (jVar == qa.i.f45477c) {
            return (R) qa.b.MONTHS;
        }
        if (jVar == qa.i.f45480f || jVar == qa.i.f45481g || jVar == qa.i.f45478d || jVar == qa.i.f45475a || jVar == qa.i.f45479e) {
            return null;
        }
        return (R) super.query(jVar);
    }

    @Override // I9.g, qa.e
    public final qa.m range(qa.h hVar) {
        if (hVar == qa.a.YEAR_OF_ERA) {
            return qa.m.c(1L, this.f44141b <= 0 ? 1000000000L : 999999999L);
        }
        return super.range(hVar);
    }

    @Override // qa.d
    public final long t(qa.d dVar, qa.b bVar) {
        o oVar;
        if (dVar instanceof o) {
            oVar = (o) dVar;
        } else {
            try {
                if (!na.l.f44466d.equals(na.g.f(dVar))) {
                    dVar = e.t0(dVar);
                }
                qa.a aVar = qa.a.YEAR;
                int i = dVar.get(aVar);
                qa.a aVar2 = qa.a.MONTH_OF_YEAR;
                int i10 = dVar.get(aVar2);
                aVar.checkValidValue(i);
                aVar2.checkValidValue(i10);
                oVar = new o(i, i10);
            } catch (ma.a unused) {
                throw new ma.a("Unable to obtain YearMonth from TemporalAccessor: " + dVar + ", type " + dVar.getClass().getName());
            }
        }
        if (!androidx.work.s.n(bVar)) {
            return bVar.between(this, oVar);
        }
        long jI0 = oVar.i0() - i0();
        switch (a.f44144b[bVar.ordinal()]) {
            case 1:
                return jI0;
            case 2:
                return jI0 / 12;
            case 3:
                return jI0 / 120;
            case 4:
                return jI0 / 1200;
            case 5:
                return jI0 / 12000;
            case 6:
                qa.a aVar3 = qa.a.ERA;
                return oVar.getLong(aVar3) - getLong(aVar3);
            default:
                throw new qa.l("Unsupported unit: " + bVar);
        }
    }

    public final String toString() {
        int i = this.f44141b;
        int iAbs = Math.abs(i);
        StringBuilder sb = new StringBuilder(9);
        if (iAbs >= 1000) {
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        int i10 = this.f44142c;
        sb.append(i10 < 10 ? "-0" : "-");
        sb.append(i10);
        return sb.toString();
    }

    @Override // qa.d
    public final qa.d u(long j4, qa.k kVar) {
        return j4 == Long.MIN_VALUE ? q(Long.MAX_VALUE, kVar).q(1L, kVar) : q(-j4, kVar);
    }
}

package ma;

import g0.C4356c;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* compiled from: LocalDate.java */
/* loaded from: classes3.dex */
public final class e extends na.b implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final e f44095f = C0(-999999999, 1, 1);

    /* renamed from: g, reason: collision with root package name */
    public static final e f44096g = C0(999999999, 12, 31);

    /* renamed from: c, reason: collision with root package name */
    public final int f44097c;

    /* renamed from: d, reason: collision with root package name */
    public final short f44098d;

    /* renamed from: e, reason: collision with root package name */
    public final short f44099e;

    /* compiled from: LocalDate.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44100a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f44101b;

        static {
            int[] iArr = new int[qa.b.values().length];
            f44101b = iArr;
            try {
                iArr[qa.b.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44101b[qa.b.WEEKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44101b[qa.b.MONTHS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44101b[qa.b.YEARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44101b[qa.b.DECADES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44101b[qa.b.CENTURIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f44101b[qa.b.MILLENNIA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f44101b[qa.b.ERAS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[qa.a.values().length];
            f44100a = iArr2;
            try {
                iArr2[qa.a.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f44100a[qa.a.DAY_OF_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f44100a[qa.a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f44100a[qa.a.YEAR_OF_ERA.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f44100a[qa.a.DAY_OF_WEEK.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f44100a[qa.a.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f44100a[qa.a.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f44100a[qa.a.EPOCH_DAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f44100a[qa.a.ALIGNED_WEEK_OF_YEAR.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f44100a[qa.a.MONTH_OF_YEAR.ordinal()] = 10;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f44100a[qa.a.PROLEPTIC_MONTH.ordinal()] = 11;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f44100a[qa.a.YEAR.ordinal()] = 12;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f44100a[qa.a.ERA.ordinal()] = 13;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    public e(int i, int i10, int i11) {
        this.f44097c = i;
        this.f44098d = (short) i10;
        this.f44099e = (short) i11;
    }

    public static e C0(int i, int i10, int i11) {
        qa.a.YEAR.checkValidValue(i);
        qa.a.MONTH_OF_YEAR.checkValidValue(i10);
        qa.a.DAY_OF_MONTH.checkValidValue(i11);
        return s0(i, h.of(i10), i11);
    }

    public static e D0(long j4) {
        long j10;
        qa.a.EPOCH_DAY.checkValidValue(j4);
        long j11 = 719468 + j4;
        if (j11 < 0) {
            long j12 = ((j4 + 719469) / 146097) - 1;
            j10 = j12 * 400;
            j11 += (-j12) * 146097;
        } else {
            j10 = 0;
        }
        long j13 = ((j11 * 400) + 591) / 146097;
        long j14 = j11 - ((j13 / 400) + (((j13 / 4) + (j13 * 365)) - (j13 / 100)));
        if (j14 < 0) {
            j13--;
            j14 = j11 - ((j13 / 400) + (((j13 / 4) + (365 * j13)) - (j13 / 100)));
        }
        int i = (int) j14;
        int i10 = ((i * 5) + 2) / 153;
        return new e(qa.a.YEAR.checkValidIntValue(j13 + j10 + (i10 / 10)), ((i10 + 2) % 12) + 1, (i - (((i10 * 306) + 5) / 10)) + 1);
    }

    public static e J0(int i, int i10, int i11) {
        if (i10 == 2) {
            na.l.f44466d.getClass();
            i11 = Math.min(i11, na.l.m((long) i) ? 29 : 28);
        } else if (i10 == 4 || i10 == 6 || i10 == 9 || i10 == 11) {
            i11 = Math.min(i11, 30);
        }
        return C0(i, i10, i11);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static e s0(int i, h hVar, int i10) {
        if (i10 > 28) {
            na.l.f44466d.getClass();
            if (i10 > hVar.length(na.l.m(i))) {
                if (i10 == 29) {
                    throw new ma.a(C4356c.i(i, "Invalid date 'February 29' as '", "' is not a leap year"));
                }
                throw new ma.a("Invalid date '" + hVar.name() + " " + i10 + "'");
            }
        }
        return new e(i, hVar.getValue(), i10);
    }

    public static e t0(qa.e eVar) {
        e eVar2 = (e) eVar.query(qa.i.f45480f);
        if (eVar2 != null) {
            return eVar2;
        }
        throw new ma.a("Unable to obtain LocalDate from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
    }

    private Object writeReplace() {
        return new m((byte) 3, this);
    }

    public final int A0() {
        short s10 = this.f44098d;
        return s10 != 2 ? (s10 == 4 || s10 == 6 || s10 == 9 || s10 == 11) ? 30 : 31 : z0() ? 29 : 28;
    }

    public final long B0(e eVar) {
        return (((eVar.x0() * 32) + eVar.f44099e) - ((x0() * 32) + this.f44099e)) / 32;
    }

    @Override // na.b, qa.d
    /* renamed from: E0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final e q(long j4, qa.k kVar) {
        if (!(kVar instanceof qa.b)) {
            return (e) kVar.addTo(this, j4);
        }
        switch (a.f44101b[((qa.b) kVar).ordinal()]) {
            case 1:
                return F0(j4);
            case 2:
                return H0(j4);
            case 3:
                return G0(j4);
            case 4:
                return I0(j4);
            case 5:
                return I0(com.google.gson.internal.c.D(10, j4));
            case 6:
                return I0(com.google.gson.internal.c.D(100, j4));
            case 7:
                return I0(com.google.gson.internal.c.D(1000, j4));
            case 8:
                qa.a aVar = qa.a.ERA;
                return D(com.google.gson.internal.c.B(getLong(aVar), j4), aVar);
            default:
                throw new qa.l("Unsupported unit: " + kVar);
        }
    }

    public final e F0(long j4) {
        return j4 == 0 ? this : D0(com.google.gson.internal.c.B(o0(), j4));
    }

    public final e G0(long j4) {
        if (j4 == 0) {
            return this;
        }
        long j10 = (this.f44097c * 12) + (this.f44098d - 1) + j4;
        return J0(qa.a.YEAR.checkValidIntValue(com.google.gson.internal.c.o(j10, 12L)), com.google.gson.internal.c.p(12, j10) + 1, this.f44099e);
    }

    public final e H0(long j4) {
        return F0(com.google.gson.internal.c.D(7, j4));
    }

    public final e I0(long j4) {
        return j4 == 0 ? this : J0(qa.a.YEAR.checkValidIntValue(this.f44097c + j4), this.f44098d, this.f44099e);
    }

    @Override // na.b
    /* renamed from: K0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final e r0(long j4, qa.h hVar) {
        if (!(hVar instanceof qa.a)) {
            return (e) hVar.adjustInto(this, j4);
        }
        qa.a aVar = (qa.a) hVar;
        aVar.checkValidValue(j4);
        int i = a.f44100a[aVar.ordinal()];
        short s10 = this.f44099e;
        short s11 = this.f44098d;
        int i10 = this.f44097c;
        switch (i) {
            case 1:
                int i11 = (int) j4;
                if (s10 != i11) {
                    return C0(i10, s11, i11);
                }
                return this;
            case 2:
                return M0((int) j4);
            case 3:
                return H0(j4 - getLong(qa.a.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (i10 < 1) {
                    j4 = 1 - j4;
                }
                return N0((int) j4);
            case 5:
                return F0(j4 - v0().getValue());
            case 6:
                return F0(j4 - getLong(qa.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return F0(j4 - getLong(qa.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return D0(j4);
            case 9:
                return H0(j4 - getLong(qa.a.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i12 = (int) j4;
                if (s11 != i12) {
                    qa.a.MONTH_OF_YEAR.checkValidValue(i12);
                    return J0(i10, i12, s10);
                }
                return this;
            case 11:
                return G0(j4 - getLong(qa.a.PROLEPTIC_MONTH));
            case 12:
                return N0((int) j4);
            case 13:
                if (getLong(qa.a.ERA) != j4) {
                    return N0(1 - i10);
                }
                return this;
            default:
                throw new qa.l(com.google.android.gms.measurement.internal.a.f("Unsupported field: ", hVar));
        }
    }

    @Override // na.b
    /* renamed from: L0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final e s0(qa.f fVar) {
        return fVar instanceof e ? (e) fVar : (e) fVar.adjustInto(this);
    }

    public final e M0(int i) {
        if (w0() == i) {
            return this;
        }
        qa.a aVar = qa.a.YEAR;
        int i10 = this.f44097c;
        long j4 = i10;
        aVar.checkValidValue(j4);
        qa.a.DAY_OF_YEAR.checkValidValue(i);
        na.l.f44466d.getClass();
        boolean zM = na.l.m(j4);
        if (i == 366 && !zM) {
            throw new ma.a(C4356c.i(i10, "Invalid date 'DayOfYear 366' as '", "' is not a leap year"));
        }
        h hVarOf = h.of(((i - 1) / 31) + 1);
        if (i > (hVarOf.length(zM) + hVarOf.firstDayOfYear(zM)) - 1) {
            hVarOf = hVarOf.plus(1L);
        }
        return s0(i10, hVarOf, (i - hVarOf.firstDayOfYear(zM)) + 1);
    }

    public final e N0(int i) {
        if (this.f44097c == i) {
            return this;
        }
        qa.a.YEAR.checkValidValue(i);
        return J0(i, this.f44098d, this.f44099e);
    }

    @Override // na.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && r0((e) obj) == 0;
    }

    @Override // pa.a, I9.g, qa.e
    public final int get(qa.h hVar) {
        return hVar instanceof qa.a ? u0(hVar) : super.get(hVar);
    }

    @Override // pa.a, qa.e
    public final long getLong(qa.h hVar) {
        return hVar instanceof qa.a ? hVar == qa.a.EPOCH_DAY ? o0() : hVar == qa.a.PROLEPTIC_MONTH ? x0() : u0(hVar) : hVar.getFrom(this);
    }

    @Override // na.b
    public final int hashCode() {
        int i = this.f44097c;
        return (((i << 11) + (this.f44098d << 6)) + this.f44099e) ^ (i & (-2048));
    }

    @Override // na.b
    public final na.c i0(g gVar) {
        return f.u0(this, gVar);
    }

    @Override // na.b, java.lang.Comparable
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public final int compareTo(na.b bVar) {
        return bVar instanceof e ? r0((e) bVar) : super.compareTo(bVar);
    }

    @Override // na.b
    public final na.g k0() {
        return na.l.f44466d;
    }

    @Override // na.b
    /* renamed from: m0 */
    public final na.b u(long j4, qa.k kVar) {
        qa.b bVar = (qa.b) kVar;
        return j4 == Long.MIN_VALUE ? n0(Long.MAX_VALUE, bVar).n0(1L, bVar) : n0(-j4, bVar);
    }

    @Override // na.b
    public final long o0() {
        long j4 = this.f44097c;
        long j10 = this.f44098d;
        long j11 = 365 * j4;
        long j12 = (((367 * j10) - 362) / 12) + (j4 >= 0 ? ((j4 + 399) / 400) + (((3 + j4) / 4) - ((99 + j4) / 100)) + j11 : j11 - ((j4 / (-400)) + ((j4 / (-4)) - (j4 / (-100))))) + (this.f44099e - 1);
        if (j10 > 2) {
            j12 = !z0() ? j12 - 2 : j12 - 1;
        }
        return j12 - 719528;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // na.b, pa.a, I9.g, qa.e
    public final <R> R query(qa.j<R> jVar) {
        return jVar == qa.i.f45480f ? this : (R) super.query(jVar);
    }

    public final int r0(e eVar) {
        int i = this.f44097c - eVar.f44097c;
        if (i != 0) {
            return i;
        }
        int i10 = this.f44098d - eVar.f44098d;
        return i10 == 0 ? this.f44099e - eVar.f44099e : i10;
    }

    @Override // I9.g, qa.e
    public final qa.m range(qa.h hVar) {
        if (!(hVar instanceof qa.a)) {
            return hVar.rangeRefinedBy(this);
        }
        qa.a aVar = (qa.a) hVar;
        if (!aVar.isDateBased()) {
            throw new qa.l(com.google.android.gms.measurement.internal.a.f("Unsupported field: ", hVar));
        }
        int i = a.f44100a[aVar.ordinal()];
        if (i == 1) {
            return qa.m.c(1L, A0());
        }
        if (i == 2) {
            return qa.m.c(1L, z0() ? 366 : 365);
        }
        if (i != 3) {
            return i != 4 ? hVar.range() : this.f44097c <= 0 ? qa.m.c(1L, 1000000000L) : qa.m.c(1L, 999999999L);
        }
        return qa.m.c(1L, (h.of(this.f44098d) != h.FEBRUARY || z0()) ? 5L : 4L);
    }

    @Override // qa.d
    public final long t(qa.d dVar, qa.b bVar) {
        e eVarT0 = t0(dVar);
        if (!androidx.work.s.n(bVar)) {
            return bVar.between(this, eVarT0);
        }
        switch (a.f44101b[bVar.ordinal()]) {
            case 1:
                return eVarT0.o0() - o0();
            case 2:
                return (eVarT0.o0() - o0()) / 7;
            case 3:
                return B0(eVarT0);
            case 4:
                return B0(eVarT0) / 12;
            case 5:
                return B0(eVarT0) / 120;
            case 6:
                return B0(eVarT0) / 1200;
            case 7:
                return B0(eVarT0) / 12000;
            case 8:
                qa.a aVar = qa.a.ERA;
                return eVarT0.getLong(aVar) - getLong(aVar);
            default:
                throw new qa.l("Unsupported unit: " + bVar);
        }
    }

    @Override // na.b
    public final String toString() {
        int i = this.f44097c;
        int iAbs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        short s10 = this.f44098d;
        sb.append(s10 < 10 ? "-0" : "-");
        sb.append((int) s10);
        short s11 = this.f44099e;
        sb.append(s11 < 10 ? "-0" : "-");
        sb.append((int) s11);
        return sb.toString();
    }

    @Override // na.b, pa.a, qa.d
    public final qa.d u(long j4, qa.k kVar) {
        qa.b bVar = (qa.b) kVar;
        return j4 == Long.MIN_VALUE ? n0(Long.MAX_VALUE, bVar).n0(1L, bVar) : n0(-j4, bVar);
    }

    public final int u0(qa.h hVar) {
        int i = a.f44100a[((qa.a) hVar).ordinal()];
        short s10 = this.f44099e;
        int i10 = this.f44097c;
        switch (i) {
            case 1:
                return s10;
            case 2:
                return w0();
            case 3:
                return C4356c.c(s10, 1, 7, 1);
            case 4:
                return i10 >= 1 ? i10 : 1 - i10;
            case 5:
                return v0().getValue();
            case 6:
                return ((s10 - 1) % 7) + 1;
            case 7:
                return ((w0() - 1) % 7) + 1;
            case 8:
                throw new ma.a(com.google.android.gms.measurement.internal.a.f("Field too large for an int: ", hVar));
            case 9:
                return ((w0() - 1) / 7) + 1;
            case 10:
                return this.f44098d;
            case 11:
                throw new ma.a(com.google.android.gms.measurement.internal.a.f("Field too large for an int: ", hVar));
            case 12:
                return i10;
            case 13:
                return i10 >= 1 ? 1 : 0;
            default:
                throw new qa.l(com.google.android.gms.measurement.internal.a.f("Unsupported field: ", hVar));
        }
    }

    public final b v0() {
        return b.of(com.google.gson.internal.c.p(7, o0() + 3) + 1);
    }

    public final int w0() {
        return (h.of(this.f44098d).firstDayOfYear(z0()) + this.f44099e) - 1;
    }

    public final long x0() {
        return (this.f44097c * 12) + (this.f44098d - 1);
    }

    public final boolean y0(na.b bVar) {
        return bVar instanceof e ? r0((e) bVar) < 0 : o0() < bVar.o0();
    }

    public final boolean z0() {
        na.l lVar = na.l.f44466d;
        long j4 = this.f44097c;
        lVar.getClass();
        return na.l.m(j4);
    }
}

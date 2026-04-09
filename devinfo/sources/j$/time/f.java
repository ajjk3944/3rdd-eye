package j$.time;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class f implements j$.time.temporal.m, j$.time.temporal.o, j$.time.chrono.b, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final f f26116d = K(-999999999, 1, 1);

    /* renamed from: e, reason: collision with root package name */
    public static final f f26117e = K(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;

    /* renamed from: a, reason: collision with root package name */
    public final int f26118a;

    /* renamed from: b, reason: collision with root package name */
    public final short f26119b;

    /* renamed from: c, reason: collision with root package name */
    public final short f26120c;

    static {
        K(1970, 1, 1);
    }

    public static f K(int i4, int i10, int i11) {
        j$.time.temporal.a.YEAR.s(i4);
        j$.time.temporal.a.MONTH_OF_YEAR.s(i10);
        j$.time.temporal.a.DAY_OF_MONTH.s(i11);
        return D(i4, i10, i11);
    }

    public static f L(long j) {
        long j8;
        j$.time.temporal.a.EPOCH_DAY.s(j);
        long j9 = 719468 + j;
        if (j9 < 0) {
            long j10 = ((j + 719469) / 146097) - 1;
            j8 = j10 * 400;
            j9 += (-j10) * 146097;
        } else {
            j8 = 0;
        }
        long j11 = ((j9 * 400) + 591) / 146097;
        long j12 = j9 - ((j11 / 400) + (((j11 / 4) + (j11 * 365)) - (j11 / 100)));
        if (j12 < 0) {
            j11--;
            j12 = j9 - ((j11 / 400) + (((j11 / 4) + (365 * j11)) - (j11 / 100)));
        }
        int i4 = (int) j12;
        int i10 = ((i4 * 5) + 2) / 153;
        int i11 = ((i10 + 2) % 12) + 1;
        int i12 = (i4 - (((i10 * 306) + 5) / 10)) + 1;
        long j13 = j11 + j8 + (i10 / 10);
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return new f(aVar.f26204b.a(j13, aVar), i11, i12);
    }

    public static f E(j$.time.temporal.n nVar) {
        Objects.requireNonNull(nVar, "temporal");
        f fVar = (f) nVar.l(j$.time.temporal.r.f26227f);
        if (fVar != null) {
            return fVar;
        }
        throw new a("Unable to obtain LocalDate from TemporalAccessor: " + nVar + " of type " + nVar.getClass().getName());
    }

    public static f D(int i4, int i10, int i11) {
        int i12 = 28;
        if (i11 > 28) {
            if (i10 != 2) {
                i12 = (i10 == 4 || i10 == 6 || i10 == 9 || i10 == 11) ? 30 : 31;
            } else {
                j$.time.chrono.t.f26098c.getClass();
                if (j$.time.chrono.t.j(i4)) {
                    i12 = 29;
                }
            }
            if (i11 > i12) {
                if (i11 == 29) {
                    throw new a("Invalid date 'February 29' as '" + i4 + "' is not a leap year");
                }
                throw new a("Invalid date '" + k.F(i10).name() + " " + i11 + "'");
            }
        }
        return new f(i4, i10, i11);
    }

    public static f Q(int i4, int i10, int i11) {
        if (i10 == 2) {
            j$.time.chrono.t.f26098c.getClass();
            i11 = Math.min(i11, j$.time.chrono.t.j((long) i4) ? 29 : 28);
        } else if (i10 == 4 || i10 == 6 || i10 == 9 || i10 == 11) {
            i11 = Math.min(i11, 30);
        }
        return new f(i4, i10, i11);
    }

    public f(int i4, int i10, int i11) {
        this.f26118a = i4;
        this.f26119b = (short) i10;
        this.f26120c = (short) i11;
    }

    @Override // j$.time.temporal.n
    public final boolean e(j$.time.temporal.q qVar) {
        return j$.com.android.tools.r8.a.n(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.j(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        if (!aVar.isDateBased()) {
            throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
        }
        int i4 = e.f26114a[aVar.ordinal()];
        if (i4 == 1) {
            return j$.time.temporal.u.e(1L, J());
        }
        if (i4 == 2) {
            return j$.time.temporal.u.e(1L, I() ? 366 : 365);
        }
        if (i4 != 3) {
            return i4 != 4 ? aVar.f26204b : this.f26118a <= 0 ? j$.time.temporal.u.e(1L, 1000000000L) : j$.time.temporal.u.e(1L, 999999999L);
        }
        return j$.time.temporal.u.e(1L, (k.F(this.f26119b) != k.FEBRUARY || I()) ? 5L : 4L);
    }

    @Override // j$.time.temporal.n
    public final int i(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return F(qVar);
        }
        return j$.time.temporal.r.a(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar == j$.time.temporal.a.EPOCH_DAY) {
                return x();
            }
            if (qVar != j$.time.temporal.a.PROLEPTIC_MONTH) {
                return F(qVar);
            }
            return ((this.f26118a * 12) + this.f26119b) - 1;
        }
        return qVar.l(this);
    }

    public final int F(j$.time.temporal.q qVar) {
        switch (e.f26114a[((j$.time.temporal.a) qVar).ordinal()]) {
            case 1:
                return this.f26120c;
            case 2:
                return H();
            case 3:
                return ((this.f26120c - 1) / 7) + 1;
            case 4:
                int i4 = this.f26118a;
                return i4 >= 1 ? i4 : 1 - i4;
            case 5:
                return G().getValue();
            case 6:
                return ((this.f26120c - 1) % 7) + 1;
            case 7:
                return ((H() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.t("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((H() - 1) / 7) + 1;
            case 10:
                return this.f26119b;
            case 11:
                throw new j$.time.temporal.t("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.f26118a;
            case 13:
                return this.f26118a >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
        }
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.m a() {
        return j$.time.chrono.t.f26098c;
    }

    public final int H() {
        return (k.F(this.f26119b).C(I()) + this.f26120c) - 1;
    }

    public final c G() {
        return c.C(((int) j$.com.android.tools.r8.a.A(x() + 3, 7)) + 1);
    }

    public final boolean I() {
        j$.time.chrono.t tVar = j$.time.chrono.t.f26098c;
        long j = this.f26118a;
        tVar.getClass();
        return j$.time.chrono.t.j(j);
    }

    public final int J() {
        short s10 = this.f26119b;
        return s10 != 2 ? (s10 == 4 || s10 == 6 || s10 == 9 || s10 == 11) ? 30 : 31 : I() ? 29 : 28;
    }

    @Override // j$.time.temporal.m
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final f j(j$.time.temporal.o oVar) {
        if (oVar instanceof f) {
            return (f) oVar;
        }
        return (f) oVar.o(this);
    }

    @Override // j$.time.temporal.m
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final f c(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (f) qVar.o(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.s(j);
        switch (e.f26114a[aVar.ordinal()]) {
            case 1:
                int i4 = (int) j;
                if (this.f26120c != i4) {
                    return K(this.f26118a, this.f26119b, i4);
                }
                return this;
            case 2:
                return T((int) j);
            case 3:
                return N(j$.com.android.tools.r8.a.w(j - w(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH), 7));
            case 4:
                if (this.f26118a < 1) {
                    j = 1 - j;
                }
                return U((int) j);
            case 5:
                return N(j - G().getValue());
            case 6:
                return N(j - w(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return N(j - w(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return L(j);
            case 9:
                return N(j$.com.android.tools.r8.a.w(j - w(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR), 7));
            case 10:
                int i10 = (int) j;
                if (this.f26119b != i10) {
                    j$.time.temporal.a.MONTH_OF_YEAR.s(i10);
                    return Q(this.f26118a, i10, this.f26120c);
                }
                return this;
            case 11:
                return O(j - (((this.f26118a * 12) + this.f26119b) - 1));
            case 12:
                return U((int) j);
            case 13:
                if (w(j$.time.temporal.a.ERA) != j) {
                    return U(1 - this.f26118a);
                }
                return this;
            default:
                throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
        }
    }

    public final f U(int i4) {
        if (this.f26118a == i4) {
            return this;
        }
        j$.time.temporal.a.YEAR.s(i4);
        return Q(i4, this.f26119b, this.f26120c);
    }

    public final f T(int i4) {
        if (H() == i4) {
            return this;
        }
        int i10 = this.f26118a;
        long j = i10;
        j$.time.temporal.a.YEAR.s(j);
        j$.time.temporal.a.DAY_OF_YEAR.s(i4);
        j$.time.chrono.t.f26098c.getClass();
        boolean zJ = j$.time.chrono.t.j(j);
        if (i4 == 366 && !zJ) {
            throw new a("Invalid date 'DayOfYear 366' as '" + i10 + "' is not a leap year");
        }
        k kVarF = k.F(((i4 - 1) / 31) + 1);
        if (i4 > (kVarF.D(zJ) + kVarF.C(zJ)) - 1) {
            kVarF = k.f26180a[((((int) 1) + 12) + kVarF.ordinal()) % 12];
        }
        return new f(i10, kVarF.getValue(), (i4 - kVarF.C(zJ)) + 1);
    }

    @Override // j$.time.temporal.m
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final f d(long j, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.b) {
            switch (e.f26115b[((j$.time.temporal.b) sVar).ordinal()]) {
                case 1:
                    return N(j);
                case 2:
                    return N(j$.com.android.tools.r8.a.w(j, 7));
                case 3:
                    return O(j);
                case 4:
                    return P(j);
                case 5:
                    return P(j$.com.android.tools.r8.a.w(j, 10));
                case 6:
                    return P(j$.com.android.tools.r8.a.w(j, 100));
                case 7:
                    return P(j$.com.android.tools.r8.a.w(j, 1000));
                case 8:
                    j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                    return c(j$.com.android.tools.r8.a.x(w(aVar), j), aVar);
                default:
                    throw new j$.time.temporal.t("Unsupported unit: " + sVar);
            }
        }
        return (f) sVar.i(this, j);
    }

    public final f P(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return Q(aVar.f26204b.a(this.f26118a + j, aVar), this.f26119b, this.f26120c);
    }

    public final f O(long j) {
        if (j == 0) {
            return this;
        }
        long j8 = (this.f26118a * 12) + (this.f26119b - 1) + j;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        long j9 = 12;
        return Q(aVar.f26204b.a(j$.com.android.tools.r8.a.B(j8, j9), aVar), ((int) j$.com.android.tools.r8.a.A(j8, j9)) + 1, this.f26120c);
    }

    public final f N(long j) {
        if (j == 0) {
            return this;
        }
        long j8 = this.f26120c + j;
        if (j8 > 0) {
            if (j8 <= 28) {
                return new f(this.f26118a, this.f26119b, (int) j8);
            }
            if (j8 <= 59) {
                long J = J();
                if (j8 <= J) {
                    return new f(this.f26118a, this.f26119b, (int) j8);
                }
                short s10 = this.f26119b;
                if (s10 < 12) {
                    return new f(this.f26118a, s10 + 1, (int) (j8 - J));
                }
                j$.time.temporal.a.YEAR.s(this.f26118a + 1);
                return new f(this.f26118a + 1, 1, (int) (j8 - J));
            }
        }
        return L(j$.com.android.tools.r8.a.x(x(), j));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m s(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j, bVar);
    }

    @Override // j$.time.temporal.n
    public final Object l(j$.time.format.a aVar) {
        return aVar == j$.time.temporal.r.f26227f ? this : j$.com.android.tools.r8.a.p(this, aVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m o(j$.time.temporal.m mVar) {
        return j$.com.android.tools.r8.a.a(this, mVar);
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.e y(i iVar) {
        return LocalDateTime.F(this, iVar);
    }

    @Override // j$.time.chrono.b
    public final long x() {
        long j = this.f26118a;
        long j8 = this.f26119b;
        long j9 = 365 * j;
        long j10 = (((367 * j8) - 362) / 12) + (j >= 0 ? ((j + 399) / 400) + (((3 + j) / 4) - ((99 + j) / 100)) + j9 : j9 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + (this.f26120c - 1);
        if (j8 > 2) {
            j10 = !I() ? j10 - 2 : j10 - 1;
        }
        return j10 - 719528;
    }

    @Override // java.lang.Comparable
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.chrono.b bVar) {
        if (bVar instanceof f) {
            return C((f) bVar);
        }
        return j$.com.android.tools.r8.a.g(this, bVar);
    }

    public final int C(f fVar) {
        int i4 = this.f26118a - fVar.f26118a;
        if (i4 != 0) {
            return i4;
        }
        int i10 = this.f26119b - fVar.f26119b;
        return i10 == 0 ? this.f26120c - fVar.f26120c : i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && C((f) obj) == 0;
    }

    @Override // j$.time.chrono.b
    public final int hashCode() {
        int i4 = this.f26118a;
        return (((i4 << 11) + (this.f26119b << 6)) + this.f26120c) ^ (i4 & (-2048));
    }

    @Override // j$.time.chrono.b
    public final String toString() {
        int i4 = this.f26118a;
        short s10 = this.f26119b;
        short s11 = this.f26120c;
        int iAbs = Math.abs(i4);
        StringBuilder sb2 = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i4 > 9999) {
                sb2.append('+');
            }
            sb2.append(i4);
        } else if (i4 < 0) {
            sb2.append(i4 - 10000);
            sb2.deleteCharAt(1);
        } else {
            sb2.append(i4 + 10000);
            sb2.deleteCharAt(0);
        }
        sb2.append(s10 < 10 ? "-0" : "-");
        sb2.append((int) s10);
        sb2.append(s11 < 10 ? "-0" : "-");
        sb2.append((int) s11);
        return sb2.toString();
    }

    private Object writeReplace() {
        return new q((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}

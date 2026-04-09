package j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class u implements j$.time.temporal.m, j$.time.temporal.o, Comparable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f26232c = 0;
    private static final long serialVersionUID = 4183400860270640070L;

    /* renamed from: a, reason: collision with root package name */
    public final int f26233a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26234b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        u uVar = (u) obj;
        int i4 = this.f26233a - uVar.f26233a;
        return i4 == 0 ? this.f26234b - uVar.f26234b : i4;
    }

    static {
        j$.time.format.n nVar = new j$.time.format.n();
        nVar.h(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.u.EXCEEDS_PAD);
        nVar.c('-');
        nVar.g(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        nVar.l(Locale.getDefault(), j$.time.format.t.SMART, null);
    }

    public u(int i4, int i10) {
        this.f26233a = i4;
        this.f26234b = i10;
    }

    public final u G(int i4, int i10) {
        return (this.f26233a == i4 && this.f26234b == i10) ? this : new u(i4, i10);
    }

    @Override // j$.time.temporal.n
    public final boolean e(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.YEAR || qVar == j$.time.temporal.a.MONTH_OF_YEAR || qVar == j$.time.temporal.a.PROLEPTIC_MONTH || qVar == j$.time.temporal.a.YEAR_OF_ERA || qVar == j$.time.temporal.a.ERA : qVar != null && qVar.i(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.u.e(1L, this.f26233a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.r.d(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final int i(j$.time.temporal.q qVar) {
        return k(qVar).a(w(qVar), qVar);
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        int i4;
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.l(this);
        }
        int i10 = t.f26200a[((j$.time.temporal.a) qVar).ordinal()];
        if (i10 == 1) {
            i4 = this.f26234b;
        } else {
            if (i10 == 2) {
                return C();
            }
            if (i10 == 3) {
                int i11 = this.f26233a;
                if (i11 < 1) {
                    i11 = 1 - i11;
                }
                return i11;
            }
            if (i10 != 4) {
                if (i10 == 5) {
                    return this.f26233a < 1 ? 0 : 1;
                }
                throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
            }
            i4 = this.f26233a;
        }
        return i4;
    }

    public final long C() {
        return ((this.f26233a * 12) + this.f26234b) - 1;
    }

    @Override // j$.time.temporal.m
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public final u c(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (u) qVar.o(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.s(j);
        int i4 = t.f26200a[aVar.ordinal()];
        if (i4 == 1) {
            int i10 = (int) j;
            j$.time.temporal.a.MONTH_OF_YEAR.s(i10);
            return G(this.f26233a, i10);
        }
        if (i4 == 2) {
            return E(j - C());
        }
        if (i4 == 3) {
            if (this.f26233a < 1) {
                j = 1 - j;
            }
            int i11 = (int) j;
            j$.time.temporal.a.YEAR.s(i11);
            return G(i11, this.f26234b);
        }
        if (i4 == 4) {
            int i12 = (int) j;
            j$.time.temporal.a.YEAR.s(i12);
            return G(i12, this.f26234b);
        }
        if (i4 != 5) {
            throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
        }
        if (w(j$.time.temporal.a.ERA) == j) {
            return this;
        }
        int i13 = 1 - this.f26233a;
        j$.time.temporal.a.YEAR.s(i13);
        return G(i13, this.f26234b);
    }

    @Override // j$.time.temporal.m
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final u d(long j, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.b) {
            switch (t.f26201b[((j$.time.temporal.b) sVar).ordinal()]) {
                case 1:
                    return E(j);
                case 2:
                    return F(j);
                case 3:
                    return F(j$.com.android.tools.r8.a.w(j, 10));
                case 4:
                    return F(j$.com.android.tools.r8.a.w(j, 100));
                case 5:
                    return F(j$.com.android.tools.r8.a.w(j, 1000));
                case 6:
                    j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                    return c(j$.com.android.tools.r8.a.x(w(aVar), j), aVar);
                default:
                    throw new j$.time.temporal.t("Unsupported unit: " + sVar);
            }
        }
        return (u) sVar.i(this, j);
    }

    public final u F(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return G(aVar.f26204b.a(this.f26233a + j, aVar), this.f26234b);
    }

    public final u E(long j) {
        if (j == 0) {
            return this;
        }
        long j8 = (this.f26233a * 12) + (this.f26234b - 1) + j;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        long j9 = 12;
        return G(aVar.f26204b.a(j$.com.android.tools.r8.a.B(j8, j9), aVar), ((int) j$.com.android.tools.r8.a.A(j8, j9)) + 1);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m s(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j, bVar);
    }

    @Override // j$.time.temporal.n
    public final Object l(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.r.f26223b) {
            return j$.time.chrono.t.f26098c;
        }
        if (aVar == j$.time.temporal.r.f26224c) {
            return j$.time.temporal.b.MONTHS;
        }
        return j$.time.temporal.r.c(this, aVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m o(j$.time.temporal.m mVar) {
        if (!j$.com.android.tools.r8.a.v(mVar).equals(j$.time.chrono.t.f26098c)) {
            throw new a("Adjustment only supported on ISO date-time");
        }
        return mVar.c(C(), j$.time.temporal.a.PROLEPTIC_MONTH);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f26233a == uVar.f26233a && this.f26234b == uVar.f26234b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f26233a ^ (this.f26234b << 27);
    }

    public final String toString() {
        int iAbs = Math.abs(this.f26233a);
        StringBuilder sb2 = new StringBuilder(9);
        if (iAbs < 1000) {
            int i4 = this.f26233a;
            if (i4 < 0) {
                sb2.append(i4 - 10000);
                sb2.deleteCharAt(1);
            } else {
                sb2.append(i4 + 10000);
                sb2.deleteCharAt(0);
            }
        } else {
            sb2.append(this.f26233a);
        }
        sb2.append(this.f26234b < 10 ? "-0" : "-");
        sb2.append(this.f26234b);
        return sb2.toString();
    }

    private Object writeReplace() {
        return new q((byte) 12, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(f fVar) {
        return (u) j$.com.android.tools.r8.a.a(fVar, this);
    }
}

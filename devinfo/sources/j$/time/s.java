package j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class s implements j$.time.temporal.m, j$.time.temporal.o, Comparable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f26198b = 0;
    private static final long serialVersionUID = -23038383694477807L;

    /* renamed from: a, reason: collision with root package name */
    public final int f26199a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f26199a - ((s) obj).f26199a;
    }

    static {
        j$.time.format.n nVar = new j$.time.format.n();
        nVar.h(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.u.EXCEEDS_PAD);
        nVar.l(Locale.getDefault(), j$.time.format.t.SMART, null);
    }

    public static s C(int i4) {
        j$.time.temporal.a.YEAR.s(i4);
        return new s(i4);
    }

    public s(int i4) {
        this.f26199a = i4;
    }

    @Override // j$.time.temporal.n
    public final boolean e(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.YEAR || qVar == j$.time.temporal.a.YEAR_OF_ERA || qVar == j$.time.temporal.a.ERA : qVar != null && qVar.i(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.u.e(1L, this.f26199a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.r.d(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final int i(j$.time.temporal.q qVar) {
        return k(qVar).a(w(qVar), qVar);
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.l(this);
        }
        int i4 = r.f26196a[((j$.time.temporal.a) qVar).ordinal()];
        if (i4 == 1) {
            int i10 = this.f26199a;
            if (i10 < 1) {
                i10 = 1 - i10;
            }
            return i10;
        }
        if (i4 == 2) {
            return this.f26199a;
        }
        if (i4 == 3) {
            return this.f26199a < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
    }

    @Override // j$.time.temporal.m
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final s c(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (s) qVar.o(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.s(j);
        int i4 = r.f26196a[aVar.ordinal()];
        if (i4 == 1) {
            if (this.f26199a < 1) {
                j = 1 - j;
            }
            return C((int) j);
        }
        if (i4 == 2) {
            return C((int) j);
        }
        if (i4 == 3) {
            return w(j$.time.temporal.a.ERA) == j ? this : C(1 - this.f26199a);
        }
        throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
    }

    @Override // j$.time.temporal.m
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final s d(long j, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.b) {
            int i4 = r.f26197b[((j$.time.temporal.b) sVar).ordinal()];
            if (i4 == 1) {
                return E(j);
            }
            if (i4 == 2) {
                return E(j$.com.android.tools.r8.a.w(j, 10));
            }
            if (i4 == 3) {
                return E(j$.com.android.tools.r8.a.w(j, 100));
            }
            if (i4 == 4) {
                return E(j$.com.android.tools.r8.a.w(j, 1000));
            }
            if (i4 == 5) {
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return c(j$.com.android.tools.r8.a.x(w(aVar), j), aVar);
            }
            throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
        return (s) sVar.i(this, j);
    }

    public final s E(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return C(aVar.f26204b.a(this.f26199a + j, aVar));
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
            return j$.time.temporal.b.YEARS;
        }
        return j$.time.temporal.r.c(this, aVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m o(j$.time.temporal.m mVar) {
        if (!j$.com.android.tools.r8.a.v(mVar).equals(j$.time.chrono.t.f26098c)) {
            throw new a("Adjustment only supported on ISO date-time");
        }
        return mVar.c(this.f26199a, j$.time.temporal.a.YEAR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.f26199a == ((s) obj).f26199a;
    }

    public final int hashCode() {
        return this.f26199a;
    }

    public final String toString() {
        return Integer.toString(this.f26199a);
    }

    private Object writeReplace() {
        return new q((byte) 11, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m j(f fVar) {
        return (s) j$.com.android.tools.r8.a.a(fVar, this);
    }
}

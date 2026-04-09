package j$.time.chrono;

import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class d implements b, j$.time.temporal.m, j$.time.temporal.o, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    @Override // java.lang.Comparable
    /* renamed from: A */
    public final /* synthetic */ int compareTo(b bVar) {
        return j$.com.android.tools.r8.a.g(this, bVar);
    }

    public abstract b F(long j);

    public abstract b G(long j);

    public abstract b H(long j);

    @Override // j$.time.chrono.b, j$.time.temporal.n
    public /* synthetic */ boolean e(j$.time.temporal.q qVar) {
        return j$.com.android.tools.r8.a.n(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final /* synthetic */ int i(j$.time.temporal.q qVar) {
        return j$.time.temporal.r.a(this, qVar);
    }

    @Override // j$.time.temporal.n
    public /* synthetic */ j$.time.temporal.u k(j$.time.temporal.q qVar) {
        return j$.time.temporal.r.d(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final /* synthetic */ Object l(j$.time.format.a aVar) {
        return j$.com.android.tools.r8.a.p(this, aVar);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ j$.time.temporal.m o(j$.time.temporal.m mVar) {
        return j$.com.android.tools.r8.a.a(this, mVar);
    }

    public static b C(m mVar, j$.time.temporal.m mVar2) {
        b bVar = (b) mVar2;
        if (mVar.equals(bVar.a())) {
            return bVar;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + mVar.h() + ", actual: " + bVar.a().h());
    }

    @Override // j$.time.chrono.b
    public e y(j$.time.i iVar) {
        return new g(this, iVar);
    }

    @Override // j$.time.temporal.m
    public b d(long j, j$.time.temporal.s sVar) {
        boolean z3 = sVar instanceof j$.time.temporal.b;
        if (!z3) {
            if (z3) {
                throw new j$.time.temporal.t("Unsupported unit: " + sVar);
            }
            return C(a(), sVar.i(this, j));
        }
        switch (c.f26059a[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return F(j);
            case 2:
                return F(j$.com.android.tools.r8.a.w(j, 7));
            case 3:
                return G(j);
            case 4:
                return H(j);
            case 5:
                return H(j$.com.android.tools.r8.a.w(j, 10));
            case 6:
                return H(j$.com.android.tools.r8.a.w(j, 100));
            case 7:
                return H(j$.com.android.tools.r8.a.w(j, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return c(j$.com.android.tools.r8.a.x(w(aVar), j), (j$.time.temporal.q) aVar);
            default:
                throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
    }

    public n D() {
        return a().q(j$.time.temporal.r.a(this, j$.time.temporal.a.ERA));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && j$.com.android.tools.r8.a.g(this, (b) obj) == 0;
    }

    @Override // j$.time.chrono.b
    public int hashCode() {
        long jX = x();
        return ((int) (jX ^ (jX >>> 32))) ^ a().hashCode();
    }

    @Override // j$.time.temporal.m
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public b j(j$.time.temporal.o oVar) {
        return C(a(), oVar.o(this));
    }

    @Override // j$.time.chrono.b
    public final String toString() {
        long jW = w(j$.time.temporal.a.YEAR_OF_ERA);
        long jW2 = w(j$.time.temporal.a.MONTH_OF_YEAR);
        long jW3 = w(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(a().toString());
        sb2.append(" ");
        sb2.append(D());
        sb2.append(" ");
        sb2.append(jW);
        sb2.append(jW2 < 10 ? "-0" : "-");
        sb2.append(jW2);
        sb2.append(jW3 < 10 ? "-0" : "-");
        sb2.append(jW3);
        return sb2.toString();
    }

    @Override // j$.time.temporal.m
    public b c(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(j$.time.b.a("Unsupported field: ", qVar));
        }
        return C(a(), qVar.o(this, j));
    }

    @Override // j$.time.temporal.m
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public b s(long j, j$.time.temporal.s sVar) {
        return C(a(), j$.time.temporal.r.b(this, j, sVar));
    }

    @Override // j$.time.chrono.b
    public long x() {
        return w(j$.time.temporal.a.EPOCH_DAY);
    }
}

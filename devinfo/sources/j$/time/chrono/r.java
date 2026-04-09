package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class r extends d {
    private static final long serialVersionUID = -5207853542612002020L;

    /* renamed from: a, reason: collision with root package name */
    public final transient p f26093a;

    /* renamed from: b, reason: collision with root package name */
    public final transient int f26094b;

    /* renamed from: c, reason: collision with root package name */
    public final transient int f26095c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f26096d;

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final e y(j$.time.i iVar) {
        return new g(this, iVar);
    }

    public r(p pVar, int i4, int i10, int i11) {
        pVar.l(i4, i10, i11);
        this.f26093a = pVar;
        this.f26094b = i4;
        this.f26095c = i10;
        this.f26096d = i11;
    }

    public r(p pVar, long j) {
        int i4 = (int) j;
        pVar.j();
        if (i4 < pVar.f26087e || i4 >= pVar.f26088f) {
            throw new j$.time.a("Hijrah date out of range");
        }
        int iBinarySearch = Arrays.binarySearch(pVar.f26086d, i4);
        iBinarySearch = iBinarySearch < 0 ? (-iBinarySearch) - 2 : iBinarySearch;
        int i10 = pVar.g;
        int[] iArr = {(iBinarySearch + i10) / 12, ((i10 + iBinarySearch) % 12) + 1, (i4 - pVar.f26086d[iBinarySearch]) + 1};
        this.f26093a = pVar;
        this.f26094b = iArr[0];
        this.f26095c = iArr[1];
        this.f26096d = iArr[2];
    }

    @Override // j$.time.chrono.b
    public final m a() {
        return this.f26093a;
    }

    @Override // j$.time.chrono.d
    public final n D() {
        return s.AH;
    }

    @Override // j$.time.chrono.d, j$.time.temporal.n
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.j(this);
        }
        if (!j$.com.android.tools.r8.a.n(this, qVar)) {
            throw new j$.time.temporal.t(j$.time.b.a("Unsupported field: ", qVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        int i4 = q.f26092a[aVar.ordinal()];
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? this.f26093a.w(aVar) : j$.time.temporal.u.e(1L, 5L) : j$.time.temporal.u.e(1L, this.f26093a.C(this.f26094b, 12)) : j$.time.temporal.u.e(1L, this.f26093a.o(this.f26094b, this.f26095c));
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.l(this);
        }
        switch (q.f26092a[((j$.time.temporal.a) qVar).ordinal()]) {
            case 1:
                return this.f26096d;
            case 2:
                return J();
            case 3:
                return ((this.f26096d - 1) / 7) + 1;
            case 4:
                return ((int) j$.com.android.tools.r8.a.A(x() + 3, 7)) + 1;
            case 5:
                return ((this.f26096d - 1) % 7) + 1;
            case 6:
                return ((J() - 1) % 7) + 1;
            case 7:
                return x();
            case 8:
                return ((J() - 1) / 7) + 1;
            case 9:
                return this.f26095c;
            case 10:
                return ((this.f26094b * 12) + this.f26095c) - 1;
            case 11:
                return this.f26094b;
            case 12:
                return this.f26094b;
            case 13:
                return this.f26094b <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.t(j$.time.b.a("Unsupported field: ", qVar));
        }
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final r c(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (r) super.c(j, qVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        this.f26093a.w(aVar).b(j, aVar);
        int i4 = (int) j;
        switch (q.f26092a[aVar.ordinal()]) {
            case 1:
                return M(this.f26094b, this.f26095c, i4);
            case 2:
                return F(Math.min(i4, this.f26093a.C(this.f26094b, 12)) - J());
            case 3:
                return F((j - w(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return F(j - (((int) j$.com.android.tools.r8.a.A(x() + 3, 7)) + 1));
            case 5:
                return F(j - w(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return F(j - w(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new r(this.f26093a, j);
            case 8:
                return F((j - w(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return M(this.f26094b, i4, this.f26096d);
            case 10:
                return G(j - (((this.f26094b * 12) + this.f26095c) - 1));
            case 11:
                if (this.f26094b < 1) {
                    i4 = 1 - i4;
                }
                return M(i4, this.f26095c, this.f26096d);
            case 12:
                return M(i4, this.f26095c, this.f26096d);
            case 13:
                return M(1 - this.f26094b, this.f26095c, this.f26096d);
            default:
                throw new j$.time.temporal.t(j$.time.b.a("Unsupported field: ", qVar));
        }
    }

    public final r M(int i4, int i10, int i11) {
        int iO = this.f26093a.o(i4, i10);
        if (i11 > iO) {
            i11 = iO;
        }
        return new r(this.f26093a, i4, i10, i11);
    }

    @Override // j$.time.chrono.d
    /* renamed from: I */
    public final b j(j$.time.temporal.o oVar) {
        return (r) super.j(oVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m j(j$.time.f fVar) {
        return (r) super.j(fVar);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final long x() {
        return this.f26093a.l(this.f26094b, this.f26095c, this.f26096d);
    }

    public final int J() {
        return this.f26093a.C(this.f26094b, this.f26095c - 1) + this.f26096d;
    }

    @Override // j$.time.chrono.d
    public final b H(long j) {
        if (j == 0) {
            return this;
        }
        long j8 = this.f26094b + ((int) j);
        int i4 = (int) j8;
        if (j8 == i4) {
            return M(i4, this.f26095c, this.f26096d);
        }
        throw new ArithmeticException();
    }

    @Override // j$.time.chrono.d
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final r G(long j) {
        if (j == 0) {
            return this;
        }
        long j8 = (this.f26094b * 12) + (this.f26095c - 1) + j;
        p pVar = this.f26093a;
        long jB = j$.com.android.tools.r8.a.B(j8, 12L);
        int i4 = pVar.g;
        if (jB >= i4 / 12 && jB <= (((pVar.f26086d.length - 1) + i4) / 12) - 1) {
            return M((int) jB, ((int) j$.com.android.tools.r8.a.A(j8, 12L)) + 1, this.f26096d);
        }
        throw new j$.time.a("Invalid Hijrah year: " + jB);
    }

    @Override // j$.time.chrono.d
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final r F(long j) {
        return new r(this.f26093a, x() + j);
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b, j$.time.temporal.m
    public final b d(long j, j$.time.temporal.s sVar) {
        return (r) super.d(j, sVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m d(long j, j$.time.temporal.s sVar) {
        return (r) super.d(j, sVar);
    }

    @Override // j$.time.chrono.d
    /* renamed from: E */
    public final b s(long j, j$.time.temporal.s sVar) {
        return (r) super.s(j, sVar);
    }

    @Override // j$.time.chrono.d, j$.time.temporal.m
    public final j$.time.temporal.m s(long j, j$.time.temporal.b bVar) {
        return (r) super.s(j, bVar);
    }

    @Override // j$.time.chrono.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f26094b == rVar.f26094b && this.f26095c == rVar.f26095c && this.f26096d == rVar.f26096d && this.f26093a.equals(rVar.f26093a)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.d, j$.time.chrono.b
    public final int hashCode() {
        int i4 = this.f26094b;
        int i10 = this.f26095c;
        int i11 = this.f26096d;
        this.f26093a.getClass();
        return (((i4 << 11) + (i10 << 6)) + i11) ^ ((i4 & (-2048)) ^ 2100100019);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new f0((byte) 6, this);
    }
}

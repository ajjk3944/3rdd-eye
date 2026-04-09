package Y;

import T.B0;
import a0.AbstractC3748a;
import a0.C3749b;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sh.AbstractC7978m;
import sh.C7972g;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: e, reason: collision with root package name */
    public static final a f24503e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f24504f = 8;

    /* renamed from: g, reason: collision with root package name */
    private static final t f24505g = new t(0, 0, new Object[0]);

    /* renamed from: a, reason: collision with root package name */
    private int f24506a;

    /* renamed from: b, reason: collision with root package name */
    private int f24507b;

    /* renamed from: c, reason: collision with root package name */
    private final a0.e f24508c;

    /* renamed from: d, reason: collision with root package name */
    private Object[] f24509d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t a() {
            return t.f24505g;
        }

        private a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private t f24510a;

        /* renamed from: b, reason: collision with root package name */
        private final int f24511b;

        public b(t tVar, int i10) {
            this.f24510a = tVar;
            this.f24511b = i10;
        }

        public final t a() {
            return this.f24510a;
        }

        public final int b() {
            return this.f24511b;
        }

        public final void c(t tVar) {
            this.f24510a = tVar;
        }
    }

    public t(int i10, int i11, Object[] objArr, a0.e eVar) {
        this.f24506a = i10;
        this.f24507b = i11;
        this.f24508c = eVar;
        this.f24509d = objArr;
    }

    private final t A(int i10, f fVar) {
        fVar.q(fVar.size() - 1);
        fVar.n(W(i10));
        if (this.f24509d.length == 2) {
            return null;
        }
        if (this.f24508c != fVar.j()) {
            return new t(0, 0, x.h(this.f24509d, i10), fVar.j());
        }
        this.f24509d = x.h(this.f24509d, i10);
        return this;
    }

    private final t B(int i10, Object obj, Object obj2, a0.e eVar) {
        int iN = n(i10);
        if (this.f24508c != eVar) {
            return new t(i10 | this.f24506a, this.f24507b, x.g(this.f24509d, iN, obj, obj2), eVar);
        }
        this.f24509d = x.g(this.f24509d, iN, obj, obj2);
        this.f24506a = i10 | this.f24506a;
        return this;
    }

    private final t C(int i10, int i11, int i12, Object obj, Object obj2, int i13, a0.e eVar) {
        if (this.f24508c != eVar) {
            return new t(this.f24506a ^ i11, i11 | this.f24507b, d(i10, i11, i12, obj, obj2, i13, eVar), eVar);
        }
        this.f24509d = d(i10, i11, i12, obj, obj2, i13, eVar);
        this.f24506a ^= i11;
        this.f24507b |= i11;
        return this;
    }

    private final t F(t tVar, int i10, int i11, C3749b c3749b, f fVar) {
        if (r(i10)) {
            t tVarN = N(O(i10));
            if (tVar.r(i10)) {
                return tVarN.E(tVar.N(tVar.O(i10)), i11 + 5, c3749b, fVar);
            }
            if (!tVar.q(i10)) {
                return tVarN;
            }
            int iN = tVar.n(i10);
            Object objT = tVar.t(iN);
            Object objW = tVar.W(iN);
            int size = fVar.size();
            t tVarD = tVarN.D(objT != null ? objT.hashCode() : 0, objT, objW, i11 + 5, fVar);
            if (fVar.size() != size) {
                return tVarD;
            }
            c3749b.c(c3749b.a() + 1);
            return tVarD;
        }
        if (!tVar.r(i10)) {
            int iN2 = n(i10);
            Object objT2 = t(iN2);
            Object objW2 = W(iN2);
            int iN3 = tVar.n(i10);
            Object objT3 = tVar.t(iN3);
            return u(objT2 != null ? objT2.hashCode() : 0, objT2, objW2, objT3 != null ? objT3.hashCode() : 0, objT3, tVar.W(iN3), i11 + 5, fVar.j());
        }
        t tVarN2 = tVar.N(tVar.O(i10));
        if (q(i10)) {
            int iN4 = n(i10);
            Object objT4 = t(iN4);
            int i12 = i11 + 5;
            if (!tVarN2.k(objT4 != null ? objT4.hashCode() : 0, objT4, i12)) {
                return tVarN2.D(objT4 != null ? objT4.hashCode() : 0, objT4, W(iN4), i12, fVar);
            }
            c3749b.c(c3749b.a() + 1);
        }
        return tVarN2;
    }

    private final t I(int i10, int i11, f fVar) {
        fVar.q(fVar.size() - 1);
        fVar.n(W(i10));
        if (this.f24509d.length == 2) {
            return null;
        }
        if (this.f24508c != fVar.j()) {
            return new t(i11 ^ this.f24506a, this.f24507b, x.h(this.f24509d, i10), fVar.j());
        }
        this.f24509d = x.h(this.f24509d, i10);
        this.f24506a ^= i11;
        return this;
    }

    private final t J(int i10, int i11, a0.e eVar) {
        Object[] objArr = this.f24509d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.f24508c != eVar) {
            return new t(this.f24506a, i11 ^ this.f24507b, x.i(objArr, i10), eVar);
        }
        this.f24509d = x.i(objArr, i10);
        this.f24507b ^= i11;
        return this;
    }

    private final t K(t tVar, t tVar2, int i10, int i11, a0.e eVar) {
        return tVar2 == null ? J(i10, i11, eVar) : (this.f24508c == eVar || tVar != tVar2) ? L(i10, tVar2, eVar) : this;
    }

    private final t L(int i10, t tVar, a0.e eVar) {
        Object[] objArr = this.f24509d;
        if (objArr.length == 1 && tVar.f24509d.length == 2 && tVar.f24507b == 0) {
            tVar.f24506a = this.f24507b;
            return tVar;
        }
        if (this.f24508c == eVar) {
            objArr[i10] = tVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC6492s.h(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i10] = tVar;
        return new t(this.f24506a, this.f24507b, objArrCopyOf, eVar);
    }

    private final t M(int i10, Object obj, f fVar) {
        if (this.f24508c == fVar.j()) {
            this.f24509d[i10 + 1] = obj;
            return this;
        }
        fVar.k(fVar.h() + 1);
        Object[] objArr = this.f24509d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC6492s.h(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i10 + 1] = obj;
        return new t(this.f24506a, this.f24507b, objArrCopyOf, fVar.j());
    }

    private final t R(int i10, int i11) {
        Object[] objArr = this.f24509d;
        if (objArr.length == 2) {
            return null;
        }
        return new t(i11 ^ this.f24506a, this.f24507b, x.h(objArr, i10));
    }

    private final t S(int i10, int i11) {
        Object[] objArr = this.f24509d;
        if (objArr.length == 1) {
            return null;
        }
        return new t(this.f24506a, i11 ^ this.f24507b, x.i(objArr, i10));
    }

    private final t T(t tVar, t tVar2, int i10, int i11) {
        return tVar2 == null ? S(i10, i11) : tVar != tVar2 ? U(i10, i11, tVar2) : this;
    }

    private final t U(int i10, int i11, t tVar) {
        Object[] objArr = tVar.f24509d;
        if (objArr.length != 2 || tVar.f24507b != 0) {
            Object[] objArr2 = this.f24509d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            AbstractC6492s.h(objArrCopyOf, "copyOf(this, newSize)");
            objArrCopyOf[i10] = tVar;
            return new t(this.f24506a, this.f24507b, objArrCopyOf);
        }
        if (this.f24509d.length == 1) {
            tVar.f24506a = this.f24507b;
            return tVar;
        }
        return new t(this.f24506a ^ i11, i11 ^ this.f24507b, x.k(this.f24509d, i10, n(i11), objArr[0], objArr[1]));
    }

    private final t V(int i10, Object obj) {
        Object[] objArr = this.f24509d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC6492s.h(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i10 + 1] = obj;
        return new t(this.f24506a, this.f24507b, objArrCopyOf);
    }

    private final Object W(int i10) {
        return this.f24509d[i10 + 1];
    }

    private final b b() {
        return new b(this, 1);
    }

    private final b c() {
        return new b(this, 0);
    }

    private final Object[] d(int i10, int i11, int i12, Object obj, Object obj2, int i13, a0.e eVar) {
        Object objT = t(i10);
        return x.j(this.f24509d, i10, O(i11) + 1, u(objT != null ? objT.hashCode() : 0, objT, W(i10), i12, obj, obj2, i13 + 5, eVar));
    }

    private final int e() {
        if (this.f24507b == 0) {
            return this.f24509d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f24506a);
        int length = this.f24509d.length;
        for (int i10 = iBitCount * 2; i10 < length; i10++) {
            iBitCount += N(i10).e();
        }
        return iBitCount;
    }

    private final boolean f(Object obj) {
        C7972g c7972gR = AbstractC7978m.r(AbstractC7978m.s(0, this.f24509d.length), 2);
        int i10 = c7972gR.i();
        int iJ = c7972gR.j();
        int iK = c7972gR.k();
        if ((iK > 0 && i10 <= iJ) || (iK < 0 && iJ <= i10)) {
            while (!AbstractC6492s.d(obj, this.f24509d[i10])) {
                if (i10 != iJ) {
                    i10 += iK;
                }
            }
            return true;
        }
        return false;
    }

    private final Object g(Object obj) {
        C7972g c7972gR = AbstractC7978m.r(AbstractC7978m.s(0, this.f24509d.length), 2);
        int i10 = c7972gR.i();
        int iJ = c7972gR.j();
        int iK = c7972gR.k();
        if ((iK <= 0 || i10 > iJ) && (iK >= 0 || iJ > i10)) {
            return null;
        }
        while (!AbstractC6492s.d(obj, t(i10))) {
            if (i10 == iJ) {
                return null;
            }
            i10 += iK;
        }
        return W(i10);
    }

    private final b h(Object obj, Object obj2) {
        C7972g c7972gR = AbstractC7978m.r(AbstractC7978m.s(0, this.f24509d.length), 2);
        int i10 = c7972gR.i();
        int iJ = c7972gR.j();
        int iK = c7972gR.k();
        if ((iK > 0 && i10 <= iJ) || (iK < 0 && iJ <= i10)) {
            while (!AbstractC6492s.d(obj, t(i10))) {
                if (i10 != iJ) {
                    i10 += iK;
                }
            }
            if (obj2 == W(i10)) {
                return null;
            }
            Object[] objArr = this.f24509d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            AbstractC6492s.h(objArrCopyOf, "copyOf(this, size)");
            objArrCopyOf[i10 + 1] = obj2;
            return new t(0, 0, objArrCopyOf).c();
        }
        return new t(0, 0, x.g(this.f24509d, 0, obj, obj2)).b();
    }

    private final t i(Object obj) {
        C7972g c7972gR = AbstractC7978m.r(AbstractC7978m.s(0, this.f24509d.length), 2);
        int i10 = c7972gR.i();
        int iJ = c7972gR.j();
        int iK = c7972gR.k();
        if ((iK > 0 && i10 <= iJ) || (iK < 0 && iJ <= i10)) {
            while (!AbstractC6492s.d(obj, t(i10))) {
                if (i10 != iJ) {
                    i10 += iK;
                }
            }
            return j(i10);
        }
        return this;
    }

    private final t j(int i10) {
        Object[] objArr = this.f24509d;
        if (objArr.length == 2) {
            return null;
        }
        return new t(0, 0, x.h(objArr, i10));
    }

    private final boolean l(t tVar) {
        if (this == tVar) {
            return true;
        }
        if (this.f24507b != tVar.f24507b || this.f24506a != tVar.f24506a) {
            return false;
        }
        int length = this.f24509d.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.f24509d[i10] != tVar.f24509d[i10]) {
                return false;
            }
        }
        return true;
    }

    private final boolean r(int i10) {
        return (i10 & this.f24507b) != 0;
    }

    private final t s(int i10, Object obj, Object obj2) {
        return new t(i10 | this.f24506a, this.f24507b, x.g(this.f24509d, n(i10), obj, obj2));
    }

    private final Object t(int i10) {
        return this.f24509d[i10];
    }

    private final t u(int i10, Object obj, Object obj2, int i11, Object obj3, Object obj4, int i12, a0.e eVar) {
        if (i12 > 30) {
            return new t(0, 0, new Object[]{obj, obj2, obj3, obj4}, eVar);
        }
        int iF = x.f(i10, i12);
        int iF2 = x.f(i11, i12);
        if (iF != iF2) {
            return new t((1 << iF) | (1 << iF2), 0, iF < iF2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, eVar);
        }
        return new t(0, 1 << iF, new Object[]{u(i10, obj, obj2, i11, obj3, obj4, i12 + 5, eVar)}, eVar);
    }

    private final t v(int i10, int i11, int i12, Object obj, Object obj2, int i13) {
        return new t(this.f24506a ^ i11, i11 | this.f24507b, d(i10, i11, i12, obj, obj2, i13, null));
    }

    private final t w(Object obj, Object obj2, f fVar) {
        C7972g c7972gR = AbstractC7978m.r(AbstractC7978m.s(0, this.f24509d.length), 2);
        int i10 = c7972gR.i();
        int iJ = c7972gR.j();
        int iK = c7972gR.k();
        if ((iK > 0 && i10 <= iJ) || (iK < 0 && iJ <= i10)) {
            while (!AbstractC6492s.d(obj, t(i10))) {
                if (i10 != iJ) {
                    i10 += iK;
                }
            }
            fVar.n(W(i10));
            if (this.f24508c == fVar.j()) {
                this.f24509d[i10 + 1] = obj2;
                return this;
            }
            fVar.k(fVar.h() + 1);
            Object[] objArr = this.f24509d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            AbstractC6492s.h(objArrCopyOf, "copyOf(this, size)");
            objArrCopyOf[i10 + 1] = obj2;
            return new t(0, 0, objArrCopyOf, fVar.j());
        }
        fVar.q(fVar.size() + 1);
        return new t(0, 0, x.g(this.f24509d, 0, obj, obj2), fVar.j());
    }

    private final t x(t tVar, C3749b c3749b, a0.e eVar) {
        AbstractC3748a.a(this.f24507b == 0);
        AbstractC3748a.a(this.f24506a == 0);
        AbstractC3748a.a(tVar.f24507b == 0);
        AbstractC3748a.a(tVar.f24506a == 0);
        Object[] objArr = this.f24509d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + tVar.f24509d.length);
        AbstractC6492s.h(objArrCopyOf, "copyOf(this, newSize)");
        int length = this.f24509d.length;
        C7972g c7972gR = AbstractC7978m.r(AbstractC7978m.s(0, tVar.f24509d.length), 2);
        int i10 = c7972gR.i();
        int iJ = c7972gR.j();
        int iK = c7972gR.k();
        if ((iK > 0 && i10 <= iJ) || (iK < 0 && iJ <= i10)) {
            while (true) {
                if (f(tVar.f24509d[i10])) {
                    c3749b.c(c3749b.a() + 1);
                } else {
                    Object[] objArr2 = tVar.f24509d;
                    objArrCopyOf[length] = objArr2[i10];
                    objArrCopyOf[length + 1] = objArr2[i10 + 1];
                    length += 2;
                }
                if (i10 == iJ) {
                    break;
                }
                i10 += iK;
            }
        }
        if (length == this.f24509d.length) {
            return this;
        }
        if (length == tVar.f24509d.length) {
            return tVar;
        }
        if (length == objArrCopyOf.length) {
            return new t(0, 0, objArrCopyOf, eVar);
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
        AbstractC6492s.h(objArrCopyOf2, "copyOf(this, newSize)");
        return new t(0, 0, objArrCopyOf2, eVar);
    }

    private final t y(Object obj, f fVar) {
        C7972g c7972gR = AbstractC7978m.r(AbstractC7978m.s(0, this.f24509d.length), 2);
        int i10 = c7972gR.i();
        int iJ = c7972gR.j();
        int iK = c7972gR.k();
        if ((iK > 0 && i10 <= iJ) || (iK < 0 && iJ <= i10)) {
            while (!AbstractC6492s.d(obj, t(i10))) {
                if (i10 != iJ) {
                    i10 += iK;
                }
            }
            return A(i10, fVar);
        }
        return this;
    }

    private final t z(Object obj, Object obj2, f fVar) {
        C7972g c7972gR = AbstractC7978m.r(AbstractC7978m.s(0, this.f24509d.length), 2);
        int i10 = c7972gR.i();
        int iJ = c7972gR.j();
        int iK = c7972gR.k();
        if ((iK > 0 && i10 <= iJ) || (iK < 0 && iJ <= i10)) {
            while (true) {
                if (!AbstractC6492s.d(obj, t(i10)) || !AbstractC6492s.d(obj2, W(i10))) {
                    if (i10 == iJ) {
                        break;
                    }
                    i10 += iK;
                } else {
                    return A(i10, fVar);
                }
            }
        }
        return this;
    }

    public final t D(int i10, Object obj, Object obj2, int i11, f fVar) {
        int iF = 1 << x.f(i10, i11);
        if (q(iF)) {
            int iN = n(iF);
            if (AbstractC6492s.d(obj, t(iN))) {
                fVar.n(W(iN));
                return W(iN) == obj2 ? this : M(iN, obj2, fVar);
            }
            fVar.q(fVar.size() + 1);
            return C(iN, iF, i10, obj, obj2, i11, fVar.j());
        }
        if (!r(iF)) {
            fVar.q(fVar.size() + 1);
            return B(iF, obj, obj2, fVar.j());
        }
        int iO = O(iF);
        t tVarN = N(iO);
        t tVarW = i11 == 30 ? tVarN.w(obj, obj2, fVar) : tVarN.D(i10, obj, obj2, i11 + 5, fVar);
        return tVarN == tVarW ? this : L(iO, tVarW, fVar.j());
    }

    public final t E(t tVar, int i10, C3749b c3749b, f fVar) {
        if (this == tVar) {
            c3749b.b(e());
            return this;
        }
        if (i10 > 30) {
            return x(tVar, c3749b, fVar.j());
        }
        int i11 = this.f24507b | tVar.f24507b;
        int i12 = this.f24506a;
        int i13 = tVar.f24506a;
        int i14 = (i12 ^ i13) & (~i11);
        int i15 = i12 & i13;
        int i16 = i14;
        while (i15 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i15);
            if (AbstractC6492s.d(t(n(iLowestOneBit)), tVar.t(tVar.n(iLowestOneBit)))) {
                i16 |= iLowestOneBit;
            } else {
                i11 |= iLowestOneBit;
            }
            i15 ^= iLowestOneBit;
        }
        int i17 = 0;
        if (!((i11 & i16) == 0)) {
            B0.b("Check failed.");
        }
        t tVar2 = (AbstractC6492s.d(this.f24508c, fVar.j()) && this.f24506a == i16 && this.f24507b == i11) ? this : new t(i16, i11, new Object[(Integer.bitCount(i16) * 2) + Integer.bitCount(i11)]);
        int i18 = i11;
        int i19 = 0;
        while (i18 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i18);
            Object[] objArr = tVar2.f24509d;
            objArr[(objArr.length - 1) - i19] = F(tVar, iLowestOneBit2, i10, c3749b, fVar);
            i19++;
            i18 ^= iLowestOneBit2;
        }
        while (i16 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i16);
            int i20 = i17 * 2;
            if (tVar.q(iLowestOneBit3)) {
                int iN = tVar.n(iLowestOneBit3);
                tVar2.f24509d[i20] = tVar.t(iN);
                tVar2.f24509d[i20 + 1] = tVar.W(iN);
                if (q(iLowestOneBit3)) {
                    c3749b.c(c3749b.a() + 1);
                }
            } else {
                int iN2 = n(iLowestOneBit3);
                tVar2.f24509d[i20] = t(iN2);
                tVar2.f24509d[i20 + 1] = W(iN2);
            }
            i17++;
            i16 ^= iLowestOneBit3;
        }
        return l(tVar2) ? this : tVar.l(tVar2) ? tVar : tVar2;
    }

    public final t G(int i10, Object obj, int i11, f fVar) {
        int iF = 1 << x.f(i10, i11);
        if (q(iF)) {
            int iN = n(iF);
            return AbstractC6492s.d(obj, t(iN)) ? I(iN, iF, fVar) : this;
        }
        if (!r(iF)) {
            return this;
        }
        int iO = O(iF);
        t tVarN = N(iO);
        return K(tVarN, i11 == 30 ? tVarN.y(obj, fVar) : tVarN.G(i10, obj, i11 + 5, fVar), iO, iF, fVar.j());
    }

    public final t H(int i10, Object obj, Object obj2, int i11, f fVar) {
        int iF = 1 << x.f(i10, i11);
        if (q(iF)) {
            int iN = n(iF);
            return (AbstractC6492s.d(obj, t(iN)) && AbstractC6492s.d(obj2, W(iN))) ? I(iN, iF, fVar) : this;
        }
        if (!r(iF)) {
            return this;
        }
        int iO = O(iF);
        t tVarN = N(iO);
        return K(tVarN, i11 == 30 ? tVarN.z(obj, obj2, fVar) : tVarN.H(i10, obj, obj2, i11 + 5, fVar), iO, iF, fVar.j());
    }

    public final t N(int i10) {
        Object obj = this.f24509d[i10];
        AbstractC6492s.g(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (t) obj;
    }

    public final int O(int i10) {
        return (this.f24509d.length - 1) - Integer.bitCount((i10 - 1) & this.f24507b);
    }

    public final b P(int i10, Object obj, Object obj2, int i11) {
        b bVarP;
        int iF = 1 << x.f(i10, i11);
        if (q(iF)) {
            int iN = n(iF);
            if (!AbstractC6492s.d(obj, t(iN))) {
                return v(iN, iF, i10, obj, obj2, i11).b();
            }
            if (W(iN) == obj2) {
                return null;
            }
            return V(iN, obj2).c();
        }
        if (!r(iF)) {
            return s(iF, obj, obj2).b();
        }
        int iO = O(iF);
        t tVarN = N(iO);
        if (i11 == 30) {
            bVarP = tVarN.h(obj, obj2);
            if (bVarP == null) {
                return null;
            }
        } else {
            bVarP = tVarN.P(i10, obj, obj2, i11 + 5);
            if (bVarP == null) {
                return null;
            }
        }
        bVarP.c(U(iO, iF, bVarP.a()));
        return bVarP;
    }

    public final t Q(int i10, Object obj, int i11) {
        int iF = 1 << x.f(i10, i11);
        if (q(iF)) {
            int iN = n(iF);
            return AbstractC6492s.d(obj, t(iN)) ? R(iN, iF) : this;
        }
        if (!r(iF)) {
            return this;
        }
        int iO = O(iF);
        t tVarN = N(iO);
        return T(tVarN, i11 == 30 ? tVarN.i(obj) : tVarN.Q(i10, obj, i11 + 5), iO, iF);
    }

    public final boolean k(int i10, Object obj, int i11) {
        int iF = 1 << x.f(i10, i11);
        if (q(iF)) {
            return AbstractC6492s.d(obj, t(n(iF)));
        }
        if (!r(iF)) {
            return false;
        }
        t tVarN = N(O(iF));
        return i11 == 30 ? tVarN.f(obj) : tVarN.k(i10, obj, i11 + 5);
    }

    public final int m() {
        return Integer.bitCount(this.f24506a);
    }

    public final int n(int i10) {
        return Integer.bitCount((i10 - 1) & this.f24506a) * 2;
    }

    public final Object o(int i10, Object obj, int i11) {
        int iF = 1 << x.f(i10, i11);
        if (q(iF)) {
            int iN = n(iF);
            if (AbstractC6492s.d(obj, t(iN))) {
                return W(iN);
            }
            return null;
        }
        if (!r(iF)) {
            return null;
        }
        t tVarN = N(O(iF));
        return i11 == 30 ? tVarN.g(obj) : tVarN.o(i10, obj, i11 + 5);
    }

    public final Object[] p() {
        return this.f24509d;
    }

    public final boolean q(int i10) {
        return (i10 & this.f24506a) != 0;
    }

    public t(int i10, int i11, Object[] objArr) {
        this(i10, i11, objArr, null);
    }
}

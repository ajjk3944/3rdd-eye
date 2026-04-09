package Ei;

import Zg.Q;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6839p;
import sh.AbstractC7978m;
import sh.C7972g;

/* loaded from: classes4.dex */
public final class t {

    /* renamed from: e, reason: collision with root package name */
    public static final a f4797e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final t f4798f = new t(0, 0, new Object[0]);

    /* renamed from: a, reason: collision with root package name */
    private int f4799a;

    /* renamed from: b, reason: collision with root package name */
    private int f4800b;

    /* renamed from: c, reason: collision with root package name */
    private final Hi.f f4801c;

    /* renamed from: d, reason: collision with root package name */
    private Object[] f4802d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t a() {
            return t.f4798f;
        }

        private a() {
        }
    }

    public t(int i10, int i11, Object[] buffer, Hi.f fVar) {
        AbstractC6492s.i(buffer, "buffer");
        this.f4799a = i10;
        this.f4800b = i11;
        this.f4801c = fVar;
        this.f4802d = buffer;
    }

    private final t A(t tVar, int i10, int i11, Hi.b bVar, f fVar) {
        if (o(i10)) {
            t tVarI = I(J(i10));
            if (tVar.o(i10)) {
                return tVarI.z(tVar.I(tVar.J(i10)), i11 + 5, bVar, fVar);
            }
            if (!tVar.n(i10)) {
                return tVarI;
            }
            int iJ = tVar.j(i10);
            Object objP = tVar.p(iJ);
            Object objK = tVar.K(iJ);
            int size = fVar.size();
            t tVarY = tVarI.y(objP != null ? objP.hashCode() : 0, objP, objK, i11 + 5, fVar);
            if (fVar.size() != size) {
                return tVarY;
            }
            bVar.c(bVar.a() + 1);
            return tVarY;
        }
        if (!tVar.o(i10)) {
            int iJ2 = j(i10);
            Object objP2 = p(iJ2);
            Object objK2 = K(iJ2);
            int iJ3 = tVar.j(i10);
            Object objP3 = tVar.p(iJ3);
            return q(objP2 != null ? objP2.hashCode() : 0, objP2, objK2, objP3 != null ? objP3.hashCode() : 0, objP3, tVar.K(iJ3), i11 + 5, fVar.k());
        }
        t tVarI2 = tVar.I(tVar.J(i10));
        if (n(i10)) {
            int iJ4 = j(i10);
            Object objP4 = p(iJ4);
            int i12 = i11 + 5;
            if (!tVarI2.g(objP4 != null ? objP4.hashCode() : 0, objP4, i12)) {
                return tVarI2.y(objP4 != null ? objP4.hashCode() : 0, objP4, K(iJ4), i12, fVar);
            }
            bVar.c(bVar.a() + 1);
        }
        return tVarI2;
    }

    private final t D(int i10, int i11, f fVar) {
        fVar.r(fVar.size() - 1);
        fVar.q(K(i10));
        if (this.f4802d.length == 2) {
            return null;
        }
        if (this.f4801c != fVar.k()) {
            return new t(i11 ^ this.f4799a, this.f4800b, x.g(this.f4802d, i10), fVar.k());
        }
        this.f4802d = x.g(this.f4802d, i10);
        this.f4799a ^= i11;
        return this;
    }

    private final t E(int i10, int i11, Hi.f fVar) {
        Object[] objArr = this.f4802d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.f4801c != fVar) {
            return new t(this.f4799a, i11 ^ this.f4800b, x.h(objArr, i10), fVar);
        }
        this.f4802d = x.h(objArr, i10);
        this.f4800b ^= i11;
        return this;
    }

    private final t F(t tVar, t tVar2, int i10, int i11, Hi.f fVar) {
        return tVar2 == null ? E(i10, i11, fVar) : tVar != tVar2 ? G(i10, tVar2, fVar) : this;
    }

    private final t G(int i10, t tVar, Hi.f fVar) {
        Hi.a.a(tVar.f4801c == fVar);
        Object[] objArr = this.f4802d;
        if (objArr.length == 1 && tVar.f4802d.length == 2 && tVar.f4800b == 0) {
            tVar.f4799a = this.f4800b;
            return tVar;
        }
        if (this.f4801c == fVar) {
            objArr[i10] = tVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC6492s.h(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10] = tVar;
        return new t(this.f4799a, this.f4800b, objArrCopyOf, fVar);
    }

    private final t H(int i10, Object obj, f fVar) {
        if (this.f4801c == fVar.k()) {
            this.f4802d[i10 + 1] = obj;
            return this;
        }
        fVar.n(fVar.i() + 1);
        Object[] objArr = this.f4802d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC6492s.h(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10 + 1] = obj;
        return new t(this.f4799a, this.f4800b, objArrCopyOf, fVar.k());
    }

    private final Object K(int i10) {
        return this.f4802d[i10 + 1];
    }

    private final Object[] b(int i10, int i11, int i12, Object obj, Object obj2, int i13, Hi.f fVar) {
        Object objP = p(i10);
        return x.i(this.f4802d, i10, J(i11) + 1, q(objP != null ? objP.hashCode() : 0, objP, K(i10), i12, obj, obj2, i13 + 5, fVar));
    }

    private final int c() {
        if (this.f4800b == 0) {
            return this.f4802d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f4799a);
        int length = this.f4802d.length;
        for (int i10 = iBitCount * 2; i10 < length; i10++) {
            iBitCount += I(i10).c();
        }
        return iBitCount;
    }

    private final boolean d(Object obj) {
        return f(obj) != -1;
    }

    private final Object e(Object obj) {
        int iF = f(obj);
        if (iF != -1) {
            return K(iF);
        }
        return null;
    }

    private final int f(Object obj) {
        C7972g c7972gR = AbstractC7978m.r(AbstractC7978m.s(0, this.f4802d.length), 2);
        int i10 = c7972gR.i();
        int iJ = c7972gR.j();
        int iK = c7972gR.k();
        if ((iK <= 0 || i10 > iJ) && (iK >= 0 || iJ > i10)) {
            return -1;
        }
        while (!AbstractC6492s.d(obj, p(i10))) {
            if (i10 == iJ) {
                return -1;
            }
            i10 += iK;
        }
        return i10;
    }

    private final boolean h(t tVar) {
        if (this == tVar) {
            return true;
        }
        if (this.f4800b != tVar.f4800b || this.f4799a != tVar.f4799a) {
            return false;
        }
        int length = this.f4802d.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.f4802d[i10] != tVar.f4802d[i10]) {
                return false;
            }
        }
        return true;
    }

    private final boolean o(int i10) {
        return (i10 & this.f4800b) != 0;
    }

    private final Object p(int i10) {
        return this.f4802d[i10];
    }

    private final t q(int i10, Object obj, Object obj2, int i11, Object obj3, Object obj4, int i12, Hi.f fVar) {
        if (i12 > 30) {
            return new t(0, 0, new Object[]{obj, obj2, obj3, obj4}, fVar);
        }
        int iE = x.e(i10, i12);
        int iE2 = x.e(i11, i12);
        if (iE != iE2) {
            return new t((1 << iE) | (1 << iE2), 0, iE < iE2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, fVar);
        }
        return new t(0, 1 << iE, new Object[]{q(i10, obj, obj2, i11, obj3, obj4, i12 + 5, fVar)}, fVar);
    }

    private final t r(Object obj, Object obj2, f fVar) {
        int iF = f(obj);
        if (iF == -1) {
            fVar.r(fVar.size() + 1);
            return new t(0, 0, x.f(this.f4802d, 0, obj, obj2), fVar.k());
        }
        fVar.q(K(iF));
        if (this.f4801c == fVar.k()) {
            this.f4802d[iF + 1] = obj2;
            return this;
        }
        fVar.n(fVar.i() + 1);
        Object[] objArr = this.f4802d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC6492s.h(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[iF + 1] = obj2;
        return new t(0, 0, objArrCopyOf, fVar.k());
    }

    private final t s(t tVar, Hi.b bVar, Hi.f fVar) {
        Hi.a.a(this.f4800b == 0);
        Hi.a.a(this.f4799a == 0);
        Hi.a.a(tVar.f4800b == 0);
        Hi.a.a(tVar.f4799a == 0);
        Object[] objArr = this.f4802d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + tVar.f4802d.length);
        AbstractC6492s.h(objArrCopyOf, "copyOf(...)");
        int length = this.f4802d.length;
        C7972g c7972gR = AbstractC7978m.r(AbstractC7978m.s(0, tVar.f4802d.length), 2);
        int i10 = c7972gR.i();
        int iJ = c7972gR.j();
        int iK = c7972gR.k();
        if ((iK > 0 && i10 <= iJ) || (iK < 0 && iJ <= i10)) {
            while (true) {
                if (d(tVar.f4802d[i10])) {
                    bVar.c(bVar.a() + 1);
                } else {
                    Object[] objArr2 = tVar.f4802d;
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
        if (length == this.f4802d.length) {
            return this;
        }
        if (length == tVar.f4802d.length) {
            return tVar;
        }
        if (length == objArrCopyOf.length) {
            return new t(0, 0, objArrCopyOf, fVar);
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
        AbstractC6492s.h(objArrCopyOf2, "copyOf(...)");
        return new t(0, 0, objArrCopyOf2, fVar);
    }

    private final t t(Object obj, f fVar) {
        int iF = f(obj);
        return iF != -1 ? v(iF, fVar) : this;
    }

    private final t u(Object obj, Object obj2, f fVar) {
        int iF = f(obj);
        return (iF == -1 || !AbstractC6492s.d(obj2, K(iF))) ? this : v(iF, fVar);
    }

    private final t v(int i10, f fVar) {
        fVar.r(fVar.size() - 1);
        fVar.q(K(i10));
        if (this.f4802d.length == 2) {
            return null;
        }
        if (this.f4801c != fVar.k()) {
            return new t(0, 0, x.g(this.f4802d, i10), fVar.k());
        }
        this.f4802d = x.g(this.f4802d, i10);
        return this;
    }

    private final t w(int i10, Object obj, Object obj2, Hi.f fVar) {
        int iJ = j(i10);
        if (this.f4801c != fVar) {
            return new t(i10 | this.f4799a, this.f4800b, x.f(this.f4802d, iJ, obj, obj2), fVar);
        }
        this.f4802d = x.f(this.f4802d, iJ, obj, obj2);
        this.f4799a = i10 | this.f4799a;
        return this;
    }

    private final t x(int i10, int i11, int i12, Object obj, Object obj2, int i13, Hi.f fVar) {
        if (this.f4801c != fVar) {
            return new t(this.f4799a ^ i11, i11 | this.f4800b, b(i10, i11, i12, obj, obj2, i13, fVar), fVar);
        }
        this.f4802d = b(i10, i11, i12, obj, obj2, i13, fVar);
        this.f4799a ^= i11;
        this.f4800b |= i11;
        return this;
    }

    public final t B(int i10, Object obj, int i11, f mutator) {
        AbstractC6492s.i(mutator, "mutator");
        int iE = 1 << x.e(i10, i11);
        if (n(iE)) {
            int iJ = j(iE);
            return AbstractC6492s.d(obj, p(iJ)) ? D(iJ, iE, mutator) : this;
        }
        if (!o(iE)) {
            return this;
        }
        int iJ2 = J(iE);
        t tVarI = I(iJ2);
        return F(tVarI, i11 == 30 ? tVarI.t(obj, mutator) : tVarI.B(i10, obj, i11 + 5, mutator), iJ2, iE, mutator.k());
    }

    public final t C(int i10, Object obj, Object obj2, int i11, f mutator) {
        AbstractC6492s.i(mutator, "mutator");
        int iE = 1 << x.e(i10, i11);
        if (n(iE)) {
            int iJ = j(iE);
            return (AbstractC6492s.d(obj, p(iJ)) && AbstractC6492s.d(obj2, K(iJ))) ? D(iJ, iE, mutator) : this;
        }
        if (!o(iE)) {
            return this;
        }
        int iJ2 = J(iE);
        t tVarI = I(iJ2);
        return F(tVarI, i11 == 30 ? tVarI.u(obj, obj2, mutator) : tVarI.C(i10, obj, obj2, i11 + 5, mutator), iJ2, iE, mutator.k());
    }

    public final t I(int i10) {
        Object obj = this.f4802d[i10];
        AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (t) obj;
    }

    public final int J(int i10) {
        return (this.f4802d.length - 1) - Integer.bitCount((i10 - 1) & this.f4800b);
    }

    public final boolean g(int i10, Object obj, int i11) {
        int iE = 1 << x.e(i10, i11);
        if (n(iE)) {
            return AbstractC6492s.d(obj, p(j(iE)));
        }
        if (!o(iE)) {
            return false;
        }
        t tVarI = I(J(iE));
        return i11 == 30 ? tVarI.d(obj) : tVarI.g(i10, obj, i11 + 5);
    }

    public final int i() {
        return Integer.bitCount(this.f4799a);
    }

    public final int j(int i10) {
        return Integer.bitCount((i10 - 1) & this.f4799a) * 2;
    }

    public final boolean k(t that, InterfaceC6839p equalityComparator) {
        int i10;
        AbstractC6492s.i(that, "that");
        AbstractC6492s.i(equalityComparator, "equalityComparator");
        if (this == that) {
            return true;
        }
        int i11 = this.f4799a;
        if (i11 != that.f4799a || (i10 = this.f4800b) != that.f4800b) {
            return false;
        }
        if (i11 == 0 && i10 == 0) {
            Object[] objArr = this.f4802d;
            if (objArr.length != that.f4802d.length) {
                return false;
            }
            Iterable iterableR = AbstractC7978m.r(AbstractC7978m.s(0, objArr.length), 2);
            if ((iterableR instanceof Collection) && ((Collection) iterableR).isEmpty()) {
                return true;
            }
            Iterator it = iterableR.iterator();
            while (it.hasNext()) {
                int iD = ((Q) it).d();
                Object objP = that.p(iD);
                Object objK = that.K(iD);
                int iF = f(objP);
                if (!(iF != -1 ? ((Boolean) equalityComparator.invoke(K(iF), objK)).booleanValue() : false)) {
                    return false;
                }
            }
            return true;
        }
        int iBitCount = Integer.bitCount(i11) * 2;
        C7972g c7972gR = AbstractC7978m.r(AbstractC7978m.s(0, iBitCount), 2);
        int i12 = c7972gR.i();
        int iJ = c7972gR.j();
        int iK = c7972gR.k();
        if ((iK > 0 && i12 <= iJ) || (iK < 0 && iJ <= i12)) {
            while (AbstractC6492s.d(p(i12), that.p(i12)) && ((Boolean) equalityComparator.invoke(K(i12), that.K(i12))).booleanValue()) {
                if (i12 != iJ) {
                    i12 += iK;
                }
            }
            return false;
        }
        int length = this.f4802d.length;
        while (iBitCount < length) {
            if (!I(iBitCount).k(that.I(iBitCount), equalityComparator)) {
                return false;
            }
            iBitCount++;
        }
        return true;
    }

    public final Object l(int i10, Object obj, int i11) {
        int iE = 1 << x.e(i10, i11);
        if (n(iE)) {
            int iJ = j(iE);
            if (AbstractC6492s.d(obj, p(iJ))) {
                return K(iJ);
            }
            return null;
        }
        if (!o(iE)) {
            return null;
        }
        t tVarI = I(J(iE));
        return i11 == 30 ? tVarI.e(obj) : tVarI.l(i10, obj, i11 + 5);
    }

    public final Object[] m() {
        return this.f4802d;
    }

    public final boolean n(int i10) {
        return (i10 & this.f4799a) != 0;
    }

    public final t y(int i10, Object obj, Object obj2, int i11, f mutator) {
        AbstractC6492s.i(mutator, "mutator");
        int iE = 1 << x.e(i10, i11);
        if (n(iE)) {
            int iJ = j(iE);
            if (AbstractC6492s.d(obj, p(iJ))) {
                mutator.q(K(iJ));
                return K(iJ) == obj2 ? this : H(iJ, obj2, mutator);
            }
            mutator.r(mutator.size() + 1);
            return x(iJ, iE, i10, obj, obj2, i11, mutator.k());
        }
        if (!o(iE)) {
            mutator.r(mutator.size() + 1);
            return w(iE, obj, obj2, mutator.k());
        }
        int iJ2 = J(iE);
        t tVarI = I(iJ2);
        t tVarR = i11 == 30 ? tVarI.r(obj, obj2, mutator) : tVarI.y(i10, obj, obj2, i11 + 5, mutator);
        return tVarI == tVarR ? this : G(iJ2, tVarR, mutator.k());
    }

    public final t z(t otherNode, int i10, Hi.b intersectionCounter, f mutator) {
        AbstractC6492s.i(otherNode, "otherNode");
        AbstractC6492s.i(intersectionCounter, "intersectionCounter");
        AbstractC6492s.i(mutator, "mutator");
        if (this == otherNode) {
            intersectionCounter.b(c());
            return this;
        }
        if (i10 > 30) {
            return s(otherNode, intersectionCounter, mutator.k());
        }
        int i11 = this.f4800b | otherNode.f4800b;
        int i12 = this.f4799a;
        int i13 = otherNode.f4799a;
        int i14 = (i12 ^ i13) & (~i11);
        int i15 = i12 & i13;
        int i16 = i14;
        while (i15 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i15);
            if (AbstractC6492s.d(p(j(iLowestOneBit)), otherNode.p(otherNode.j(iLowestOneBit)))) {
                i16 |= iLowestOneBit;
            } else {
                i11 |= iLowestOneBit;
            }
            i15 ^= iLowestOneBit;
        }
        if ((i11 & i16) != 0) {
            throw new IllegalStateException("Check failed.");
        }
        t tVar = (AbstractC6492s.d(this.f4801c, mutator.k()) && this.f4799a == i16 && this.f4800b == i11) ? this : new t(i16, i11, new Object[(Integer.bitCount(i16) * 2) + Integer.bitCount(i11)]);
        int i17 = 0;
        int i18 = i11;
        int i19 = 0;
        while (i18 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i18);
            tVar.f4802d[(r5.length - 1) - i19] = A(otherNode, iLowestOneBit2, i10, intersectionCounter, mutator);
            i19++;
            i18 ^= iLowestOneBit2;
        }
        while (i16 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i16);
            int i20 = i17 * 2;
            if (otherNode.n(iLowestOneBit3)) {
                int iJ = otherNode.j(iLowestOneBit3);
                tVar.f4802d[i20] = otherNode.p(iJ);
                tVar.f4802d[i20 + 1] = otherNode.K(iJ);
                if (n(iLowestOneBit3)) {
                    intersectionCounter.c(intersectionCounter.a() + 1);
                }
            } else {
                int iJ2 = j(iLowestOneBit3);
                tVar.f4802d[i20] = p(iJ2);
                tVar.f4802d[i20 + 1] = K(iJ2);
            }
            i17++;
            i16 ^= iLowestOneBit3;
        }
        return h(tVar) ? this : otherNode.h(tVar) ? otherNode : tVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(int i10, int i11, Object[] buffer) {
        this(i10, i11, buffer, null);
        AbstractC6492s.i(buffer, "buffer");
    }
}

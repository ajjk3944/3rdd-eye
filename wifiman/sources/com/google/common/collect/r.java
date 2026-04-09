package com.google.common.collect;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import m4.AbstractC6769h;

/* loaded from: classes3.dex */
public abstract class r extends AbstractC5068n implements Set {

    /* renamed from: b, reason: collision with root package name */
    private transient AbstractC5069o f38412b;

    r() {
    }

    private static r C(int i10, Object... objArr) {
        if (i10 == 0) {
            return b0();
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return q0(obj);
        }
        int iY = y(i10);
        Object[] objArr2 = new Object[iY];
        int i11 = iY - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object objA = F.a(objArr[i14], i14);
            int iHashCode = objA.hashCode();
            int iB = AbstractC5067m.b(iHashCode);
            while (true) {
                int i15 = iB & i11;
                Object obj2 = objArr2[i15];
                if (obj2 == null) {
                    objArr[i13] = objA;
                    objArr2[i15] = objA;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (obj2.equals(objA)) {
                    break;
                }
                iB++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new N(obj3);
        }
        if (y(i13) < iY / 2) {
            return C(i13, objArr);
        }
        if (N0(i13, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new K(objArr, i12, objArr2, i11, i13);
    }

    public static r F(Collection collection) {
        if ((collection instanceof r) && !(collection instanceof SortedSet)) {
            r rVar = (r) collection;
            if (!rVar.s()) {
                return rVar;
            }
        }
        Object[] array = collection.toArray();
        return C(array.length, array);
    }

    public static r K0(Object obj, Object obj2, Object obj3) {
        return C(3, obj, obj2, obj3);
    }

    public static r M0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        AbstractC6769h.e(objArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return C(length, objArr2);
    }

    private static boolean N0(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    public static r b0() {
        return K.f38339i;
    }

    public static r q0(Object obj) {
        return new N(obj);
    }

    static int y(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            AbstractC6769h.e(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (iHighestOneBit * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    AbstractC5069o J() {
        return AbstractC5069o.v(toArray());
    }

    boolean S() {
        return false;
    }

    /* renamed from: T */
    public abstract S iterator();

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof r) && S() && ((r) obj).S() && hashCode() != obj.hashCode()) {
            return false;
        }
        return M.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return M.b(this);
    }

    public AbstractC5069o v() {
        AbstractC5069o abstractC5069o = this.f38412b;
        if (abstractC5069o != null) {
            return abstractC5069o;
        }
        AbstractC5069o abstractC5069oJ = J();
        this.f38412b = abstractC5069oJ;
        return abstractC5069oJ;
    }
}

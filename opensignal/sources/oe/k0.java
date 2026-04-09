package oe;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class k0 extends c0 implements Set {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f19344g = 0;

    /* renamed from: d, reason: collision with root package name */
    public transient h0 f19345d;

    public static int k(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (iHighestOneBit * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static k0 l(int i10, Object... objArr) {
        if (i10 == 0) {
            return a1.F;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new g1(obj);
        }
        int iK = k(i10);
        Object[] objArr2 = new Object[iK];
        int i11 = iK - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object obj2 = objArr[i14];
            if (obj2 == null) {
                throw new NullPointerException(w.g.e("at index ", 20, i14));
            }
            int iHashCode = obj2.hashCode();
            int iR = s.r(iHashCode);
            while (true) {
                int i15 = iR & i11;
                Object obj3 = objArr2[i15];
                if (obj3 == null) {
                    objArr[i13] = obj2;
                    objArr2[i15] = obj2;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iR++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new g1(obj4);
        }
        if (k(i13) < iK / 2) {
            return l(i13, objArr);
        }
        int length = objArr.length;
        if (i13 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new a1(i12, i11, i13, objArr, objArr2);
    }

    public static k0 m(Collection collection) {
        if ((collection instanceof k0) && !(collection instanceof SortedSet)) {
            k0 k0Var = (k0) collection;
            if (!k0Var.g()) {
                return k0Var;
            }
        }
        Object[] array = collection.toArray();
        return l(array.length, array);
    }

    @Override // oe.c0
    public h0 a() {
        h0 h0Var = this.f19345d;
        if (h0Var != null) {
            return h0Var;
        }
        h0 h0VarN = n();
        this.f19345d = h0VarN;
        return h0VarN;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof k0) && (this instanceof a1) && (((k0) obj) instanceof a1) && hashCode() != obj.hashCode()) {
            return false;
        }
        return s.f(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return s.k(this);
    }

    public h0 n() {
        Object[] array = toArray(c0.f19308a);
        f0 f0Var = h0.f19336d;
        return h0.k(array.length, array);
    }
}

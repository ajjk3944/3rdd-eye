package defpackage;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class dn3 extends tm3 implements Set {
    public static final /* synthetic */ int h = 0;
    public transient xm3 g;

    public static dn3 h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        int length = objArr.length;
        int i = length + 6;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return m(objArr2, i);
    }

    public static int i(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            zt0.M("collection too large", iMax < 1073741824);
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (iHighestOneBit * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static dn3 j(Set set) {
        if ((set instanceof dn3) && !(set instanceof SortedSet)) {
            dn3 dn3Var = (dn3) set;
            if (!dn3Var.f()) {
                return dn3Var;
            }
        }
        Object[] array = set.toArray();
        return m(array, array.length);
    }

    public static cn3 l(int i) {
        ob1.z("expectedSize", i);
        cn3 cn3Var = new cn3(i);
        cn3Var.d = new Object[i(i)];
        return cn3Var;
    }

    public static dn3 m(Object[] objArr, int i) {
        if (i == 0) {
            return yn3.o;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new en3(obj);
        }
        int i2 = i(i);
        Object[] objArr2 = new Object[i2];
        int i3 = i2 - 1;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            Object obj2 = objArr[i6];
            wl2.K(i6, obj2);
            int iHashCode = obj2.hashCode();
            int iU = g82.u(iHashCode);
            while (true) {
                int i7 = iU & i3;
                Object obj3 = objArr2[i7];
                if (obj3 == null) {
                    objArr[i5] = obj2;
                    objArr2[i7] = obj2;
                    i4 += iHashCode;
                    i5++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iU++;
                }
            }
        }
        Arrays.fill(objArr, i5, i, (Object) null);
        if (i5 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new en3(obj4);
        }
        if (i(i5) < i2 / 2) {
            return m(objArr, i5);
        }
        int length = objArr.length;
        if (i5 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i5);
        }
        return new yn3(i4, i3, i5, objArr, objArr2);
    }

    @Override // defpackage.tm3
    public xm3 e() {
        xm3 xm3Var = this.g;
        if (xm3Var != null) {
            return xm3Var;
        }
        xm3 xm3VarK = k();
        this.g = xm3VarK;
        return xm3VarK;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof dn3) && (this instanceof yn3) && (((dn3) obj) instanceof yn3) && hashCode() != obj.hashCode()) {
            return false;
        }
        return m54.U(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return m54.N(this);
    }

    public xm3 k() {
        Object[] array = toArray(tm3.f);
        vm3 vm3Var = xm3.g;
        return xm3.o(array, array.length);
    }
}

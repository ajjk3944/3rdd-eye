package Y2;

import com.google.android.gms.internal.ads.AbstractC1135f5;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class G extends C implements Set, j$.util.Set {

    /* renamed from: b, reason: collision with root package name */
    public transient F f4262b;

    public static int e(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (iHighestOneBit * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static G f(int i, Object... objArr) {
        if (i == 0) {
            return J.i;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new K(obj);
        }
        int iE = e(i);
        Object[] objArr2 = new Object[iE];
        int i3 = iE - 1;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i; i8++) {
            Object obj2 = objArr[i8];
            if (obj2 == null) {
                throw new NullPointerException(AbstractC1135f5.l(i8, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iRotateLeft = (int) (Integer.rotateLeft((int) (iHashCode * (-862048943)), 15) * 461845907);
            while (true) {
                int i9 = iRotateLeft & i3;
                Object obj3 = objArr2[i9];
                if (obj3 == null) {
                    objArr[i7] = obj2;
                    objArr2[i9] = obj2;
                    i6 += iHashCode;
                    i7++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iRotateLeft++;
                }
            }
        }
        Arrays.fill(objArr, i7, i, (Object) null);
        if (i7 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new K(obj4);
        }
        if (e(i7) < iE / 2) {
            return f(i7, objArr);
        }
        if (i7 < 3) {
            objArr = Arrays.copyOf(objArr, i7);
        }
        return new J(i6, i3, i7, objArr, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof G) && (this instanceof J)) {
            G g2 = (G) obj;
            g2.getClass();
            if ((g2 instanceof J) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public abstract int hashCode();
}

package ud;

import com.google.android.gms.internal.measurement.z3;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class f extends a implements Set {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f35302c = 0;

    /* renamed from: b, reason: collision with root package name */
    public transient d f35303b;

    public static int i(int i4) {
        int iMax = Math.max(i4, 2);
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

    public static f j(Object[] objArr, int i4) {
        if (i4 == 0) {
            return n.j;
        }
        if (i4 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new o(obj);
        }
        int i10 = i(i4);
        Object[] objArr2 = new Object[i10];
        int i11 = i10 - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i4; i14++) {
            Object obj2 = objArr[i14];
            if (obj2 == null) {
                StringBuilder sb2 = new StringBuilder(20);
                sb2.append("at index ");
                sb2.append(i14);
                throw new NullPointerException(sb2.toString());
            }
            int iHashCode = obj2.hashCode();
            int iV = z3.v(iHashCode);
            while (true) {
                int i15 = iV & i11;
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
                iV++;
            }
        }
        Arrays.fill(objArr, i13, i4, (Object) null);
        if (i13 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new o(obj4);
        }
        if (i(i13) < i10 / 2) {
            return j(objArr, i13);
        }
        int length = objArr.length;
        if (i13 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new n(i12, i11, i13, objArr, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof f) && (this instanceof n) && (((f) obj) instanceof n) && hashCode() != obj.hashCode()) {
            return false;
        }
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (size() == set.size()) {
                        if (containsAll(set)) {
                        }
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public d g() {
        d dVar = this.f35303b;
        if (dVar != null) {
            return dVar;
        }
        d dVarK = k();
        this.f35303b = dVarK;
        return dVarK;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i4 = ~(~(i4 + (next != null ? next.hashCode() : 0)));
        }
        return i4;
    }

    public d k() {
        Object[] array = toArray(a.f35291a);
        b bVar = d.f35298b;
        return d.g(array, array.length);
    }
}

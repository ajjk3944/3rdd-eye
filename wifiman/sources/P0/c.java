package P0;

import Zg.AbstractC3682n;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private int[] f18006a;

    /* renamed from: b, reason: collision with root package name */
    private Object[] f18007b;

    /* renamed from: c, reason: collision with root package name */
    private int f18008c;

    public c(int i10) {
        if (i10 == 0) {
            this.f18006a = a.f17994a;
            this.f18007b = a.f17995b;
        } else {
            this.f18006a = new int[i10];
            this.f18007b = new Object[i10 << 1];
        }
        this.f18008c = 0;
    }

    public final boolean a(Object obj) {
        return d(obj) >= 0;
    }

    public final Object b(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.f18007b[(iD << 1) + 1];
        }
        return null;
    }

    protected final int c(Object obj, int i10) {
        int i11 = this.f18008c;
        if (i11 == 0) {
            return -1;
        }
        int iA = a.a(this.f18006a, i11, i10);
        if (iA < 0 || AbstractC6492s.d(obj, this.f18007b[iA << 1])) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.f18006a[i12] == i10) {
            if (AbstractC6492s.d(obj, this.f18007b[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.f18006a[i13] == i10; i13--) {
            if (AbstractC6492s.d(obj, this.f18007b[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj, obj.hashCode());
    }

    protected final int e() {
        int i10 = this.f18008c;
        if (i10 == 0) {
            return -1;
        }
        int iA = a.a(this.f18006a, i10, 0);
        if (iA < 0 || this.f18007b[iA << 1] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f18006a[i11] == 0) {
            if (this.f18007b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f18006a[i12] == 0; i12--) {
            if (this.f18007b[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof c) {
                c cVar = (c) obj;
                int i10 = this.f18008c;
                if (i10 != cVar.f18008c) {
                    return false;
                }
                for (int i11 = 0; i11 < i10; i11++) {
                    Object objG = g(i11);
                    Object objI = i(i11);
                    Object objB = cVar.b(objG);
                    if (objI == null) {
                        if (objB != null || !cVar.a(objG)) {
                            return false;
                        }
                    } else if (!AbstractC6492s.d(objI, objB)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f18008c != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f18008c;
            for (int i13 = 0; i13 < i12; i13++) {
                Object objG2 = g(i13);
                Object objI2 = i(i13);
                Object obj2 = ((Map) obj).get(objG2);
                if (objI2 == null) {
                    if (obj2 != null || !((Map) obj).containsKey(objG2)) {
                        return false;
                    }
                } else if (!AbstractC6492s.d(objI2, obj2)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final boolean f() {
        return this.f18008c <= 0;
    }

    public final Object g(int i10) {
        return this.f18007b[i10 << 1];
    }

    public final Object h(Object obj, Object obj2) {
        int iHashCode;
        int iC;
        int i10 = this.f18008c;
        if (obj == null) {
            iC = e();
            iHashCode = 0;
        } else {
            iHashCode = obj.hashCode();
            iC = c(obj, iHashCode);
        }
        if (iC >= 0) {
            int i11 = (iC << 1) + 1;
            Object[] objArr = this.f18007b;
            Object obj3 = objArr[i11];
            objArr[i11] = obj2;
            return obj3;
        }
        int i12 = ~iC;
        int[] iArr = this.f18006a;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            AbstractC6492s.h(iArrCopyOf, "copyOf(this, newSize)");
            this.f18006a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f18007b, i13 << 1);
            AbstractC6492s.h(objArrCopyOf, "copyOf(this, newSize)");
            this.f18007b = objArrCopyOf;
            if (i10 != this.f18008c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f18006a;
            int i14 = i12 + 1;
            AbstractC3682n.k(iArr2, iArr2, i14, i12, i10);
            Object[] objArr2 = this.f18007b;
            AbstractC3682n.m(objArr2, objArr2, i14 << 1, i12 << 1, this.f18008c << 1);
        }
        int i15 = this.f18008c;
        if (i10 == i15) {
            int[] iArr3 = this.f18006a;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.f18007b;
                int i16 = i12 << 1;
                objArr3[i16] = obj;
                objArr3[i16 + 1] = obj2;
                this.f18008c = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public int hashCode() {
        int[] iArr = this.f18006a;
        Object[] objArr = this.f18007b;
        int i10 = this.f18008c;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    public final Object i(int i10) {
        return this.f18007b[(i10 << 1) + 1];
    }

    public String toString() {
        if (f()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f18008c * 28);
        sb2.append('{');
        int i10 = this.f18008c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object objG = g(i11);
            if (objG != this) {
                sb2.append(objG);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object objI = i(i11);
            if (objI != this) {
                sb2.append(objI);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public /* synthetic */ c(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}

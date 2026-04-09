package u;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public int[] f23107a;

    /* renamed from: b, reason: collision with root package name */
    public int f23108b;

    public s(int i10) {
        this.f23107a = i10 == 0 ? l.f23088a : new int[i10];
    }

    public final void a(int i10) {
        int i11 = this.f23108b + 1;
        int[] iArr = this.f23107a;
        if (iArr.length < i11) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i11, (iArr.length * 3) / 2));
            br.l.d(iArrCopyOf, "copyOf(...)");
            this.f23107a = iArrCopyOf;
        }
        int[] iArr2 = this.f23107a;
        int i12 = this.f23108b;
        iArr2[i12] = i10;
        this.f23108b = i12 + 1;
    }

    public final int b(int i10) {
        if (i10 >= 0 && i10 < this.f23108b) {
            return this.f23107a[i10];
        }
        v.a.d("Index must be between 0 and size");
        throw null;
    }

    public final void c(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f23108b)) {
            v.a.d("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f23107a;
        int i12 = iArr[i10];
        if (i10 != i11 - 1) {
            mq.l.b0(i10, i10 + 1, i11, iArr, iArr);
        }
        this.f23108b--;
    }

    public final void d(int i10, int i11) {
        if (i10 < 0 || i10 >= this.f23108b) {
            v.a.d("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f23107a;
        int i12 = iArr[i10];
        iArr[i10] = i11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            s sVar = (s) obj;
            int i10 = sVar.f23108b;
            int i11 = this.f23108b;
            if (i10 == i11) {
                int[] iArr = this.f23107a;
                int[] iArr2 = sVar.f23107a;
                hr.d dVarT = vc.e.T(0, i11);
                int i12 = dVarT.f10863a;
                int i13 = dVarT.f10864d;
                if (i12 > i13) {
                    return true;
                }
                while (iArr[i12] == iArr2[i12]) {
                    if (i12 == i13) {
                        return true;
                    }
                    i12++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f23107a;
        int i10 = this.f23108b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += Integer.hashCode(iArr[i11]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        int[] iArr = this.f23107a;
        int i10 = this.f23108b;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                sb2.append((CharSequence) "]");
                break;
            }
            int i12 = iArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i11 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append(i12);
            i11++;
        }
        String string = sb2.toString();
        br.l.d(string, "toString(...)");
        return string;
    }

    public /* synthetic */ s() {
        this(16);
    }
}

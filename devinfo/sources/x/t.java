package x;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public int[] f36944a;

    /* renamed from: b, reason: collision with root package name */
    public int f36945b;

    public t(int i4) {
        this.f36944a = i4 == 0 ? l.f36913a : new int[i4];
    }

    public final void a(int i4) {
        int i10 = this.f36945b + 1;
        int[] iArr = this.f36944a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i10, (iArr.length * 3) / 2));
            nk.k.d(iArrCopyOf, "copyOf(...)");
            this.f36944a = iArrCopyOf;
        }
        int[] iArr2 = this.f36944a;
        int i11 = this.f36945b;
        iArr2[i11] = i4;
        this.f36945b = i11 + 1;
    }

    public final int b(int i4) {
        if (i4 >= 0 && i4 < this.f36945b) {
            return this.f36944a[i4];
        }
        y.a.d("Index must be between 0 and size");
        throw null;
    }

    public final void c(int i4) {
        int i10;
        if (i4 < 0 || i4 >= (i10 = this.f36945b)) {
            y.a.d("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f36944a;
        int i11 = iArr[i4];
        if (i4 != i10 - 1) {
            zj.m.M(i4, i4 + 1, i10, iArr, iArr);
        }
        this.f36945b--;
    }

    public final void d(int i4, int i10) {
        if (i4 < 0 || i4 >= this.f36945b) {
            y.a.d("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f36944a;
        int i11 = iArr[i4];
        iArr[i4] = i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            t tVar = (t) obj;
            int i4 = tVar.f36945b;
            int i10 = this.f36945b;
            if (i4 == i10) {
                int[] iArr = this.f36944a;
                int[] iArr2 = tVar.f36944a;
                sk.d dVarE = ci.b.E(0, i10);
                int i11 = dVarE.f33817a;
                int i12 = dVarE.f33818b;
                if (i11 > i12) {
                    return true;
                }
                while (iArr[i11] == iArr2[i11]) {
                    if (i11 == i12) {
                        return true;
                    }
                    i11++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f36944a;
        int i4 = this.f36945b;
        int i10 = 0;
        for (int i11 = 0; i11 < i4; i11++) {
            i10 += iArr[i11] * 31;
        }
        return i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        int[] iArr = this.f36944a;
        int i4 = this.f36945b;
        int i10 = 0;
        while (true) {
            if (i10 >= i4) {
                sb2.append((CharSequence) "]");
                break;
            }
            int i11 = iArr[i10];
            if (i10 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i10 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append(i11);
            i10++;
        }
        String string = sb2.toString();
        nk.k.d(string, "toString(...)");
        return string;
    }

    public /* synthetic */ t() {
        this(16);
    }
}

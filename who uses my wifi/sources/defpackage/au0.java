package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class au0 extends jc {
    public final transient byte[][] k;
    public final transient int[] l;

    public au0(ac acVar, int i) {
        super(null);
        j41.a(acVar.g, 0L, i);
        xt0 xt0Var = acVar.f;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = xt0Var.c;
            int i6 = xt0Var.b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            xt0Var = xt0Var.f;
        }
        this.k = new byte[i4][];
        this.l = new int[i4 * 2];
        xt0 xt0Var2 = acVar.f;
        int i7 = 0;
        while (i2 < i) {
            byte[][] bArr = this.k;
            bArr[i7] = xt0Var2.a;
            int i8 = xt0Var2.c;
            int i9 = xt0Var2.b;
            int i10 = (i8 - i9) + i2;
            i2 = i10 > i ? i : i10;
            int[] iArr = this.l;
            iArr[i7] = i2;
            iArr[bArr.length + i7] = i9;
            xt0Var2.d = true;
            i7++;
            xt0Var2 = xt0Var2.f;
        }
    }

    @Override // defpackage.jc
    public final byte b(int i) {
        byte[][] bArr = this.k;
        int length = bArr.length - 1;
        int[] iArr = this.l;
        j41.a(iArr[length], i, 1L);
        int iJ = j(i);
        return bArr[iJ][(i - (iJ == 0 ? 0 : iArr[iJ - 1])) + iArr[bArr.length + iJ]];
    }

    @Override // defpackage.jc
    public final String c() {
        return new jc(k()).c();
    }

    @Override // defpackage.jc
    public final byte[] d() {
        return k();
    }

    @Override // defpackage.jc
    public final boolean e(int i, int i2, int i3, byte[] bArr) {
        if (i >= 0 && i <= g() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
            int iJ = j(i);
            while (i3 > 0) {
                int[] iArr = this.l;
                int i4 = iJ == 0 ? 0 : iArr[iJ - 1];
                int iMin = Math.min(i3, ((iArr[iJ] - i4) + i4) - i);
                byte[][] bArr2 = this.k;
                int i5 = (i - i4) + iArr[bArr2.length + iJ];
                byte[] bArr3 = bArr2[iJ];
                Charset charset = j41.a;
                for (int i6 = 0; i6 < iMin; i6++) {
                    if (bArr3[i6 + i5] == bArr[i6 + i2]) {
                    }
                }
                i += iMin;
                i2 += iMin;
                i3 -= iMin;
                iJ++;
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.jc
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jc)) {
            return false;
        }
        jc jcVar = (jc) obj;
        return jcVar.g() == g() && f(jcVar, g());
    }

    @Override // defpackage.jc
    public final boolean f(jc jcVar, int i) {
        if (g() - i >= 0) {
            int iJ = j(0);
            int i2 = 0;
            int i3 = 0;
            while (i > 0) {
                int[] iArr = this.l;
                int i4 = iJ == 0 ? 0 : iArr[iJ - 1];
                int iMin = Math.min(i, ((iArr[iJ] - i4) + i4) - i2);
                byte[][] bArr = this.k;
                if (jcVar.e(i3, (i2 - i4) + iArr[bArr.length + iJ], iMin, bArr[iJ])) {
                    i2 += iMin;
                    i3 += iMin;
                    i -= iMin;
                    iJ++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.jc
    public final int g() {
        return this.l[this.k.length - 1];
    }

    @Override // defpackage.jc
    public final jc h() {
        return new jc(k()).h();
    }

    @Override // defpackage.jc
    public final int hashCode() {
        int i = this.g;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.k;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            byte[] bArr2 = bArr[i2];
            int[] iArr = this.l;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.g = i3;
        return i3;
    }

    @Override // defpackage.jc
    public final String i() {
        return new jc(k()).i();
    }

    public final int j(int i) {
        int iBinarySearch = Arrays.binarySearch(this.l, 0, this.k.length, i + 1);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    public final byte[] k() {
        byte[][] bArr = this.k;
        int length = bArr.length - 1;
        int[] iArr = this.l;
        byte[] bArr2 = new byte[iArr[length]];
        int length2 = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length2) {
            int i3 = iArr[length2 + i];
            int i4 = iArr[i];
            System.arraycopy(bArr[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    @Override // defpackage.jc
    public final String toString() {
        return new jc(k()).toString();
    }
}

package com.bytedance.sdk.component.ypw.emc.ypw;

import java.util.Arrays;

/* loaded from: classes.dex */
final class uym extends dg {
    final transient int[] msw;
    final transient byte[][] uym;

    public uym(emc emcVar, int i) {
        super(null);
        zz.emc(emcVar.ypw, 0L, i);
        bw bwVar = emcVar.emc;
        int i3 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i) {
            int i8 = bwVar.xq;
            int i9 = bwVar.ypw;
            if (i8 == i9) {
                throw new AssertionError("s.limit == s.pos");
            }
            i6 += i8 - i9;
            i7++;
            bwVar = bwVar.ycc;
        }
        this.uym = new byte[i7][];
        this.msw = new int[i7 * 2];
        bw bwVar2 = emcVar.emc;
        int i10 = 0;
        while (i3 < i) {
            byte[][] bArr = this.uym;
            bArr[i10] = bwVar2.emc;
            int i11 = bwVar2.xq;
            int i12 = bwVar2.ypw;
            int i13 = (i11 - i12) + i3;
            i3 = i13 > i ? i : i13;
            int[] iArr = this.msw;
            iArr[i10] = i3;
            iArr[bArr.length + i10] = i12;
            bwVar2.dg = true;
            i10++;
            bwVar2 = bwVar2.ycc;
        }
    }

    private dg bw() {
        return new dg(dg());
    }

    @Override // com.bytedance.sdk.component.ypw.emc.ypw.dg
    public byte[] dg() {
        int[] iArr = this.msw;
        byte[][] bArr = this.uym;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr2 = this.msw;
            int i6 = iArr2[length + i];
            int i7 = iArr2[i];
            System.arraycopy(this.uym[i], i6, bArr2, i3, i7 - i3);
            i++;
            i3 = i7;
        }
        return bArr2;
    }

    @Override // com.bytedance.sdk.component.ypw.emc.ypw.dg
    public String emc() {
        return bw().emc();
    }

    @Override // com.bytedance.sdk.component.ypw.emc.ypw.dg
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dg) {
            dg dgVar = (dg) obj;
            if (dgVar.xq() == xq() && emc(0, dgVar, 0, xq())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.ypw.emc.ypw.dg
    public int hashCode() {
        int i = this.bw;
        if (i != 0) {
            return i;
        }
        int length = this.uym.length;
        int i3 = 0;
        int i6 = 1;
        int i7 = 0;
        while (i3 < length) {
            byte[] bArr = this.uym[i3];
            int[] iArr = this.msw;
            int i8 = iArr[length + i3];
            int i9 = iArr[i3];
            int i10 = (i9 - i7) + i8;
            while (i8 < i10) {
                i6 = (i6 * 31) + bArr[i8];
                i8++;
            }
            i3++;
            i7 = i9;
        }
        this.bw = i6;
        return i6;
    }

    @Override // com.bytedance.sdk.component.ypw.emc.ypw.dg
    public String toString() {
        return bw().toString();
    }

    @Override // com.bytedance.sdk.component.ypw.emc.ypw.dg
    public int xq() {
        return this.msw[this.uym.length - 1];
    }

    @Override // com.bytedance.sdk.component.ypw.emc.ypw.dg
    public String ypw() {
        return bw().ypw();
    }

    private int ypw(int i) {
        int iBinarySearch = Arrays.binarySearch(this.msw, 0, this.uym.length, i + 1);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    @Override // com.bytedance.sdk.component.ypw.emc.ypw.dg
    public dg emc(int i, int i3) {
        return bw().emc(i, i3);
    }

    @Override // com.bytedance.sdk.component.ypw.emc.ypw.dg
    public byte emc(int i) {
        zz.emc(this.msw[this.uym.length - 1], i, 1L);
        int iYpw = ypw(i);
        int i3 = iYpw == 0 ? 0 : this.msw[iYpw - 1];
        int[] iArr = this.msw;
        byte[][] bArr = this.uym;
        return bArr[iYpw][(i - i3) + iArr[bArr.length + iYpw]];
    }

    @Override // com.bytedance.sdk.component.ypw.emc.ypw.dg
    public boolean emc(int i, dg dgVar, int i3, int i6) {
        if (i < 0 || i > xq() - i6) {
            return false;
        }
        int iYpw = ypw(i);
        while (i6 > 0) {
            int i7 = iYpw == 0 ? 0 : this.msw[iYpw - 1];
            int iMin = Math.min(i6, ((this.msw[iYpw] - i7) + i7) - i);
            int[] iArr = this.msw;
            byte[][] bArr = this.uym;
            if (!dgVar.emc(i3, bArr[iYpw], (i - i7) + iArr[bArr.length + iYpw], iMin)) {
                return false;
            }
            i += iMin;
            i3 += iMin;
            i6 -= iMin;
            iYpw++;
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.ypw.emc.ypw.dg
    public boolean emc(int i, byte[] bArr, int i3, int i6) {
        if (i < 0 || i > xq() - i6 || i3 < 0 || i3 > bArr.length - i6) {
            return false;
        }
        int iYpw = ypw(i);
        while (i6 > 0) {
            int i7 = iYpw == 0 ? 0 : this.msw[iYpw - 1];
            int iMin = Math.min(i6, ((this.msw[iYpw] - i7) + i7) - i);
            int[] iArr = this.msw;
            byte[][] bArr2 = this.uym;
            if (!zz.emc(bArr2[iYpw], (i - i7) + iArr[bArr2.length + iYpw], bArr, i3, iMin)) {
                return false;
            }
            i += iMin;
            i3 += iMin;
            i6 -= iMin;
            iYpw++;
        }
        return true;
    }
}

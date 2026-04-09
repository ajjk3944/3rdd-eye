package com.bytedance.sdk.component.ypw.emc.ypw;

import java.util.Arrays;

/* loaded from: classes.dex */
final class uym extends dg {
    final transient int[] msw;
    final transient byte[][] uym;

    public uym(emc emcVar, int i10) {
        super(null);
        zz.emc(emcVar.ypw, 0L, i10);
        bw bwVar = emcVar.emc;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            int i14 = bwVar.xq;
            int i15 = bwVar.ypw;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            bwVar = bwVar.ycc;
        }
        this.uym = new byte[i13][];
        this.msw = new int[i13 * 2];
        bw bwVar2 = emcVar.emc;
        int i16 = 0;
        while (i11 < i10) {
            byte[][] bArr = this.uym;
            bArr[i16] = bwVar2.emc;
            int i17 = bwVar2.xq;
            int i18 = bwVar2.ypw;
            i11 += i17 - i18;
            if (i11 > i10) {
                i11 = i10;
            }
            int[] iArr = this.msw;
            iArr[i16] = i11;
            iArr[bArr.length + i16] = i18;
            bwVar2.dg = true;
            i16++;
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
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr2 = this.msw;
            int i12 = iArr2[length + i10];
            int i13 = iArr2[i10];
            System.arraycopy(this.uym[i10], i12, bArr2, i11, i13 - i11);
            i10++;
            i11 = i13;
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
        int i10 = this.bw;
        if (i10 != 0) {
            return i10;
        }
        int length = this.uym.length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            byte[] bArr = this.uym[i11];
            int[] iArr = this.msw;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        this.bw = i12;
        return i12;
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

    private int ypw(int i10) {
        int iBinarySearch = Arrays.binarySearch(this.msw, 0, this.uym.length, i10 + 1);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    @Override // com.bytedance.sdk.component.ypw.emc.ypw.dg
    public dg emc(int i10, int i11) {
        return bw().emc(i10, i11);
    }

    @Override // com.bytedance.sdk.component.ypw.emc.ypw.dg
    public byte emc(int i10) {
        zz.emc(this.msw[this.uym.length - 1], i10, 1L);
        int iYpw = ypw(i10);
        int i11 = iYpw == 0 ? 0 : this.msw[iYpw - 1];
        int[] iArr = this.msw;
        byte[][] bArr = this.uym;
        return bArr[iYpw][(i10 - i11) + iArr[bArr.length + iYpw]];
    }

    @Override // com.bytedance.sdk.component.ypw.emc.ypw.dg
    public boolean emc(int i10, dg dgVar, int i11, int i12) {
        if (i10 < 0 || i10 > xq() - i12) {
            return false;
        }
        int iYpw = ypw(i10);
        while (i12 > 0) {
            int i13 = iYpw == 0 ? 0 : this.msw[iYpw - 1];
            int iMin = Math.min(i12, ((this.msw[iYpw] - i13) + i13) - i10);
            int[] iArr = this.msw;
            byte[][] bArr = this.uym;
            if (!dgVar.emc(i11, bArr[iYpw], (i10 - i13) + iArr[bArr.length + iYpw], iMin)) {
                return false;
            }
            i10 += iMin;
            i11 += iMin;
            i12 -= iMin;
            iYpw++;
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.ypw.emc.ypw.dg
    public boolean emc(int i10, byte[] bArr, int i11, int i12) {
        if (i10 < 0 || i10 > xq() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int iYpw = ypw(i10);
        while (i12 > 0) {
            int i13 = iYpw == 0 ? 0 : this.msw[iYpw - 1];
            int iMin = Math.min(i12, ((this.msw[iYpw] - i13) + i13) - i10);
            int[] iArr = this.msw;
            byte[][] bArr2 = this.uym;
            if (!zz.emc(bArr2[iYpw], (i10 - i13) + iArr[bArr2.length + iYpw], bArr, i11, iMin)) {
                return false;
            }
            i10 += iMin;
            i11 += iMin;
            i12 -= iMin;
            iYpw++;
        }
        return true;
    }
}

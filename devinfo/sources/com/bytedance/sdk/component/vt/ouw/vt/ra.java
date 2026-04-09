package com.bytedance.sdk.component.vt.ouw.vt;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class ra extends yu {
    final transient int[] pno;
    final transient byte[][] ra;

    public ra(ouw ouwVar, int i4) {
        super(null);
        bly.ouw(ouwVar.f7671lh, 0L, i4);
        fkw fkwVar = ouwVar.vt;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i4) {
            int i13 = fkwVar.f7670lh;
            int i14 = fkwVar.vt;
            if (i13 == i14) {
                throw new AssertionError("s.limit == s.pos");
            }
            i11 += i13 - i14;
            i12++;
            fkwVar = fkwVar.f7669le;
        }
        this.ra = new byte[i12][];
        this.pno = new int[i12 * 2];
        fkw fkwVar2 = ouwVar.vt;
        int i15 = 0;
        while (i10 < i4) {
            byte[][] bArr = this.ra;
            bArr[i15] = fkwVar2.ouw;
            int i16 = fkwVar2.f7670lh;
            int i17 = fkwVar2.vt;
            int i18 = (i16 - i17) + i10;
            i10 = i18 > i4 ? i4 : i18;
            int[] iArr = this.pno;
            iArr[i15] = i10;
            iArr[bArr.length + i15] = i17;
            fkwVar2.yu = true;
            i15++;
            fkwVar2 = fkwVar2.f7669le;
        }
    }

    private yu fkw() {
        return new yu(yu());
    }

    @Override // com.bytedance.sdk.component.vt.ouw.vt.yu
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yu) {
            yu yuVar = (yu) obj;
            if (yuVar.lh() == lh()) {
                int iLh = lh();
                if (lh() - iLh >= 0) {
                    int iVt = vt(0);
                    int i4 = 0;
                    int i10 = 0;
                    while (iLh > 0) {
                        int i11 = iVt == 0 ? 0 : this.pno[iVt - 1];
                        int iMin = Math.min(iLh, ((this.pno[iVt] - i11) + i11) - i4);
                        int[] iArr = this.pno;
                        byte[][] bArr = this.ra;
                        if (yuVar.ouw(i10, bArr[iVt], (i4 - i11) + iArr[bArr.length + iVt], iMin)) {
                            i4 += iMin;
                            i10 += iMin;
                            iLh -= iMin;
                            iVt++;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.vt.ouw.vt.yu
    public final int hashCode() {
        int i4 = this.fkw;
        if (i4 != 0) {
            return i4;
        }
        int length = this.ra.length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            byte[] bArr = this.ra[i10];
            int[] iArr = this.pno;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        this.fkw = i11;
        return i11;
    }

    @Override // com.bytedance.sdk.component.vt.ouw.vt.yu
    public final int lh() {
        return this.pno[this.ra.length - 1];
    }

    @Override // com.bytedance.sdk.component.vt.ouw.vt.yu
    public final String ouw() {
        return fkw().ouw();
    }

    @Override // com.bytedance.sdk.component.vt.ouw.vt.yu
    public final String toString() {
        return fkw().toString();
    }

    @Override // com.bytedance.sdk.component.vt.ouw.vt.yu
    public final String vt() {
        return fkw().vt();
    }

    @Override // com.bytedance.sdk.component.vt.ouw.vt.yu
    public final byte[] yu() {
        int[] iArr = this.pno;
        byte[][] bArr = this.ra;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i4 = 0;
        int i10 = 0;
        while (i4 < length) {
            int[] iArr2 = this.pno;
            int i11 = iArr2[length + i4];
            int i12 = iArr2[i4];
            System.arraycopy(this.ra[i4], i11, bArr2, i10, i12 - i10);
            i4++;
            i10 = i12;
        }
        return bArr2;
    }

    private int vt(int i4) {
        int iBinarySearch = Arrays.binarySearch(this.pno, 0, this.ra.length, i4 + 1);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    @Override // com.bytedance.sdk.component.vt.ouw.vt.yu
    public final yu ouw(int i4, int i10) {
        return fkw().ouw(i4, i10);
    }

    @Override // com.bytedance.sdk.component.vt.ouw.vt.yu
    public final byte ouw(int i4) {
        bly.ouw(this.pno[this.ra.length - 1], i4, 1L);
        int iVt = vt(i4);
        int i10 = iVt == 0 ? 0 : this.pno[iVt - 1];
        int[] iArr = this.pno;
        byte[][] bArr = this.ra;
        return bArr[iVt][(i4 - i10) + iArr[bArr.length + iVt]];
    }

    @Override // com.bytedance.sdk.component.vt.ouw.vt.yu
    public final boolean ouw(int i4, byte[] bArr, int i10, int i11) {
        if (i4 < 0 || i4 > lh() - i11 || i10 < 0 || i10 > bArr.length - i11) {
            return false;
        }
        int iVt = vt(i4);
        while (i11 > 0) {
            int i12 = iVt == 0 ? 0 : this.pno[iVt - 1];
            int iMin = Math.min(i11, ((this.pno[iVt] - i12) + i12) - i4);
            int[] iArr = this.pno;
            byte[][] bArr2 = this.ra;
            if (!bly.ouw(bArr2[iVt], (i4 - i12) + iArr[bArr2.length + iVt], bArr, i10, iMin)) {
                return false;
            }
            i4 += iMin;
            i10 += iMin;
            i11 -= iMin;
            iVt++;
        }
        return true;
    }
}

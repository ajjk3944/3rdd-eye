package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qz {
    public final float[] a;
    public final int[] b;

    public qz(float[] fArr, int[] iArr) {
        this.a = fArr;
        this.b = iArr;
    }

    public final void a(qz qzVar) {
        int i = 0;
        while (true) {
            int[] iArr = qzVar.b;
            if (i >= iArr.length) {
                return;
            }
            this.a[i] = qzVar.a[i];
            this.b[i] = iArr[i];
            i++;
        }
    }

    public final qz b(float[] fArr) {
        int iN;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            float[] fArr2 = this.a;
            int iBinarySearch = Arrays.binarySearch(fArr2, f);
            int[] iArr2 = this.b;
            if (iBinarySearch >= 0) {
                iN = iArr2[iBinarySearch];
            } else {
                int i2 = -(iBinarySearch + 1);
                if (i2 == 0) {
                    iN = iArr2[0];
                } else if (i2 == iArr2.length - 1) {
                    iN = iArr2[iArr2.length - 1];
                } else {
                    int i3 = i2 - 1;
                    float f2 = fArr2[i3];
                    iN = zt0.n((f - f2) / (fArr2[i2] - f2), iArr2[i3], iArr2[i2]);
                }
            }
            iArr[i] = iN;
        }
        return new qz(fArr, iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qz.class == obj.getClass()) {
            qz qzVar = (qz) obj;
            if (Arrays.equals(this.a, qzVar.a) && Arrays.equals(this.b, qzVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }
}

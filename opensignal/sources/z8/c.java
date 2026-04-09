package z8;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f26714a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f26715b;

    public c(float[] fArr, int[] iArr) {
        this.f26714a = fArr;
        this.f26715b = iArr;
    }

    public final void a(c cVar) {
        int i10 = 0;
        while (true) {
            int[] iArr = cVar.f26715b;
            if (i10 >= iArr.length) {
                return;
            }
            this.f26714a[i10] = cVar.f26714a[i10];
            this.f26715b[i10] = iArr[i10];
            i10++;
        }
    }

    public final c b(float[] fArr) {
        int iU;
        int[] iArr = new int[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            float f10 = fArr[i10];
            float[] fArr2 = this.f26714a;
            int iBinarySearch = Arrays.binarySearch(fArr2, f10);
            int[] iArr2 = this.f26715b;
            if (iBinarySearch >= 0) {
                iU = iArr2[iBinarySearch];
            } else {
                int i11 = -(iBinarySearch + 1);
                if (i11 == 0) {
                    iU = iArr2[0];
                } else if (i11 == iArr2.length - 1) {
                    iU = iArr2[iArr2.length - 1];
                } else {
                    int i12 = i11 - 1;
                    float f11 = fArr2[i12];
                    iU = kc.f.u(iArr2[i12], (f10 - f11) / (fArr2[i11] - f11), iArr2[i11]);
                }
            }
            iArr[i10] = iU;
        }
        return new c(fArr, iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (Arrays.equals(this.f26714a, cVar.f26714a) && Arrays.equals(this.f26715b, cVar.f26715b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f26715b) + (Arrays.hashCode(this.f26714a) * 31);
    }
}

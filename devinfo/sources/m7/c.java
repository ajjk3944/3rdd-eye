package m7;

import com.google.android.gms.internal.play_billing.m1;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f28882a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f28883b;

    public c(float[] fArr, int[] iArr) {
        this.f28882a = fArr;
        this.f28883b = iArr;
    }

    public final void a(c cVar) {
        int i4 = 0;
        while (true) {
            int[] iArr = cVar.f28883b;
            if (i4 >= iArr.length) {
                return;
            }
            this.f28882a[i4] = cVar.f28882a[i4];
            this.f28883b[i4] = iArr[i4];
            i4++;
        }
    }

    public final c b(float[] fArr) {
        int iJ;
        int[] iArr = new int[fArr.length];
        for (int i4 = 0; i4 < fArr.length; i4++) {
            float f10 = fArr[i4];
            float[] fArr2 = this.f28882a;
            int iBinarySearch = Arrays.binarySearch(fArr2, f10);
            int[] iArr2 = this.f28883b;
            if (iBinarySearch >= 0) {
                iJ = iArr2[iBinarySearch];
            } else {
                int i10 = -(iBinarySearch + 1);
                if (i10 == 0) {
                    iJ = iArr2[0];
                } else if (i10 == iArr2.length - 1) {
                    iJ = iArr2[iArr2.length - 1];
                } else {
                    int i11 = i10 - 1;
                    float f11 = fArr2[i11];
                    iJ = m1.j((f10 - f11) / (fArr2[i10] - f11), iArr2[i11], iArr2[i10]);
                }
            }
            iArr[i4] = iJ;
        }
        return new c(fArr, iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (Arrays.equals(this.f28882a, cVar.f28882a) && Arrays.equals(this.f28883b, cVar.f28883b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f28883b) + (Arrays.hashCode(this.f28882a) * 31);
    }
}

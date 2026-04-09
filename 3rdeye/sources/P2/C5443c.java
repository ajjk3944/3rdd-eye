package p2;

import java.util.Arrays;

/* compiled from: GradientColor.java */
/* renamed from: p2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5443c {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f45019a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f45020b;

    public C5443c(float[] fArr, int[] iArr) {
        this.f45019a = fArr;
        this.f45020b = iArr;
    }

    public final void a(C5443c c5443c) {
        int i = 0;
        while (true) {
            int[] iArr = c5443c.f45020b;
            if (i >= iArr.length) {
                return;
            }
            this.f45019a[i] = c5443c.f45019a[i];
            this.f45020b[i] = iArr[i];
            i++;
        }
    }

    public final C5443c b(float[] fArr) {
        int iD;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f10 = fArr[i];
            float[] fArr2 = this.f45019a;
            int iBinarySearch = Arrays.binarySearch(fArr2, f10);
            int[] iArr2 = this.f45020b;
            if (iBinarySearch >= 0) {
                iD = iArr2[iBinarySearch];
            } else {
                int i10 = -(iBinarySearch + 1);
                if (i10 == 0) {
                    iD = iArr2[0];
                } else if (i10 == iArr2.length - 1) {
                    iD = iArr2[iArr2.length - 1];
                } else {
                    int i11 = i10 - 1;
                    float f11 = fArr2[i11];
                    iD = r7.s.d((f10 - f11) / (fArr2[i10] - f11), iArr2[i11], iArr2[i10]);
                }
            }
            iArr[i] = iD;
        }
        return new C5443c(fArr, iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5443c.class == obj.getClass()) {
            C5443c c5443c = (C5443c) obj;
            if (Arrays.equals(this.f45019a, c5443c.f45019a) && Arrays.equals(this.f45020b, c5443c.f45020b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f45020b) + (Arrays.hashCode(this.f45019a) * 31);
    }
}

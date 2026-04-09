package h1;

import android.view.animation.Interpolator;

/* compiled from: LookupTableInterpolator.java */
/* loaded from: classes.dex */
public abstract class d implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38157a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f38158b;

    /* renamed from: c, reason: collision with root package name */
    public final float f38159c;

    public d(float[] fArr, int i) {
        this.f38157a = i;
        switch (i) {
            case 1:
                this.f38158b = fArr;
                this.f38159c = 1.0f / (fArr.length - 1);
                break;
            default:
                this.f38158b = fArr;
                this.f38159c = 1.0f / (fArr.length - 1);
                break;
        }
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        switch (this.f38157a) {
            case 0:
                if (f10 >= 1.0f) {
                    return 1.0f;
                }
                if (f10 <= 0.0f) {
                    return 0.0f;
                }
                float[] fArr = this.f38158b;
                int iMin = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
                float f11 = this.f38159c;
                float f12 = (f10 - (iMin * f11)) / f11;
                float f13 = fArr[iMin];
                return com.google.android.gms.measurement.internal.a.e(fArr[iMin + 1], f13, f12, f13);
            default:
                if (f10 <= 0.0f) {
                    return 0.0f;
                }
                if (f10 >= 1.0f) {
                    return 1.0f;
                }
                float[] fArr2 = this.f38158b;
                int length = (int) ((fArr2.length - 1) * f10);
                int length2 = fArr2.length - 2;
                if (length > length2) {
                    length = length2;
                }
                float f14 = this.f38159c;
                float f15 = (f10 - (length * f14)) / f14;
                float f16 = fArr2[length];
                return com.google.android.gms.measurement.internal.a.e(fArr2[length + 1], f16, f15, f16);
        }
    }
}

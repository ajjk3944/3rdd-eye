package k;

import android.animation.TimeInterpolator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d implements TimeInterpolator {

    /* renamed from: a, reason: collision with root package name */
    public int[] f27749a;

    /* renamed from: b, reason: collision with root package name */
    public int f27750b;

    /* renamed from: c, reason: collision with root package name */
    public int f27751c;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        int i4 = (int) ((f10 * this.f27751c) + 0.5f);
        int i10 = this.f27750b;
        int[] iArr = this.f27749a;
        int i11 = 0;
        while (i11 < i10) {
            int i12 = iArr[i11];
            if (i4 < i12) {
                break;
            }
            i4 -= i12;
            i11++;
        }
        return (i11 / i10) + (i11 < i10 ? i4 / this.f27751c : 0.0f);
    }
}

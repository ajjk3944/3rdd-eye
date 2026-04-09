package j;

import android.animation.TimeInterpolator;

/* renamed from: j.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2538d implements TimeInterpolator {

    /* renamed from: a, reason: collision with root package name */
    public int[] f21259a;

    /* renamed from: b, reason: collision with root package name */
    public int f21260b;

    /* renamed from: c, reason: collision with root package name */
    public int f21261c;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f2) {
        int i = (int) ((f2 * this.f21261c) + 0.5f);
        int i3 = this.f21260b;
        int[] iArr = this.f21259a;
        int i6 = 0;
        while (i6 < i3) {
            int i7 = iArr[i6];
            if (i < i7) {
                break;
            }
            i -= i7;
            i6++;
        }
        return (i6 / i3) + (i6 < i3 ? i / this.f21261c : 0.0f);
    }
}

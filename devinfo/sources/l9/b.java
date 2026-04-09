package l9;

import android.animation.TimeInterpolator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b implements TimeInterpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28625a = 0;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        switch (this.f28625a) {
            case 0:
                return f10;
            case 1:
                float f16 = 1.0f - f10;
                if (f16 < 0.36363637f) {
                    f13 = 7.5625f * f16 * f16;
                } else {
                    if (f16 < 0.72727275f) {
                        float f17 = f16 - 0.54545456f;
                        f11 = 7.5625f * f17 * f17;
                        f12 = 0.75f;
                    } else if (f16 < 0.90909094f) {
                        float f18 = f16 - 0.8181818f;
                        f11 = 7.5625f * f18 * f18;
                        f12 = 0.9375f;
                    } else {
                        float f19 = f16 - 0.95454544f;
                        f11 = 7.5625f * f19 * f19;
                        f12 = 0.984375f;
                    }
                    f13 = f11 + f12;
                }
                return 1.0f - f13;
            default:
                if (f10 < 0.36363637f) {
                    return 7.5625f * f10 * f10;
                }
                if (f10 < 0.72727275f) {
                    float f20 = f10 - 0.54545456f;
                    f14 = 7.5625f * f20 * f20;
                    f15 = 0.75f;
                } else if (f10 < 0.90909094f) {
                    float f21 = f10 - 0.8181818f;
                    f14 = 7.5625f * f21 * f21;
                    f15 = 0.9375f;
                } else {
                    float f22 = f10 - 0.95454544f;
                    f14 = 7.5625f * f22 * f22;
                    f15 = 0.984375f;
                }
                return f14 + f15;
        }
    }
}

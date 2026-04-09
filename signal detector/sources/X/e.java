package X;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class e implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4122a;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f2) {
        switch (this.f4122a) {
        }
        float f5 = f2 - 1.0f;
        return (f5 * f5 * f5 * f5 * f5) + 1.0f;
    }
}

package l6;

import android.view.animation.Interpolator;

/* compiled from: ReverseInterpolator.kt */
/* renamed from: l6.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class InterpolatorC5302l implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final Interpolator f43874a;

    public InterpolatorC5302l(Interpolator interpolator) {
        this.f43874a = interpolator;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        return this.f43874a.getInterpolation(1.0f - f10);
    }
}

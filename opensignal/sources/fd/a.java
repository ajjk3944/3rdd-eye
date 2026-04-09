package fd;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f8822a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final q4.a f8823b = new q4.a(q4.a.f20711d);

    /* renamed from: c, reason: collision with root package name */
    public static final q4.a f8824c = new q4.a(0);

    /* renamed from: d, reason: collision with root package name */
    public static final q4.a f8825d = new q4.a(2);

    /* renamed from: e, reason: collision with root package name */
    public static final DecelerateInterpolator f8826e = new DecelerateInterpolator();

    public static float a(float f10, float f11, float f12) {
        return c7.a.a(f11, f10, f12, f10);
    }

    public static float b(float f10, float f11, float f12, float f13, float f14) {
        return f14 <= f12 ? f10 : f14 >= f13 ? f11 : a(f10, f11, (f14 - f12) / (f13 - f12));
    }

    public static int c(int i10, float f10, int i11) {
        return Math.round(f10 * (i11 - i10)) + i10;
    }
}

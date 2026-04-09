package e3;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import m0.C2650a;

/* renamed from: e3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2303a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f19927a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final C2650a f19928b = new C2650a(1);

    /* renamed from: c, reason: collision with root package name */
    public static final C2650a f19929c = new C2650a(0);

    /* renamed from: d, reason: collision with root package name */
    public static final C2650a f19930d = new C2650a(C2650a.f21926e);

    /* renamed from: e, reason: collision with root package name */
    public static final DecelerateInterpolator f19931e = new DecelerateInterpolator();

    public static float a(float f2, float f5, float f6) {
        return AbstractC1135f5.h(f5, f2, f6, f2);
    }

    public static float b(float f2, float f5, float f6, float f7, float f8) {
        return f8 <= f6 ? f2 : f8 >= f7 ? f5 : a(f2, f5, (f8 - f6) / (f7 - f6));
    }

    public static int c(float f2, int i, int i3) {
        return Math.round(f2 * (i3 - i)) + i;
    }
}

package L3;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import h1.C4406a;

/* compiled from: AnimationUtils.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f4034a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final h1.b f4035b = new h1.b();

    /* renamed from: c, reason: collision with root package name */
    public static final C4406a f4036c = new C4406a();

    /* renamed from: d, reason: collision with root package name */
    public static final h1.c f4037d = new h1.c(h1.c.f38156d, 0);

    /* renamed from: e, reason: collision with root package name */
    public static final DecelerateInterpolator f4038e = new DecelerateInterpolator();

    public static float a(float f10, float f11, float f12) {
        return com.google.android.gms.measurement.internal.a.e(f11, f10, f12, f10);
    }

    public static float b(float f10, float f11, float f12, float f13, float f14) {
        return f14 <= f12 ? f10 : f14 >= f13 ? f11 : a(f10, f11, (f14 - f12) / (f13 - f12));
    }

    public static int c(float f10, int i, int i10) {
        return Math.round(f10 * (i10 - i)) + i;
    }
}

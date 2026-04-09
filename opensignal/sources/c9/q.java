package c9;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import java.lang.ref.WeakReference;
import u.j0;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: b, reason: collision with root package name */
    public static j0 f3429b;

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f3428a = new LinearInterpolator();

    /* renamed from: c, reason: collision with root package name */
    public static final io.sentry.internal.debugmeta.c f3430c = io.sentry.internal.debugmeta.c.v("t", "s", "e", "o", "i", "h", "to", "ti");

    /* renamed from: d, reason: collision with root package name */
    public static final io.sentry.internal.debugmeta.c f3431d = io.sentry.internal.debugmeta.c.v("x", "y");

    public static Interpolator a(PointF pointF, PointF pointF2) {
        WeakReference weakReference;
        Interpolator pathInterpolator;
        pointF.x = e9.g.b(pointF.x, -1.0f, 1.0f);
        pointF.y = e9.g.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = e9.g.b(pointF2.x, -1.0f, 1.0f);
        float fB = e9.g.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fB;
        float f10 = pointF.x;
        float f11 = pointF.y;
        float f12 = pointF2.x;
        Matrix matrix = e9.j.f8019a;
        int i10 = f10 != 0.0f ? (int) (527 * f10) : 17;
        if (f11 != 0.0f) {
            i10 = (int) (i10 * 31 * f11);
        }
        if (f12 != 0.0f) {
            i10 = (int) (i10 * 31 * f12);
        }
        if (fB != 0.0f) {
            i10 = (int) (i10 * 31 * fB);
        }
        r8.a aVar = r8.d.f21312a;
        synchronized (q.class) {
            if (f3429b == null) {
                f3429b = new j0(0);
            }
            weakReference = (WeakReference) f3429b.c(i10);
        }
        Interpolator interpolator = weakReference != null ? (Interpolator) weakReference.get() : null;
        if (weakReference != null && interpolator != null) {
            return interpolator;
        }
        try {
            pathInterpolator = new PathInterpolator(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e4) {
            pathInterpolator = "The Path cannot loop back on itself.".equals(e4.getMessage()) ? new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
        r8.a aVar2 = r8.d.f21312a;
        try {
            WeakReference weakReference2 = new WeakReference(pathInterpolator);
            synchronized (q.class) {
                f3429b.d(i10, weakReference2);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return pathInterpolator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0227  */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.animation.Interpolator] */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.view.animation.Interpolator] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static f9.a b(d9.b r24, r8.h r25, float r26, c9.g0 r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.q.b(d9.b, r8.h, float, c9.g0, boolean, boolean):f9.a");
    }
}

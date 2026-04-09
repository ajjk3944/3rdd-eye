package p7;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import java.lang.ref.WeakReference;
import x.o0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: b, reason: collision with root package name */
    public static o0 f31433b;

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f31432a = new LinearInterpolator();

    /* renamed from: c, reason: collision with root package name */
    public static final km.n f31434c = km.n.q("t", "s", "e", "o", "i", "h", "to", "ti");

    /* renamed from: d, reason: collision with root package name */
    public static final km.n f31435d = km.n.q("x", "y");

    public static Interpolator a(PointF pointF, PointF pointF2) {
        WeakReference weakReference;
        Interpolator pathInterpolator;
        pointF.x = r7.h.b(pointF.x, -1.0f, 1.0f);
        pointF.y = r7.h.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = r7.h.b(pointF2.x, -1.0f, 1.0f);
        float fB = r7.h.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fB;
        float f10 = pointF.x;
        float f11 = pointF.y;
        float f12 = pointF2.x;
        Matrix matrix = r7.j.f32892a;
        int i4 = f10 != 0.0f ? (int) (527 * f10) : 17;
        if (f11 != 0.0f) {
            i4 = (int) (i4 * 31 * f11);
        }
        if (f12 != 0.0f) {
            i4 = (int) (i4 * 31 * f12);
        }
        if (fB != 0.0f) {
            i4 = (int) (i4 * 31 * fB);
        }
        synchronized (o.class) {
            if (f31433b == null) {
                f31433b = new o0(0);
            }
            weakReference = (WeakReference) f31433b.d(i4);
        }
        Interpolator interpolator = weakReference != null ? (Interpolator) weakReference.get() : null;
        if (weakReference != null && interpolator != null) {
            return interpolator;
        }
        try {
            pathInterpolator = new PathInterpolator(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e2) {
            pathInterpolator = "The Path cannot loop back on itself.".equals(e2.getMessage()) ? new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
        try {
            c(i4, new WeakReference(pathInterpolator));
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return pathInterpolator;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x002d. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f6  */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.animation.Interpolator] */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.view.animation.Interpolator] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static s7.a b(q7.a r25, f7.j r26, float r27, p7.d0 r28, boolean r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.o.b(q7.a, f7.j, float, p7.d0, boolean, boolean):s7.a");
    }

    public static void c(int i4, WeakReference weakReference) {
        synchronized (o.class) {
            f31433b.e(i4, weakReference);
        }
    }
}

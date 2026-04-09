package w;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public static final double f36389a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f10, float f11, boolean z3) {
        if (!z3) {
            return f10;
        }
        return (float) (((1.0d - f36389a) * f11) + f10);
    }

    public static float b(float f10, float f11, boolean z3) {
        if (!z3) {
            return f10 * 1.5f;
        }
        return (float) (((1.0d - f36389a) * f11) + (f10 * 1.5f));
    }
}

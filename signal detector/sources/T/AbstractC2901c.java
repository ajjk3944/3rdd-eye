package t;

import android.graphics.drawable.Drawable;

/* renamed from: t.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2901c extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public static final double f23520a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f2, float f5, boolean z6) {
        if (!z6) {
            return f2;
        }
        return (float) (((1.0d - f23520a) * f5) + f2);
    }

    public static float b(float f2, float f5, boolean z6) {
        if (!z6) {
            return f2 * 1.5f;
        }
        return (float) (((1.0d - f23520a) * f5) + (f2 * 1.5f));
    }
}

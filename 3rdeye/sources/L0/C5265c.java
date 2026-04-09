package l0;

import android.graphics.drawable.Drawable;

/* compiled from: RoundRectDrawableWithShadow.java */
/* renamed from: l0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5265c extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public static final double f43674a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f10, float f11, boolean z10) {
        if (!z10) {
            return f10;
        }
        return (float) (((1.0d - f43674a) * f11) + f10);
    }

    public static float b(float f10, float f11, boolean z10) {
        if (!z10) {
            return f10 * 1.5f;
        }
        return (float) (((1.0d - f43674a) * f11) + (f10 * 1.5f));
    }
}

package a1;

/* renamed from: a1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3751b {
    public static final float a(float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f10) & 8589934591L) / 3)) + 709952852);
        float f11 = fIntBitsToFloat - ((fIntBitsToFloat - (f10 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f11 - ((f11 - (f10 / (f11 * f11))) * 0.33333334f);
    }

    public static final float b(float f10, float f11, float f12) {
        return ((1 - f12) * f10) + (f12 * f11);
    }

    public static final int c(int i10, int i11, float f10) {
        return i10 + ((int) Math.round((i11 - i10) * f10));
    }
}

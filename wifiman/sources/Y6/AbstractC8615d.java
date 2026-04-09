package y6;

import android.graphics.Color;

/* renamed from: y6.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8615d {
    private static final int a(int i10, int i11) {
        return 255 - (((255 - i11) * (255 - i10)) / 255);
    }

    private static final int b(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            return 0;
        }
        return (((i10 * 255) * i11) + ((i12 * i13) * (255 - i11))) / (i14 * 255);
    }

    public static final float c(long j10) {
        float f10;
        float f11;
        if ((63 & j10) == 0) {
            f10 = (j10 >> 56) & 255;
            f11 = 255.0f;
        } else {
            f10 = (j10 >> 6) & 1023;
            f11 = 1023.0f;
        }
        return f10 / f11;
    }

    public static final int d(int i10, int i11) {
        int iAlpha = Color.alpha(i10);
        int iAlpha2 = Color.alpha(i11);
        int iA = a(iAlpha2, iAlpha);
        return Color.argb(iA, b(Color.red(i11), iAlpha2, Color.red(i10), iAlpha, iA), b(Color.green(i11), iAlpha2, Color.green(i10), iAlpha, iA), b(Color.blue(i11), iAlpha2, Color.blue(i10), iAlpha, iA));
    }
}

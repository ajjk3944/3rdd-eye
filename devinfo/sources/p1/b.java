package p1;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class b {
    public static void a(Canvas canvas, boolean z3) {
        if (z3) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }

    public static final long b(j2.r rVar) {
        return rVar.getUniqueDrawingId();
    }

    public static void c(int i4, Paint paint) {
        paint.setBlendMode(d(i4));
    }

    public static final BlendMode d(int i4) {
        return i4 == 0 ? BlendMode.CLEAR : i4 == 1 ? BlendMode.SRC : i4 == 2 ? BlendMode.DST : i4 == 3 ? BlendMode.SRC_OVER : i4 == 4 ? BlendMode.DST_OVER : i4 == 5 ? BlendMode.SRC_IN : i4 == 6 ? BlendMode.DST_IN : i4 == 7 ? BlendMode.SRC_OUT : i4 == 8 ? BlendMode.DST_OUT : i4 == 9 ? BlendMode.SRC_ATOP : i4 == 10 ? BlendMode.DST_ATOP : i4 == 11 ? BlendMode.XOR : i4 == 12 ? BlendMode.PLUS : i4 == 13 ? BlendMode.MODULATE : i4 == 14 ? BlendMode.SCREEN : i4 == 15 ? BlendMode.OVERLAY : i4 == 16 ? BlendMode.DARKEN : i4 == 17 ? BlendMode.LIGHTEN : i4 == 18 ? BlendMode.COLOR_DODGE : i4 == 19 ? BlendMode.COLOR_BURN : i4 == 20 ? BlendMode.HARD_LIGHT : i4 == 21 ? BlendMode.SOFT_LIGHT : i4 == 22 ? BlendMode.DIFFERENCE : i4 == 23 ? BlendMode.EXCLUSION : i4 == 24 ? BlendMode.MULTIPLY : i4 == 25 ? BlendMode.HUE : i4 == 26 ? BlendMode.SATURATION : i4 == 27 ? BlendMode.COLOR : i4 == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final PorterDuff.Mode e(int i4) {
        return i4 == 0 ? PorterDuff.Mode.CLEAR : i4 == 1 ? PorterDuff.Mode.SRC : i4 == 2 ? PorterDuff.Mode.DST : i4 == 3 ? PorterDuff.Mode.SRC_OVER : i4 == 4 ? PorterDuff.Mode.DST_OVER : i4 == 5 ? PorterDuff.Mode.SRC_IN : i4 == 6 ? PorterDuff.Mode.DST_IN : i4 == 7 ? PorterDuff.Mode.SRC_OUT : i4 == 8 ? PorterDuff.Mode.DST_OUT : i4 == 9 ? PorterDuff.Mode.SRC_ATOP : i4 == 10 ? PorterDuff.Mode.DST_ATOP : i4 == 11 ? PorterDuff.Mode.XOR : i4 == 12 ? PorterDuff.Mode.ADD : i4 == 14 ? PorterDuff.Mode.SCREEN : i4 == 15 ? PorterDuff.Mode.OVERLAY : i4 == 16 ? PorterDuff.Mode.DARKEN : i4 == 17 ? PorterDuff.Mode.LIGHTEN : i4 == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}

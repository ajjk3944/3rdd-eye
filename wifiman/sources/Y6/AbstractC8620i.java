package y6;

import android.graphics.RectF;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: y6.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8620i {
    public static final RectF a(RectF rectF) {
        AbstractC6492s.i(rectF, "<this>");
        return new RectF(rectF);
    }

    public static final float b(RectF rectF, boolean z10) {
        AbstractC6492s.i(rectF, "<this>");
        return z10 ? rectF.right : rectF.left;
    }

    public static final float c(RectF rectF, boolean z10) {
        AbstractC6492s.i(rectF, "<this>");
        return z10 ? rectF.left : rectF.right;
    }

    public static final RectF d(RectF rectF, float f10) {
        AbstractC6492s.i(rectF, "<this>");
        if (f10 % 180.0f != 0.0f) {
            if (f10 % 90.0f != 0.0f) {
                double radians = Math.toRadians(f10);
                double dSin = Math.sin(radians);
                double dCos = Math.cos(radians);
                double d10 = 2;
                double dAbs = (Math.abs(rectF.width() * dCos) + Math.abs(rectF.height() * dSin)) / d10;
                double dAbs2 = (Math.abs(rectF.width() * dSin) + Math.abs(rectF.height() * dCos)) / d10;
                e(rectF, Double.valueOf(rectF.centerX() - dAbs), Double.valueOf(rectF.centerY() - dAbs2), Double.valueOf(rectF.centerX() + dAbs), Double.valueOf(rectF.centerY() + dAbs2));
            } else if (rectF.width() != rectF.height()) {
                float f11 = 2;
                e(rectF, Float.valueOf(rectF.centerX() - (rectF.height() / f11)), Float.valueOf(rectF.centerY() - (rectF.width() / f11)), Float.valueOf(rectF.centerX() + (rectF.height() / f11)), Float.valueOf(rectF.centerY() + (rectF.width() / f11)));
            }
        }
        return rectF;
    }

    public static final void e(RectF rectF, Number left, Number top, Number right, Number bottom) {
        AbstractC6492s.i(rectF, "<this>");
        AbstractC6492s.i(left, "left");
        AbstractC6492s.i(top, "top");
        AbstractC6492s.i(right, "right");
        AbstractC6492s.i(bottom, "bottom");
        rectF.set(left.floatValue(), top.floatValue(), right.floatValue(), bottom.floatValue());
    }

    public static final RectF f(RectF rectF, float f10, float f11) {
        AbstractC6492s.i(rectF, "<this>");
        rectF.left += f10;
        rectF.top += f11;
        rectF.right += f10;
        rectF.bottom += f11;
        return rectF;
    }
}

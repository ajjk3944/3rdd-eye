package m7;

import V6.d;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.text.style.ReplacementSpan;
import b9.j;
import kotlin.jvm.internal.l;

/* compiled from: PositionAwareReplacementSpan.kt */
/* renamed from: m7.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5333b extends ReplacementSpan {
    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence text, int i, int i10, Paint.FontMetricsInt fontMetricsInt) {
        Rect bounds;
        Rect bounds2;
        l.f(paint, "paint");
        l.f(text, "text");
        int i11 = 0;
        if (fontMetricsInt != null && i == 0 && Build.VERSION.SDK_INT < 28) {
            fontMetricsInt.top = 0;
            fontMetricsInt.ascent = 0;
            fontMetricsInt.bottom = 0;
            fontMetricsInt.descent = 0;
            fontMetricsInt.leading = 0;
        }
        d dVar = (d) this;
        if (fontMetricsInt != null && dVar.f12957d <= 0) {
            int iY = com.google.gson.internal.c.y(paint.ascent());
            int iY2 = com.google.gson.internal.c.y(paint.descent());
            BitmapDrawable bitmapDrawable = dVar.f12960g;
            int iHeight = (bitmapDrawable == null || (bounds2 = bitmapDrawable.getBounds()) == null) ? dVar.f12956c : bounds2.height();
            int i12 = d.b.f12965a[dVar.f12958e.ordinal()];
            if (i12 == 1) {
                i11 = iY + iHeight;
            } else if (i12 == 2) {
                i11 = ((iY + iY2) + iHeight) / 2;
            } else if (i12 != 3) {
                if (i12 != 4) {
                    throw new j();
                }
                i11 = iY2;
            }
            int i13 = i11 - iHeight;
            int i14 = fontMetricsInt.top;
            int i15 = fontMetricsInt.ascent;
            int i16 = fontMetricsInt.bottom - fontMetricsInt.descent;
            fontMetricsInt.ascent = Math.min(i13, i15);
            int iMax = Math.max(i11, fontMetricsInt.descent);
            fontMetricsInt.descent = iMax;
            fontMetricsInt.top = fontMetricsInt.ascent + (i14 - i15);
            fontMetricsInt.bottom = iMax + i16;
            BitmapDrawable bitmapDrawable2 = dVar.f12960g;
            if (bitmapDrawable2 != null && (bounds = bitmapDrawable2.getBounds()) != null) {
                return bounds.width();
            }
        }
        return dVar.f12955b;
    }
}

package F6;

import N7.C1126cb;
import N7.Xa;
import android.graphics.Canvas;
import android.text.Layout;

/* compiled from: DivTextRangesBackgroundRenderer.kt */
/* loaded from: classes.dex */
public abstract class e {
    public static int b(Layout layout, int i) {
        int lineBottom = layout.getLineBottom(i);
        boolean z10 = i == layout.getLineCount() - 1;
        float spacingAdd = layout.getSpacingAdd();
        float spacingMultiplier = layout.getSpacingMultiplier();
        if ((spacingAdd != 0.0f || spacingMultiplier != 1.0f) && !z10) {
            if (Float.compare(spacingMultiplier, 1.0f) != 0) {
                float lineTop = layout.getLineTop(i + 1) - layout.getLineTop(i);
                spacingAdd = lineTop - ((lineTop - spacingAdd) / spacingMultiplier);
            }
            lineBottom = (int) (lineBottom - spacingAdd);
        }
        return i == layout.getLineCount() - 1 ? lineBottom - layout.getBottomPadding() : lineBottom;
    }

    public static int c(Layout layout, int i) {
        int lineTop = layout.getLineTop(i);
        return i == 0 ? lineTop - layout.getTopPadding() : lineTop;
    }

    public abstract void a(Canvas canvas, Layout layout, int i, int i10, int i11, int i12, C1126cb c1126cb, Xa xa);
}

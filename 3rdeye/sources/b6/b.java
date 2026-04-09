package B6;

import K6.C0713c;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: DivTooltipContainer.kt */
/* loaded from: classes.dex */
public final class b extends X6.g {
    @Override // X6.g, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() == 1) {
            return;
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j4) {
        kotlin.jvm.internal.l.f(canvas, "canvas");
        if (view != null && view.getVisibility() == 0) {
            C0713c.E(view, canvas);
        }
        return super.drawChild(canvas, view, j4);
    }

    public View getTooltipView() {
        if (getChildCount() == 0) {
            return null;
        }
        return getChildAt(0);
    }
}

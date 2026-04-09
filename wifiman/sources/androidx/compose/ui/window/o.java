package androidx.compose.ui.window;

import Zg.AbstractC3689v;
import android.graphics.Rect;
import android.view.View;

/* loaded from: classes.dex */
final class o extends p {
    @Override // androidx.compose.ui.window.p, androidx.compose.ui.window.m
    public void b(View view, int i10, int i11) {
        view.setSystemGestureExclusionRects(AbstractC3689v.r(new Rect(0, 0, i10, i11)));
    }
}

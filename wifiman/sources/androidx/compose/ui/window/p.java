package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* loaded from: classes.dex */
class p implements m {
    @Override // androidx.compose.ui.window.m
    public void a(WindowManager windowManager, View view, ViewGroup.LayoutParams layoutParams) {
        windowManager.updateViewLayout(view, layoutParams);
    }

    @Override // androidx.compose.ui.window.m
    public void b(View view, int i10, int i11) {
    }

    @Override // androidx.compose.ui.window.m
    public void c(View view, Rect rect) {
        view.getWindowVisibleDisplayFrame(rect);
    }
}

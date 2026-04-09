package o;

import android.graphics.Rect;
import android.widget.PopupWindow;

/* renamed from: o.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2745w0 {
    public static void a(PopupWindow popupWindow, Rect rect) {
        popupWindow.setEpicenterBounds(rect);
    }

    public static void b(PopupWindow popupWindow, boolean z6) {
        popupWindow.setIsClippedToScreen(z6);
    }
}

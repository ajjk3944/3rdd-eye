package R;

import android.view.View;

/* loaded from: classes.dex */
public abstract class J {
    public static CharSequence a(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean b(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean c(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void d(View view, boolean z6) {
        view.setAccessibilityHeading(z6);
    }

    public static void e(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void f(View view, boolean z6) {
        view.setScreenReaderFocusable(z6);
    }
}

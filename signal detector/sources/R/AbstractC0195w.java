package R;

import android.graphics.Rect;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;

/* renamed from: R.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0195w {
    public static AccessibilityNodeInfo.AccessibilityAction a() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float b(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }

    public static void c(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static int e(ViewConfiguration viewConfiguration, int i, int i3, int i6) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i, i3, i6);
    }

    public static int f(ViewConfiguration viewConfiguration, int i, int i3, int i6) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i, i3, i6);
    }

    public static boolean g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static void h(TextView textView, int i, float f2) {
        textView.setLineHeight(i, f2);
    }
}

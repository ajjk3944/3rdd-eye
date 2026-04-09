package i3;

import android.content.pm.ShortcutInfo;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import com.staircase3.opensignal.goldstar.persistence.VideoTestResult;

/* loaded from: classes.dex */
public abstract class c {
    public static Object a(Bundle bundle) {
        return bundle.getParcelable("INTENT_EXTRA_VIDEO_TEST_RESULT", VideoTestResult.class);
    }

    public static String b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static void d(ShortcutInfo.Builder builder) {
        builder.setExcludedFromSurfaces(0);
    }
}

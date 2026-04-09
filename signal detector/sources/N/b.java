package N;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import e.C2284a;

/* loaded from: classes.dex */
public abstract class b {
    public static Object a(String str, Bundle bundle) {
        return bundle.getParcelable(str, C2284a.class);
    }

    public static String b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }
}

package a4;

import android.content.pm.ShortcutInfo;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class c {
    public static Object a(Bundle bundle, String str) {
        return bundle.getParcelable(str, f.a.class);
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

package C6;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* compiled from: AccessibilityStateProvider.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f926b;

    /* renamed from: a, reason: collision with root package name */
    public boolean f927a;

    public boolean a(Context context) {
        if (!this.f927a) {
            return false;
        }
        Boolean bool = f926b;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (bool == null) {
            Object systemService = context.getSystemService("accessibility");
            AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
            f926b = accessibilityManager != null ? Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()) : Boolean.FALSE;
        }
        Boolean bool2 = f926b;
        kotlin.jvm.internal.l.c(bool2);
        return bool2.booleanValue();
    }
}

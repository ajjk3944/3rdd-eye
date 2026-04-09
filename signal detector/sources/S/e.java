package S;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* loaded from: classes.dex */
public class e extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final A0.e f3448a;

    public e(A0.e eVar) {
        this.f3448a = eVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        d dVarN = this.f3448a.n(i);
        if (dVarN == null) {
            return null;
        }
        return dVarN.f3446a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.f3448a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        d dVarO = this.f3448a.o(i);
        if (dVarO == null) {
            return null;
        }
        return dVarO.f3446a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i3, Bundle bundle) {
        return this.f3448a.r(i, i3, bundle);
    }
}

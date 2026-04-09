package v3;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* loaded from: classes.dex */
public class d extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final o2.g f23841a;

    public d(o2.g gVar) {
        this.f23841a = gVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        c cVarV = this.f23841a.V(i10);
        if (cVarV == null) {
            return null;
        }
        return cVarV.f23838a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i10) {
        this.f23841a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i10) {
        c cVarA0 = this.f23841a.a0(i10);
        if (cVarA0 == null) {
            return null;
        }
        return cVarA0.f23838a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        return this.f23841a.e0(i10, i11, bundle);
    }
}

package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* loaded from: assets/audience_network/classes2.dex */
public class QC extends AccessibilityNodeProvider {
    public final /* synthetic */ QD A00;

    public QC(QD qd2) {
        this.A00 = qd2;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i4) {
        return (AccessibilityNodeInfo) this.A00.A5G(i4);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i4) {
        return this.A00.A6Y(str, i4);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i4) {
        return (AccessibilityNodeInfo) this.A00.A6Z(i4);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i4, int i10, Bundle bundle) {
        return this.A00.AGv(i4, i10, bundle);
    }
}

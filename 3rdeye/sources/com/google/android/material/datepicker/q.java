package com.google.android.material.datepicker;

import L0.C0770a;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: MaterialCalendarGridView.java */
/* loaded from: classes2.dex */
public final class q extends C0770a {
    @Override // L0.C0770a
    public final void d(View view, M0.g gVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f3883a;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f4122a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(null);
    }
}

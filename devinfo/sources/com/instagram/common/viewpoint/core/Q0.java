package com.instagram.common.viewpoint.core;

import android.view.accessibility.AccessibilityEvent;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class Q0 {
    public static final C0768Pz A00 = new C1513hy() { // from class: com.facebook.ads.redexgen.X.7S
        @Override // com.instagram.common.viewpoint.core.C0768Pz
        public final int A00(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        @Override // com.instagram.common.viewpoint.core.C0768Pz
        public final void A01(AccessibilityEvent accessibilityEvent, int i4) {
            accessibilityEvent.setContentChangeTypes(i4);
        }
    };

    public static int A00(AccessibilityEvent accessibilityEvent) {
        return A00.A00(accessibilityEvent);
    }

    public static void A01(AccessibilityEvent accessibilityEvent, int i4) {
        A00.A01(accessibilityEvent, i4);
    }
}

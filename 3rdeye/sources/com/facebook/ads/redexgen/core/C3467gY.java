package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: com.facebook.ads.redexgen.X.gY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C3467gY extends C2767Og {
    @Override // com.facebook.ads.redexgen.core.C2767Og
    public final View.AccessibilityDelegate A00(AbstractC2768Oh abstractC2768Oh) {
        return new C2765Oe(this, abstractC2768Oh);
    }

    @Override // com.facebook.ads.redexgen.core.C2767Og
    public final PU A01(View.AccessibilityDelegate accessibilityDelegate, View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = accessibilityDelegate.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new PU(accessibilityNodeProvider);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.C2767Og
    public final boolean A02(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
        return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
    }
}

package com.facebook.ads.redexgen.core;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: com.facebook.ads.redexgen.X.0D, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C0D extends C0M {
    @Override // com.facebook.ads.redexgen.core.PO
    public final Object A00(int i, int i10, int i11, int i12, boolean z10, boolean z11) {
        return AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i10, i11, i12, z10, z11);
    }

    @Override // com.facebook.ads.redexgen.core.PO
    public final Object A01(int i, int i10, boolean z10, int i11) {
        return AccessibilityNodeInfo.CollectionInfo.obtain(i, i10, z10, i11);
    }
}

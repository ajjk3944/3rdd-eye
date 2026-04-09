package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: com.facebook.ads.redexgen.X.0n, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public class C0n extends C0q {
    @Override // com.instagram.common.viewpoint.core.C0752Pg
    public final C0767Py A07(View view, C0767Py c0767Py) {
        WindowInsets result = (WindowInsets) C0767Py.A01(c0767Py);
        WindowInsets unwrapped = view.dispatchApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C0767Py.A00(result);
    }

    @Override // com.instagram.common.viewpoint.core.C0752Pg
    public final C0767Py A08(View view, C0767Py c0767Py) {
        WindowInsets result = (WindowInsets) C0767Py.A01(c0767Py);
        WindowInsets unwrapped = view.onApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C0767Py.A00(result);
    }

    @Override // com.instagram.common.viewpoint.core.C0752Pg
    public final void A0A(View view) {
        view.stopNestedScroll();
    }

    @Override // com.instagram.common.viewpoint.core.C0752Pg
    public final void A0E(View view, PR pr) {
        if (pr == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC0751Pf(this, pr));
        }
    }
}

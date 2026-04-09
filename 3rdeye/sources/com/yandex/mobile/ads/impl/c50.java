package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes3.dex */
public final class c50 implements ip {
    @Override // com.yandex.mobile.ads.impl.ip
    public final void a(View closeView) {
        kotlin.jvm.internal.l.f(closeView, "closeView");
        closeView.setAlpha(0.4f);
        closeView.setEnabled(false);
    }

    @Override // com.yandex.mobile.ads.impl.ip
    public final void b(View closeView) {
        kotlin.jvm.internal.l.f(closeView, "closeView");
        closeView.animate().alpha(1.0f).setDuration(200L);
        closeView.setEnabled(true);
    }
}

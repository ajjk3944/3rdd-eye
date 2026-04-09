package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes3.dex */
public final class j00 implements az1 {
    @Override // com.yandex.mobile.ads.impl.az1
    public final void a(View skipView) {
        kotlin.jvm.internal.l.f(skipView, "skipView");
        skipView.setVisibility(8);
        skipView.setEnabled(false);
    }

    @Override // com.yandex.mobile.ads.impl.az1
    public final void b(View skipView) {
        kotlin.jvm.internal.l.f(skipView, "skipView");
        skipView.setVisibility(0);
        skipView.setEnabled(true);
    }
}

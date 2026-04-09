package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ProgressBar;

/* loaded from: classes3.dex */
public final class u41 implements s41 {
    @Override // com.yandex.mobile.ads.impl.s41
    public final ProgressBar a(View container) {
        kotlin.jvm.internal.l.f(container, "container");
        return (ProgressBar) container.findViewWithTag("close_progress_view");
    }

    @Override // com.yandex.mobile.ads.impl.s41
    public final View b(View container) {
        kotlin.jvm.internal.l.f(container, "container");
        return container.findViewWithTag("skip_button");
    }

    @Override // com.yandex.mobile.ads.impl.s41
    public final View c(View container) {
        kotlin.jvm.internal.l.f(container, "container");
        return container.findViewWithTag(com.vungle.ads.internal.presenter.g.CLOSE);
    }
}

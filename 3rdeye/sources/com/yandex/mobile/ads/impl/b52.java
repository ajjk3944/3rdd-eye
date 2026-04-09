package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes3.dex */
public final class b52 implements a52 {
    @Override // com.yandex.mobile.ads.impl.a52
    public final TextView a(View container) {
        kotlin.jvm.internal.l.f(container, "container");
        View viewFindViewWithTag = container.findViewWithTag("timer_value");
        if (viewFindViewWithTag instanceof TextView) {
            return (TextView) viewFindViewWithTag;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.a52
    public final View b(View container) {
        kotlin.jvm.internal.l.f(container, "container");
        View viewFindViewWithTag = container.findViewWithTag("timer_container");
        if (viewFindViewWithTag != null) {
            return viewFindViewWithTag;
        }
        return null;
    }
}

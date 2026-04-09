package com.yandex.mobile.ads.impl;

import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;

/* loaded from: classes3.dex */
public final class cj2 implements ov0 {

    /* renamed from: a, reason: collision with root package name */
    private final h71 f25677a;

    public cj2(h71 weakViewProvider) {
        kotlin.jvm.internal.l.f(weakViewProvider, "weakViewProvider");
        this.f25677a = weakViewProvider;
    }

    @Override // com.yandex.mobile.ads.impl.ov0
    public final TextView getCountDownProgress() {
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.ov0
    public final CheckBox getMuteControl() {
        return this.f25677a.d();
    }

    @Override // com.yandex.mobile.ads.impl.ov0
    public final ProgressBar getVideoProgress() {
        return this.f25677a.f();
    }
}

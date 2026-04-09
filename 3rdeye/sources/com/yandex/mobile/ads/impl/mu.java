package com.yandex.mobile.ads.impl;

import android.widget.TextView;

/* loaded from: classes3.dex */
public final class mu {

    /* renamed from: a, reason: collision with root package name */
    private final nl1 f30516a;

    public /* synthetic */ mu() {
        this(new nl1());
    }

    public final void a(TextView countDownProgress, long j4, long j10) {
        kotlin.jvm.internal.l.f(countDownProgress, "countDownProgress");
        this.f30516a.getClass();
        countDownProgress.setText(nl1.a(j4 - j10));
    }

    public mu(nl1 progressDisplayTimeFormatter) {
        kotlin.jvm.internal.l.f(progressDisplayTimeFormatter, "progressDisplayTimeFormatter");
        this.f30516a = progressDisplayTimeFormatter;
    }
}

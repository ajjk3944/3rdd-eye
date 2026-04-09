package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class d42 {

    /* renamed from: a, reason: collision with root package name */
    private static final long f25952a = TimeUnit.SECONDS.toMillis(1);

    public static void a(TextView rewardDelayTextView, long j4, long j10) {
        kotlin.jvm.internal.l.f(rewardDelayTextView, "rewardDelayTextView");
        rewardDelayTextView.setText(String.valueOf((int) Math.ceil((j4 - j10) / f25952a)));
    }
}

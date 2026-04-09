package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import com.yandex.mobile.ads.common.AdActivity;

/* renamed from: com.yandex.mobile.ads.impl.l1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4147l1 {

    /* renamed from: a, reason: collision with root package name */
    private final rx1 f29843a;

    public C4147l1(rx1 showActivityProvider) {
        kotlin.jvm.internal.l.f(showActivityProvider, "showActivityProvider");
        this.f29843a = showActivityProvider;
    }

    public final Intent a(Context context, long j4) {
        kotlin.jvm.internal.l.f(context, "context");
        this.f29843a.getClass();
        Intent intent = new Intent(context, (Class<?>) AdActivity.class);
        intent.putExtra("window_type", "window_type_activity_result");
        intent.putExtra("data_identifier", j4);
        return intent;
    }
}

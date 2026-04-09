package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.yandex.mobile.ads.common.AdActivity;

/* loaded from: classes3.dex */
public final class ld0 {

    /* renamed from: a, reason: collision with root package name */
    private final rx1 f29973a;

    public ld0(rx1 showActivityProvider) {
        kotlin.jvm.internal.l.f(showActivityProvider, "showActivityProvider");
        this.f29973a = showActivityProvider;
    }

    public final Intent a(Context context, long j4) {
        kotlin.jvm.internal.l.f(context, "context");
        this.f29973a.getClass();
        Intent intent = new Intent(context, (Class<?>) AdActivity.class);
        intent.putExtra("window_type", "window_type_fullscreen");
        intent.putExtra("data_identifier", j4);
        if (!(context instanceof Activity)) {
            intent.addFlags(402653184);
        }
        return intent;
    }
}

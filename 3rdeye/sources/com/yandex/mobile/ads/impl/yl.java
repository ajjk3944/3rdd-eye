package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.yandex.mobile.ads.common.AdActivity;

/* loaded from: classes3.dex */
public final class yl {

    /* renamed from: a, reason: collision with root package name */
    private final rx1 f35853a;

    public yl(rx1 showActivityProvider) {
        kotlin.jvm.internal.l.f(showActivityProvider, "showActivityProvider");
        this.f35853a = showActivityProvider;
    }

    public final Intent a(Context context, String browserUrl, long j4) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(browserUrl, "browserUrl");
        this.f35853a.getClass();
        Intent intent = new Intent(context, (Class<?>) AdActivity.class);
        intent.putExtra("window_type", "window_type_browser");
        intent.putExtra("extra_browser_url", browserUrl);
        if (!(context instanceof Activity)) {
            intent.addFlags(402653184);
        }
        intent.putExtra("data_identifier", j4);
        return intent;
    }
}

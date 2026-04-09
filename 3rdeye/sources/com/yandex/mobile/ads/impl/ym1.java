package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import com.yandex.mobile.ads.impl.vi0;

/* loaded from: classes3.dex */
public final class ym1 {

    /* renamed from: a, reason: collision with root package name */
    private final vi0 f35926a;

    /* renamed from: b, reason: collision with root package name */
    private final zm1 f35927b;

    public /* synthetic */ ym1(Context context, ej0 ej0Var) {
        this(context, ej0Var, new vi0(context, new fn0(true), ej0Var), new zm1());
    }

    public final void a(String clickUrl, int i, String str, vi0.b listener) {
        kotlin.jvm.internal.l.f(clickUrl, "clickUrl");
        kotlin.jvm.internal.l.f(listener, "listener");
        this.f35927b.getClass();
        Uri.Builder builderBuildUpon = Uri.parse("https://www.yandex.ru/ads/qr/gen").buildUpon();
        builderBuildUpon.appendQueryParameter("click_link", clickUrl);
        builderBuildUpon.appendQueryParameter("size", String.valueOf(i));
        if (str != null && str.length() != 0) {
            kotlin.jvm.internal.l.c(builderBuildUpon.appendQueryParameter("brand_logo_link", str));
        }
        String string = builderBuildUpon.build().toString();
        kotlin.jvm.internal.l.e(string, "toString(...)");
        this.f35926a.a(new jj0(i, i, string, null, 120), listener);
    }

    public ym1(Context context, ej0 imageProvider, vi0 imageForPresentProvider, zm1 qrcodeUrlConfigurator) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(imageForPresentProvider, "imageForPresentProvider");
        kotlin.jvm.internal.l.f(qrcodeUrlConfigurator, "qrcodeUrlConfigurator");
        this.f35926a = imageForPresentProvider;
        this.f35927b = qrcodeUrlConfigurator;
    }
}

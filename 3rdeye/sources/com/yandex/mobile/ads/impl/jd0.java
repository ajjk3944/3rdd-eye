package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebSettings;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class jd0 extends hg0 {

    /* renamed from: o, reason: collision with root package name */
    private final ij2 f29110o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd0(Context context, a8<?> adResponse, C4072a3 adConfiguration) {
        super(context, adResponse, adConfiguration);
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        this.f29110o = new ij2(this);
    }

    @Override // com.yandex.mobile.ads.impl.hg0
    @SuppressLint({"AddJavascriptInterface"})
    public final void a(Context context, C4072a3 adConfiguration) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        addJavascriptInterface(b(context), "AdPerformActionsJSI");
    }

    @Override // com.yandex.mobile.ads.impl.sf1
    public final void h() {
        this.f29110o.a(l());
    }

    @Override // com.yandex.mobile.ads.impl.sf1
    public final void a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        super.a(context);
        WebSettings settings = getSettings();
        kotlin.jvm.internal.l.e(settings, "getSettings(...)");
        settings.setDatabasePath(getContext().getDatabasePath("com.monetization.ads.db").getAbsolutePath());
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setCacheMode(-1);
    }
}

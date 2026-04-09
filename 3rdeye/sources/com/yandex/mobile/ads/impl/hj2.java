package com.yandex.mobile.ads.impl;

import android.webkit.WebView;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes3.dex */
public final class hj2 {

    /* renamed from: a, reason: collision with root package name */
    private final fl1 f28239a;

    public hj2(fl1 processNameProvider) {
        kotlin.jvm.internal.l.f(processNameProvider, "processNameProvider");
        this.f28239a = processNameProvider;
    }

    public final void a() {
        String strA = this.f28239a.a();
        String strT0 = strA != null ? y9.q.t0(strA, StringUtils.PROCESS_POSTFIX_DELIMITER, "") : null;
        if (strT0 == null || strT0.length() <= 0) {
            return;
        }
        try {
            WebView.setDataDirectorySuffix(strT0);
        } catch (Throwable unused) {
        }
    }
}

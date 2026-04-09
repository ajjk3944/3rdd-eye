package com.yandex.mobile.ads.impl;

import android.os.Build;

/* loaded from: classes3.dex */
public final class cr0 {
    public static final iw1 a(cu1 customCertificatesProvider) {
        kotlin.jvm.internal.l.f(customCertificatesProvider, "customCertificatesProvider");
        return Build.VERSION.SDK_INT >= 24 ? xd.a(customCertificatesProvider) : new kw1(customCertificatesProvider);
    }
}

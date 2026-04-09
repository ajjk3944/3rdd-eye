package com.yandex.mobile.ads.impl;

import android.net.Uri;

/* loaded from: classes3.dex */
public final class f30 {

    /* renamed from: a, reason: collision with root package name */
    private final h82 f27190a;

    public f30(fh1 tracker) {
        kotlin.jvm.internal.l.f(tracker, "tracker");
        this.f27190a = tracker;
    }

    public final void a(Uri uri) {
        kotlin.jvm.internal.l.f(uri, "uri");
        String queryParameter = uri.getQueryParameter("trackingUrl");
        if (queryParameter == null || queryParameter.length() <= 0) {
            return;
        }
        this.f27190a.a(queryParameter);
    }
}

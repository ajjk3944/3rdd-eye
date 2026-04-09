package com.yandex.mobile.ads.impl;

import android.net.Uri;
import c9.C2092m;
import c9.C2097r;
import java.util.List;

/* loaded from: classes3.dex */
public final class en0 {

    /* renamed from: a, reason: collision with root package name */
    private static final List<String> f26927a = C2092m.W("adsdk.yandex.ru", "yandex.ru/ads");

    public static boolean a(Uri uri) {
        kotlin.jvm.internal.l.f(uri, "uri");
        return C2097r.k0(f26927a, uri.getHost());
    }
}

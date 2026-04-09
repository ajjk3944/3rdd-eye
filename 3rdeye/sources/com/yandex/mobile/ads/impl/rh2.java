package com.yandex.mobile.ads.impl;

import c9.C2078B;
import com.yandex.mobile.ads.impl.a92;
import java.util.Map;

/* loaded from: classes3.dex */
public final class rh2 {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<a92.a, String> f32666a = C2078B.o(new b9.l(a92.a.f24562d, "Screen is locked"), new b9.l(a92.a.f24563e, "Asset value %s doesn't match view value"), new b9.l(a92.a.f24564f, "No ad view"), new b9.l(a92.a.f24565g, "No valid ads in ad unit"), new b9.l(a92.a.f24566h, "No visible sponsored asset"), new b9.l(a92.a.i, "No visible required assets"), new b9.l(a92.a.f24567j, "Ad view is not added to hierarchy"), new b9.l(a92.a.f24568k, "Ad is not visible for percent"), new b9.l(a92.a.f24569l, "Required asset %s is not visible in ad view"), new b9.l(a92.a.f24570m, "Required asset %s is not subview of ad view"), new b9.l(a92.a.f24561c, "Unknown error, that shouldn't happen"), new b9.l(a92.a.f24571n, "Ad view is null"), new b9.l(a92.a.f24572o, "Ad view is hidden"), new b9.l(a92.a.f24573p, "View is too small"), new b9.l(a92.a.f24574q, "Visible area of an ad view is too small"));

    public static String a(a92 validationResult) {
        kotlin.jvm.internal.l.f(validationResult, "validationResult");
        String strA = validationResult.a();
        String str = f32666a.get(validationResult.b());
        return str != null ? C4215v0.a(new Object[]{strA}, 1, str, "format(...)") : "Visibility error";
    }
}

package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;

/* loaded from: classes3.dex */
public final class f82 {

    /* renamed from: a, reason: collision with root package name */
    private final ew1 f27242a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f27243b;

    public /* synthetic */ f82(Context context) {
        this(context, ew1.a.a());
    }

    public final String a(String url) {
        kotlin.jvm.internal.l.f(url, "url");
        du1 du1VarA = this.f27242a.a(this.f27243b);
        if (du1VarA == null || du1VarA.V()) {
            return a(url, String.valueOf(System.currentTimeMillis()), y9.q.f0(url, '?', 0, 6) != -1 ? '&' : '?');
        }
        return url;
    }

    public f82(Context context, ew1 sdkSettings) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkSettings, "sdkSettings");
        this.f27242a = sdkSettings;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this.f27243b = applicationContext;
    }

    private static String a(String str, String str2, char c10) {
        return str + (str.length() == 0 ? "" : Character.valueOf(c10)) + "ctime=" + str2;
    }
}

package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class yj1 implements h82 {

    /* renamed from: a, reason: collision with root package name */
    private final np1 f35842a;

    /* renamed from: b, reason: collision with root package name */
    private final t32 f35843b;

    /* renamed from: c, reason: collision with root package name */
    private final f82 f35844c;

    /* renamed from: d, reason: collision with root package name */
    private String f35845d;

    public yj1(Context context, np1 reporter, t32 targetUrlHandler, f82 urlModifier) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(targetUrlHandler, "targetUrlHandler");
        kotlin.jvm.internal.l.f(urlModifier, "urlModifier");
        this.f35842a = reporter;
        this.f35843b = targetUrlHandler;
        this.f35844c = urlModifier;
    }

    @Override // com.yandex.mobile.ads.impl.h82
    public final void a(String url) {
        kotlin.jvm.internal.l.f(url, "url");
        String strA = this.f35844c.a(url);
        if (url.length() != 0) {
            url = strA;
        }
        this.f35845d = url;
        if (url == null) {
            kotlin.jvm.internal.l.l("targetUrl");
            throw null;
        }
        if (url.length() == 0) {
            fp0.b(new Object[0]);
            return;
        }
        t32 t32Var = this.f35843b;
        np1 np1Var = this.f35842a;
        String str = this.f35845d;
        if (str != null) {
            t32Var.a(np1Var, str);
        } else {
            kotlin.jvm.internal.l.l("targetUrl");
            throw null;
        }
    }
}

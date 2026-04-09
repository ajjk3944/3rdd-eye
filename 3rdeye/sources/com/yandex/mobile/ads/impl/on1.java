package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class on1 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f31443a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31444b;

    public on1(String body, HashMap headers) {
        kotlin.jvm.internal.l.f(headers, "headers");
        kotlin.jvm.internal.l.f(body, "body");
        this.f31443a = headers;
        this.f31444b = body;
    }

    public final String a() {
        return this.f31444b;
    }

    public final Map<String, String> b() {
        return this.f31443a;
    }
}

package com.yandex.mobile.ads.impl;

import java.util.Map;

/* loaded from: classes3.dex */
public final class qq1 {

    /* renamed from: a, reason: collision with root package name */
    private final int f32317a;

    /* renamed from: b, reason: collision with root package name */
    private final uq1 f32318b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, String> f32319c;

    public qq1(int i, uq1 body, Map<String, String> headers) {
        kotlin.jvm.internal.l.f(body, "body");
        kotlin.jvm.internal.l.f(headers, "headers");
        this.f32317a = i;
        this.f32318b = body;
        this.f32319c = headers;
    }

    public final uq1 a() {
        return this.f32318b;
    }

    public final Map<String, String> b() {
        return this.f32319c;
    }

    public final int c() {
        return this.f32317a;
    }
}

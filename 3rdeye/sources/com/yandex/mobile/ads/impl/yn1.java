package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.qw0;

/* loaded from: classes3.dex */
public final class yn1 extends tq1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f35929a;

    /* renamed from: b, reason: collision with root package name */
    private final long f35930b;

    /* renamed from: c, reason: collision with root package name */
    private final ia.g f35931c;

    public yn1(String str, long j4, ia.g source) {
        kotlin.jvm.internal.l.f(source, "source");
        this.f35929a = str;
        this.f35930b = j4;
        this.f35931c = source;
    }

    @Override // com.yandex.mobile.ads.impl.tq1
    public final long a() {
        return this.f35930b;
    }

    @Override // com.yandex.mobile.ads.impl.tq1
    public final qw0 b() {
        String str = this.f35929a;
        if (str == null) {
            return null;
        }
        int i = qw0.f32369d;
        try {
            return qw0.a.a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.tq1
    public final ia.g c() {
        return this.f35931c;
    }
}

package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class d62 {

    /* renamed from: a, reason: collision with root package name */
    private final String f25993a;

    /* renamed from: b, reason: collision with root package name */
    private final long f25994b;

    /* renamed from: c, reason: collision with root package name */
    private final int f25995c;

    /* renamed from: d, reason: collision with root package name */
    private final ux1 f25996d;

    /* renamed from: e, reason: collision with root package name */
    private Long f25997e;

    public d62(int i, long j4, ux1 showNoticeType, String url) {
        kotlin.jvm.internal.l.f(url, "url");
        kotlin.jvm.internal.l.f(showNoticeType, "showNoticeType");
        this.f25993a = url;
        this.f25994b = j4;
        this.f25995c = i;
        this.f25996d = showNoticeType;
    }

    public final long a() {
        return this.f25994b;
    }

    public final Long b() {
        return this.f25997e;
    }

    public final ux1 c() {
        return this.f25996d;
    }

    public final String d() {
        return this.f25993a;
    }

    public final int e() {
        return this.f25995c;
    }

    public final void a(Long l5) {
        this.f25997e = l5;
    }
}

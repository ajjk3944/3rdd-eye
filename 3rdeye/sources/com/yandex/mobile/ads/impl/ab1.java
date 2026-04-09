package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ab1 implements ec2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f24601a;

    /* renamed from: b, reason: collision with root package name */
    private final int f24602b;

    /* renamed from: c, reason: collision with root package name */
    private final int f24603c;

    public ab1(String url, int i, int i10) {
        kotlin.jvm.internal.l.f(url, "url");
        this.f24601a = url;
        this.f24602b = i;
        this.f24603c = i10;
    }

    public final int getAdHeight() {
        return this.f24603c;
    }

    public final int getAdWidth() {
        return this.f24602b;
    }

    @Override // com.yandex.mobile.ads.impl.ec2
    public final String getUrl() {
        return this.f24601a;
    }
}

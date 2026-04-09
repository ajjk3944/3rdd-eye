package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class v51 extends Exception {

    /* renamed from: b, reason: collision with root package name */
    private final String f34390b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v51(String detailMessage) {
        super(detailMessage);
        kotlin.jvm.internal.l.f(detailMessage, "detailMessage");
        this.f34390b = detailMessage;
    }

    public final String a() {
        return this.f34390b;
    }
}

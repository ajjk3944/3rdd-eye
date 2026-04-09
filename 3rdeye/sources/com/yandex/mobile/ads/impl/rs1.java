package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class rs1 extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    private final IOException f32770b;

    /* renamed from: c, reason: collision with root package name */
    private IOException f32771c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs1(IOException firstConnectException) {
        super(firstConnectException);
        kotlin.jvm.internal.l.f(firstConnectException, "firstConnectException");
        this.f32770b = firstConnectException;
        this.f32771c = firstConnectException;
    }

    public final void a(IOException e4) {
        kotlin.jvm.internal.l.f(e4, "e");
        b9.x.a(this.f32770b, e4);
        this.f32771c = e4;
    }

    public final IOException b() {
        return this.f32771c;
    }

    public final IOException a() {
        return this.f32770b;
    }
}

package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class oo0 extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    private final String f31456b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31457c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0(String message, String displayMessage) {
        super(message);
        kotlin.jvm.internal.l.f(message, "message");
        kotlin.jvm.internal.l.f(displayMessage, "displayMessage");
        this.f31456b = message;
        this.f31457c = displayMessage;
    }

    public final String a() {
        return this.f31457c;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f31456b;
    }
}

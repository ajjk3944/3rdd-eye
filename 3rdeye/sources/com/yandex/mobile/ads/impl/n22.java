package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class n22 extends IOException {

    /* renamed from: b, reason: collision with root package name */
    public final o50 f30745b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n22(o50 errorCode) {
        super("stream was reset: " + errorCode);
        kotlin.jvm.internal.l.f(errorCode, "errorCode");
        this.f30745b = errorCode;
    }
}

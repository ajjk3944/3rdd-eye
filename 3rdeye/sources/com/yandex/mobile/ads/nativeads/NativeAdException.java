package com.yandex.mobile.ads.nativeads;

import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class NativeAdException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdException(String detailMessage, Throwable exception) {
        super(detailMessage, exception);
        l.f(detailMessage, "detailMessage");
        l.f(exception, "exception");
    }
}

package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;

/* compiled from: VungleError.kt */
/* loaded from: classes2.dex */
public final class h0 extends k0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(String errorMessage) {
        super(Integer.valueOf(k0.UNKNOWN_EXCEPTION_CODE), Sdk$SDKError.b.UNKNOWN_ERROR, errorMessage, null, null, null, 56, null);
        kotlin.jvm.internal.l.f(errorMessage, "errorMessage");
    }
}

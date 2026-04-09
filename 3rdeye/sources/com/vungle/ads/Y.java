package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;

/* compiled from: VungleError.kt */
/* loaded from: classes2.dex */
public final class Y extends k0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(String privacyUrl) {
        super(136, Sdk$SDKError.b.PRIVACY_URL_ERROR, "Failed to open privacy url: ".concat(privacyUrl), null, null, null, 56, null);
        kotlin.jvm.internal.l.f(privacyUrl, "privacyUrl");
    }
}

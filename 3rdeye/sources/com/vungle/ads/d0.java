package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;

/* compiled from: VungleError.kt */
/* loaded from: classes2.dex */
public final class d0 extends k0 {
    public d0() {
        super(Integer.valueOf(k0.SDK_VERSION_BELOW_REQUIRED_VERSION), Sdk$SDKError.b.API_REQUEST_ERROR, "Config: SDK is supported only for API versions 21 and above", null, null, null, 56, null);
    }
}

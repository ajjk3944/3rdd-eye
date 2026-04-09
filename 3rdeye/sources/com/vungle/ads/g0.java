package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;

/* compiled from: VungleError.kt */
/* loaded from: classes2.dex */
public final class g0 extends k0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(String url) {
        super(137, Sdk$SDKError.b.TPAT_RETRY_FAILED, "Pinging Tpat did not succeed during all allowed reries. Failed url is ".concat(url), null, null, null, 56, null);
        kotlin.jvm.internal.l.f(url, "url");
    }
}

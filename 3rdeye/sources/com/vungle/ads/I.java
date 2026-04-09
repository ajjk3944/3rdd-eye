package com.vungle.ads;

import N7.G8;
import com.vungle.ads.internal.protos.Sdk$SDKError;

/* compiled from: VungleError.kt */
/* loaded from: classes2.dex */
public final class I extends k0 {
    public I(String str) {
        super(222, Sdk$SDKError.b.INVALID_WATERFALL_PLACEMENT_ID, G8.s(str, " header bidding status does not match with loadAd parameters"), str, null, null, 48, null);
    }
}

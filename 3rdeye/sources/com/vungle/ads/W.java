package com.vungle.ads;

import N7.G8;
import com.vungle.ads.internal.protos.Sdk$SDKError;

/* compiled from: VungleError.kt */
/* loaded from: classes2.dex */
public final class W extends k0 {
    public W(String str) {
        super(207, Sdk$SDKError.b.PLACEMENT_AD_TYPE_MISMATCH, G8.s(str, " Ad type does not match with placement type."), str, null, null, 48, null);
    }
}

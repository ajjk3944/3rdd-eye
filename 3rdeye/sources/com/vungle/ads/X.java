package com.vungle.ads;

import N7.C1154e9;
import com.vungle.ads.internal.protos.Sdk$SDKError;

/* compiled from: VungleError.kt */
/* loaded from: classes2.dex */
public final class X extends k0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(String placementId) {
        super(201, Sdk$SDKError.b.INVALID_PLACEMENT_ID, C1154e9.i("Placement '", placementId, "' is invalid"), placementId, null, null, 48, null);
        kotlin.jvm.internal.l.f(placementId, "placementId");
    }
}

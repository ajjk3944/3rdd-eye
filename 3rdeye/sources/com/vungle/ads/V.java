package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;

/* compiled from: VungleError.kt */
/* loaded from: classes2.dex */
public final class V extends k0 {
    public V() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ V(String str, int i, kotlin.jvm.internal.g gVar) {
        this((i & 1) != 0 ? null : str);
    }

    public V(String str) {
        super(3001, Sdk$SDKError.b.OUT_OF_MEMORY, str, null, null, null, 56, null);
    }
}

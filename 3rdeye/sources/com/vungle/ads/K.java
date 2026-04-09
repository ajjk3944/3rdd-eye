package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;

/* compiled from: VungleError.kt */
/* loaded from: classes2.dex */
public final class K extends k0 {
    public K() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ K(String str, int i, kotlin.jvm.internal.g gVar) {
        this((i & 1) != 0 ? null : str);
    }

    public K(String str) {
        super(130, Sdk$SDKError.b.MRAID_DOWNLOAD_JS_ERROR, str, null, null, null, 56, null);
    }
}

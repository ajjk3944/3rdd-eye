package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;

/* compiled from: VungleError.kt */
/* renamed from: com.vungle.ads.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4057o extends k0 {
    public /* synthetic */ C4057o(String str, Integer num, String str2, String str3, int i, kotlin.jvm.internal.g gVar) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4057o(String url, Integer num, String str, String str2) {
        super(117, Sdk$SDKError.b.ASSET_FAILED_STATUS_CODE, "Asset fail to download: " + url + ", Error code:" + num + ", Error message: " + str2, str, null, null, 48, null);
        kotlin.jvm.internal.l.f(url, "url");
    }
}

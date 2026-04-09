package com.vungle.ads;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class m extends BaseFullscreenAd {
    public /* synthetic */ m(Context context, String str, AdConfig adConfig, int i10, kotlin.jvm.internal.i iVar) {
        this(context, str, (i10 & 4) != 0 ? new AdConfig() : adConfig);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@NotNull Context context, @NotNull String placementId, @NotNull AdConfig adConfig) {
        super(context, placementId, adConfig);
        kotlin.jvm.internal.p.e(context, "context");
        kotlin.jvm.internal.p.e(placementId, "placementId");
        kotlin.jvm.internal.p.e(adConfig, "adConfig");
    }

    @Override // com.vungle.ads.BaseAd
    @NotNull
    public com.vungle.ads.internal.f constructAdInternal$vungle_ads_release(@NotNull Context context) {
        kotlin.jvm.internal.p.e(context, "context");
        return new com.vungle.ads.internal.f(context);
    }
}

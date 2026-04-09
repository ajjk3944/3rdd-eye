package com.vungle.ads.internal;

import android.content.Context;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class f extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NotNull Context context) {
        super(context);
        p.e(context, "context");
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdTypeForPlacement(@NotNull q7.h placement) {
        p.e(placement, "placement");
        return placement.isInterstitial() || placement.isAppOpen();
    }
}

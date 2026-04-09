package com.vungle.ads;

import android.content.Context;

/* compiled from: BaseFullscreenAd.kt */
/* renamed from: com.vungle.ads.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4067z extends com.vungle.ads.internal.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4067z(Context context) {
        super(context);
        kotlin.jvm.internal.l.f(context, "context");
    }

    @Override // com.vungle.ads.internal.a
    public i0 getAdSizeForAdRequest() {
        return null;
    }

    @Override // com.vungle.ads.internal.a
    public boolean isValidAdSize(i0 i0Var) {
        return true;
    }
}

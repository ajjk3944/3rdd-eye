package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.api.NativeAdViewTypeApi;

/* loaded from: assets/audience_network/classes2.dex */
public final class S5 implements NativeAdViewTypeApi {
    public final EnumC0901Ve A00;

    public S5(int i4) {
        this.A00 = EnumC0901Ve.A00(i4);
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewTypeApi
    public final int getHeight() {
        return this.A00.A04();
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewTypeApi
    public final int getValue() {
        return this.A00.A05();
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewTypeApi
    public final int getWidth() {
        return this.A00.A06();
    }
}

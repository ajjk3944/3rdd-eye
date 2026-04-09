package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.api.AdSizeApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;

/* renamed from: com.facebook.ads.redexgen.X.Tz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1248Tz implements AdSizeApi {
    public final /* synthetic */ DynamicLoaderImpl A00;
    public final /* synthetic */ EnumC1288Vp A01;

    public C1248Tz(DynamicLoaderImpl dynamicLoaderImpl, EnumC1288Vp enumC1288Vp) {
        this.A00 = dynamicLoaderImpl;
        this.A01 = enumC1288Vp;
    }

    @Override // com.facebook.ads.internal.api.AdSizeApi
    public final int getHeight() {
        return this.A01.A03();
    }

    @Override // com.facebook.ads.internal.api.AdSizeApi
    public final int getWidth() {
        return this.A01.A04();
    }
}

package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum B8 implements InterfaceC1206gL {
    AD_INITIATER_UNSPECIFIED(0),
    BANNER(1),
    DFP_BANNER(2),
    INTERSTITIAL(3),
    DFP_INTERSTITIAL(4),
    NATIVE_EXPRESS(5),
    AD_LOADER(6),
    REWARD_BASED_VIDEO_AD(7),
    BANNER_SEARCH_ADS(8),
    GOOGLE_MOBILE_ADS_SDK_ADAPTER(9),
    APP_OPEN(10),
    REWARDED_INTERSTITIAL(11);


    /* renamed from: a, reason: collision with root package name */
    public final int f7305a;

    B8(int i) {
        this.f7305a = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1206gL
    public final int a() {
        return this.f7305a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f7305a);
    }
}

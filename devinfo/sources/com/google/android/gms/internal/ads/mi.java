package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public enum mi implements sn1 {
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
    public final int f13907a;

    mi(int i4) {
        this.f13907a = i4;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final int b() {
        return this.f13907a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f13907a);
    }
}

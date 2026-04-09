package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public enum yj implements sn1 {
    AD_FORMAT_TYPE_UNSPECIFIED(0),
    BANNER(1),
    INTERSTITIAL(2),
    NATIVE_EXPRESS(3),
    NATIVE_CONTENT(4),
    NATIVE_APP_INSTALL(5),
    NATIVE_CUSTOM_TEMPLATE(6),
    DFP_BANNER(7),
    DFP_INTERSTITIAL(8),
    REWARD_BASED_VIDEO_AD(9),
    BANNER_SEARCH_ADS(10);


    /* renamed from: a, reason: collision with root package name */
    public final int f18775a;

    yj(int i4) {
        this.f18775a = i4;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final int b() {
        return this.f18775a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f18775a);
    }
}

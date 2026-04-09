package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.n9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1570n9 implements InterfaceC1206gL {
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
    public final int f15757a;

    EnumC1570n9(int i) {
        this.f15757a = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1206gL
    public final int a() {
        return this.f15757a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f15757a);
    }
}

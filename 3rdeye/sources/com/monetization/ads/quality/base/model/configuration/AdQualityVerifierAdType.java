package com.monetization.ads.quality.base.model.configuration;

import com.google.gson.internal.c;
import i9.InterfaceC4463a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class AdQualityVerifierAdType {
    private static final /* synthetic */ InterfaceC4463a $ENTRIES;
    private static final /* synthetic */ AdQualityVerifierAdType[] $VALUES;
    public static final AdQualityVerifierAdType BANNER;
    public static final AdQualityVerifierAdType INTERSTITIAL;
    public static final AdQualityVerifierAdType NATIVE;
    public static final AdQualityVerifierAdType REWARDED;

    static {
        AdQualityVerifierAdType adQualityVerifierAdType = new AdQualityVerifierAdType(0, "BANNER");
        BANNER = adQualityVerifierAdType;
        AdQualityVerifierAdType adQualityVerifierAdType2 = new AdQualityVerifierAdType(1, "INTERSTITIAL");
        INTERSTITIAL = adQualityVerifierAdType2;
        AdQualityVerifierAdType adQualityVerifierAdType3 = new AdQualityVerifierAdType(2, "REWARDED");
        REWARDED = adQualityVerifierAdType3;
        AdQualityVerifierAdType adQualityVerifierAdType4 = new AdQualityVerifierAdType(3, "NATIVE");
        NATIVE = adQualityVerifierAdType4;
        AdQualityVerifierAdType[] adQualityVerifierAdTypeArr = {adQualityVerifierAdType, adQualityVerifierAdType2, adQualityVerifierAdType3, adQualityVerifierAdType4};
        $VALUES = adQualityVerifierAdTypeArr;
        $ENTRIES = c.l(adQualityVerifierAdTypeArr);
    }

    private AdQualityVerifierAdType(int i, String str) {
    }

    public static AdQualityVerifierAdType valueOf(String str) {
        return (AdQualityVerifierAdType) Enum.valueOf(AdQualityVerifierAdType.class, str);
    }

    public static AdQualityVerifierAdType[] values() {
        return (AdQualityVerifierAdType[]) $VALUES.clone();
    }
}

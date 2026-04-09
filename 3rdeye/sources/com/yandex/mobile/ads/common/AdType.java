package com.yandex.mobile.ads.common;

import com.google.gson.internal.c;
import i9.InterfaceC4463a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class AdType {
    public static final AdType APP_OPEN_AD;
    public static final AdType BANNER;
    public static final AdType INTERSTITIAL;
    public static final AdType NATIVE;
    public static final AdType REWARDED;
    public static final AdType UNKNOWN;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AdType[] f23994b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4463a f23995c;

    static {
        AdType adType = new AdType(0, "UNKNOWN");
        UNKNOWN = adType;
        AdType adType2 = new AdType(1, "BANNER");
        BANNER = adType2;
        AdType adType3 = new AdType(2, "INTERSTITIAL");
        INTERSTITIAL = adType3;
        AdType adType4 = new AdType(3, "REWARDED");
        REWARDED = adType4;
        AdType adType5 = new AdType(4, "NATIVE");
        NATIVE = adType5;
        AdType adType6 = new AdType(5, "APP_OPEN_AD");
        APP_OPEN_AD = adType6;
        AdType[] adTypeArr = {adType, adType2, adType3, adType4, adType5, adType6};
        f23994b = adTypeArr;
        f23995c = c.l(adTypeArr);
    }

    private AdType(int i, String str) {
    }

    public static InterfaceC4463a<AdType> getEntries() {
        return f23995c;
    }

    public static AdType valueOf(String str) {
        return (AdType) Enum.valueOf(AdType.class, str);
    }

    public static AdType[] values() {
        return (AdType[]) f23994b.clone();
    }
}

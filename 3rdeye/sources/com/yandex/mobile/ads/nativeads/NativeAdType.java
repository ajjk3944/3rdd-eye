package com.yandex.mobile.ads.nativeads;

import com.applovin.sdk.AppLovinEventTypes;
import i9.InterfaceC4463a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class NativeAdType {
    public static final NativeAdType APP_INSTALL;
    public static final NativeAdType CONTENT;
    public static final NativeAdType MEDIA;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ NativeAdType[] f36849c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4463a f36850d;

    /* renamed from: b, reason: collision with root package name */
    private final String f36851b;

    static {
        NativeAdType nativeAdType = new NativeAdType(0, "CONTENT", AppLovinEventTypes.USER_VIEWED_CONTENT);
        CONTENT = nativeAdType;
        NativeAdType nativeAdType2 = new NativeAdType(1, "APP_INSTALL", "app");
        APP_INSTALL = nativeAdType2;
        NativeAdType nativeAdType3 = new NativeAdType(2, "MEDIA", "media");
        MEDIA = nativeAdType3;
        NativeAdType[] nativeAdTypeArr = {nativeAdType, nativeAdType2, nativeAdType3};
        f36849c = nativeAdTypeArr;
        f36850d = com.google.gson.internal.c.l(nativeAdTypeArr);
    }

    private NativeAdType(int i, String str, String str2) {
        this.f36851b = str2;
    }

    public static InterfaceC4463a<NativeAdType> getEntries() {
        return f36850d;
    }

    public static NativeAdType valueOf(String str) {
        return (NativeAdType) Enum.valueOf(NativeAdType.class, str);
    }

    public static NativeAdType[] values() {
        return (NativeAdType[]) f36849c.clone();
    }

    public final String getValue() {
        return this.f36851b;
    }
}

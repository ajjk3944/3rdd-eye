package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class r80 {

    /* renamed from: c, reason: collision with root package name */
    public static final r80 f32549c;

    /* renamed from: d, reason: collision with root package name */
    public static final r80 f32550d;

    /* renamed from: e, reason: collision with root package name */
    public static final r80 f32551e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ r80[] f32552f;

    /* renamed from: b, reason: collision with root package name */
    private final String f32553b;

    static {
        r80 r80Var = new r80(0, "AD_POD_SKIP", "AdPodSkipFeatureToggle");
        r80 r80Var2 = new r80(1, "INTERSTITIAL_PRELOADING", "InterstitialPreloading");
        r80 r80Var3 = new r80(2, "REWARDED_PRELOADING", "RewardedPreloading");
        r80 r80Var4 = new r80(3, "FIRST_VIDEO_PRELOADING_STRATEGY", "FirstVideoPreloadingStrategyFeatureToggle");
        f32549c = r80Var4;
        r80 r80Var5 = new r80(4, "TESTING_NEW_ADAPTER", "TestingNewAdapterFeatureToggle");
        f32550d = r80Var5;
        r80 r80Var6 = new r80(5, "FALLBACK_FOR_VIDEO", "FallbackForVideoFeatureToggle");
        f32551e = r80Var6;
        r80[] r80VarArr = {r80Var, r80Var2, r80Var3, r80Var4, r80Var5, r80Var6};
        f32552f = r80VarArr;
        com.google.gson.internal.c.l(r80VarArr);
    }

    private r80(int i, String str, String str2) {
        this.f32553b = str2;
    }

    public static r80 valueOf(String str) {
        return (r80) Enum.valueOf(r80.class, str);
    }

    public static r80[] values() {
        return (r80[]) f32552f.clone();
    }

    public final String a() {
        return this.f32553b;
    }
}

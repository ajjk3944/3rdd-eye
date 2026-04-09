package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class i21 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f28447c;

    /* renamed from: d, reason: collision with root package name */
    public static final i21 f28448d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ i21[] f28449e;

    /* renamed from: b, reason: collision with root package name */
    private final String f28450b;

    public static final class a {
        private a() {
        }

        public static i21 a(String str) {
            for (i21 i21Var : i21.values()) {
                if (kotlin.jvm.internal.l.b(i21Var.a(), str)) {
                    return i21Var;
                }
            }
            return i21.f28448d;
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    static {
        i21 i21Var = new i21(0, "AD_VIDEO_COMPLETE", "advideocomplete");
        i21 i21Var2 = new i21(1, "IMPRESSION_TRACKING_START", "impressionTrackingStart");
        i21 i21Var3 = new i21(2, "IMPRESSION_TRACKING_SUCCESS", "impressionTrackingSuccess");
        i21 i21Var4 = new i21(3, "CLOSE", com.vungle.ads.internal.presenter.g.CLOSE);
        i21 i21Var5 = new i21(4, "OPEN", com.vungle.ads.internal.presenter.g.OPEN);
        i21 i21Var6 = new i21(5, "REWARDED_AD_COMPLETE", "rewardedAdComplete");
        i21 i21Var7 = new i21(6, "USE_CUSTOM_CLOSE", "usecustomclose");
        i21 i21Var8 = new i21(7, "UNSPECIFIED", "");
        f28448d = i21Var8;
        i21[] i21VarArr = {i21Var, i21Var2, i21Var3, i21Var4, i21Var5, i21Var6, i21Var7, i21Var8, new i21(8, "AD_RENDERED", "adRendered")};
        f28449e = i21VarArr;
        com.google.gson.internal.c.l(i21VarArr);
        f28447c = new a(0);
    }

    private i21(int i, String str, String str2) {
        this.f28450b = str2;
    }

    public static i21 valueOf(String str) {
        return (i21) Enum.valueOf(i21.class, str);
    }

    public static i21[] values() {
        return (i21[]) f28449e.clone();
    }

    public final String a() {
        return this.f28450b;
    }
}

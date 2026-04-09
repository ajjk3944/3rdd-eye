package com.yandex.mobile.ads.impl;

import com.applovin.sdk.AppLovinEventTypes;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ar1 {

    /* renamed from: c, reason: collision with root package name */
    public static final ar1 f24799c;

    /* renamed from: d, reason: collision with root package name */
    public static final ar1 f24800d;

    /* renamed from: e, reason: collision with root package name */
    public static final ar1 f24801e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ ar1[] f24802f;

    /* renamed from: b, reason: collision with root package name */
    private final String f24803b;

    static {
        ar1 ar1Var = new ar1(0, "CONTENT", AppLovinEventTypes.USER_VIEWED_CONTENT);
        f24799c = ar1Var;
        ar1 ar1Var2 = new ar1(1, "APP_INSTALL", "app");
        f24800d = ar1Var2;
        ar1 ar1Var3 = new ar1(2, "IMAGE", "image");
        ar1 ar1Var4 = new ar1(3, "PROMO", "promo");
        ar1 ar1Var5 = new ar1(4, "RETAIL_MEDIA", "productPromo");
        f24801e = ar1Var5;
        ar1[] ar1VarArr = {ar1Var, ar1Var2, ar1Var3, ar1Var4, ar1Var5};
        f24802f = ar1VarArr;
        com.google.gson.internal.c.l(ar1VarArr);
    }

    private ar1(int i, String str, String str2) {
        this.f24803b = str2;
    }

    public static ar1 valueOf(String str) {
        return (ar1) Enum.valueOf(ar1.class, str);
    }

    public static ar1[] values() {
        return (ar1[]) f24802f.clone();
    }

    public final String a() {
        return this.f24803b;
    }
}

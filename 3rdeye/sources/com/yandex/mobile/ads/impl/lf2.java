package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class lf2 {

    /* renamed from: b, reason: collision with root package name */
    public static final lf2 f29990b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ lf2[] f29991c;

    static {
        lf2 lf2Var = new lf2(0, "FIT_XY");
        lf2 lf2Var2 = new lf2(1, "FIT_CENTER");
        f29990b = lf2Var2;
        lf2[] lf2VarArr = {lf2Var, lf2Var2, new lf2(2, "CENTER_CROP")};
        f29991c = lf2VarArr;
        com.google.gson.internal.c.l(lf2VarArr);
    }

    private lf2(int i, String str) {
    }

    public static lf2 valueOf(String str) {
        return (lf2) Enum.valueOf(lf2.class, str);
    }

    public static lf2[] values() {
        return (lf2[]) f29991c.clone();
    }
}

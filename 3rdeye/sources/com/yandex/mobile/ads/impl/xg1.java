package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class xg1 {

    /* renamed from: b, reason: collision with root package name */
    public static final xg1 f35301b;

    /* renamed from: c, reason: collision with root package name */
    public static final xg1 f35302c;

    /* renamed from: d, reason: collision with root package name */
    public static final xg1 f35303d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ xg1[] f35304e;

    static {
        xg1 xg1Var = new xg1(0, "SCREEN_ON");
        f35301b = xg1Var;
        xg1 xg1Var2 = new xg1(1, "SCREEN_OFF");
        f35302c = xg1Var2;
        xg1 xg1Var3 = new xg1(2, "USER_PRESENT");
        f35303d = xg1Var3;
        xg1[] xg1VarArr = {xg1Var, xg1Var2, xg1Var3};
        f35304e = xg1VarArr;
        com.google.gson.internal.c.l(xg1VarArr);
    }

    private xg1(int i, String str) {
    }

    public static xg1 valueOf(String str) {
        return (xg1) Enum.valueOf(xg1.class, str);
    }

    public static xg1[] values() {
        return (xg1[]) f35304e.clone();
    }
}

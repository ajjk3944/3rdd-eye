package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class hq1 {

    /* renamed from: c, reason: collision with root package name */
    public static final hq1 f28334c;

    /* renamed from: d, reason: collision with root package name */
    public static final hq1 f28335d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ hq1[] f28336e;

    /* renamed from: b, reason: collision with root package name */
    private final String f28337b;

    static {
        hq1 hq1Var = new hq1(0, "LIGHT", "light");
        f28334c = hq1Var;
        hq1 hq1Var2 = new hq1(1, "DARK", "dark");
        f28335d = hq1Var2;
        hq1[] hq1VarArr = {hq1Var, hq1Var2};
        f28336e = hq1VarArr;
        com.google.gson.internal.c.l(hq1VarArr);
    }

    private hq1(int i, String str, String str2) {
        this.f28337b = str2;
    }

    public static hq1 valueOf(String str) {
        return (hq1) Enum.valueOf(hq1.class, str);
    }

    public static hq1[] values() {
        return (hq1[]) f28336e.clone();
    }

    public final String a() {
        return this.f28337b;
    }
}

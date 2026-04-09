package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class u91 {

    /* renamed from: c, reason: collision with root package name */
    public static final u91 f33976c;

    /* renamed from: d, reason: collision with root package name */
    public static final u91 f33977d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ u91[] f33978e;

    /* renamed from: b, reason: collision with root package name */
    private final String f33979b;

    static {
        u91 u91Var = new u91(0, "AD", "ad");
        f33976c = u91Var;
        u91 u91Var2 = new u91(1, "PROMO", "promo");
        f33977d = u91Var2;
        u91[] u91VarArr = {u91Var, u91Var2};
        f33978e = u91VarArr;
        com.google.gson.internal.c.l(u91VarArr);
    }

    private u91(int i, String str, String str2) {
        this.f33979b = str2;
    }

    public static u91 valueOf(String str) {
        return (u91) Enum.valueOf(u91.class, str);
    }

    public static u91[] values() {
        return (u91[]) f33978e.clone();
    }

    public final String a() {
        return this.f33979b;
    }
}

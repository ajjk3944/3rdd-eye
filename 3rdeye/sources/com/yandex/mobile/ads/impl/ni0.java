package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ni0 {

    /* renamed from: b, reason: collision with root package name */
    public static final ni0 f30885b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ ni0[] f30886c;

    static {
        ni0 ni0Var = new ni0(0, "PROD");
        f30885b = ni0Var;
        ni0[] ni0VarArr = {ni0Var, new ni0(1, "PREDEFINED")};
        f30886c = ni0VarArr;
        com.google.gson.internal.c.l(ni0VarArr);
    }

    private ni0(int i, String str) {
    }

    public static ni0 valueOf(String str) {
        return (ni0) Enum.valueOf(ni0.class, str);
    }

    public static ni0[] values() {
        return (ni0[]) f30886c.clone();
    }
}

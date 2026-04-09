package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class z00 {

    /* renamed from: c, reason: collision with root package name */
    public static final z00 f36120c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ z00[] f36121d;

    /* renamed from: b, reason: collision with root package name */
    private final String f36122b = "ad_pod";

    static {
        z00 z00Var = new z00();
        f36120c = z00Var;
        z00[] z00VarArr = {z00Var};
        f36121d = z00VarArr;
        com.google.gson.internal.c.l(z00VarArr);
    }

    private z00() {
    }

    public static z00 valueOf(String str) {
        return (z00) Enum.valueOf(z00.class, str);
    }

    public static z00[] values() {
        return (z00[]) f36121d.clone();
    }

    public final String a() {
        return this.f36122b;
    }
}

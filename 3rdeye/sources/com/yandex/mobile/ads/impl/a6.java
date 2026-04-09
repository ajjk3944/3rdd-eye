package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a6 {

    /* renamed from: c, reason: collision with root package name */
    public static final a6 f24441c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a6[] f24442d;

    /* renamed from: b, reason: collision with root package name */
    private final String f24443b;

    static {
        a6 a6Var = new a6(0, "AUTOMATIC", "automatic");
        a6 a6Var2 = new a6(1, "MANUAL", "manual");
        f24441c = a6Var2;
        a6[] a6VarArr = {a6Var, a6Var2};
        f24442d = a6VarArr;
        com.google.gson.internal.c.l(a6VarArr);
    }

    private a6(int i, String str, String str2) {
        this.f24443b = str2;
    }

    public static a6 valueOf(String str) {
        return (a6) Enum.valueOf(a6.class, str);
    }

    public static a6[] values() {
        return (a6[]) f24442d.clone();
    }

    public final String a() {
        return this.f24443b;
    }
}

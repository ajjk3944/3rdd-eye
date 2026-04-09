package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class b10 {

    /* renamed from: c, reason: collision with root package name */
    public static final b10 f25040c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ b10[] f25041d;

    /* renamed from: b, reason: collision with root package name */
    private final String f25042b = "divkit";

    static {
        b10 b10Var = new b10();
        f25040c = b10Var;
        b10[] b10VarArr = {b10Var};
        f25041d = b10VarArr;
        com.google.gson.internal.c.l(b10VarArr);
    }

    private b10() {
    }

    public static b10 valueOf(String str) {
        return (b10) Enum.valueOf(b10.class, str);
    }

    public static b10[] values() {
        return (b10[]) f25041d.clone();
    }

    public final String a() {
        return this.f25042b;
    }
}

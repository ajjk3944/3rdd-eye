package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class e9 {

    /* renamed from: b, reason: collision with root package name */
    public static final e9 f26735b;

    /* renamed from: c, reason: collision with root package name */
    public static final e9 f26736c;

    /* renamed from: d, reason: collision with root package name */
    public static final e9 f26737d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ e9[] f26738e;

    static {
        e9 e9Var = new e9(0, "SINGLE");
        f26735b = e9Var;
        e9 e9Var2 = new e9(1, "BLOCK");
        f26736c = e9Var2;
        e9 e9Var3 = new e9(2, "BLOCK_INNER_CREATIVE");
        f26737d = e9Var3;
        e9[] e9VarArr = {e9Var, e9Var2, e9Var3};
        f26738e = e9VarArr;
        com.google.gson.internal.c.l(e9VarArr);
    }

    private e9(int i, String str) {
    }

    public static e9 valueOf(String str) {
        return (e9) Enum.valueOf(e9.class, str);
    }

    public static e9[] values() {
        return (e9[]) f26738e.clone();
    }
}

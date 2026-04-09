package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class o20 {

    /* renamed from: b, reason: collision with root package name */
    public static final o20 f31139b;

    /* renamed from: c, reason: collision with root package name */
    public static final o20 f31140c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ o20[] f31141d;

    static {
        o20 o20Var = new o20(0, "BLOCK");
        f31139b = o20Var;
        o20 o20Var2 = new o20(1, "BLOCK_INNER_AD");
        f31140c = o20Var2;
        o20[] o20VarArr = {o20Var, o20Var2};
        f31141d = o20VarArr;
        com.google.gson.internal.c.l(o20VarArr);
    }

    private o20(int i, String str) {
    }

    public static o20 valueOf(String str) {
        return (o20) Enum.valueOf(o20.class, str);
    }

    public static o20[] values() {
        return (o20[]) f31141d.clone();
    }
}

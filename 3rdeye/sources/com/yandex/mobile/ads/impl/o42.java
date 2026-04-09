package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class o42 {

    /* renamed from: b, reason: collision with root package name */
    public static final o42 f31175b;

    /* renamed from: c, reason: collision with root package name */
    public static final o42 f31176c;

    /* renamed from: d, reason: collision with root package name */
    public static final o42 f31177d;

    /* renamed from: e, reason: collision with root package name */
    public static final o42 f31178e;

    /* renamed from: f, reason: collision with root package name */
    public static final o42 f31179f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ o42[] f31180g;

    static {
        o42 o42Var = new o42(0, "TIME");
        f31175b = o42Var;
        o42 o42Var2 = new o42(1, "PERCENTAGE");
        f31176c = o42Var2;
        o42 o42Var3 = new o42(2, "START");
        f31177d = o42Var3;
        o42 o42Var4 = new o42(3, "END");
        f31178e = o42Var4;
        o42 o42Var5 = new o42(4, "POSITION");
        f31179f = o42Var5;
        o42[] o42VarArr = {o42Var, o42Var2, o42Var3, o42Var4, o42Var5};
        f31180g = o42VarArr;
        com.google.gson.internal.c.l(o42VarArr);
    }

    private o42(int i, String str) {
    }

    public static o42 valueOf(String str) {
        return (o42) Enum.valueOf(o42.class, str);
    }

    public static o42[] values() {
        return (o42[]) f31180g.clone();
    }
}

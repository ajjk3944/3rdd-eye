package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class z01 {

    /* renamed from: b, reason: collision with root package name */
    public static final z01 f36123b;

    /* renamed from: c, reason: collision with root package name */
    public static final z01 f36124c;

    /* renamed from: d, reason: collision with root package name */
    public static final z01 f36125d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ z01[] f36126e;

    static {
        z01 z01Var = new z01(0, "VERBOSE");
        z01 z01Var2 = new z01(1, "DEBUG");
        z01 z01Var3 = new z01(2, "INFO");
        f36123b = z01Var3;
        z01 z01Var4 = new z01(3, "WARNING");
        f36124c = z01Var4;
        z01 z01Var5 = new z01(4, "ERROR");
        f36125d = z01Var5;
        z01[] z01VarArr = {z01Var, z01Var2, z01Var3, z01Var4, z01Var5};
        f36126e = z01VarArr;
        com.google.gson.internal.c.l(z01VarArr);
    }

    private z01(int i, String str) {
    }

    public static z01 valueOf(String str) {
        return (z01) Enum.valueOf(z01.class, str);
    }

    public static z01[] values() {
        return (z01[]) f36126e.clone();
    }
}

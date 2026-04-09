package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class f10 {

    /* renamed from: b, reason: collision with root package name */
    public static final f10 f27166b;

    /* renamed from: c, reason: collision with root package name */
    public static final f10 f27167c;

    /* renamed from: d, reason: collision with root package name */
    public static final f10 f27168d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ f10[] f27169e;

    static {
        f10 f10Var = new f10(0, "PHONE");
        f27166b = f10Var;
        f10 f10Var2 = new f10(1, "TABLET");
        f27167c = f10Var2;
        f10 f10Var3 = new f10(2, "TV");
        f27168d = f10Var3;
        f10[] f10VarArr = {f10Var, f10Var2, f10Var3};
        f27169e = f10VarArr;
        com.google.gson.internal.c.l(f10VarArr);
    }

    private f10(int i, String str) {
    }

    public static f10 valueOf(String str) {
        return (f10) Enum.valueOf(f10.class, str);
    }

    public static f10[] values() {
        return (f10[]) f27169e.clone();
    }
}

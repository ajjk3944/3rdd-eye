package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class q12 {

    /* renamed from: b, reason: collision with root package name */
    public static final q12 f31993b;

    /* renamed from: c, reason: collision with root package name */
    public static final q12 f31994c;

    /* renamed from: d, reason: collision with root package name */
    public static final q12 f31995d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ q12[] f31996e;

    static {
        q12 q12Var = new q12(0, "DEFAULT");
        f31993b = q12Var;
        q12 q12Var2 = new q12(1, "SOCIAL");
        f31994c = q12Var2;
        q12 q12Var3 = new q12(2, "EMPTY");
        f31995d = q12Var3;
        q12[] q12VarArr = {q12Var, q12Var2, q12Var3};
        f31996e = q12VarArr;
        com.google.gson.internal.c.l(q12VarArr);
    }

    private q12(int i, String str) {
    }

    public static q12 valueOf(String str) {
        return (q12) Enum.valueOf(q12.class, str);
    }

    public static q12[] values() {
        return (q12[]) f31996e.clone();
    }
}

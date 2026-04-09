package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a60 {

    /* renamed from: b, reason: collision with root package name */
    public static final a60 f24444b;

    /* renamed from: c, reason: collision with root package name */
    public static final a60 f24445c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a60[] f24446d;

    static {
        a60 a60Var = new a60(0, "FRAME");
        f24444b = a60Var;
        a60 a60Var2 = new a60(1, "TRACE");
        f24445c = a60Var2;
        a60[] a60VarArr = {a60Var, a60Var2};
        f24446d = a60VarArr;
        com.google.gson.internal.c.l(a60VarArr);
    }

    private a60(int i, String str) {
    }

    public static a60 valueOf(String str) {
        return (a60) Enum.valueOf(a60.class, str);
    }

    public static a60[] values() {
        return (a60[]) f24446d.clone();
    }
}

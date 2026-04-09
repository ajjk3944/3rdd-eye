package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ef1 {

    /* renamed from: c, reason: collision with root package name */
    public static final ef1 f26821c;

    /* renamed from: d, reason: collision with root package name */
    public static final ef1 f26822d;

    /* renamed from: e, reason: collision with root package name */
    public static final ef1 f26823e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ ef1[] f26824f;

    /* renamed from: b, reason: collision with root package name */
    private final int f26825b;

    static {
        ef1 ef1Var = new ef1(0, 2, "LANDSCAPE");
        f26821c = ef1Var;
        ef1 ef1Var2 = new ef1(1, 1, "PORTRAIT");
        f26822d = ef1Var2;
        ef1 ef1Var3 = new ef1(2, 0, "UNDEFINED");
        f26823e = ef1Var3;
        ef1[] ef1VarArr = {ef1Var, ef1Var2, ef1Var3};
        f26824f = ef1VarArr;
        com.google.gson.internal.c.l(ef1VarArr);
    }

    private ef1(int i, int i10, String str) {
        this.f26825b = i10;
    }

    public static ef1 valueOf(String str) {
        return (ef1) Enum.valueOf(ef1.class, str);
    }

    public static ef1[] values() {
        return (ef1[]) f26824f.clone();
    }

    public final int a() {
        return this.f26825b;
    }
}

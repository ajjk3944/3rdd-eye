package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class gq1 {

    /* renamed from: b, reason: collision with root package name */
    public static final gq1 f27872b;

    /* renamed from: c, reason: collision with root package name */
    public static final gq1 f27873c;

    /* renamed from: d, reason: collision with root package name */
    public static final gq1 f27874d;

    /* renamed from: e, reason: collision with root package name */
    public static final gq1 f27875e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ gq1[] f27876f;

    static {
        gq1 gq1Var = new gq1(0, "UNKNOWN");
        f27872b = gq1Var;
        gq1 gq1Var2 = new gq1(1, "STARTUP");
        f27873c = gq1Var2;
        gq1 gq1Var3 = new gq1(2, "VMAP");
        f27874d = gq1Var3;
        gq1 gq1Var4 = new gq1(3, "AD");
        f27875e = gq1Var4;
        gq1[] gq1VarArr = {gq1Var, gq1Var2, gq1Var3, gq1Var4};
        f27876f = gq1VarArr;
        com.google.gson.internal.c.l(gq1VarArr);
    }

    private gq1(int i, String str) {
    }

    public static gq1 valueOf(String str) {
        return (gq1) Enum.valueOf(gq1.class, str);
    }

    public static gq1[] values() {
        return (gq1[]) f27876f.clone();
    }
}

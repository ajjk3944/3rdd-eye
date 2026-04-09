package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class nc2 {

    /* renamed from: b, reason: collision with root package name */
    public static final nc2 f30840b;

    /* renamed from: c, reason: collision with root package name */
    public static final nc2 f30841c;

    /* renamed from: d, reason: collision with root package name */
    public static final nc2 f30842d;

    /* renamed from: e, reason: collision with root package name */
    public static final nc2 f30843e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ nc2[] f30844f;

    static {
        nc2 nc2Var = new nc2(0, "PREROLL");
        f30840b = nc2Var;
        nc2 nc2Var2 = new nc2(1, "MIDROLL");
        f30841c = nc2Var2;
        nc2 nc2Var3 = new nc2(2, "POSTROLL");
        f30842d = nc2Var3;
        nc2 nc2Var4 = new nc2(3, "STANDALONE");
        f30843e = nc2Var4;
        nc2[] nc2VarArr = {nc2Var, nc2Var2, nc2Var3, nc2Var4};
        f30844f = nc2VarArr;
        com.google.gson.internal.c.l(nc2VarArr);
    }

    private nc2(int i, String str) {
    }

    public static nc2 valueOf(String str) {
        return (nc2) Enum.valueOf(nc2.class, str);
    }

    public static nc2[] values() {
        return (nc2[]) f30844f.clone();
    }
}

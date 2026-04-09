package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class tk0 {

    /* renamed from: c, reason: collision with root package name */
    public static final tk0 f33653c;

    /* renamed from: d, reason: collision with root package name */
    public static final tk0 f33654d;

    /* renamed from: e, reason: collision with root package name */
    public static final tk0 f33655e;

    /* renamed from: f, reason: collision with root package name */
    public static final tk0 f33656f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ tk0[] f33657g;

    /* renamed from: b, reason: collision with root package name */
    private final String f33658b;

    static {
        tk0 tk0Var = new tk0(0, "INITIALIZATION", "initialization");
        f33653c = tk0Var;
        tk0 tk0Var2 = new tk0(1, "AD", "ad");
        f33654d = tk0Var2;
        tk0 tk0Var3 = new tk0(2, "INSTREAM", "instream");
        f33655e = tk0Var3;
        tk0 tk0Var4 = new tk0(3, "BIDDER_TOKEN", "bidder_token");
        f33656f = tk0Var4;
        tk0[] tk0VarArr = {tk0Var, tk0Var2, tk0Var3, tk0Var4};
        f33657g = tk0VarArr;
        com.google.gson.internal.c.l(tk0VarArr);
    }

    private tk0(int i, String str, String str2) {
        this.f33658b = str2;
    }

    public static tk0 valueOf(String str) {
        return (tk0) Enum.valueOf(tk0.class, str);
    }

    public static tk0[] values() {
        return (tk0[]) f33657g.clone();
    }

    public final String a() {
        return this.f33658b;
    }
}

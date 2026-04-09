package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class r91 {

    /* renamed from: c, reason: collision with root package name */
    public static final r91 f32561c;

    /* renamed from: d, reason: collision with root package name */
    public static final r91 f32562d;

    /* renamed from: e, reason: collision with root package name */
    public static final r91 f32563e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ r91[] f32564f;

    /* renamed from: b, reason: collision with root package name */
    private final String f32565b;

    static {
        r91 r91Var = new r91(0, "AD", "ad");
        f32561c = r91Var;
        r91 r91Var2 = new r91(1, "BULK", "bulk");
        f32562d = r91Var2;
        r91 r91Var3 = new r91(2, "SLIDER", "ad_unit");
        f32563e = r91Var3;
        r91[] r91VarArr = {r91Var, r91Var2, r91Var3};
        f32564f = r91VarArr;
        com.google.gson.internal.c.l(r91VarArr);
    }

    private r91(int i, String str, String str2) {
        this.f32565b = str2;
    }

    public static r91 valueOf(String str) {
        return (r91) Enum.valueOf(r91.class, str);
    }

    public static r91[] values() {
        return (r91[]) f32564f.clone();
    }

    public final String a() {
        return this.f32565b;
    }
}

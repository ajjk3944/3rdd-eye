package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class s81 {

    /* renamed from: c, reason: collision with root package name */
    public static final s81 f32895c;

    /* renamed from: d, reason: collision with root package name */
    public static final s81 f32896d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ s81[] f32897e;

    /* renamed from: b, reason: collision with root package name */
    private final String f32898b;

    static {
        s81 s81Var = new s81(0, "LoadingOnShow", "loading_on_show");
        f32895c = s81Var;
        s81 s81Var2 = new s81(1, "LoadingOnBack", "loading_on_back");
        f32896d = s81Var2;
        s81[] s81VarArr = {s81Var, s81Var2};
        f32897e = s81VarArr;
        com.google.gson.internal.c.l(s81VarArr);
    }

    private s81(int i, String str, String str2) {
        this.f32898b = str2;
    }

    public static s81 valueOf(String str) {
        return (s81) Enum.valueOf(s81.class, str);
    }

    public static s81[] values() {
        return (s81[]) f32897e.clone();
    }

    public final String a() {
        return this.f32898b;
    }
}

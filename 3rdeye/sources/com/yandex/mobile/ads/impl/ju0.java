package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ju0 {

    /* renamed from: b, reason: collision with root package name */
    public static final ju0 f29271b;

    /* renamed from: c, reason: collision with root package name */
    public static final ju0 f29272c;

    /* renamed from: d, reason: collision with root package name */
    public static final ju0 f29273d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ ju0[] f29274e;

    static {
        ju0 ju0Var = new ju0(0, "EXACTLY");
        f29271b = ju0Var;
        ju0 ju0Var2 = new ju0(1, "AT_MOST");
        f29272c = ju0Var2;
        ju0 ju0Var3 = new ju0(2, "UNSPECIFIED");
        f29273d = ju0Var3;
        ju0[] ju0VarArr = {ju0Var, ju0Var2, ju0Var3};
        f29274e = ju0VarArr;
        com.google.gson.internal.c.l(ju0VarArr);
    }

    private ju0(int i, String str) {
    }

    public static ju0 valueOf(String str) {
        return (ju0) Enum.valueOf(ju0.class, str);
    }

    public static ju0[] values() {
        return (ju0[]) f29274e.clone();
    }
}

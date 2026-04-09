package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class kq0 {

    /* renamed from: b, reason: collision with root package name */
    public static final kq0 f29755b;

    /* renamed from: c, reason: collision with root package name */
    public static final kq0 f29756c;

    /* renamed from: d, reason: collision with root package name */
    public static final kq0 f29757d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ kq0[] f29758e;

    static {
        kq0 kq0Var = new kq0(0, "LOAD");
        f29755b = kq0Var;
        kq0 kq0Var2 = new kq0(1, "SHOW");
        f29756c = kq0Var2;
        kq0 kq0Var3 = new kq0(2, "RETURN_TO_APP");
        f29757d = kq0Var3;
        kq0[] kq0VarArr = {kq0Var, kq0Var2, kq0Var3};
        f29758e = kq0VarArr;
        com.google.gson.internal.c.l(kq0VarArr);
    }

    private kq0(int i, String str) {
    }

    public static kq0 valueOf(String str) {
        return (kq0) Enum.valueOf(kq0.class, str);
    }

    public static kq0[] values() {
        return (kq0[]) f29758e.clone();
    }
}

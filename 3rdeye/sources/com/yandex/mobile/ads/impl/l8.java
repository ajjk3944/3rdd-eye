package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class l8 {

    /* renamed from: b, reason: collision with root package name */
    public static final l8 f29916b;

    /* renamed from: c, reason: collision with root package name */
    public static final l8 f29917c;

    /* renamed from: d, reason: collision with root package name */
    public static final l8 f29918d;

    /* renamed from: e, reason: collision with root package name */
    public static final l8 f29919e;

    /* renamed from: f, reason: collision with root package name */
    public static final l8 f29920f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ l8[] f29921g;

    static {
        l8 l8Var = new l8(0, "INITIAL");
        f29916b = l8Var;
        l8 l8Var2 = new l8(1, "PREPARED");
        f29917c = l8Var2;
        l8 l8Var3 = new l8(2, "STARTED");
        f29918d = l8Var3;
        l8 l8Var4 = new l8(3, "ENDED");
        f29919e = l8Var4;
        l8 l8Var5 = new l8(4, "ERROR");
        f29920f = l8Var5;
        l8[] l8VarArr = {l8Var, l8Var2, l8Var3, l8Var4, l8Var5};
        f29921g = l8VarArr;
        com.google.gson.internal.c.l(l8VarArr);
    }

    private l8(int i, String str) {
    }

    public static l8 valueOf(String str) {
        return (l8) Enum.valueOf(l8.class, str);
    }

    public static l8[] values() {
        return (l8[]) f29921g.clone();
    }
}

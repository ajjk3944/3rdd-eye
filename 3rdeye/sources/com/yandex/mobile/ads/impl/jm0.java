package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class jm0 {

    /* renamed from: b, reason: collision with root package name */
    public static final jm0 f29209b;

    /* renamed from: c, reason: collision with root package name */
    public static final jm0 f29210c;

    /* renamed from: d, reason: collision with root package name */
    public static final jm0 f29211d;

    /* renamed from: e, reason: collision with root package name */
    public static final jm0 f29212e;

    /* renamed from: f, reason: collision with root package name */
    public static final jm0 f29213f;

    /* renamed from: g, reason: collision with root package name */
    public static final jm0 f29214g;

    /* renamed from: h, reason: collision with root package name */
    public static final jm0 f29215h;
    private static final /* synthetic */ jm0[] i;

    static {
        jm0 jm0Var = new jm0(0, "NONE");
        f29209b = jm0Var;
        jm0 jm0Var2 = new jm0(1, "PREPARED");
        f29210c = jm0Var2;
        jm0 jm0Var3 = new jm0(2, "PLAYING");
        f29211d = jm0Var3;
        jm0 jm0Var4 = new jm0(3, "PAUSED");
        f29212e = jm0Var4;
        jm0 jm0Var5 = new jm0(4, "SKIPPED");
        f29213f = jm0Var5;
        jm0 jm0Var6 = new jm0(5, "ERROR");
        f29214g = jm0Var6;
        jm0 jm0Var7 = new jm0(6, "COMPLETED");
        f29215h = jm0Var7;
        jm0[] jm0VarArr = {jm0Var, jm0Var2, jm0Var3, jm0Var4, jm0Var5, jm0Var6, jm0Var7};
        i = jm0VarArr;
        com.google.gson.internal.c.l(jm0VarArr);
    }

    private jm0(int i10, String str) {
    }

    public static jm0 valueOf(String str) {
        return (jm0) Enum.valueOf(jm0.class, str);
    }

    public static jm0[] values() {
        return (jm0[]) i.clone();
    }
}

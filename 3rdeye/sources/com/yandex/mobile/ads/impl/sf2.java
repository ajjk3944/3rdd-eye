package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class sf2 {

    /* renamed from: b, reason: collision with root package name */
    public static final sf2 f32968b;

    /* renamed from: c, reason: collision with root package name */
    public static final sf2 f32969c;

    /* renamed from: d, reason: collision with root package name */
    public static final sf2 f32970d;

    /* renamed from: e, reason: collision with root package name */
    public static final sf2 f32971e;

    /* renamed from: f, reason: collision with root package name */
    public static final sf2 f32972f;

    /* renamed from: g, reason: collision with root package name */
    public static final sf2 f32973g;

    /* renamed from: h, reason: collision with root package name */
    public static final sf2 f32974h;
    public static final sf2 i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ sf2[] f32975j;

    static {
        sf2 sf2Var = new sf2(0, "INITIAL");
        f32968b = sf2Var;
        sf2 sf2Var2 = new sf2(1, "PREPARING");
        f32969c = sf2Var2;
        sf2 sf2Var3 = new sf2(2, "PREPARED");
        f32970d = sf2Var3;
        sf2 sf2Var4 = new sf2(3, "PLAYING");
        f32971e = sf2Var4;
        sf2 sf2Var5 = new sf2(4, "STOPPED");
        f32972f = sf2Var5;
        sf2 sf2Var6 = new sf2(5, "FINISHED");
        f32973g = sf2Var6;
        sf2 sf2Var7 = new sf2(6, "PAUSED");
        f32974h = sf2Var7;
        sf2 sf2Var8 = new sf2(7, "ERROR");
        i = sf2Var8;
        sf2[] sf2VarArr = {sf2Var, sf2Var2, sf2Var3, sf2Var4, sf2Var5, sf2Var6, sf2Var7, sf2Var8};
        f32975j = sf2VarArr;
        com.google.gson.internal.c.l(sf2VarArr);
    }

    private sf2(int i10, String str) {
    }

    public static sf2 valueOf(String str) {
        return (sf2) Enum.valueOf(sf2.class, str);
    }

    public static sf2[] values() {
        return (sf2[]) f32975j.clone();
    }
}

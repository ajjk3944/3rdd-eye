package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class cd2 {

    /* renamed from: b, reason: collision with root package name */
    public static final cd2 f25601b;

    /* renamed from: c, reason: collision with root package name */
    public static final cd2 f25602c;

    /* renamed from: d, reason: collision with root package name */
    public static final cd2 f25603d;

    /* renamed from: e, reason: collision with root package name */
    public static final cd2 f25604e;

    /* renamed from: f, reason: collision with root package name */
    public static final cd2 f25605f;

    /* renamed from: g, reason: collision with root package name */
    public static final cd2 f25606g;

    /* renamed from: h, reason: collision with root package name */
    public static final cd2 f25607h;
    public static final cd2 i;

    /* renamed from: j, reason: collision with root package name */
    public static final cd2 f25608j;

    /* renamed from: k, reason: collision with root package name */
    public static final cd2 f25609k;

    /* renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ cd2[] f25610l;

    static {
        cd2 cd2Var = new cd2(0, "INITIAL");
        f25601b = cd2Var;
        cd2 cd2Var2 = new cd2(1, "PREPARING");
        f25602c = cd2Var2;
        cd2 cd2Var3 = new cd2(2, "PREPARED");
        f25603d = cd2Var3;
        cd2 cd2Var4 = new cd2(3, "PLAYING");
        f25604e = cd2Var4;
        cd2 cd2Var5 = new cd2(4, "STOPPED");
        f25605f = cd2Var5;
        cd2 cd2Var6 = new cd2(5, "FINISHED");
        f25606g = cd2Var6;
        cd2 cd2Var7 = new cd2(6, "PAUSED");
        f25607h = cd2Var7;
        cd2 cd2Var8 = new cd2(7, "BUFFERING");
        i = cd2Var8;
        cd2 cd2Var9 = new cd2(8, "PLAYING_ERROR");
        f25608j = cd2Var9;
        cd2 cd2Var10 = new cd2(9, "PREPARING_ERROR");
        f25609k = cd2Var10;
        cd2[] cd2VarArr = {cd2Var, cd2Var2, cd2Var3, cd2Var4, cd2Var5, cd2Var6, cd2Var7, cd2Var8, cd2Var9, cd2Var10};
        f25610l = cd2VarArr;
        com.google.gson.internal.c.l(cd2VarArr);
    }

    private cd2(int i10, String str) {
    }

    public static cd2 valueOf(String str) {
        return (cd2) Enum.valueOf(cd2.class, str);
    }

    public static cd2[] values() {
        return (cd2[]) f25610l.clone();
    }
}

package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class im0 {

    /* renamed from: b, reason: collision with root package name */
    public static final im0 f28742b;

    /* renamed from: c, reason: collision with root package name */
    public static final im0 f28743c;

    /* renamed from: d, reason: collision with root package name */
    public static final im0 f28744d;

    /* renamed from: e, reason: collision with root package name */
    public static final im0 f28745e;

    /* renamed from: f, reason: collision with root package name */
    public static final im0 f28746f;

    /* renamed from: g, reason: collision with root package name */
    public static final im0 f28747g;

    /* renamed from: h, reason: collision with root package name */
    public static final im0 f28748h;
    private static final /* synthetic */ im0[] i;

    static {
        im0 im0Var = new im0(0, "NONE");
        f28742b = im0Var;
        im0 im0Var2 = new im0(1, "PREPARED");
        f28743c = im0Var2;
        im0 im0Var3 = new im0(2, "PLAYING");
        f28744d = im0Var3;
        im0 im0Var4 = new im0(3, "PAUSED");
        f28745e = im0Var4;
        im0 im0Var5 = new im0(4, "SKIPPED");
        f28746f = im0Var5;
        im0 im0Var6 = new im0(5, "ERROR");
        f28747g = im0Var6;
        im0 im0Var7 = new im0(6, "COMPLETED");
        f28748h = im0Var7;
        im0[] im0VarArr = {im0Var, im0Var2, im0Var3, im0Var4, im0Var5, im0Var6, im0Var7};
        i = im0VarArr;
        com.google.gson.internal.c.l(im0VarArr);
    }

    private im0(int i10, String str) {
    }

    public static im0 valueOf(String str) {
        return (im0) Enum.valueOf(im0.class, str);
    }

    public static im0[] values() {
        return (im0[]) i.clone();
    }
}

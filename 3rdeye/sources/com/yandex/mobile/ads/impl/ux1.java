package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ux1 {

    /* renamed from: b, reason: collision with root package name */
    public static final ux1 f34241b;

    /* renamed from: c, reason: collision with root package name */
    public static final ux1 f34242c;

    /* renamed from: d, reason: collision with root package name */
    public static final ux1 f34243d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ ux1[] f34244e;

    static {
        ux1 ux1Var = new ux1(0, "AD");
        f34241b = ux1Var;
        ux1 ux1Var2 = new ux1(1, "DSP");
        f34242c = ux1Var2;
        ux1 ux1Var3 = new ux1(2, "UNDEFINED");
        f34243d = ux1Var3;
        ux1[] ux1VarArr = {ux1Var, ux1Var2, ux1Var3};
        f34244e = ux1VarArr;
        com.google.gson.internal.c.l(ux1VarArr);
    }

    private ux1(int i, String str) {
    }

    public static ux1 valueOf(String str) {
        return (ux1) Enum.valueOf(ux1.class, str);
    }

    public static ux1[] values() {
        return (ux1[]) f34244e.clone();
    }
}

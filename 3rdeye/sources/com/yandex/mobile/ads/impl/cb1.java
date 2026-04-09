package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class cb1 {

    /* renamed from: c, reason: collision with root package name */
    public static final cb1 f25589c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ cb1[] f25590d;

    /* renamed from: b, reason: collision with root package name */
    private final String f25591b = "first_video_preloading_strategy";

    static {
        cb1 cb1Var = new cb1();
        f25589c = cb1Var;
        cb1[] cb1VarArr = {cb1Var};
        f25590d = cb1VarArr;
        com.google.gson.internal.c.l(cb1VarArr);
    }

    private cb1() {
    }

    public static cb1 valueOf(String str) {
        return (cb1) Enum.valueOf(cb1.class, str);
    }

    public static cb1[] values() {
        return (cb1[]) f25590d.clone();
    }

    public final String a() {
        return this.f25591b;
    }
}

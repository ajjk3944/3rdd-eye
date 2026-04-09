package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class lz1 {

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ lz1[] f30135c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f30136d = 0;

    /* renamed from: b, reason: collision with root package name */
    private final String f30137b;

    static {
        lz1[] lz1VarArr = {new lz1(0, "VISIBLE", "visible"), new lz1(1, "DELAYED", "delayed")};
        f30135c = lz1VarArr;
        com.google.gson.internal.c.l(lz1VarArr);
    }

    private lz1(int i, String str, String str2) {
        this.f30137b = str2;
    }

    public static lz1 valueOf(String str) {
        return (lz1) Enum.valueOf(lz1.class, str);
    }

    public static lz1[] values() {
        return (lz1[]) f30135c.clone();
    }

    public final String a() {
        return this.f30137b;
    }
}

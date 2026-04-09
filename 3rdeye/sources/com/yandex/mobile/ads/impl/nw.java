package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class nw {

    /* renamed from: c, reason: collision with root package name */
    public static final nw f31029c;

    /* renamed from: d, reason: collision with root package name */
    public static final nw f31030d;

    /* renamed from: e, reason: collision with root package name */
    public static final nw f31031e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ nw[] f31032f;

    /* renamed from: b, reason: collision with root package name */
    private final String f31033b;

    static {
        nw nwVar = new nw(0, "BIDDING", "Bidding");
        f31029c = nwVar;
        nw nwVar2 = new nw(1, "WATERFALL", "Waterfall");
        f31030d = nwVar2;
        nw nwVar3 = new nw(2, "NONE", "None");
        f31031e = nwVar3;
        nw[] nwVarArr = {nwVar, nwVar2, nwVar3};
        f31032f = nwVarArr;
        com.google.gson.internal.c.l(nwVarArr);
    }

    private nw(int i, String str, String str2) {
        this.f31033b = str2;
    }

    public static nw valueOf(String str) {
        return (nw) Enum.valueOf(nw.class, str);
    }

    public static nw[] values() {
        return (nw[]) f31032f.clone();
    }

    public final String a() {
        return this.f31033b;
    }
}

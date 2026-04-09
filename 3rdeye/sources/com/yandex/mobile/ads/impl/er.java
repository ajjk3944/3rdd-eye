package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class er {

    /* renamed from: c, reason: collision with root package name */
    public static final er f26989c;

    /* renamed from: d, reason: collision with root package name */
    public static final er f26990d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ er[] f26991e;

    /* renamed from: b, reason: collision with root package name */
    private final String f26992b;

    static {
        er erVar = new er(0, "NETWORK", "network");
        f26989c = erVar;
        er erVar2 = new er(1, "CACHE", "cache");
        f26990d = erVar2;
        er[] erVarArr = {erVar, erVar2};
        f26991e = erVarArr;
        com.google.gson.internal.c.l(erVarArr);
    }

    private er(int i, String str, String str2) {
        this.f26992b = str2;
    }

    public static er valueOf(String str) {
        return (er) Enum.valueOf(er.class, str);
    }

    public static er[] values() {
        return (er[]) f26991e.clone();
    }

    public final String a() {
        return this.f26992b;
    }
}

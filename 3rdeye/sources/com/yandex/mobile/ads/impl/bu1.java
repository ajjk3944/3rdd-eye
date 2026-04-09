package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class bu1 {

    /* renamed from: c, reason: collision with root package name */
    public static final bu1 f25396c;

    /* renamed from: d, reason: collision with root package name */
    public static final bu1 f25397d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ bu1[] f25398e;

    /* renamed from: b, reason: collision with root package name */
    private final String f25399b;

    static {
        bu1 bu1Var = new bu1(0, "CONFIGURATION_FAILED", "configuration_failed");
        f25396c = bu1Var;
        bu1 bu1Var2 = new bu1(1, "TIMEOUT", "timeout");
        f25397d = bu1Var2;
        bu1[] bu1VarArr = {bu1Var, bu1Var2};
        f25398e = bu1VarArr;
        com.google.gson.internal.c.l(bu1VarArr);
    }

    private bu1(int i, String str, String str2) {
        this.f25399b = str2;
    }

    public static bu1 valueOf(String str) {
        return (bu1) Enum.valueOf(bu1.class, str);
    }

    public static bu1[] values() {
        return (bu1[]) f25398e.clone();
    }

    public final String a() {
        return this.f25399b;
    }
}

package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class bt0 {

    /* renamed from: c, reason: collision with root package name */
    public static final bt0 f25385c;

    /* renamed from: d, reason: collision with root package name */
    public static final bt0 f25386d;

    /* renamed from: e, reason: collision with root package name */
    public static final bt0 f25387e;

    /* renamed from: f, reason: collision with root package name */
    public static final bt0 f25388f;

    /* renamed from: g, reason: collision with root package name */
    public static final bt0 f25389g;

    /* renamed from: h, reason: collision with root package name */
    public static final bt0 f25390h;
    public static final bt0 i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ bt0[] f25391j;

    /* renamed from: b, reason: collision with root package name */
    private final String f25392b;

    static {
        bt0 bt0Var = new bt0(0, "AUTOMATIC_SDK_INITIALIZATION", "com.yandex.mobile.ads.AUTOMATIC_SDK_INITIALIZATION");
        f25385c = bt0Var;
        bt0 bt0Var2 = new bt0(1, "AGE_RESTRICTED_USER", "com.yandex.mobile.ads.AGE_RESTRICTED_USER");
        f25386d = bt0Var2;
        bt0 bt0Var3 = new bt0(2, "ENABLE_LOGGING", "com.yandex.mobile.ads.ENABLE_LOGGING");
        f25387e = bt0Var3;
        bt0 bt0Var4 = new bt0(3, "AD_HOST", "com.yandex.mobile.ads.AD_HOST");
        f25388f = bt0Var4;
        bt0 bt0Var5 = new bt0(4, "FALLBACK_HOSTS", "com.yandex.mobile.ads.FALLBACK_HOSTS");
        f25389g = bt0Var5;
        bt0 bt0Var6 = new bt0(5, "APPMETRICA_EASY_INTEGRATION_ENABLED", "com.yandex.mobile.ads.APPMETRICA_EASY_INTEGRATION_ENABLED");
        f25390h = bt0Var6;
        bt0 bt0Var7 = new bt0(6, "SINGLE_ASSEMBLY_ENABLED", "com.yandex.mobile.ads.SINGLE_ASSEMBLY_ENABLED");
        i = bt0Var7;
        bt0[] bt0VarArr = {bt0Var, bt0Var2, bt0Var3, bt0Var4, bt0Var5, bt0Var6, bt0Var7};
        f25391j = bt0VarArr;
        com.google.gson.internal.c.l(bt0VarArr);
    }

    private bt0(int i10, String str, String str2) {
        this.f25392b = str2;
    }

    public static bt0 valueOf(String str) {
        return (bt0) Enum.valueOf(bt0.class, str);
    }

    public static bt0[] values() {
        return (bt0[]) f25391j.clone();
    }

    public final String a() {
        return this.f25392b;
    }
}

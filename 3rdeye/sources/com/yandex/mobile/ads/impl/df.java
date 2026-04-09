package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class df {

    /* renamed from: b, reason: collision with root package name */
    public static final df f26153b;

    /* renamed from: c, reason: collision with root package name */
    public static final df f26154c;

    /* renamed from: d, reason: collision with root package name */
    public static final df f26155d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ df[] f26156e;

    static {
        df dfVar = new df(0, "UNKNOWN");
        f26153b = dfVar;
        df dfVar2 = new df(1, "NETWORK");
        f26154c = dfVar2;
        df dfVar3 = new df(2, "INVALID_RESPONSE");
        f26155d = dfVar3;
        df[] dfVarArr = {dfVar, dfVar2, dfVar3};
        f26156e = dfVarArr;
        com.google.gson.internal.c.l(dfVarArr);
    }

    private df(int i, String str) {
    }

    public static df valueOf(String str) {
        return (df) Enum.valueOf(df.class, str);
    }

    public static df[] values() {
        return (df[]) f26156e.clone();
    }
}

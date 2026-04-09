package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class cs {

    /* renamed from: b, reason: collision with root package name */
    public static final cs f25763b;

    /* renamed from: c, reason: collision with root package name */
    public static final cs f25764c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ cs[] f25765d;

    static {
        cs csVar = new cs(0, "HTML");
        f25763b = csVar;
        cs csVar2 = new cs(1, "NATIVE");
        f25764c = csVar2;
        cs[] csVarArr = {csVar, csVar2};
        f25765d = csVarArr;
        com.google.gson.internal.c.l(csVarArr);
    }

    private cs(int i, String str) {
    }

    public static cs valueOf(String str) {
        return (cs) Enum.valueOf(cs.class, str);
    }

    public static cs[] values() {
        return (cs[]) f25765d.clone();
    }
}

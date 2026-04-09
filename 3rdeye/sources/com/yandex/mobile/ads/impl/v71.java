package com.yandex.mobile.ads.impl;

import a6.C1653b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class v71 {

    /* renamed from: c, reason: collision with root package name */
    public static final v71 f34408c;

    /* renamed from: d, reason: collision with root package name */
    public static final v71 f34409d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ v71[] f34410e;

    /* renamed from: b, reason: collision with root package name */
    private final String f34411b;

    static {
        v71 v71Var = new v71(0, "CUSTOM", "custom");
        f34408c = v71Var;
        v71 v71Var2 = new v71(1, "TEMPLATE", C1653b.KEY_TEMPLATE);
        f34409d = v71Var2;
        v71[] v71VarArr = {v71Var, v71Var2};
        f34410e = v71VarArr;
        com.google.gson.internal.c.l(v71VarArr);
    }

    private v71(int i, String str, String str2) {
        this.f34411b = str2;
    }

    public static v71 valueOf(String str) {
        return (v71) Enum.valueOf(v71.class, str);
    }

    public static v71[] values() {
        return (v71[]) f34410e.clone();
    }

    public final String a() {
        return this.f34411b;
    }
}

package com.yandex.mobile.ads.impl;

import org.json.JSONObject;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class gh2 implements gq0 {

    /* renamed from: c, reason: collision with root package name */
    public static final gh2 f27745c;

    /* renamed from: d, reason: collision with root package name */
    public static final gh2 f27746d;

    /* renamed from: e, reason: collision with root package name */
    public static final gh2 f27747e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ gh2[] f27748f;

    /* renamed from: b, reason: collision with root package name */
    private final String f27749b;

    static {
        gh2 gh2Var = new gh2(0, "DEFAULT", "default");
        f27745c = gh2Var;
        gh2 gh2Var2 = new gh2(1, "LOADING", "loading");
        f27746d = gh2Var2;
        gh2 gh2Var3 = new gh2(2, "HIDDEN", "hidden");
        f27747e = gh2Var3;
        gh2[] gh2VarArr = {gh2Var, gh2Var2, gh2Var3};
        f27748f = gh2VarArr;
        com.google.gson.internal.c.l(gh2VarArr);
    }

    private gh2(int i, String str, String str2) {
        this.f27749b = str2;
    }

    public static gh2 valueOf(String str) {
        return (gh2) Enum.valueOf(gh2.class, str);
    }

    public static gh2[] values() {
        return (gh2[]) f27748f.clone();
    }

    @Override // com.yandex.mobile.ads.impl.gq0
    public final String a() {
        return C4215v0.a(new Object[]{JSONObject.quote(this.f27749b)}, 1, "state: %s", "format(...)");
    }
}

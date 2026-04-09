package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class cn0 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f25716c;

    /* renamed from: d, reason: collision with root package name */
    private static final cn0 f25717d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ cn0[] f25718e;

    /* renamed from: b, reason: collision with root package name */
    private final String f25719b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    static {
        cn0 cn0Var = new cn0(0, "DESIGN_V1", "design_v1");
        cn0[] cn0VarArr = {cn0Var, new cn0(1, "DESIGN_V2", "instream_design_v2")};
        f25718e = cn0VarArr;
        com.google.gson.internal.c.l(cn0VarArr);
        f25716c = new a(0);
        f25717d = cn0Var;
    }

    private cn0(int i, String str, String str2) {
        this.f25719b = str2;
    }

    public static cn0 valueOf(String str) {
        return (cn0) Enum.valueOf(cn0.class, str);
    }

    public static cn0[] values() {
        return (cn0[]) f25718e.clone();
    }

    public final String b() {
        return this.f25719b;
    }
}

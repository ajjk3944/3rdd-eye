package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class f01 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f27149c;

    /* renamed from: d, reason: collision with root package name */
    public static final f01 f27150d;

    /* renamed from: e, reason: collision with root package name */
    public static final f01 f27151e;

    /* renamed from: f, reason: collision with root package name */
    public static final f01 f27152f;

    /* renamed from: g, reason: collision with root package name */
    public static final f01 f27153g;

    /* renamed from: h, reason: collision with root package name */
    public static final f01 f27154h;
    public static final f01 i;

    /* renamed from: j, reason: collision with root package name */
    public static final f01 f27155j;

    /* renamed from: k, reason: collision with root package name */
    public static final f01 f27156k;

    /* renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ f01[] f27157l;

    /* renamed from: b, reason: collision with root package name */
    private final String f27158b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    static {
        f01 f01Var = new f01(0, "GET", "GET");
        f27150d = f01Var;
        f01 f01Var2 = new f01(1, "POST", "POST");
        f27151e = f01Var2;
        f01 f01Var3 = new f01(2, "PUT", "PUT");
        f27152f = f01Var3;
        f01 f01Var4 = new f01(3, "DELETE", "DELETE");
        f27153g = f01Var4;
        f01 f01Var5 = new f01(4, "HEAD", "HEAD");
        f27154h = f01Var5;
        f01 f01Var6 = new f01(5, "OPTIONS", "OPTIONS");
        i = f01Var6;
        f01 f01Var7 = new f01(6, "TRACE", "TRACE");
        f27155j = f01Var7;
        f01 f01Var8 = new f01(7, "PATCH", "PATCH");
        f27156k = f01Var8;
        f01[] f01VarArr = {f01Var, f01Var2, f01Var3, f01Var4, f01Var5, f01Var6, f01Var7, f01Var8};
        f27157l = f01VarArr;
        com.google.gson.internal.c.l(f01VarArr);
        f27149c = new a(0);
    }

    private f01(int i10, String str, String str2) {
        this.f27158b = str2;
    }

    public static f01 valueOf(String str) {
        return (f01) Enum.valueOf(f01.class, str);
    }

    public static f01[] values() {
        return (f01[]) f27157l.clone();
    }

    public final String a() {
        return this.f27158b;
    }
}

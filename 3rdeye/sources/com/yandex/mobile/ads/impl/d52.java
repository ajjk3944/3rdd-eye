package com.yandex.mobile.ads.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d52 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f25969c;

    /* renamed from: d, reason: collision with root package name */
    public static final d52 f25970d;

    /* renamed from: e, reason: collision with root package name */
    public static final d52 f25971e;

    /* renamed from: f, reason: collision with root package name */
    public static final d52 f25972f;

    /* renamed from: g, reason: collision with root package name */
    public static final d52 f25973g;

    /* renamed from: h, reason: collision with root package name */
    public static final d52 f25974h;
    private static final /* synthetic */ d52[] i;

    /* renamed from: b, reason: collision with root package name */
    private final String f25975b;

    public static final class a {
        private a() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static d52 a(String javaName) {
            kotlin.jvm.internal.l.f(javaName, "javaName");
            int iHashCode = javaName.hashCode();
            if (iHashCode != 79201641) {
                if (iHashCode != 79923350) {
                    switch (iHashCode) {
                        case -503070503:
                            if (javaName.equals("TLSv1.1")) {
                                return d52.f25972f;
                            }
                            break;
                        case -503070502:
                            if (javaName.equals("TLSv1.2")) {
                                return d52.f25971e;
                            }
                            break;
                        case -503070501:
                            if (javaName.equals("TLSv1.3")) {
                                return d52.f25970d;
                            }
                            break;
                    }
                } else if (javaName.equals("TLSv1")) {
                    return d52.f25973g;
                }
            } else if (javaName.equals("SSLv3")) {
                return d52.f25974h;
            }
            throw new IllegalArgumentException("Unexpected TLS version: ".concat(javaName));
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    static {
        d52 d52Var = new d52(0, "TLS_1_3", "TLSv1.3");
        f25970d = d52Var;
        d52 d52Var2 = new d52(1, "TLS_1_2", "TLSv1.2");
        f25971e = d52Var2;
        d52 d52Var3 = new d52(2, "TLS_1_1", "TLSv1.1");
        f25972f = d52Var3;
        d52 d52Var4 = new d52(3, "TLS_1_0", "TLSv1");
        f25973g = d52Var4;
        d52 d52Var5 = new d52(4, "SSL_3_0", "SSLv3");
        f25974h = d52Var5;
        d52[] d52VarArr = {d52Var, d52Var2, d52Var3, d52Var4, d52Var5};
        i = d52VarArr;
        com.google.gson.internal.c.l(d52VarArr);
        f25969c = new a(0);
    }

    private d52(int i10, String str, String str2) {
        this.f25975b = str2;
    }

    public static d52 valueOf(String str) {
        return (d52) Enum.valueOf(d52.class, str);
    }

    public static d52[] values() {
        return (d52[]) i.clone();
    }

    public final String a() {
        return this.f25975b;
    }
}

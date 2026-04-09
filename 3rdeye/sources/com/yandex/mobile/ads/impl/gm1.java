package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class gm1 {

    /* renamed from: c, reason: collision with root package name */
    public static final a f27816c;

    /* renamed from: d, reason: collision with root package name */
    public static final gm1 f27817d;

    /* renamed from: e, reason: collision with root package name */
    public static final gm1 f27818e;

    /* renamed from: f, reason: collision with root package name */
    public static final gm1 f27819f;

    /* renamed from: g, reason: collision with root package name */
    public static final gm1 f27820g;

    /* renamed from: h, reason: collision with root package name */
    public static final gm1 f27821h;
    public static final gm1 i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ gm1[] f27822j;

    /* renamed from: b, reason: collision with root package name */
    private final String f27823b;

    public static final class a {
        private a() {
        }

        public static gm1 a(String protocol) throws IOException {
            kotlin.jvm.internal.l.f(protocol, "protocol");
            gm1 gm1Var = gm1.f27817d;
            if (protocol.equals(gm1Var.f27823b)) {
                return gm1Var;
            }
            gm1 gm1Var2 = gm1.f27818e;
            if (protocol.equals(gm1Var2.f27823b)) {
                return gm1Var2;
            }
            gm1 gm1Var3 = gm1.f27821h;
            if (protocol.equals(gm1Var3.f27823b)) {
                return gm1Var3;
            }
            gm1 gm1Var4 = gm1.f27820g;
            if (protocol.equals(gm1Var4.f27823b)) {
                return gm1Var4;
            }
            gm1 gm1Var5 = gm1.f27819f;
            if (protocol.equals(gm1Var5.f27823b)) {
                return gm1Var5;
            }
            gm1 gm1Var6 = gm1.i;
            if (protocol.equals(gm1Var6.f27823b)) {
                return gm1Var6;
            }
            throw new IOException("Unexpected protocol: ".concat(protocol));
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }

    static {
        gm1 gm1Var = new gm1(0, "HTTP_1_0", "http/1.0");
        f27817d = gm1Var;
        gm1 gm1Var2 = new gm1(1, "HTTP_1_1", "http/1.1");
        f27818e = gm1Var2;
        gm1 gm1Var3 = new gm1(2, "SPDY_3", "spdy/3.1");
        f27819f = gm1Var3;
        gm1 gm1Var4 = new gm1(3, "HTTP_2", "h2");
        f27820g = gm1Var4;
        gm1 gm1Var5 = new gm1(4, "H2_PRIOR_KNOWLEDGE", "h2_prior_knowledge");
        f27821h = gm1Var5;
        gm1 gm1Var6 = new gm1(5, "QUIC", "quic");
        i = gm1Var6;
        gm1[] gm1VarArr = {gm1Var, gm1Var2, gm1Var3, gm1Var4, gm1Var5, gm1Var6};
        f27822j = gm1VarArr;
        com.google.gson.internal.c.l(gm1VarArr);
        f27816c = new a(0);
    }

    private gm1(int i10, String str, String str2) {
        this.f27823b = str2;
    }

    public static gm1 valueOf(String str) {
        return (gm1) Enum.valueOf(gm1.class, str);
    }

    public static gm1[] values() {
        return (gm1[]) f27822j.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f27823b;
    }
}

package com.yandex.mobile.ads.impl;

import java.util.Comparator;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class jo {

    /* renamed from: b, reason: collision with root package name */
    public static final b f29226b;

    /* renamed from: c, reason: collision with root package name */
    private static final a f29227c = new a();

    /* renamed from: d, reason: collision with root package name */
    private static final LinkedHashMap f29228d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final jo f29229e;

    /* renamed from: f, reason: collision with root package name */
    public static final jo f29230f;

    /* renamed from: g, reason: collision with root package name */
    public static final jo f29231g;

    /* renamed from: h, reason: collision with root package name */
    public static final jo f29232h;
    public static final jo i;

    /* renamed from: j, reason: collision with root package name */
    public static final jo f29233j;

    /* renamed from: k, reason: collision with root package name */
    public static final jo f29234k;

    /* renamed from: l, reason: collision with root package name */
    public static final jo f29235l;

    /* renamed from: m, reason: collision with root package name */
    public static final jo f29236m;

    /* renamed from: n, reason: collision with root package name */
    public static final jo f29237n;

    /* renamed from: o, reason: collision with root package name */
    public static final jo f29238o;

    /* renamed from: p, reason: collision with root package name */
    public static final jo f29239p;

    /* renamed from: q, reason: collision with root package name */
    public static final jo f29240q;

    /* renamed from: r, reason: collision with root package name */
    public static final jo f29241r;

    /* renamed from: s, reason: collision with root package name */
    public static final jo f29242s;

    /* renamed from: t, reason: collision with root package name */
    public static final jo f29243t;

    /* renamed from: a, reason: collision with root package name */
    private final String f29244a;

    public static final class a implements Comparator<String> {
        @Override // java.util.Comparator
        public final int compare(String str, String str2) {
            String a10 = str;
            String b10 = str2;
            kotlin.jvm.internal.l.f(a10, "a");
            kotlin.jvm.internal.l.f(b10, "b");
            int iMin = Math.min(a10.length(), b10.length());
            for (int i = 4; i < iMin; i++) {
                char cCharAt = a10.charAt(i);
                char cCharAt2 = b10.charAt(i);
                if (cCharAt != cCharAt2) {
                    return kotlin.jvm.internal.l.h(cCharAt, cCharAt2) < 0 ? -1 : 1;
                }
            }
            int length = a10.length();
            int length2 = b10.length();
            if (length != length2) {
                return length < length2 ? -1 : 1;
            }
            return 0;
        }
    }

    public static final class b {
        private b() {
        }

        private static String b(String str) {
            if (y9.n.a0(str, "TLS_", false)) {
                String strSubstring = str.substring(4);
                kotlin.jvm.internal.l.e(strSubstring, "substring(...)");
                return "SSL_".concat(strSubstring);
            }
            if (!y9.n.a0(str, "SSL_", false)) {
                return str;
            }
            String strSubstring2 = str.substring(4);
            kotlin.jvm.internal.l.e(strSubstring2, "substring(...)");
            return "TLS_".concat(strSubstring2);
        }

        public final synchronized jo a(String javaName) {
            jo joVar;
            try {
                kotlin.jvm.internal.l.f(javaName, "javaName");
                joVar = (jo) ((LinkedHashMap) jo.f29228d).get(javaName);
                if (joVar == null) {
                    joVar = (jo) ((LinkedHashMap) jo.f29228d).get(b(javaName));
                    if (joVar == null) {
                        joVar = new jo(javaName, 0);
                    }
                    jo.f29228d.put(javaName, joVar);
                }
            } catch (Throwable th) {
                throw th;
            }
            return joVar;
        }

        public /* synthetic */ b(int i) {
            this();
        }
    }

    static {
        int i10 = 0;
        f29226b = new b(i10);
        jo joVarA = io.a("SSL_RSA_WITH_DES_CBC_SHA", io.a("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", io.a("SSL_RSA_WITH_RC4_128_SHA", io.a("SSL_RSA_WITH_RC4_128_MD5", io.a("SSL_RSA_EXPORT_WITH_RC4_40_MD5", io.a("SSL_RSA_WITH_NULL_SHA", io.a("SSL_RSA_WITH_NULL_MD5", new jo("SSL_RSA_WITH_NULL_MD5", i10), "SSL_RSA_WITH_NULL_SHA", 0), "SSL_RSA_EXPORT_WITH_RC4_40_MD5", 0), "SSL_RSA_WITH_RC4_128_MD5", 0), "SSL_RSA_WITH_RC4_128_SHA", 0), "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 0), "SSL_RSA_WITH_DES_CBC_SHA", 0), "SSL_RSA_WITH_3DES_EDE_CBC_SHA", 0);
        f29228d.put("SSL_RSA_WITH_3DES_EDE_CBC_SHA", joVarA);
        f29229e = joVarA;
        f29228d.put("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", io.a("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", io.a("SSL_DHE_RSA_WITH_DES_CBC_SHA", io.a("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", io.a("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", io.a("SSL_DHE_DSS_WITH_DES_CBC_SHA", io.a("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", new jo("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", i10), "SSL_DHE_DSS_WITH_DES_CBC_SHA", 0), "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 0), "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 0), "SSL_DHE_RSA_WITH_DES_CBC_SHA", 0), "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 0), "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 0));
        jo joVarA2 = io.a("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", io.a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", io.a("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", io.a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", io.a("TLS_KRB5_WITH_RC4_128_MD5", io.a("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", io.a("TLS_KRB5_WITH_DES_CBC_MD5", io.a("TLS_KRB5_WITH_RC4_128_SHA", io.a("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", io.a("TLS_KRB5_WITH_DES_CBC_SHA", io.a("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", io.a("SSL_DH_anon_WITH_DES_CBC_SHA", io.a("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", io.a("SSL_DH_anon_WITH_RC4_128_MD5", new jo("SSL_DH_anon_WITH_RC4_128_MD5", i10), "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 0), "SSL_DH_anon_WITH_DES_CBC_SHA", 0), "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 0), "TLS_KRB5_WITH_DES_CBC_SHA", 0), "TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 0), "TLS_KRB5_WITH_RC4_128_SHA", 0), "TLS_KRB5_WITH_DES_CBC_MD5", 0), "TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 0), "TLS_KRB5_WITH_RC4_128_MD5", 0), "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 0), "TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 0), "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 0), "TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 0), "TLS_RSA_WITH_AES_128_CBC_SHA", 0);
        f29228d.put("TLS_RSA_WITH_AES_128_CBC_SHA", joVarA2);
        f29230f = joVarA2;
        f29228d.put("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", io.a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", new jo("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", i10), "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 0));
        jo joVarA3 = io.a("TLS_DH_anon_WITH_AES_128_CBC_SHA", new jo("TLS_DH_anon_WITH_AES_128_CBC_SHA", i10), "TLS_RSA_WITH_AES_256_CBC_SHA", 0);
        f29228d.put("TLS_RSA_WITH_AES_256_CBC_SHA", joVarA3);
        f29231g = joVarA3;
        f29228d.put("TLS_DH_anon_WITH_AES_256_CBC_SHA256", io.a("TLS_DH_anon_WITH_AES_128_CBC_SHA256", io.a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", io.a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", io.a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", io.a("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", io.a("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", io.a("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", io.a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", io.a("TLS_RSA_WITH_AES_256_CBC_SHA256", io.a("TLS_RSA_WITH_AES_128_CBC_SHA256", io.a("TLS_RSA_WITH_NULL_SHA256", io.a("TLS_DH_anon_WITH_AES_256_CBC_SHA", io.a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", io.a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", new jo("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", i10), "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 0), "TLS_DH_anon_WITH_AES_256_CBC_SHA", 0), "TLS_RSA_WITH_NULL_SHA256", 0), "TLS_RSA_WITH_AES_128_CBC_SHA256", 0), "TLS_RSA_WITH_AES_256_CBC_SHA256", 0), "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 0), "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 0), "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 0), "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 0), "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 0), "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 0), "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 0), "TLS_DH_anon_WITH_AES_128_CBC_SHA256", 0), "TLS_DH_anon_WITH_AES_256_CBC_SHA256", 0));
        jo joVarA4 = io.a("TLS_RSA_WITH_SEED_CBC_SHA", io.a("TLS_PSK_WITH_AES_256_CBC_SHA", io.a("TLS_PSK_WITH_AES_128_CBC_SHA", io.a("TLS_PSK_WITH_3DES_EDE_CBC_SHA", io.a("TLS_PSK_WITH_RC4_128_SHA", io.a("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", io.a("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", io.a("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", new jo("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", i10), "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 0), "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 0), "TLS_PSK_WITH_RC4_128_SHA", 0), "TLS_PSK_WITH_3DES_EDE_CBC_SHA", 0), "TLS_PSK_WITH_AES_128_CBC_SHA", 0), "TLS_PSK_WITH_AES_256_CBC_SHA", 0), "TLS_RSA_WITH_SEED_CBC_SHA", 0), "TLS_RSA_WITH_AES_128_GCM_SHA256", 0);
        f29228d.put("TLS_RSA_WITH_AES_128_GCM_SHA256", joVarA4);
        f29232h = joVarA4;
        jo joVar = new jo("TLS_RSA_WITH_AES_256_GCM_SHA384", i10);
        f29228d.put("TLS_RSA_WITH_AES_256_GCM_SHA384", joVar);
        i = joVar;
        f29228d.put("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", io.a("TLS_DH_anon_WITH_AES_256_GCM_SHA384", io.a("TLS_DH_anon_WITH_AES_128_GCM_SHA256", io.a("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", io.a("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", io.a("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", io.a("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", new jo("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", i10), "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 0), "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 0), "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 0), "TLS_DH_anon_WITH_AES_128_GCM_SHA256", 0), "TLS_DH_anon_WITH_AES_256_GCM_SHA384", 0), "TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 0));
        f29228d.put("TLS_ECDHE_RSA_WITH_NULL_SHA", io.a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", io.a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", io.a("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", io.a("TLS_ECDH_RSA_WITH_RC4_128_SHA", io.a("TLS_ECDH_RSA_WITH_NULL_SHA", io.a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", io.a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", io.a("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", io.a("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", io.a("TLS_ECDHE_ECDSA_WITH_NULL_SHA", io.a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", io.a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", io.a("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", io.a("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", io.a("TLS_ECDH_ECDSA_WITH_NULL_SHA", io.a("TLS_FALLBACK_SCSV", new jo("TLS_FALLBACK_SCSV", i10), "TLS_ECDH_ECDSA_WITH_NULL_SHA", 0), "TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 0), "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 0), "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 0), "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 0), "TLS_ECDHE_ECDSA_WITH_NULL_SHA", 0), "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 0), "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 0), "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 0), "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 0), "TLS_ECDH_RSA_WITH_NULL_SHA", 0), "TLS_ECDH_RSA_WITH_RC4_128_SHA", 0), "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 0), "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 0), "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 0), "TLS_ECDHE_RSA_WITH_NULL_SHA", 0));
        jo joVarA5 = io.a("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", io.a("TLS_ECDHE_RSA_WITH_RC4_128_SHA", new jo("TLS_ECDHE_RSA_WITH_RC4_128_SHA", i10), "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 0), "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 0);
        f29228d.put("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", joVarA5);
        f29233j = joVarA5;
        jo joVar2 = new jo("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", i10);
        f29228d.put("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", joVar2);
        f29234k = joVar2;
        f29228d.put("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", io.a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", io.a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", io.a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", io.a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", io.a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", io.a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", io.a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", io.a("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", io.a("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", io.a("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", io.a("TLS_ECDH_anon_WITH_RC4_128_SHA", io.a("TLS_ECDH_anon_WITH_NULL_SHA", new jo("TLS_ECDH_anon_WITH_NULL_SHA", i10), "TLS_ECDH_anon_WITH_RC4_128_SHA", 0), "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 0), "TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 0), "TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 0), "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 0), "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 0), "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 0), "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 0), "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 0), "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 0), "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 0), "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 0));
        jo joVar3 = new jo("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", i10);
        f29228d.put("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", joVar3);
        f29235l = joVar3;
        jo joVar4 = new jo("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", i10);
        f29228d.put("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", joVar4);
        f29236m = joVar4;
        jo joVarA6 = io.a("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", io.a("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", new jo("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", i10), "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 0), "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 0);
        f29228d.put("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", joVarA6);
        f29237n = joVarA6;
        jo joVar5 = new jo("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", i10);
        f29228d.put("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", joVar5);
        f29238o = joVar5;
        jo joVarA7 = io.a("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", io.a("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", io.a("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", io.a("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", new jo("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", i10), "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 0), "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 0), "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 0), "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 0);
        f29228d.put("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", joVarA7);
        f29239p = joVarA7;
        jo joVar6 = new jo("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", i10);
        f29228d.put("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", joVar6);
        f29240q = joVar6;
        jo joVarA8 = io.a("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", io.a("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", new jo("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", i10), "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 0), "TLS_AES_128_GCM_SHA256", 0);
        f29228d.put("TLS_AES_128_GCM_SHA256", joVarA8);
        f29241r = joVarA8;
        jo joVar7 = new jo("TLS_AES_256_GCM_SHA384", i10);
        f29228d.put("TLS_AES_256_GCM_SHA384", joVar7);
        f29242s = joVar7;
        jo joVar8 = new jo("TLS_CHACHA20_POLY1305_SHA256", i10);
        f29228d.put("TLS_CHACHA20_POLY1305_SHA256", joVar8);
        f29243t = joVar8;
        f29228d.put("TLS_AES_128_CCM_8_SHA256", io.a("TLS_AES_128_CCM_SHA256", new jo("TLS_AES_128_CCM_SHA256", i10), "TLS_AES_128_CCM_8_SHA256", 0));
    }

    private jo(String str) {
        this.f29244a = str;
    }

    public final String c() {
        return this.f29244a;
    }

    public final String toString() {
        return this.f29244a;
    }

    public /* synthetic */ jo(String str, int i10) {
        this(str);
    }
}

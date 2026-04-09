package com.mbridge.msdk.thrid.okhttp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.xbill.DNS.WKSRecord;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    final String f17614a;

    /* renamed from: b, reason: collision with root package name */
    static final Comparator<String> f17547b = new a();

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, g> f17550c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final g f17553d = a("SSL_RSA_WITH_NULL_MD5", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final g f17556e = a("SSL_RSA_WITH_NULL_SHA", 2);

    /* renamed from: f, reason: collision with root package name */
    public static final g f17559f = a("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);

    /* renamed from: g, reason: collision with root package name */
    public static final g f17562g = a("SSL_RSA_WITH_RC4_128_MD5", 4);

    /* renamed from: h, reason: collision with root package name */
    public static final g f17565h = a("SSL_RSA_WITH_RC4_128_SHA", 5);

    /* renamed from: i, reason: collision with root package name */
    public static final g f17568i = a("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);

    /* renamed from: j, reason: collision with root package name */
    public static final g f17571j = a("SSL_RSA_WITH_DES_CBC_SHA", 9);

    /* renamed from: k, reason: collision with root package name */
    public static final g f17574k = a("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);

    /* renamed from: l, reason: collision with root package name */
    public static final g f17577l = a("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);

    /* renamed from: m, reason: collision with root package name */
    public static final g f17580m = a("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);

    /* renamed from: n, reason: collision with root package name */
    public static final g f17583n = a("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);

    /* renamed from: o, reason: collision with root package name */
    public static final g f17586o = a("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);

    /* renamed from: p, reason: collision with root package name */
    public static final g f17589p = a("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);

    /* renamed from: q, reason: collision with root package name */
    public static final g f17592q = a("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);

    /* renamed from: r, reason: collision with root package name */
    public static final g f17595r = a("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);

    /* renamed from: s, reason: collision with root package name */
    public static final g f17598s = a("SSL_DH_anon_WITH_RC4_128_MD5", 24);

    /* renamed from: t, reason: collision with root package name */
    public static final g f17600t = a("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);

    /* renamed from: u, reason: collision with root package name */
    public static final g f17602u = a("SSL_DH_anon_WITH_DES_CBC_SHA", 26);

    /* renamed from: v, reason: collision with root package name */
    public static final g f17604v = a("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);

    /* renamed from: w, reason: collision with root package name */
    public static final g f17606w = a("TLS_KRB5_WITH_DES_CBC_SHA", 30);

    /* renamed from: x, reason: collision with root package name */
    public static final g f17608x = a("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);

    /* renamed from: y, reason: collision with root package name */
    public static final g f17610y = a("TLS_KRB5_WITH_RC4_128_SHA", 32);

    /* renamed from: z, reason: collision with root package name */
    public static final g f17612z = a("TLS_KRB5_WITH_DES_CBC_MD5", 34);
    public static final g A = a("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
    public static final g B = a("TLS_KRB5_WITH_RC4_128_MD5", 36);
    public static final g C = a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
    public static final g D = a("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
    public static final g E = a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
    public static final g F = a("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
    public static final g G = a("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
    public static final g H = a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
    public static final g I = a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
    public static final g J = a("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
    public static final g K = a("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
    public static final g L = a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
    public static final g M = a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
    public static final g N = a("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
    public static final g O = a("TLS_RSA_WITH_NULL_SHA256", 59);
    public static final g P = a("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
    public static final g Q = a("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
    public static final g R = a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
    public static final g S = a("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
    public static final g T = a("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
    public static final g U = a("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
    public static final g V = a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
    public static final g W = a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
    public static final g X = a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
    public static final g Y = a("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
    public static final g Z = a("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);

    /* renamed from: a0, reason: collision with root package name */
    public static final g f17545a0 = a("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);

    /* renamed from: b0, reason: collision with root package name */
    public static final g f17548b0 = a("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);

    /* renamed from: c0, reason: collision with root package name */
    public static final g f17551c0 = a("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);

    /* renamed from: d0, reason: collision with root package name */
    public static final g f17554d0 = a("TLS_PSK_WITH_RC4_128_SHA", 138);

    /* renamed from: e0, reason: collision with root package name */
    public static final g f17557e0 = a("TLS_PSK_WITH_3DES_EDE_CBC_SHA", WKSRecord.Service.NETBIOS_SSN);

    /* renamed from: f0, reason: collision with root package name */
    public static final g f17560f0 = a("TLS_PSK_WITH_AES_128_CBC_SHA", WKSRecord.Service.EMFIS_DATA);

    /* renamed from: g0, reason: collision with root package name */
    public static final g f17563g0 = a("TLS_PSK_WITH_AES_256_CBC_SHA", WKSRecord.Service.EMFIS_CNTL);

    /* renamed from: h0, reason: collision with root package name */
    public static final g f17566h0 = a("TLS_RSA_WITH_SEED_CBC_SHA", 150);

    /* renamed from: i0, reason: collision with root package name */
    public static final g f17569i0 = a("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);

    /* renamed from: j0, reason: collision with root package name */
    public static final g f17572j0 = a("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);

    /* renamed from: k0, reason: collision with root package name */
    public static final g f17575k0 = a("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);

    /* renamed from: l0, reason: collision with root package name */
    public static final g f17578l0 = a("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);

    /* renamed from: m0, reason: collision with root package name */
    public static final g f17581m0 = a("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);

    /* renamed from: n0, reason: collision with root package name */
    public static final g f17584n0 = a("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);

    /* renamed from: o0, reason: collision with root package name */
    public static final g f17587o0 = a("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);

    /* renamed from: p0, reason: collision with root package name */
    public static final g f17590p0 = a("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);

    /* renamed from: q0, reason: collision with root package name */
    public static final g f17593q0 = a("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);

    /* renamed from: r0, reason: collision with root package name */
    public static final g f17596r0 = a("TLS_FALLBACK_SCSV", 22016);

    /* renamed from: s0, reason: collision with root package name */
    public static final g f17599s0 = a("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);

    /* renamed from: t0, reason: collision with root package name */
    public static final g f17601t0 = a("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);

    /* renamed from: u0, reason: collision with root package name */
    public static final g f17603u0 = a("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);

    /* renamed from: v0, reason: collision with root package name */
    public static final g f17605v0 = a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);

    /* renamed from: w0, reason: collision with root package name */
    public static final g f17607w0 = a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);

    /* renamed from: x0, reason: collision with root package name */
    public static final g f17609x0 = a("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);

    /* renamed from: y0, reason: collision with root package name */
    public static final g f17611y0 = a("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);

    /* renamed from: z0, reason: collision with root package name */
    public static final g f17613z0 = a("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
    public static final g A0 = a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
    public static final g B0 = a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
    public static final g C0 = a("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
    public static final g D0 = a("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
    public static final g E0 = a("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
    public static final g F0 = a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
    public static final g G0 = a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
    public static final g H0 = a("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
    public static final g I0 = a("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
    public static final g J0 = a("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
    public static final g K0 = a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
    public static final g L0 = a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
    public static final g M0 = a("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
    public static final g N0 = a("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
    public static final g O0 = a("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
    public static final g P0 = a("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
    public static final g Q0 = a("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
    public static final g R0 = a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
    public static final g S0 = a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
    public static final g T0 = a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
    public static final g U0 = a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
    public static final g V0 = a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
    public static final g W0 = a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
    public static final g X0 = a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
    public static final g Y0 = a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
    public static final g Z0 = a("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);

    /* renamed from: a1, reason: collision with root package name */
    public static final g f17546a1 = a("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);

    /* renamed from: b1, reason: collision with root package name */
    public static final g f17549b1 = a("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);

    /* renamed from: c1, reason: collision with root package name */
    public static final g f17552c1 = a("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);

    /* renamed from: d1, reason: collision with root package name */
    public static final g f17555d1 = a("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);

    /* renamed from: e1, reason: collision with root package name */
    public static final g f17558e1 = a("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);

    /* renamed from: f1, reason: collision with root package name */
    public static final g f17561f1 = a("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);

    /* renamed from: g1, reason: collision with root package name */
    public static final g f17564g1 = a("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);

    /* renamed from: h1, reason: collision with root package name */
    public static final g f17567h1 = a("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);

    /* renamed from: i1, reason: collision with root package name */
    public static final g f17570i1 = a("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);

    /* renamed from: j1, reason: collision with root package name */
    public static final g f17573j1 = a("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);

    /* renamed from: k1, reason: collision with root package name */
    public static final g f17576k1 = a("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);

    /* renamed from: l1, reason: collision with root package name */
    public static final g f17579l1 = a("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);

    /* renamed from: m1, reason: collision with root package name */
    public static final g f17582m1 = a("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);

    /* renamed from: n1, reason: collision with root package name */
    public static final g f17585n1 = a("TLS_AES_128_GCM_SHA256", 4865);

    /* renamed from: o1, reason: collision with root package name */
    public static final g f17588o1 = a("TLS_AES_256_GCM_SHA384", 4866);

    /* renamed from: p1, reason: collision with root package name */
    public static final g f17591p1 = a("TLS_CHACHA20_POLY1305_SHA256", 4867);

    /* renamed from: q1, reason: collision with root package name */
    public static final g f17594q1 = a("TLS_AES_128_CCM_SHA256", 4868);

    /* renamed from: r1, reason: collision with root package name */
    public static final g f17597r1 = a("TLS_AES_256_CCM_8_SHA256", 4869);

    public static class a implements Comparator<String> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            int iMin = Math.min(str.length(), str2.length());
            for (int i10 = 4; i10 < iMin; i10++) {
                char cCharAt = str.charAt(i10);
                char cCharAt2 = str2.charAt(i10);
                if (cCharAt != cCharAt2) {
                    return cCharAt < cCharAt2 ? -1 : 1;
                }
            }
            int length = str.length();
            int length2 = str2.length();
            if (length != length2) {
                return length < length2 ? -1 : 1;
            }
            return 0;
        }
    }

    private g(String str) {
        str.getClass();
        this.f17614a = str;
    }

    public static synchronized g a(String str) {
        g gVar;
        try {
            Map<String, g> map = f17550c;
            gVar = map.get(str);
            if (gVar == null) {
                gVar = map.get(b(str));
                if (gVar == null) {
                    gVar = new g(str);
                }
                map.put(str, gVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return gVar;
    }

    private static String b(String str) {
        if (str.startsWith("TLS_")) {
            return "SSL_" + str.substring(4);
        }
        if (!str.startsWith("SSL_")) {
            return str;
        }
        return "TLS_" + str.substring(4);
    }

    public String toString() {
        return this.f17614a;
    }

    public static List<g> a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(a(str));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static g a(String str, int i10) {
        g gVar = new g(str);
        f17550c.put(str, gVar);
        return gVar;
    }
}

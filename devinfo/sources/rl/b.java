package rl;

import java.io.IOException;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b implements f0 {

    /* renamed from: b, reason: collision with root package name */
    public static final b f33032b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final b f33033c = new b();

    /* renamed from: d, reason: collision with root package name */
    public static final b f33034d = new b();

    public static final g a(b bVar, String str) {
        g gVar = new g(str);
        g.f33068d.put(str, gVar);
        return gVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static e0 c(String str) {
        nk.k.e(str, "javaName");
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return e0.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return e0.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return e0.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return e0.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return e0.SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    public static u d(String str) throws IOException {
        if (str.equals("http/1.0")) {
            return u.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return u.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return u.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return u.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return u.SPDY_3;
        }
        if (str.equals("quic")) {
            return u.QUIC;
        }
        if (vk.p.w0(str, "h3", false)) {
            return u.HTTP_3;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    public synchronized g b(String str) {
        g gVar;
        String strConcat;
        try {
            nk.k.e(str, "javaName");
            LinkedHashMap linkedHashMap = g.f33068d;
            gVar = (g) linkedHashMap.get(str);
            if (gVar == null) {
                if (vk.p.w0(str, "TLS_", false)) {
                    String strSubstring = str.substring(4);
                    nk.k.d(strSubstring, "substring(...)");
                    strConcat = "SSL_".concat(strSubstring);
                } else if (vk.p.w0(str, "SSL_", false)) {
                    String strSubstring2 = str.substring(4);
                    nk.k.d(strSubstring2, "substring(...)");
                    strConcat = "TLS_".concat(strSubstring2);
                } else {
                    strConcat = str;
                }
                gVar = (g) linkedHashMap.get(strConcat);
                if (gVar == null) {
                    gVar = new g(str);
                }
                linkedHashMap.put(str, gVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return gVar;
    }
}

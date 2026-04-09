package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class n24 {
    static {
        int i = j04.zza;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() throws GeneralSecurityException {
        v14 v14Var = v14.a;
        pv3 pv3Var = pv3.b;
        pv3Var.b(v14.a);
        pv3Var.a(v14.b);
        pv3Var.b(y14.a);
        pv3Var.a(y14.b);
        int i = o14.f;
        if (!yb.x(i)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available.");
        }
        vv3 vv3Var = q24.a;
        rv3 rv3Var = rv3.b;
        rv3Var.c(q24.a);
        rv3Var.d(q24.b);
        rv3Var.a(q24.c);
        rv3Var.b(q24.d);
        rv3Var.a(q24.e);
        rv3Var.b(q24.f);
        ov3 ov3Var = ov3.b;
        HashMap map = new HashMap();
        map.put("ECDSA_P256", u14.a);
        map.put("ECDSA_P256_IEEE_P1363", u14.d);
        p21 p21Var = new p21(26);
        p21Var.h = ls3.f;
        p21Var.g = j14.c;
        p21Var.f = ps3.k;
        p21Var.i = ts3.n;
        map.put("ECDSA_P256_RAW", p21Var.L());
        map.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", u14.f);
        map.put("ECDSA_P384", u14.b);
        map.put("ECDSA_P384_IEEE_P1363", u14.e);
        p21 p21Var2 = new p21(26);
        p21Var2.h = ls3.h;
        j14 j14Var = j14.d;
        p21Var2.g = j14Var;
        ps3 ps3Var = ps3.l;
        p21Var2.f = ps3Var;
        ts3 ts3Var = ts3.k;
        p21Var2.i = ts3Var;
        map.put("ECDSA_P384_SHA512", p21Var2.L());
        p21 p21Var3 = new p21(26);
        p21Var3.h = ls3.g;
        p21Var3.g = j14Var;
        p21Var3.f = ps3Var;
        p21Var3.i = ts3Var;
        map.put("ECDSA_P384_SHA384", p21Var3.L());
        map.put("ECDSA_P521", u14.c);
        map.put("ECDSA_P521_IEEE_P1363", u14.g);
        ov3Var.b(Collections.unmodifiableMap(map));
        pv3Var.a(o14.a);
        pv3Var.a(o14.b);
        jv3 jv3Var = jv3.b;
        jv3Var.a(o14.e, l14.class);
        vu3 vu3Var = vu3.d;
        vu3Var.c(o14.c, i, true);
        vu3Var.c(o14.d, i, false);
        int i2 = f24.f;
        if (!yb.x(i2)) {
            throw new GeneralSecurityException("Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available.");
        }
        rv3Var.c(z24.a);
        rv3Var.d(z24.b);
        rv3Var.a(z24.c);
        rv3Var.b(z24.d);
        rv3Var.a(z24.e);
        rv3Var.b(z24.f);
        HashMap map2 = new HashMap();
        map2.put("RSA_SSA_PKCS1_3072_SHA256_F4", u14.h);
        BigInteger bigInteger = c24.e;
        z14 z14Var = new z14();
        z14Var.c = a24.b;
        z14Var.a(3072);
        BigInteger bigInteger2 = c24.e;
        z14Var.b = bigInteger2;
        b24 b24Var = b24.e;
        z14Var.d = b24Var;
        map2.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", z14Var.b());
        map2.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", u14.i);
        map2.put("RSA_SSA_PKCS1_4096_SHA512_F4", u14.j);
        z14 z14Var2 = new z14();
        z14Var2.c = a24.d;
        z14Var2.a(4096);
        z14Var2.b = bigInteger2;
        z14Var2.d = b24Var;
        map2.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", z14Var2.b());
        ov3Var.b(map2);
        pv3Var.a(f24.a);
        pv3Var.a(f24.b);
        jv3Var.a(f24.e, c24.class);
        vu3Var.c(f24.c, i2, true);
        vu3Var.c(f24.d, i2, false);
        int i3 = m24.f;
        if (!yb.x(i3)) {
            throw new GeneralSecurityException("Can not use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        rv3Var.c(c34.a);
        rv3Var.d(c34.b);
        rv3Var.a(c34.c);
        rv3Var.b(c34.d);
        rv3Var.a(c34.e);
        rv3Var.b(c34.f);
        HashMap map3 = new HashMap();
        BigInteger bigInteger3 = j24.g;
        g24 g24Var = new g24();
        h24 h24Var = h24.b;
        g24Var.c = h24Var;
        g24Var.d = h24Var;
        g24Var.b(32);
        g24Var.a(3072);
        BigInteger bigInteger4 = j24.g;
        g24Var.b = bigInteger4;
        i24 i24Var = i24.b;
        g24Var.f = i24Var;
        map3.put("RSA_SSA_PSS_3072_SHA256_F4", g24Var.c());
        g24 g24Var2 = new g24();
        g24Var2.c = h24Var;
        g24Var2.d = h24Var;
        g24Var2.b(32);
        g24Var2.a(3072);
        g24Var2.b = bigInteger4;
        i24 i24Var2 = i24.e;
        g24Var2.f = i24Var2;
        map3.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", g24Var2.c());
        map3.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", u14.k);
        g24 g24Var3 = new g24();
        h24 h24Var2 = h24.d;
        g24Var3.c = h24Var2;
        g24Var3.d = h24Var2;
        g24Var3.b(64);
        g24Var3.a(4096);
        g24Var3.b = bigInteger4;
        g24Var3.f = i24Var;
        map3.put("RSA_SSA_PSS_4096_SHA512_F4", g24Var3.c());
        g24 g24Var4 = new g24();
        g24Var4.c = h24Var2;
        g24Var4.d = h24Var2;
        g24Var4.b(64);
        g24Var4.a(4096);
        g24Var4.b = bigInteger4;
        g24Var4.f = i24Var2;
        map3.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", g24Var4.c());
        map3.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", u14.l);
        ov3Var.b(Collections.unmodifiableMap(map3));
        pv3Var.a(m24.a);
        pv3Var.a(m24.b);
        jv3Var.a(m24.e, j24.class);
        vu3Var.c(m24.c, i3, true);
        vu3Var.c(m24.d, i3, false);
        if (mu3.a()) {
            return;
        }
        aw3 aw3Var = s14.a;
        if (!yb.x(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        rv3Var.c(u24.a);
        rv3Var.d(u24.b);
        rv3Var.a(u24.c);
        rv3Var.b(u24.d);
        rv3Var.a(u24.e);
        rv3Var.b(u24.f);
        HashMap map4 = new HashMap();
        map4.put("ED25519", new q14(p14.b));
        p14 p14Var = p14.e;
        map4.put("ED25519_RAW", new q14(p14Var));
        map4.put("ED25519WithRawOutput", new q14(p14Var));
        ov3Var.b(Collections.unmodifiableMap(map4));
        jv3Var.a(s14.f, q14.class);
        lv3.b.a(s14.e, q14.class);
        pv3Var.a(s14.a);
        pv3Var.a(s14.b);
        vu3Var.a(s14.c, true);
        vu3Var.a(s14.d, false);
    }
}

package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class qr3 {
    static {
        int i = j04.zza;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        wr3 wr3Var = wr3.a;
        pv3 pv3Var = pv3.b;
        pv3Var.b(wr3.a);
        pv3Var.a(wr3.b);
        ax3.a();
        int i = as3.e;
        if (!yb.x(i)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        vv3 vv3Var = st3.a;
        rv3 rv3Var = rv3.b;
        rv3Var.c(st3.a);
        rv3Var.d(st3.b);
        rv3Var.a(st3.c);
        rv3Var.b(st3.d);
        pv3Var.a(as3.a);
        ov3 ov3Var = ov3.b;
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", lt3.e);
        bu1 bu1Var = new bu1(11);
        bu1Var.k(16);
        bu1Var.r(32);
        bu1Var.v(16);
        bu1Var.u(16);
        bs3 bs3Var = bs3.j;
        bu1Var.k = bs3Var;
        cs3 cs3Var = cs3.j;
        bu1Var.l = cs3Var;
        map.put("AES128_CTR_HMAC_SHA256_RAW", bu1Var.x());
        map.put("AES256_CTR_HMAC_SHA256", lt3.f);
        bu1 bu1Var2 = new bu1(11);
        bu1Var2.k(32);
        bu1Var2.r(32);
        bu1Var2.v(32);
        bu1Var2.u(16);
        bu1Var2.k = bs3Var;
        bu1Var2.l = cs3Var;
        map.put("AES256_CTR_HMAC_SHA256_RAW", bu1Var2.x());
        ov3Var.b(Collections.unmodifiableMap(map));
        lv3 lv3Var = lv3.b;
        lv3Var.a(as3.c, ds3.class);
        jv3 jv3Var = jv3.b;
        jv3Var.a(as3.d, ds3.class);
        vu3 vu3Var = vu3.d;
        vu3Var.c(as3.b, i, true);
        int i2 = ks3.e;
        if (!yb.x(i2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        rv3Var.c(yt3.a);
        rv3Var.d(yt3.b);
        rv3Var.a(yt3.c);
        rv3Var.b(yt3.d);
        pv3Var.a(ks3.a);
        HashMap map2 = new HashMap();
        map2.put("AES128_GCM", lt3.a);
        mc2 mc2Var = new mc2(24);
        mc2Var.n();
        mc2Var.i(16);
        mc2Var.t();
        ls3 ls3Var = ls3.e;
        mc2Var.j = ls3Var;
        map2.put("AES128_GCM_RAW", mc2Var.z());
        map2.put("AES256_GCM", lt3.b);
        mc2 mc2Var2 = new mc2(24);
        mc2Var2.n();
        mc2Var2.i(32);
        mc2Var2.t();
        mc2Var2.j = ls3Var;
        map2.put("AES256_GCM_RAW", mc2Var2.z());
        ov3Var.b(Collections.unmodifiableMap(map2));
        lv3Var.a(ks3.c, ms3.class);
        jv3Var.a(ks3.d, ms3.class);
        vu3Var.c(ks3.b, i2, true);
        if (mu3.a()) {
            return;
        }
        aw3 aw3Var = fs3.a;
        if (!yb.x(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        rv3Var.c(wt3.a);
        rv3Var.d(wt3.b);
        rv3Var.a(wt3.c);
        rv3Var.b(wt3.d);
        pv3Var.a(fs3.a);
        HashMap map3 = new HashMap();
        map3.put("AES128_EAX", lt3.c);
        p21 p21Var = new p21(24);
        p21Var.D(16);
        p21Var.A(16);
        p21Var.F();
        gs3 gs3Var = gs3.j;
        p21Var.i = gs3Var;
        map3.put("AES128_EAX_RAW", p21Var.K());
        map3.put("AES256_EAX", lt3.d);
        p21 p21Var2 = new p21(24);
        p21Var2.D(16);
        p21Var2.A(32);
        p21Var2.F();
        p21Var2.i = gs3Var;
        map3.put("AES256_EAX_RAW", p21Var2.K());
        ov3Var.b(Collections.unmodifiableMap(map3));
        jv3Var.a(fs3.c, hs3.class);
        vu3Var.a(fs3.b, true);
        aw3 aw3Var2 = os3.a;
        ps3 ps3Var = ps3.j;
        if (!yb.x(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        rv3Var.c(au3.a);
        rv3Var.d(au3.b);
        rv3Var.a(au3.c);
        rv3Var.b(au3.d);
        HashMap map4 = new HashMap();
        ps3 ps3Var2 = ps3.h;
        map4.put("AES128_GCM_SIV", new qs3(16, ps3Var2));
        map4.put("AES128_GCM_SIV_RAW", new qs3(16, ps3Var));
        map4.put("AES256_GCM_SIV", new qs3(32, ps3Var2));
        map4.put("AES256_GCM_SIV_RAW", new qs3(32, ps3Var));
        ov3Var.b(Collections.unmodifiableMap(map4));
        lv3Var.a(zr3.c, qs3.class);
        jv3Var.a(yr3.e, qs3.class);
        pv3Var.a(os3.a);
        vu3Var.a(os3.b, true);
        aw3 aw3Var3 = ss3.a;
        if (!yb.x(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        rv3Var.c(cu3.a);
        rv3Var.d(cu3.b);
        rv3Var.a(cu3.c);
        rv3Var.b(cu3.d);
        pv3Var.a(ss3.a);
        jv3Var.a(yr3.f, us3.class);
        HashMap map5 = new HashMap();
        map5.put("CHACHA20_POLY1305", new us3(ts3.h));
        map5.put("CHACHA20_POLY1305_RAW", new us3(ts3.j));
        ov3Var.b(Collections.unmodifiableMap(map5));
        vu3Var.a(ss3.b, true);
        aw3 aw3Var4 = vs3.a;
        if (!yb.x(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        rv3Var.c(bt3.a);
        rv3Var.d(bt3.b);
        rv3Var.a(bt3.c);
        rv3Var.b(bt3.d);
        pv3Var.a(vs3.a);
        jv3Var.a(vs3.c, at3.class);
        vu3Var.a(vs3.b, true);
        cv3 cv3Var = xs3.a;
        if (!yb.x(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        rv3Var.c(et3.a);
        rv3Var.d(et3.b);
        rv3Var.a(et3.c);
        rv3Var.b(et3.d);
        jv3Var.a(xs3.b, dt3.class);
        pv3Var.a(xs3.c);
        vu3Var.a(xs3.a, true);
        aw3 aw3Var5 = qt3.a;
        if (!yb.x(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        rv3Var.c(ju3.a);
        rv3Var.d(ju3.b);
        rv3Var.a(ju3.c);
        rv3Var.b(ju3.d);
        pv3Var.a(qt3.a);
        HashMap map6 = new HashMap();
        map6.put("XCHACHA20_POLY1305", new rt3(cs3.k));
        map6.put("XCHACHA20_POLY1305_RAW", new rt3(cs3.m));
        ov3Var.b(Collections.unmodifiableMap(map6));
        jv3Var.a(qt3.d, rt3.class);
        lv3Var.a(qt3.c, rt3.class);
        vu3Var.a(qt3.b, true);
        aw3 aw3Var6 = nt3.a;
        rv3Var.c(iu3.a);
        rv3Var.d(iu3.b);
        rv3Var.a(iu3.c);
        rv3Var.b(iu3.d);
        HashMap map7 = new HashMap();
        map7.put("XAES_256_GCM_192_BIT_NONCE", lt3.g);
        map7.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", lt3.h);
        map7.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", lt3.i);
        map7.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", lt3.j);
        ov3Var.b(Collections.unmodifiableMap(map7));
        pv3Var.a(nt3.a);
        jv3Var.a(yr3.i, ot3.class);
    }
}

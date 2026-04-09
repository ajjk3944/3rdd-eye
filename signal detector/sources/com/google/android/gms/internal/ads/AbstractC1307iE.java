package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.iE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1307iE {
    static {
        int i = C2010vI.zza;
        try {
            a();
        } catch (GeneralSecurityException e6) {
            throw new ExceptionInInitializerError(e6);
        }
    }

    public static void a() {
        C1683pE c1683pE = C1683pE.f16149a;
        YF yf = YF.f12621b;
        yf.b(C1683pE.f16149a);
        yf.a(C1683pE.f16150b);
        IG.a();
        int i = AbstractC1898tE.f16885e;
        if (!Cr.m(i)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        C1037dG c1037dG = AbstractC0981cF.f13544a;
        ZF zf = ZF.f12810b;
        zf.c(AbstractC0981cF.f13544a);
        zf.d(AbstractC0981cF.f13545b);
        zf.a(AbstractC0981cF.f13546c);
        zf.b(AbstractC0981cF.f13547d);
        yf.a(AbstractC1898tE.f16881a);
        XF xf = XF.f12406b;
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", VE.f11974e);
        C1677p8 c1677p8 = new C1677p8(6);
        c1677p8.b(16);
        c1677p8.h(32);
        c1677p8.o(16);
        c1677p8.n(16);
        C1952uE c1952uE = C1952uE.f17083e;
        c1677p8.f16141e = c1952uE;
        C2006vE c2006vE = C2006vE.f17239e;
        c1677p8.f16142f = c2006vE;
        map.put("AES128_CTR_HMAC_SHA256_RAW", c1677p8.q());
        map.put("AES256_CTR_HMAC_SHA256", VE.f11975f);
        C1677p8 c1677p82 = new C1677p8(6);
        c1677p82.b(32);
        c1677p82.h(32);
        c1677p82.o(32);
        c1677p82.n(16);
        c1677p82.f16141e = c1952uE;
        c1677p82.f16142f = c2006vE;
        map.put("AES256_CTR_HMAC_SHA256_RAW", c1677p82.q());
        xf.b(Collections.unmodifiableMap(map));
        UF uf = UF.f11629b;
        uf.a(AbstractC1898tE.f16883c, C2060wE.class);
        SF sf = SF.f11162b;
        sf.a(AbstractC1898tE.f16884d, C2060wE.class);
        GF gf = GF.f8340d;
        gf.c(AbstractC1898tE.f16882b, i, true);
        int i3 = DE.f7740e;
        if (!Cr.m(i3)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        zf.c(AbstractC1145fF.f14045a);
        zf.d(AbstractC1145fF.f14046b);
        zf.a(AbstractC1145fF.f14047c);
        zf.b(AbstractC1145fF.f14048d);
        yf.a(DE.f7736a);
        HashMap map2 = new HashMap();
        map2.put("AES128_GCM", VE.f11970a);
        C2222zE c2222zE = new C2222zE(1);
        c2222zE.d();
        c2222zE.a(16);
        c2222zE.g();
        YD yd = YD.f12611h;
        c2222zE.f17841e = yd;
        map2.put("AES128_GCM_RAW", c2222zE.k());
        map2.put("AES256_GCM", VE.f11971b);
        C2222zE c2222zE2 = new C2222zE(1);
        c2222zE2.d();
        c2222zE2.a(32);
        c2222zE2.g();
        c2222zE2.f17841e = yd;
        map2.put("AES256_GCM_RAW", c2222zE2.k());
        xf.b(Collections.unmodifiableMap(map2));
        uf.a(DE.f7738c, EE.class);
        sf.a(DE.f7739d, EE.class);
        gf.c(DE.f7737b, i3, true);
        if (AbstractC2061wF.a()) {
            return;
        }
        C1309iG c1309iG = AbstractC2168yE.f17697a;
        if (!Cr.m(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        zf.c(AbstractC1036dF.f13744a);
        zf.d(AbstractC1036dF.f13745b);
        zf.a(AbstractC1036dF.f13746c);
        zf.b(AbstractC1036dF.f13747d);
        yf.a(AbstractC2168yE.f17697a);
        HashMap map3 = new HashMap();
        map3.put("AES128_EAX", VE.f11972c);
        C2222zE c2222zE3 = new C2222zE(0);
        c2222zE3.e(16);
        c2222zE3.a(16);
        c2222zE3.g();
        AE ae = AE.f6958e;
        c2222zE3.f17841e = ae;
        map3.put("AES128_EAX_RAW", c2222zE3.j());
        map3.put("AES256_EAX", VE.f11973d);
        C2222zE c2222zE4 = new C2222zE(0);
        c2222zE4.e(16);
        c2222zE4.a(32);
        c2222zE4.g();
        c2222zE4.f17841e = ae;
        map3.put("AES256_EAX_RAW", c2222zE4.j());
        xf.b(Collections.unmodifiableMap(map3));
        sf.a(AbstractC2168yE.f17699c, BE.class);
        gf.a(AbstractC2168yE.f17698b, true);
        C1309iG c1309iG2 = GE.f8337a;
        C1952uE c1952uE2 = C1952uE.f17087j;
        if (!Cr.m(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        zf.c(AbstractC1254hF.f14466a);
        zf.d(AbstractC1254hF.f14467b);
        zf.a(AbstractC1254hF.f14468c);
        zf.b(AbstractC1254hF.f14469d);
        HashMap map4 = new HashMap();
        C1952uE c1952uE3 = C1952uE.f17086h;
        map4.put("AES128_GCM_SIV", new HE(16, c1952uE3));
        map4.put("AES128_GCM_SIV_RAW", new HE(16, c1952uE2));
        map4.put("AES256_GCM_SIV", new HE(32, c1952uE3));
        map4.put("AES256_GCM_SIV_RAW", new HE(32, c1952uE2));
        xf.b(Collections.unmodifiableMap(map4));
        uf.a(C1844sE.f16695c, HE.class);
        sf.a(C1790rE.f16489e, HE.class);
        yf.a(GE.f8337a);
        gf.a(GE.f8338b, true);
        C1309iG c1309iG3 = JE.f9267a;
        if (!Cr.m(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        zf.c(AbstractC1468lF.f15372a);
        zf.d(AbstractC1468lF.f15373b);
        zf.a(AbstractC1468lF.f15374c);
        zf.b(AbstractC1468lF.f15375d);
        yf.a(JE.f9267a);
        sf.a(C1790rE.f16490f, KE.class);
        HashMap map5 = new HashMap();
        map5.put("CHACHA20_POLY1305", new KE(C2006vE.f17240f));
        map5.put("CHACHA20_POLY1305_RAW", new KE(C2006vE.f17242h));
        xf.b(Collections.unmodifiableMap(map5));
        gf.a(JE.f9268b, true);
        C1309iG c1309iG4 = LE.f9641a;
        if (!Cr.m(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        zf.c(QE.f10590a);
        zf.d(QE.f10591b);
        zf.a(QE.f10592c);
        zf.b(QE.f10593d);
        yf.a(LE.f9641a);
        sf.a(LE.f9643c, PE.class);
        gf.a(LE.f9642b, true);
        MF mf = NE.f9978a;
        if (!Cr.m(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        zf.c(UE.f11625a);
        zf.d(UE.f11626b);
        zf.a(UE.f11627c);
        zf.b(UE.f11628d);
        sf.a(NE.f9979b, SE.class);
        yf.a(NE.f9980c);
        gf.a(NE.f9978a, true);
        C1309iG c1309iG5 = AbstractC0872aF.f13085a;
        if (!Cr.m(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        zf.c(AbstractC1899tF.f16886a);
        zf.d(AbstractC1899tF.f16887b);
        zf.a(AbstractC1899tF.f16888c);
        zf.b(AbstractC1899tF.f16889d);
        yf.a(AbstractC0872aF.f13085a);
        HashMap map6 = new HashMap();
        map6.put("XCHACHA20_POLY1305", new C0927bF(AE.f6961h));
        map6.put("XCHACHA20_POLY1305_RAW", new C0927bF(AE.f6962j));
        xf.b(Collections.unmodifiableMap(map6));
        sf.a(AbstractC0872aF.f13088d, C0927bF.class);
        uf.a(AbstractC0872aF.f13087c, C0927bF.class);
        gf.a(AbstractC0872aF.f13086b, true);
        C1309iG c1309iG6 = XE.f12405a;
        zf.c(AbstractC1791rF.f16502a);
        zf.d(AbstractC1791rF.f16503b);
        zf.a(AbstractC1791rF.f16504c);
        zf.b(AbstractC1791rF.f16505d);
        HashMap map7 = new HashMap();
        map7.put("XAES_256_GCM_192_BIT_NONCE", VE.f11976g);
        map7.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", VE.f11977h);
        map7.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", VE.i);
        map7.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", VE.f11978j);
        xf.b(Collections.unmodifiableMap(map7));
        yf.a(XE.f12405a);
        sf.a(C1790rE.i, YE.class);
    }
}

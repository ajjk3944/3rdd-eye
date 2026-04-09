package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class BJ {
    static {
        int i = C2010vI.zza;
        try {
            a();
        } catch (GeneralSecurityException e6) {
            throw new ExceptionInInitializerError(e6);
        }
    }

    public static void a() throws GeneralSecurityException {
        C1258hJ c1258hJ = C1258hJ.f14472a;
        YF yf = YF.f12621b;
        yf.b(C1258hJ.f14472a);
        yf.a(C1258hJ.f14473b);
        yf.b(C1472lJ.f15378a);
        yf.a(C1472lJ.f15379b);
        int i = AbstractC0876aJ.f13099f;
        if (!Cr.m(i)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available.");
        }
        C1037dG c1037dG = FJ.f8081a;
        ZF zf = ZF.f12810b;
        zf.c(FJ.f8081a);
        zf.d(FJ.f8082b);
        zf.a(FJ.f8083c);
        zf.b(FJ.f8084d);
        zf.a(FJ.f8085e);
        zf.b(FJ.f8086f);
        XF xf = XF.f12406b;
        HashMap map = new HashMap();
        map.put("ECDSA_P256", AbstractC1204gJ.f14248a);
        map.put("ECDSA_P256_IEEE_P1363", AbstractC1204gJ.f14251d);
        C2222zE c2222zE = new C2222zE(4);
        c2222zE.f17840d = C1952uE.f17090m;
        c2222zE.f17839c = WI.f12196c;
        c2222zE.f17838b = C2006vE.f17244k;
        c2222zE.f17841e = AE.f6966n;
        map.put("ECDSA_P256_RAW", c2222zE.m());
        map.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", AbstractC1204gJ.f14253f);
        map.put("ECDSA_P384", AbstractC1204gJ.f14249b);
        map.put("ECDSA_P384_IEEE_P1363", AbstractC1204gJ.f14252e);
        C2222zE c2222zE2 = new C2222zE(4);
        c2222zE2.f17840d = C1952uE.f17080C;
        WI wi = WI.f12197d;
        c2222zE2.f17839c = wi;
        C2006vE c2006vE = C2006vE.f17245l;
        c2222zE2.f17838b = c2006vE;
        AE ae = AE.f6963k;
        c2222zE2.f17841e = ae;
        map.put("ECDSA_P384_SHA512", c2222zE2.m());
        C2222zE c2222zE3 = new C2222zE(4);
        c2222zE3.f17840d = C1952uE.f17091n;
        c2222zE3.f17839c = wi;
        c2222zE3.f17838b = c2006vE;
        c2222zE3.f17841e = ae;
        map.put("ECDSA_P384_SHA384", c2222zE3.m());
        map.put("ECDSA_P521", AbstractC1204gJ.f14250c);
        map.put("ECDSA_P521_IEEE_P1363", AbstractC1204gJ.f14254g);
        xf.b(Collections.unmodifiableMap(map));
        yf.a(AbstractC0876aJ.f13094a);
        yf.a(AbstractC0876aJ.f13095b);
        SF sf = SF.f11162b;
        sf.a(AbstractC0876aJ.f13098e, XI.class);
        GF gf = GF.f8340d;
        gf.c(AbstractC0876aJ.f13096c, i, true);
        gf.c(AbstractC0876aJ.f13097d, i, false);
        int i3 = AbstractC1903tJ.f16897f;
        if (!Cr.m(i3)) {
            throw new GeneralSecurityException("Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available.");
        }
        zf.c(LJ.f9644a);
        zf.d(LJ.f9645b);
        zf.a(LJ.f9646c);
        zf.b(LJ.f9647d);
        zf.a(LJ.f9648e);
        zf.b(LJ.f9649f);
        HashMap map2 = new HashMap();
        map2.put("RSA_SSA_PKCS1_3072_SHA256_F4", AbstractC1204gJ.f14255h);
        BigInteger bigInteger = C1688pJ.f16156e;
        C1526mJ c1526mJ = new C1526mJ();
        c1526mJ.f15608c = C1580nJ.f15763b;
        c1526mJ.a(3072);
        BigInteger bigInteger2 = C1688pJ.f16156e;
        c1526mJ.f15607b = bigInteger2;
        C1634oJ c1634oJ = C1634oJ.f15931e;
        c1526mJ.f15609d = c1634oJ;
        map2.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", c1526mJ.b());
        map2.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", AbstractC1204gJ.i);
        map2.put("RSA_SSA_PKCS1_4096_SHA512_F4", AbstractC1204gJ.f14256j);
        C1526mJ c1526mJ2 = new C1526mJ();
        c1526mJ2.f15608c = C1580nJ.f15765d;
        c1526mJ2.a(4096);
        c1526mJ2.f15607b = bigInteger2;
        c1526mJ2.f15609d = c1634oJ;
        map2.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", c1526mJ2.b());
        xf.b(map2);
        yf.a(AbstractC1903tJ.f16892a);
        yf.a(AbstractC1903tJ.f16893b);
        sf.a(AbstractC1903tJ.f16896e, C1688pJ.class);
        gf.c(AbstractC1903tJ.f16894c, i3, true);
        gf.c(AbstractC1903tJ.f16895d, i3, false);
        int i6 = AJ.f6978f;
        if (!Cr.m(i6)) {
            throw new GeneralSecurityException("Can not use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        zf.c(PJ.f10339a);
        zf.d(PJ.f10340b);
        zf.a(PJ.f10341c);
        zf.b(PJ.f10342d);
        zf.a(PJ.f10343e);
        zf.b(PJ.f10344f);
        HashMap map3 = new HashMap();
        BigInteger bigInteger3 = C2119xJ.f17569g;
        C1957uJ c1957uJ = new C1957uJ();
        C2011vJ c2011vJ = C2011vJ.f17253b;
        c1957uJ.f17109c = c2011vJ;
        c1957uJ.f17110d = c2011vJ;
        c1957uJ.b(32);
        c1957uJ.a(3072);
        BigInteger bigInteger4 = C2119xJ.f17569g;
        c1957uJ.f17108b = bigInteger4;
        C2065wJ c2065wJ = C2065wJ.f17418b;
        c1957uJ.f17112f = c2065wJ;
        map3.put("RSA_SSA_PSS_3072_SHA256_F4", c1957uJ.c());
        C1957uJ c1957uJ2 = new C1957uJ();
        c1957uJ2.f17109c = c2011vJ;
        c1957uJ2.f17110d = c2011vJ;
        c1957uJ2.b(32);
        c1957uJ2.a(3072);
        c1957uJ2.f17108b = bigInteger4;
        C2065wJ c2065wJ2 = C2065wJ.f17421e;
        c1957uJ2.f17112f = c2065wJ2;
        map3.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", c1957uJ2.c());
        map3.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", AbstractC1204gJ.f14257k);
        C1957uJ c1957uJ3 = new C1957uJ();
        C2011vJ c2011vJ2 = C2011vJ.f17255d;
        c1957uJ3.f17109c = c2011vJ2;
        c1957uJ3.f17110d = c2011vJ2;
        c1957uJ3.b(64);
        c1957uJ3.a(4096);
        c1957uJ3.f17108b = bigInteger4;
        c1957uJ3.f17112f = c2065wJ;
        map3.put("RSA_SSA_PSS_4096_SHA512_F4", c1957uJ3.c());
        C1957uJ c1957uJ4 = new C1957uJ();
        c1957uJ4.f17109c = c2011vJ2;
        c1957uJ4.f17110d = c2011vJ2;
        c1957uJ4.b(64);
        c1957uJ4.a(4096);
        c1957uJ4.f17108b = bigInteger4;
        c1957uJ4.f17112f = c2065wJ2;
        map3.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", c1957uJ4.c());
        map3.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", AbstractC1204gJ.f14258l);
        xf.b(Collections.unmodifiableMap(map3));
        yf.a(AJ.f6973a);
        yf.a(AJ.f6974b);
        sf.a(AJ.f6977e, C2119xJ.class);
        gf.c(AJ.f6975c, i6, true);
        gf.c(AJ.f6976d, i6, false);
        if (AbstractC2061wF.a()) {
            return;
        }
        C1309iG c1309iG = AbstractC1094eJ.f13883a;
        if (!Cr.m(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        zf.c(HJ.f8886a);
        zf.d(HJ.f8887b);
        zf.a(HJ.f8888c);
        zf.b(HJ.f8889d);
        zf.a(HJ.f8890e);
        zf.b(HJ.f8891f);
        HashMap map4 = new HashMap();
        map4.put("ED25519", new C0985cJ(C0931bJ.f13339b));
        C0931bJ c0931bJ = C0931bJ.f13342e;
        map4.put("ED25519_RAW", new C0985cJ(c0931bJ));
        map4.put("ED25519WithRawOutput", new C0985cJ(c0931bJ));
        xf.b(Collections.unmodifiableMap(map4));
        sf.a(AbstractC1094eJ.f13888f, C0985cJ.class);
        UF.f11629b.a(AbstractC1094eJ.f13887e, C0985cJ.class);
        yf.a(AbstractC1094eJ.f13883a);
        yf.a(AbstractC1094eJ.f13884b);
        gf.a(AbstractC1094eJ.f13885c, true);
        gf.a(AbstractC1094eJ.f13886d, false);
    }
}

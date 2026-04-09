package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class IG {
    static {
        int i = C2010vI.zza;
        try {
            a();
        } catch (GeneralSecurityException e6) {
            throw new ExceptionInInitializerError(e6);
        }
    }

    public static void a() throws GeneralSecurityException {
        MG mg = MG.f9856a;
        YF yf = YF.f12621b;
        yf.b(MG.f9856a);
        yf.a(MG.f9857b);
        yf.b(BG.f7329a);
        int i = EG.f7939f;
        if (!Cr.m(i)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        Vu vu = QG.f10595a;
        ZF zf = ZF.f12810b;
        zf.c(QG.f10597c);
        zf.d(QG.f10598d);
        zf.a(QG.f10599e);
        zf.b(QG.f10600f);
        yf.a(EG.f7934a);
        yf.a(EG.f7935b);
        XF xf = XF.f12406b;
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", NG.f9983a);
        C2222zE c2222zE = new C2222zE(3);
        c2222zE.a(32);
        c2222zE.e(16);
        GG gg = GG.f8346e;
        c2222zE.f17841e = gg;
        FG fg = FG.f8077d;
        c2222zE.f17840d = fg;
        map.put("HMAC_SHA256_128BITTAG_RAW", c2222zE.l());
        C2222zE c2222zE2 = new C2222zE(3);
        c2222zE2.a(32);
        c2222zE2.e(32);
        GG gg2 = GG.f8343b;
        c2222zE2.f17841e = gg2;
        c2222zE2.f17840d = fg;
        map.put("HMAC_SHA256_256BITTAG", c2222zE2.l());
        C2222zE c2222zE3 = new C2222zE(3);
        c2222zE3.a(32);
        c2222zE3.e(32);
        c2222zE3.f17841e = gg;
        c2222zE3.f17840d = fg;
        map.put("HMAC_SHA256_256BITTAG_RAW", c2222zE3.l());
        C2222zE c2222zE4 = new C2222zE(3);
        c2222zE4.a(64);
        c2222zE4.e(16);
        c2222zE4.f17841e = gg2;
        FG fg2 = FG.f8079f;
        c2222zE4.f17840d = fg2;
        map.put("HMAC_SHA512_128BITTAG", c2222zE4.l());
        C2222zE c2222zE5 = new C2222zE(3);
        c2222zE5.a(64);
        c2222zE5.e(16);
        c2222zE5.f17841e = gg;
        c2222zE5.f17840d = fg2;
        map.put("HMAC_SHA512_128BITTAG_RAW", c2222zE5.l());
        C2222zE c2222zE6 = new C2222zE(3);
        c2222zE6.a(64);
        c2222zE6.e(32);
        c2222zE6.f17841e = gg2;
        c2222zE6.f17840d = fg2;
        map.put("HMAC_SHA512_256BITTAG", c2222zE6.l());
        C2222zE c2222zE7 = new C2222zE(3);
        c2222zE7.a(64);
        c2222zE7.e(32);
        c2222zE7.f17841e = gg;
        c2222zE7.f17840d = fg2;
        map.put("HMAC_SHA512_256BITTAG_RAW", c2222zE7.l());
        map.put("HMAC_SHA512_512BITTAG", NG.f9984b);
        C2222zE c2222zE8 = new C2222zE(3);
        c2222zE8.a(64);
        c2222zE8.e(64);
        c2222zE8.f17841e = gg;
        c2222zE8.f17840d = fg2;
        map.put("HMAC_SHA512_512BITTAG_RAW", c2222zE8.l());
        xf.b(Collections.unmodifiableMap(map));
        SF sf = SF.f11162b;
        sf.a(EG.f7938e, HG.class);
        UF.f11629b.a(EG.f7937d, HG.class);
        GF gf = GF.f8340d;
        gf.c(EG.f7936c, i, true);
        if (AbstractC2061wF.a()) {
            return;
        }
        C1309iG c1309iG = AbstractC2170yG.f17701a;
        if (!Cr.m(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        zf.c(PG.f10335a);
        zf.d(PG.f10336b);
        zf.a(PG.f10337c);
        zf.b(PG.f10338d);
        sf.a(C1790rE.f16495l, C2224zG.class);
        yf.a(AbstractC2170yG.f17701a);
        yf.a(AbstractC2170yG.f17702b);
        HashMap map2 = new HashMap();
        C2224zG c2224zG = NG.f9985c;
        map2.put("AES_CMAC", c2224zG);
        map2.put("AES256_CMAC", c2224zG);
        C2041vw c2041vw = new C2041vw(8);
        c2041vw.d(32);
        c2041vw.h(16);
        c2041vw.f17371d = YD.f12605F;
        map2.put("AES256_CMAC_RAW", c2041vw.s());
        xf.b(Collections.unmodifiableMap(map2));
        gf.a(AbstractC2170yG.f17703c, true);
    }
}

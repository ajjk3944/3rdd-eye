package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class ve1 {
    static {
        int i4 = ji1.zza;
        try {
            a();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    public static void a() throws GeneralSecurityException {
        ze1 ze1Var = ze1.f19070a;
        ld1 ld1Var = ld1.f13463b;
        ld1Var.b(ze1.f19070a);
        ld1Var.a(ze1.f19071b);
        ld1Var.b(oe1.f14691a);
        int i4 = re1.f15637f;
        if (!al0.q(i4)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        rt rtVar = ef1.f10777a;
        md1 md1Var = md1.f13875b;
        md1Var.c(ef1.f10779c);
        md1Var.d(ef1.f10780d);
        md1Var.a(ef1.f10781e);
        md1Var.b(ef1.f10782f);
        ld1Var.a(re1.f15632a);
        ld1Var.a(re1.f15633b);
        kd1 kd1Var = kd1.f13140b;
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", af1.f9319a);
        oa1 oa1Var = new oa1(3);
        oa1Var.a(32);
        oa1Var.d(16);
        te1 te1Var = te1.f16801e;
        oa1Var.f14637e = te1Var;
        se1 se1Var = se1.f16000d;
        oa1Var.f14636d = se1Var;
        map.put("HMAC_SHA256_128BITTAG_RAW", oa1Var.l());
        oa1 oa1Var2 = new oa1(3);
        oa1Var2.a(32);
        oa1Var2.d(32);
        te1 te1Var2 = te1.f16798b;
        oa1Var2.f14637e = te1Var2;
        oa1Var2.f14636d = se1Var;
        map.put("HMAC_SHA256_256BITTAG", oa1Var2.l());
        oa1 oa1Var3 = new oa1(3);
        oa1Var3.a(32);
        oa1Var3.d(32);
        oa1Var3.f14637e = te1Var;
        oa1Var3.f14636d = se1Var;
        map.put("HMAC_SHA256_256BITTAG_RAW", oa1Var3.l());
        oa1 oa1Var4 = new oa1(3);
        oa1Var4.a(64);
        oa1Var4.d(16);
        oa1Var4.f14637e = te1Var2;
        se1 se1Var2 = se1.f16002f;
        oa1Var4.f14636d = se1Var2;
        map.put("HMAC_SHA512_128BITTAG", oa1Var4.l());
        oa1 oa1Var5 = new oa1(3);
        oa1Var5.a(64);
        oa1Var5.d(16);
        oa1Var5.f14637e = te1Var;
        oa1Var5.f14636d = se1Var2;
        map.put("HMAC_SHA512_128BITTAG_RAW", oa1Var5.l());
        oa1 oa1Var6 = new oa1(3);
        oa1Var6.a(64);
        oa1Var6.d(32);
        oa1Var6.f14637e = te1Var2;
        oa1Var6.f14636d = se1Var2;
        map.put("HMAC_SHA512_256BITTAG", oa1Var6.l());
        oa1 oa1Var7 = new oa1(3);
        oa1Var7.a(64);
        oa1Var7.d(32);
        oa1Var7.f14637e = te1Var;
        oa1Var7.f14636d = se1Var2;
        map.put("HMAC_SHA512_256BITTAG_RAW", oa1Var7.l());
        map.put("HMAC_SHA512_512BITTAG", af1.f9320b);
        oa1 oa1Var8 = new oa1(3);
        oa1Var8.a(64);
        oa1Var8.d(64);
        oa1Var8.f14637e = te1Var;
        oa1Var8.f14636d = se1Var2;
        map.put("HMAC_SHA512_512BITTAG_RAW", oa1Var8.l());
        kd1Var.b(DesugarCollections.unmodifiableMap(map));
        fd1 fd1Var = fd1.f11109b;
        fd1Var.a(re1.f15636e, ue1.class);
        hd1.f11841b.a(re1.f15635d, ue1.class);
        tc1 tc1Var = tc1.f16783d;
        tc1Var.c(re1.f15634c, i4, true);
        if (jc1.a()) {
            return;
        }
        vd1 vd1Var = le1.f13470a;
        if (!al0.q(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        md1Var.c(cf1.f10100a);
        md1Var.d(cf1.f10101b);
        md1Var.a(cf1.f10102c);
        md1Var.b(cf1.f10103d);
        fd1Var.a(ga1.f11444l, me1.class);
        ld1Var.a(le1.f13470a);
        ld1Var.a(le1.f13471b);
        HashMap map2 = new HashMap();
        me1 me1Var = af1.f9321c;
        map2.put("AES_CMAC", me1Var);
        map2.put("AES256_CMAC", me1Var);
        av0 av0Var = new av0(8);
        av0Var.c(32);
        av0Var.k(16);
        av0Var.f9424d = m91.f13819q;
        map2.put("AES256_CMAC_RAW", av0Var.s());
        kd1Var.b(DesugarCollections.unmodifiableMap(map2));
        tc1Var.a(le1.f13472c, true);
    }
}

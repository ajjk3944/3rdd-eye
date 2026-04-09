package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class w91 {
    static {
        int i4 = ji1.zza;
        try {
            a();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    public static void a() {
        ea1 ea1Var = ea1.f10749a;
        ld1 ld1Var = ld1.f13463b;
        ld1Var.b(ea1.f10749a);
        ld1Var.a(ea1.f10750b);
        ve1.a();
        int i4 = ia1.f12188e;
        if (!al0.q(i4)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        qd1 qd1Var = pb1.f14973a;
        md1 md1Var = md1.f13875b;
        md1Var.c(pb1.f14973a);
        md1Var.d(pb1.f14974b);
        md1Var.a(pb1.f14975c);
        md1Var.b(pb1.f14976d);
        ld1Var.a(ia1.f12184a);
        kd1 kd1Var = kd1.f13140b;
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", ib1.f12198e);
        ai aiVar = new ai(6);
        aiVar.c(16);
        aiVar.h(32);
        aiVar.m(16);
        aiVar.l(16);
        ja1 ja1Var = ja1.f12695e;
        aiVar.f9334e = ja1Var;
        ka1 ka1Var = ka1.f13099e;
        aiVar.f9335f = ka1Var;
        map.put("AES128_CTR_HMAC_SHA256_RAW", aiVar.p());
        map.put("AES256_CTR_HMAC_SHA256", ib1.f12199f);
        ai aiVar2 = new ai(6);
        aiVar2.c(32);
        aiVar2.h(32);
        aiVar2.m(32);
        aiVar2.l(16);
        aiVar2.f9334e = ja1Var;
        aiVar2.f9335f = ka1Var;
        map.put("AES256_CTR_HMAC_SHA256_RAW", aiVar2.p());
        kd1Var.b(DesugarCollections.unmodifiableMap(map));
        hd1 hd1Var = hd1.f11841b;
        hd1Var.a(ia1.f12186c, la1.class);
        fd1 fd1Var = fd1.f11109b;
        fd1Var.a(ia1.f12187d, la1.class);
        tc1 tc1Var = tc1.f16783d;
        tc1Var.c(ia1.f12185b, i4, true);
        int i10 = ra1.f15608e;
        if (!al0.q(i10)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        md1Var.c(sb1.f15985a);
        md1Var.d(sb1.f15986b);
        md1Var.a(sb1.f15987c);
        md1Var.b(sb1.f15988d);
        ld1Var.a(ra1.f15604a);
        HashMap map2 = new HashMap();
        map2.put("AES128_GCM", ib1.f12194a);
        oa1 oa1Var = new oa1(1);
        oa1Var.c();
        oa1Var.a(16);
        oa1Var.f();
        ja1 ja1Var2 = ja1.j;
        oa1Var.f14637e = ja1Var2;
        map2.put("AES128_GCM_RAW", oa1Var.k());
        map2.put("AES256_GCM", ib1.f12195b);
        oa1 oa1Var2 = new oa1(1);
        oa1Var2.c();
        oa1Var2.a(32);
        oa1Var2.f();
        oa1Var2.f14637e = ja1Var2;
        map2.put("AES256_GCM_RAW", oa1Var2.k());
        kd1Var.b(DesugarCollections.unmodifiableMap(map2));
        hd1Var.a(ra1.f15606c, sa1.class);
        fd1Var.a(ra1.f15607d, sa1.class);
        tc1Var.c(ra1.f15605b, i10, true);
        if (jc1.a()) {
            return;
        }
        vd1 vd1Var = na1.f14197a;
        if (!al0.q(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        md1Var.c(qb1.f15286a);
        md1Var.d(qb1.f15287b);
        md1Var.a(qb1.f15288c);
        md1Var.b(qb1.f15289d);
        ld1Var.a(na1.f14197a);
        HashMap map3 = new HashMap();
        map3.put("AES128_EAX", ib1.f12196c);
        oa1 oa1Var3 = new oa1(0);
        oa1Var3.d(16);
        oa1Var3.a(16);
        oa1Var3.f();
        m91 m91Var = m91.f13811h;
        oa1Var3.f14637e = m91Var;
        map3.put("AES128_EAX_RAW", oa1Var3.i());
        map3.put("AES256_EAX", ib1.f12197d);
        oa1 oa1Var4 = new oa1(0);
        oa1Var4.d(16);
        oa1Var4.a(32);
        oa1Var4.f();
        oa1Var4.f14637e = m91Var;
        map3.put("AES256_EAX_RAW", oa1Var4.i());
        kd1Var.b(DesugarCollections.unmodifiableMap(map3));
        fd1Var.a(na1.f14199c, pa1.class);
        tc1Var.a(na1.f14198b, true);
        vd1 vd1Var2 = ua1.f17137a;
        ka1 ka1Var2 = ka1.f13101h;
        if (!al0.q(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        md1Var.c(vb1.f17577a);
        md1Var.d(vb1.f17578b);
        md1Var.a(vb1.f17579c);
        md1Var.b(vb1.f17580d);
        HashMap map4 = new HashMap();
        ka1 ka1Var3 = ka1.f13100f;
        map4.put("AES128_GCM_SIV", new va1(16, ka1Var3));
        map4.put("AES128_GCM_SIV_RAW", new va1(16, ka1Var2));
        map4.put("AES256_GCM_SIV", new va1(32, ka1Var3));
        map4.put("AES256_GCM_SIV_RAW", new va1(32, ka1Var2));
        kd1Var.b(DesugarCollections.unmodifiableMap(map4));
        hd1Var.a(ha1.f11798c, va1.class);
        fd1Var.a(ga1.f11439e, va1.class);
        ld1Var.a(ua1.f17137a);
        tc1Var.a(ua1.f17138b, true);
        vd1 vd1Var3 = xa1.f18338a;
        if (!al0.q(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        md1Var.c(yb1.f18700a);
        md1Var.d(yb1.f18701b);
        md1Var.a(yb1.f18702c);
        md1Var.b(yb1.f18703d);
        ld1Var.a(xa1.f18338a);
        fd1Var.a(ga1.f11440f, ya1.class);
        HashMap map5 = new HashMap();
        map5.put("CHACHA20_POLY1305", new ya1(m91.f13812i));
        map5.put("CHACHA20_POLY1305_RAW", new ya1(m91.f13813k));
        kd1Var.b(DesugarCollections.unmodifiableMap(map5));
        tc1Var.a(xa1.f18339b, true);
        vd1 vd1Var4 = za1.f19050a;
        if (!al0.q(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        md1Var.c(db1.f10420a);
        md1Var.d(db1.f10421b);
        md1Var.a(db1.f10422c);
        md1Var.b(db1.f10423d);
        ld1Var.a(za1.f19050a);
        fd1Var.a(za1.f19052c, cb1.class);
        tc1Var.a(za1.f19051b, true);
        zc1 zc1Var = ab1.f9296a;
        if (!al0.q(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        md1Var.c(hb1.f11820a);
        md1Var.d(hb1.f11821b);
        md1Var.a(hb1.f11822c);
        md1Var.b(hb1.f11823d);
        fd1Var.a(ab1.f9297b, fb1.class);
        ld1Var.a(ab1.f9298c);
        tc1Var.a(ab1.f9296a, true);
        vd1 vd1Var5 = nb1.f14237a;
        if (!al0.q(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        md1Var.c(gc1.f11493a);
        md1Var.d(gc1.f11494b);
        md1Var.a(gc1.f11495c);
        md1Var.b(gc1.f11496d);
        ld1Var.a(nb1.f14237a);
        HashMap map6 = new HashMap();
        map6.put("XCHACHA20_POLY1305", new ob1(ka1.f13107o));
        map6.put("XCHACHA20_POLY1305_RAW", new ob1(ka1.f13109q));
        kd1Var.b(DesugarCollections.unmodifiableMap(map6));
        fd1Var.a(nb1.f14240d, ob1.class);
        hd1Var.a(nb1.f14239c, ob1.class);
        tc1Var.a(nb1.f14238b, true);
        vd1 vd1Var6 = kb1.f13118a;
        md1Var.c(ec1.f10759a);
        md1Var.d(ec1.f10760b);
        md1Var.a(ec1.f10761c);
        md1Var.b(ec1.f10762d);
        HashMap map7 = new HashMap();
        map7.put("XAES_256_GCM_192_BIT_NONCE", ib1.g);
        map7.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", ib1.f12200h);
        map7.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", ib1.f12201i);
        map7.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", ib1.j);
        kd1Var.b(DesugarCollections.unmodifiableMap(map7));
        ld1Var.a(kb1.f13118a);
        fd1Var.a(ga1.f11442i, lb1.class);
    }
}

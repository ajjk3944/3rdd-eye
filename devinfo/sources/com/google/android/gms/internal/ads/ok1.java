package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.internal.Buffer;
import j$.util.DesugarCollections;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class ok1 {
    static {
        int i4 = ji1.zza;
        try {
            a();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    public static void a() throws GeneralSecurityException {
        vj1 vj1Var = vj1.f17635a;
        ld1 ld1Var = ld1.f13463b;
        ld1Var.b(vj1.f17635a);
        ld1Var.a(vj1.f17636b);
        ld1Var.b(yj1.f18782a);
        ld1Var.a(yj1.f18783b);
        int i4 = oj1.f14712f;
        if (!al0.q(i4)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available.");
        }
        qd1 qd1Var = sk1.f16449a;
        md1 md1Var = md1.f13875b;
        md1Var.c(sk1.f16449a);
        md1Var.d(sk1.f16450b);
        md1Var.a(sk1.f16451c);
        md1Var.b(sk1.f16452d);
        md1Var.a(sk1.f16453e);
        md1Var.b(sk1.f16454f);
        kd1 kd1Var = kd1.f13140b;
        HashMap map = new HashMap();
        map.put("ECDSA_P256", uj1.f17214a);
        map.put("ECDSA_P256_IEEE_P1363", uj1.f17217d);
        oa1 oa1Var = new oa1(4);
        oa1Var.f14636d = ja1.f12703o;
        oa1Var.f14635c = kj1.f13172c;
        oa1Var.f14634b = ka1.f13110r;
        oa1Var.f14637e = m91.f13823u;
        map.put("ECDSA_P256_RAW", oa1Var.m());
        map.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", uj1.f17219f);
        map.put("ECDSA_P384", uj1.f17215b);
        map.put("ECDSA_P384_IEEE_P1363", uj1.f17218e);
        oa1 oa1Var2 = new oa1(4);
        oa1Var2.f14636d = ja1.f12705q;
        kj1 kj1Var = kj1.f13173d;
        oa1Var2.f14635c = kj1Var;
        ka1 ka1Var = ka1.f13111s;
        oa1Var2.f14634b = ka1Var;
        m91 m91Var = m91.f13820r;
        oa1Var2.f14637e = m91Var;
        map.put("ECDSA_P384_SHA512", oa1Var2.m());
        oa1 oa1Var3 = new oa1(4);
        oa1Var3.f14636d = ja1.f12704p;
        oa1Var3.f14635c = kj1Var;
        oa1Var3.f14634b = ka1Var;
        oa1Var3.f14637e = m91Var;
        map.put("ECDSA_P384_SHA384", oa1Var3.m());
        map.put("ECDSA_P521", uj1.f17216c);
        map.put("ECDSA_P521_IEEE_P1363", uj1.g);
        kd1Var.b(DesugarCollections.unmodifiableMap(map));
        ld1Var.a(oj1.f14707a);
        ld1Var.a(oj1.f14708b);
        fd1 fd1Var = fd1.f11109b;
        fd1Var.a(oj1.f14711e, lj1.class);
        tc1 tc1Var = tc1.f16783d;
        tc1Var.c(oj1.f14709c, i4, true);
        tc1Var.c(oj1.f14710d, i4, false);
        int i10 = gk1.f11541f;
        if (!al0.q(i10)) {
            throw new GeneralSecurityException("Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available.");
        }
        md1Var.c(yk1.f18788a);
        md1Var.d(yk1.f18789b);
        md1Var.a(yk1.f18790c);
        md1Var.b(yk1.f18791d);
        md1Var.a(yk1.f18792e);
        md1Var.b(yk1.f18793f);
        HashMap map2 = new HashMap();
        map2.put("RSA_SSA_PKCS1_3072_SHA256_F4", uj1.f17220h);
        BigInteger bigInteger = ck1.f10149e;
        zj1 zj1Var = new zj1();
        zj1Var.f19093c = ak1.f9340b;
        zj1Var.a(3072);
        BigInteger bigInteger2 = ck1.f10149e;
        zj1Var.f19092b = bigInteger2;
        bk1 bk1Var = bk1.f9707e;
        zj1Var.f19094d = bk1Var;
        map2.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", zj1Var.b());
        map2.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", uj1.f17221i);
        map2.put("RSA_SSA_PKCS1_4096_SHA512_F4", uj1.j);
        zj1 zj1Var2 = new zj1();
        zj1Var2.f19093c = ak1.f9342d;
        zj1Var2.a(Buffer.SEGMENTING_THRESHOLD);
        zj1Var2.f19092b = bigInteger2;
        zj1Var2.f19094d = bk1Var;
        map2.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", zj1Var2.b());
        kd1Var.b(map2);
        ld1Var.a(gk1.f11536a);
        ld1Var.a(gk1.f11537b);
        fd1Var.a(gk1.f11540e, ck1.class);
        tc1Var.c(gk1.f11538c, i10, true);
        tc1Var.c(gk1.f11539d, i10, false);
        int i11 = nk1.f14320f;
        if (!al0.q(i11)) {
            throw new GeneralSecurityException("Can not use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        md1Var.c(dl1.f10509a);
        md1Var.d(dl1.f10510b);
        md1Var.a(dl1.f10511c);
        md1Var.b(dl1.f10512d);
        md1Var.a(dl1.f10513e);
        md1Var.b(dl1.f10514f);
        HashMap map3 = new HashMap();
        BigInteger bigInteger3 = kk1.g;
        hk1 hk1Var = new hk1();
        ik1 ik1Var = ik1.f12361b;
        hk1Var.f11900c = ik1Var;
        hk1Var.f11901d = ik1Var;
        hk1Var.b(32);
        hk1Var.a(3072);
        BigInteger bigInteger4 = kk1.g;
        hk1Var.f11899b = bigInteger4;
        jk1 jk1Var = jk1.f12770b;
        hk1Var.f11903f = jk1Var;
        map3.put("RSA_SSA_PSS_3072_SHA256_F4", hk1Var.c());
        hk1 hk1Var2 = new hk1();
        hk1Var2.f11900c = ik1Var;
        hk1Var2.f11901d = ik1Var;
        hk1Var2.b(32);
        hk1Var2.a(3072);
        hk1Var2.f11899b = bigInteger4;
        jk1 jk1Var2 = jk1.f12773e;
        hk1Var2.f11903f = jk1Var2;
        map3.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", hk1Var2.c());
        map3.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", uj1.f17222k);
        hk1 hk1Var3 = new hk1();
        ik1 ik1Var2 = ik1.f12363d;
        hk1Var3.f11900c = ik1Var2;
        hk1Var3.f11901d = ik1Var2;
        hk1Var3.b(64);
        hk1Var3.a(Buffer.SEGMENTING_THRESHOLD);
        hk1Var3.f11899b = bigInteger4;
        hk1Var3.f11903f = jk1Var;
        map3.put("RSA_SSA_PSS_4096_SHA512_F4", hk1Var3.c());
        hk1 hk1Var4 = new hk1();
        hk1Var4.f11900c = ik1Var2;
        hk1Var4.f11901d = ik1Var2;
        hk1Var4.b(64);
        hk1Var4.a(Buffer.SEGMENTING_THRESHOLD);
        hk1Var4.f11899b = bigInteger4;
        hk1Var4.f11903f = jk1Var2;
        map3.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", hk1Var4.c());
        map3.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", uj1.f17223l);
        kd1Var.b(DesugarCollections.unmodifiableMap(map3));
        ld1Var.a(nk1.f14315a);
        ld1Var.a(nk1.f14316b);
        fd1Var.a(nk1.f14319e, kk1.class);
        tc1Var.c(nk1.f14317c, i11, true);
        tc1Var.c(nk1.f14318d, i11, false);
        if (jc1.a()) {
            return;
        }
        vd1 vd1Var = sj1.f16027a;
        if (!al0.q(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        md1Var.c(uk1.f17235a);
        md1Var.d(uk1.f17236b);
        md1Var.a(uk1.f17237c);
        md1Var.b(uk1.f17238d);
        md1Var.a(uk1.f17239e);
        md1Var.b(uk1.f17240f);
        HashMap map4 = new HashMap();
        map4.put("ED25519", new qj1(pj1.f15019b));
        pj1 pj1Var = pj1.f15022e;
        map4.put("ED25519_RAW", new qj1(pj1Var));
        map4.put("ED25519WithRawOutput", new qj1(pj1Var));
        kd1Var.b(DesugarCollections.unmodifiableMap(map4));
        fd1Var.a(sj1.f16032f, qj1.class);
        hd1.f11841b.a(sj1.f16031e, qj1.class);
        ld1Var.a(sj1.f16027a);
        ld1Var.a(sj1.f16028b);
        tc1Var.a(sj1.f16029c, true);
        tc1Var.a(sj1.f16030d, false);
    }
}

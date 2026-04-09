package com.google.android.gms.internal.ads;

import android.os.Build;
import j$.util.Objects;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class df1 implements vc1, rd1, wd1, pd1, xc1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10470a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ df1 f10447b = new df1(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ df1 f10448c = new df1(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ df1 f10449d = new df1(2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ df1 f10450e = new df1(3);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ df1 f10451f = new df1(4);
    public static final /* synthetic */ df1 g = new df1(5);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ df1 f10452h = new df1(6);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ df1 f10453i = new df1(7);
    public static final /* synthetic */ df1 j = new df1(8);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ df1 f10454k = new df1(9);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ df1 f10455l = new df1(10);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ df1 f10456m = new df1(11);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ df1 f10457n = new df1(12);

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ df1 f10458o = new df1(13);

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ df1 f10459p = new df1(14);

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ df1 f10460q = new df1(15);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ df1 f10461r = new df1(16);

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ df1 f10462s = new df1(17);

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ df1 f10463t = new df1(18);

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ df1 f10464u = new df1(19);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ df1 f10465v = new df1(20);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ df1 f10466w = new df1(21);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ df1 f10467x = new df1(22);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ df1 f10468y = new df1(23);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ df1 f10469z = new df1(24);
    public static final /* synthetic */ df1 A = new df1(25);
    public static final /* synthetic */ df1 B = new df1(26);
    public static final /* synthetic */ df1 C = new df1(27);
    public static final /* synthetic */ df1 D = new df1(28);
    public static final /* synthetic */ df1 E = new df1(29);

    public /* synthetic */ df1(int i4) {
        this.f10470a = i4;
    }

    @Override // com.google.android.gms.internal.ads.wd1, com.google.android.gms.internal.ads.xc1
    public be1 a(al0 al0Var) throws GeneralSecurityException {
        switch (this.f10470a) {
            case 13:
                nj1 nj1Var = (nj1) al0Var;
                return be1.I("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", sk1.f(nj1Var).a(), 4, sk1.a(nj1Var.f14304c.f13510d), nj1Var.f14307f);
            case 15:
                mj1 mj1Var = (mj1) al0Var;
                qd1 qd1Var = sk1.f16449a;
                int iD = sk1.d(mj1Var.f13914c.f14304c.f13508b);
                wg1 wg1VarE = xg1.E();
                nj1 nj1Var2 = mj1Var.f13914c;
                zg1 zg1VarF = sk1.f(nj1Var2);
                wg1VarE.b();
                ((xg1) wg1VarE.f14755b).G(zg1VarF);
                byte[] bArrX = yr1.x((BigInteger) mj1Var.f13915d.f14280b, iD);
                zm1 zm1Var = bn1.f9729b;
                zm1 zm1VarV = bn1.v(0, bArrX.length, bArrX);
                wg1VarE.b();
                ((xg1) wg1VarE.f14755b).H(zm1VarV);
                return be1.I("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", ((xg1) wg1VarE.e()).a(), 3, sk1.a(nj1Var2.f14304c.f13510d), nj1Var2.f14307f);
            case 19:
                tj1 tj1Var = (tj1) al0Var;
                return be1.I("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", uk1.a(tj1Var).a(), 4, (ii1) uk1.g.o(tj1Var.f16830c.f15352a), tj1Var.f16833f);
            case 21:
                rj1 rj1Var = (rj1) al0Var;
                qd1 qd1Var2 = uk1.f17235a;
                bh1 bh1VarE = ch1.E();
                eh1 eh1VarA = uk1.a(rj1Var.f15667c);
                bh1VarE.b();
                ((ch1) bh1VarE.f14755b).H(eh1VarA);
                byte[] bArrB = ((vl1) rj1Var.f15668d.f13160b).b();
                zm1 zm1VarV2 = bn1.v(0, bArrB.length, bArrB);
                bh1VarE.b();
                ((ch1) bh1VarE.f14755b).G(zm1VarV2);
                zm1 zm1VarA = ((ch1) bh1VarE.e()).a();
                rt rtVar = uk1.g;
                tj1 tj1Var2 = rj1Var.f15667c;
                return be1.I("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", zm1VarA, 3, (ii1) rtVar.o(tj1Var2.f16830c.f15352a), tj1Var2.f16833f);
            case 25:
                fk1 fk1Var = (fk1) al0Var;
                return be1.I("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", yk1.a(fk1Var).a(), 4, (ii1) yk1.g.o(fk1Var.f11195c.f10152c), fk1Var.f11198f);
            default:
                ek1 ek1Var = (ek1) al0Var;
                qd1 qd1Var3 = yk1.f18788a;
                oi1 oi1VarJ = pi1.J();
                oi1VarJ.b();
                ((pi1) oi1VarJ.f14755b).L();
                ri1 ri1VarA = yk1.a(ek1Var.f10807c);
                oi1VarJ.b();
                ((pi1) oi1VarJ.f14755b).M(ri1VarA);
                byte[] bArrL = yr1.l((BigInteger) ek1Var.f10808d.f14280b);
                zm1 zm1Var2 = bn1.f9729b;
                zm1 zm1VarV3 = bn1.v(0, bArrL.length, bArrL);
                oi1VarJ.b();
                ((pi1) oi1VarJ.f14755b).N(zm1VarV3);
                byte[] bArrL2 = yr1.l((BigInteger) ek1Var.f10809e.f14280b);
                zm1 zm1VarV4 = bn1.v(0, bArrL2.length, bArrL2);
                oi1VarJ.b();
                ((pi1) oi1VarJ.f14755b).O(zm1VarV4);
                byte[] bArrL3 = yr1.l((BigInteger) ek1Var.f10810f.f14280b);
                zm1 zm1VarV5 = bn1.v(0, bArrL3.length, bArrL3);
                oi1VarJ.b();
                ((pi1) oi1VarJ.f14755b).P(zm1VarV5);
                byte[] bArrL4 = yr1.l((BigInteger) ek1Var.g.f14280b);
                zm1 zm1VarV6 = bn1.v(0, bArrL4.length, bArrL4);
                oi1VarJ.b();
                ((pi1) oi1VarJ.f14755b).Q(zm1VarV6);
                byte[] bArrL5 = yr1.l((BigInteger) ek1Var.f10811h.f14280b);
                zm1 zm1VarV7 = bn1.v(0, bArrL5.length, bArrL5);
                oi1VarJ.b();
                ((pi1) oi1VarJ.f14755b).R(zm1VarV7);
                byte[] bArrL6 = yr1.l((BigInteger) ek1Var.f10812i.f14280b);
                zm1 zm1VarV8 = bn1.v(0, bArrL6.length, bArrL6);
                oi1VarJ.b();
                ((pi1) oi1VarJ.f14755b).S(zm1VarV8);
                zm1 zm1VarA2 = ((pi1) oi1VarJ.e()).a();
                rt rtVar2 = yk1.g;
                fk1 fk1Var2 = ek1Var.f10807c;
                return be1.I("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", zm1VarA2, 3, (ii1) rtVar2.o(fk1Var2.f11195c.f10152c), fk1Var2.f11198f);
        }
    }

    @Override // com.google.android.gms.internal.ads.pd1
    public s91 f(ce1 ce1Var) throws GeneralSecurityException {
        switch (this.f10470a) {
            case 12:
                qd1 qd1Var = sk1.f16449a;
                qh1 qh1Var = (qh1) ce1Var.f10095c;
                if (!qh1Var.A().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parseParameters: ".concat(String.valueOf(qh1Var.A())));
                }
                try {
                    bn1 bn1VarB = qh1Var.B();
                    jn1 jn1Var = jn1.f12801a;
                    int i4 = um1.f17262a;
                    tg1 tg1VarB = tg1.B(bn1VarB, jn1.f12802b);
                    oa1 oa1Var = new oa1(4);
                    oa1Var.f14636d = sk1.b(tg1VarB.A().A());
                    oa1Var.f14634b = sk1.h(tg1VarB.A().F());
                    oa1Var.f14635c = sk1.g(tg1VarB.A().E());
                    oa1Var.f14637e = sk1.c(qh1Var.C());
                    return oa1Var.m();
                } catch (ao1 e2) {
                    throw new GeneralSecurityException("Parsing EcdsaParameters failed: ", e2);
                }
            case 18:
                qd1 qd1Var2 = uk1.f17235a;
                qh1 qh1Var2 = (qh1) ce1Var.f10095c;
                if (!qh1Var2.A().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parseParameters: ".concat(String.valueOf(qh1Var2.A())));
                }
                try {
                    bn1 bn1VarB2 = qh1Var2.B();
                    jn1 jn1Var2 = jn1.f12801a;
                    int i10 = um1.f17262a;
                    if (ah1.B(bn1VarB2, jn1.f12802b).A() == 0) {
                        return new qj1((pj1) uk1.g.t(qh1Var2.C()));
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (ao1 e10) {
                    throw new GeneralSecurityException("Parsing Ed25519Parameters failed: ", e10);
                }
            default:
                qd1 qd1Var3 = yk1.f18788a;
                qh1 qh1Var3 = (qh1) ce1Var.f10095c;
                if (!qh1Var3.A().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: ".concat(String.valueOf(qh1Var3.A())));
                }
                try {
                    bn1 bn1VarB3 = qh1Var3.B();
                    jn1 jn1Var3 = jn1.f12801a;
                    int i11 = um1.f17262a;
                    li1 li1VarD = li1.D(bn1VarB3, jn1.f12802b);
                    BigInteger bigInteger = ck1.f10149e;
                    zj1 zj1Var = new zj1();
                    zj1Var.f19093c = (ak1) yk1.f18794h.t(li1VarD.A().A());
                    zj1Var.f19092b = new BigInteger(1, li1VarD.C().y());
                    zj1Var.a(li1VarD.B());
                    zj1Var.f19094d = (bk1) yk1.g.t(qh1Var3.C());
                    return zj1Var.b();
                } catch (ao1 e11) {
                    throw new GeneralSecurityException("Parsing RsaSsaPkcs1Parameters failed: ", e11);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.vc1
    public al0 h(be1 be1Var) throws GeneralSecurityException {
        switch (this.f10470a) {
            case 0:
                rt rtVar = ef1.f10777a;
                if (!((String) be1Var.f9658b).equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
                }
                try {
                    bn1 bn1Var = (bn1) be1Var.f9660d;
                    jn1 jn1Var = jn1.f12801a;
                    int i4 = um1.f17262a;
                    hh1 hh1VarD = hh1.D(bn1Var, jn1.f12802b);
                    if (hh1VarD.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    oa1 oa1Var = new oa1(3);
                    oa1Var.a(hh1VarD.C().i());
                    oa1Var.d(hh1VarD.B().B());
                    oa1Var.f14636d = (se1) ef1.f10778b.t(hh1VarD.B().A());
                    oa1Var.f14637e = (te1) ef1.f10777a.t((ii1) be1Var.f9661e);
                    ue1 ue1VarL = oa1Var.l();
                    av0 av0Var = new av0(9, false);
                    av0Var.f9422b = ue1VarL;
                    av0Var.f9423c = kh0.l(hh1VarD.C().y());
                    av0Var.f9424d = (Integer) be1Var.f9662f;
                    return av0Var.t();
                } catch (ao1 | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing HmacKey failed");
                }
            case 14:
                qd1 qd1Var = sk1.f16449a;
                String str = (String) be1Var.f9658b;
                if (!str.equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(str)));
                }
                try {
                    bn1 bn1Var2 = (bn1) be1Var.f9660d;
                    jn1 jn1Var2 = jn1.f12801a;
                    int i10 = um1.f17262a;
                    zg1 zg1VarE = zg1.E(bn1Var2, jn1.f12802b);
                    if (zg1VarE.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    oa1 oa1Var2 = new oa1(4);
                    oa1Var2.f14636d = sk1.b(zg1VarE.B().A());
                    oa1Var2.f14634b = sk1.h(zg1VarE.B().F());
                    oa1Var2.f14635c = sk1.g(zg1VarE.B().E());
                    oa1Var2.f14637e = sk1.c((ii1) be1Var.f9661e);
                    lj1 lj1VarM = oa1Var2.m();
                    av0 av0Var2 = new av0(10, false);
                    av0Var2.f9422b = lj1VarM;
                    av0Var2.f9423c = new ECPoint(new BigInteger(1, zg1VarE.C().y()), new BigInteger(1, zg1VarE.D().y()));
                    av0Var2.f9424d = (Integer) be1Var.f9662f;
                    return av0Var2.u();
                } catch (ao1 | IllegalArgumentException unused2) {
                    throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
                }
            case 16:
                qd1 qd1Var2 = sk1.f16449a;
                String str2 = (String) be1Var.f9658b;
                if (!str2.equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str2)));
                }
                try {
                    bn1 bn1Var3 = (bn1) be1Var.f9660d;
                    jn1 jn1Var3 = jn1.f12801a;
                    int i11 = um1.f17262a;
                    xg1 xg1VarD = xg1.D(bn1Var3, jn1.f12802b);
                    if (xg1VarD.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zg1 zg1VarB = xg1VarD.B();
                    if (zg1VarB.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    oa1 oa1Var3 = new oa1(4);
                    oa1Var3.f14636d = sk1.b(zg1VarB.B().A());
                    oa1Var3.f14634b = sk1.h(zg1VarB.B().F());
                    oa1Var3.f14635c = sk1.g(zg1VarB.B().E());
                    oa1Var3.f14637e = sk1.c((ii1) be1Var.f9661e);
                    lj1 lj1VarM2 = oa1Var3.m();
                    av0 av0Var3 = new av0(10, false);
                    av0Var3.f9422b = lj1VarM2;
                    av0Var3.f9423c = new ECPoint(new BigInteger(1, zg1VarB.C().y()), new BigInteger(1, zg1VarB.D().y()));
                    av0Var3.f9424d = (Integer) be1Var.f9662f;
                    nj1 nj1VarU = av0Var3.u();
                    l90 l90Var = new l90(24);
                    l90Var.f13426b = nj1VarU;
                    l90Var.f13427c = new ne0(24, new BigInteger(1, xg1VarD.C().y()));
                    return l90Var.v();
                } catch (ao1 | IllegalArgumentException unused3) {
                    throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
                }
            case 20:
                qd1 qd1Var3 = uk1.f17235a;
                String str3 = (String) be1Var.f9658b;
                if (!str3.equals("type.googleapis.com/google.crypto.tink.Ed25519PublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: ".concat(String.valueOf(str3)));
                }
                try {
                    bn1 bn1Var4 = (bn1) be1Var.f9660d;
                    jn1 jn1Var4 = jn1.f12801a;
                    int i12 = um1.f17262a;
                    eh1 eh1VarC = eh1.C(bn1Var4, jn1.f12802b);
                    if (eh1VarC.A() == 0) {
                        return tj1.a0((pj1) uk1.g.t((ii1) be1Var.f9661e), vl1.a(eh1VarC.B().y()), (Integer) be1Var.f9662f);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (ao1 unused4) {
                    throw new GeneralSecurityException("Parsing Ed25519PublicKey failed");
                }
            case 22:
                qd1 qd1Var4 = uk1.f17235a;
                String str4 = (String) be1Var.f9658b;
                if (!str4.equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str4)));
                }
                try {
                    bn1 bn1Var5 = (bn1) be1Var.f9660d;
                    jn1 jn1Var5 = jn1.f12801a;
                    int i13 = um1.f17262a;
                    ch1 ch1VarD = ch1.D(bn1Var5, jn1.f12802b);
                    if (ch1VarD.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    eh1 eh1VarC2 = ch1VarD.C();
                    if (eh1VarC2.A() == 0) {
                        return rj1.a0(tj1.a0((pj1) uk1.g.t((ii1) be1Var.f9661e), vl1.a(eh1VarC2.B().y()), (Integer) be1Var.f9662f), kh0.l(ch1VarD.B().y()));
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (ao1 unused5) {
                    throw new GeneralSecurityException("Parsing Ed25519PrivateKey failed");
                }
            case 26:
                qd1 qd1Var5 = yk1.f18788a;
                String str5 = (String) be1Var.f9658b;
                if (!str5.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: ".concat(String.valueOf(str5)));
                }
                try {
                    bn1 bn1Var6 = (bn1) be1Var.f9660d;
                    jn1 jn1Var6 = jn1.f12801a;
                    int i14 = um1.f17262a;
                    ri1 ri1VarE = ri1.E(bn1Var6, jn1.f12802b);
                    if (ri1VarE.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigInteger = new BigInteger(1, ri1VarE.C().y());
                    int iBitLength = bigInteger.bitLength();
                    BigInteger bigInteger2 = ck1.f10149e;
                    zj1 zj1Var = new zj1();
                    zj1Var.f19093c = (ak1) yk1.f18794h.t(ri1VarE.B().A());
                    zj1Var.f19092b = new BigInteger(1, ri1VarE.D().y());
                    zj1Var.a(iBitLength);
                    zj1Var.f19094d = (bk1) yk1.g.t((ii1) be1Var.f9661e);
                    ck1 ck1VarB = zj1Var.b();
                    av0 av0Var4 = new av0(11, false);
                    av0Var4.f9422b = ck1VarB;
                    av0Var4.f9423c = bigInteger;
                    av0Var4.f9424d = (Integer) be1Var.f9662f;
                    return av0Var4.v();
                } catch (ao1 | IllegalArgumentException unused6) {
                    throw new GeneralSecurityException("Parsing RsaSsaPkcs1PublicKey failed");
                }
            default:
                qd1 qd1Var6 = yk1.f18788a;
                String str6 = (String) be1Var.f9658b;
                if (!str6.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str6)));
                }
                try {
                    bn1 bn1Var7 = (bn1) be1Var.f9660d;
                    jn1 jn1Var7 = jn1.f12801a;
                    int i15 = um1.f17262a;
                    pi1 pi1VarI = pi1.I(bn1Var7, jn1.f12802b);
                    if (pi1VarI.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    ri1 ri1VarB = pi1VarI.B();
                    if (ri1VarB.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigInteger3 = new BigInteger(1, ri1VarB.C().y());
                    int iBitLength2 = bigInteger3.bitLength();
                    BigInteger bigInteger4 = new BigInteger(1, ri1VarB.D().y());
                    BigInteger bigInteger5 = ck1.f10149e;
                    zj1 zj1Var2 = new zj1();
                    zj1Var2.f19093c = (ak1) yk1.f18794h.t(ri1VarB.B().A());
                    zj1Var2.f19092b = bigInteger4;
                    zj1Var2.a(iBitLength2);
                    zj1Var2.f19094d = (bk1) yk1.g.t((ii1) be1Var.f9661e);
                    ck1 ck1VarB2 = zj1Var2.b();
                    av0 av0Var5 = new av0(11, false);
                    av0Var5.f9422b = ck1VarB2;
                    av0Var5.f9423c = bigInteger3;
                    av0Var5.f9424d = (Integer) be1Var.f9662f;
                    fk1 fk1VarV = av0Var5.v();
                    b7 b7Var = new b7(false);
                    b7Var.f9605a = fk1VarV;
                    ne0 ne0VarB = yk1.b(pi1VarI.D());
                    ne0 ne0VarB2 = yk1.b(pi1VarI.E());
                    b7Var.f9607c = ne0VarB;
                    b7Var.f9608d = ne0VarB2;
                    b7Var.f9606b = yk1.b(pi1VarI.C());
                    ne0 ne0VarB3 = yk1.b(pi1VarI.F());
                    ne0 ne0VarB4 = yk1.b(pi1VarI.G());
                    b7Var.f9609e = ne0VarB3;
                    b7Var.f9610f = ne0VarB4;
                    b7Var.g = yk1.b(pi1VarI.H());
                    return b7Var.h();
                } catch (ao1 | IllegalArgumentException unused7) {
                    throw new GeneralSecurityException("Parsing RsaSsaPkcs1PrivateKey failed");
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.rd1
    public ce1 i(s91 s91Var) throws GeneralSecurityException {
        switch (this.f10470a) {
            case 1:
                ue1 ue1Var = (ue1) s91Var;
                rt rtVar = ef1.f10777a;
                ph1 ph1VarE = qh1.E();
                ph1VarE.h("type.googleapis.com/google.crypto.tink.HmacKey");
                ih1 ih1VarE = jh1.E();
                kh1 kh1VarC = lh1.C();
                int i4 = ue1Var.f17193b;
                kh1VarC.b();
                ((lh1) kh1VarC.f14755b).F(i4);
                fh1 fh1Var = (fh1) ef1.f10778b.o(ue1Var.f17195d);
                kh1VarC.b();
                ((lh1) kh1VarC.f14755b).E(fh1Var);
                lh1 lh1Var = (lh1) kh1VarC.e();
                ih1VarE.b();
                ((jh1) ih1VarE.f14755b).G(lh1Var);
                int i10 = ue1Var.f17192a;
                ih1VarE.b();
                ((jh1) ih1VarE.f14755b).H(i10);
                ph1VarE.i(((jh1) ih1VarE.e()).a());
                ph1VarE.j((ii1) ef1.f10777a.o(ue1Var.f17194c));
                return ce1.e((qh1) ph1VarE.e());
            case 17:
                lj1 lj1Var = (lj1) s91Var;
                qd1 qd1Var = sk1.f16449a;
                ph1 ph1VarE2 = qh1.E();
                ph1VarE2.h("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
                sg1 sg1VarC = tg1.C();
                vg1 vg1VarE = sk1.e(lj1Var);
                sg1VarC.b();
                ((tg1) sg1VarC.f14755b).D(vg1VarE);
                ph1VarE2.i(((tg1) sg1VarC.e()).a());
                ph1VarE2.j(sk1.a(lj1Var.f13510d));
                return ce1.e((qh1) ph1VarE2.e());
            case 23:
                qd1 qd1Var2 = uk1.f17235a;
                ph1 ph1VarE3 = qh1.E();
                ph1VarE3.h("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
                ph1VarE3.i(ah1.C().a());
                ph1VarE3.j((ii1) uk1.g.o(((qj1) s91Var).f15352a));
                return ce1.e((qh1) ph1VarE3.e());
            default:
                ck1 ck1Var = (ck1) s91Var;
                qd1 qd1Var3 = yk1.f18788a;
                ph1 ph1VarE4 = qh1.E();
                ph1VarE4.h("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
                ki1 ki1VarE = li1.E();
                mi1 mi1VarB = ni1.B();
                fh1 fh1Var2 = (fh1) yk1.f18794h.o(ck1Var.f10153d);
                mi1VarB.b();
                ((ni1) mi1VarB.f14755b).D(fh1Var2);
                ni1 ni1Var = (ni1) mi1VarB.e();
                ki1VarE.b();
                ((li1) ki1VarE.f14755b).F(ni1Var);
                int i11 = ck1Var.f10150a;
                ki1VarE.b();
                ((li1) ki1VarE.f14755b).G(i11);
                byte[] bArrL = yr1.l(ck1Var.f10151b);
                zm1 zm1Var = bn1.f9729b;
                zm1 zm1VarV = bn1.v(0, bArrL.length, bArrL);
                ki1VarE.b();
                ((li1) ki1VarE.f14755b).H(zm1VarV);
                ph1VarE4.i(((li1) ki1VarE.e()).a());
                ph1VarE4.j((ii1) yk1.g.o(ck1Var.f10152c));
                return ce1.e((qh1) ph1VarE4.e());
        }
    }

    @Override // com.google.android.gms.internal.ads.wd1, com.google.android.gms.internal.ads.xc1
    public Object a(al0 al0Var) throws GeneralSecurityException {
        KeyFactory keyFactory;
        KeyFactory keyFactory2;
        KeyFactory keyFactory3;
        u91 u91VarB;
        int i4 = this.f10470a;
        ii1 ii1Var = ii1.LEGACY;
        switch (i4) {
            case 2:
                mj1 mj1Var = (mj1) al0Var;
                Provider providerC = a80.c();
                ol1 ol1Var = (ol1) tk1.f16861i.o(mj1Var.f13914c.f14304c.f13509c);
                rt rtVar = tk1.j;
                nj1 nj1Var = mj1Var.f13914c;
                ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec((BigInteger) mj1Var.f13915d.f14280b, al0.w((il1) tk1.f16862k.o(nj1Var.f14304c.f13508b)));
                if (providerC != null) {
                    keyFactory = KeyFactory.getInstance("EC", providerC);
                } else {
                    keyFactory = (KeyFactory) ml1.g.f13943a.g("EC");
                }
                nj1Var.f14306e.b();
                vk1 vk1Var = new vk1();
                if (al0.q(2)) {
                    al0.y(ol1Var);
                    ol1Var.toString().concat("withECDSA");
                    return vk1Var;
                }
                throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
            case 3:
                nj1 nj1Var2 = (nj1) al0Var;
                byte[] bArr = tk1.g;
                Provider providerC2 = a80.c();
                rt rtVar2 = tk1.f16862k;
                lj1 lj1Var = nj1Var2.f14304c;
                ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(nj1Var2.f14305d, al0.w((il1) rtVar2.o(lj1Var.f13508b)));
                if (providerC2 != null) {
                    keyFactory2 = KeyFactory.getInstance("EC", providerC2);
                } else {
                    keyFactory2 = (KeyFactory) ml1.g.f13943a.g("EC");
                }
                return new tk1((ECPublicKey) keyFactory2.generatePublic(eCPublicKeySpec), (ol1) tk1.f16861i.o(lj1Var.f13509c), (jl1) tk1.j.o(lj1Var.f13507a), nj1Var2.f14306e.b(), lj1Var.f13510d.equals(m91.f13822t) ? tk1.f16860h : tk1.g, providerC2);
            case 4:
                rj1 rj1Var = (rj1) al0Var;
                if (al0.q(1)) {
                    try {
                        return vk1.a(rj1Var);
                    } catch (GeneralSecurityException unused) {
                        kh0 kh0Var = rj1Var.f15668d;
                        tj1 tj1Var = rj1Var.f15667c;
                        byte[] bArrB = ((vl1) kh0Var.f13160b).b();
                        tj1Var.f16832e.b();
                        vk1 vk1Var2 = new vk1();
                        if (al0.q(1)) {
                            if (bArrB.length == 32) {
                                nn1.g(nn1.m(bArrB));
                                return vk1Var2;
                            }
                            throw new IllegalArgumentException("Given private key's length is not 32");
                        }
                        throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
                    }
                }
                throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
            case 5:
                tj1 tj1Var2 = (tj1) al0Var;
                if (al0.q(1)) {
                    try {
                        return wk1.b(tj1Var2);
                    } catch (GeneralSecurityException unused2) {
                        return new xk1(tj1Var2.f16831d.b(), tj1Var2.f16832e.b(), tj1Var2.f16830c.f15352a.equals(pj1.f15021d) ? new byte[]{0} : new byte[0]);
                    }
                }
                throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
            case 6:
                be1 be1Var = ((cd1) al0Var).f10087c;
                int i10 = ad1.f9308b[i3.e.c(be1Var.f9657a)];
                xk1.b(be1Var);
                ((ii1) be1Var.f9661e).equals(ii1Var);
                return new vk1();
            case 7:
                be1 be1Var2 = ((cd1) al0Var).f10087c;
                int i11 = ad1.f9308b[i3.e.c(be1Var2.f9657a)];
                return new xk1((u91) tc1.f16783d.b(u91.class, (String) be1Var2.f9658b).a((bn1) be1Var2.f9660d), xk1.b(be1Var2), ((ii1) be1Var2.f9661e).equals(ii1Var) ? new byte[]{0} : new byte[0]);
            case 8:
                ek1 ek1Var = (ek1) al0Var;
                int i12 = je1.f12739a;
                if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
                    (!Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT)).getClass();
                }
                Provider providerC3 = a80.c();
                if (providerC3 != null) {
                    keyFactory3 = KeyFactory.getInstance("RSA", providerC3);
                } else {
                    keyFactory3 = (KeyFactory) ml1.g.f13943a.g("RSA");
                }
                fk1 fk1Var = ek1Var.f10807c;
                BigInteger bigInteger = fk1Var.f11196d;
                ck1 ck1Var = fk1Var.f11195c;
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory3.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger, ck1Var.f10151b, (BigInteger) ek1Var.f10808d.f14280b, (BigInteger) ek1Var.f10809e.f14280b, (BigInteger) ek1Var.f10810f.f14280b, (BigInteger) ek1Var.g.f14280b, (BigInteger) ek1Var.f10811h.f14280b, (BigInteger) ek1Var.f10812i.f14280b));
                if (providerC3 != null) {
                    u91VarB = al1.c(fk1Var, providerC3);
                } else {
                    u91VarB = rl1.b(fk1Var);
                }
                zk1 zk1Var = new zk1(rSAPrivateCrtKey, ck1Var.f10153d, fk1Var.f11197e.b(), ck1Var.f10152c.equals(bk1.f9706d) ? zk1.f19102h : zk1.g, u91VarB, providerC3);
                String str = zk1Var.f19105b;
                Provider provider = zk1Var.f19109f;
                Signature signature = provider != null ? Signature.getInstance(str, provider) : (Signature) ml1.f13940d.f13943a.g(str);
                signature.initSign(zk1Var.f19104a);
                byte[] bArr2 = zk1.f19103i;
                signature.update(bArr2);
                byte[] bArr3 = zk1Var.f19107d;
                if (bArr3.length > 0) {
                    signature.update(bArr3);
                }
                byte[] bArrSign = signature.sign();
                byte[] bArr4 = zk1Var.f19106c;
                if (bArr4.length > 0) {
                    bArrSign = mq0.q(bArr4, bArrSign);
                }
                try {
                    zk1Var.f19108e.a(bArrSign, bArr2);
                    return zk1Var;
                } catch (GeneralSecurityException e2) {
                    throw new IllegalStateException("RSA signature computation error", e2);
                }
            case 9:
                return rl1.b((fk1) al0Var);
            case 10:
                lk1 lk1Var = (lk1) al0Var;
                try {
                    return vk1.b(lk1Var);
                } catch (NoSuchProviderException unused3) {
                    KeyFactory keyFactory4 = (KeyFactory) ml1.g.f13943a.g("RSA");
                    mk1 mk1Var = lk1Var.f13513c;
                    mk1 mk1Var2 = lk1Var.f13513c;
                    BigInteger bigInteger2 = mk1Var.f13927d;
                    kk1 kk1Var = mk1Var2.f13926c;
                    kk1 kk1Var2 = mk1Var2.f13926c;
                    RSAPrivateCrtKey rSAPrivateCrtKey2 = (RSAPrivateCrtKey) keyFactory4.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger2, kk1Var.f13184b, (BigInteger) lk1Var.f13514d.f14280b, (BigInteger) lk1Var.f13515e.f14280b, (BigInteger) lk1Var.f13516f.f14280b, (BigInteger) lk1Var.g.f14280b, (BigInteger) lk1Var.f13517h.f14280b, (BigInteger) lk1Var.f13518i.f14280b));
                    rt rtVar3 = ul1.f17257a;
                    ol1 ol1Var2 = (ol1) rtVar3.o(kk1Var2.f13186d);
                    ol1 ol1Var3 = (ol1) rtVar3.o(kk1Var2.f13187e);
                    mk1Var2.f13928e.b();
                    vk1 vk1Var3 = new vk1();
                    if (!jc1.a()) {
                        al0.y(ol1Var2);
                        if (ol1Var2.equals(ol1Var3)) {
                            al0.D(rSAPrivateCrtKey2.getModulus().bitLength());
                            al0.I(rSAPrivateCrtKey2.getPublicExponent());
                            return vk1Var3;
                        }
                        throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
                    }
                    throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
                }
            default:
                mk1 mk1Var3 = (mk1) al0Var;
                rt rtVar4 = ul1.f17257a;
                try {
                    return el1.d(mk1Var3);
                } catch (NoSuchProviderException unused4) {
                    KeyFactory keyFactory5 = (KeyFactory) ml1.g.f13943a.g("RSA");
                    BigInteger bigInteger3 = mk1Var3.f13927d;
                    kk1 kk1Var3 = mk1Var3.f13926c;
                    RSAPublicKey rSAPublicKey = (RSAPublicKey) keyFactory5.generatePublic(new RSAPublicKeySpec(bigInteger3, kk1Var3.f13184b));
                    rt rtVar5 = ul1.f17257a;
                    return new sl1(rSAPublicKey, (ol1) rtVar5.o(kk1Var3.f13186d), (ol1) rtVar5.o(kk1Var3.f13187e), kk1Var3.f13188f, mk1Var3.f13928e.b(), kk1Var3.f13185c.equals(jk1.f12772d) ? ul1.f17259c : ul1.f17258b);
                }
        }
    }
}

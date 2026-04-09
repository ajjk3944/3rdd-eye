package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.RSAKeyGenParameterSpec;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ga1 implements sc1 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ga1 f11436b = new ga1(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ga1 f11437c = new ga1(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ga1 f11438d = new ga1(2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ga1 f11439e = new ga1(3);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ga1 f11440f = new ga1(4);
    public static final /* synthetic */ ga1 g = new ga1(5);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ga1 f11441h = new ga1(6);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ ga1 f11442i = new ga1(7);
    public static final /* synthetic */ ga1 j = new ga1(8);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ ga1 f11443k = new ga1(9);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ ga1 f11444l = new ga1(10);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ ga1 f11445m = new ga1(11);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ ga1 f11446n = new ga1(12);

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ ga1 f11447o = new ga1(13);

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ ga1 f11448p = new ga1(14);

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ ga1 f11449q = new ga1(15);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11450a;

    public /* synthetic */ ga1(int i4) {
        this.f11450a = i4;
    }

    @Override // com.google.android.gms.internal.ads.sc1
    public final al0 a(s91 s91Var, Integer num) throws GeneralSecurityException {
        boolean z3 = false;
        switch (this.f11450a) {
            case 0:
                la1 la1Var = (la1) s91Var;
                vd1 vd1Var = ia1.f12184a;
                int i4 = la1Var.f13434a;
                if (i4 != 16 && i4 != 32) {
                    throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
                }
                aw awVar = new aw(29);
                awVar.f9451b = la1Var;
                awVar.f9454e = num;
                awVar.f9452c = kh0.t(i4);
                awVar.f9453d = kh0.t(la1Var.f13435b);
                return awVar.x();
            case 1:
                pa1 pa1Var = (pa1) s91Var;
                vd1 vd1Var2 = na1.f14197a;
                int i10 = pa1Var.f14951a;
                if (i10 == 24) {
                    throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
                }
                av0 av0Var = new av0(3, z3);
                av0Var.f9422b = pa1Var;
                av0Var.f9424d = num;
                av0Var.f9423c = kh0.t(i10);
                return av0Var.o();
            case 2:
                sa1 sa1Var = (sa1) s91Var;
                vd1 vd1Var3 = ra1.f15604a;
                int i11 = sa1Var.f15940a;
                if (i11 == 24) {
                    throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
                }
                av0 av0Var2 = new av0(4, z3);
                av0Var2.f9422b = sa1Var;
                av0Var2.f9424d = num;
                av0Var2.f9423c = kh0.t(i11);
                return av0Var2.p();
            case 3:
                va1 va1Var = (va1) s91Var;
                vd1 vd1Var4 = ua1.f17137a;
                av0 av0Var3 = new av0(5, z3);
                av0Var3.f9422b = va1Var;
                av0Var3.f9424d = num;
                av0Var3.f9423c = kh0.t(va1Var.f17575a);
                return av0Var3.q();
            case 4:
                vd1 vd1Var5 = xa1.f18338a;
                return wa1.a0(((ya1) s91Var).f18692a, kh0.t(32), num);
            case 5:
                vd1 vd1Var6 = za1.f19050a;
                return bb1.a0((cb1) s91Var, num);
            case 6:
                zc1 zc1Var = ab1.f9296a;
                return eb1.a0((fb1) s91Var, num);
            case 7:
                return jb1.a0((lb1) s91Var, kh0.t(32), num);
            case 8:
                vd1 vd1Var7 = nb1.f14237a;
                return mb1.a0(((ob1) s91Var).f14655a, kh0.t(32), num);
            case 9:
                fd1 fd1Var = fd1.f11109b;
                qh1 qh1Var = (qh1) ((dd1) s91Var).f10436a.f10095c;
                tc1 tc1Var = tc1.f16783d;
                zc1 zc1VarD = tc1Var.d(qh1Var.A());
                if (!((Boolean) tc1Var.f16785b.get(qh1Var.A())).booleanValue()) {
                    throw new GeneralSecurityException("Creating new keys is not allowed.");
                }
                bn1 bn1VarB = qh1Var.B();
                zc1VarD.getClass();
                ph1 ph1VarE = qh1.E();
                ph1VarE.h(zc1VarD.f19058a);
                ph1VarE.i(bn1VarB);
                ph1VarE.j(ii1.RAW);
                qh1 qh1Var2 = (qh1) ph1VarE.e();
                ce1 ce1Var = new ce1(0, qh1Var2, je1.b(qh1Var2.A()));
                md1 md1Var = md1.f13875b;
                be1 be1Var = (be1) md1Var.f(fd1.f11109b.b(md1Var.g(ce1Var), null));
                nh1 nh1VarD = oh1.D();
                String str = (String) be1Var.f9658b;
                nh1VarD.b();
                ((oh1) nh1VarD.f14755b).F(str);
                bn1 bn1Var = (bn1) be1Var.f9660d;
                nh1VarD.b();
                ((oh1) nh1VarD.f14755b).G(bn1Var);
                int i12 = be1Var.f9657a;
                nh1VarD.b();
                ((oh1) nh1VarD.f14755b).H(i12);
                oh1 oh1Var = (oh1) nh1VarD.e();
                return new cd1(be1.I(oh1Var.A(), oh1Var.B(), oh1Var.C(), qh1Var.C(), num));
            case 10:
                me1 me1Var = (me1) s91Var;
                vd1 vd1Var8 = le1.f13470a;
                int i13 = me1Var.f13881a;
                if (i13 != 32) {
                    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
                }
                av0 av0Var4 = new av0(7, z3);
                av0Var4.f9422b = me1Var;
                av0Var4.f9423c = kh0.t(i13);
                av0Var4.f9424d = num;
                return av0Var4.r();
            case 11:
                ue1 ue1Var = (ue1) s91Var;
                vd1 vd1Var9 = re1.f15632a;
                av0 av0Var5 = new av0(9, z3);
                av0Var5.f9422b = ue1Var;
                av0Var5.f9423c = kh0.t(ue1Var.f17192a);
                av0Var5.f9424d = num;
                return av0Var5.t();
            case 12:
                lj1 lj1Var = (lj1) s91Var;
                vd1 vd1Var10 = oj1.f14707a;
                ECParameterSpec eCParameterSpec = lj1Var.f13508b.f13176b;
                KeyPairGenerator keyPairGenerator = (KeyPairGenerator) ml1.f13942f.f13943a.g("EC");
                keyPairGenerator.initialize(eCParameterSpec);
                KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
                ECPublicKey eCPublicKey = (ECPublicKey) keyPairGenerateKeyPair.getPublic();
                ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairGenerateKeyPair.getPrivate();
                av0 av0Var6 = new av0(10, z3);
                av0Var6.f9422b = lj1Var;
                av0Var6.f9424d = num;
                av0Var6.f9423c = eCPublicKey.getW();
                nj1 nj1VarU = av0Var6.u();
                l90 l90Var = new l90(24);
                l90Var.f13426b = nj1VarU;
                l90Var.f13427c = new ne0(24, eCPrivateKey.getS());
                return l90Var.v();
            case 13:
                qj1 qj1Var = (qj1) s91Var;
                vd1 vd1Var11 = sj1.f16027a;
                byte[] bArrA = de1.a(32);
                if (bArrA.length != 32) {
                    throw new IllegalArgumentException("Given secret seed length is not 32");
                }
                return rj1.a0(tj1.a0(qj1Var.f15352a, vl1.a(Arrays.copyOf(nn1.g(nn1.m(bArrA)), 32)), num), new kh0(16, vl1.a(Arrays.copyOf(bArrA, bArrA.length))));
            case 14:
                ck1 ck1Var = (ck1) s91Var;
                vd1 vd1Var12 = gk1.f11536a;
                KeyPairGenerator keyPairGenerator2 = (KeyPairGenerator) ml1.f13942f.f13943a.g("RSA");
                keyPairGenerator2.initialize(new RSAKeyGenParameterSpec(ck1Var.f10150a, new BigInteger(1, ck1Var.f10151b.toByteArray())));
                KeyPair keyPairGenerateKeyPair2 = keyPairGenerator2.generateKeyPair();
                RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPairGenerateKeyPair2.getPublic();
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyPairGenerateKeyPair2.getPrivate();
                av0 av0Var7 = new av0(11, z3);
                av0Var7.f9422b = ck1Var;
                av0Var7.f9423c = rSAPublicKey.getModulus();
                av0Var7.f9424d = num;
                fk1 fk1VarV = av0Var7.v();
                b7 b7Var = new b7(false);
                b7Var.f9605a = fk1VarV;
                ne0 ne0Var = new ne0(24, rSAPrivateCrtKey.getPrimeP());
                ne0 ne0Var2 = new ne0(24, rSAPrivateCrtKey.getPrimeQ());
                b7Var.f9607c = ne0Var;
                b7Var.f9608d = ne0Var2;
                b7Var.f9606b = new ne0(24, rSAPrivateCrtKey.getPrivateExponent());
                ne0 ne0Var3 = new ne0(24, rSAPrivateCrtKey.getPrimeExponentP());
                ne0 ne0Var4 = new ne0(24, rSAPrivateCrtKey.getPrimeExponentQ());
                b7Var.f9609e = ne0Var3;
                b7Var.f9610f = ne0Var4;
                b7Var.g = new ne0(24, rSAPrivateCrtKey.getCrtCoefficient());
                return b7Var.h();
            default:
                kk1 kk1Var = (kk1) s91Var;
                vd1 vd1Var13 = nk1.f14315a;
                KeyPairGenerator keyPairGenerator3 = (KeyPairGenerator) ml1.f13942f.f13943a.g("RSA");
                keyPairGenerator3.initialize(new RSAKeyGenParameterSpec(kk1Var.f13183a, new BigInteger(1, kk1Var.f13184b.toByteArray())));
                KeyPair keyPairGenerateKeyPair3 = keyPairGenerator3.generateKeyPair();
                RSAPublicKey rSAPublicKey2 = (RSAPublicKey) keyPairGenerateKeyPair3.getPublic();
                RSAPrivateCrtKey rSAPrivateCrtKey2 = (RSAPrivateCrtKey) keyPairGenerateKeyPair3.getPrivate();
                av0 av0Var8 = new av0(12, z3);
                av0Var8.f9422b = kk1Var;
                av0Var8.f9423c = rSAPublicKey2.getModulus();
                av0Var8.f9424d = num;
                mk1 mk1VarW = av0Var8.w();
                b7 b7Var2 = new b7(false);
                b7Var2.f9605a = mk1VarW;
                ne0 ne0Var5 = new ne0(24, rSAPrivateCrtKey2.getPrimeP());
                ne0 ne0Var6 = new ne0(24, rSAPrivateCrtKey2.getPrimeQ());
                b7Var2.f9607c = ne0Var5;
                b7Var2.f9608d = ne0Var6;
                b7Var2.f9606b = new ne0(24, rSAPrivateCrtKey2.getPrivateExponent());
                ne0 ne0Var7 = new ne0(24, rSAPrivateCrtKey2.getPrimeExponentP());
                ne0 ne0Var8 = new ne0(24, rSAPrivateCrtKey2.getPrimeExponentQ());
                b7Var2.f9609e = ne0Var7;
                b7Var2.f9610f = ne0Var8;
                b7Var2.g = new ne0(24, rSAPrivateCrtKey2.getCrtCoefficient());
                return b7Var2.i();
        }
    }
}

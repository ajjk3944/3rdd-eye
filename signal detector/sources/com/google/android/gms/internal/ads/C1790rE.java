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

/* renamed from: com.google.android.gms.internal.ads.rE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1790rE implements FF {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1790rE f16486b = new C1790rE(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C1790rE f16487c = new C1790rE(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ C1790rE f16488d = new C1790rE(2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ C1790rE f16489e = new C1790rE(3);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ C1790rE f16490f = new C1790rE(4);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ C1790rE f16491g = new C1790rE(5);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ C1790rE f16492h = new C1790rE(6);
    public static final /* synthetic */ C1790rE i = new C1790rE(7);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ C1790rE f16493j = new C1790rE(8);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ C1790rE f16494k = new C1790rE(9);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ C1790rE f16495l = new C1790rE(10);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ C1790rE f16496m = new C1790rE(11);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ C1790rE f16497n = new C1790rE(12);

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ C1790rE f16498o = new C1790rE(13);

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ C1790rE f16499p = new C1790rE(14);

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ C1790rE f16500q = new C1790rE(15);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16501a;

    public /* synthetic */ C1790rE(int i3) {
        this.f16501a = i3;
    }

    @Override // com.google.android.gms.internal.ads.FF
    public final Cr a(AbstractC1089eE abstractC1089eE, Integer num) throws GeneralSecurityException {
        int i3 = 9;
        int i6 = 5;
        boolean z6 = false;
        switch (this.f16501a) {
            case 0:
                C2060wE c2060wE = (C2060wE) abstractC1089eE;
                C1309iG c1309iG = AbstractC1898tE.f16881a;
                int i7 = c2060wE.f17409a;
                if (i7 != 16 && i7 != 32) {
                    throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
                }
                C1431kf c1431kf = new C1431kf(29);
                c1431kf.f15173b = c2060wE;
                c1431kf.f15176e = num;
                c1431kf.f15174c = C1448kw.i(i7);
                c1431kf.f15175d = C1448kw.i(c2060wE.f17410b);
                return c1431kf.y();
            case 1:
                BE be = (BE) abstractC1089eE;
                C1309iG c1309iG2 = AbstractC2168yE.f17697a;
                int i8 = be.f7319a;
                if (i8 == 24) {
                    throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
                }
                C2041vw c2041vw = new C2041vw(3, z6);
                c2041vw.f17369b = be;
                c2041vw.f17371d = num;
                c2041vw.f17370c = C1448kw.i(i8);
                return c2041vw.l();
            case 2:
                EE ee = (EE) abstractC1089eE;
                C1309iG c1309iG3 = DE.f7736a;
                int i9 = ee.f7931a;
                if (i9 == 24) {
                    throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
                }
                C2041vw c2041vw2 = new C2041vw(4, z6);
                c2041vw2.f17369b = ee;
                c2041vw2.f17371d = num;
                c2041vw2.f17370c = C1448kw.i(i9);
                return c2041vw2.p();
            case 3:
                HE he = (HE) abstractC1089eE;
                C1309iG c1309iG4 = GE.f8337a;
                C2041vw c2041vw3 = new C2041vw(i6, z6);
                c2041vw3.f17369b = he;
                c2041vw3.f17371d = num;
                c2041vw3.f17370c = C1448kw.i(he.f8878a);
                return c2041vw3.q();
            case 4:
                C1309iG c1309iG5 = JE.f9267a;
                return IE.X(((KE) abstractC1089eE).f9474a, C1448kw.i(32), num);
            case 5:
                C1309iG c1309iG6 = LE.f9641a;
                return OE.X((PE) abstractC1089eE, num);
            case 6:
                MF mf = NE.f9978a;
                return RE.X((SE) abstractC1089eE, num);
            case 7:
                return WE.X((YE) abstractC1089eE, C1448kw.i(32), num);
            case 8:
                C1309iG c1309iG7 = AbstractC0872aF.f13085a;
                return ZE.X(((C0927bF) abstractC1089eE).f13336a, C1448kw.i(32), num);
            case 9:
                SF sf = SF.f11162b;
                C0984cI c0984cI = ((QF) abstractC1089eE).f10594a.f16155b;
                GF gf = GF.f8340d;
                MF mfD = gf.d(c0984cI.A());
                if (!((Boolean) gf.f8342b.get(c0984cI.A())).booleanValue()) {
                    throw new GeneralSecurityException("Creating new keys is not allowed.");
                }
                QK qkB = c0984cI.B();
                mfD.getClass();
                C0930bI c0930bIE = C0984cI.E();
                c0930bIE.g(mfD.f9853a);
                c0930bIE.h(qkB);
                c0930bIE.i(EnumC1956uI.RAW);
                C0984cI c0984cI2 = (C0984cI) c0930bIE.d();
                C1685pG c1685pG = new C1685pG(c0984cI2, AbstractC2062wG.b(c0984cI2.A()));
                ZF zf = ZF.f12810b;
                C1631oG c1631oG = (C1631oG) zf.f(SF.f11162b.b(zf.g(c1685pG), null));
                ZH zhD = C0875aI.D();
                String str = c1631oG.f15922a;
                zhD.b();
                ((C0875aI) zhD.f13551b).F(str);
                QK qk = c1631oG.f15924c;
                zhD.b();
                ((C0875aI) zhD.f13551b).G(qk);
                int i10 = c1631oG.f15925d;
                zhD.b();
                ((C0875aI) zhD.f13551b).H(i10);
                C0875aI c0875aI = (C0875aI) zhD.d();
                return new PF(C1631oG.a(c0875aI.A(), c0875aI.B(), c0875aI.C(), c0984cI.C(), num));
            case 10:
                C2224zG c2224zG = (C2224zG) abstractC1089eE;
                C1309iG c1309iG8 = AbstractC2170yG.f17701a;
                int i11 = c2224zG.f17850a;
                if (i11 != 32) {
                    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
                }
                C2041vw c2041vw4 = new C2041vw(7, z6);
                c2041vw4.f17369b = c2224zG;
                c2041vw4.f17370c = C1448kw.i(i11);
                c2041vw4.f17371d = num;
                return c2041vw4.r();
            case 11:
                HG hg = (HG) abstractC1089eE;
                C1309iG c1309iG9 = EG.f7934a;
                C2041vw c2041vw5 = new C2041vw(i3, z6);
                c2041vw5.f17369b = hg;
                c2041vw5.f17370c = C1448kw.i(hg.f8882a);
                c2041vw5.f17371d = num;
                return c2041vw5.t();
            case 12:
                XI xi = (XI) abstractC1089eE;
                C1309iG c1309iG10 = AbstractC0876aJ.f13094a;
                ECParameterSpec eCParameterSpec = xi.f12409b.f12200b;
                KeyPairGenerator keyPairGenerator = (KeyPairGenerator) YJ.f12630f.f12632a.c("EC");
                keyPairGenerator.initialize(eCParameterSpec);
                KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
                ECPublicKey eCPublicKey = (ECPublicKey) keyPairGenerateKeyPair.getPublic();
                ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairGenerateKeyPair.getPrivate();
                C2041vw c2041vw6 = new C2041vw(10, z6);
                c2041vw6.f17369b = xi;
                c2041vw6.f17371d = num;
                c2041vw6.f17370c = eCPublicKey.getW();
                ZI ziU = c2041vw6.u();
                Vu vu = new Vu(9);
                vu.f12105a = ziU;
                vu.f12106b = new Wu(6, eCPrivateKey.getS());
                return vu.F();
            case 13:
                C0985cJ c0985cJ = (C0985cJ) abstractC1089eE;
                C1309iG c1309iG11 = AbstractC1094eJ.f13883a;
                byte[] bArrA = AbstractC1739qG.a(32);
                if (bArrA.length != 32) {
                    throw new IllegalArgumentException("Given secret seed length is not 32");
                }
                return C1040dJ.X(C1149fJ.X(c0985cJ.f13548a, C1313iK.a(Arrays.copyOf(AbstractC0933bL.j(AbstractC0933bL.p(bArrA)), 32)), num), new C1448kw(5, C1313iK.a(Arrays.copyOf(bArrA, bArrA.length))));
            case 14:
                C1688pJ c1688pJ = (C1688pJ) abstractC1089eE;
                C1309iG c1309iG12 = AbstractC1903tJ.f16892a;
                KeyPairGenerator keyPairGenerator2 = (KeyPairGenerator) YJ.f12630f.f12632a.c("RSA");
                keyPairGenerator2.initialize(new RSAKeyGenParameterSpec(c1688pJ.f16157a, new BigInteger(1, c1688pJ.f16158b.toByteArray())));
                KeyPair keyPairGenerateKeyPair2 = keyPairGenerator2.generateKeyPair();
                RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPairGenerateKeyPair2.getPublic();
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyPairGenerateKeyPair2.getPrivate();
                C2041vw c2041vw7 = new C2041vw(11, z6);
                c2041vw7.f17369b = c1688pJ;
                c2041vw7.f17370c = rSAPublicKey.getModulus();
                c2041vw7.f17371d = num;
                C1849sJ c1849sJV = c2041vw7.v();
                C0969c3 c0969c3 = new C0969c3(false);
                c0969c3.f13520a = c1849sJV;
                Wu wu = new Wu(6, rSAPrivateCrtKey.getPrimeP());
                Wu wu2 = new Wu(6, rSAPrivateCrtKey.getPrimeQ());
                c0969c3.f13522c = wu;
                c0969c3.f13523d = wu2;
                c0969c3.f13521b = new Wu(6, rSAPrivateCrtKey.getPrivateExponent());
                Wu wu3 = new Wu(6, rSAPrivateCrtKey.getPrimeExponentP());
                Wu wu4 = new Wu(6, rSAPrivateCrtKey.getPrimeExponentQ());
                c0969c3.f13524e = wu3;
                c0969c3.f13525f = wu4;
                c0969c3.f13526g = new Wu(6, rSAPrivateCrtKey.getCrtCoefficient());
                return c0969c3.g();
            default:
                C2119xJ c2119xJ = (C2119xJ) abstractC1089eE;
                C1309iG c1309iG13 = AJ.f6973a;
                KeyPairGenerator keyPairGenerator3 = (KeyPairGenerator) YJ.f12630f.f12632a.c("RSA");
                keyPairGenerator3.initialize(new RSAKeyGenParameterSpec(c2119xJ.f17570a, new BigInteger(1, c2119xJ.f17571b.toByteArray())));
                KeyPair keyPairGenerateKeyPair3 = keyPairGenerator3.generateKeyPair();
                RSAPublicKey rSAPublicKey2 = (RSAPublicKey) keyPairGenerateKeyPair3.getPublic();
                RSAPrivateCrtKey rSAPrivateCrtKey2 = (RSAPrivateCrtKey) keyPairGenerateKeyPair3.getPrivate();
                C2041vw c2041vw8 = new C2041vw(12, z6);
                c2041vw8.f17369b = c2119xJ;
                c2041vw8.f17370c = rSAPublicKey2.getModulus();
                c2041vw8.f17371d = num;
                C2227zJ c2227zJW = c2041vw8.w();
                C0969c3 c0969c32 = new C0969c3(false);
                c0969c32.f13520a = c2227zJW;
                Wu wu5 = new Wu(6, rSAPrivateCrtKey2.getPrimeP());
                Wu wu6 = new Wu(6, rSAPrivateCrtKey2.getPrimeQ());
                c0969c32.f13522c = wu5;
                c0969c32.f13523d = wu6;
                c0969c32.f13521b = new Wu(6, rSAPrivateCrtKey2.getPrivateExponent());
                Wu wu7 = new Wu(6, rSAPrivateCrtKey2.getPrimeExponentP());
                Wu wu8 = new Wu(6, rSAPrivateCrtKey2.getPrimeExponentQ());
                c0969c32.f13524e = wu7;
                c0969c32.f13525f = wu8;
                c0969c32.f13526g = new Wu(6, rSAPrivateCrtKey2.getCrtCoefficient());
                return c0969c32.i();
        }
    }
}

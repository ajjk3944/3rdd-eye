package com.google.android.gms.internal.ads;

import android.os.Build;
import j$.util.Objects;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;
import javax.crypto.Cipher;
import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.iJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1312iJ implements InterfaceC1361jG, InterfaceC0982cG, KF, IF, InterfaceC1091eG, InterfaceC0877aK {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14719a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1312iJ f14707b = new C1312iJ(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C1312iJ f14708c = new C1312iJ(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ C1312iJ f14709d = new C1312iJ(2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ C1312iJ f14710e = new C1312iJ(3);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ C1312iJ f14711f = new C1312iJ(4);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ C1312iJ f14712g = new C1312iJ(5);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ C1312iJ f14713h = new C1312iJ(6);
    public static final /* synthetic */ C1312iJ i = new C1312iJ(7);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ C1312iJ f14714j = new C1312iJ(8);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ C1312iJ f14715k = new C1312iJ(9);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ C1312iJ f14716l = new C1312iJ(10);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ C1312iJ f14717m = new C1312iJ(11);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ C1312iJ f14718n = new C1312iJ(12);

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ C1312iJ f14692C = new C1312iJ(13);

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ C1312iJ f14693D = new C1312iJ(14);

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ C1312iJ f14694E = new C1312iJ(15);

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ C1312iJ f14695F = new C1312iJ(16);

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ C1312iJ f14696G = new C1312iJ(17);

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ C1312iJ f14697H = new C1312iJ(18);

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ C1312iJ f14698I = new C1312iJ(19);

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ C1312iJ f14699J = new C1312iJ(20);

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ C1312iJ f14700K = new C1312iJ(21);

    /* renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ C1312iJ f14701L = new C1312iJ(22);
    public static final /* synthetic */ C1312iJ M = new C1312iJ(23);

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ C1312iJ f14702N = new C1312iJ(24);

    /* renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ C1312iJ f14703O = new C1312iJ(25);

    /* renamed from: P, reason: collision with root package name */
    public static final /* synthetic */ C1312iJ f14704P = new C1312iJ(26);

    /* renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ C1312iJ f14705Q = new C1312iJ(27);

    /* renamed from: R, reason: collision with root package name */
    public static final /* synthetic */ C1312iJ f14706R = new C1312iJ(28);

    public /* synthetic */ C1312iJ(int i3) {
        this.f14719a = i3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0982cG
    public AbstractC1089eE a(C1685pG c1685pG) throws GeneralSecurityException {
        switch (this.f14719a) {
            case 5:
                C1037dG c1037dG = FJ.f8081a;
                C0984cI c0984cI = c1685pG.f16155b;
                if (!c0984cI.A().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parseParameters: ".concat(String.valueOf(c0984cI.A())));
                }
                try {
                    QK qkB = c0984cI.B();
                    XK xk = XK.f12412a;
                    int i3 = JK.f9277a;
                    FH fhB = FH.B(qkB, XK.f12413b);
                    C2222zE c2222zE = new C2222zE(4);
                    c2222zE.f17840d = FJ.b(fhB.A().A());
                    c2222zE.f17838b = FJ.h(fhB.A().F());
                    c2222zE.f17839c = FJ.g(fhB.A().E());
                    c2222zE.f17841e = FJ.c(c0984cI.C());
                    return c2222zE.m();
                } catch (C1636oL e6) {
                    throw new GeneralSecurityException("Parsing EcdsaParameters failed: ", e6);
                }
            case 11:
                C1037dG c1037dG2 = HJ.f8886a;
                C0984cI c0984cI2 = c1685pG.f16155b;
                if (!c0984cI2.A().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parseParameters: ".concat(String.valueOf(c0984cI2.A())));
                }
                try {
                    QK qkB2 = c0984cI2.B();
                    XK xk2 = XK.f12412a;
                    int i6 = JK.f9277a;
                    if (MH.B(qkB2, XK.f12413b).A() == 0) {
                        return new C0985cJ((C0931bJ) HJ.f8892g.H(c0984cI2.C()));
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (C1636oL e7) {
                    throw new GeneralSecurityException("Parsing Ed25519Parameters failed: ", e7);
                }
            case 17:
                C1037dG c1037dG3 = LJ.f9644a;
                C0984cI c0984cI3 = c1685pG.f16155b;
                if (!c0984cI3.A().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: ".concat(String.valueOf(c0984cI3.A())));
                }
                try {
                    QK qkB3 = c0984cI3.B();
                    XK xk3 = XK.f12412a;
                    int i7 = JK.f9277a;
                    C2118xI c2118xID = C2118xI.D(qkB3, XK.f12413b);
                    BigInteger bigInteger = C1688pJ.f16156e;
                    C1526mJ c1526mJ = new C1526mJ();
                    c1526mJ.f15608c = (C1580nJ) LJ.f9651h.H(c2118xID.A().A());
                    c1526mJ.f15607b = new BigInteger(1, c2118xID.C().u());
                    c1526mJ.a(c2118xID.B());
                    c1526mJ.f15609d = (C1634oJ) LJ.f9650g.H(c0984cI3.C());
                    return c1526mJ.b();
                } catch (C1636oL e8) {
                    throw new GeneralSecurityException("Parsing RsaSsaPkcs1Parameters failed: ", e8);
                }
            default:
                C1037dG c1037dG4 = PJ.f10339a;
                C0984cI c0984cI4 = c1685pG.f16155b;
                if (!c0984cI4.A().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: ".concat(String.valueOf(c0984cI4.A())));
                }
                try {
                    QK qkB4 = c0984cI4.B();
                    XK xk4 = XK.f12412a;
                    int i8 = JK.f9277a;
                    FI fiD = FI.D(qkB4, XK.f12413b);
                    BigInteger bigInteger2 = C2119xJ.f17569g;
                    C1957uJ c1957uJ = new C1957uJ();
                    Vu vu = PJ.f10346h;
                    c1957uJ.f17109c = (C2011vJ) vu.H(fiD.A().A());
                    c1957uJ.f17110d = (C2011vJ) vu.H(fiD.A().B());
                    c1957uJ.f17108b = new BigInteger(1, fiD.C().u());
                    c1957uJ.a(fiD.B());
                    c1957uJ.b(fiD.A().C());
                    c1957uJ.f17112f = (C2065wJ) PJ.f10345g.H(c0984cI4.C());
                    return c1957uJ.c();
                } catch (C1636oL e9) {
                    throw new GeneralSecurityException("Parsing RsaSsaPssParameters failed: ", e9);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.IF
    public Cr b(C1631oG c1631oG) throws GeneralSecurityException {
        int i3 = 10;
        int i6 = 11;
        int i7 = 12;
        boolean z6 = false;
        switch (this.f14719a) {
            case 7:
                C1037dG c1037dG = FJ.f8081a;
                String str = c1631oG.f15922a;
                if (!str.equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(str)));
                }
                try {
                    QK qk = c1631oG.f15924c;
                    XK xk = XK.f12412a;
                    int i8 = JK.f9277a;
                    LH lhE = LH.E(qk, XK.f12413b);
                    if (lhE.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C2222zE c2222zE = new C2222zE(4);
                    c2222zE.f17840d = FJ.b(lhE.B().A());
                    c2222zE.f17838b = FJ.h(lhE.B().F());
                    c2222zE.f17839c = FJ.g(lhE.B().E());
                    c2222zE.f17841e = FJ.c(c1631oG.f15926e);
                    XI xiM = c2222zE.m();
                    C2041vw c2041vw = new C2041vw(i3, z6);
                    c2041vw.f17369b = xiM;
                    c2041vw.f17370c = new ECPoint(new BigInteger(1, lhE.C().u()), new BigInteger(1, lhE.D().u()));
                    c2041vw.f17371d = c1631oG.f15927f;
                    return c2041vw.u();
                } catch (C1636oL | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
                }
            case 9:
                C1037dG c1037dG2 = FJ.f8081a;
                String str2 = c1631oG.f15922a;
                if (!str2.equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str2)));
                }
                try {
                    QK qk2 = c1631oG.f15924c;
                    XK xk2 = XK.f12412a;
                    int i9 = JK.f9277a;
                    JH jhD = JH.D(qk2, XK.f12413b);
                    if (jhD.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    LH lhB = jhD.B();
                    if (lhB.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C2222zE c2222zE2 = new C2222zE(4);
                    c2222zE2.f17840d = FJ.b(lhB.B().A());
                    c2222zE2.f17838b = FJ.h(lhB.B().F());
                    c2222zE2.f17839c = FJ.g(lhB.B().E());
                    c2222zE2.f17841e = FJ.c(c1631oG.f15926e);
                    XI xiM2 = c2222zE2.m();
                    C2041vw c2041vw2 = new C2041vw(i3, z6);
                    c2041vw2.f17369b = xiM2;
                    c2041vw2.f17370c = new ECPoint(new BigInteger(1, lhB.C().u()), new BigInteger(1, lhB.D().u()));
                    c2041vw2.f17371d = c1631oG.f15927f;
                    ZI ziU = c2041vw2.u();
                    Vu vu = new Vu(9);
                    vu.f12105a = ziU;
                    vu.f12106b = new Wu(6, new BigInteger(1, jhD.C().u()));
                    return vu.F();
                } catch (C1636oL | IllegalArgumentException unused2) {
                    throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
                }
            case 13:
                C1037dG c1037dG3 = HJ.f8886a;
                String str3 = c1631oG.f15922a;
                if (!str3.equals("type.googleapis.com/google.crypto.tink.Ed25519PublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: ".concat(String.valueOf(str3)));
                }
                try {
                    QK qk3 = c1631oG.f15924c;
                    XK xk3 = XK.f12412a;
                    int i10 = JK.f9277a;
                    QH qhC = QH.C(qk3, XK.f12413b);
                    if (qhC.A() == 0) {
                        return C1149fJ.X((C0931bJ) HJ.f8892g.H(c1631oG.f15926e), C1313iK.a(qhC.B().u()), c1631oG.f15927f);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (C1636oL unused3) {
                    throw new GeneralSecurityException("Parsing Ed25519PublicKey failed");
                }
            case 15:
                C1037dG c1037dG4 = HJ.f8886a;
                String str4 = c1631oG.f15922a;
                if (!str4.equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str4)));
                }
                try {
                    QK qk4 = c1631oG.f15924c;
                    XK xk4 = XK.f12412a;
                    int i11 = JK.f9277a;
                    OH ohD = OH.D(qk4, XK.f12413b);
                    if (ohD.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    QH qhC2 = ohD.C();
                    if (qhC2.A() == 0) {
                        return C1040dJ.X(C1149fJ.X((C0931bJ) HJ.f8892g.H(c1631oG.f15926e), C1313iK.a(qhC2.B().u()), c1631oG.f15927f), C1448kw.g(ohD.B().u()));
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (C1636oL unused4) {
                    throw new GeneralSecurityException("Parsing Ed25519PrivateKey failed");
                }
            case 19:
                C1037dG c1037dG5 = LJ.f9644a;
                String str5 = c1631oG.f15922a;
                if (!str5.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: ".concat(String.valueOf(str5)));
                }
                try {
                    QK qk5 = c1631oG.f15924c;
                    XK xk5 = XK.f12412a;
                    int i12 = JK.f9277a;
                    DI diE = DI.E(qk5, XK.f12413b);
                    if (diE.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigInteger = new BigInteger(1, diE.C().u());
                    int iBitLength = bigInteger.bitLength();
                    BigInteger bigInteger2 = C1688pJ.f16156e;
                    C1526mJ c1526mJ = new C1526mJ();
                    c1526mJ.f15608c = (C1580nJ) LJ.f9651h.H(diE.B().A());
                    c1526mJ.f15607b = new BigInteger(1, diE.D().u());
                    c1526mJ.a(iBitLength);
                    c1526mJ.f15609d = (C1634oJ) LJ.f9650g.H(c1631oG.f15926e);
                    C1688pJ c1688pJB = c1526mJ.b();
                    C2041vw c2041vw3 = new C2041vw(i6, z6);
                    c2041vw3.f17369b = c1688pJB;
                    c2041vw3.f17370c = bigInteger;
                    c2041vw3.f17371d = c1631oG.f15927f;
                    return c2041vw3.v();
                } catch (C1636oL | IllegalArgumentException unused5) {
                    throw new GeneralSecurityException("Parsing RsaSsaPkcs1PublicKey failed");
                }
            case 21:
                C1037dG c1037dG6 = LJ.f9644a;
                String str6 = c1631oG.f15922a;
                if (!str6.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str6)));
                }
                try {
                    QK qk6 = c1631oG.f15924c;
                    XK xk6 = XK.f12412a;
                    int i13 = JK.f9277a;
                    BI biI = BI.I(qk6, XK.f12413b);
                    if (biI.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    DI diB = biI.B();
                    if (diB.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigInteger3 = new BigInteger(1, diB.C().u());
                    int iBitLength2 = bigInteger3.bitLength();
                    BigInteger bigInteger4 = new BigInteger(1, diB.D().u());
                    BigInteger bigInteger5 = C1688pJ.f16156e;
                    C1526mJ c1526mJ2 = new C1526mJ();
                    c1526mJ2.f15608c = (C1580nJ) LJ.f9651h.H(diB.B().A());
                    c1526mJ2.f15607b = bigInteger4;
                    c1526mJ2.a(iBitLength2);
                    c1526mJ2.f15609d = (C1634oJ) LJ.f9650g.H(c1631oG.f15926e);
                    C1688pJ c1688pJB2 = c1526mJ2.b();
                    C2041vw c2041vw4 = new C2041vw(i6, z6);
                    c2041vw4.f17369b = c1688pJB2;
                    c2041vw4.f17370c = bigInteger3;
                    c2041vw4.f17371d = c1631oG.f15927f;
                    C1849sJ c1849sJV = c2041vw4.v();
                    C0969c3 c0969c3 = new C0969c3(z6);
                    c0969c3.f13520a = c1849sJV;
                    Wu wuB = LJ.b(biI.D());
                    Wu wuB2 = LJ.b(biI.E());
                    c0969c3.f13522c = wuB;
                    c0969c3.f13523d = wuB2;
                    c0969c3.f13521b = LJ.b(biI.C());
                    Wu wuB3 = LJ.b(biI.F());
                    Wu wuB4 = LJ.b(biI.G());
                    c0969c3.f13524e = wuB3;
                    c0969c3.f13525f = wuB4;
                    c0969c3.f13526g = LJ.b(biI.H());
                    return c0969c3.g();
                } catch (C1636oL | IllegalArgumentException unused6) {
                    throw new GeneralSecurityException("Parsing RsaSsaPkcs1PrivateKey failed");
                }
            case 25:
                C1037dG c1037dG7 = PJ.f10339a;
                String str7 = c1631oG.f15922a;
                if (!str7.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: ".concat(String.valueOf(str7)));
                }
                try {
                    QK qk7 = c1631oG.f15924c;
                    XK xk7 = XK.f12412a;
                    int i14 = JK.f9277a;
                    LI liE = LI.E(qk7, XK.f12413b);
                    if (liE.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigInteger6 = new BigInteger(1, liE.C().u());
                    int iBitLength3 = bigInteger6.bitLength();
                    BigInteger bigInteger7 = C2119xJ.f17569g;
                    C1957uJ c1957uJ = new C1957uJ();
                    Vu vu2 = PJ.f10346h;
                    c1957uJ.f17109c = (C2011vJ) vu2.H(liE.B().A());
                    c1957uJ.f17110d = (C2011vJ) vu2.H(liE.B().B());
                    c1957uJ.f17108b = new BigInteger(1, liE.D().u());
                    c1957uJ.a(iBitLength3);
                    c1957uJ.b(liE.B().C());
                    c1957uJ.f17112f = (C2065wJ) PJ.f10345g.H(c1631oG.f15926e);
                    C2119xJ c2119xJC = c1957uJ.c();
                    C2041vw c2041vw5 = new C2041vw(i7, z6);
                    c2041vw5.f17369b = c2119xJC;
                    c2041vw5.f17370c = bigInteger6;
                    c2041vw5.f17371d = c1631oG.f15927f;
                    return c2041vw5.w();
                } catch (C1636oL | IllegalArgumentException unused7) {
                    throw new GeneralSecurityException("Parsing RsaSsaPssPublicKey failed");
                }
            default:
                C1037dG c1037dG8 = PJ.f10339a;
                String str8 = c1631oG.f15922a;
                if (!str8.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str8)));
                }
                try {
                    QK qk8 = c1631oG.f15924c;
                    XK xk8 = XK.f12412a;
                    int i15 = JK.f9277a;
                    JI jiI = JI.I(qk8, XK.f12413b);
                    if (jiI.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    LI liB = jiI.B();
                    if (liB.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigInteger8 = new BigInteger(1, liB.C().u());
                    int iBitLength4 = bigInteger8.bitLength();
                    BigInteger bigInteger9 = new BigInteger(1, liB.D().u());
                    BigInteger bigInteger10 = C2119xJ.f17569g;
                    C1957uJ c1957uJ2 = new C1957uJ();
                    Vu vu3 = PJ.f10346h;
                    c1957uJ2.f17109c = (C2011vJ) vu3.H(liB.B().A());
                    c1957uJ2.f17110d = (C2011vJ) vu3.H(liB.B().B());
                    c1957uJ2.f17108b = bigInteger9;
                    c1957uJ2.a(iBitLength4);
                    c1957uJ2.b(liB.B().C());
                    c1957uJ2.f17112f = (C2065wJ) PJ.f10345g.H(c1631oG.f15926e);
                    C2119xJ c2119xJC2 = c1957uJ2.c();
                    C2041vw c2041vw6 = new C2041vw(i7, z6);
                    c2041vw6.f17369b = c2119xJC2;
                    c2041vw6.f17370c = bigInteger8;
                    c2041vw6.f17371d = c1631oG.f15927f;
                    C2227zJ c2227zJW = c2041vw6.w();
                    C0969c3 c0969c32 = new C0969c3(z6);
                    c0969c32.f13520a = c2227zJW;
                    Wu wuC = PJ.c(jiI.D());
                    Wu wuC2 = PJ.c(jiI.E());
                    c0969c32.f13522c = wuC;
                    c0969c32.f13523d = wuC2;
                    c0969c32.f13521b = PJ.c(jiI.C());
                    Wu wuC3 = PJ.c(jiI.F());
                    Wu wuC4 = PJ.c(jiI.G());
                    c0969c32.f13524e = wuC3;
                    c0969c32.f13525f = wuC4;
                    c0969c32.f13526g = PJ.c(jiI.H());
                    return c0969c32.i();
                } catch (C1636oL | IllegalArgumentException unused8) {
                    throw new GeneralSecurityException("Parsing RsaSsaPssPrivateKey failed");
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1361jG, com.google.android.gms.internal.ads.KF
    public C1631oG c(Cr cr) throws GeneralSecurityException {
        switch (this.f14719a) {
            case 6:
                ZI zi = (ZI) cr;
                return C1631oG.a("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", FJ.f(zi).a(), 4, FJ.a(zi.f12812c.f12411d), zi.f12815f);
            case 8:
                YI yi = (YI) cr;
                C1037dG c1037dG = FJ.f8081a;
                int iD = FJ.d(yi.f12624c.f12812c.f12409b);
                IH ihE = JH.E();
                ZI zi2 = yi.f12624c;
                LH lhF = FJ.f(zi2);
                ihE.b();
                ((JH) ihE.f13551b).G(lhF);
                byte[] bArrY = C1476lN.y((BigInteger) yi.f12625d.f12337b, iD);
                OK ok = QK.f10609b;
                OK okR = QK.r(0, bArrY.length, bArrY);
                ihE.b();
                ((JH) ihE.f13551b).H(okR);
                return C1631oG.a("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", ((JH) ihE.d()).a(), 3, FJ.a(zi2.f12812c.f12411d), zi2.f12815f);
            case 12:
                C1149fJ c1149fJ = (C1149fJ) cr;
                return C1631oG.a("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", HJ.a(c1149fJ).a(), 4, (EnumC1956uI) HJ.f8892g.y(c1149fJ.f14051c.f13548a), c1149fJ.f14054f);
            case 14:
                C1040dJ c1040dJ = (C1040dJ) cr;
                C1037dG c1037dG2 = HJ.f8886a;
                NH nhE = OH.E();
                QH qhA = HJ.a(c1040dJ.f13750c);
                nhE.b();
                ((OH) nhE.f13551b).H(qhA);
                byte[] bArrB = ((C1313iK) c1040dJ.f13751d.f15314b).b();
                OK okR2 = QK.r(0, bArrB.length, bArrB);
                nhE.b();
                ((OH) nhE.f13551b).G(okR2);
                OK okA = ((OH) nhE.d()).a();
                Vu vu = HJ.f8892g;
                C1149fJ c1149fJ2 = c1040dJ.f13750c;
                return C1631oG.a("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", okA, 3, (EnumC1956uI) vu.y(c1149fJ2.f14051c.f13548a), c1149fJ2.f14054f);
            case 18:
                C1849sJ c1849sJ = (C1849sJ) cr;
                return C1631oG.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", LJ.a(c1849sJ).a(), 4, (EnumC1956uI) LJ.f9650g.y(c1849sJ.f16702c.f16159c), c1849sJ.f16705f);
            case 20:
                C1795rJ c1795rJ = (C1795rJ) cr;
                C1037dG c1037dG3 = LJ.f9644a;
                AI aiJ = BI.J();
                aiJ.b();
                ((BI) aiJ.f13551b).L();
                DI diA = LJ.a(c1795rJ.f16507c);
                aiJ.b();
                ((BI) aiJ.f13551b).M(diA);
                byte[] bArrL = C1476lN.l((BigInteger) c1795rJ.f16508d.f12337b);
                OK ok2 = QK.f10609b;
                OK okR3 = QK.r(0, bArrL.length, bArrL);
                aiJ.b();
                ((BI) aiJ.f13551b).N(okR3);
                byte[] bArrL2 = C1476lN.l((BigInteger) c1795rJ.f16509e.f12337b);
                OK okR4 = QK.r(0, bArrL2.length, bArrL2);
                aiJ.b();
                ((BI) aiJ.f13551b).O(okR4);
                byte[] bArrL3 = C1476lN.l((BigInteger) c1795rJ.f16510f.f12337b);
                OK okR5 = QK.r(0, bArrL3.length, bArrL3);
                aiJ.b();
                ((BI) aiJ.f13551b).P(okR5);
                byte[] bArrL4 = C1476lN.l((BigInteger) c1795rJ.f16511g.f12337b);
                OK okR6 = QK.r(0, bArrL4.length, bArrL4);
                aiJ.b();
                ((BI) aiJ.f13551b).Q(okR6);
                byte[] bArrL5 = C1476lN.l((BigInteger) c1795rJ.f16512h.f12337b);
                OK okR7 = QK.r(0, bArrL5.length, bArrL5);
                aiJ.b();
                ((BI) aiJ.f13551b).R(okR7);
                byte[] bArrL6 = C1476lN.l((BigInteger) c1795rJ.i.f12337b);
                OK okR8 = QK.r(0, bArrL6.length, bArrL6);
                aiJ.b();
                ((BI) aiJ.f13551b).S(okR8);
                OK okA2 = ((BI) aiJ.d()).a();
                Vu vu2 = LJ.f9650g;
                C1849sJ c1849sJ2 = c1795rJ.f16507c;
                return C1631oG.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", okA2, 3, (EnumC1956uI) vu2.y(c1849sJ2.f16702c.f16159c), c1849sJ2.f16705f);
            case 24:
                C2227zJ c2227zJ = (C2227zJ) cr;
                return C1631oG.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", PJ.b(c2227zJ).a(), 4, (EnumC1956uI) PJ.f10345g.y(c2227zJ.f17853c.f17572c), c2227zJ.f17856f);
            default:
                C2173yJ c2173yJ = (C2173yJ) cr;
                C1037dG c1037dG4 = PJ.f10339a;
                II iiJ = JI.J();
                iiJ.b();
                ((JI) iiJ.f13551b).L();
                LI liB = PJ.b(c2173yJ.f17704c);
                iiJ.b();
                ((JI) iiJ.f13551b).M(liB);
                byte[] bArrL7 = C1476lN.l((BigInteger) c2173yJ.f17705d.f12337b);
                OK ok3 = QK.f10609b;
                OK okR9 = QK.r(0, bArrL7.length, bArrL7);
                iiJ.b();
                ((JI) iiJ.f13551b).N(okR9);
                byte[] bArrL8 = C1476lN.l((BigInteger) c2173yJ.f17706e.f12337b);
                OK okR10 = QK.r(0, bArrL8.length, bArrL8);
                iiJ.b();
                ((JI) iiJ.f13551b).O(okR10);
                byte[] bArrL9 = C1476lN.l((BigInteger) c2173yJ.f17707f.f12337b);
                OK okR11 = QK.r(0, bArrL9.length, bArrL9);
                iiJ.b();
                ((JI) iiJ.f13551b).P(okR11);
                byte[] bArrL10 = C1476lN.l((BigInteger) c2173yJ.f17708g.f12337b);
                OK okR12 = QK.r(0, bArrL10.length, bArrL10);
                iiJ.b();
                ((JI) iiJ.f13551b).Q(okR12);
                byte[] bArrL11 = C1476lN.l((BigInteger) c2173yJ.f17709h.f12337b);
                OK okR13 = QK.r(0, bArrL11.length, bArrL11);
                iiJ.b();
                ((JI) iiJ.f13551b).R(okR13);
                byte[] bArrL12 = C1476lN.l((BigInteger) c2173yJ.i.f12337b);
                OK okR14 = QK.r(0, bArrL12.length, bArrL12);
                iiJ.b();
                ((JI) iiJ.f13551b).S(okR14);
                OK okA3 = ((JI) iiJ.d()).a();
                Vu vu3 = PJ.f10345g;
                C2227zJ c2227zJ2 = c2173yJ.f17704c;
                return C1631oG.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", okA3, 3, (EnumC1956uI) vu3.y(c2227zJ2.f17853c.f17572c), c2227zJ2.f17856f);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0877aK
    public /* bridge */ /* synthetic */ Object d(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1091eG
    public C1685pG e(AbstractC1089eE abstractC1089eE) {
        switch (this.f14719a) {
            case 10:
                XI xi = (XI) abstractC1089eE;
                C1037dG c1037dG = FJ.f8081a;
                C0930bI c0930bIE = C0984cI.E();
                c0930bIE.g("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
                EH ehC = FH.C();
                HH hhE = FJ.e(xi);
                ehC.b();
                ((FH) ehC.f13551b).D(hhE);
                c0930bIE.h(((FH) ehC.d()).a());
                c0930bIE.i(FJ.a(xi.f12411d));
                return C1685pG.a((C0984cI) c0930bIE.d());
            case 16:
                C1037dG c1037dG2 = HJ.f8886a;
                C0930bI c0930bIE2 = C0984cI.E();
                c0930bIE2.g("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
                c0930bIE2.h(MH.C().a());
                c0930bIE2.i((EnumC1956uI) HJ.f8892g.y(((C0985cJ) abstractC1089eE).f13548a));
                return C1685pG.a((C0984cI) c0930bIE2.d());
            case 22:
                C1688pJ c1688pJ = (C1688pJ) abstractC1089eE;
                C1037dG c1037dG3 = LJ.f9644a;
                C0930bI c0930bIE3 = C0984cI.E();
                c0930bIE3.g("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
                C2064wI c2064wIE = C2118xI.E();
                C2172yI c2172yIB = C2226zI.B();
                RH rh = (RH) LJ.f9651h.y(c1688pJ.f16160d);
                c2172yIB.b();
                ((C2226zI) c2172yIB.f13551b).D(rh);
                C2226zI c2226zI = (C2226zI) c2172yIB.d();
                c2064wIE.b();
                ((C2118xI) c2064wIE.f13551b).F(c2226zI);
                int i3 = c1688pJ.f16157a;
                c2064wIE.b();
                ((C2118xI) c2064wIE.f13551b).G(i3);
                byte[] bArrL = C1476lN.l(c1688pJ.f16158b);
                OK ok = QK.f10609b;
                OK okR = QK.r(0, bArrL.length, bArrL);
                c2064wIE.b();
                ((C2118xI) c2064wIE.f13551b).H(okR);
                c0930bIE3.h(((C2118xI) c2064wIE.d()).a());
                c0930bIE3.i((EnumC1956uI) LJ.f9650g.y(c1688pJ.f16159c));
                return C1685pG.a((C0984cI) c0930bIE3.d());
            default:
                C2119xJ c2119xJ = (C2119xJ) abstractC1089eE;
                C1037dG c1037dG4 = PJ.f10339a;
                C0930bI c0930bIE4 = C0984cI.E();
                c0930bIE4.g("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
                EI eiE = FI.E();
                HI hiA = PJ.a(c2119xJ);
                eiE.b();
                ((FI) eiE.f13551b).F(hiA);
                int i6 = c2119xJ.f17570a;
                eiE.b();
                ((FI) eiE.f13551b).G(i6);
                byte[] bArrL2 = C1476lN.l(c2119xJ.f17571b);
                OK ok2 = QK.f10609b;
                OK okR2 = QK.r(0, bArrL2.length, bArrL2);
                eiE.b();
                ((FI) eiE.f13551b).H(okR2);
                c0930bIE4.h(((FI) eiE.d()).a());
                c0930bIE4.i((EnumC1956uI) PJ.f10345g.y(c2119xJ.f17572c));
                return C1685pG.a((C0984cI) c0930bIE4.d());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1361jG, com.google.android.gms.internal.ads.KF
    public Object c(Cr cr) throws GeneralSecurityException {
        KeyFactory keyFactory;
        InterfaceC1199gE interfaceC1199gEB;
        switch (this.f14719a) {
            case 0:
                C1631oG c1631oG = ((PF) cr).f10334c;
                int i3 = NF.f9982b[AbstractC2984e.c(c1631oG.f15925d)];
                return new KJ((InterfaceC1199gE) GF.f8340d.b(InterfaceC1199gE.class, c1631oG.f15922a).a(c1631oG.f15924c), KJ.b(c1631oG), c1631oG.f15926e.equals(EnumC1956uI.LEGACY) ? new byte[]{0} : new byte[0]);
            case 1:
                C1795rJ c1795rJ = (C1795rJ) cr;
                int i6 = AbstractC2062wG.f17417a;
                if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
                    (!Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT)).getClass();
                }
                Provider providerD = AbstractC1114el.d();
                if (providerD != null) {
                    keyFactory = KeyFactory.getInstance("RSA", providerD);
                } else {
                    keyFactory = (KeyFactory) YJ.f12631g.f12632a.c("RSA");
                }
                C1849sJ c1849sJ = c1795rJ.f16507c;
                BigInteger bigInteger = c1849sJ.f16703d;
                C1688pJ c1688pJ = c1849sJ.f16702c;
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger, c1688pJ.f16158b, (BigInteger) c1795rJ.f16508d.f12337b, (BigInteger) c1795rJ.f16509e.f12337b, (BigInteger) c1795rJ.f16510f.f12337b, (BigInteger) c1795rJ.f16511g.f12337b, (BigInteger) c1795rJ.f16512h.f12337b, (BigInteger) c1795rJ.i.f12337b));
                if (providerD != null) {
                    interfaceC1199gEB = NJ.c(c1849sJ, providerD);
                } else {
                    interfaceC1199gEB = AbstractC1095eK.b(c1849sJ);
                }
                MJ mj = new MJ(rSAPrivateCrtKey, c1688pJ.f16160d, c1849sJ.f16704e.b(), c1688pJ.f16159c.equals(C1634oJ.f15930d) ? MJ.f9859h : MJ.f9858g, interfaceC1199gEB, providerD);
                String str = mj.f9861b;
                Provider provider = mj.f9865f;
                Signature signature = provider != null ? Signature.getInstance(str, provider) : (Signature) YJ.f12628d.f12632a.c(str);
                signature.initSign(mj.f9860a);
                byte[] bArr = MJ.i;
                signature.update(bArr);
                byte[] bArr2 = mj.f9863d;
                if (bArr2.length > 0) {
                    signature.update(bArr2);
                }
                byte[] bArrSign = signature.sign();
                byte[] bArr3 = mj.f9862c;
                if (bArr3.length > 0) {
                    bArrSign = AbstractC0582Jp.q(bArr3, bArrSign);
                }
                try {
                    mj.f9864e.a(bArrSign, bArr);
                    return mj;
                } catch (GeneralSecurityException e6) {
                    throw new IllegalStateException("RSA signature computation error", e6);
                }
            case 2:
                return AbstractC1095eK.b((C1849sJ) cr);
            case 3:
                C2173yJ c2173yJ = (C2173yJ) cr;
                try {
                    return IJ.b(c2173yJ);
                } catch (NoSuchProviderException unused) {
                    KeyFactory keyFactory2 = (KeyFactory) YJ.f12631g.f12632a.c("RSA");
                    C2227zJ c2227zJ = c2173yJ.f17704c;
                    C2227zJ c2227zJ2 = c2173yJ.f17704c;
                    BigInteger bigInteger2 = c2227zJ.f17854d;
                    C2119xJ c2119xJ = c2227zJ2.f17853c;
                    C2119xJ c2119xJ2 = c2227zJ2.f17853c;
                    RSAPrivateCrtKey rSAPrivateCrtKey2 = (RSAPrivateCrtKey) keyFactory2.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger2, c2119xJ.f17571b, (BigInteger) c2173yJ.f17705d.f12337b, (BigInteger) c2173yJ.f17706e.f12337b, (BigInteger) c2173yJ.f17707f.f12337b, (BigInteger) c2173yJ.f17708g.f12337b, (BigInteger) c2173yJ.f17709h.f12337b, (BigInteger) c2173yJ.i.f12337b));
                    Vu vu = AbstractC1259hK.f14474a;
                    EnumC0932bK enumC0932bK = (EnumC0932bK) vu.y(c2119xJ2.f17573d);
                    EnumC0932bK enumC0932bK2 = (EnumC0932bK) vu.y(c2119xJ2.f17574e);
                    c2227zJ2.f17855e.b();
                    IJ ij = new IJ();
                    if (!AbstractC2061wF.a()) {
                        Cr.u(enumC0932bK);
                        if (enumC0932bK.equals(enumC0932bK2)) {
                            Cr.z(rSAPrivateCrtKey2.getModulus().bitLength());
                            Cr.F(rSAPrivateCrtKey2.getPublicExponent());
                            return ij;
                        }
                        throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
                    }
                    throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
                }
            default:
                C2227zJ c2227zJ3 = (C2227zJ) cr;
                Vu vu2 = AbstractC1259hK.f14474a;
                try {
                    return QJ.d(c2227zJ3);
                } catch (NoSuchProviderException unused2) {
                    KeyFactory keyFactory3 = (KeyFactory) YJ.f12631g.f12632a.c("RSA");
                    BigInteger bigInteger3 = c2227zJ3.f17854d;
                    C2119xJ c2119xJ3 = c2227zJ3.f17853c;
                    RSAPublicKey rSAPublicKey = (RSAPublicKey) keyFactory3.generatePublic(new RSAPublicKeySpec(bigInteger3, c2119xJ3.f17571b));
                    Vu vu3 = AbstractC1259hK.f14474a;
                    return new C1150fK(rSAPublicKey, (EnumC0932bK) vu3.y(c2119xJ3.f17573d), (EnumC0932bK) vu3.y(c2119xJ3.f17574e), c2119xJ3.f17575f, c2227zJ3.f17855e.b(), c2119xJ3.f17572c.equals(C2065wJ.f17420d) ? AbstractC1259hK.f14476c : AbstractC1259hK.f14475b);
                }
        }
    }
}

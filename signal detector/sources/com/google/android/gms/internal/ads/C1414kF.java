package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import x.AbstractC2984e;

/* renamed from: com.google.android.gms.internal.ads.kF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1414kF implements InterfaceC1091eG, InterfaceC0982cG, KF, IF, InterfaceC1361jG {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15104a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1414kF f15092b = new C1414kF(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C1414kF f15093c = new C1414kF(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ C1414kF f15094d = new C1414kF(2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ C1414kF f15095e = new C1414kF(3);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ C1414kF f15096f = new C1414kF(4);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ C1414kF f15097g = new C1414kF(5);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ C1414kF f15098h = new C1414kF(6);
    public static final /* synthetic */ C1414kF i = new C1414kF(7);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ C1414kF f15099j = new C1414kF(8);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ C1414kF f15100k = new C1414kF(9);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ C1414kF f15101l = new C1414kF(10);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ C1414kF f15102m = new C1414kF(11);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ C1414kF f15103n = new C1414kF(12);

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ C1414kF f15077C = new C1414kF(13);

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ C1414kF f15078D = new C1414kF(14);

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ C1414kF f15079E = new C1414kF(15);

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ C1414kF f15080F = new C1414kF(17);

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ C1414kF f15081G = new C1414kF(18);

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ C1414kF f15082H = new C1414kF(19);

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ C1414kF f15083I = new C1414kF(20);

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ C1414kF f15084J = new C1414kF(21);

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ C1414kF f15085K = new C1414kF(22);

    /* renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ C1414kF f15086L = new C1414kF(23);
    public static final /* synthetic */ C1414kF M = new C1414kF(24);

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ C1414kF f15087N = new C1414kF(25);

    /* renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ C1414kF f15088O = new C1414kF(26);

    /* renamed from: P, reason: collision with root package name */
    public static final /* synthetic */ C1414kF f15089P = new C1414kF(27);

    /* renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ C1414kF f15090Q = new C1414kF(28);

    /* renamed from: R, reason: collision with root package name */
    public static final /* synthetic */ C1414kF f15091R = new C1414kF(29);

    public /* synthetic */ C1414kF(int i3) {
        this.f15104a = i3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0982cG
    public AbstractC1089eE a(C1685pG c1685pG) throws GeneralSecurityException {
        switch (this.f15104a) {
            case 1:
                C1037dG c1037dG = AbstractC1791rF.f16502a;
                C0984cI c0984cI = c1685pG.f16155b;
                if (!c0984cI.A().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(c0984cI.A())));
                }
                try {
                    QK qkB = c0984cI.B();
                    XK xk = XK.f12412a;
                    int i3 = JK.f9277a;
                    PI piC = PI.C(qkB, XK.f12413b);
                    if (piC.A() == 0) {
                        return YE.b(AbstractC1791rF.b(c0984cI.C()), piC.B().A());
                    }
                    throw new GeneralSecurityException("Only version 0 parameters are accepted");
                } catch (C1636oL e6) {
                    throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e6);
                }
            case 5:
                C1037dG c1037dG2 = AbstractC1899tF.f16886a;
                C0984cI c0984cI2 = c1685pG.f16155b;
                if (!c0984cI2.A().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(c0984cI2.A())));
                }
                try {
                    QK qkB2 = c0984cI2.B();
                    XK xk2 = XK.f12412a;
                    int i6 = JK.f9277a;
                    if (VI.B(qkB2, XK.f12413b).A() == 0) {
                        return new C0927bF(AbstractC1899tF.b(c0984cI2.C()));
                    }
                    throw new GeneralSecurityException("Only version 0 parameters are accepted");
                } catch (C1636oL e7) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e7);
                }
            case 17:
                C1037dG c1037dG3 = PG.f10335a;
                C0984cI c0984cI3 = c1685pG.f16155b;
                if (!c0984cI3.A().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(c0984cI3.A())));
                }
                try {
                    QK qkB3 = c0984cI3.B();
                    XK xk3 = XK.f12412a;
                    int i7 = JK.f9277a;
                    YG ygC = YG.C(qkB3, XK.f12413b);
                    C2041vw c2041vw = new C2041vw(8);
                    c2041vw.d(ygC.A());
                    c2041vw.h(ygC.B().A());
                    c2041vw.f17371d = PG.b(c0984cI3.C());
                    return c2041vw.s();
                } catch (C1636oL e8) {
                    throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e8);
                }
            default:
                Vu vu = QG.f10595a;
                C0984cI c0984cI4 = c1685pG.f16155b;
                if (!c0984cI4.A().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(c0984cI4.A())));
                }
                try {
                    QK qkB4 = c0984cI4.B();
                    XK xk4 = XK.f12412a;
                    int i8 = JK.f9277a;
                    VH vhD = VH.D(qkB4, XK.f12413b);
                    if (vhD.C() != 0) {
                        int iC = vhD.C();
                        throw new GeneralSecurityException(A.f.i(iC, "Parsing HmacParameters failed: unknown Version ", new StringBuilder(String.valueOf(iC).length() + 47)));
                    }
                    C2222zE c2222zE = new C2222zE(3);
                    c2222zE.a(vhD.B());
                    c2222zE.e(vhD.A().B());
                    c2222zE.f17840d = (FG) QG.f10596b.H(vhD.A().A());
                    c2222zE.f17841e = (GG) QG.f10595a.H(c0984cI4.C());
                    return c2222zE.l();
                } catch (C1636oL e9) {
                    throw new GeneralSecurityException("Parsing HmacParameters failed: ", e9);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.IF
    public Cr b(C1631oG c1631oG) throws GeneralSecurityException {
        boolean z6 = false;
        switch (this.f15104a) {
            case 3:
                C1037dG c1037dG = AbstractC1791rF.f16502a;
                if (!c1631oG.f15922a.equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
                }
                try {
                    QK qk = c1631oG.f15924c;
                    XK xk = XK.f12412a;
                    int i3 = JK.f9277a;
                    NI niD = NI.D(qk, XK.f12413b);
                    if (niD.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (niD.C().f() == 32) {
                        return WE.X(YE.b(AbstractC1791rF.b(c1631oG.f15926e), niD.B().A()), C1448kw.g(niD.C().u()), c1631oG.f15927f);
                    }
                    throw new GeneralSecurityException("Only 32 byte key size is accepted");
                } catch (C1636oL unused) {
                    throw new GeneralSecurityException("Parsing XAesGcmKey failed");
                }
            case 7:
                C1037dG c1037dG2 = AbstractC1899tF.f16886a;
                if (!c1631oG.f15922a.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    QK qk2 = c1631oG.f15924c;
                    XK xk2 = XK.f12412a;
                    int i6 = JK.f9277a;
                    TI tiC = TI.C(qk2, XK.f12413b);
                    if (tiC.A() == 0) {
                        return ZE.X(AbstractC1899tF.b(c1631oG.f15926e), C1448kw.g(tiC.B().u()), c1631oG.f15927f);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (C1636oL unused2) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                }
            case 19:
                C1037dG c1037dG3 = PG.f10335a;
                if (!c1631oG.f15922a.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
                }
                try {
                    QK qk3 = c1631oG.f15924c;
                    XK xk3 = XK.f12412a;
                    int i7 = JK.f9277a;
                    WG wgD = WG.D(qk3, XK.f12413b);
                    if (wgD.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C2041vw c2041vw = new C2041vw(8);
                    c2041vw.d(wgD.B().f());
                    c2041vw.h(wgD.C().A());
                    c2041vw.f17371d = PG.b(c1631oG.f15926e);
                    C2224zG c2224zGS = c2041vw.s();
                    C2041vw c2041vw2 = new C2041vw(7, z6);
                    c2041vw2.f17369b = c2224zGS;
                    c2041vw2.f17370c = C1448kw.g(wgD.B().u());
                    c2041vw2.f17371d = c1631oG.f15927f;
                    return c2041vw2.r();
                } catch (C1636oL | IllegalArgumentException unused3) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
                }
            default:
                Vu vu = QG.f10595a;
                if (!c1631oG.f15922a.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
                }
                try {
                    QK qk4 = c1631oG.f15924c;
                    XK xk4 = XK.f12412a;
                    int i8 = JK.f9277a;
                    TH thD = TH.D(qk4, XK.f12413b);
                    if (thD.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C2222zE c2222zE = new C2222zE(3);
                    c2222zE.a(thD.C().f());
                    c2222zE.e(thD.B().B());
                    c2222zE.f17840d = (FG) QG.f10596b.H(thD.B().A());
                    c2222zE.f17841e = (GG) QG.f10595a.H(c1631oG.f15926e);
                    HG hgL = c2222zE.l();
                    C2041vw c2041vw3 = new C2041vw(9, z6);
                    c2041vw3.f17369b = hgL;
                    c2041vw3.f17370c = C1448kw.g(thD.C().u());
                    c2041vw3.f17371d = c1631oG.f15927f;
                    return c2041vw3.t();
                } catch (C1636oL | IllegalArgumentException unused4) {
                    throw new GeneralSecurityException("Parsing HmacKey failed");
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.KF
    public C1631oG c(Cr cr) {
        switch (this.f15104a) {
            case 2:
                WE we = (WE) cr;
                C1037dG c1037dG = AbstractC1791rF.f16502a;
                MI miE = NI.E();
                byte[] bArrB = ((C1313iK) we.f12190d.f15314b).b();
                OK okR = QK.r(0, bArrB.length, bArrB);
                miE.b();
                ((NI) miE.f13551b).G(okR);
                QI qiB = RI.B();
                YE ye = we.f12189c;
                int i3 = ye.f12620b;
                qiB.b();
                ((RI) qiB.f13551b).D(i3);
                RI ri = (RI) qiB.d();
                miE.b();
                ((NI) miE.f13551b).F(ri);
                return C1631oG.a("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((NI) miE.d()).a(), 2, AbstractC1791rF.a(ye.f12619a), we.f12192f);
            case 6:
                ZE ze = (ZE) cr;
                C1037dG c1037dG2 = AbstractC1899tF.f16886a;
                SI siD = TI.D();
                byte[] bArrB2 = ((C1313iK) ze.f12807d.f15314b).b();
                OK okR2 = QK.r(0, bArrB2.length, bArrB2);
                siD.b();
                ((TI) siD.f13551b).F(okR2);
                return C1631oG.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((TI) siD.d()).a(), 2, AbstractC1899tF.a(ze.f12806c.f13336a), ze.f12809f);
            case 10:
                C1631oG c1631oG = ((PF) cr).f10334c;
                int i6 = NF.f9982b[AbstractC2984e.c(c1631oG.f15925d)];
                return c1631oG;
            case 18:
                C2116xG c2116xG = (C2116xG) cr;
                C1037dG c1037dG3 = PG.f10335a;
                VG vgE = WG.E();
                C2224zG c2224zG = c2116xG.f17565c;
                ZG zgB = C0929bH.B();
                int i7 = c2224zG.f17851b;
                zgB.b();
                ((C0929bH) zgB.f13551b).D(i7);
                C0929bH c0929bH = (C0929bH) zgB.d();
                vgE.b();
                ((WG) vgE.f13551b).H(c0929bH);
                byte[] bArrB3 = ((C1313iK) c2116xG.f17566d.f15314b).b();
                OK okR3 = QK.r(0, bArrB3.length, bArrB3);
                vgE.b();
                ((WG) vgE.f13551b).G(okR3);
                return C1631oG.a("type.googleapis.com/google.crypto.tink.AesCmacKey", ((WG) vgE.d()).a(), 2, PG.a(c2116xG.f17565c.f17852c), c2116xG.f17568f);
            default:
                DG dg = (DG) cr;
                Vu vu = QG.f10595a;
                SH shE = TH.E();
                HG hg = dg.f7741c;
                WH whC = XH.C();
                int i8 = hg.f8883b;
                whC.b();
                ((XH) whC.f13551b).F(i8);
                RH rh = (RH) QG.f10596b.y(hg.f8885d);
                whC.b();
                ((XH) whC.f13551b).E(rh);
                XH xh = (XH) whC.d();
                shE.b();
                ((TH) shE.f13551b).H(xh);
                byte[] bArrB4 = ((C1313iK) dg.f7742d.f15314b).b();
                OK okR4 = QK.r(0, bArrB4.length, bArrB4);
                shE.b();
                ((TH) shE.f13551b).I(okR4);
                return C1631oG.a("type.googleapis.com/google.crypto.tink.HmacKey", ((TH) shE.d()).a(), 2, (EnumC1956uI) QG.f10595a.y(dg.f7741c.f8884c), dg.f7744f);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1091eG
    public C1685pG e(AbstractC1089eE abstractC1089eE) {
        switch (this.f15104a) {
            case 0:
                C1037dG c1037dG = AbstractC1468lF.f15372a;
                C0930bI c0930bIE = C0984cI.E();
                c0930bIE.g("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
                c0930bIE.h(DH.B().a());
                c0930bIE.i(AbstractC1468lF.a(((KE) abstractC1089eE).f9474a));
                return C1685pG.a((C0984cI) c0930bIE.d());
            case 4:
                YE ye = (YE) abstractC1089eE;
                C1037dG c1037dG2 = AbstractC1791rF.f16502a;
                C0930bI c0930bIE2 = C0984cI.E();
                c0930bIE2.g("type.googleapis.com/google.crypto.tink.XAesGcmKey");
                OI oiD = PI.D();
                QI qiB = RI.B();
                int i3 = ye.f12620b;
                qiB.b();
                ((RI) qiB.f13551b).D(i3);
                RI ri = (RI) qiB.d();
                oiD.b();
                ((PI) oiD.f13551b).E(ri);
                c0930bIE2.h(((PI) oiD.d()).a());
                c0930bIE2.i(AbstractC1791rF.a(ye.f12619a));
                return C1685pG.a((C0984cI) c0930bIE2.d());
            case 8:
                C1037dG c1037dG3 = AbstractC1899tF.f16886a;
                C0930bI c0930bIE3 = C0984cI.E();
                c0930bIE3.g("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
                c0930bIE3.h(VI.C().a());
                c0930bIE3.i(AbstractC1899tF.a(((C0927bF) abstractC1089eE).f13336a));
                return C1685pG.a((C0984cI) c0930bIE3.d());
            case 20:
                C2224zG c2224zG = (C2224zG) abstractC1089eE;
                C1037dG c1037dG4 = PG.f10335a;
                C0930bI c0930bIE4 = C0984cI.E();
                c0930bIE4.g("type.googleapis.com/google.crypto.tink.AesCmacKey");
                XG xgD = YG.D();
                ZG zgB = C0929bH.B();
                int i6 = c2224zG.f17851b;
                zgB.b();
                ((C0929bH) zgB.f13551b).D(i6);
                C0929bH c0929bH = (C0929bH) zgB.d();
                xgD.b();
                ((YG) xgD.f13551b).F(c0929bH);
                int i7 = c2224zG.f17850a;
                xgD.b();
                ((YG) xgD.f13551b).E(i7);
                c0930bIE4.h(((YG) xgD.d()).a());
                c0930bIE4.i(PG.a(c2224zG.f17852c));
                return C1685pG.a((C0984cI) c0930bIE4.d());
            default:
                HG hg = (HG) abstractC1089eE;
                Vu vu = QG.f10595a;
                C0930bI c0930bIE5 = C0984cI.E();
                c0930bIE5.g("type.googleapis.com/google.crypto.tink.HmacKey");
                UH uhE = VH.E();
                WH whC = XH.C();
                int i8 = hg.f8883b;
                whC.b();
                ((XH) whC.f13551b).F(i8);
                RH rh = (RH) QG.f10596b.y(hg.f8885d);
                whC.b();
                ((XH) whC.f13551b).E(rh);
                XH xh = (XH) whC.d();
                uhE.b();
                ((VH) uhE.f13551b).G(xh);
                int i9 = hg.f8882a;
                uhE.b();
                ((VH) uhE.f13551b).H(i9);
                c0930bIE5.h(((VH) uhE.d()).a());
                c0930bIE5.i((EnumC1956uI) QG.f10595a.y(hg.f8884c));
                return C1685pG.a((C0984cI) c0930bIE5.d());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1361jG, com.google.android.gms.internal.ads.KF
    public Object c(Cr cr) throws GeneralSecurityException {
        KeyFactory keyFactory;
        KeyFactory keyFactory2;
        switch (this.f15104a) {
            case 11:
                C2116xG c2116xG = (C2116xG) cr;
                C1309iG c1309iG = AbstractC2170yG.f17701a;
                if (c2116xG.f17565c.f17850a == 32) {
                    if (Cr.m(1)) {
                        Provider providerD = AbstractC1114el.d();
                        if (providerD != null) {
                            try {
                                return AG.a(c2116xG, providerD);
                            } catch (GeneralSecurityException unused) {
                            }
                        }
                        return new AG();
                    }
                    throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
                }
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            case 12:
                C2116xG c2116xG2 = (C2116xG) cr;
                C1309iG c1309iG2 = AbstractC2170yG.f17701a;
                if (c2116xG2.f17565c.f17850a == 32) {
                    return new C1041dK(c2116xG2);
                }
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            case 13:
                AG ag = new AG();
                if (Cr.m(2)) {
                    return ag;
                }
                throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
            case 14:
                return new C1041dK((DG) cr);
            case 15:
                C1631oG c1631oG = ((PF) cr).f10334c;
                int[] iArr = NF.f9982b;
                int i3 = c1631oG.f15925d;
                Integer num = c1631oG.f15927f;
                int i6 = iArr[AbstractC2984e.c(i3)];
                int iOrdinal = c1631oG.f15926e.ordinal();
                if (iOrdinal == 1) {
                    AbstractC0873aG.b(num.intValue()).b();
                } else if (iOrdinal == 2) {
                    AbstractC0873aG.a(num.intValue()).b();
                } else if (iOrdinal == 3) {
                    AbstractC0873aG.f13089a.b();
                } else {
                    if (iOrdinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                    AbstractC0873aG.a(num.intValue()).b();
                }
                return new LG();
            case 25:
                YI yi = (YI) cr;
                Provider providerD2 = AbstractC1114el.d();
                EnumC0932bK enumC0932bK = (EnumC0932bK) GJ.i.y(yi.f12624c.f12812c.f12410c);
                Vu vu = GJ.f8350j;
                ZI zi = yi.f12624c;
                ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec((BigInteger) yi.f12625d.f12337b, Cr.s((UJ) GJ.f8351k.y(zi.f12812c.f12409b)));
                if (providerD2 != null) {
                    keyFactory = KeyFactory.getInstance("EC", providerD2);
                } else {
                    keyFactory = (KeyFactory) YJ.f12631g.f12632a.c("EC");
                }
                zi.f12814e.b();
                IJ ij = new IJ();
                if (Cr.m(2)) {
                    Cr.u(enumC0932bK);
                    enumC0932bK.toString().concat("withECDSA");
                    return ij;
                }
                throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
            case 26:
                ZI zi2 = (ZI) cr;
                byte[] bArr = GJ.f8348g;
                Provider providerD3 = AbstractC1114el.d();
                Vu vu2 = GJ.f8351k;
                XI xi = zi2.f12812c;
                ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(zi2.f12813d, Cr.s((UJ) vu2.y(xi.f12409b)));
                if (providerD3 != null) {
                    keyFactory2 = KeyFactory.getInstance("EC", providerD3);
                } else {
                    keyFactory2 = (KeyFactory) YJ.f12631g.f12632a.c("EC");
                }
                return new GJ((ECPublicKey) keyFactory2.generatePublic(eCPublicKeySpec), (EnumC0932bK) GJ.i.y(xi.f12410c), (VJ) GJ.f8350j.y(xi.f12408a), zi2.f12814e.b(), xi.f12411d.equals(AE.f6965m) ? GJ.f8349h : GJ.f8348g, providerD3);
            case 27:
                C1040dJ c1040dJ = (C1040dJ) cr;
                if (Cr.m(1)) {
                    try {
                        return IJ.a(c1040dJ);
                    } catch (GeneralSecurityException unused2) {
                        C1448kw c1448kw = c1040dJ.f13751d;
                        C1149fJ c1149fJ = c1040dJ.f13750c;
                        byte[] bArrB = ((C1313iK) c1448kw.f15314b).b();
                        c1149fJ.f14053e.b();
                        IJ ij2 = new IJ();
                        if (Cr.m(1)) {
                            if (bArrB.length == 32) {
                                AbstractC0933bL.j(AbstractC0933bL.p(bArrB));
                                return ij2;
                            }
                            throw new IllegalArgumentException("Given private key's length is not 32");
                        }
                        throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
                    }
                }
                throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
            case 28:
                C1149fJ c1149fJ2 = (C1149fJ) cr;
                if (Cr.m(1)) {
                    try {
                        return JJ.b(c1149fJ2);
                    } catch (GeneralSecurityException unused3) {
                        return new KJ(c1149fJ2.f14052d.b(), c1149fJ2.f14053e.b(), c1149fJ2.f14051c.f13548a.equals(C0931bJ.f13341d) ? new byte[]{0} : new byte[0]);
                    }
                }
                throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
            default:
                C1631oG c1631oG2 = ((PF) cr).f10334c;
                int i7 = NF.f9982b[AbstractC2984e.c(c1631oG2.f15925d)];
                KJ.b(c1631oG2);
                c1631oG2.f15926e.equals(EnumC1956uI.LEGACY);
                return new IJ();
        }
    }
}

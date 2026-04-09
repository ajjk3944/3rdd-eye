package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
public final /* synthetic */ class ME implements InterfaceC1361jG, InterfaceC0982cG, KF, IF, InterfaceC1091eG {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9852a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ME f9840b = new ME(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ME f9841c = new ME(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ME f9842d = new ME(2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ME f9843e = new ME(3);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ME f9844f = new ME(4);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ME f9845g = new ME(5);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ME f9846h = new ME(6);
    public static final /* synthetic */ ME i = new ME(7);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ ME f9847j = new ME(8);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ ME f9848k = new ME(9);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ ME f9849l = new ME(10);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ ME f9850m = new ME(11);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ ME f9851n = new ME(12);

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ ME f9824C = new ME(13);

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ ME f9825D = new ME(14);

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ ME f9826E = new ME(15);

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ ME f9827F = new ME(16);

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ ME f9828G = new ME(17);

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ ME f9829H = new ME(18);

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ ME f9830I = new ME(19);

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ ME f9831J = new ME(20);

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ ME f9832K = new ME(21);

    /* renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ ME f9833L = new ME(22);
    public static final /* synthetic */ ME M = new ME(23);

    /* renamed from: N, reason: collision with root package name */
    public static final /* synthetic */ ME f9834N = new ME(24);

    /* renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ ME f9835O = new ME(25);

    /* renamed from: P, reason: collision with root package name */
    public static final /* synthetic */ ME f9836P = new ME(26);

    /* renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ ME f9837Q = new ME(27);

    /* renamed from: R, reason: collision with root package name */
    public static final /* synthetic */ ME f9838R = new ME(28);

    /* renamed from: S, reason: collision with root package name */
    public static final /* synthetic */ ME f9839S = new ME(29);

    public /* synthetic */ ME(int i3) {
        this.f9852a = i3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0982cG
    public AbstractC1089eE a(C1685pG c1685pG) throws GeneralSecurityException {
        switch (this.f9852a) {
            case 1:
                C1037dG c1037dG = QE.f10590a;
                C0984cI c0984cI = c1685pG.f16155b;
                if (!c0984cI.A().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(c0984cI.A())));
                }
                try {
                    QK qkB = c0984cI.B();
                    XK xk = XK.f12412a;
                    int i3 = JK.f9277a;
                    return new PE(C1687pI.B(qkB, XK.f12413b).A(), QE.b(c0984cI.C()));
                } catch (C1636oL e6) {
                    throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e6);
                }
            case 5:
                C1037dG c1037dG2 = UE.f11625a;
                C0984cI c0984cI2 = c1685pG.f16155b;
                if (!c0984cI2.A().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(c0984cI2.A())));
                }
                try {
                    QK qkB2 = c0984cI2.B();
                    XK xk2 = XK.f12412a;
                    int i6 = JK.f9277a;
                    return UE.c(C1902tI.C(qkB2, XK.f12413b), c0984cI2.C());
                } catch (C1636oL e7) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e7);
                }
            case 11:
                C1037dG c1037dG3 = AbstractC0981cF.f13544a;
                C0984cI c0984cI3 = c1685pG.f16155b;
                if (!c0984cI3.A().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(c0984cI3.A())));
                }
                try {
                    QK qkB3 = c0984cI3.B();
                    XK xk3 = XK.f12412a;
                    int i7 = JK.f9277a;
                    C1147fH c1147fHC = C1147fH.C(qkB3, XK.f12413b);
                    if (c1147fHC.B().C() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C1677p8 c1677p8 = new C1677p8(6);
                    c1677p8.b(c1147fHC.A().B());
                    c1677p8.h(c1147fHC.B().B());
                    c1677p8.n(c1147fHC.A().A().A());
                    c1677p8.o(c1147fHC.B().A().B());
                    c1677p8.f16141e = AbstractC0981cF.c(c1147fHC.B().A().A());
                    c1677p8.f16142f = AbstractC0981cF.b(c0984cI3.C());
                    return c1677p8.q();
                } catch (C1636oL e8) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e8);
                }
            case 15:
                C1037dG c1037dG4 = AbstractC1036dF.f13744a;
                C0984cI c0984cI4 = c1685pG.f16155b;
                if (!c0984cI4.A().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(c0984cI4.A())));
                }
                try {
                    QK qkB4 = c0984cI4.B();
                    XK xk4 = XK.f12412a;
                    int i8 = JK.f9277a;
                    C1686pH c1686pHC = C1686pH.C(qkB4, XK.f12413b);
                    C2222zE c2222zE = new C2222zE(0);
                    c2222zE.a(c1686pHC.B());
                    c2222zE.e(c1686pHC.A().A());
                    c2222zE.g();
                    c2222zE.f17841e = AbstractC1036dF.b(c0984cI4.C());
                    return c2222zE.j();
                } catch (C1636oL e9) {
                    throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e9);
                }
            case 19:
                C1037dG c1037dG5 = AbstractC1145fF.f14045a;
                C0984cI c0984cI5 = c1685pG.f16155b;
                if (!c0984cI5.A().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(c0984cI5.A())));
                }
                try {
                    QK qkB5 = c0984cI5.B();
                    XK xk5 = XK.f12412a;
                    int i9 = JK.f9277a;
                    C2009vH c2009vHC = C2009vH.C(qkB5, XK.f12413b);
                    if (c2009vHC.B() != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    C2222zE c2222zE2 = new C2222zE(1);
                    c2222zE2.a(c2009vHC.A());
                    c2222zE2.d();
                    c2222zE2.g();
                    c2222zE2.f17841e = AbstractC1145fF.b(c0984cI5.C());
                    return c2222zE2.k();
                } catch (C1636oL e10) {
                    throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e10);
                }
            case 23:
                C1037dG c1037dG6 = AbstractC1254hF.f14466a;
                C0984cI c0984cI6 = c1685pG.f16155b;
                if (!c0984cI6.A().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(c0984cI6.A())));
                }
                try {
                    QK qkB6 = c0984cI6.B();
                    XK xk6 = XK.f12412a;
                    int i10 = JK.f9277a;
                    C2225zH c2225zHC = C2225zH.C(qkB6, XK.f12413b);
                    if (c2225zHC.B() != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    int iA = c2225zHC.A();
                    if (iA == 16 || iA == 32) {
                        return new HE(iA, AbstractC1254hF.b(c0984cI6.C()));
                    }
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(iA)));
                } catch (C1636oL e11) {
                    throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e11);
                }
            default:
                C1037dG c1037dG7 = AbstractC1468lF.f15372a;
                C0984cI c0984cI7 = c1685pG.f16155b;
                if (!c0984cI7.A().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(c0984cI7.A())));
                }
                try {
                    QK qkB7 = c0984cI7.B();
                    XK xk7 = XK.f12412a;
                    int i11 = JK.f9277a;
                    DH.A(qkB7, XK.f12413b);
                    return new KE(AbstractC1468lF.b(c0984cI7.C()));
                } catch (C1636oL e12) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e12);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.IF
    public Cr b(C1631oG c1631oG) throws GeneralSecurityException {
        boolean z6 = false;
        switch (this.f9852a) {
            case 3:
                C1037dG c1037dG = QE.f10590a;
                if (!c1631oG.f15922a.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
                }
                try {
                    QK qk = c1631oG.f15924c;
                    XK xk = XK.f12412a;
                    int i3 = JK.f9277a;
                    C1579nI c1579nIC = C1579nI.C(qk, XK.f12413b);
                    if (c1579nIC.A() == 0) {
                        return OE.X(new PE(c1579nIC.B().A(), QE.b(c1631oG.f15926e)), c1631oG.f15927f);
                    }
                    String strValueOf = String.valueOf(c1579nIC);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 49);
                    sb.append("KmsAeadKey are only accepted with version 0, got ");
                    sb.append(strValueOf);
                    throw new GeneralSecurityException(sb.toString());
                } catch (C1636oL e6) {
                    throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e6);
                }
            case 7:
                C1037dG c1037dG2 = UE.f11625a;
                if (!c1631oG.f15922a.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
                }
                try {
                    QK qk2 = c1631oG.f15924c;
                    XK xk2 = XK.f12412a;
                    int i6 = JK.f9277a;
                    C1794rI c1794rIC = C1794rI.C(qk2, XK.f12413b);
                    if (c1794rIC.A() == 0) {
                        return RE.X(UE.c(c1794rIC.B(), c1631oG.f15926e), c1631oG.f15927f);
                    }
                    String strValueOf2 = String.valueOf(c1794rIC);
                    StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 58);
                    sb2.append("KmsEnvelopeAeadKeys are only accepted with version 0, got ");
                    sb2.append(strValueOf2);
                    throw new GeneralSecurityException(sb2.toString());
                } catch (C1636oL e7) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e7);
                }
            case 13:
                C1037dG c1037dG3 = AbstractC0981cF.f13544a;
                if (!c1631oG.f15922a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
                }
                try {
                    QK qk3 = c1631oG.f15924c;
                    XK xk3 = XK.f12412a;
                    int i7 = JK.f9277a;
                    C1038dH c1038dHD = C1038dH.D(qk3, XK.f12413b);
                    if (c1038dHD.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (c1038dHD.B().A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                    }
                    if (c1038dHD.C().A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    C1677p8 c1677p8 = new C1677p8(6);
                    c1677p8.b(c1038dHD.B().C().f());
                    c1677p8.h(c1038dHD.C().C().f());
                    c1677p8.n(c1038dHD.B().B().A());
                    c1677p8.o(c1038dHD.C().B().B());
                    c1677p8.f16141e = AbstractC0981cF.c(c1038dHD.C().B().A());
                    c1677p8.f16142f = AbstractC0981cF.b(c1631oG.f15926e);
                    C2060wE c2060wEQ = c1677p8.q();
                    C1431kf c1431kf = new C1431kf(29);
                    c1431kf.f15173b = c2060wEQ;
                    c1431kf.f15174c = C1448kw.g(c1038dHD.B().C().u());
                    c1431kf.f15175d = C1448kw.g(c1038dHD.C().C().u());
                    c1431kf.f15176e = c1631oG.f15927f;
                    return c1431kf.y();
                } catch (C1636oL unused) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
                }
            case 17:
                C1037dG c1037dG4 = AbstractC1036dF.f13744a;
                if (!c1631oG.f15922a.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
                }
                try {
                    QK qk4 = c1631oG.f15924c;
                    XK xk4 = XK.f12412a;
                    int i8 = JK.f9277a;
                    C1578nH c1578nHD = C1578nH.D(qk4, XK.f12413b);
                    if (c1578nHD.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C2222zE c2222zE = new C2222zE(0);
                    c2222zE.a(c1578nHD.C().f());
                    c2222zE.e(c1578nHD.B().A());
                    c2222zE.g();
                    c2222zE.f17841e = AbstractC1036dF.b(c1631oG.f15926e);
                    BE beJ = c2222zE.j();
                    C2041vw c2041vw = new C2041vw(3, z6);
                    c2041vw.f17369b = beJ;
                    c2041vw.f17370c = C1448kw.g(c1578nHD.C().u());
                    c2041vw.f17371d = c1631oG.f15927f;
                    return c2041vw.l();
                } catch (C1636oL unused2) {
                    throw new GeneralSecurityException("Parsing AesEaxcKey failed");
                }
            case 21:
                C1037dG c1037dG5 = AbstractC1145fF.f14045a;
                if (!c1631oG.f15922a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
                }
                try {
                    QK qk5 = c1631oG.f15924c;
                    XK xk5 = XK.f12412a;
                    int i9 = JK.f9277a;
                    C1901tH c1901tHC = C1901tH.C(qk5, XK.f12413b);
                    if (c1901tHC.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    C2222zE c2222zE2 = new C2222zE(1);
                    c2222zE2.a(c1901tHC.B().f());
                    c2222zE2.d();
                    c2222zE2.g();
                    c2222zE2.f17841e = AbstractC1145fF.b(c1631oG.f15926e);
                    EE eeK = c2222zE2.k();
                    C2041vw c2041vw2 = new C2041vw(4, z6);
                    c2041vw2.f17369b = eeK;
                    c2041vw2.f17370c = C1448kw.g(c1901tHC.B().u());
                    c2041vw2.f17371d = c1631oG.f15927f;
                    return c2041vw2.p();
                } catch (C1636oL unused3) {
                    throw new GeneralSecurityException("Parsing AesGcmKey failed");
                }
            case 25:
                C1037dG c1037dG6 = AbstractC1254hF.f14466a;
                if (!c1631oG.f15922a.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
                }
                try {
                    QK qk6 = c1631oG.f15924c;
                    XK xk6 = XK.f12412a;
                    int i10 = JK.f9277a;
                    C2117xH c2117xHC = C2117xH.C(qk6, XK.f12413b);
                    if (c2117xHC.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    int iF = c2117xHC.B().f();
                    if (iF != 16 && iF != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(iF)));
                    }
                    HE he = new HE(iF, AbstractC1254hF.b(c1631oG.f15926e));
                    C2041vw c2041vw3 = new C2041vw(5, z6);
                    c2041vw3.f17369b = he;
                    c2041vw3.f17370c = C1448kw.g(c2117xHC.B().u());
                    c2041vw3.f17371d = c1631oG.f15927f;
                    return c2041vw3.q();
                } catch (C1636oL unused4) {
                    throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                }
            default:
                C1037dG c1037dG7 = AbstractC1468lF.f15372a;
                if (!c1631oG.f15922a.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    QK qk7 = c1631oG.f15924c;
                    XK xk7 = XK.f12412a;
                    int i11 = JK.f9277a;
                    CH chC = CH.C(qk7, XK.f12413b);
                    if (chC.A() == 0) {
                        return IE.X(AbstractC1468lF.b(c1631oG.f15926e), C1448kw.g(chC.B().u()), c1631oG.f15927f);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (C1636oL unused5) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1361jG, com.google.android.gms.internal.ads.KF
    public C1631oG c(Cr cr) throws GeneralSecurityException {
        switch (this.f9852a) {
            case 2:
                OE oe = (OE) cr;
                C1037dG c1037dG = QE.f10590a;
                C1525mI c1525mID = C1579nI.D();
                C1633oI c1633oIC = C1687pI.C();
                String str = oe.f10171c.f10332a;
                c1633oIC.b();
                ((C1687pI) c1633oIC.f13551b).E(str);
                C1687pI c1687pI = (C1687pI) c1633oIC.d();
                c1525mID.b();
                ((C1579nI) c1525mID.f13551b).F(c1687pI);
                return C1631oG.a("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((C1579nI) c1525mID.d()).a(), 5, QE.a(oe.f10171c.f10333b), oe.f10173e);
            case 6:
                RE re = (RE) cr;
                C1037dG c1037dG2 = UE.f11625a;
                C1741qI c1741qID = C1794rI.D();
                C1902tI c1902tIB = UE.b(re.f10873c);
                c1741qID.b();
                ((C1794rI) c1741qID.f13551b).F(c1902tIB);
                return C1631oG.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((C1794rI) c1741qID.d()).a(), 5, UE.a(re.f10873c.f11158a), re.f10875e);
            case 12:
                C1737qE c1737qE = (C1737qE) cr;
                C1037dG c1037dG3 = AbstractC0981cF.f13544a;
                C0983cH c0983cHE = C1038dH.E();
                C1202gH c1202gHD = C1256hH.D();
                C1416kH c1416kHB = C1470lH.B();
                int i3 = c1737qE.f16330c.f17411c;
                c1416kHB.b();
                ((C1470lH) c1416kHB.f13551b).D(i3);
                C1470lH c1470lH = (C1470lH) c1416kHB.d();
                c1202gHD.b();
                ((C1256hH) c1202gHD.f13551b).F(c1470lH);
                byte[] bArrB = ((C1313iK) c1737qE.f16331d.f15314b).b();
                OK okR = QK.r(0, bArrB.length, bArrB);
                c1202gHD.b();
                ((C1256hH) c1202gHD.f13551b).G(okR);
                C1256hH c1256hH = (C1256hH) c1202gHD.d();
                c0983cHE.b();
                ((C1038dH) c0983cHE.f13551b).G(c1256hH);
                SH shE = TH.E();
                C2060wE c2060wE = c1737qE.f16330c;
                XH xhD = AbstractC0981cF.d(c2060wE);
                shE.b();
                ((TH) shE.f13551b).H(xhD);
                byte[] bArrB2 = ((C1313iK) c1737qE.f16332e.f15314b).b();
                OK okR2 = QK.r(0, bArrB2.length, bArrB2);
                shE.b();
                ((TH) shE.f13551b).I(okR2);
                TH th = (TH) shE.d();
                c0983cHE.b();
                ((C1038dH) c0983cHE.f13551b).H(th);
                return C1631oG.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((C1038dH) c0983cHE.d()).a(), 2, AbstractC0981cF.a(c2060wE.f17413e), c1737qE.f16334g);
            case 16:
                C2114xE c2114xE = (C2114xE) cr;
                C1037dG c1037dG4 = AbstractC1036dF.f13744a;
                C1524mH c1524mHE = C1578nH.E();
                BE be = c2114xE.f17558c;
                C1740qH c1740qHB = C1793rH.B();
                int i6 = be.f7320b;
                c1740qHB.b();
                ((C1793rH) c1740qHB.f13551b).D(i6);
                C1793rH c1793rH = (C1793rH) c1740qHB.d();
                c1524mHE.b();
                ((C1578nH) c1524mHE.f13551b).G(c1793rH);
                byte[] bArrB3 = ((C1313iK) c2114xE.f17559d.f15314b).b();
                OK okR3 = QK.r(0, bArrB3.length, bArrB3);
                c1524mHE.b();
                ((C1578nH) c1524mHE.f13551b).H(okR3);
                return C1631oG.a("type.googleapis.com/google.crypto.tink.AesEaxKey", ((C1578nH) c1524mHE.d()).a(), 2, AbstractC1036dF.a(c2114xE.f17558c.f7321c), c2114xE.f17561f);
            case 20:
                CE ce = (CE) cr;
                C1037dG c1037dG5 = AbstractC1145fF.f14045a;
                C1847sH c1847sHD = C1901tH.D();
                byte[] bArrB4 = ((C1313iK) ce.f7554d.f15314b).b();
                OK okR4 = QK.r(0, bArrB4.length, bArrB4);
                c1847sHD.b();
                ((C1901tH) c1847sHD.f13551b).F(okR4);
                return C1631oG.a("type.googleapis.com/google.crypto.tink.AesGcmKey", ((C1901tH) c1847sHD.d()).a(), 2, AbstractC1145fF.a(ce.f7553c.f7932b), ce.f7556f);
            case 24:
                FE fe = (FE) cr;
                C1037dG c1037dG6 = AbstractC1254hF.f14466a;
                C2063wH c2063wHD = C2117xH.D();
                byte[] bArrB5 = ((C1313iK) fe.f8072d.f15314b).b();
                OK okR5 = QK.r(0, bArrB5.length, bArrB5);
                c2063wHD.b();
                ((C2117xH) c2063wHD.f13551b).F(okR5);
                return C1631oG.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((C2117xH) c2063wHD.d()).a(), 2, AbstractC1254hF.a(fe.f8071c.f8879b), fe.f8074f);
            default:
                IE ie = (IE) cr;
                C1037dG c1037dG7 = AbstractC1468lF.f15372a;
                AH ahD = CH.D();
                byte[] bArrB6 = ((C1313iK) ie.f9083d.f15314b).b();
                OK okR6 = QK.r(0, bArrB6.length, bArrB6);
                ahD.b();
                ((CH) ahD.f13551b).F(okR6);
                return C1631oG.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((CH) ahD.d()).a(), 2, AbstractC1468lF.a(ie.f9082c.f9474a), ie.f9085f);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1091eG
    public C1685pG e(AbstractC1089eE abstractC1089eE) throws GeneralSecurityException {
        switch (this.f9852a) {
            case 4:
                PE pe = (PE) abstractC1089eE;
                C1037dG c1037dG = QE.f10590a;
                C0930bI c0930bIE = C0984cI.E();
                c0930bIE.g("type.googleapis.com/google.crypto.tink.KmsAeadKey");
                C1633oI c1633oIC = C1687pI.C();
                String str = pe.f10332a;
                c1633oIC.b();
                ((C1687pI) c1633oIC.f13551b).E(str);
                c0930bIE.h(((C1687pI) c1633oIC.d()).a());
                c0930bIE.i(QE.a(pe.f10333b));
                return C1685pG.a((C0984cI) c0930bIE.d());
            case 8:
                SE se = (SE) abstractC1089eE;
                C1037dG c1037dG2 = UE.f11625a;
                C0930bI c0930bIE2 = C0984cI.E();
                c0930bIE2.g("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
                c0930bIE2.h(UE.b(se).a());
                c0930bIE2.i(UE.a(se.f11158a));
                return C1685pG.a((C0984cI) c0930bIE2.d());
            case 14:
                C2060wE c2060wE = (C2060wE) abstractC1089eE;
                C1037dG c1037dG3 = AbstractC0981cF.f13544a;
                C0930bI c0930bIE3 = C0984cI.E();
                c0930bIE3.g("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
                C1092eH c1092eHD = C1147fH.D();
                C1310iH c1310iHC = C1362jH.C();
                C1416kH c1416kHB = C1470lH.B();
                int i3 = c2060wE.f17411c;
                c1416kHB.b();
                ((C1470lH) c1416kHB.f13551b).D(i3);
                C1470lH c1470lH = (C1470lH) c1416kHB.d();
                c1310iHC.b();
                ((C1362jH) c1310iHC.f13551b).E(c1470lH);
                int i6 = c2060wE.f17409a;
                c1310iHC.b();
                ((C1362jH) c1310iHC.f13551b).F(i6);
                C1362jH c1362jH = (C1362jH) c1310iHC.d();
                c1092eHD.b();
                ((C1147fH) c1092eHD.f13551b).E(c1362jH);
                UH uhE = VH.E();
                XH xhD = AbstractC0981cF.d(c2060wE);
                uhE.b();
                ((VH) uhE.f13551b).G(xhD);
                int i7 = c2060wE.f17410b;
                uhE.b();
                ((VH) uhE.f13551b).H(i7);
                VH vh = (VH) uhE.d();
                c1092eHD.b();
                ((C1147fH) c1092eHD.f13551b).F(vh);
                c0930bIE3.h(((C1147fH) c1092eHD.d()).a());
                c0930bIE3.i(AbstractC0981cF.a(c2060wE.f17413e));
                return C1685pG.a((C0984cI) c0930bIE3.d());
            case 18:
                BE be = (BE) abstractC1089eE;
                C1037dG c1037dG4 = AbstractC1036dF.f13744a;
                C0930bI c0930bIE4 = C0984cI.E();
                c0930bIE4.g("type.googleapis.com/google.crypto.tink.AesEaxKey");
                C1632oH c1632oHD = C1686pH.D();
                C1740qH c1740qHB = C1793rH.B();
                int i8 = be.f7320b;
                c1740qHB.b();
                ((C1793rH) c1740qHB.f13551b).D(i8);
                C1793rH c1793rH = (C1793rH) c1740qHB.d();
                c1632oHD.b();
                ((C1686pH) c1632oHD.f13551b).E(c1793rH);
                int i9 = be.f7319a;
                c1632oHD.b();
                ((C1686pH) c1632oHD.f13551b).F(i9);
                c0930bIE4.h(((C1686pH) c1632oHD.d()).a());
                c0930bIE4.i(AbstractC1036dF.a(be.f7321c));
                return C1685pG.a((C0984cI) c0930bIE4.d());
            case 22:
                EE ee = (EE) abstractC1089eE;
                C1037dG c1037dG5 = AbstractC1145fF.f14045a;
                C0930bI c0930bIE5 = C0984cI.E();
                c0930bIE5.g("type.googleapis.com/google.crypto.tink.AesGcmKey");
                C1955uH c1955uHD = C2009vH.D();
                int i10 = ee.f7931a;
                c1955uHD.b();
                ((C2009vH) c1955uHD.f13551b).E(i10);
                c0930bIE5.h(((C2009vH) c1955uHD.d()).a());
                c0930bIE5.i(AbstractC1145fF.a(ee.f7932b));
                return C1685pG.a((C0984cI) c0930bIE5.d());
            default:
                HE he = (HE) abstractC1089eE;
                C1037dG c1037dG6 = AbstractC1254hF.f14466a;
                C0930bI c0930bIE6 = C0984cI.E();
                c0930bIE6.g("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
                C2171yH c2171yHD = C2225zH.D();
                int i11 = he.f8878a;
                c2171yHD.b();
                ((C2225zH) c2171yHD.f13551b).E(i11);
                c0930bIE6.h(((C2225zH) c2171yHD.d()).a());
                c0930bIE6.i(AbstractC1254hF.a(he.f8879b));
                return C1685pG.a((C0984cI) c0930bIE6.d());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1361jG, com.google.android.gms.internal.ads.KF
    public Object c(Cr cr) {
        switch (this.f9852a) {
            case 0:
                MF mf = NE.f9978a;
                AbstractC0980cE.a(((RE) cr).f10873c.f11159b);
                throw null;
            case 9:
                WE we = (WE) cr;
                we.getClass();
                return new C1738qF(((C1313iK) we.f12190d.f15314b).b(), we.f12191e, we.f12189c.f12620b);
            default:
                ZE ze = (ZE) cr;
                C1309iG c1309iG = AbstractC0872aF.f13085a;
                try {
                    C1308iF.b();
                    return new C1845sF(((C1313iK) ze.f12807d.f15314b).b(), ze.f12808e.b(), C1308iF.b().getProvider());
                } catch (GeneralSecurityException unused) {
                    return new C1684pF(((C1313iK) ze.f12807d.f15314b).b(), 3, ze.f12808e.b());
                }
        }
    }
}

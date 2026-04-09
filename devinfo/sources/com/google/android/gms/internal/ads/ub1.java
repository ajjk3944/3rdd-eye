package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Provider;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ub1 implements pd1, xc1, vc1, rd1, wd1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17170a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ub1 f17147b = new ub1(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ub1 f17148c = new ub1(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ub1 f17149d = new ub1(2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ub1 f17150e = new ub1(3);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ub1 f17151f = new ub1(4);
    public static final /* synthetic */ ub1 g = new ub1(5);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ub1 f17152h = new ub1(6);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ ub1 f17153i = new ub1(7);
    public static final /* synthetic */ ub1 j = new ub1(8);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ ub1 f17154k = new ub1(9);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ ub1 f17155l = new ub1(10);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ ub1 f17156m = new ub1(11);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ ub1 f17157n = new ub1(12);

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ ub1 f17158o = new ub1(13);

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ ub1 f17159p = new ub1(14);

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ ub1 f17160q = new ub1(15);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ ub1 f17161r = new ub1(16);

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ ub1 f17162s = new ub1(17);

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ ub1 f17163t = new ub1(18);

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ ub1 f17164u = new ub1(19);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ ub1 f17165v = new ub1(20);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ ub1 f17166w = new ub1(21);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ ub1 f17167x = new ub1(22);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ ub1 f17168y = new ub1(24);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ ub1 f17169z = new ub1(25);
    public static final /* synthetic */ ub1 A = new ub1(26);
    public static final /* synthetic */ ub1 B = new ub1(27);
    public static final /* synthetic */ ub1 C = new ub1(28);
    public static final /* synthetic */ ub1 D = new ub1(29);

    public /* synthetic */ ub1(int i4) {
        this.f17170a = i4;
    }

    @Override // com.google.android.gms.internal.ads.xc1
    public be1 a(al0 al0Var) {
        switch (this.f17170a) {
            case 1:
                ta1 ta1Var = (ta1) al0Var;
                qd1 qd1Var = vb1.f17577a;
                kg1 kg1VarD = lg1.D();
                byte[] bArrB = ((vl1) ta1Var.f16767d.f13160b).b();
                zm1 zm1VarV = bn1.v(0, bArrB.length, bArrB);
                kg1VarD.b();
                ((lg1) kg1VarD.f14755b).F(zm1VarV);
                return be1.I("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((lg1) kg1VarD.e()).a(), 2, vb1.a(ta1Var.f16766c.f17576b), ta1Var.f16769f);
            case 5:
                wa1 wa1Var = (wa1) al0Var;
                qd1 qd1Var2 = yb1.f18700a;
                og1 og1VarD = qg1.D();
                byte[] bArrB2 = ((vl1) wa1Var.f17954d.f13160b).b();
                zm1 zm1VarV2 = bn1.v(0, bArrB2.length, bArrB2);
                og1VarD.b();
                ((qg1) og1VarD.f14755b).F(zm1VarV2);
                return be1.I("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((qg1) og1VarD.e()).a(), 2, yb1.a(wa1Var.f17953c.f18692a), wa1Var.f17956f);
            case 9:
                jb1 jb1Var = (jb1) al0Var;
                qd1 qd1Var3 = ec1.f10759a;
                aj1 aj1VarE = bj1.E();
                byte[] bArrB3 = ((vl1) jb1Var.f12710d.f13160b).b();
                zm1 zm1VarV3 = bn1.v(0, bArrB3.length, bArrB3);
                aj1VarE.b();
                ((bj1) aj1VarE.f14755b).G(zm1VarV3);
                ej1 ej1VarB = fj1.B();
                lb1 lb1Var = jb1Var.f12709c;
                int i4 = lb1Var.f13451b;
                ej1VarB.b();
                ((fj1) ej1VarB.f14755b).D(i4);
                fj1 fj1Var = (fj1) ej1VarB.e();
                aj1VarE.b();
                ((bj1) aj1VarE.f14755b).F(fj1Var);
                return be1.I("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((bj1) aj1VarE.e()).a(), 2, ec1.a(lb1Var.f13450a), jb1Var.f12712f);
            case 13:
                mb1 mb1Var = (mb1) al0Var;
                qd1 qd1Var4 = gc1.f11493a;
                gj1 gj1VarD = hj1.D();
                byte[] bArrB4 = ((vl1) mb1Var.f13860d.f13160b).b();
                zm1 zm1VarV4 = bn1.v(0, bArrB4.length, bArrB4);
                gj1VarD.b();
                ((hj1) gj1VarD.f14755b).F(zm1VarV4);
                return be1.I("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((hj1) gj1VarD.e()).a(), 2, gc1.a(mb1Var.f13859c.f14655a), mb1Var.f13862f);
            case 17:
                be1 be1Var = ((cd1) al0Var).f10087c;
                int i10 = ad1.f9308b[i3.e.c(be1Var.f9657a)];
                return be1Var;
            case 25:
                ke1 ke1Var = (ke1) al0Var;
                qd1 qd1Var5 = cf1.f10100a;
                jf1 jf1VarE = kf1.E();
                me1 me1Var = ke1Var.f13145c;
                nf1 nf1VarB = pf1.B();
                int i11 = me1Var.f13882b;
                nf1VarB.b();
                ((pf1) nf1VarB.f14755b).D(i11);
                pf1 pf1Var = (pf1) nf1VarB.e();
                jf1VarE.b();
                ((kf1) jf1VarE.f14755b).H(pf1Var);
                byte[] bArrB5 = ((vl1) ke1Var.f13146d.f13160b).b();
                zm1 zm1VarV5 = bn1.v(0, bArrB5.length, bArrB5);
                jf1VarE.b();
                ((kf1) jf1VarE.f14755b).G(zm1VarV5);
                return be1.I("type.googleapis.com/google.crypto.tink.AesCmacKey", ((kf1) jf1VarE.e()).a(), 2, cf1.a(ke1Var.f13145c.f13883c), ke1Var.f13148f);
            default:
                qe1 qe1Var = (qe1) al0Var;
                rt rtVar = ef1.f10777a;
                gh1 gh1VarE = hh1.E();
                ue1 ue1Var = qe1Var.f15328c;
                kh1 kh1VarC = lh1.C();
                int i12 = ue1Var.f17193b;
                kh1VarC.b();
                ((lh1) kh1VarC.f14755b).F(i12);
                fh1 fh1Var = (fh1) ef1.f10778b.o(ue1Var.f17195d);
                kh1VarC.b();
                ((lh1) kh1VarC.f14755b).E(fh1Var);
                lh1 lh1Var = (lh1) kh1VarC.e();
                gh1VarE.b();
                ((hh1) gh1VarE.f14755b).H(lh1Var);
                byte[] bArrB6 = ((vl1) qe1Var.f15329d.f13160b).b();
                zm1 zm1VarV6 = bn1.v(0, bArrB6.length, bArrB6);
                gh1VarE.b();
                ((hh1) gh1VarE.f14755b).I(zm1VarV6);
                return be1.I("type.googleapis.com/google.crypto.tink.HmacKey", ((hh1) gh1VarE.e()).a(), 2, (ii1) ef1.f10777a.o(qe1Var.f15328c.f17194c), qe1Var.f15331f);
        }
    }

    @Override // com.google.android.gms.internal.ads.pd1
    public s91 f(ce1 ce1Var) throws GeneralSecurityException {
        switch (this.f17170a) {
            case 0:
                qd1 qd1Var = vb1.f17577a;
                qh1 qh1Var = (qh1) ce1Var.f10095c;
                if (!qh1Var.A().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(qh1Var.A())));
                }
                try {
                    bn1 bn1VarB = qh1Var.B();
                    jn1 jn1Var = jn1.f12801a;
                    int i4 = um1.f17262a;
                    ng1 ng1VarC = ng1.C(bn1VarB, jn1.f12802b);
                    if (ng1VarC.B() != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    int iA = ng1VarC.A();
                    if (iA == 16 || iA == 32) {
                        return new va1(iA, vb1.b(qh1Var.C()));
                    }
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(iA)));
                } catch (ao1 e2) {
                    throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e2);
                }
            case 4:
                qd1 qd1Var2 = yb1.f18700a;
                qh1 qh1Var2 = (qh1) ce1Var.f10095c;
                if (!qh1Var2.A().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(qh1Var2.A())));
                }
                try {
                    bn1 bn1VarB2 = qh1Var2.B();
                    jn1 jn1Var2 = jn1.f12801a;
                    int i10 = um1.f17262a;
                    rg1.A(bn1VarB2, jn1.f12802b);
                    return new ya1(yb1.b(qh1Var2.C()));
                } catch (ao1 e10) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e10);
                }
            case 8:
                qd1 qd1Var3 = ec1.f10759a;
                qh1 qh1Var3 = (qh1) ce1Var.f10095c;
                if (!qh1Var3.A().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(qh1Var3.A())));
                }
                try {
                    bn1 bn1VarB3 = qh1Var3.B();
                    jn1 jn1Var3 = jn1.f12801a;
                    int i11 = um1.f17262a;
                    dj1 dj1VarC = dj1.C(bn1VarB3, jn1.f12802b);
                    if (dj1VarC.A() == 0) {
                        return lb1.b(dj1VarC.B().A(), ec1.b(qh1Var3.C()));
                    }
                    throw new GeneralSecurityException("Only version 0 parameters are accepted");
                } catch (ao1 e11) {
                    throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e11);
                }
            case 12:
                qd1 qd1Var4 = gc1.f11493a;
                qh1 qh1Var4 = (qh1) ce1Var.f10095c;
                if (!qh1Var4.A().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(qh1Var4.A())));
                }
                try {
                    bn1 bn1VarB4 = qh1Var4.B();
                    jn1 jn1Var4 = jn1.f12801a;
                    int i12 = um1.f17262a;
                    if (jj1.B(bn1VarB4, jn1.f12802b).A() == 0) {
                        return new ob1(gc1.b(qh1Var4.C()));
                    }
                    throw new GeneralSecurityException("Only version 0 parameters are accepted");
                } catch (ao1 e12) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e12);
                }
            case 24:
                qd1 qd1Var5 = cf1.f10100a;
                qh1 qh1Var5 = (qh1) ce1Var.f10095c;
                if (!qh1Var5.A().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(qh1Var5.A())));
                }
                try {
                    bn1 bn1VarB5 = qh1Var5.B();
                    jn1 jn1Var5 = jn1.f12801a;
                    int i13 = um1.f17262a;
                    mf1 mf1VarC = mf1.C(bn1VarB5, jn1.f12802b);
                    av0 av0Var = new av0(8);
                    av0Var.c(mf1VarC.A());
                    av0Var.k(mf1VarC.B().A());
                    av0Var.f9424d = cf1.b(qh1Var5.C());
                    return av0Var.s();
                } catch (ao1 e13) {
                    throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e13);
                }
            default:
                rt rtVar = ef1.f10777a;
                qh1 qh1Var6 = (qh1) ce1Var.f10095c;
                if (!qh1Var6.A().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(qh1Var6.A())));
                }
                try {
                    bn1 bn1VarB6 = qh1Var6.B();
                    jn1 jn1Var6 = jn1.f12801a;
                    int i14 = um1.f17262a;
                    jh1 jh1VarD = jh1.D(bn1VarB6, jn1.f12802b);
                    if (jh1VarD.C() != 0) {
                        int iC = jh1VarD.C();
                        throw new GeneralSecurityException(d.h.q(iC, "Parsing HmacParameters failed: unknown Version ", new StringBuilder(String.valueOf(iC).length() + 47)));
                    }
                    oa1 oa1Var = new oa1(3);
                    oa1Var.a(jh1VarD.B());
                    oa1Var.d(jh1VarD.A().B());
                    oa1Var.f14636d = (se1) ef1.f10778b.t(jh1VarD.A().A());
                    oa1Var.f14637e = (te1) ef1.f10777a.t(qh1Var6.C());
                    return oa1Var.l();
                } catch (ao1 e14) {
                    throw new GeneralSecurityException("Parsing HmacParameters failed: ", e14);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.vc1
    public al0 h(be1 be1Var) throws GeneralSecurityException {
        boolean z3 = false;
        switch (this.f17170a) {
            case 2:
                qd1 qd1Var = vb1.f17577a;
                if (!((String) be1Var.f9658b).equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
                }
                try {
                    bn1 bn1Var = (bn1) be1Var.f9660d;
                    jn1 jn1Var = jn1.f12801a;
                    int i4 = um1.f17262a;
                    lg1 lg1VarC = lg1.C(bn1Var, jn1.f12802b);
                    if (lg1VarC.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    int i10 = lg1VarC.B().i();
                    if (i10 != 16 && i10 != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
                    }
                    va1 va1Var = new va1(i10, vb1.b((ii1) be1Var.f9661e));
                    av0 av0Var = new av0(5, z3);
                    av0Var.f9422b = va1Var;
                    av0Var.f9423c = kh0.l(lg1VarC.B().y());
                    av0Var.f9424d = (Integer) be1Var.f9662f;
                    return av0Var.q();
                } catch (ao1 unused) {
                    throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                }
            case 6:
                qd1 qd1Var2 = yb1.f18700a;
                if (!((String) be1Var.f9658b).equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    bn1 bn1Var2 = (bn1) be1Var.f9660d;
                    jn1 jn1Var2 = jn1.f12801a;
                    int i11 = um1.f17262a;
                    qg1 qg1VarC = qg1.C(bn1Var2, jn1.f12802b);
                    if (qg1VarC.A() == 0) {
                        return wa1.a0(yb1.b((ii1) be1Var.f9661e), kh0.l(qg1VarC.B().y()), (Integer) be1Var.f9662f);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (ao1 unused2) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                }
            case 10:
                qd1 qd1Var3 = ec1.f10759a;
                if (!((String) be1Var.f9658b).equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
                }
                try {
                    bn1 bn1Var3 = (bn1) be1Var.f9660d;
                    jn1 jn1Var3 = jn1.f12801a;
                    int i12 = um1.f17262a;
                    bj1 bj1VarD = bj1.D(bn1Var3, jn1.f12802b);
                    if (bj1VarD.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (bj1VarD.C().i() == 32) {
                        return jb1.a0(lb1.b(bj1VarD.B().A(), ec1.b((ii1) be1Var.f9661e)), kh0.l(bj1VarD.C().y()), (Integer) be1Var.f9662f);
                    }
                    throw new GeneralSecurityException("Only 32 byte key size is accepted");
                } catch (ao1 unused3) {
                    throw new GeneralSecurityException("Parsing XAesGcmKey failed");
                }
            case 14:
                qd1 qd1Var4 = gc1.f11493a;
                if (!((String) be1Var.f9658b).equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    bn1 bn1Var4 = (bn1) be1Var.f9660d;
                    jn1 jn1Var4 = jn1.f12801a;
                    int i13 = um1.f17262a;
                    hj1 hj1VarC = hj1.C(bn1Var4, jn1.f12802b);
                    if (hj1VarC.A() == 0) {
                        return mb1.a0(gc1.b((ii1) be1Var.f9661e), kh0.l(hj1VarC.B().y()), (Integer) be1Var.f9662f);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (ao1 unused4) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                }
            default:
                qd1 qd1Var5 = cf1.f10100a;
                if (!((String) be1Var.f9658b).equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
                }
                try {
                    bn1 bn1Var5 = (bn1) be1Var.f9660d;
                    jn1 jn1Var5 = jn1.f12801a;
                    int i14 = um1.f17262a;
                    kf1 kf1VarD = kf1.D(bn1Var5, jn1.f12802b);
                    if (kf1VarD.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    av0 av0Var2 = new av0(8);
                    av0Var2.c(kf1VarD.B().i());
                    av0Var2.k(kf1VarD.C().A());
                    av0Var2.f9424d = cf1.b((ii1) be1Var.f9661e);
                    me1 me1VarS = av0Var2.s();
                    av0 av0Var3 = new av0(7, z3);
                    av0Var3.f9422b = me1VarS;
                    av0Var3.f9423c = kh0.l(kf1VarD.B().y());
                    av0Var3.f9424d = (Integer) be1Var.f9662f;
                    return av0Var3.r();
                } catch (ao1 | IllegalArgumentException unused5) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.rd1
    public ce1 i(s91 s91Var) {
        switch (this.f17170a) {
            case 3:
                va1 va1Var = (va1) s91Var;
                qd1 qd1Var = vb1.f17577a;
                ph1 ph1VarE = qh1.E();
                ph1VarE.h("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
                mg1 mg1VarD = ng1.D();
                int i4 = va1Var.f17575a;
                mg1VarD.b();
                ((ng1) mg1VarD.f14755b).E(i4);
                ph1VarE.i(((ng1) mg1VarD.e()).a());
                ph1VarE.j(vb1.a(va1Var.f17576b));
                return ce1.e((qh1) ph1VarE.e());
            case 7:
                qd1 qd1Var2 = yb1.f18700a;
                ph1 ph1VarE2 = qh1.E();
                ph1VarE2.h("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
                ph1VarE2.i(rg1.B().a());
                ph1VarE2.j(yb1.a(((ya1) s91Var).f18692a));
                return ce1.e((qh1) ph1VarE2.e());
            case 11:
                lb1 lb1Var = (lb1) s91Var;
                qd1 qd1Var3 = ec1.f10759a;
                ph1 ph1VarE3 = qh1.E();
                ph1VarE3.h("type.googleapis.com/google.crypto.tink.XAesGcmKey");
                cj1 cj1VarD = dj1.D();
                ej1 ej1VarB = fj1.B();
                int i10 = lb1Var.f13451b;
                ej1VarB.b();
                ((fj1) ej1VarB.f14755b).D(i10);
                fj1 fj1Var = (fj1) ej1VarB.e();
                cj1VarD.b();
                ((dj1) cj1VarD.f14755b).E(fj1Var);
                ph1VarE3.i(((dj1) cj1VarD.e()).a());
                ph1VarE3.j(ec1.a(lb1Var.f13450a));
                return ce1.e((qh1) ph1VarE3.e());
            case 15:
                qd1 qd1Var4 = gc1.f11493a;
                ph1 ph1VarE4 = qh1.E();
                ph1VarE4.h("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
                ph1VarE4.i(jj1.C().a());
                ph1VarE4.j(gc1.a(((ob1) s91Var).f14655a));
                return ce1.e((qh1) ph1VarE4.e());
            default:
                me1 me1Var = (me1) s91Var;
                qd1 qd1Var5 = cf1.f10100a;
                ph1 ph1VarE5 = qh1.E();
                ph1VarE5.h("type.googleapis.com/google.crypto.tink.AesCmacKey");
                lf1 lf1VarD = mf1.D();
                nf1 nf1VarB = pf1.B();
                int i11 = me1Var.f13882b;
                nf1VarB.b();
                ((pf1) nf1VarB.f14755b).D(i11);
                pf1 pf1Var = (pf1) nf1VarB.e();
                lf1VarD.b();
                ((mf1) lf1VarD.f14755b).F(pf1Var);
                int i12 = me1Var.f13881a;
                lf1VarD.b();
                ((mf1) lf1VarD.f14755b).E(i12);
                ph1VarE5.i(((mf1) lf1VarD.e()).a());
                ph1VarE5.j(cf1.a(me1Var.f13883c));
                return ce1.e((qh1) ph1VarE5.e());
        }
    }

    @Override // com.google.android.gms.internal.ads.wd1, com.google.android.gms.internal.ads.xc1
    public Object a(al0 al0Var) throws GeneralSecurityException {
        switch (this.f17170a) {
            case 18:
                ke1 ke1Var = (ke1) al0Var;
                vd1 vd1Var = le1.f13470a;
                if (ke1Var.f13145c.f13881a == 32) {
                    if (al0.q(1)) {
                        Provider providerC = a80.c();
                        if (providerC != null) {
                            try {
                                return ne1.a(ke1Var, providerC);
                            } catch (GeneralSecurityException unused) {
                            }
                        }
                        return new ne1();
                    }
                    throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
                }
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            case 19:
                ke1 ke1Var2 = (ke1) al0Var;
                vd1 vd1Var2 = le1.f13470a;
                if (ke1Var2.f13145c.f13881a == 32) {
                    return new ql1(ke1Var2);
                }
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            case 20:
                ne1 ne1Var = new ne1();
                if (al0.q(2)) {
                    return ne1Var;
                }
                throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
            case 21:
                return new ql1((qe1) al0Var);
            default:
                be1 be1Var = ((cd1) al0Var).f10087c;
                int[] iArr = ad1.f9308b;
                int i4 = be1Var.f9657a;
                Integer num = (Integer) be1Var.f9662f;
                int i10 = iArr[i3.e.c(i4)];
                int iOrdinal = ((ii1) be1Var.f9661e).ordinal();
                if (iOrdinal == 1) {
                    nd1.b(num.intValue()).b();
                } else if (iOrdinal == 2) {
                    nd1.a(num.intValue()).b();
                } else if (iOrdinal == 3) {
                    nd1.f14254a.b();
                } else {
                    if (iOrdinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                    nd1.a(num.intValue()).b();
                }
                return new ye1();
        }
    }
}

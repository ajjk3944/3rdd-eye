package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ca1 implements wd1, pd1, xc1, vc1, rd1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10060a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ca1 f10037b = new ca1(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ca1 f10038c = new ca1(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ca1 f10039d = new ca1(2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ca1 f10040e = new ca1(3);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ca1 f10041f = new ca1(4);
    public static final /* synthetic */ ca1 g = new ca1(5);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ca1 f10042h = new ca1(6);

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ ca1 f10043i = new ca1(7);
    public static final /* synthetic */ ca1 j = new ca1(8);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ ca1 f10044k = new ca1(9);

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ ca1 f10045l = new ca1(10);

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ ca1 f10046m = new ca1(11);

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ ca1 f10047n = new ca1(12);

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ ca1 f10048o = new ca1(13);

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ ca1 f10049p = new ca1(14);

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ ca1 f10050q = new ca1(15);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ ca1 f10051r = new ca1(16);

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ ca1 f10052s = new ca1(17);

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ ca1 f10053t = new ca1(18);

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ ca1 f10054u = new ca1(19);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ ca1 f10055v = new ca1(20);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ ca1 f10056w = new ca1(21);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ ca1 f10057x = new ca1(22);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ ca1 f10058y = new ca1(23);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ ca1 f10059z = new ca1(24);
    public static final /* synthetic */ ca1 A = new ca1(25);
    public static final /* synthetic */ ca1 B = new ca1(26);
    public static final /* synthetic */ ca1 C = new ca1(27);
    public static final /* synthetic */ ca1 D = new ca1(28);
    public static final /* synthetic */ ca1 E = new ca1(29);

    public /* synthetic */ ca1(int i4) {
        this.f10060a = i4;
    }

    @Override // com.google.android.gms.internal.ads.wd1, com.google.android.gms.internal.ads.xc1
    public be1 a(al0 al0Var) throws GeneralSecurityException {
        switch (this.f10060a) {
            case 9:
                bb1 bb1Var = (bb1) al0Var;
                qd1 qd1Var = db1.f10420a;
                ai1 ai1VarD = bi1.D();
                ci1 ci1VarC = di1.C();
                String str = bb1Var.f9642c.f10073a;
                ci1VarC.b();
                ((di1) ci1VarC.f14755b).E(str);
                di1 di1Var = (di1) ci1VarC.e();
                ai1VarD.b();
                ((bi1) ai1VarD.f14755b).F(di1Var);
                return be1.I("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((bi1) ai1VarD.e()).a(), 5, db1.a(bb1Var.f9642c.f10074b), bb1Var.f9644e);
            case 13:
                eb1 eb1Var = (eb1) al0Var;
                qd1 qd1Var2 = hb1.f11820a;
                ei1 ei1VarD = fi1.D();
                hi1 hi1VarB = hb1.b(eb1Var.f10754c);
                ei1VarD.b();
                ((fi1) ei1VarD.f14755b).F(hi1VarB);
                return be1.I("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((fi1) ei1VarD.e()).a(), 5, hb1.a(eb1Var.f10754c.f11089a), eb1Var.f10756e);
            case 19:
                fa1 fa1Var = (fa1) al0Var;
                qd1 qd1Var3 = pb1.f14973a;
                qf1 qf1VarE = rf1.E();
                uf1 uf1VarD = vf1.D();
                yf1 yf1VarB = zf1.B();
                int i4 = fa1Var.f11082c.f13436c;
                yf1VarB.b();
                ((zf1) yf1VarB.f14755b).D(i4);
                zf1 zf1Var = (zf1) yf1VarB.e();
                uf1VarD.b();
                ((vf1) uf1VarD.f14755b).F(zf1Var);
                byte[] bArrB = ((vl1) fa1Var.f11083d.f13160b).b();
                zm1 zm1VarV = bn1.v(0, bArrB.length, bArrB);
                uf1VarD.b();
                ((vf1) uf1VarD.f14755b).G(zm1VarV);
                vf1 vf1Var = (vf1) uf1VarD.e();
                qf1VarE.b();
                ((rf1) qf1VarE.f14755b).G(vf1Var);
                gh1 gh1VarE = hh1.E();
                la1 la1Var = fa1Var.f11082c;
                lh1 lh1VarD = pb1.d(la1Var);
                gh1VarE.b();
                ((hh1) gh1VarE.f14755b).H(lh1VarD);
                byte[] bArrB2 = ((vl1) fa1Var.f11084e.f13160b).b();
                zm1 zm1VarV2 = bn1.v(0, bArrB2.length, bArrB2);
                gh1VarE.b();
                ((hh1) gh1VarE.f14755b).I(zm1VarV2);
                hh1 hh1Var = (hh1) gh1VarE.e();
                qf1VarE.b();
                ((rf1) qf1VarE.f14755b).H(hh1Var);
                return be1.I("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((rf1) qf1VarE.e()).a(), 2, pb1.a(la1Var.f13438e), fa1Var.g);
            case 23:
                ma1 ma1Var = (ma1) al0Var;
                qd1 qd1Var4 = qb1.f15286a;
                ag1 ag1VarE = bg1.E();
                pa1 pa1Var = ma1Var.f13833c;
                eg1 eg1VarB = fg1.B();
                int i10 = pa1Var.f14952b;
                eg1VarB.b();
                ((fg1) eg1VarB.f14755b).D(i10);
                fg1 fg1Var = (fg1) eg1VarB.e();
                ag1VarE.b();
                ((bg1) ag1VarE.f14755b).G(fg1Var);
                byte[] bArrB3 = ((vl1) ma1Var.f13834d.f13160b).b();
                zm1 zm1VarV3 = bn1.v(0, bArrB3.length, bArrB3);
                ag1VarE.b();
                ((bg1) ag1VarE.f14755b).H(zm1VarV3);
                return be1.I("type.googleapis.com/google.crypto.tink.AesEaxKey", ((bg1) ag1VarE.e()).a(), 2, qb1.a(ma1Var.f13833c.f14953c), ma1Var.f13836f);
            default:
                qa1 qa1Var = (qa1) al0Var;
                qd1 qd1Var5 = sb1.f15985a;
                gg1 gg1VarD = hg1.D();
                byte[] bArrB4 = ((vl1) qa1Var.f15280d.f13160b).b();
                zm1 zm1VarV4 = bn1.v(0, bArrB4.length, bArrB4);
                gg1VarD.b();
                ((hg1) gg1VarD.f14755b).F(zm1VarV4);
                return be1.I("type.googleapis.com/google.crypto.tink.AesGcmKey", ((hg1) gg1VarD.e()).a(), 2, sb1.a(qa1Var.f15279c.f15941b), qa1Var.f15282f);
        }
    }

    @Override // com.google.android.gms.internal.ads.pd1
    public s91 f(ce1 ce1Var) throws GeneralSecurityException {
        switch (this.f10060a) {
            case 8:
                qd1 qd1Var = db1.f10420a;
                qh1 qh1Var = (qh1) ce1Var.f10095c;
                if (!qh1Var.A().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(qh1Var.A())));
                }
                try {
                    bn1 bn1VarB = qh1Var.B();
                    jn1 jn1Var = jn1.f12801a;
                    int i4 = um1.f17262a;
                    return new cb1(di1.B(bn1VarB, jn1.f12802b).A(), db1.b(qh1Var.C()));
                } catch (ao1 e2) {
                    throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e2);
                }
            case 12:
                qd1 qd1Var2 = hb1.f11820a;
                qh1 qh1Var2 = (qh1) ce1Var.f10095c;
                if (!qh1Var2.A().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(qh1Var2.A())));
                }
                try {
                    bn1 bn1VarB2 = qh1Var2.B();
                    jn1 jn1Var2 = jn1.f12801a;
                    int i10 = um1.f17262a;
                    return hb1.c(hi1.C(bn1VarB2, jn1.f12802b), qh1Var2.C());
                } catch (ao1 e10) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e10);
                }
            case 18:
                qd1 qd1Var3 = pb1.f14973a;
                qh1 qh1Var3 = (qh1) ce1Var.f10095c;
                if (!qh1Var3.A().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(qh1Var3.A())));
                }
                try {
                    bn1 bn1VarB3 = qh1Var3.B();
                    jn1 jn1Var3 = jn1.f12801a;
                    int i11 = um1.f17262a;
                    tf1 tf1VarC = tf1.C(bn1VarB3, jn1.f12802b);
                    if (tf1VarC.B().C() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    ai aiVar = new ai(6);
                    aiVar.c(tf1VarC.A().B());
                    aiVar.h(tf1VarC.B().B());
                    aiVar.l(tf1VarC.A().A().A());
                    aiVar.m(tf1VarC.B().A().B());
                    aiVar.f9334e = pb1.c(tf1VarC.B().A().A());
                    aiVar.f9335f = pb1.b(qh1Var3.C());
                    return aiVar.p();
                } catch (ao1 e11) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e11);
                }
            case 22:
                qd1 qd1Var4 = qb1.f15286a;
                qh1 qh1Var4 = (qh1) ce1Var.f10095c;
                if (!qh1Var4.A().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(qh1Var4.A())));
                }
                try {
                    bn1 bn1VarB4 = qh1Var4.B();
                    jn1 jn1Var4 = jn1.f12801a;
                    int i12 = um1.f17262a;
                    dg1 dg1VarC = dg1.C(bn1VarB4, jn1.f12802b);
                    oa1 oa1Var = new oa1(0);
                    oa1Var.a(dg1VarC.B());
                    oa1Var.d(dg1VarC.A().A());
                    oa1Var.f();
                    oa1Var.f14637e = qb1.b(qh1Var4.C());
                    return oa1Var.i();
                } catch (ao1 e12) {
                    throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e12);
                }
            default:
                qd1 qd1Var5 = sb1.f15985a;
                qh1 qh1Var5 = (qh1) ce1Var.f10095c;
                if (!qh1Var5.A().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(qh1Var5.A())));
                }
                try {
                    bn1 bn1VarB5 = qh1Var5.B();
                    jn1 jn1Var5 = jn1.f12801a;
                    int i13 = um1.f17262a;
                    jg1 jg1VarC = jg1.C(bn1VarB5, jn1.f12802b);
                    if (jg1VarC.B() != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    oa1 oa1Var2 = new oa1(1);
                    oa1Var2.a(jg1VarC.A());
                    oa1Var2.c();
                    oa1Var2.f();
                    oa1Var2.f14637e = sb1.b(qh1Var5.C());
                    return oa1Var2.k();
                } catch (ao1 e13) {
                    throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e13);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.vc1
    public al0 h(be1 be1Var) throws GeneralSecurityException {
        boolean z3 = false;
        switch (this.f10060a) {
            case 10:
                qd1 qd1Var = db1.f10420a;
                if (!((String) be1Var.f9658b).equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
                }
                try {
                    bn1 bn1Var = (bn1) be1Var.f9660d;
                    jn1 jn1Var = jn1.f12801a;
                    int i4 = um1.f17262a;
                    bi1 bi1VarC = bi1.C(bn1Var, jn1.f12802b);
                    if (bi1VarC.A() == 0) {
                        return bb1.a0(new cb1(bi1VarC.B().A(), db1.b((ii1) be1Var.f9661e)), (Integer) be1Var.f9662f);
                    }
                    String strValueOf = String.valueOf(bi1VarC);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 49);
                    sb2.append("KmsAeadKey are only accepted with version 0, got ");
                    sb2.append(strValueOf);
                    throw new GeneralSecurityException(sb2.toString());
                } catch (ao1 e2) {
                    throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e2);
                }
            case 14:
                qd1 qd1Var2 = hb1.f11820a;
                if (!((String) be1Var.f9658b).equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
                }
                try {
                    bn1 bn1Var2 = (bn1) be1Var.f9660d;
                    jn1 jn1Var2 = jn1.f12801a;
                    int i10 = um1.f17262a;
                    fi1 fi1VarC = fi1.C(bn1Var2, jn1.f12802b);
                    if (fi1VarC.A() == 0) {
                        return eb1.a0(hb1.c(fi1VarC.B(), (ii1) be1Var.f9661e), (Integer) be1Var.f9662f);
                    }
                    String strValueOf2 = String.valueOf(fi1VarC);
                    StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 58);
                    sb3.append("KmsEnvelopeAeadKeys are only accepted with version 0, got ");
                    sb3.append(strValueOf2);
                    throw new GeneralSecurityException(sb3.toString());
                } catch (ao1 e10) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e10);
                }
            case 20:
                qd1 qd1Var3 = pb1.f14973a;
                if (!((String) be1Var.f9658b).equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
                }
                try {
                    bn1 bn1Var3 = (bn1) be1Var.f9660d;
                    jn1 jn1Var3 = jn1.f12801a;
                    int i11 = um1.f17262a;
                    rf1 rf1VarD = rf1.D(bn1Var3, jn1.f12802b);
                    if (rf1VarD.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (rf1VarD.B().A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                    }
                    if (rf1VarD.C().A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    ai aiVar = new ai(6);
                    aiVar.c(rf1VarD.B().C().i());
                    aiVar.h(rf1VarD.C().C().i());
                    aiVar.l(rf1VarD.B().B().A());
                    aiVar.m(rf1VarD.C().B().B());
                    aiVar.f9334e = pb1.c(rf1VarD.C().B().A());
                    aiVar.f9335f = pb1.b((ii1) be1Var.f9661e);
                    la1 la1VarP = aiVar.p();
                    aw awVar = new aw(29);
                    awVar.f9451b = la1VarP;
                    awVar.f9452c = kh0.l(rf1VarD.B().C().y());
                    awVar.f9453d = kh0.l(rf1VarD.C().C().y());
                    awVar.f9454e = (Integer) be1Var.f9662f;
                    return awVar.x();
                } catch (ao1 unused) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
                }
            case 24:
                qd1 qd1Var4 = qb1.f15286a;
                if (!((String) be1Var.f9658b).equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
                }
                try {
                    bn1 bn1Var4 = (bn1) be1Var.f9660d;
                    jn1 jn1Var4 = jn1.f12801a;
                    int i12 = um1.f17262a;
                    bg1 bg1VarD = bg1.D(bn1Var4, jn1.f12802b);
                    if (bg1VarD.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    oa1 oa1Var = new oa1(0);
                    oa1Var.a(bg1VarD.C().i());
                    oa1Var.d(bg1VarD.B().A());
                    oa1Var.f();
                    oa1Var.f14637e = qb1.b((ii1) be1Var.f9661e);
                    pa1 pa1VarI = oa1Var.i();
                    av0 av0Var = new av0(3, z3);
                    av0Var.f9422b = pa1VarI;
                    av0Var.f9423c = kh0.l(bg1VarD.C().y());
                    av0Var.f9424d = (Integer) be1Var.f9662f;
                    return av0Var.o();
                } catch (ao1 unused2) {
                    throw new GeneralSecurityException("Parsing AesEaxcKey failed");
                }
            default:
                qd1 qd1Var5 = sb1.f15985a;
                if (!((String) be1Var.f9658b).equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
                }
                try {
                    bn1 bn1Var5 = (bn1) be1Var.f9660d;
                    jn1 jn1Var5 = jn1.f12801a;
                    int i13 = um1.f17262a;
                    hg1 hg1VarC = hg1.C(bn1Var5, jn1.f12802b);
                    if (hg1VarC.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    oa1 oa1Var2 = new oa1(1);
                    oa1Var2.a(hg1VarC.B().i());
                    oa1Var2.c();
                    oa1Var2.f();
                    oa1Var2.f14637e = sb1.b((ii1) be1Var.f9661e);
                    sa1 sa1VarK = oa1Var2.k();
                    av0 av0Var2 = new av0(4, z3);
                    av0Var2.f9422b = sa1VarK;
                    av0Var2.f9423c = kh0.l(hg1VarC.B().y());
                    av0Var2.f9424d = (Integer) be1Var.f9662f;
                    return av0Var2.p();
                } catch (ao1 unused3) {
                    throw new GeneralSecurityException("Parsing AesGcmKey failed");
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.rd1
    public ce1 i(s91 s91Var) throws GeneralSecurityException {
        switch (this.f10060a) {
            case 11:
                cb1 cb1Var = (cb1) s91Var;
                qd1 qd1Var = db1.f10420a;
                ph1 ph1VarE = qh1.E();
                ph1VarE.h("type.googleapis.com/google.crypto.tink.KmsAeadKey");
                ci1 ci1VarC = di1.C();
                String str = cb1Var.f10073a;
                ci1VarC.b();
                ((di1) ci1VarC.f14755b).E(str);
                ph1VarE.i(((di1) ci1VarC.e()).a());
                ph1VarE.j(db1.a(cb1Var.f10074b));
                return ce1.e((qh1) ph1VarE.e());
            case 15:
                fb1 fb1Var = (fb1) s91Var;
                qd1 qd1Var2 = hb1.f11820a;
                ph1 ph1VarE2 = qh1.E();
                ph1VarE2.h("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
                ph1VarE2.i(hb1.b(fb1Var).a());
                ph1VarE2.j(hb1.a(fb1Var.f11089a));
                return ce1.e((qh1) ph1VarE2.e());
            case 21:
                la1 la1Var = (la1) s91Var;
                qd1 qd1Var3 = pb1.f14973a;
                ph1 ph1VarE3 = qh1.E();
                ph1VarE3.h("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
                sf1 sf1VarD = tf1.D();
                wf1 wf1VarC = xf1.C();
                yf1 yf1VarB = zf1.B();
                int i4 = la1Var.f13436c;
                yf1VarB.b();
                ((zf1) yf1VarB.f14755b).D(i4);
                zf1 zf1Var = (zf1) yf1VarB.e();
                wf1VarC.b();
                ((xf1) wf1VarC.f14755b).E(zf1Var);
                int i10 = la1Var.f13434a;
                wf1VarC.b();
                ((xf1) wf1VarC.f14755b).F(i10);
                xf1 xf1Var = (xf1) wf1VarC.e();
                sf1VarD.b();
                ((tf1) sf1VarD.f14755b).E(xf1Var);
                ih1 ih1VarE = jh1.E();
                lh1 lh1VarD = pb1.d(la1Var);
                ih1VarE.b();
                ((jh1) ih1VarE.f14755b).G(lh1VarD);
                int i11 = la1Var.f13435b;
                ih1VarE.b();
                ((jh1) ih1VarE.f14755b).H(i11);
                jh1 jh1Var = (jh1) ih1VarE.e();
                sf1VarD.b();
                ((tf1) sf1VarD.f14755b).F(jh1Var);
                ph1VarE3.i(((tf1) sf1VarD.e()).a());
                ph1VarE3.j(pb1.a(la1Var.f13438e));
                return ce1.e((qh1) ph1VarE3.e());
            case 25:
                pa1 pa1Var = (pa1) s91Var;
                qd1 qd1Var4 = qb1.f15286a;
                ph1 ph1VarE4 = qh1.E();
                ph1VarE4.h("type.googleapis.com/google.crypto.tink.AesEaxKey");
                cg1 cg1VarD = dg1.D();
                eg1 eg1VarB = fg1.B();
                int i12 = pa1Var.f14952b;
                eg1VarB.b();
                ((fg1) eg1VarB.f14755b).D(i12);
                fg1 fg1Var = (fg1) eg1VarB.e();
                cg1VarD.b();
                ((dg1) cg1VarD.f14755b).E(fg1Var);
                int i13 = pa1Var.f14951a;
                cg1VarD.b();
                ((dg1) cg1VarD.f14755b).F(i13);
                ph1VarE4.i(((dg1) cg1VarD.e()).a());
                ph1VarE4.j(qb1.a(pa1Var.f14953c));
                return ce1.e((qh1) ph1VarE4.e());
            default:
                sa1 sa1Var = (sa1) s91Var;
                qd1 qd1Var5 = sb1.f15985a;
                ph1 ph1VarE5 = qh1.E();
                ph1VarE5.h("type.googleapis.com/google.crypto.tink.AesGcmKey");
                ig1 ig1VarD = jg1.D();
                int i14 = sa1Var.f15940a;
                ig1VarD.b();
                ((jg1) ig1VarD.f14755b).E(i14);
                ph1VarE5.i(((jg1) ig1VarD.e()).a());
                ph1VarE5.j(sb1.a(sa1Var.f15941b));
                return ce1.e((qh1) ph1VarE5.e());
        }
    }

    @Override // com.google.android.gms.internal.ads.wd1, com.google.android.gms.internal.ads.xc1
    public Object a(al0 al0Var) throws GeneralSecurityException {
        byte[] bArrB;
        switch (this.f10060a) {
            case 0:
                be1 be1Var = ((cd1) al0Var).f10087c;
                int[] iArr = ad1.f9308b;
                int i4 = be1Var.f9657a;
                Integer num = (Integer) be1Var.f9662f;
                int i10 = iArr[i3.e.c(i4)];
                j91 j91Var = (j91) tc1.f16783d.b(j91.class, (String) be1Var.f9658b).a((bn1) be1Var.f9660d);
                ii1 ii1Var = (ii1) be1Var.f9661e;
                int iOrdinal = ii1Var.ordinal();
                if (iOrdinal == 1) {
                    bArrB = nd1.b(num.intValue()).b();
                } else if (iOrdinal == 2) {
                    bArrB = nd1.a(num.intValue()).b();
                } else if (iOrdinal == 3) {
                    bArrB = nd1.f14254a.b();
                } else {
                    if (iOrdinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(ii1Var)));
                    }
                    bArrB = nd1.a(num.intValue()).b();
                }
                return new cc1(j91Var, bArrB);
            case 1:
                return kl1.b((fa1) al0Var);
            case 2:
                return gl1.b((ma1) al0Var);
            case 3:
                qa1 qa1Var = (qa1) al0Var;
                qa1Var.getClass();
                return new cc1(((vl1) qa1Var.f15280d.f13160b).b(), qa1Var.f15281e);
            case 4:
                return hc1.b((ta1) al0Var);
            case 5:
                wa1 wa1Var = (wa1) al0Var;
                vd1 vd1Var = xa1.f18338a;
                try {
                    wb1.b();
                    return new wb1(((vl1) wa1Var.f17954d.f13160b).b(), wa1Var.f17955e.b(), wb1.b().getProvider());
                } catch (GeneralSecurityException unused) {
                    return new cc1(((vl1) wa1Var.f17954d.f13160b).b(), 2, wa1Var.f17955e.b());
                }
            case 6:
                vd1 vd1Var2 = za1.f19050a;
                q91.a(((bb1) al0Var).f9642c.f10073a);
                throw null;
            case 7:
                zc1 zc1Var = ab1.f9296a;
                q91.a(((eb1) al0Var).f10754c.f11090b);
                throw null;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            default:
                mb1 mb1Var = (mb1) al0Var;
                vd1 vd1Var3 = nb1.f14237a;
                try {
                    wb1.b();
                    return new fc1(((vl1) mb1Var.f13860d.f13160b).b(), mb1Var.f13861e.b(), wb1.b().getProvider());
                } catch (GeneralSecurityException unused2) {
                    return new cc1(((vl1) mb1Var.f13860d.f13160b).b(), 3, mb1Var.f13861e.b());
                }
            case 16:
                jb1 jb1Var = (jb1) al0Var;
                jb1Var.getClass();
                return new dc1(((vl1) jb1Var.f12710d.f13160b).b(), jb1Var.f12711e, jb1Var.f12709c.f13451b);
        }
    }
}

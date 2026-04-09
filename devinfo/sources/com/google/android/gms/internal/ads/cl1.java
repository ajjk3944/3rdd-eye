package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class cl1 implements pd1, xc1, vc1, rd1, nl1, ko1, l31, rd0, zd0 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ cl1 f10158b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ cl1 f10159c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ cl1 f10160d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ cl1 f10161e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ cl1 f10162f;
    public static final /* synthetic */ cl1 g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ cl1 f10163h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ cl1 f10164i;
    public static final /* synthetic */ cl1 j;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10165a;

    static {
        byte b10 = 0;
        f10158b = new cl1(b10, 0);
        f10159c = new cl1(b10, 1);
        f10160d = new cl1(b10, 2);
        f10161e = new cl1(b10, 3);
        f10162f = new cl1(b10, 4);
        g = new cl1(b10, 5);
        f10163h = new cl1(b10, 19);
        f10164i = new cl1(b10, 21);
        j = new cl1(b10, 26);
    }

    public /* synthetic */ cl1(byte b10, int i4) {
        this.f10165a = i4;
    }

    public static final xn1 k(Object obj, long j8) {
        xn1 xn1Var = (xn1) ip1.k(obj, j8);
        if (((rm1) xn1Var).f15707a) {
            return xn1Var;
        }
        int size = xn1Var.size();
        xn1 xn1VarN = xn1Var.n(size == 0 ? 10 : size + size);
        ip1.l(obj, j8, xn1VarN);
        return xn1VarN;
    }

    public static final ho1 l(Object obj, Object obj2) {
        ho1 ho1VarA = (ho1) obj;
        ho1 ho1Var = (ho1) obj2;
        if (!ho1Var.isEmpty()) {
            if (!ho1VarA.f11933a) {
                ho1VarA = ho1VarA.a();
            }
            ho1VarA.d();
            if (!ho1Var.isEmpty()) {
                ho1VarA.putAll(ho1Var);
            }
        }
        return ho1VarA;
    }

    @Override // com.google.android.gms.internal.ads.xc1
    public be1 a(al0 al0Var) {
        switch (this.f10165a) {
            case 1:
                mk1 mk1Var = (mk1) al0Var;
                return be1.I("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", dl1.b(mk1Var).a(), 4, (ii1) dl1.g.o(mk1Var.f13926c.f13185c), mk1Var.f13929f);
            default:
                lk1 lk1Var = (lk1) al0Var;
                qd1 qd1Var = dl1.f10509a;
                wi1 wi1VarJ = xi1.J();
                wi1VarJ.b();
                ((xi1) wi1VarJ.f14755b).L();
                zi1 zi1VarB = dl1.b(lk1Var.f13513c);
                wi1VarJ.b();
                ((xi1) wi1VarJ.f14755b).M(zi1VarB);
                byte[] bArrL = yr1.l((BigInteger) lk1Var.f13514d.f14280b);
                zm1 zm1Var = bn1.f9729b;
                zm1 zm1VarV = bn1.v(0, bArrL.length, bArrL);
                wi1VarJ.b();
                ((xi1) wi1VarJ.f14755b).N(zm1VarV);
                byte[] bArrL2 = yr1.l((BigInteger) lk1Var.f13515e.f14280b);
                zm1 zm1VarV2 = bn1.v(0, bArrL2.length, bArrL2);
                wi1VarJ.b();
                ((xi1) wi1VarJ.f14755b).O(zm1VarV2);
                byte[] bArrL3 = yr1.l((BigInteger) lk1Var.f13516f.f14280b);
                zm1 zm1VarV3 = bn1.v(0, bArrL3.length, bArrL3);
                wi1VarJ.b();
                ((xi1) wi1VarJ.f14755b).P(zm1VarV3);
                byte[] bArrL4 = yr1.l((BigInteger) lk1Var.g.f14280b);
                zm1 zm1VarV4 = bn1.v(0, bArrL4.length, bArrL4);
                wi1VarJ.b();
                ((xi1) wi1VarJ.f14755b).Q(zm1VarV4);
                byte[] bArrL5 = yr1.l((BigInteger) lk1Var.f13517h.f14280b);
                zm1 zm1VarV5 = bn1.v(0, bArrL5.length, bArrL5);
                wi1VarJ.b();
                ((xi1) wi1VarJ.f14755b).R(zm1VarV5);
                byte[] bArrL6 = yr1.l((BigInteger) lk1Var.f13518i.f14280b);
                zm1 zm1VarV6 = bn1.v(0, bArrL6.length, bArrL6);
                wi1VarJ.b();
                ((xi1) wi1VarJ.f14755b).S(zm1VarV6);
                zm1 zm1VarA = ((xi1) wi1VarJ.e()).a();
                rt rtVar = dl1.g;
                mk1 mk1Var2 = lk1Var.f13513c;
                return be1.I("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", zm1VarA, 3, (ii1) rtVar.o(mk1Var2.f13926c.f13185c), mk1Var2.f13929f);
        }
    }

    @Override // com.google.android.gms.internal.ads.l31
    public /* synthetic */ Object b() {
        return new ss1();
    }

    @Override // com.google.android.gms.internal.ads.rd0
    /* renamed from: c */
    public void mo160c(Object obj) {
        switch (this.f10165a) {
            case 20:
                ((ke) obj).J1();
                break;
            case 21:
                break;
            case 22:
                int i4 = it1.f12446e0;
                ((ke) obj).c();
                break;
            case 23:
                ((ke) obj).e();
                break;
            case 24:
                int i10 = it1.f12446e0;
                ((ke) obj).M1();
                break;
            case 25:
                int i11 = it1.f12446e0;
                ((ke) obj).E1();
                break;
            case 26:
                int i12 = it1.f12446e0;
                ((ke) obj).V1(new us1(2, new ac.m("Player release timed out."), 1003));
                break;
            case 27:
                int i13 = it1.f12446e0;
                ((ke) obj).L1();
                break;
            default:
                int i14 = it1.f12446e0;
                ((ke) obj).zzc();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.ko1
    public boolean d(Class cls) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ko1
    public to1 e(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // com.google.android.gms.internal.ads.pd1
    public s91 f(ce1 ce1Var) throws GeneralSecurityException {
        qd1 qd1Var = dl1.f10509a;
        qh1 qh1Var = (qh1) ce1Var.f10095c;
        if (!qh1Var.A().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: ".concat(String.valueOf(qh1Var.A())));
        }
        try {
            bn1 bn1VarB = qh1Var.B();
            jn1 jn1Var = jn1.f12801a;
            int i4 = um1.f17262a;
            ti1 ti1VarD = ti1.D(bn1VarB, jn1.f12802b);
            BigInteger bigInteger = kk1.g;
            hk1 hk1Var = new hk1();
            rt rtVar = dl1.f10515h;
            hk1Var.f11900c = (ik1) rtVar.t(ti1VarD.A().A());
            hk1Var.f11901d = (ik1) rtVar.t(ti1VarD.A().B());
            hk1Var.f11899b = new BigInteger(1, ti1VarD.C().y());
            hk1Var.a(ti1VarD.B());
            hk1Var.b(ti1VarD.A().C());
            hk1Var.f11903f = (jk1) dl1.g.t(qh1Var.C());
            return hk1Var.c();
        } catch (ao1 e2) {
            throw new GeneralSecurityException("Parsing RsaSsaPssParameters failed: ", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.nl1
    public /* bridge */ /* synthetic */ Object g(String str, Provider provider) {
        switch (this.f10165a) {
            case 6:
                return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
            case 7:
                return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
            case 8:
                return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
            case 9:
                return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
            case 10:
                return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
            case 11:
                return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
            default:
                return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    @Override // com.google.android.gms.internal.ads.vc1
    public al0 h(be1 be1Var) throws GeneralSecurityException {
        int i4 = 12;
        boolean z3 = false;
        switch (this.f10165a) {
            case 2:
                qd1 qd1Var = dl1.f10509a;
                String str = (String) be1Var.f9658b;
                if (!str.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: ".concat(String.valueOf(str)));
                }
                try {
                    bn1 bn1Var = (bn1) be1Var.f9660d;
                    jn1 jn1Var = jn1.f12801a;
                    int i10 = um1.f17262a;
                    zi1 zi1VarE = zi1.E(bn1Var, jn1.f12802b);
                    if (zi1VarE.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigInteger = new BigInteger(1, zi1VarE.C().y());
                    int iBitLength = bigInteger.bitLength();
                    BigInteger bigInteger2 = kk1.g;
                    hk1 hk1Var = new hk1();
                    rt rtVar = dl1.f10515h;
                    hk1Var.f11900c = (ik1) rtVar.t(zi1VarE.B().A());
                    hk1Var.f11901d = (ik1) rtVar.t(zi1VarE.B().B());
                    hk1Var.f11899b = new BigInteger(1, zi1VarE.D().y());
                    hk1Var.a(iBitLength);
                    hk1Var.b(zi1VarE.B().C());
                    hk1Var.f11903f = (jk1) dl1.g.t((ii1) be1Var.f9661e);
                    kk1 kk1VarC = hk1Var.c();
                    av0 av0Var = new av0(i4, z3);
                    av0Var.f9422b = kk1VarC;
                    av0Var.f9423c = bigInteger;
                    av0Var.f9424d = (Integer) be1Var.f9662f;
                    return av0Var.w();
                } catch (ao1 | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing RsaSsaPssPublicKey failed");
                }
            default:
                qd1 qd1Var2 = dl1.f10509a;
                String str2 = (String) be1Var.f9658b;
                if (!str2.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str2)));
                }
                try {
                    bn1 bn1Var2 = (bn1) be1Var.f9660d;
                    jn1 jn1Var2 = jn1.f12801a;
                    int i11 = um1.f17262a;
                    xi1 xi1VarI = xi1.I(bn1Var2, jn1.f12802b);
                    if (xi1VarI.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zi1 zi1VarB = xi1VarI.B();
                    if (zi1VarB.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigInteger3 = new BigInteger(1, zi1VarB.C().y());
                    int iBitLength2 = bigInteger3.bitLength();
                    BigInteger bigInteger4 = new BigInteger(1, zi1VarB.D().y());
                    BigInteger bigInteger5 = kk1.g;
                    hk1 hk1Var2 = new hk1();
                    rt rtVar2 = dl1.f10515h;
                    hk1Var2.f11900c = (ik1) rtVar2.t(zi1VarB.B().A());
                    hk1Var2.f11901d = (ik1) rtVar2.t(zi1VarB.B().B());
                    hk1Var2.f11899b = bigInteger4;
                    hk1Var2.a(iBitLength2);
                    hk1Var2.b(zi1VarB.B().C());
                    hk1Var2.f11903f = (jk1) dl1.g.t((ii1) be1Var.f9661e);
                    kk1 kk1VarC2 = hk1Var2.c();
                    av0 av0Var2 = new av0(i4, z3);
                    av0Var2.f9422b = kk1VarC2;
                    av0Var2.f9423c = bigInteger3;
                    av0Var2.f9424d = (Integer) be1Var.f9662f;
                    mk1 mk1VarW = av0Var2.w();
                    b7 b7Var = new b7(z3);
                    b7Var.f9605a = mk1VarW;
                    ne0 ne0VarC = dl1.c(xi1VarI.D());
                    ne0 ne0VarC2 = dl1.c(xi1VarI.E());
                    b7Var.f9607c = ne0VarC;
                    b7Var.f9608d = ne0VarC2;
                    b7Var.f9606b = dl1.c(xi1VarI.C());
                    ne0 ne0VarC3 = dl1.c(xi1VarI.F());
                    ne0 ne0VarC4 = dl1.c(xi1VarI.G());
                    b7Var.f9609e = ne0VarC3;
                    b7Var.f9610f = ne0VarC4;
                    b7Var.g = dl1.c(xi1VarI.H());
                    return b7Var.i();
                } catch (ao1 | IllegalArgumentException unused2) {
                    throw new GeneralSecurityException("Parsing RsaSsaPssPrivateKey failed");
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.rd1
    public ce1 i(s91 s91Var) {
        kk1 kk1Var = (kk1) s91Var;
        qd1 qd1Var = dl1.f10509a;
        ph1 ph1VarE = qh1.E();
        ph1VarE.h("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        si1 si1VarE = ti1.E();
        vi1 vi1VarA = dl1.a(kk1Var);
        si1VarE.b();
        ((ti1) si1VarE.f14755b).F(vi1VarA);
        int i4 = kk1Var.f13183a;
        si1VarE.b();
        ((ti1) si1VarE.f14755b).G(i4);
        byte[] bArrL = yr1.l(kk1Var.f13184b);
        zm1 zm1Var = bn1.f9729b;
        zm1 zm1VarV = bn1.v(0, bArrL.length, bArrL);
        si1VarE.b();
        ((ti1) si1VarE.f14755b).H(zm1VarV);
        ph1VarE.i(((ti1) si1VarE.e()).a());
        ph1VarE.j((ii1) dl1.g.o(kk1Var.f13185c));
        return ce1.e((qh1) ph1VarE.e());
    }

    @Override // com.google.android.gms.internal.ads.zd0
    public /* synthetic */ void j(Object obj, yv1 yv1Var) {
        ((ke) obj).b();
    }

    public /* synthetic */ cl1(float f10) {
        this.f10165a = 27;
    }

    public /* synthetic */ cl1(int i4) {
        this.f10165a = 25;
    }

    public /* synthetic */ cl1(int i4, int i10) {
        this.f10165a = 24;
    }

    public /* synthetic */ cl1(int i4, Object obj) {
        this.f10165a = i4;
    }

    public /* synthetic */ cl1(h5 h5Var, int i4) {
        this.f10165a = 28;
    }

    public /* synthetic */ cl1(boolean z3) {
        this.f10165a = 20;
    }
}

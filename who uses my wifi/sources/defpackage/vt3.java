package defpackage;

import android.os.Build;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.ECPoint;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class vt3 implements wv3, av3, bw3, uv3, xu3 {
    public final /* synthetic */ int f;
    public static final /* synthetic */ vt3 g = new vt3(0);
    public static final /* synthetic */ vt3 h = new vt3(1);
    public static final /* synthetic */ vt3 i = new vt3(2);
    public static final /* synthetic */ vt3 j = new vt3(3);
    public static final /* synthetic */ vt3 k = new vt3(4);
    public static final /* synthetic */ vt3 l = new vt3(5);
    public static final /* synthetic */ vt3 m = new vt3(6);
    public static final /* synthetic */ vt3 n = new vt3(7);
    public static final /* synthetic */ vt3 o = new vt3(8);
    public static final /* synthetic */ vt3 p = new vt3(9);
    public static final /* synthetic */ vt3 q = new vt3(10);
    public static final /* synthetic */ vt3 r = new vt3(11);
    public static final /* synthetic */ vt3 s = new vt3(12);
    public static final /* synthetic */ vt3 t = new vt3(13);
    public static final /* synthetic */ vt3 u = new vt3(15);
    public static final /* synthetic */ vt3 v = new vt3(16);
    public static final /* synthetic */ vt3 w = new vt3(17);
    public static final /* synthetic */ vt3 x = new vt3(18);
    public static final /* synthetic */ vt3 y = new vt3(19);
    public static final /* synthetic */ vt3 z = new vt3(20);
    public static final /* synthetic */ vt3 A = new vt3(21);
    public static final /* synthetic */ vt3 B = new vt3(22);
    public static final /* synthetic */ vt3 C = new vt3(23);
    public static final /* synthetic */ vt3 D = new vt3(24);
    public static final /* synthetic */ vt3 E = new vt3(25);
    public static final /* synthetic */ vt3 F = new vt3(26);
    public static final /* synthetic */ vt3 G = new vt3(27);
    public static final /* synthetic */ vt3 H = new vt3(28);
    public static final /* synthetic */ vt3 I = new vt3(29);

    public /* synthetic */ vt3(int i2) {
        this.f = i2;
    }

    @Override // defpackage.bw3
    /* renamed from: b, reason: collision with other method in class */
    public Object mo19b(gi2 gi2Var) throws GeneralSecurityException {
        switch (this.f) {
            case 12:
                pw3 pw3Var = (pw3) gi2Var;
                aw3 aw3Var = qw3.a;
                if (pw3Var.j.a == 32) {
                    return new r34(pw3Var);
                }
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            case 13:
                return new r34((uw3) gi2Var);
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            default:
                k24 k24Var = (k24) gi2Var;
                try {
                    return v24.b(k24Var);
                } catch (NoSuchProviderException unused) {
                    KeyFactory keyFactory = (KeyFactory) m34.g.a.l("RSA");
                    l24 l24Var = k24Var.j;
                    l24 l24Var2 = k24Var.j;
                    BigInteger bigInteger = l24Var.k;
                    j24 j24Var = l24Var2.j;
                    j24 j24Var2 = l24Var2.j;
                    RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger, j24Var.b, (BigInteger) k24Var.k.f, (BigInteger) k24Var.l.f, (BigInteger) k24Var.m.f, (BigInteger) k24Var.n.f, (BigInteger) k24Var.o.f, (BigInteger) k24Var.p.f));
                    tb1 tb1Var = u34.a;
                    p34 p34Var = (p34) tb1Var.b(j24Var2.d);
                    p34 p34Var2 = (p34) tb1Var.b(j24Var2.e);
                    l24Var2.l.b();
                    v24 v24Var = new v24();
                    if (mu3.a()) {
                        throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
                    }
                    bd2.L(p34Var);
                    if (!p34Var.equals(p34Var2)) {
                        throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
                    }
                    bd2.M(rSAPrivateCrtKey.getModulus().bitLength());
                    bd2.P(rSAPrivateCrtKey.getPublicExponent());
                    return v24Var;
                }
            case 19:
                m14 m14Var = (m14) gi2Var;
                Provider providerT = ob1.t();
                p34 p34Var3 = (p34) s24.i.b(m14Var.j.j.c);
                tb1 tb1Var2 = s24.j;
                n14 n14Var = m14Var.j;
                n14Var.l.b();
                v24 v24Var2 = new v24();
                if (!yb.x(2)) {
                    throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
                }
                bd2.L(p34Var3);
                p34Var3.toString().concat("withECDSA");
                return v24Var2;
            case 20:
                r14 r14Var = (r14) gi2Var;
                if (!yb.x(1)) {
                    throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
                }
                try {
                    return v24.a(r14Var);
                } catch (GeneralSecurityException unused2) {
                    yf3 yf3Var = r14Var.k;
                    t14 t14Var = r14Var.j;
                    byte[] bArrB = ((v34) yf3Var.f).b();
                    t14Var.l.b();
                    v24 v24Var3 = new v24();
                    if (!yb.x(1)) {
                        throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
                    }
                    if (bArrB.length != 32) {
                        throw new IllegalArgumentException("Given private key's length is not 32");
                    }
                    ou1.L(ou1.O(bArrB));
                    return v24Var3;
                }
            case zy1.zzm /* 21 */:
                fw3 fw3Var = ((fv3) gi2Var).j;
                int i2 = dv3.b[ex0.s(fw3Var.f)];
                x24.a(fw3Var);
                ((i04) fw3Var.j).equals(i04.LEGACY);
                return new v24();
            case 22:
                d24 d24Var = (d24) gi2Var;
                int i3 = ow3.a;
                if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
                    (!Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT)).getClass();
                }
                Provider providerT2 = ob1.t();
                KeyFactory keyFactory2 = providerT2 != null ? KeyFactory.getInstance("RSA", providerT2) : (KeyFactory) m34.g.a.l("RSA");
                e24 e24Var = d24Var.j;
                BigInteger bigInteger2 = e24Var.k;
                c24 c24Var = e24Var.j;
                a34 a34Var = new a34((RSAPrivateCrtKey) keyFactory2.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger2, c24Var.b, (BigInteger) d24Var.k.f, (BigInteger) d24Var.l.f, (BigInteger) d24Var.m.f, (BigInteger) d24Var.n.f, (BigInteger) d24Var.o.f, (BigInteger) d24Var.p.f)), c24Var.d, e24Var.l.b(), c24Var.c.equals(b24.d) ? a34.h : a34.g, providerT2 != null ? b34.c(e24Var, providerT2) : s34.a(e24Var), providerT2);
                String str = a34Var.b;
                Provider provider = a34Var.f;
                Signature signature = provider != null ? Signature.getInstance(str, provider) : (Signature) m34.d.a.l(str);
                signature.initSign(a34Var.a);
                byte[] bArr = a34.i;
                signature.update(bArr);
                byte[] bArr2 = a34Var.d;
                if (bArr2.length > 0) {
                    signature.update(bArr2);
                }
                byte[] bArrSign = signature.sign();
                byte[] bArr3 = a34Var.c;
                if (bArr3.length > 0) {
                    bArrSign = i41.L(bArr3, bArrSign);
                }
                try {
                    a34Var.e.b(bArrSign, bArr);
                    return a34Var;
                } catch (GeneralSecurityException e) {
                    throw new IllegalStateException("RSA signature computation error", e);
                }
        }
    }

    @Override // defpackage.uv3
    public mr3 e(gw3 gw3Var) throws GeneralSecurityException {
        switch (this.f) {
            case 24:
                vv3 vv3Var = q24.a;
                qz3 qz3Var = (qz3) gw3Var.h;
                if (!qz3Var.A().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parseParameters: ".concat(String.valueOf(qz3Var.A())));
                }
                try {
                    a54 a54VarB = qz3Var.B();
                    h54 h54Var = h54.a;
                    int i2 = u44.a;
                    uy3 uy3VarB = uy3.B(a54VarB, h54.b);
                    p21 p21Var = new p21(26);
                    p21Var.h = q24.b(uy3VarB.A().A());
                    p21Var.f = q24.h(uy3VarB.A().F());
                    p21Var.g = q24.g(uy3VarB.A().E());
                    p21Var.i = q24.c(qz3Var.C());
                    return p21Var.L();
                } catch (a64 e) {
                    throw new GeneralSecurityException("Parsing EcdsaParameters failed: ", e);
                }
            default:
                vv3 vv3Var2 = u24.a;
                qz3 qz3Var2 = (qz3) gw3Var.h;
                if (!qz3Var2.A().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parseParameters: ".concat(String.valueOf(qz3Var2.A())));
                }
                try {
                    a54 a54VarB2 = qz3Var2.B();
                    h54 h54Var2 = h54.a;
                    int i3 = u44.a;
                    if (bz3.B(a54VarB2, h54.b).A() == 0) {
                        return new q14((p14) u24.g.c(qz3Var2.C()));
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (a64 e2) {
                    throw new GeneralSecurityException("Parsing Ed25519Parameters failed: ", e2);
                }
        }
    }

    @Override // defpackage.wv3
    public gw3 f(mr3 mr3Var) {
        switch (this.f) {
            case 0:
                hs3 hs3Var = (hs3) mr3Var;
                vv3 vv3Var = wt3.a;
                pz3 pz3VarE = qz3.E();
                pz3VarE.g("type.googleapis.com/google.crypto.tink.AesEaxKey");
                ey3 ey3VarD = fy3.D();
                gy3 gy3VarB = hy3.B();
                int i2 = hs3Var.b;
                gy3VarB.b();
                ((hy3) gy3VarB.g).D(i2);
                hy3 hy3Var = (hy3) gy3VarB.d();
                ey3VarD.b();
                ((fy3) ey3VarD.g).E(hy3Var);
                int i3 = hs3Var.a;
                ey3VarD.b();
                ((fy3) ey3VarD.g).F(i3);
                pz3VarE.h(((fy3) ey3VarD.d()).a());
                pz3VarE.i(wt3.a(hs3Var.c));
                return gw3.D((qz3) pz3VarE.d());
            case 2:
                ms3 ms3Var = (ms3) mr3Var;
                vv3 vv3Var2 = yt3.a;
                pz3 pz3VarE2 = qz3.E();
                pz3VarE2.g("type.googleapis.com/google.crypto.tink.AesGcmKey");
                ky3 ky3VarD = ly3.D();
                int i4 = ms3Var.a;
                ky3VarD.b();
                ((ly3) ky3VarD.g).E(i4);
                pz3VarE2.h(((ly3) ky3VarD.d()).a());
                pz3VarE2.i(yt3.a(ms3Var.b));
                return gw3.D((qz3) pz3VarE2.d());
            case 4:
                qs3 qs3Var = (qs3) mr3Var;
                vv3 vv3Var3 = au3.a;
                pz3 pz3VarE3 = qz3.E();
                pz3VarE3.g("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
                oy3 oy3VarD = py3.D();
                int i5 = qs3Var.a;
                oy3VarD.b();
                ((py3) oy3VarD.g).E(i5);
                pz3VarE3.h(((py3) oy3VarD.d()).a());
                pz3VarE3.i(au3.a(qs3Var.b));
                return gw3.D((qz3) pz3VarE3.d());
            case 6:
                vv3 vv3Var4 = cu3.a;
                pz3 pz3VarE4 = qz3.E();
                pz3VarE4.g("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
                pz3VarE4.h(sy3.B().a());
                pz3VarE4.i(cu3.a(((us3) mr3Var).a));
                return gw3.D((qz3) pz3VarE4.d());
            case 8:
                ot3 ot3Var = (ot3) mr3Var;
                vv3 vv3Var5 = iu3.a;
                pz3 pz3VarE5 = qz3.E();
                pz3VarE5.g("type.googleapis.com/google.crypto.tink.XAesGcmKey");
                c14 c14VarD = d14.D();
                e14 e14VarB = f14.B();
                int i6 = ot3Var.b;
                e14VarB.b();
                ((f14) e14VarB.g).D(i6);
                f14 f14Var = (f14) e14VarB.d();
                c14VarD.b();
                ((d14) c14VarD.g).E(f14Var);
                pz3VarE5.h(((d14) c14VarD.d()).a());
                pz3VarE5.i(iu3.a(ot3Var.a));
                return gw3.D((qz3) pz3VarE5.d());
            case 10:
                vv3 vv3Var6 = ju3.a;
                pz3 pz3VarE6 = qz3.E();
                pz3VarE6.g("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
                pz3VarE6.h(i14.C().a());
                pz3VarE6.i(ju3.a(((rt3) mr3Var).a));
                return gw3.D((qz3) pz3VarE6.d());
            case 16:
                rw3 rw3Var = (rw3) mr3Var;
                vv3 vv3Var7 = gx3.a;
                pz3 pz3VarE7 = qz3.E();
                pz3VarE7.g("type.googleapis.com/google.crypto.tink.AesCmacKey");
                ox3 ox3VarD = px3.D();
                qx3 qx3VarB = rx3.B();
                int i7 = rw3Var.b;
                qx3VarB.b();
                ((rx3) qx3VarB.g).D(i7);
                rx3 rx3Var = (rx3) qx3VarB.d();
                ox3VarD.b();
                ((px3) ox3VarD.g).F(rx3Var);
                int i8 = rw3Var.a;
                ox3VarD.b();
                ((px3) ox3VarD.g).E(i8);
                pz3VarE7.h(((px3) ox3VarD.d()).a());
                pz3VarE7.i(gx3.a(rw3Var.c));
                return gw3.D((qz3) pz3VarE7.d());
            default:
                zw3 zw3Var = (zw3) mr3Var;
                tb1 tb1Var = hx3.a;
                pz3 pz3VarE8 = qz3.E();
                pz3VarE8.g("type.googleapis.com/google.crypto.tink.HmacKey");
                jz3 jz3VarE = kz3.E();
                lz3 lz3VarC = mz3.C();
                int i9 = zw3Var.b;
                lz3VarC.b();
                ((mz3) lz3VarC.g).F(i9);
                gz3 gz3Var = (gz3) hx3.b.b(zw3Var.d);
                lz3VarC.b();
                ((mz3) lz3VarC.g).E(gz3Var);
                mz3 mz3Var = (mz3) lz3VarC.d();
                jz3VarE.b();
                ((kz3) jz3VarE.g).G(mz3Var);
                int i10 = zw3Var.a;
                jz3VarE.b();
                ((kz3) jz3VarE.g).H(i10);
                pz3VarE8.h(((kz3) jz3VarE.d()).a());
                pz3VarE8.i((i04) hx3.a.b(zw3Var.c));
                return gw3.D((qz3) pz3VarE8.d());
        }
    }

    @Override // defpackage.xu3
    public gi2 g(fw3 fw3Var) throws GeneralSecurityException {
        switch (this.f) {
            case 25:
                vv3 vv3Var = q24.a;
                String str = (String) fw3Var.g;
                if (!str.equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(str)));
                }
                try {
                    a54 a54Var = (a54) fw3Var.i;
                    h54 h54Var = h54.a;
                    int i2 = u44.a;
                    az3 az3VarE = az3.E(a54Var, h54.b);
                    if (az3VarE.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    p21 p21Var = new p21(26);
                    p21Var.h = q24.b(az3VarE.B().A());
                    p21Var.f = q24.h(az3VarE.B().F());
                    p21Var.g = q24.g(az3VarE.B().E());
                    p21Var.i = q24.c((i04) fw3Var.j);
                    l14 l14VarL = p21Var.L();
                    jr3 jr3Var = new jr3(4, false);
                    jr3Var.g = l14VarL;
                    jr3Var.h = new ECPoint(new BigInteger(1, az3VarE.C().p()), new BigInteger(1, az3VarE.D().p()));
                    jr3Var.i = (Integer) fw3Var.k;
                    return jr3Var.m();
                } catch (a64 | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
                }
            case 26:
                vv3 vv3Var2 = q24.a;
                String str2 = (String) fw3Var.g;
                if (!str2.equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str2)));
                }
                try {
                    a54 a54Var2 = (a54) fw3Var.i;
                    h54 h54Var2 = h54.a;
                    int i3 = u44.a;
                    yy3 yy3VarD = yy3.D(a54Var2, h54.b);
                    if (yy3VarD.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    az3 az3VarB = yy3VarD.B();
                    if (az3VarB.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    p21 p21Var2 = new p21(26);
                    p21Var2.h = q24.b(az3VarB.B().A());
                    p21Var2.f = q24.h(az3VarB.B().F());
                    p21Var2.g = q24.g(az3VarB.B().E());
                    p21Var2.i = q24.c((i04) fw3Var.j);
                    l14 l14VarL2 = p21Var2.L();
                    jr3 jr3Var2 = new jr3(4, false);
                    jr3Var2.g = l14VarL2;
                    jr3Var2.h = new ECPoint(new BigInteger(1, az3VarB.C().p()), new BigInteger(1, az3VarB.D().p()));
                    jr3Var2.i = (Integer) fw3Var.k;
                    n14 n14VarM = jr3Var2.m();
                    mr2 mr2Var = new mr2(15);
                    mr2Var.g = n14VarM;
                    mr2Var.h = new x34(new BigInteger(1, yy3VarD.C().p()));
                    return mr2Var.C();
                } catch (a64 | IllegalArgumentException unused2) {
                    throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
                }
            case 27:
            default:
                vv3 vv3Var3 = u24.a;
                String str3 = (String) fw3Var.g;
                if (!str3.equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str3)));
                }
                try {
                    a54 a54Var3 = (a54) fw3Var.i;
                    h54 h54Var3 = h54.a;
                    int i4 = u44.a;
                    dz3 dz3VarD = dz3.D(a54Var3, h54.b);
                    if (dz3VarD.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    fz3 fz3VarC = dz3VarD.C();
                    if (fz3VarC.A() == 0) {
                        return r14.r0(t14.s0((p14) u24.g.c((i04) fw3Var.j), v34.a(fz3VarC.B().p()), (Integer) fw3Var.k), yf3.b(dz3VarD.B().p()));
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (a64 unused3) {
                    throw new GeneralSecurityException("Parsing Ed25519PrivateKey failed");
                }
            case 28:
                vv3 vv3Var4 = u24.a;
                String str4 = (String) fw3Var.g;
                if (!str4.equals("type.googleapis.com/google.crypto.tink.Ed25519PublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: ".concat(String.valueOf(str4)));
                }
                try {
                    a54 a54Var4 = (a54) fw3Var.i;
                    h54 h54Var4 = h54.a;
                    int i5 = u44.a;
                    fz3 fz3VarC2 = fz3.C(a54Var4, h54.b);
                    if (fz3VarC2.A() == 0) {
                        return t14.s0((p14) u24.g.c((i04) fw3Var.j), v34.a(fz3VarC2.B().p()), (Integer) fw3Var.k);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (a64 unused4) {
                    throw new GeneralSecurityException("Parsing Ed25519PublicKey failed");
                }
        }
    }

    @Override // defpackage.av3
    public fw3 b(gi2 gi2Var) {
        switch (this.f) {
            case 1:
                is3 is3Var = (is3) gi2Var;
                vv3 vv3Var = yt3.a;
                iy3 iy3VarD = jy3.D();
                byte[] bArrB = ((v34) is3Var.k.f).b();
                y44 y44VarN = a54.n(bArrB, 0, bArrB.length);
                iy3VarD.b();
                ((jy3) iy3VarD.g).F(y44VarN);
                return fw3.v("type.googleapis.com/google.crypto.tink.AesGcmKey", ((jy3) iy3VarD.d()).a(), 2, yt3.a(is3Var.j.b), is3Var.m);
            case 3:
                ns3 ns3Var = (ns3) gi2Var;
                vv3 vv3Var2 = au3.a;
                my3 my3VarD = ny3.D();
                byte[] bArrB2 = ((v34) ns3Var.k.f).b();
                y44 y44VarN2 = a54.n(bArrB2, 0, bArrB2.length);
                my3VarD.b();
                ((ny3) my3VarD.g).F(y44VarN2);
                return fw3.v("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((ny3) my3VarD.d()).a(), 2, au3.a(ns3Var.j.b), ns3Var.m);
            case 5:
                rs3 rs3Var = (rs3) gi2Var;
                vv3 vv3Var3 = cu3.a;
                qy3 qy3VarD = ry3.D();
                byte[] bArrB3 = ((v34) rs3Var.k.f).b();
                y44 y44VarN3 = a54.n(bArrB3, 0, bArrB3.length);
                qy3VarD.b();
                ((ry3) qy3VarD.g).F(y44VarN3);
                return fw3.v("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((ry3) qy3VarD.d()).a(), 2, cu3.a(rs3Var.j.a), rs3Var.m);
            case 7:
                mt3 mt3Var = (mt3) gi2Var;
                vv3 vv3Var4 = iu3.a;
                a14 a14VarE = b14.E();
                byte[] bArrB4 = ((v34) mt3Var.k.f).b();
                y44 y44VarN4 = a54.n(bArrB4, 0, bArrB4.length);
                a14VarE.b();
                ((b14) a14VarE.g).G(y44VarN4);
                e14 e14VarB = f14.B();
                ot3 ot3Var = mt3Var.j;
                int i2 = ot3Var.b;
                e14VarB.b();
                ((f14) e14VarB.g).D(i2);
                f14 f14Var = (f14) e14VarB.d();
                a14VarE.b();
                ((b14) a14VarE.g).F(f14Var);
                return fw3.v("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((b14) a14VarE.d()).a(), 2, iu3.a(ot3Var.a), mt3Var.m);
            case 9:
                pt3 pt3Var = (pt3) gi2Var;
                vv3 vv3Var5 = ju3.a;
                g14 g14VarD = h14.D();
                byte[] bArrB5 = ((v34) pt3Var.k.f).b();
                y44 y44VarN5 = a54.n(bArrB5, 0, bArrB5.length);
                g14VarD.b();
                ((h14) g14VarD.g).F(y44VarN5);
                return fw3.v("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((h14) g14VarD.d()).a(), 2, ju3.a(pt3Var.j.a), pt3Var.m);
            case 11:
                fw3 fw3Var = ((fv3) gi2Var).j;
                int i3 = dv3.b[ex0.s(fw3Var.f)];
                return fw3Var;
            case 15:
                pw3 pw3Var = (pw3) gi2Var;
                vv3 vv3Var6 = gx3.a;
                mx3 mx3VarE = nx3.E();
                rw3 rw3Var = pw3Var.j;
                qx3 qx3VarB = rx3.B();
                int i4 = rw3Var.b;
                qx3VarB.b();
                ((rx3) qx3VarB.g).D(i4);
                rx3 rx3Var = (rx3) qx3VarB.d();
                mx3VarE.b();
                ((nx3) mx3VarE.g).H(rx3Var);
                byte[] bArrB6 = ((v34) pw3Var.k.f).b();
                y44 y44VarN6 = a54.n(bArrB6, 0, bArrB6.length);
                mx3VarE.b();
                ((nx3) mx3VarE.g).G(y44VarN6);
                return fw3.v("type.googleapis.com/google.crypto.tink.AesCmacKey", ((nx3) mx3VarE.d()).a(), 2, gx3.a(pw3Var.j.c), pw3Var.m);
            default:
                uw3 uw3Var = (uw3) gi2Var;
                tb1 tb1Var = hx3.a;
                hz3 hz3VarE = iz3.E();
                zw3 zw3Var = uw3Var.j;
                lz3 lz3VarC = mz3.C();
                int i5 = zw3Var.b;
                lz3VarC.b();
                ((mz3) lz3VarC.g).F(i5);
                gz3 gz3Var = (gz3) hx3.b.b(zw3Var.d);
                lz3VarC.b();
                ((mz3) lz3VarC.g).E(gz3Var);
                mz3 mz3Var = (mz3) lz3VarC.d();
                hz3VarE.b();
                ((iz3) hz3VarE.g).H(mz3Var);
                byte[] bArrB7 = ((v34) uw3Var.k.f).b();
                y44 y44VarN7 = a54.n(bArrB7, 0, bArrB7.length);
                hz3VarE.b();
                ((iz3) hz3VarE.g).I(y44VarN7);
                return fw3.v("type.googleapis.com/google.crypto.tink.HmacKey", ((iz3) hz3VarE.d()).a(), 2, (i04) hx3.a.b(uw3Var.j.c), uw3Var.m);
        }
    }
}

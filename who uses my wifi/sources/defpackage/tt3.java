package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.RSAPublicKeySpec;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class tt3 implements xu3, uv3, bw3, av3, wv3 {
    public final /* synthetic */ int f;
    public static final /* synthetic */ tt3 g = new tt3(0);
    public static final /* synthetic */ tt3 h = new tt3(1);
    public static final /* synthetic */ tt3 i = new tt3(2);
    public static final /* synthetic */ tt3 j = new tt3(3);
    public static final /* synthetic */ tt3 k = new tt3(4);
    public static final /* synthetic */ tt3 l = new tt3(5);
    public static final /* synthetic */ tt3 m = new tt3(6);
    public static final /* synthetic */ tt3 n = new tt3(7);
    public static final /* synthetic */ tt3 o = new tt3(8);
    public static final /* synthetic */ tt3 p = new tt3(9);
    public static final /* synthetic */ tt3 q = new tt3(10);
    public static final /* synthetic */ tt3 r = new tt3(11);
    public static final /* synthetic */ tt3 s = new tt3(12);
    public static final /* synthetic */ tt3 t = new tt3(13);
    public static final /* synthetic */ tt3 u = new tt3(14);
    public static final /* synthetic */ tt3 v = new tt3(15);
    public static final /* synthetic */ tt3 w = new tt3(16);
    public static final /* synthetic */ tt3 x = new tt3(17);
    public static final /* synthetic */ tt3 y = new tt3(18);
    public static final /* synthetic */ tt3 z = new tt3(20);
    public static final /* synthetic */ tt3 A = new tt3(21);
    public static final /* synthetic */ tt3 B = new tt3(22);
    public static final /* synthetic */ tt3 C = new tt3(23);
    public static final /* synthetic */ tt3 D = new tt3(24);
    public static final /* synthetic */ tt3 E = new tt3(25);
    public static final /* synthetic */ tt3 F = new tt3(26);
    public static final /* synthetic */ tt3 G = new tt3(27);
    public static final /* synthetic */ tt3 H = new tt3(28);
    public static final /* synthetic */ tt3 I = new tt3(29);

    public /* synthetic */ tt3(int i2) {
        this.f = i2;
    }

    @Override // defpackage.bw3
    /* renamed from: b */
    public Object mo19b(gi2 gi2Var) throws GeneralSecurityException {
        switch (this.f) {
            case 12:
                pw3 pw3Var = (pw3) gi2Var;
                aw3 aw3Var = qw3.a;
                if (pw3Var.j.a != 32) {
                    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
                }
                if (!yb.x(1)) {
                    throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
                }
                Provider providerT = ob1.t();
                if (providerT != null) {
                    try {
                        return sw3.a(pw3Var, providerT);
                    } catch (GeneralSecurityException unused) {
                    }
                }
                return new sw3();
            case 13:
                sw3 sw3Var = new sw3();
                if (yb.x(2)) {
                    return sw3Var;
                }
                throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
            case 14:
                fw3 fw3Var = ((fv3) gi2Var).j;
                int[] iArr = dv3.b;
                int i2 = fw3Var.f;
                Integer num = (Integer) fw3Var.k;
                int i3 = iArr[ex0.s(i2)];
                int iOrdinal = ((i04) fw3Var.j).ordinal();
                if (iOrdinal == 1) {
                    sv3.b(num.intValue()).b();
                } else if (iOrdinal == 2) {
                    sv3.a(num.intValue()).b();
                } else if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                    sv3.a(num.intValue()).b();
                } else {
                    sv3.a.b();
                }
                return new dx3();
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            default:
                l24 l24Var = (l24) gi2Var;
                tb1 tb1Var = u34.a;
                try {
                    return d34.d(l24Var);
                } catch (NoSuchProviderException unused2) {
                    KeyFactory keyFactory = (KeyFactory) m34.g.a.l("RSA");
                    BigInteger bigInteger = l24Var.k;
                    j24 j24Var = l24Var.j;
                    RSAPublicKey rSAPublicKey = (RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, j24Var.b));
                    tb1 tb1Var2 = u34.a;
                    return new t34(rSAPublicKey, (p34) tb1Var2.b(j24Var.d), (p34) tb1Var2.b(j24Var.e), j24Var.f, l24Var.l.b(), j24Var.c.equals(i24.d) ? u34.c : u34.b);
                }
            case 20:
                n14 n14Var = (n14) gi2Var;
                byte[] bArr = s24.g;
                Provider providerT2 = ob1.t();
                tb1 tb1Var3 = s24.k;
                l14 l14Var = n14Var.j;
                return new s24((ECPublicKey) (providerT2 != null ? KeyFactory.getInstance("EC", providerT2) : (KeyFactory) m34.g.a.l("EC")).generatePublic(new ECPublicKeySpec(n14Var.k, ob1.y((h34) tb1Var3.b(l14Var.b)))), (p34) s24.i.b(l14Var.c), (i34) s24.j.b(l14Var.a), n14Var.l.b(), l14Var.d.equals(ts3.m) ? s24.h : s24.g, providerT2);
            case zy1.zzm /* 21 */:
                t14 t14Var = (t14) gi2Var;
                if (!yb.x(1)) {
                    throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
                }
                try {
                    return w24.a(t14Var);
                } catch (GeneralSecurityException unused3) {
                    return new x24(t14Var.k.b(), t14Var.l.b(), t14Var.j.a.equals(p14.d) ? new byte[]{0} : new byte[0]);
                }
            case 22:
                fw3 fw3Var2 = ((fv3) gi2Var).j;
                int i4 = dv3.b[ex0.s(fw3Var2.f)];
                return new x24((or3) vu3.d.b(or3.class, (String) fw3Var2.g).a((a54) fw3Var2.i), x24.a(fw3Var2), ((i04) fw3Var2.j).equals(i04.LEGACY) ? new byte[]{0} : new byte[0]);
            case 23:
                return s34.a((e24) gi2Var);
        }
    }

    @Override // defpackage.uv3
    public mr3 e(gw3 gw3Var) throws GeneralSecurityException {
        switch (this.f) {
            case 1:
                vv3 vv3Var = yt3.a;
                qz3 qz3Var = (qz3) gw3Var.h;
                if (!qz3Var.A().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(qz3Var.A())));
                }
                try {
                    a54 a54VarB = qz3Var.B();
                    h54 h54Var = h54.a;
                    int i2 = u44.a;
                    ly3 ly3VarC = ly3.C(a54VarB, h54.b);
                    if (ly3VarC.B() != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    mc2 mc2Var = new mc2(24);
                    mc2Var.i(ly3VarC.A());
                    mc2Var.n();
                    mc2Var.t();
                    mc2Var.j = yt3.b(qz3Var.C());
                    return mc2Var.z();
                } catch (a64 e) {
                    throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e);
                }
            case 3:
                vv3 vv3Var2 = au3.a;
                qz3 qz3Var2 = (qz3) gw3Var.h;
                if (!qz3Var2.A().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(qz3Var2.A())));
                }
                try {
                    a54 a54VarB2 = qz3Var2.B();
                    h54 h54Var2 = h54.a;
                    int i3 = u44.a;
                    py3 py3VarC = py3.C(a54VarB2, h54.b);
                    if (py3VarC.B() != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    int iA = py3VarC.A();
                    if (iA == 16 || iA == 32) {
                        return new qs3(iA, au3.b(qz3Var2.C()));
                    }
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(iA)));
                } catch (a64 e2) {
                    throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e2);
                }
            case 5:
                vv3 vv3Var3 = cu3.a;
                qz3 qz3Var3 = (qz3) gw3Var.h;
                if (!qz3Var3.A().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(qz3Var3.A())));
                }
                try {
                    a54 a54VarB3 = qz3Var3.B();
                    h54 h54Var3 = h54.a;
                    int i4 = u44.a;
                    sy3.A(a54VarB3, h54.b);
                    return new us3(cu3.b(qz3Var3.C()));
                } catch (a64 e3) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e3);
                }
            case 7:
                vv3 vv3Var4 = iu3.a;
                qz3 qz3Var4 = (qz3) gw3Var.h;
                if (!qz3Var4.A().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(qz3Var4.A())));
                }
                try {
                    a54 a54VarB4 = qz3Var4.B();
                    h54 h54Var4 = h54.a;
                    int i5 = u44.a;
                    d14 d14VarC = d14.C(a54VarB4, h54.b);
                    if (d14VarC.A() == 0) {
                        return ot3.b(iu3.b(qz3Var4.C()), d14VarC.B().A());
                    }
                    throw new GeneralSecurityException("Only version 0 parameters are accepted");
                } catch (a64 e4) {
                    throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e4);
                }
            case 9:
                vv3 vv3Var5 = ju3.a;
                qz3 qz3Var5 = (qz3) gw3Var.h;
                if (!qz3Var5.A().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(qz3Var5.A())));
                }
                try {
                    a54 a54VarB5 = qz3Var5.B();
                    h54 h54Var5 = h54.a;
                    int i6 = u44.a;
                    if (i14.B(a54VarB5, h54.b).A() == 0) {
                        return new rt3(ju3.b(qz3Var5.C()));
                    }
                    throw new GeneralSecurityException("Only version 0 parameters are accepted");
                } catch (a64 e5) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e5);
                }
            case 15:
                vv3 vv3Var6 = gx3.a;
                qz3 qz3Var6 = (qz3) gw3Var.h;
                if (!qz3Var6.A().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(qz3Var6.A())));
                }
                try {
                    a54 a54VarB6 = qz3Var6.B();
                    h54 h54Var6 = h54.a;
                    int i7 = u44.a;
                    px3 px3VarC = px3.C(a54VarB6, h54.b);
                    jr3 jr3Var = new jr3(3);
                    jr3Var.b(px3VarC.A());
                    jr3Var.g(px3VarC.B().A());
                    jr3Var.i = gx3.b(qz3Var6.C());
                    return jr3Var.l();
                } catch (a64 e6) {
                    throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e6);
                }
            default:
                tb1 tb1Var = hx3.a;
                qz3 qz3Var7 = (qz3) gw3Var.h;
                if (!qz3Var7.A().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(qz3Var7.A())));
                }
                try {
                    a54 a54VarB7 = qz3Var7.B();
                    h54 h54Var7 = h54.a;
                    int i8 = u44.a;
                    kz3 kz3VarD = kz3.D(a54VarB7, h54.b);
                    if (kz3VarD.C() != 0) {
                        int iC = kz3VarD.C();
                        throw new GeneralSecurityException(ex0.j(new StringBuilder(String.valueOf(iC).length() + 47), "Parsing HmacParameters failed: unknown Version ", iC));
                    }
                    mc2 mc2Var2 = new mc2(25);
                    mc2Var2.i(kz3VarD.B());
                    mc2Var2.o(kz3VarD.A().B());
                    mc2Var2.i = (xw3) hx3.b.c(kz3VarD.A().A());
                    mc2Var2.j = (yw3) hx3.a.c(qz3Var7.C());
                    return mc2Var2.A();
                } catch (a64 e7) {
                    throw new GeneralSecurityException("Parsing HmacParameters failed: ", e7);
                }
        }
    }

    @Override // defpackage.wv3
    public gw3 f(mr3 mr3Var) {
        l14 l14Var = (l14) mr3Var;
        vv3 vv3Var = q24.a;
        pz3 pz3VarE = qz3.E();
        pz3VarE.g("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        ty3 ty3VarC = uy3.C();
        wy3 wy3VarE = q24.e(l14Var);
        ty3VarC.b();
        ((uy3) ty3VarC.g).D(wy3VarE);
        pz3VarE.h(((uy3) ty3VarC.d()).a());
        pz3VarE.i(q24.a(l14Var.d));
        return gw3.D((qz3) pz3VarE.d());
    }

    @Override // defpackage.xu3
    public gi2 g(fw3 fw3Var) throws GeneralSecurityException {
        int i2 = 3;
        switch (this.f) {
            case 0:
                vv3 vv3Var = wt3.a;
                if (!((String) fw3Var.g).equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
                }
                try {
                    a54 a54Var = (a54) fw3Var.i;
                    h54 h54Var = h54.a;
                    int i3 = u44.a;
                    dy3 dy3VarD = dy3.D(a54Var, h54.b);
                    if (dy3VarD.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    p21 p21Var = new p21(24);
                    p21Var.A(dy3VarD.C().d());
                    p21Var.D(dy3VarD.B().A());
                    p21Var.F();
                    p21Var.i = wt3.b((i04) fw3Var.j);
                    hs3 hs3VarK = p21Var.K();
                    pb3 pb3Var = new pb3(2);
                    pb3Var.g = hs3VarK;
                    pb3Var.h = yf3.b(dy3VarD.C().p());
                    pb3Var.i = (Integer) fw3Var.k;
                    return pb3Var.f();
                } catch (a64 unused) {
                    throw new GeneralSecurityException("Parsing AesEaxcKey failed");
                }
            case 2:
                vv3 vv3Var2 = yt3.a;
                if (!((String) fw3Var.g).equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
                }
                try {
                    a54 a54Var2 = (a54) fw3Var.i;
                    h54 h54Var2 = h54.a;
                    int i4 = u44.a;
                    jy3 jy3VarC = jy3.C(a54Var2, h54.b);
                    if (jy3VarC.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    mc2 mc2Var = new mc2(24);
                    mc2Var.i(jy3VarC.B().d());
                    mc2Var.n();
                    mc2Var.t();
                    mc2Var.j = yt3.b((i04) fw3Var.j);
                    ms3 ms3VarZ = mc2Var.z();
                    jr3 jr3Var = new jr3(1, false);
                    jr3Var.g = ms3VarZ;
                    jr3Var.h = yf3.b(jy3VarC.B().p());
                    jr3Var.i = (Integer) fw3Var.k;
                    return jr3Var.k();
                } catch (a64 unused2) {
                    throw new GeneralSecurityException("Parsing AesGcmKey failed");
                }
            case 4:
                vv3 vv3Var3 = au3.a;
                if (!((String) fw3Var.g).equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
                }
                try {
                    a54 a54Var3 = (a54) fw3Var.i;
                    h54 h54Var3 = h54.a;
                    int i5 = u44.a;
                    ny3 ny3VarC = ny3.C(a54Var3, h54.b);
                    if (ny3VarC.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    int iD = ny3VarC.B().d();
                    if (iD != 16 && iD != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(iD)));
                    }
                    qs3 qs3Var = new qs3(iD, au3.b((i04) fw3Var.j));
                    pb3 pb3Var2 = new pb3(i2);
                    pb3Var2.g = qs3Var;
                    pb3Var2.h = yf3.b(ny3VarC.B().p());
                    pb3Var2.i = (Integer) fw3Var.k;
                    return pb3Var2.g();
                } catch (a64 unused3) {
                    throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                }
            case 6:
                vv3 vv3Var4 = cu3.a;
                if (!((String) fw3Var.g).equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    a54 a54Var4 = (a54) fw3Var.i;
                    h54 h54Var4 = h54.a;
                    int i6 = u44.a;
                    ry3 ry3VarC = ry3.C(a54Var4, h54.b);
                    if (ry3VarC.A() == 0) {
                        return rs3.s0(cu3.b((i04) fw3Var.j), yf3.b(ry3VarC.B().p()), (Integer) fw3Var.k);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (a64 unused4) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                }
            case 8:
                vv3 vv3Var5 = iu3.a;
                if (!((String) fw3Var.g).equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
                }
                try {
                    a54 a54Var5 = (a54) fw3Var.i;
                    h54 h54Var5 = h54.a;
                    int i7 = u44.a;
                    b14 b14VarD = b14.D(a54Var5, h54.b);
                    if (b14VarD.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (b14VarD.C().d() == 32) {
                        return mt3.s0(ot3.b(iu3.b((i04) fw3Var.j), b14VarD.B().A()), yf3.b(b14VarD.C().p()), (Integer) fw3Var.k);
                    }
                    throw new GeneralSecurityException("Only 32 byte key size is accepted");
                } catch (a64 unused5) {
                    throw new GeneralSecurityException("Parsing XAesGcmKey failed");
                }
            case 10:
                vv3 vv3Var6 = ju3.a;
                if (!((String) fw3Var.g).equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    a54 a54Var6 = (a54) fw3Var.i;
                    h54 h54Var6 = h54.a;
                    int i8 = u44.a;
                    h14 h14VarC = h14.C(a54Var6, h54.b);
                    if (h14VarC.A() == 0) {
                        return pt3.s0(ju3.b((i04) fw3Var.j), yf3.b(h14VarC.B().p()), (Integer) fw3Var.k);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (a64 unused6) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                }
            case 16:
                vv3 vv3Var7 = gx3.a;
                if (!((String) fw3Var.g).equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
                }
                try {
                    a54 a54Var7 = (a54) fw3Var.i;
                    h54 h54Var7 = h54.a;
                    int i9 = u44.a;
                    nx3 nx3VarD = nx3.D(a54Var7, h54.b);
                    if (nx3VarD.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    jr3 jr3Var2 = new jr3(3);
                    jr3Var2.b(nx3VarD.B().d());
                    jr3Var2.g(nx3VarD.C().A());
                    jr3Var2.i = gx3.b((i04) fw3Var.j);
                    rw3 rw3VarL = jr3Var2.l();
                    pb3 pb3Var3 = new pb3(4);
                    pb3Var3.g = rw3VarL;
                    pb3Var3.h = yf3.b(nx3VarD.B().p());
                    pb3Var3.i = (Integer) fw3Var.k;
                    return pb3Var3.h();
                } catch (a64 | IllegalArgumentException unused7) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
                }
            default:
                tb1 tb1Var = hx3.a;
                if (!((String) fw3Var.g).equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
                }
                try {
                    a54 a54Var8 = (a54) fw3Var.i;
                    h54 h54Var8 = h54.a;
                    int i10 = u44.a;
                    iz3 iz3VarD = iz3.D(a54Var8, h54.b);
                    if (iz3VarD.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    mc2 mc2Var2 = new mc2(25);
                    mc2Var2.i(iz3VarD.C().d());
                    mc2Var2.o(iz3VarD.B().B());
                    mc2Var2.i = (xw3) hx3.b.c(iz3VarD.B().A());
                    mc2Var2.j = (yw3) hx3.a.c((i04) fw3Var.j);
                    zw3 zw3VarA = mc2Var2.A();
                    pb3 pb3Var4 = new pb3(5);
                    pb3Var4.g = zw3VarA;
                    pb3Var4.h = yf3.b(iz3VarD.C().p());
                    pb3Var4.i = (Integer) fw3Var.k;
                    return pb3Var4.i();
                } catch (a64 | IllegalArgumentException unused8) {
                    throw new GeneralSecurityException("Parsing HmacKey failed");
                }
        }
    }

    @Override // defpackage.bw3
    /* renamed from: b */
    public fw3 mo19b(gi2 gi2Var) throws GeneralSecurityException {
        switch (this.f) {
            case 25:
                n14 n14Var = (n14) gi2Var;
                return fw3.v("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", q24.f(n14Var).a(), 4, q24.a(n14Var.j.d), n14Var.m);
            case 26:
                m14 m14Var = (m14) gi2Var;
                vv3 vv3Var = q24.a;
                int iD = q24.d(m14Var.j.j.b);
                xy3 xy3VarE = yy3.E();
                n14 n14Var2 = m14Var.j;
                az3 az3VarF = q24.f(n14Var2);
                xy3VarE.b();
                ((yy3) xy3VarE.g).G(az3VarF);
                byte[] bArrV = a30.v((BigInteger) m14Var.k.f, iD);
                y44 y44Var = a54.g;
                y44 y44VarN = a54.n(bArrV, 0, bArrV.length);
                xy3VarE.b();
                ((yy3) xy3VarE.g).H(y44VarN);
                return fw3.v("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", ((yy3) xy3VarE.d()).a(), 3, q24.a(n14Var2.j.d), n14Var2.m);
            case 27:
            default:
                r14 r14Var = (r14) gi2Var;
                vv3 vv3Var2 = u24.a;
                cz3 cz3VarE = dz3.E();
                fz3 fz3VarA = u24.a(r14Var.j);
                cz3VarE.b();
                ((dz3) cz3VarE.g).H(fz3VarA);
                byte[] bArrB = ((v34) r14Var.k.f).b();
                y44 y44VarN2 = a54.n(bArrB, 0, bArrB.length);
                cz3VarE.b();
                ((dz3) cz3VarE.g).G(y44VarN2);
                y44 y44VarA = ((dz3) cz3VarE.d()).a();
                tb1 tb1Var = u24.g;
                t14 t14Var = r14Var.j;
                return fw3.v("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", y44VarA, 3, (i04) tb1Var.b(t14Var.j.a), t14Var.m);
            case 28:
                t14 t14Var2 = (t14) gi2Var;
                return fw3.v("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", u24.a(t14Var2).a(), 4, (i04) u24.g.b(t14Var2.j.a), t14Var2.m);
        }
    }
}

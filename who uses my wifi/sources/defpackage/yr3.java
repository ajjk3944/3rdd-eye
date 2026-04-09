package defpackage;

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

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class yr3 implements iv3 {
    public static final /* synthetic */ yr3 b = new yr3(0);
    public static final /* synthetic */ yr3 c = new yr3(1);
    public static final /* synthetic */ yr3 d = new yr3(2);
    public static final /* synthetic */ yr3 e = new yr3(3);
    public static final /* synthetic */ yr3 f = new yr3(4);
    public static final /* synthetic */ yr3 g = new yr3(5);
    public static final /* synthetic */ yr3 h = new yr3(6);
    public static final /* synthetic */ yr3 i = new yr3(7);
    public static final /* synthetic */ yr3 j = new yr3(8);
    public static final /* synthetic */ yr3 k = new yr3(9);
    public static final /* synthetic */ yr3 l = new yr3(10);
    public static final /* synthetic */ yr3 m = new yr3(11);
    public static final /* synthetic */ yr3 n = new yr3(12);
    public static final /* synthetic */ yr3 o = new yr3(13);
    public static final /* synthetic */ yr3 p = new yr3(14);
    public static final /* synthetic */ yr3 q = new yr3(15);
    public final /* synthetic */ int a;

    public /* synthetic */ yr3(int i2) {
        this.a = i2;
    }

    @Override // defpackage.iv3
    public final gi2 a(mr3 mr3Var, Integer num) throws GeneralSecurityException {
        switch (this.a) {
            case 0:
                ds3 ds3Var = (ds3) mr3Var;
                aw3 aw3Var = as3.a;
                int i2 = ds3Var.a;
                if (i2 != 16 && i2 != 32) {
                    throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
                }
                mc2 mc2Var = new mc2(23);
                mc2Var.g = ds3Var;
                mc2Var.j = num;
                mc2Var.h = yf3.d(i2);
                mc2Var.i = yf3.d(ds3Var.b);
                return mc2Var.y();
            case 1:
                hs3 hs3Var = (hs3) mr3Var;
                aw3 aw3Var2 = fs3.a;
                int i3 = hs3Var.a;
                if (i3 == 24) {
                    throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
                }
                pb3 pb3Var = new pb3(2);
                pb3Var.g = hs3Var;
                pb3Var.i = num;
                pb3Var.h = yf3.d(i3);
                return pb3Var.f();
            case 2:
                ms3 ms3Var = (ms3) mr3Var;
                aw3 aw3Var3 = ks3.a;
                int i4 = ms3Var.a;
                if (i4 == 24) {
                    throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
                }
                jr3 jr3Var = new jr3(1, false);
                jr3Var.g = ms3Var;
                jr3Var.i = num;
                jr3Var.h = yf3.d(i4);
                return jr3Var.k();
            case 3:
                qs3 qs3Var = (qs3) mr3Var;
                aw3 aw3Var4 = os3.a;
                pb3 pb3Var2 = new pb3(3);
                pb3Var2.g = qs3Var;
                pb3Var2.i = num;
                pb3Var2.h = yf3.d(qs3Var.a);
                return pb3Var2.g();
            case 4:
                aw3 aw3Var5 = ss3.a;
                return rs3.s0(((us3) mr3Var).a, yf3.d(32), num);
            case 5:
                aw3 aw3Var6 = vs3.a;
                return ys3.s0((at3) mr3Var, num);
            case 6:
                cv3 cv3Var = xs3.a;
                return ct3.s0((dt3) mr3Var, num);
            case 7:
                return mt3.s0((ot3) mr3Var, yf3.d(32), num);
            case 8:
                aw3 aw3Var7 = qt3.a;
                return pt3.s0(((rt3) mr3Var).a, yf3.d(32), num);
            case 9:
                jv3 jv3Var = jv3.b;
                qz3 qz3Var = (qz3) ((gv3) mr3Var).a.h;
                vu3 vu3Var = vu3.d;
                cv3 cv3VarD = vu3Var.d(qz3Var.A());
                if (!((Boolean) vu3Var.b.get(qz3Var.A())).booleanValue()) {
                    throw new GeneralSecurityException("Creating new keys is not allowed.");
                }
                a54 a54VarB = qz3Var.B();
                cv3VarD.getClass();
                pz3 pz3VarE = qz3.E();
                pz3VarE.g(cv3VarD.a);
                pz3VarE.h(a54VarB);
                pz3VarE.i(i04.RAW);
                qz3 qz3Var2 = (qz3) pz3VarE.d();
                gw3 gw3Var = new gw3(qz3Var2, ow3.b(qz3Var2.A()), 0);
                rv3 rv3Var = rv3.b;
                fw3 fw3Var = (fw3) rv3Var.f(jv3.b.b(rv3Var.g(gw3Var), null));
                nz3 nz3VarD = oz3.D();
                String str = (String) fw3Var.g;
                nz3VarD.b();
                ((oz3) nz3VarD.g).F(str);
                a54 a54Var = (a54) fw3Var.i;
                nz3VarD.b();
                ((oz3) nz3VarD.g).G(a54Var);
                int i5 = fw3Var.f;
                nz3VarD.b();
                ((oz3) nz3VarD.g).H(i5);
                oz3 oz3Var = (oz3) nz3VarD.d();
                return new fv3(fw3.v(oz3Var.A(), oz3Var.B(), oz3Var.C(), qz3Var.C(), num));
            case 10:
                rw3 rw3Var = (rw3) mr3Var;
                aw3 aw3Var8 = qw3.a;
                int i6 = rw3Var.a;
                if (i6 != 32) {
                    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
                }
                pb3 pb3Var3 = new pb3(4);
                pb3Var3.g = rw3Var;
                pb3Var3.h = yf3.d(i6);
                pb3Var3.i = num;
                return pb3Var3.h();
            case 11:
                zw3 zw3Var = (zw3) mr3Var;
                aw3 aw3Var9 = ww3.a;
                pb3 pb3Var4 = new pb3(5);
                pb3Var4.g = zw3Var;
                pb3Var4.h = yf3.d(zw3Var.a);
                pb3Var4.i = num;
                return pb3Var4.i();
            case 12:
                l14 l14Var = (l14) mr3Var;
                aw3 aw3Var10 = o14.a;
                ECParameterSpec eCParameterSpec = l14Var.b.b;
                KeyPairGenerator keyPairGenerator = (KeyPairGenerator) m34.f.a.l("EC");
                keyPairGenerator.initialize(eCParameterSpec);
                KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
                ECPublicKey eCPublicKey = (ECPublicKey) keyPairGenerateKeyPair.getPublic();
                ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairGenerateKeyPair.getPrivate();
                jr3 jr3Var2 = new jr3(4, false);
                jr3Var2.g = l14Var;
                jr3Var2.i = num;
                jr3Var2.h = eCPublicKey.getW();
                n14 n14VarM = jr3Var2.m();
                mr2 mr2Var = new mr2(15);
                mr2Var.g = n14VarM;
                mr2Var.h = new x34(eCPrivateKey.getS());
                return mr2Var.C();
            case 13:
                q14 q14Var = (q14) mr3Var;
                aw3 aw3Var11 = s14.a;
                byte[] bArrA = hw3.a(32);
                if (bArrA.length != 32) {
                    throw new IllegalArgumentException("Given secret seed length is not 32");
                }
                return r14.r0(t14.s0(q14Var.a, v34.a(Arrays.copyOf(ou1.L(ou1.O(bArrA)), 32)), num), new yf3(v34.a(Arrays.copyOf(bArrA, bArrA.length))));
            case 14:
                c24 c24Var = (c24) mr3Var;
                aw3 aw3Var12 = f24.a;
                KeyPairGenerator keyPairGenerator2 = (KeyPairGenerator) m34.f.a.l("RSA");
                keyPairGenerator2.initialize(new RSAKeyGenParameterSpec(c24Var.a, new BigInteger(1, c24Var.b.toByteArray())));
                KeyPair keyPairGenerateKeyPair2 = keyPairGenerator2.generateKeyPair();
                RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPairGenerateKeyPair2.getPublic();
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyPairGenerateKeyPair2.getPrivate();
                pb3 pb3Var5 = new pb3(6);
                pb3Var5.g = c24Var;
                pb3Var5.h = rSAPublicKey.getModulus();
                pb3Var5.i = num;
                e24 e24VarJ = pb3Var5.j();
                uk1 uk1Var = new uk1(false);
                uk1Var.f = e24VarJ;
                x34 x34Var = new x34(rSAPrivateCrtKey.getPrimeP());
                x34 x34Var2 = new x34(rSAPrivateCrtKey.getPrimeQ());
                uk1Var.h = x34Var;
                uk1Var.i = x34Var2;
                uk1Var.g = new x34(rSAPrivateCrtKey.getPrivateExponent());
                x34 x34Var3 = new x34(rSAPrivateCrtKey.getPrimeExponentP());
                x34 x34Var4 = new x34(rSAPrivateCrtKey.getPrimeExponentQ());
                uk1Var.j = x34Var3;
                uk1Var.k = x34Var4;
                uk1Var.l = new x34(rSAPrivateCrtKey.getCrtCoefficient());
                return uk1Var.n();
            default:
                j24 j24Var = (j24) mr3Var;
                aw3 aw3Var13 = m24.a;
                KeyPairGenerator keyPairGenerator3 = (KeyPairGenerator) m34.f.a.l("RSA");
                keyPairGenerator3.initialize(new RSAKeyGenParameterSpec(j24Var.a, new BigInteger(1, j24Var.b.toByteArray())));
                KeyPair keyPairGenerateKeyPair3 = keyPairGenerator3.generateKeyPair();
                RSAPublicKey rSAPublicKey2 = (RSAPublicKey) keyPairGenerateKeyPair3.getPublic();
                RSAPrivateCrtKey rSAPrivateCrtKey2 = (RSAPrivateCrtKey) keyPairGenerateKeyPair3.getPrivate();
                jr3 jr3Var3 = new jr3(5, false);
                jr3Var3.g = j24Var;
                jr3Var3.h = rSAPublicKey2.getModulus();
                jr3Var3.i = num;
                l24 l24VarN = jr3Var3.n();
                uk1 uk1Var2 = new uk1(false);
                uk1Var2.f = l24VarN;
                x34 x34Var5 = new x34(rSAPrivateCrtKey2.getPrimeP());
                x34 x34Var6 = new x34(rSAPrivateCrtKey2.getPrimeQ());
                uk1Var2.h = x34Var5;
                uk1Var2.i = x34Var6;
                uk1Var2.g = new x34(rSAPrivateCrtKey2.getPrivateExponent());
                x34 x34Var7 = new x34(rSAPrivateCrtKey2.getPrimeExponentP());
                x34 x34Var8 = new x34(rSAPrivateCrtKey2.getPrimeExponentQ());
                uk1Var2.j = x34Var7;
                uk1Var2.k = x34Var8;
                uk1Var2.l = new x34(rSAPrivateCrtKey2.getCrtCoefficient());
                return uk1Var2.o();
        }
    }
}

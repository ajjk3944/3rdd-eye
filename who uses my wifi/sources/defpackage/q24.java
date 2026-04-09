package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class q24 {
    public static final vv3 a;
    public static final tv3 b;
    public static final zu3 c;
    public static final wu3 d;
    public static final zu3 e;
    public static final wu3 f;

    static {
        v34 v34VarA = ow3.a("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        v34 v34VarA2 = ow3.a("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
        a = new vv3(l14.class, tt3.G);
        b = new tv3(v34VarA, vt3.D);
        c = new zu3(n14.class, tt3.E);
        d = new wu3(v34VarA2, vt3.E);
        e = new zu3(m14.class, tt3.F);
        f = new wu3(v34VarA, vt3.F);
    }

    public static i04 a(ts3 ts3Var) throws GeneralSecurityException {
        if (ts3.k.equals(ts3Var)) {
            return i04.TINK;
        }
        if (ts3.l.equals(ts3Var)) {
            return i04.CRUNCHY;
        }
        if (ts3.n.equals(ts3Var)) {
            return i04.RAW;
        }
        if (ts3.m.equals(ts3Var)) {
            return i04.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(ts3Var.g));
    }

    public static ls3 b(gz3 gz3Var) throws GeneralSecurityException {
        int iOrdinal = gz3Var.ordinal();
        if (iOrdinal == 2) {
            return ls3.g;
        }
        if (iOrdinal == 3) {
            return ls3.f;
        }
        if (iOrdinal == 4) {
            return ls3.h;
        }
        int iA = gz3Var.a();
        throw new GeneralSecurityException(ex0.j(new StringBuilder(String.valueOf(iA).length() + 26), "Unable to parse HashType: ", iA));
    }

    public static ts3 c(i04 i04Var) throws GeneralSecurityException {
        int iOrdinal = i04Var.ordinal();
        if (iOrdinal == 1) {
            return ts3.k;
        }
        if (iOrdinal == 2) {
            return ts3.m;
        }
        if (iOrdinal == 3) {
            return ts3.n;
        }
        if (iOrdinal == 4) {
            return ts3.l;
        }
        int iA = i04Var.a();
        throw new GeneralSecurityException(ex0.j(new StringBuilder(String.valueOf(iA).length() + 34), "Unable to parse OutputPrefixType: ", iA));
    }

    public static int d(j14 j14Var) {
        if (j14.c.equals(j14Var)) {
            return 33;
        }
        if (j14.d.equals(j14Var)) {
            return 49;
        }
        if (j14.e.equals(j14Var)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType ".concat(j14Var.a));
    }

    public static wy3 e(l14 l14Var) {
        gz3 gz3Var;
        int i;
        vy3 vy3VarB = wy3.B();
        ls3 ls3Var = l14Var.c;
        if (ls3.f.equals(ls3Var)) {
            gz3Var = gz3.SHA256;
        } else if (ls3.g.equals(ls3Var)) {
            gz3Var = gz3.SHA384;
        } else {
            if (!ls3.h.equals(ls3Var)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(ls3Var.b));
            }
            gz3Var = gz3.SHA512;
        }
        vy3VarB.b();
        ((wy3) vy3VarB.g).D(gz3Var);
        j14 j14Var = l14Var.b;
        int i2 = 4;
        if (j14.c.equals(j14Var)) {
            i = 4;
        } else if (j14.d.equals(j14Var)) {
            i = 5;
        } else {
            if (!j14.e.equals(j14Var)) {
                throw new GeneralSecurityException("Unable to serialize CurveType ".concat(j14Var.a));
            }
            i = 6;
        }
        vy3VarB.b();
        ((wy3) vy3VarB.g).G(i);
        ps3 ps3Var = l14Var.a;
        if (ps3.k.equals(ps3Var)) {
            i2 = 3;
        } else if (!ps3.l.equals(ps3Var)) {
            throw new GeneralSecurityException("Unable to serialize SignatureEncoding ".concat(ps3Var.g));
        }
        vy3VarB.b();
        ((wy3) vy3VarB.g).H(i2);
        return (wy3) vy3VarB.d();
    }

    public static az3 f(n14 n14Var) {
        int iD = d(n14Var.j.b);
        ECPoint eCPoint = n14Var.k;
        zy3 zy3VarF = az3.F();
        wy3 wy3VarE = e(n14Var.j);
        zy3VarF.b();
        ((az3) zy3VarF.g).I(wy3VarE);
        byte[] bArrV = a30.v(eCPoint.getAffineX(), iD);
        y44 y44Var = a54.g;
        y44 y44VarN = a54.n(bArrV, 0, bArrV.length);
        zy3VarF.b();
        ((az3) zy3VarF.g).J(y44VarN);
        byte[] bArrV2 = a30.v(eCPoint.getAffineY(), iD);
        y44 y44VarN2 = a54.n(bArrV2, 0, bArrV2.length);
        zy3VarF.b();
        ((az3) zy3VarF.g).K(y44VarN2);
        return (az3) zy3VarF.d();
    }

    public static j14 g(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 2) {
            return j14.c;
        }
        if (i2 == 3) {
            return j14.d;
        }
        if (i2 == 4) {
            return j14.e;
        }
        if (i != 1) {
            throw new GeneralSecurityException(ex0.j(new StringBuilder(String.valueOf(i2).length() + 35), "Unable to parse EllipticCurveType: ", i2));
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static ps3 h(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 1) {
            return ps3.k;
        }
        if (i2 == 2) {
            return ps3.l;
        }
        if (i != 1) {
            throw new GeneralSecurityException(ex0.j(new StringBuilder(String.valueOf(i2).length() + 40), "Unable to parse EcdsaSignatureEncoding: ", i2));
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

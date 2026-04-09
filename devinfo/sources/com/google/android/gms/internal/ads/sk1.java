package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class sk1 {

    /* renamed from: a, reason: collision with root package name */
    public static final qd1 f16449a;

    /* renamed from: b, reason: collision with root package name */
    public static final od1 f16450b;

    /* renamed from: c, reason: collision with root package name */
    public static final wc1 f16451c;

    /* renamed from: d, reason: collision with root package name */
    public static final uc1 f16452d;

    /* renamed from: e, reason: collision with root package name */
    public static final wc1 f16453e;

    /* renamed from: f, reason: collision with root package name */
    public static final uc1 f16454f;

    static {
        vl1 vl1VarA = je1.a("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        vl1 vl1VarA2 = je1.a("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
        f16449a = new qd1(lj1.class, df1.f10462s);
        f16450b = new od1(vl1VarA, df1.f10457n);
        f16451c = new wc1(nj1.class, df1.f10458o);
        f16452d = new uc1(vl1VarA2, df1.f10459p);
        f16453e = new wc1(mj1.class, df1.f10460q);
        f16454f = new uc1(vl1VarA, df1.f10461r);
    }

    public static ii1 a(m91 m91Var) throws GeneralSecurityException {
        if (m91.f13820r.equals(m91Var)) {
            return ii1.TINK;
        }
        if (m91.f13821s.equals(m91Var)) {
            return ii1.CRUNCHY;
        }
        if (m91.f13823u.equals(m91Var)) {
            return ii1.RAW;
        }
        if (m91.f13822t.equals(m91Var)) {
            return ii1.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(m91Var.f13825b));
    }

    public static ja1 b(fh1 fh1Var) throws GeneralSecurityException {
        int iOrdinal = fh1Var.ordinal();
        if (iOrdinal == 2) {
            return ja1.f12704p;
        }
        if (iOrdinal == 3) {
            return ja1.f12703o;
        }
        if (iOrdinal == 4) {
            return ja1.f12705q;
        }
        int iB = fh1Var.b();
        throw new GeneralSecurityException(d.h.q(iB, "Unable to parse HashType: ", new StringBuilder(String.valueOf(iB).length() + 26)));
    }

    public static m91 c(ii1 ii1Var) throws GeneralSecurityException {
        int iOrdinal = ii1Var.ordinal();
        if (iOrdinal == 1) {
            return m91.f13820r;
        }
        if (iOrdinal == 2) {
            return m91.f13822t;
        }
        if (iOrdinal == 3) {
            return m91.f13823u;
        }
        if (iOrdinal == 4) {
            return m91.f13821s;
        }
        int iB = ii1Var.b();
        throw new GeneralSecurityException(d.h.q(iB, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iB).length() + 34)));
    }

    public static int d(kj1 kj1Var) throws GeneralSecurityException {
        if (kj1.f13172c.equals(kj1Var)) {
            return 33;
        }
        if (kj1.f13173d.equals(kj1Var)) {
            return 49;
        }
        if (kj1.f13174e.equals(kj1Var)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType ".concat(kj1Var.f13175a));
    }

    public static vg1 e(lj1 lj1Var) throws GeneralSecurityException {
        fh1 fh1Var;
        int i4;
        ug1 ug1VarB = vg1.B();
        ja1 ja1Var = lj1Var.f13509c;
        if (ja1.f12703o.equals(ja1Var)) {
            fh1Var = fh1.SHA256;
        } else if (ja1.f12704p.equals(ja1Var)) {
            fh1Var = fh1.SHA384;
        } else {
            if (!ja1.f12705q.equals(ja1Var)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(ja1Var.f12707b));
            }
            fh1Var = fh1.SHA512;
        }
        ug1VarB.b();
        ((vg1) ug1VarB.f14755b).D(fh1Var);
        kj1 kj1Var = lj1Var.f13508b;
        int i10 = 4;
        if (kj1.f13172c.equals(kj1Var)) {
            i4 = 4;
        } else if (kj1.f13173d.equals(kj1Var)) {
            i4 = 5;
        } else {
            if (!kj1.f13174e.equals(kj1Var)) {
                throw new GeneralSecurityException("Unable to serialize CurveType ".concat(kj1Var.f13175a));
            }
            i4 = 6;
        }
        ug1VarB.b();
        ((vg1) ug1VarB.f14755b).G(i4);
        ka1 ka1Var = lj1Var.f13507a;
        if (ka1.f13110r.equals(ka1Var)) {
            i10 = 3;
        } else if (!ka1.f13111s.equals(ka1Var)) {
            throw new GeneralSecurityException("Unable to serialize SignatureEncoding ".concat(ka1Var.f13113b));
        }
        ug1VarB.b();
        ((vg1) ug1VarB.f14755b).H(i10);
        return (vg1) ug1VarB.e();
    }

    public static zg1 f(nj1 nj1Var) throws GeneralSecurityException {
        int iD = d(nj1Var.f14304c.f13508b);
        ECPoint eCPoint = nj1Var.f14305d;
        yg1 yg1VarF = zg1.F();
        vg1 vg1VarE = e(nj1Var.f14304c);
        yg1VarF.b();
        ((zg1) yg1VarF.f14755b).I(vg1VarE);
        byte[] bArrX = yr1.x(eCPoint.getAffineX(), iD);
        zm1 zm1Var = bn1.f9729b;
        zm1 zm1VarV = bn1.v(0, bArrX.length, bArrX);
        yg1VarF.b();
        ((zg1) yg1VarF.f14755b).J(zm1VarV);
        byte[] bArrX2 = yr1.x(eCPoint.getAffineY(), iD);
        zm1 zm1VarV2 = bn1.v(0, bArrX2.length, bArrX2);
        yg1VarF.b();
        ((zg1) yg1VarF.f14755b).K(zm1VarV2);
        return (zg1) yg1VarF.e();
    }

    public static kj1 g(int i4) throws GeneralSecurityException {
        int i10 = i4 - 2;
        if (i10 == 2) {
            return kj1.f13172c;
        }
        if (i10 == 3) {
            return kj1.f13173d;
        }
        if (i10 == 4) {
            return kj1.f13174e;
        }
        if (i4 != 1) {
            throw new GeneralSecurityException(d.h.q(i10, "Unable to parse EllipticCurveType: ", new StringBuilder(String.valueOf(i10).length() + 35)));
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static ka1 h(int i4) throws GeneralSecurityException {
        int i10 = i4 - 2;
        if (i10 == 1) {
            return ka1.f13110r;
        }
        if (i10 == 2) {
            return ka1.f13111s;
        }
        if (i4 != 1) {
            throw new GeneralSecurityException(d.h.q(i10, "Unable to parse EcdsaSignatureEncoding: ", new StringBuilder(String.valueOf(i10).length() + 40)));
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* loaded from: classes.dex */
public abstract class FJ {

    /* renamed from: a, reason: collision with root package name */
    public static final C1037dG f8081a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0928bG f8082b;

    /* renamed from: c, reason: collision with root package name */
    public static final JF f8083c;

    /* renamed from: d, reason: collision with root package name */
    public static final HF f8084d;

    /* renamed from: e, reason: collision with root package name */
    public static final JF f8085e;

    /* renamed from: f, reason: collision with root package name */
    public static final HF f8086f;

    static {
        C1313iK c1313iKA = AbstractC2062wG.a("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        C1313iK c1313iKA2 = AbstractC2062wG.a("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
        f8081a = new C1037dG(XI.class, C1312iJ.f14716l);
        f8082b = new C0928bG(c1313iKA, C1312iJ.f14712g);
        f8083c = new JF(ZI.class, C1312iJ.f14713h);
        f8084d = new HF(c1313iKA2, C1312iJ.i);
        f8085e = new JF(YI.class, C1312iJ.f14714j);
        f8086f = new HF(c1313iKA, C1312iJ.f14715k);
    }

    public static EnumC1956uI a(AE ae) throws GeneralSecurityException {
        if (AE.f6963k.equals(ae)) {
            return EnumC1956uI.TINK;
        }
        if (AE.f6964l.equals(ae)) {
            return EnumC1956uI.CRUNCHY;
        }
        if (AE.f6966n.equals(ae)) {
            return EnumC1956uI.RAW;
        }
        if (AE.f6965m.equals(ae)) {
            return EnumC1956uI.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(ae.f6968b));
    }

    public static C1952uE b(RH rh) throws GeneralSecurityException {
        int iOrdinal = rh.ordinal();
        if (iOrdinal == 2) {
            return C1952uE.f17091n;
        }
        if (iOrdinal == 3) {
            return C1952uE.f17090m;
        }
        if (iOrdinal == 4) {
            return C1952uE.f17080C;
        }
        int iA = rh.a();
        throw new GeneralSecurityException(A.f.i(iA, "Unable to parse HashType: ", new StringBuilder(String.valueOf(iA).length() + 26)));
    }

    public static AE c(EnumC1956uI enumC1956uI) throws GeneralSecurityException {
        int iOrdinal = enumC1956uI.ordinal();
        if (iOrdinal == 1) {
            return AE.f6963k;
        }
        if (iOrdinal == 2) {
            return AE.f6965m;
        }
        if (iOrdinal == 3) {
            return AE.f6966n;
        }
        if (iOrdinal == 4) {
            return AE.f6964l;
        }
        int iA = enumC1956uI.a();
        throw new GeneralSecurityException(A.f.i(iA, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iA).length() + 34)));
    }

    public static int d(WI wi) {
        if (WI.f12196c.equals(wi)) {
            return 33;
        }
        if (WI.f12197d.equals(wi)) {
            return 49;
        }
        if (WI.f12198e.equals(wi)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType ".concat(wi.f12199a));
    }

    public static HH e(XI xi) {
        RH rh;
        int i;
        GH ghB = HH.B();
        C1952uE c1952uE = xi.f12410c;
        if (C1952uE.f17090m.equals(c1952uE)) {
            rh = RH.SHA256;
        } else if (C1952uE.f17091n.equals(c1952uE)) {
            rh = RH.SHA384;
        } else {
            if (!C1952uE.f17080C.equals(c1952uE)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(c1952uE.f17093b));
            }
            rh = RH.SHA512;
        }
        ghB.b();
        ((HH) ghB.f13551b).D(rh);
        WI wi = xi.f12409b;
        int i3 = 4;
        if (WI.f12196c.equals(wi)) {
            i = 4;
        } else if (WI.f12197d.equals(wi)) {
            i = 5;
        } else {
            if (!WI.f12198e.equals(wi)) {
                throw new GeneralSecurityException("Unable to serialize CurveType ".concat(wi.f12199a));
            }
            i = 6;
        }
        ghB.b();
        ((HH) ghB.f13551b).G(i);
        C2006vE c2006vE = xi.f12408a;
        if (C2006vE.f17244k.equals(c2006vE)) {
            i3 = 3;
        } else if (!C2006vE.f17245l.equals(c2006vE)) {
            throw new GeneralSecurityException("Unable to serialize SignatureEncoding ".concat(c2006vE.f17247b));
        }
        ghB.b();
        ((HH) ghB.f13551b).H(i3);
        return (HH) ghB.d();
    }

    public static LH f(ZI zi) {
        int iD = d(zi.f12812c.f12409b);
        ECPoint eCPoint = zi.f12813d;
        KH khF = LH.F();
        HH hhE = e(zi.f12812c);
        khF.b();
        ((LH) khF.f13551b).I(hhE);
        byte[] bArrY = C1476lN.y(eCPoint.getAffineX(), iD);
        OK ok = QK.f10609b;
        OK okR = QK.r(0, bArrY.length, bArrY);
        khF.b();
        ((LH) khF.f13551b).J(okR);
        byte[] bArrY2 = C1476lN.y(eCPoint.getAffineY(), iD);
        OK okR2 = QK.r(0, bArrY2.length, bArrY2);
        khF.b();
        ((LH) khF.f13551b).K(okR2);
        return (LH) khF.d();
    }

    public static WI g(int i) throws GeneralSecurityException {
        int i3 = i - 2;
        if (i3 == 2) {
            return WI.f12196c;
        }
        if (i3 == 3) {
            return WI.f12197d;
        }
        if (i3 == 4) {
            return WI.f12198e;
        }
        if (i != 1) {
            throw new GeneralSecurityException(A.f.i(i3, "Unable to parse EllipticCurveType: ", new StringBuilder(String.valueOf(i3).length() + 35)));
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static C2006vE h(int i) throws GeneralSecurityException {
        int i3 = i - 2;
        if (i3 == 1) {
            return C2006vE.f17244k;
        }
        if (i3 == 2) {
            return C2006vE.f17245l;
        }
        if (i != 1) {
            throw new GeneralSecurityException(A.f.i(i3, "Unable to parse EcdsaSignatureEncoding: ", new StringBuilder(String.valueOf(i3).length() + 40)));
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

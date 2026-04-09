package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.cF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0981cF {

    /* renamed from: a, reason: collision with root package name */
    public static final C1037dG f13544a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0928bG f13545b;

    /* renamed from: c, reason: collision with root package name */
    public static final JF f13546c;

    /* renamed from: d, reason: collision with root package name */
    public static final HF f13547d;

    static {
        C1313iK c1313iKA = AbstractC2062wG.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f13544a = new C1037dG(C2060wE.class, ME.f9825D);
        f13545b = new C0928bG(c1313iKA, ME.f9850m);
        f13546c = new JF(C1737qE.class, ME.f9851n);
        f13547d = new HF(c1313iKA, ME.f9824C);
    }

    public static EnumC1956uI a(C2006vE c2006vE) throws GeneralSecurityException {
        if (C2006vE.f17237c.equals(c2006vE)) {
            return EnumC1956uI.TINK;
        }
        if (C2006vE.f17238d.equals(c2006vE)) {
            return EnumC1956uI.CRUNCHY;
        }
        if (C2006vE.f17239e.equals(c2006vE)) {
            return EnumC1956uI.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c2006vE)));
    }

    public static C2006vE b(EnumC1956uI enumC1956uI) throws GeneralSecurityException {
        int iOrdinal = enumC1956uI.ordinal();
        if (iOrdinal == 1) {
            return C2006vE.f17237c;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return C2006vE.f17239e;
            }
            if (iOrdinal != 4) {
                int iA = enumC1956uI.a();
                throw new GeneralSecurityException(A.f.i(iA, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iA).length() + 34)));
            }
        }
        return C2006vE.f17238d;
    }

    public static C1952uE c(RH rh) throws GeneralSecurityException {
        int iOrdinal = rh.ordinal();
        if (iOrdinal == 1) {
            return C1952uE.f17081c;
        }
        if (iOrdinal == 2) {
            return C1952uE.f17084f;
        }
        if (iOrdinal == 3) {
            return C1952uE.f17083e;
        }
        if (iOrdinal == 4) {
            return C1952uE.f17085g;
        }
        if (iOrdinal == 5) {
            return C1952uE.f17082d;
        }
        int iA = rh.a();
        throw new GeneralSecurityException(A.f.i(iA, "Unable to parse HashType: ", new StringBuilder(String.valueOf(iA).length() + 26)));
    }

    public static XH d(C2060wE c2060wE) throws GeneralSecurityException {
        RH rh;
        WH whC = XH.C();
        int i = c2060wE.f17412d;
        whC.b();
        ((XH) whC.f13551b).F(i);
        C1952uE c1952uE = c2060wE.f17414f;
        if (C1952uE.f17081c.equals(c1952uE)) {
            rh = RH.SHA1;
        } else if (C1952uE.f17082d.equals(c1952uE)) {
            rh = RH.SHA224;
        } else if (C1952uE.f17083e.equals(c1952uE)) {
            rh = RH.SHA256;
        } else if (C1952uE.f17084f.equals(c1952uE)) {
            rh = RH.SHA384;
        } else {
            if (!C1952uE.f17085g.equals(c1952uE)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(c1952uE)));
            }
            rh = RH.SHA512;
        }
        whC.b();
        ((XH) whC.f13551b).E(rh);
        return (XH) whC.d();
    }
}

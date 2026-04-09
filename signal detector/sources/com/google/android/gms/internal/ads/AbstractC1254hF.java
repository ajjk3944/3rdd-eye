package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.hF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1254hF {

    /* renamed from: a, reason: collision with root package name */
    public static final C1037dG f14466a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0928bG f14467b;

    /* renamed from: c, reason: collision with root package name */
    public static final JF f14468c;

    /* renamed from: d, reason: collision with root package name */
    public static final HF f14469d;

    static {
        C1313iK c1313iKA = AbstractC2062wG.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f14466a = new C1037dG(HE.class, ME.f9836P);
        f14467b = new C0928bG(c1313iKA, ME.M);
        f14468c = new JF(FE.class, ME.f9834N);
        f14469d = new HF(c1313iKA, ME.f9835O);
    }

    public static EnumC1956uI a(C1952uE c1952uE) throws GeneralSecurityException {
        if (C1952uE.f17086h.equals(c1952uE)) {
            return EnumC1956uI.TINK;
        }
        if (C1952uE.i.equals(c1952uE)) {
            return EnumC1956uI.CRUNCHY;
        }
        if (C1952uE.f17087j.equals(c1952uE)) {
            return EnumC1956uI.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c1952uE)));
    }

    public static C1952uE b(EnumC1956uI enumC1956uI) throws GeneralSecurityException {
        int iOrdinal = enumC1956uI.ordinal();
        if (iOrdinal == 1) {
            return C1952uE.f17086h;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return C1952uE.f17087j;
            }
            if (iOrdinal != 4) {
                int iA = enumC1956uI.a();
                throw new GeneralSecurityException(A.f.i(iA, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iA).length() + 34)));
            }
        }
        return C1952uE.i;
    }
}

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class QE {

    /* renamed from: a, reason: collision with root package name */
    public static final C1037dG f10590a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0928bG f10591b;

    /* renamed from: c, reason: collision with root package name */
    public static final JF f10592c;

    /* renamed from: d, reason: collision with root package name */
    public static final HF f10593d;

    static {
        C1313iK c1313iKA = AbstractC2062wG.a("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        f10590a = new C1037dG(PE.class, ME.f9844f);
        f10591b = new C0928bG(c1313iKA, ME.f9841c);
        f10592c = new JF(OE.class, ME.f9842d);
        f10593d = new HF(c1313iKA, ME.f9843e);
    }

    public static EnumC1956uI a(AE ae) throws GeneralSecurityException {
        if (AE.f6959f.equals(ae)) {
            return EnumC1956uI.TINK;
        }
        if (AE.f6960g.equals(ae)) {
            return EnumC1956uI.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(ae.f6968b));
    }

    public static AE b(EnumC1956uI enumC1956uI) throws GeneralSecurityException {
        int iOrdinal = enumC1956uI.ordinal();
        if (iOrdinal == 1) {
            return AE.f6959f;
        }
        if (iOrdinal == 3) {
            return AE.f6960g;
        }
        int iA = enumC1956uI.a();
        throw new GeneralSecurityException(A.f.i(iA, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iA).length() + 34)));
    }
}

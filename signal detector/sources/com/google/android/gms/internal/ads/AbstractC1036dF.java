package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.dF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1036dF {

    /* renamed from: a, reason: collision with root package name */
    public static final C1037dG f13744a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0928bG f13745b;

    /* renamed from: c, reason: collision with root package name */
    public static final JF f13746c;

    /* renamed from: d, reason: collision with root package name */
    public static final HF f13747d;

    static {
        C1313iK c1313iKA = AbstractC2062wG.a("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f13744a = new C1037dG(BE.class, ME.f9829H);
        f13745b = new C0928bG(c1313iKA, ME.f9826E);
        f13746c = new JF(C2114xE.class, ME.f9827F);
        f13747d = new HF(c1313iKA, ME.f9828G);
    }

    public static EnumC1956uI a(AE ae) throws GeneralSecurityException {
        if (AE.f6956c.equals(ae)) {
            return EnumC1956uI.TINK;
        }
        if (AE.f6957d.equals(ae)) {
            return EnumC1956uI.CRUNCHY;
        }
        if (AE.f6958e.equals(ae)) {
            return EnumC1956uI.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(ae)));
    }

    public static AE b(EnumC1956uI enumC1956uI) throws GeneralSecurityException {
        int iOrdinal = enumC1956uI.ordinal();
        if (iOrdinal == 1) {
            return AE.f6956c;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return AE.f6958e;
            }
            if (iOrdinal != 4) {
                int iA = enumC1956uI.a();
                throw new GeneralSecurityException(A.f.i(iA, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iA).length() + 34)));
            }
        }
        return AE.f6957d;
    }
}

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.tF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1899tF {

    /* renamed from: a, reason: collision with root package name */
    public static final C1037dG f16886a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0928bG f16887b;

    /* renamed from: c, reason: collision with root package name */
    public static final JF f16888c;

    /* renamed from: d, reason: collision with root package name */
    public static final HF f16889d;

    static {
        C1313iK c1313iKA = AbstractC2062wG.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f16886a = new C1037dG(C0927bF.class, C1414kF.f15099j);
        f16887b = new C0928bG(c1313iKA, C1414kF.f15097g);
        f16888c = new JF(ZE.class, C1414kF.f15098h);
        f16889d = new HF(c1313iKA, C1414kF.i);
    }

    public static EnumC1956uI a(AE ae) throws GeneralSecurityException {
        if (AE.f6961h.equals(ae)) {
            return EnumC1956uI.TINK;
        }
        if (AE.i.equals(ae)) {
            return EnumC1956uI.CRUNCHY;
        }
        if (AE.f6962j.equals(ae)) {
            return EnumC1956uI.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(ae.f6968b));
    }

    public static AE b(EnumC1956uI enumC1956uI) throws GeneralSecurityException {
        int iOrdinal = enumC1956uI.ordinal();
        if (iOrdinal == 1) {
            return AE.f6961h;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return AE.f6962j;
            }
            if (iOrdinal != 4) {
                int iA = enumC1956uI.a();
                throw new GeneralSecurityException(A.f.i(iA, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iA).length() + 34)));
            }
        }
        return AE.i;
    }
}

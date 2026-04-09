package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.rF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1791rF {

    /* renamed from: a, reason: collision with root package name */
    public static final C1037dG f16502a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0928bG f16503b;

    /* renamed from: c, reason: collision with root package name */
    public static final JF f16504c;

    /* renamed from: d, reason: collision with root package name */
    public static final HF f16505d;

    static {
        C1313iK c1313iKA = AbstractC2062wG.a("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        f16502a = new C1037dG(YE.class, C1414kF.f15096f);
        f16503b = new C0928bG(c1313iKA, C1414kF.f15093c);
        f16504c = new JF(WE.class, C1414kF.f15094d);
        f16505d = new HF(c1313iKA, C1414kF.f15095e);
    }

    public static EnumC1956uI a(C2006vE c2006vE) throws GeneralSecurityException {
        if (c2006vE.equals(C2006vE.i)) {
            return EnumC1956uI.TINK;
        }
        if (c2006vE.equals(C2006vE.f17243j)) {
            return EnumC1956uI.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(c2006vE.f17247b));
    }

    public static C2006vE b(EnumC1956uI enumC1956uI) throws GeneralSecurityException {
        int iOrdinal = enumC1956uI.ordinal();
        if (iOrdinal == 1) {
            return C2006vE.i;
        }
        if (iOrdinal == 3) {
            return C2006vE.f17243j;
        }
        int iA = enumC1956uI.a();
        throw new GeneralSecurityException(A.f.i(iA, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iA).length() + 34)));
    }
}

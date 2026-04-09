package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class PG {

    /* renamed from: a, reason: collision with root package name */
    public static final C1037dG f10335a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0928bG f10336b;

    /* renamed from: c, reason: collision with root package name */
    public static final JF f10337c;

    /* renamed from: d, reason: collision with root package name */
    public static final HF f10338d;

    static {
        C1313iK c1313iKA = AbstractC2062wG.a("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f10335a = new C1037dG(C2224zG.class, C1414kF.f15083I);
        f10336b = new C0928bG(c1313iKA, C1414kF.f15080F);
        f10337c = new JF(C2116xG.class, C1414kF.f15081G);
        f10338d = new HF(c1313iKA, C1414kF.f15082H);
    }

    public static EnumC1956uI a(YD yd) throws GeneralSecurityException {
        if (YD.f12602C.equals(yd)) {
            return EnumC1956uI.TINK;
        }
        if (YD.f12603D.equals(yd)) {
            return EnumC1956uI.CRUNCHY;
        }
        if (YD.f12605F.equals(yd)) {
            return EnumC1956uI.RAW;
        }
        if (YD.f12604E.equals(yd)) {
            return EnumC1956uI.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(yd)));
    }

    public static YD b(EnumC1956uI enumC1956uI) throws GeneralSecurityException {
        int iOrdinal = enumC1956uI.ordinal();
        if (iOrdinal == 1) {
            return YD.f12602C;
        }
        if (iOrdinal == 2) {
            return YD.f12604E;
        }
        if (iOrdinal == 3) {
            return YD.f12605F;
        }
        if (iOrdinal == 4) {
            return YD.f12603D;
        }
        int iA = enumC1956uI.a();
        throw new GeneralSecurityException(A.f.i(iA, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iA).length() + 34)));
    }
}

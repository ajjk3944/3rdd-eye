package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.fF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1145fF {

    /* renamed from: a, reason: collision with root package name */
    public static final C1037dG f14045a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0928bG f14046b;

    /* renamed from: c, reason: collision with root package name */
    public static final JF f14047c;

    /* renamed from: d, reason: collision with root package name */
    public static final HF f14048d;

    static {
        C1313iK c1313iKA = AbstractC2062wG.a("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f14045a = new C1037dG(EE.class, ME.f9833L);
        f14046b = new C0928bG(c1313iKA, ME.f9830I);
        f14047c = new JF(CE.class, ME.f9831J);
        f14048d = new HF(c1313iKA, ME.f9832K);
    }

    public static EnumC1956uI a(YD yd) throws GeneralSecurityException {
        if (YD.f12609f.equals(yd)) {
            return EnumC1956uI.TINK;
        }
        if (YD.f12610g.equals(yd)) {
            return EnumC1956uI.CRUNCHY;
        }
        if (YD.f12611h.equals(yd)) {
            return EnumC1956uI.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(yd)));
    }

    public static YD b(EnumC1956uI enumC1956uI) throws GeneralSecurityException {
        int iOrdinal = enumC1956uI.ordinal();
        if (iOrdinal == 1) {
            return YD.f12609f;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return YD.f12611h;
            }
            if (iOrdinal != 4) {
                int iA = enumC1956uI.a();
                throw new GeneralSecurityException(A.f.i(iA, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iA).length() + 34)));
            }
        }
        return YD.f12610g;
    }
}

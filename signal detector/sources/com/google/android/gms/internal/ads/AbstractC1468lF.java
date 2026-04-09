package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.lF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1468lF {

    /* renamed from: a, reason: collision with root package name */
    public static final C1037dG f15372a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0928bG f15373b;

    /* renamed from: c, reason: collision with root package name */
    public static final JF f15374c;

    /* renamed from: d, reason: collision with root package name */
    public static final HF f15375d;

    static {
        C1313iK c1313iKA = AbstractC2062wG.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f15372a = new C1037dG(KE.class, C1414kF.f15092b);
        f15373b = new C0928bG(c1313iKA, ME.f9837Q);
        f15374c = new JF(IE.class, ME.f9838R);
        f15375d = new HF(c1313iKA, ME.f9839S);
    }

    public static EnumC1956uI a(C2006vE c2006vE) throws GeneralSecurityException {
        if (C2006vE.f17240f.equals(c2006vE)) {
            return EnumC1956uI.TINK;
        }
        if (C2006vE.f17241g.equals(c2006vE)) {
            return EnumC1956uI.CRUNCHY;
        }
        if (C2006vE.f17242h.equals(c2006vE)) {
            return EnumC1956uI.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(c2006vE.f17247b));
    }

    public static C2006vE b(EnumC1956uI enumC1956uI) throws GeneralSecurityException {
        int iOrdinal = enumC1956uI.ordinal();
        if (iOrdinal == 1) {
            return C2006vE.f17240f;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return C2006vE.f17242h;
            }
            if (iOrdinal != 4) {
                int iA = enumC1956uI.a();
                throw new GeneralSecurityException(A.f.i(iA, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iA).length() + 34)));
            }
        }
        return C2006vE.f17241g;
    }
}

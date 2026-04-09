package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class ZE extends AbstractC1467lE {

    /* renamed from: c, reason: collision with root package name */
    public final C0927bF f12806c;

    /* renamed from: d, reason: collision with root package name */
    public final C1448kw f12807d;

    /* renamed from: e, reason: collision with root package name */
    public final C1313iK f12808e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f12809f;

    public ZE(C0927bF c0927bF, C1448kw c1448kw, C1313iK c1313iK, Integer num) {
        super(12);
        this.f12806c = c0927bF;
        this.f12807d = c1448kw;
        this.f12808e = c1313iK;
        this.f12809f = num;
    }

    public static ZE X(AE ae, C1448kw c1448kw, Integer num) throws GeneralSecurityException {
        C1313iK c1313iKB;
        String str = ae.f6968b;
        C1313iK c1313iK = (C1313iK) c1448kw.f15314b;
        AE ae2 = AE.f6962j;
        if (ae != ae2 && num == null) {
            throw new GeneralSecurityException(AbstractC1135f5.n(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (ae == ae2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (c1313iK.f14720a.length != 32) {
            int length = c1313iK.f14720a.length;
            throw new GeneralSecurityException(A.f.i(length, "XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 75)));
        }
        C0927bF c0927bF = new C0927bF(ae);
        if (ae == ae2) {
            c1313iKB = AbstractC0873aG.f13089a;
        } else if (ae == AE.i) {
            c1313iKB = AbstractC0873aG.a(num.intValue());
        } else {
            if (ae != AE.f6961h) {
                throw new IllegalStateException("Unknown Variant: ".concat(str));
            }
            c1313iKB = AbstractC0873aG.b(num.intValue());
        }
        return new ZE(c0927bF, c1448kw, c1313iKB, num);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1467lE
    public final C1313iK W() {
        return this.f12808e;
    }

    @Override // com.google.android.gms.internal.ads.Cr
    public final /* synthetic */ AbstractC1089eE g() {
        return this.f12806c;
    }

    @Override // com.google.android.gms.internal.ads.Cr
    public final Integer q() {
        return this.f12809f;
    }
}

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class IE extends AbstractC1467lE {

    /* renamed from: c, reason: collision with root package name */
    public final KE f9082c;

    /* renamed from: d, reason: collision with root package name */
    public final C1448kw f9083d;

    /* renamed from: e, reason: collision with root package name */
    public final C1313iK f9084e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f9085f;

    public IE(KE ke, C1448kw c1448kw, C1313iK c1313iK, Integer num) {
        super(12);
        this.f9082c = ke;
        this.f9083d = c1448kw;
        this.f9084e = c1313iK;
        this.f9085f = num;
    }

    public static IE X(C2006vE c2006vE, C1448kw c1448kw, Integer num) throws GeneralSecurityException {
        C1313iK c1313iKB;
        String str = c2006vE.f17247b;
        C1313iK c1313iK = (C1313iK) c1448kw.f15314b;
        C2006vE c2006vE2 = C2006vE.f17242h;
        if (c2006vE != c2006vE2 && num == null) {
            throw new GeneralSecurityException(AbstractC1135f5.n(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (c2006vE == c2006vE2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (c1313iK.f14720a.length != 32) {
            int length = c1313iK.f14720a.length;
            throw new GeneralSecurityException(A.f.i(length, "ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 74)));
        }
        KE ke = new KE(c2006vE);
        if (c2006vE == c2006vE2) {
            c1313iKB = AbstractC0873aG.f13089a;
        } else if (c2006vE == C2006vE.f17241g) {
            c1313iKB = AbstractC0873aG.a(num.intValue());
        } else {
            if (c2006vE != C2006vE.f17240f) {
                throw new IllegalStateException("Unknown Variant: ".concat(str));
            }
            c1313iKB = AbstractC0873aG.b(num.intValue());
        }
        return new IE(ke, c1448kw, c1313iKB, num);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1467lE
    public final C1313iK W() {
        return this.f9084e;
    }

    @Override // com.google.android.gms.internal.ads.Cr
    public final /* synthetic */ AbstractC1089eE g() {
        return this.f9082c;
    }

    @Override // com.google.android.gms.internal.ads.Cr
    public final Integer q() {
        return this.f9085f;
    }
}

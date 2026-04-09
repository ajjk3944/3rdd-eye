package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class WE extends AbstractC1467lE {

    /* renamed from: c, reason: collision with root package name */
    public final YE f12189c;

    /* renamed from: d, reason: collision with root package name */
    public final C1448kw f12190d;

    /* renamed from: e, reason: collision with root package name */
    public final C1313iK f12191e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f12192f;

    public WE(YE ye, C1448kw c1448kw, C1313iK c1313iK, Integer num) {
        super(12);
        this.f12189c = ye;
        this.f12190d = c1448kw;
        this.f12191e = c1313iK;
        this.f12192f = num;
    }

    public static WE X(YE ye, C1448kw c1448kw, Integer num) throws GeneralSecurityException {
        C1313iK c1313iKB;
        C1313iK c1313iK = (C1313iK) c1448kw.f15314b;
        C2006vE c2006vE = ye.f12619a;
        String str = c2006vE.f17247b;
        C2006vE c2006vE2 = C2006vE.f17243j;
        if (c2006vE != c2006vE2 && num == null) {
            throw new GeneralSecurityException(AbstractC1135f5.n(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (c2006vE == c2006vE2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (c1313iK.f14720a.length != 32) {
            int length = c1313iK.f14720a.length;
            throw new GeneralSecurityException(A.f.i(length, "XAesGcmKey key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 68)));
        }
        if (c2006vE == c2006vE2) {
            c1313iKB = AbstractC0873aG.f13089a;
        } else {
            if (c2006vE != C2006vE.i) {
                throw new IllegalStateException("Unknown Variant: ".concat(str));
            }
            c1313iKB = AbstractC0873aG.b(num.intValue());
        }
        return new WE(ye, c1448kw, c1313iKB, num);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1467lE
    public final C1313iK W() {
        return this.f12191e;
    }

    @Override // com.google.android.gms.internal.ads.Cr
    public final /* synthetic */ AbstractC1089eE g() {
        return this.f12189c;
    }

    @Override // com.google.android.gms.internal.ads.Cr
    public final Integer q() {
        return this.f12192f;
    }
}

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class RE extends AbstractC1467lE {

    /* renamed from: c, reason: collision with root package name */
    public final SE f10873c;

    /* renamed from: d, reason: collision with root package name */
    public final C1313iK f10874d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f10875e;

    public RE(SE se, C1313iK c1313iK, Integer num) {
        super(12);
        this.f10873c = se;
        this.f10874d = c1313iK;
        this.f10875e = num;
    }

    public static RE X(SE se, Integer num) throws GeneralSecurityException {
        C1313iK c1313iKB;
        C1952uE c1952uE = se.f11158a;
        if (c1952uE == C1952uE.f17089l) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            c1313iKB = AbstractC0873aG.f13089a;
        } else {
            if (c1952uE != C1952uE.f17088k) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(c1952uE)));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            c1313iKB = AbstractC0873aG.b(num.intValue());
        }
        return new RE(se, c1313iKB, num);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1467lE
    public final C1313iK W() {
        return this.f10874d;
    }

    @Override // com.google.android.gms.internal.ads.Cr
    public final /* synthetic */ AbstractC1089eE g() {
        return this.f10873c;
    }

    @Override // com.google.android.gms.internal.ads.Cr
    public final Integer q() {
        return this.f10875e;
    }
}

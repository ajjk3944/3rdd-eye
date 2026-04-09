package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class OE extends AbstractC1467lE {

    /* renamed from: c, reason: collision with root package name */
    public final PE f10171c;

    /* renamed from: d, reason: collision with root package name */
    public final C1313iK f10172d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f10173e;

    public OE(PE pe, C1313iK c1313iK, Integer num) {
        super(12);
        this.f10171c = pe;
        this.f10172d = c1313iK;
        this.f10173e = num;
    }

    public static OE X(PE pe, Integer num) throws GeneralSecurityException {
        C1313iK c1313iKA;
        AE ae = pe.f10333b;
        if (ae == AE.f6959f) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            c1313iKA = C1313iK.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (ae != AE.f6960g) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(ae.f6968b));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            c1313iKA = C1313iK.a(new byte[0]);
        }
        return new OE(pe, c1313iKA, num);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1467lE
    public final C1313iK W() {
        return this.f10172d;
    }

    @Override // com.google.android.gms.internal.ads.Cr
    public final /* synthetic */ AbstractC1089eE g() {
        return this.f10171c;
    }

    @Override // com.google.android.gms.internal.ads.Cr
    public final Integer q() {
        return this.f10173e;
    }
}

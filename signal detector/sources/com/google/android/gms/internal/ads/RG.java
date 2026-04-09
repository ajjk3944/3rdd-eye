package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class RG extends Cr {

    /* renamed from: c, reason: collision with root package name */
    public final SG f10878c;

    /* renamed from: d, reason: collision with root package name */
    public final C1448kw f10879d;

    public RG(SG sg, C1448kw c1448kw) {
        super(12);
        this.f10878c = sg;
        this.f10879d = c1448kw;
    }

    public static RG W(SG sg, C1448kw c1448kw) throws GeneralSecurityException {
        if (sg.f11164a == ((C1313iK) c1448kw.f15314b).f14720a.length) {
            return new RG(sg, c1448kw);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }

    @Override // com.google.android.gms.internal.ads.Cr
    public final /* synthetic */ AbstractC1089eE g() {
        return this.f10878c;
    }

    @Override // com.google.android.gms.internal.ads.Cr
    public final Integer q() {
        return null;
    }
}

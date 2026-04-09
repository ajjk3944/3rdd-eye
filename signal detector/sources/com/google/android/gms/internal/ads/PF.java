package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class PF extends Cr {

    /* renamed from: c, reason: collision with root package name */
    public final C1631oG f10334c;

    public PF(C1631oG c1631oG) {
        super(12);
        int i = NF.f9982b[AbstractC2984e.c(c1631oG.f15925d)];
        this.f10334c = c1631oG;
    }

    public final C1313iK W() throws GeneralSecurityException {
        C1631oG c1631oG = this.f10334c;
        EnumC1956uI enumC1956uI = c1631oG.f15926e;
        Integer num = c1631oG.f15927f;
        EnumC1956uI enumC1956uI2 = c1631oG.f15926e;
        if (enumC1956uI.equals(EnumC1956uI.RAW)) {
            return C1313iK.a(new byte[0]);
        }
        if (enumC1956uI2.equals(EnumC1956uI.TINK)) {
            return AbstractC0873aG.b(num.intValue());
        }
        if (enumC1956uI2.equals(EnumC1956uI.LEGACY) || enumC1956uI2.equals(EnumC1956uI.CRUNCHY)) {
            return AbstractC0873aG.a(num.intValue());
        }
        throw new GeneralSecurityException("Unknown output prefix type");
    }

    @Override // com.google.android.gms.internal.ads.Cr
    public final AbstractC1089eE g() {
        C1631oG c1631oG = this.f10334c;
        return new OF(c1631oG.f15922a, c1631oG.f15926e);
    }

    @Override // com.google.android.gms.internal.ads.Cr
    public final Integer q() {
        return this.f10334c.f15927f;
    }
}

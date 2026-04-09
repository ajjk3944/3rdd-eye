package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class cd1 extends al0 {

    /* renamed from: c, reason: collision with root package name */
    public final be1 f10087c;

    public cd1(be1 be1Var) {
        super(12);
        int i4 = ad1.f9308b[i3.e.c(be1Var.f9657a)];
        this.f10087c = be1Var;
    }

    public final vl1 Z() throws GeneralSecurityException {
        be1 be1Var = this.f10087c;
        ii1 ii1Var = (ii1) be1Var.f9661e;
        Integer num = (Integer) be1Var.f9662f;
        ii1 ii1Var2 = (ii1) be1Var.f9661e;
        if (ii1Var.equals(ii1.RAW)) {
            return vl1.a(new byte[0]);
        }
        if (ii1Var2.equals(ii1.TINK)) {
            return nd1.b(num.intValue());
        }
        if (ii1Var2.equals(ii1.LEGACY) || ii1Var2.equals(ii1.CRUNCHY)) {
            return nd1.a(num.intValue());
        }
        throw new GeneralSecurityException("Unknown output prefix type");
    }

    @Override // com.google.android.gms.internal.ads.al0
    public final s91 k() {
        be1 be1Var = this.f10087c;
        return new bd1((String) be1Var.f9658b, (ii1) be1Var.f9661e);
    }

    @Override // com.google.android.gms.internal.ads.al0
    public final Integer u() {
        return (Integer) this.f10087c.f9662f;
    }
}

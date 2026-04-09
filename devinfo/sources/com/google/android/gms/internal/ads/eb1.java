package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class eb1 extends z91 {

    /* renamed from: c, reason: collision with root package name */
    public final fb1 f10754c;

    /* renamed from: d, reason: collision with root package name */
    public final vl1 f10755d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f10756e;

    public eb1(fb1 fb1Var, vl1 vl1Var, Integer num) {
        super(12);
        this.f10754c = fb1Var;
        this.f10755d = vl1Var;
        this.f10756e = num;
    }

    public static eb1 a0(fb1 fb1Var, Integer num) throws GeneralSecurityException {
        vl1 vl1VarB;
        m91 m91Var = fb1Var.f11089a;
        if (m91Var == m91.f13815m) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            vl1VarB = nd1.f14254a;
        } else {
            if (m91Var != m91.f13814l) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(m91Var)));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            vl1VarB = nd1.b(num.intValue());
        }
        return new eb1(fb1Var, vl1VarB, num);
    }

    @Override // com.google.android.gms.internal.ads.z91
    public final vl1 Z() {
        return this.f10755d;
    }

    @Override // com.google.android.gms.internal.ads.al0
    public final /* synthetic */ s91 k() {
        return this.f10754c;
    }

    @Override // com.google.android.gms.internal.ads.al0
    public final Integer u() {
        return this.f10756e;
    }
}

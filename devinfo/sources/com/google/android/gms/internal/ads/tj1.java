package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class tj1 extends qk1 {

    /* renamed from: c, reason: collision with root package name */
    public final qj1 f16830c;

    /* renamed from: d, reason: collision with root package name */
    public final vl1 f16831d;

    /* renamed from: e, reason: collision with root package name */
    public final vl1 f16832e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f16833f;

    public tj1(qj1 qj1Var, vl1 vl1Var, vl1 vl1Var2, Integer num) {
        super(12);
        this.f16830c = qj1Var;
        this.f16831d = vl1Var;
        this.f16832e = vl1Var2;
        this.f16833f = num;
    }

    public static tj1 a0(pj1 pj1Var, vl1 vl1Var, Integer num) throws GeneralSecurityException {
        vl1 vl1VarA;
        String str = pj1Var.f15023a;
        byte[] bArr = vl1Var.f17649a;
        qj1 qj1Var = new qj1(pj1Var);
        pj1 pj1Var2 = pj1.f15022e;
        if (!pj1Var.equals(pj1Var2) && num == null) {
            throw new GeneralSecurityException(r5.c.m(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (pj1Var.equals(pj1Var2) && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (bArr.length != 32) {
            int length = bArr.length;
            throw new GeneralSecurityException(d.h.q(length, "Ed25519 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 65)));
        }
        if (pj1Var == pj1Var2) {
            vl1VarA = nd1.f14254a;
        } else if (pj1Var == pj1.f15020c || pj1Var == pj1.f15021d) {
            vl1VarA = nd1.a(num.intValue());
        } else {
            if (pj1Var != pj1.f15019b) {
                throw new IllegalStateException("Unknown Variant: ".concat(str));
            }
            vl1VarA = nd1.b(num.intValue());
        }
        return new tj1(qj1Var, vl1Var, vl1VarA, num);
    }

    @Override // com.google.android.gms.internal.ads.qk1
    public final vl1 Z() {
        return this.f16832e;
    }

    @Override // com.google.android.gms.internal.ads.al0
    public final /* synthetic */ s91 k() {
        return this.f16830c;
    }

    @Override // com.google.android.gms.internal.ads.al0
    public final Integer u() {
        return this.f16833f;
    }
}

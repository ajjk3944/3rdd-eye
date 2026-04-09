package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class wa1 extends z91 {

    /* renamed from: c, reason: collision with root package name */
    public final ya1 f17953c;

    /* renamed from: d, reason: collision with root package name */
    public final kh0 f17954d;

    /* renamed from: e, reason: collision with root package name */
    public final vl1 f17955e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f17956f;

    public wa1(ya1 ya1Var, kh0 kh0Var, vl1 vl1Var, Integer num) {
        super(12);
        this.f17953c = ya1Var;
        this.f17954d = kh0Var;
        this.f17955e = vl1Var;
        this.f17956f = num;
    }

    public static wa1 a0(m91 m91Var, kh0 kh0Var, Integer num) throws GeneralSecurityException {
        vl1 vl1VarB;
        String str = m91Var.f13825b;
        vl1 vl1Var = (vl1) kh0Var.f13160b;
        m91 m91Var2 = m91.f13813k;
        if (m91Var != m91Var2 && num == null) {
            throw new GeneralSecurityException(r5.c.m(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (m91Var == m91Var2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (vl1Var.f17649a.length != 32) {
            int length = vl1Var.f17649a.length;
            throw new GeneralSecurityException(d.h.q(length, "ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 74)));
        }
        ya1 ya1Var = new ya1(m91Var);
        if (m91Var == m91Var2) {
            vl1VarB = nd1.f14254a;
        } else if (m91Var == m91.j) {
            vl1VarB = nd1.a(num.intValue());
        } else {
            if (m91Var != m91.f13812i) {
                throw new IllegalStateException("Unknown Variant: ".concat(str));
            }
            vl1VarB = nd1.b(num.intValue());
        }
        return new wa1(ya1Var, kh0Var, vl1VarB, num);
    }

    @Override // com.google.android.gms.internal.ads.z91
    public final vl1 Z() {
        return this.f17955e;
    }

    @Override // com.google.android.gms.internal.ads.al0
    public final /* synthetic */ s91 k() {
        return this.f17953c;
    }

    @Override // com.google.android.gms.internal.ads.al0
    public final Integer u() {
        return this.f17956f;
    }
}

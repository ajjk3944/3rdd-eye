package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class mb1 extends z91 {

    /* renamed from: c, reason: collision with root package name */
    public final ob1 f13859c;

    /* renamed from: d, reason: collision with root package name */
    public final kh0 f13860d;

    /* renamed from: e, reason: collision with root package name */
    public final vl1 f13861e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f13862f;

    public mb1(ob1 ob1Var, kh0 kh0Var, vl1 vl1Var, Integer num) {
        super(12);
        this.f13859c = ob1Var;
        this.f13860d = kh0Var;
        this.f13861e = vl1Var;
        this.f13862f = num;
    }

    public static mb1 a0(ka1 ka1Var, kh0 kh0Var, Integer num) throws GeneralSecurityException {
        vl1 vl1VarB;
        String str = ka1Var.f13113b;
        vl1 vl1Var = (vl1) kh0Var.f13160b;
        ka1 ka1Var2 = ka1.f13109q;
        if (ka1Var != ka1Var2 && num == null) {
            throw new GeneralSecurityException(r5.c.m(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (ka1Var == ka1Var2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (vl1Var.f17649a.length != 32) {
            int length = vl1Var.f17649a.length;
            throw new GeneralSecurityException(d.h.q(length, "XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 75)));
        }
        ob1 ob1Var = new ob1(ka1Var);
        if (ka1Var == ka1Var2) {
            vl1VarB = nd1.f14254a;
        } else if (ka1Var == ka1.f13108p) {
            vl1VarB = nd1.a(num.intValue());
        } else {
            if (ka1Var != ka1.f13107o) {
                throw new IllegalStateException("Unknown Variant: ".concat(str));
            }
            vl1VarB = nd1.b(num.intValue());
        }
        return new mb1(ob1Var, kh0Var, vl1VarB, num);
    }

    @Override // com.google.android.gms.internal.ads.z91
    public final vl1 Z() {
        return this.f13861e;
    }

    @Override // com.google.android.gms.internal.ads.al0
    public final /* synthetic */ s91 k() {
        return this.f13859c;
    }

    @Override // com.google.android.gms.internal.ads.al0
    public final Integer u() {
        return this.f13862f;
    }
}

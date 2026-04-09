package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class jb1 extends z91 {

    /* renamed from: c, reason: collision with root package name */
    public final lb1 f12709c;

    /* renamed from: d, reason: collision with root package name */
    public final kh0 f12710d;

    /* renamed from: e, reason: collision with root package name */
    public final vl1 f12711e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f12712f;

    public jb1(lb1 lb1Var, kh0 kh0Var, vl1 vl1Var, Integer num) {
        super(12);
        this.f12709c = lb1Var;
        this.f12710d = kh0Var;
        this.f12711e = vl1Var;
        this.f12712f = num;
    }

    public static jb1 a0(lb1 lb1Var, kh0 kh0Var, Integer num) throws GeneralSecurityException {
        vl1 vl1VarB;
        vl1 vl1Var = (vl1) kh0Var.f13160b;
        ja1 ja1Var = lb1Var.f13450a;
        String str = ja1Var.f12707b;
        ja1 ja1Var2 = ja1.f12702n;
        if (ja1Var != ja1Var2 && num == null) {
            throw new GeneralSecurityException(r5.c.m(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (ja1Var == ja1Var2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (vl1Var.f17649a.length != 32) {
            int length = vl1Var.f17649a.length;
            throw new GeneralSecurityException(d.h.q(length, "XAesGcmKey key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 68)));
        }
        if (ja1Var == ja1Var2) {
            vl1VarB = nd1.f14254a;
        } else {
            if (ja1Var != ja1.f12701m) {
                throw new IllegalStateException("Unknown Variant: ".concat(str));
            }
            vl1VarB = nd1.b(num.intValue());
        }
        return new jb1(lb1Var, kh0Var, vl1VarB, num);
    }

    @Override // com.google.android.gms.internal.ads.z91
    public final vl1 Z() {
        return this.f12711e;
    }

    @Override // com.google.android.gms.internal.ads.al0
    public final /* synthetic */ s91 k() {
        return this.f12709c;
    }

    @Override // com.google.android.gms.internal.ads.al0
    public final Integer u() {
        return this.f12712f;
    }
}

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ff1 extends al0 {

    /* renamed from: c, reason: collision with root package name */
    public final gf1 f11151c;

    /* renamed from: d, reason: collision with root package name */
    public final kh0 f11152d;

    public ff1(gf1 gf1Var, kh0 kh0Var) {
        super(12);
        this.f11151c = gf1Var;
        this.f11152d = kh0Var;
    }

    public static ff1 Z(gf1 gf1Var, kh0 kh0Var) throws GeneralSecurityException {
        if (gf1Var.f11513a == ((vl1) kh0Var.f13160b).f17649a.length) {
            return new ff1(gf1Var, kh0Var);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }

    @Override // com.google.android.gms.internal.ads.al0
    public final /* synthetic */ s91 k() {
        return this.f11151c;
    }

    @Override // com.google.android.gms.internal.ads.al0
    public final Integer u() {
        return null;
    }
}

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class rj1 extends pk1 {

    /* renamed from: c, reason: collision with root package name */
    public final tj1 f15667c;

    /* renamed from: d, reason: collision with root package name */
    public final kh0 f15668d;

    public rj1(tj1 tj1Var, kh0 kh0Var) {
        super(12);
        this.f15667c = tj1Var;
        this.f15668d = kh0Var;
    }

    public static rj1 a0(tj1 tj1Var, kh0 kh0Var) throws GeneralSecurityException {
        vl1 vl1Var = (vl1) kh0Var.f13160b;
        if (vl1Var.f17649a.length != 32) {
            int length = vl1Var.f17649a.length;
            throw new GeneralSecurityException(d.h.q(length, "Ed25519 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 65)));
        }
        if (Arrays.equals(tj1Var.f16831d.b(), nn1.g(nn1.m(vl1Var.b())))) {
            return new rj1(tj1Var, kh0Var);
        }
        throw new GeneralSecurityException("Ed25519 keys mismatch");
    }

    @Override // com.google.android.gms.internal.ads.pk1
    public final /* synthetic */ qk1 Z() {
        return this.f15667c;
    }

    @Override // com.google.android.gms.internal.ads.al0
    public final s91 k() {
        return this.f15667c.f16830c;
    }
}

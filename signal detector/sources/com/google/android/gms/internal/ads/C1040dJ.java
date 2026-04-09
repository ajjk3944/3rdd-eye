package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.dJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1040dJ extends CJ {

    /* renamed from: c, reason: collision with root package name */
    public final C1149fJ f13750c;

    /* renamed from: d, reason: collision with root package name */
    public final C1448kw f13751d;

    public C1040dJ(C1149fJ c1149fJ, C1448kw c1448kw) {
        super(12);
        this.f13750c = c1149fJ;
        this.f13751d = c1448kw;
    }

    public static C1040dJ X(C1149fJ c1149fJ, C1448kw c1448kw) throws GeneralSecurityException {
        C1313iK c1313iK = (C1313iK) c1448kw.f15314b;
        if (c1313iK.f14720a.length != 32) {
            int length = c1313iK.f14720a.length;
            throw new GeneralSecurityException(A.f.i(length, "Ed25519 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 65)));
        }
        if (Arrays.equals(c1149fJ.f14052d.b(), AbstractC0933bL.j(AbstractC0933bL.p(c1313iK.b())))) {
            return new C1040dJ(c1149fJ, c1448kw);
        }
        throw new GeneralSecurityException("Ed25519 keys mismatch");
    }

    @Override // com.google.android.gms.internal.ads.CJ
    public final /* synthetic */ DJ W() {
        return this.f13750c;
    }

    @Override // com.google.android.gms.internal.ads.Cr
    public final AbstractC1089eE g() {
        return this.f13750c.f14051c;
    }
}

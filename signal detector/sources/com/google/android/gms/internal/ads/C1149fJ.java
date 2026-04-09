package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.fJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1149fJ extends DJ {

    /* renamed from: c, reason: collision with root package name */
    public final C0985cJ f14051c;

    /* renamed from: d, reason: collision with root package name */
    public final C1313iK f14052d;

    /* renamed from: e, reason: collision with root package name */
    public final C1313iK f14053e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f14054f;

    public C1149fJ(C0985cJ c0985cJ, C1313iK c1313iK, C1313iK c1313iK2, Integer num) {
        super(12);
        this.f14051c = c0985cJ;
        this.f14052d = c1313iK;
        this.f14053e = c1313iK2;
        this.f14054f = num;
    }

    public static C1149fJ X(C0931bJ c0931bJ, C1313iK c1313iK, Integer num) throws GeneralSecurityException {
        C1313iK c1313iKA;
        String str = c0931bJ.f13343a;
        byte[] bArr = c1313iK.f14720a;
        C0985cJ c0985cJ = new C0985cJ(c0931bJ);
        C0931bJ c0931bJ2 = C0931bJ.f13342e;
        if (!c0931bJ.equals(c0931bJ2) && num == null) {
            throw new GeneralSecurityException(AbstractC1135f5.n(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (c0931bJ.equals(c0931bJ2) && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (bArr.length != 32) {
            int length = bArr.length;
            throw new GeneralSecurityException(A.f.i(length, "Ed25519 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 65)));
        }
        if (c0931bJ == c0931bJ2) {
            c1313iKA = AbstractC0873aG.f13089a;
        } else if (c0931bJ == C0931bJ.f13340c || c0931bJ == C0931bJ.f13341d) {
            c1313iKA = AbstractC0873aG.a(num.intValue());
        } else {
            if (c0931bJ != C0931bJ.f13339b) {
                throw new IllegalStateException("Unknown Variant: ".concat(str));
            }
            c1313iKA = AbstractC0873aG.b(num.intValue());
        }
        return new C1149fJ(c0985cJ, c1313iK, c1313iKA, num);
    }

    @Override // com.google.android.gms.internal.ads.DJ
    public final C1313iK W() {
        return this.f14053e;
    }

    @Override // com.google.android.gms.internal.ads.Cr
    public final /* synthetic */ AbstractC1089eE g() {
        return this.f14051c;
    }

    @Override // com.google.android.gms.internal.ads.Cr
    public final Integer q() {
        return this.f14054f;
    }
}

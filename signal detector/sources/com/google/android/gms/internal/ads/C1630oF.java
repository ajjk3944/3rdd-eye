package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.oF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1630oF extends B3.u {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15921c;

    public C1630oF(byte[] bArr, int i) throws GeneralSecurityException {
        this.f15921c = i;
        if (!Cr.m(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.f662a = y(1, bArr);
        this.f663b = y(0, bArr);
    }

    @Override // B3.u
    public final C1576nF y(int i, byte[] bArr) {
        switch (this.f15921c) {
            case 0:
                return new C1576nF(i, 0, bArr);
            default:
                return new C1576nF(i, 1, bArr);
        }
    }
}

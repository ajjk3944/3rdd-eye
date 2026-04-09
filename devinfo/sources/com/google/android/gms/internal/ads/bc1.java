package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class bc1 extends androidx.recyclerview.widget.d0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9649c;

    public bc1(byte[] bArr, int i4) throws GeneralSecurityException {
        this.f9649c = i4;
        if (!al0.q(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.f1325a = t(1, bArr);
        this.f1326b = t(0, bArr);
    }

    @Override // androidx.recyclerview.widget.d0
    public final androidx.datastore.preferences.protobuf.j t(int i4, byte[] bArr) {
        switch (this.f9649c) {
            case 0:
                return new ac1(bArr, i4, 0);
            default:
                return new ac1(bArr, i4, 1);
        }
    }
}

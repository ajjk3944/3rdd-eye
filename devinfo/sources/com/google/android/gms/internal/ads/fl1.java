package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class fl1 {

    /* renamed from: d, reason: collision with root package name */
    public static final wa f11204d = new wa(5);

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f11205a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11206b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11207c;

    public fl1(byte[] bArr, int i4) throws GeneralSecurityException {
        if (!al0.q(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        al0.m(bArr.length);
        this.f11205a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f11204d.get()).getBlockSize();
        this.f11207c = blockSize;
        if (i4 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f11206b = i4;
    }
}

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class RJ {

    /* renamed from: d, reason: collision with root package name */
    public static final T2.i f10888d = new T2.i(6);

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f10889a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10890b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10891c;

    public RJ(byte[] bArr, int i) throws GeneralSecurityException {
        if (!Cr.m(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        Cr.i(bArr.length);
        this.f10889a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f10888d.get()).getBlockSize();
        this.f10891c = blockSize;
        if (i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f10890b = i;
    }
}

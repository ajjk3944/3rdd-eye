package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* renamed from: com.google.android.gms.internal.ads.uF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1953uF implements VD {

    /* renamed from: a, reason: collision with root package name */
    public static final T2.i f17094a = new T2.i(3);

    public static C1200gF b(FE fe) throws GeneralSecurityException {
        byte[] bArr = C1200gF.f14237d;
        try {
            Cipher cipher = (Cipher) f17094a.get();
            if (cipher == null) {
                throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
            }
            if (C1200gF.b(cipher)) {
                return new C1200gF(((C1313iK) fe.f8072d.f15314b).b(), fe.f8073e.b());
            }
            throw new IllegalStateException("Cipher does not implement AES GCM SIV.");
        } catch (IllegalStateException e6) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e6);
        }
    }
}

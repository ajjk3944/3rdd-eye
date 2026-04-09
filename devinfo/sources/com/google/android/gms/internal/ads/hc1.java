package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class hc1 implements j91 {

    /* renamed from: a, reason: collision with root package name */
    public static final wa f11838a = new wa(2);

    public static tb1 b(ta1 ta1Var) throws GeneralSecurityException {
        byte[] bArr = tb1.f16774d;
        try {
            Cipher cipher = (Cipher) f11838a.get();
            if (cipher == null) {
                throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
            }
            if (tb1.b(cipher)) {
                return new tb1(((vl1) ta1Var.f16767d.f13160b).b(), ta1Var.f16768e.b());
            }
            throw new IllegalStateException("Cipher does not implement AES GCM SIV.");
        } catch (IllegalStateException e2) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e2);
        }
    }
}

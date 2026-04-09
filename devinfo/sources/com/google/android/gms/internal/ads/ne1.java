package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ne1 {
    public static ne1 a(ke1 ke1Var, Provider provider) throws GeneralSecurityException {
        ne1 ne1Var = new ne1();
        if (!al0.q(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        try {
            Mac.getInstance("AESCMAC", provider);
            ke1Var.f13147e.b();
            new SecretKeySpec(((vl1) ke1Var.f13146d.f13160b).b(), "AES");
            return ne1Var;
        } catch (NoSuchAlgorithmException e2) {
            throw new GeneralSecurityException("AES-CMAC not available.", e2);
        }
    }
}

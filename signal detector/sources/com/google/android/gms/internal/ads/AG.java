package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class AG {
    public static AG a(C2116xG c2116xG, Provider provider) throws GeneralSecurityException {
        AG ag = new AG();
        if (!Cr.m(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        try {
            Mac.getInstance("AESCMAC", provider);
            c2116xG.f17567e.b();
            new SecretKeySpec(((C1313iK) c2116xG.f17566d.f15314b).b(), "AES");
            return ag;
        } catch (NoSuchAlgorithmException e6) {
            throw new GeneralSecurityException("AES-CMAC not available.", e6);
        }
    }
}

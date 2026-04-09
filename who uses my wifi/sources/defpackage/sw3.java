package defpackage;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sw3 {
    public static sw3 a(pw3 pw3Var, Provider provider) throws GeneralSecurityException {
        sw3 sw3Var = new sw3();
        if (!yb.x(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        try {
            Mac.getInstance("AESCMAC", provider);
            pw3Var.l.b();
            new SecretKeySpec(((v34) pw3Var.k.f).b(), "AES");
            return sw3Var;
        } catch (NoSuchAlgorithmException e) {
            throw new GeneralSecurityException("AES-CMAC not available.", e);
        }
    }
}

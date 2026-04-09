package defpackage;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.interfaces.RSAPrivateCrtKey;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class a34 implements nr3 {
    public static final byte[] g = new byte[0];
    public static final byte[] h = {0};
    public static final byte[] i = {1, 2, 3};
    public final RSAPrivateCrtKey a;
    public final String b;
    public final byte[] c;
    public final byte[] d;
    public final or3 e;
    public final Provider f;

    public a34(RSAPrivateCrtKey rSAPrivateCrtKey, a24 a24Var, byte[] bArr, byte[] bArr2, or3 or3Var, Provider provider) throws GeneralSecurityException {
        if (!yb.x(2)) {
            throw new GeneralSecurityException("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (a24Var != a24.b && a24Var != a24.c && a24Var != a24.d) {
            throw new GeneralSecurityException("Unsupported hash: ".concat(String.valueOf(a24Var)));
        }
        bd2.M(rSAPrivateCrtKey.getModulus().bitLength());
        bd2.P(rSAPrivateCrtKey.getPublicExponent());
        this.a = rSAPrivateCrtKey;
        this.b = b34.a(a24Var);
        this.c = bArr;
        this.d = bArr2;
        this.e = or3Var;
        this.f = provider;
    }
}

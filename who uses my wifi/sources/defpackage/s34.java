package defpackage;

import android.os.Build;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class s34 implements or3 {
    public static final byte[] a = new byte[0];
    public static final byte[] b = {0};
    public static final tb1 c;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        p34 p34Var = p34.f;
        a24 a24Var = a24.b;
        map.put(p34Var, a24Var);
        map2.put(a24Var, p34Var);
        p34 p34Var2 = p34.g;
        a24 a24Var2 = a24.c;
        map.put(p34Var2, a24Var2);
        map2.put(a24Var2, p34Var2);
        p34 p34Var3 = p34.h;
        a24 a24Var3 = a24.d;
        map.put(p34Var3, a24Var3);
        map2.put(a24Var3, p34Var3);
        c = new tb1(Collections.unmodifiableMap(map), Collections.unmodifiableMap(map2));
    }

    public static or3 a(e24 e24Var) throws NoSuchProviderException {
        try {
            int i = ow3.a;
            if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
                (!Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT)).getClass();
            }
            Provider providerT = ob1.t();
            if (providerT != null) {
                return b34.c(e24Var, providerT);
            }
            throw new NoSuchProviderException("RSA-PKCS1.5 using Conscrypt is not supported.");
        } catch (NoSuchProviderException unused) {
            KeyFactory keyFactory = (KeyFactory) m34.g.a.l("RSA");
            BigInteger bigInteger = e24Var.k;
            c24 c24Var = e24Var.j;
            return new w24((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, c24Var.b)), (p34) c.b(c24Var.d), e24Var.l.b(), c24Var.c.equals(b24.d) ? b : a);
        }
    }
}

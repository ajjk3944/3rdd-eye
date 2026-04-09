package com.google.android.gms.internal.ads;

import android.os.Build;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class rl1 implements u91 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f15699a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f15700b = {0};

    /* renamed from: c, reason: collision with root package name */
    public static final rt f15701c;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ol1 ol1Var = ol1.f14731a;
        ak1 ak1Var = ak1.f9340b;
        map.put(ol1Var, ak1Var);
        map2.put(ak1Var, ol1Var);
        ol1 ol1Var2 = ol1.f14732b;
        ak1 ak1Var2 = ak1.f9341c;
        map.put(ol1Var2, ak1Var2);
        map2.put(ak1Var2, ol1Var2);
        ol1 ol1Var3 = ol1.f14733c;
        ak1 ak1Var3 = ak1.f9342d;
        map.put(ol1Var3, ak1Var3);
        map2.put(ak1Var3, ol1Var3);
        f15701c = new rt(26, DesugarCollections.unmodifiableMap(map), DesugarCollections.unmodifiableMap(map2));
    }

    public static u91 b(fk1 fk1Var) throws NoSuchProviderException {
        try {
            int i4 = je1.f12739a;
            if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
                (!Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT)).getClass();
            }
            Provider providerC = a80.c();
            if (providerC != null) {
                return al1.c(fk1Var, providerC);
            }
            throw new NoSuchProviderException("RSA-PKCS1.5 using Conscrypt is not supported.");
        } catch (NoSuchProviderException unused) {
            KeyFactory keyFactory = (KeyFactory) ml1.g.f13943a.g("RSA");
            BigInteger bigInteger = fk1Var.f11196d;
            ck1 ck1Var = fk1Var.f11195c;
            return new wk1((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, ck1Var.f10151b)), (ol1) f15701c.o(ck1Var.f10153d), fk1Var.f11197e.b(), ck1Var.f10152c.equals(bk1.f9706d) ? f15700b : f15699a);
        }
    }
}

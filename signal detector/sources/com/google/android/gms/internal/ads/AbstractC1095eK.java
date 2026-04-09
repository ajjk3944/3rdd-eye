package com.google.android.gms.internal.ads;

import android.os.Build;
import j$.util.Objects;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.eK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1095eK implements InterfaceC1199gE {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f13889a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f13890b = {0};

    /* renamed from: c, reason: collision with root package name */
    public static final Vu f13891c;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        EnumC0932bK enumC0932bK = EnumC0932bK.f13344a;
        C1580nJ c1580nJ = C1580nJ.f15763b;
        map.put(enumC0932bK, c1580nJ);
        map2.put(c1580nJ, enumC0932bK);
        EnumC0932bK enumC0932bK2 = EnumC0932bK.f13345b;
        C1580nJ c1580nJ2 = C1580nJ.f15764c;
        map.put(enumC0932bK2, c1580nJ2);
        map2.put(c1580nJ2, enumC0932bK2);
        EnumC0932bK enumC0932bK3 = EnumC0932bK.f13346c;
        C1580nJ c1580nJ3 = C1580nJ.f15765d;
        map.put(enumC0932bK3, c1580nJ3);
        map2.put(c1580nJ3, enumC0932bK3);
        f13891c = new Vu(Collections.unmodifiableMap(map), Collections.unmodifiableMap(map2));
    }

    public static InterfaceC1199gE b(C1849sJ c1849sJ) {
        try {
            int i = AbstractC2062wG.f17417a;
            if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
                (!Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT)).getClass();
            }
            Provider providerD = AbstractC1114el.d();
            if (providerD != null) {
                return NJ.c(c1849sJ, providerD);
            }
            throw new NoSuchProviderException("RSA-PKCS1.5 using Conscrypt is not supported.");
        } catch (NoSuchProviderException unused) {
            KeyFactory keyFactory = (KeyFactory) YJ.f12631g.f12632a.c("RSA");
            BigInteger bigInteger = c1849sJ.f16703d;
            C1688pJ c1688pJ = c1849sJ.f16702c;
            return new JJ((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, c1688pJ.f16158b)), (EnumC0932bK) f13891c.y(c1688pJ.f16160d), c1849sJ.f16704e.b(), c1688pJ.f16159c.equals(C1634oJ.f15930d) ? f13890b : f13889a);
        }
    }
}

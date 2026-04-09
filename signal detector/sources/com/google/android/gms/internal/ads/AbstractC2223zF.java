package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* renamed from: com.google.android.gms.internal.ads.zF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2223zF {

    /* renamed from: a, reason: collision with root package name */
    public static final long[] f17842a;

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f17843b;

    /* renamed from: c, reason: collision with root package name */
    public static final long[] f17844c;

    /* renamed from: d, reason: collision with root package name */
    public static final C2115xF[][] f17845d;

    /* renamed from: e, reason: collision with root package name */
    public static final C2115xF[] f17846e;

    /* renamed from: f, reason: collision with root package name */
    public static final BigInteger f17847f;

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f17848g;

    /* renamed from: h, reason: collision with root package name */
    public static final BigInteger f17849h;

    static {
        BigInteger bigIntegerSubtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        f17847f = bigIntegerSubtract;
        BigInteger bigIntegerMod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        f17848g = bigIntegerMod;
        BigInteger bigIntegerMod2 = BigInteger.valueOf(2L).multiply(bigIntegerMod).mod(bigIntegerSubtract);
        f17849h = bigIntegerMod2;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerModPow = bigIntegerValueOf.modPow(bigIntegerSubtract.subtract(bigInteger).divide(BigInteger.valueOf(4L)), bigIntegerSubtract);
        C1879sw c1879sw = new C1879sw(3, false);
        BigInteger bigIntegerMod3 = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        c1879sw.f16824c = bigIntegerMod3;
        BigInteger bigIntegerMultiply = bigIntegerMod3.pow(2).subtract(bigInteger).multiply(bigIntegerMod.multiply(bigIntegerMod3.pow(2)).add(bigInteger).modInverse(bigIntegerSubtract));
        BigInteger bigIntegerModPow2 = bigIntegerMultiply.modPow(bigIntegerSubtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigIntegerSubtract);
        if (!bigIntegerModPow2.pow(2).subtract(bigIntegerMultiply).mod(bigIntegerSubtract).equals(BigInteger.ZERO)) {
            bigIntegerModPow2 = bigIntegerModPow2.multiply(bigIntegerModPow).mod(bigIntegerSubtract);
        }
        if (bigIntegerModPow2.testBit(0)) {
            bigIntegerModPow2 = bigIntegerSubtract.subtract(bigIntegerModPow2);
        }
        c1879sw.f16823b = bigIntegerModPow2;
        f17842a = AbstractC2022vd.O(b(bigIntegerMod));
        f17843b = AbstractC2022vd.O(b(bigIntegerMod2));
        f17844c = AbstractC2022vd.O(b(bigIntegerModPow));
        f17845d = (C2115xF[][]) Array.newInstance((Class<?>) C2115xF.class, 32, 8);
        C1879sw c1879swA = c1879sw;
        for (int i = 0; i < 32; i++) {
            C1879sw c1879swA2 = c1879swA;
            for (int i3 = 0; i3 < 8; i3++) {
                f17845d[i][i3] = c(c1879swA2);
                c1879swA2 = a(c1879swA2, c1879swA);
            }
            for (int i6 = 0; i6 < 8; i6++) {
                c1879swA = a(c1879swA, c1879swA);
            }
        }
        C1879sw c1879swA3 = a(c1879sw, c1879sw);
        f17846e = new C2115xF[8];
        for (int i7 = 0; i7 < 8; i7++) {
            f17846e[i7] = c(c1879sw);
            c1879sw = a(c1879sw, c1879swA3);
        }
    }

    public static C1879sw a(C1879sw c1879sw, C1879sw c1879sw2) {
        C1879sw c1879sw3 = new C1879sw(3, false);
        BigInteger bigIntegerMultiply = f17848g.multiply(((BigInteger) c1879sw.f16823b).multiply((BigInteger) c1879sw2.f16823b).multiply((BigInteger) c1879sw.f16824c).multiply((BigInteger) c1879sw2.f16824c));
        BigInteger bigInteger = f17847f;
        BigInteger bigIntegerMod = bigIntegerMultiply.mod(bigInteger);
        BigInteger bigIntegerAdd = ((BigInteger) c1879sw.f16823b).multiply((BigInteger) c1879sw2.f16824c).add(((BigInteger) c1879sw2.f16823b).multiply((BigInteger) c1879sw.f16824c));
        BigInteger bigInteger2 = BigInteger.ONE;
        c1879sw3.f16823b = bigIntegerAdd.multiply(bigInteger2.add(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        c1879sw3.f16824c = ((BigInteger) c1879sw.f16824c).multiply((BigInteger) c1879sw2.f16824c).add(((BigInteger) c1879sw.f16823b).multiply((BigInteger) c1879sw2.f16823b)).multiply(bigInteger2.subtract(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        return c1879sw3;
    }

    public static byte[] b(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        System.arraycopy(byteArray, 0, bArr, 32 - length, length);
        for (int i = 0; i < 16; i++) {
            byte b5 = bArr[i];
            int i3 = 31 - i;
            bArr[i] = bArr[i3];
            bArr[i3] = b5;
        }
        return bArr;
    }

    public static C2115xF c(C1879sw c1879sw) {
        BigInteger bigIntegerAdd = ((BigInteger) c1879sw.f16824c).add((BigInteger) c1879sw.f16823b);
        BigInteger bigInteger = f17847f;
        return new C2115xF(AbstractC2022vd.O(b(bigIntegerAdd.mod(bigInteger))), AbstractC2022vd.O(b(((BigInteger) c1879sw.f16824c).subtract((BigInteger) c1879sw.f16823b).mod(bigInteger))), AbstractC2022vd.O(b(f17849h.multiply((BigInteger) c1879sw.f16823b).multiply((BigInteger) c1879sw.f16824c).mod(bigInteger))));
    }
}

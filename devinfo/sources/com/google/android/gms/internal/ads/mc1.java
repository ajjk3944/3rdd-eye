package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class mc1 {

    /* renamed from: a, reason: collision with root package name */
    public static final long[] f13864a;

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f13865b;

    /* renamed from: c, reason: collision with root package name */
    public static final long[] f13866c;

    /* renamed from: d, reason: collision with root package name */
    public static final kc1[][] f13867d;

    /* renamed from: e, reason: collision with root package name */
    public static final kc1[] f13868e;

    /* renamed from: f, reason: collision with root package name */
    public static final BigInteger f13869f;
    public static final BigInteger g;

    /* renamed from: h, reason: collision with root package name */
    public static final BigInteger f13870h;

    static {
        BigInteger bigIntegerSubtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        f13869f = bigIntegerSubtract;
        BigInteger bigIntegerMod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        g = bigIntegerMod;
        BigInteger bigIntegerMod2 = BigInteger.valueOf(2L).multiply(bigIntegerMod).mod(bigIntegerSubtract);
        f13870h = bigIntegerMod2;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerModPow = bigIntegerValueOf.modPow(bigIntegerSubtract.subtract(bigInteger).divide(BigInteger.valueOf(4L)), bigIntegerSubtract);
        ce1 ce1Var = new ce1(23);
        BigInteger bigIntegerMod3 = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        ce1Var.f10095c = bigIntegerMod3;
        BigInteger bigIntegerMultiply = bigIntegerMod3.pow(2).subtract(bigInteger).multiply(bigIntegerMod.multiply(bigIntegerMod3.pow(2)).add(bigInteger).modInverse(bigIntegerSubtract));
        BigInteger bigIntegerModPow2 = bigIntegerMultiply.modPow(bigIntegerSubtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigIntegerSubtract);
        if (!bigIntegerModPow2.pow(2).subtract(bigIntegerMultiply).mod(bigIntegerSubtract).equals(BigInteger.ZERO)) {
            bigIntegerModPow2 = bigIntegerModPow2.multiply(bigIntegerModPow).mod(bigIntegerSubtract);
        }
        if (bigIntegerModPow2.testBit(0)) {
            bigIntegerModPow2 = bigIntegerSubtract.subtract(bigIntegerModPow2);
        }
        ce1Var.f10094b = bigIntegerModPow2;
        f13864a = ls.M(b(bigIntegerMod));
        f13865b = ls.M(b(bigIntegerMod2));
        f13866c = ls.M(b(bigIntegerModPow));
        f13867d = (kc1[][]) Array.newInstance((Class<?>) kc1.class, 32, 8);
        ce1 ce1VarA = ce1Var;
        for (int i4 = 0; i4 < 32; i4++) {
            ce1 ce1VarA2 = ce1VarA;
            for (int i10 = 0; i10 < 8; i10++) {
                f13867d[i4][i10] = c(ce1VarA2);
                ce1VarA2 = a(ce1VarA2, ce1VarA);
            }
            for (int i11 = 0; i11 < 8; i11++) {
                ce1VarA = a(ce1VarA, ce1VarA);
            }
        }
        ce1 ce1VarA3 = a(ce1Var, ce1Var);
        f13868e = new kc1[8];
        for (int i12 = 0; i12 < 8; i12++) {
            f13868e[i12] = c(ce1Var);
            ce1Var = a(ce1Var, ce1VarA3);
        }
    }

    public static ce1 a(ce1 ce1Var, ce1 ce1Var2) {
        ce1 ce1Var3 = new ce1(23);
        BigInteger bigIntegerMultiply = g.multiply(((BigInteger) ce1Var.f10094b).multiply((BigInteger) ce1Var2.f10094b).multiply((BigInteger) ce1Var.f10095c).multiply((BigInteger) ce1Var2.f10095c));
        BigInteger bigInteger = f13869f;
        BigInteger bigIntegerMod = bigIntegerMultiply.mod(bigInteger);
        BigInteger bigIntegerAdd = ((BigInteger) ce1Var.f10094b).multiply((BigInteger) ce1Var2.f10095c).add(((BigInteger) ce1Var2.f10094b).multiply((BigInteger) ce1Var.f10095c));
        BigInteger bigInteger2 = BigInteger.ONE;
        ce1Var3.f10094b = bigIntegerAdd.multiply(bigInteger2.add(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        ce1Var3.f10095c = ((BigInteger) ce1Var.f10095c).multiply((BigInteger) ce1Var2.f10095c).add(((BigInteger) ce1Var.f10094b).multiply((BigInteger) ce1Var2.f10094b)).multiply(bigInteger2.subtract(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        return ce1Var3;
    }

    public static byte[] b(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        System.arraycopy(byteArray, 0, bArr, 32 - length, length);
        for (int i4 = 0; i4 < 16; i4++) {
            byte b10 = bArr[i4];
            int i10 = 31 - i4;
            bArr[i4] = bArr[i10];
            bArr[i10] = b10;
        }
        return bArr;
    }

    public static kc1 c(ce1 ce1Var) {
        BigInteger bigIntegerAdd = ((BigInteger) ce1Var.f10095c).add((BigInteger) ce1Var.f10094b);
        BigInteger bigInteger = f13869f;
        return new kc1(ls.M(b(bigIntegerAdd.mod(bigInteger))), ls.M(b(((BigInteger) ce1Var.f10095c).subtract((BigInteger) ce1Var.f10094b).mod(bigInteger))), ls.M(b(f13870h.multiply((BigInteger) ce1Var.f10094b).multiply((BigInteger) ce1Var.f10095c).mod(bigInteger))));
    }
}

package defpackage;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class pu3 {
    public static final long[] a;
    public static final long[] b;
    public static final long[] c;
    public static final nu3[][] d;
    public static final nu3[] e;
    public static final BigInteger f;
    public static final BigInteger g;
    public static final BigInteger h;

    static {
        BigInteger bigIntegerSubtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        f = bigIntegerSubtract;
        BigInteger bigIntegerMod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        g = bigIntegerMod;
        BigInteger bigIntegerMod2 = BigInteger.valueOf(2L).multiply(bigIntegerMod).mod(bigIntegerSubtract);
        h = bigIntegerMod2;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerModPow = bigIntegerValueOf.modPow(bigIntegerSubtract.subtract(bigInteger).divide(BigInteger.valueOf(4L)), bigIntegerSubtract);
        lv2 lv2Var = new lv2();
        BigInteger bigIntegerMod3 = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        lv2Var.h = bigIntegerMod3;
        BigInteger bigIntegerMultiply = bigIntegerMod3.pow(2).subtract(bigInteger).multiply(bigIntegerMod.multiply(bigIntegerMod3.pow(2)).add(bigInteger).modInverse(bigIntegerSubtract));
        BigInteger bigIntegerModPow2 = bigIntegerMultiply.modPow(bigIntegerSubtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigIntegerSubtract);
        if (!bigIntegerModPow2.pow(2).subtract(bigIntegerMultiply).mod(bigIntegerSubtract).equals(BigInteger.ZERO)) {
            bigIntegerModPow2 = bigIntegerModPow2.multiply(bigIntegerModPow).mod(bigIntegerSubtract);
        }
        if (bigIntegerModPow2.testBit(0)) {
            bigIntegerModPow2 = bigIntegerSubtract.subtract(bigIntegerModPow2);
        }
        lv2Var.g = bigIntegerModPow2;
        a = pu1.K(b(bigIntegerMod));
        b = pu1.K(b(bigIntegerMod2));
        c = pu1.K(b(bigIntegerModPow));
        d = (nu3[][]) Array.newInstance((Class<?>) nu3.class, 32, 8);
        lv2 lv2VarA = lv2Var;
        for (int i = 0; i < 32; i++) {
            lv2 lv2VarA2 = lv2VarA;
            for (int i2 = 0; i2 < 8; i2++) {
                d[i][i2] = c(lv2VarA2);
                lv2VarA2 = a(lv2VarA2, lv2VarA);
            }
            for (int i3 = 0; i3 < 8; i3++) {
                lv2VarA = a(lv2VarA, lv2VarA);
            }
        }
        lv2 lv2VarA3 = a(lv2Var, lv2Var);
        e = new nu3[8];
        for (int i4 = 0; i4 < 8; i4++) {
            e[i4] = c(lv2Var);
            lv2Var = a(lv2Var, lv2VarA3);
        }
    }

    public static lv2 a(lv2 lv2Var, lv2 lv2Var2) {
        lv2 lv2Var3 = new lv2();
        BigInteger bigIntegerMultiply = g.multiply(((BigInteger) lv2Var.g).multiply((BigInteger) lv2Var2.g).multiply((BigInteger) lv2Var.h).multiply((BigInteger) lv2Var2.h));
        BigInteger bigInteger = f;
        BigInteger bigIntegerMod = bigIntegerMultiply.mod(bigInteger);
        BigInteger bigIntegerAdd = ((BigInteger) lv2Var.g).multiply((BigInteger) lv2Var2.h).add(((BigInteger) lv2Var2.g).multiply((BigInteger) lv2Var.h));
        BigInteger bigInteger2 = BigInteger.ONE;
        lv2Var3.g = bigIntegerAdd.multiply(bigInteger2.add(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        lv2Var3.h = ((BigInteger) lv2Var.h).multiply((BigInteger) lv2Var2.h).add(((BigInteger) lv2Var.g).multiply((BigInteger) lv2Var2.g)).multiply(bigInteger2.subtract(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        return lv2Var3;
    }

    public static byte[] b(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        System.arraycopy(byteArray, 0, bArr, 32 - length, length);
        for (int i = 0; i < 16; i++) {
            byte b2 = bArr[i];
            int i2 = 31 - i;
            bArr[i] = bArr[i2];
            bArr[i2] = b2;
        }
        return bArr;
    }

    public static nu3 c(lv2 lv2Var) {
        BigInteger bigIntegerAdd = ((BigInteger) lv2Var.h).add((BigInteger) lv2Var.g);
        BigInteger bigInteger = f;
        return new nu3(pu1.K(b(bigIntegerAdd.mod(bigInteger))), pu1.K(b(((BigInteger) lv2Var.h).subtract((BigInteger) lv2Var.g).mod(bigInteger))), pu1.K(b(h.multiply((BigInteger) lv2Var.g).multiply((BigInteger) lv2Var.h).mod(bigInteger))));
    }
}

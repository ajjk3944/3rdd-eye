package xj;

import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class b {
    public static void a(byte[] bArr, int i10) {
        if (bArr == null || bArr.length != i10) {
            throw new RuntimeException("Invalid size: " + bArr.length);
        }
    }

    public static boolean b(int i10, String str) {
        if (i10 == 0) {
            return true;
        }
        throw new RuntimeException(str);
    }

    public static byte[] c(int i10, byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length + i10];
        Arrays.fill(bArr2, (byte) 0);
        System.arraycopy(bArr, 0, bArr2, i10, bArr.length);
        return bArr2;
    }

    public static byte[] d(int i10, byte[] bArr) {
        return Arrays.copyOfRange(bArr, i10, bArr.length);
    }

    public static byte[] e(int i10) {
        return new byte[i10];
    }
}

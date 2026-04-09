package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidKeyException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class eu3 {
    public final int[] a;
    public final int b;
    public final /* synthetic */ int c;

    public eu3(byte[] bArr, int i, int i2) throws InvalidKeyException {
        this.c = i2;
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.a = du3.c(bArr);
        this.b = i;
    }

    public final int a() {
        switch (this.c) {
            case 0:
                return 12;
            default:
                return 24;
        }
    }

    public final ByteBuffer b(int i, byte[] bArr) {
        int[] iArr;
        int[] iArrC = du3.c(bArr);
        switch (this.c) {
            case 0:
                int length = iArrC.length;
                if (length != 3) {
                    throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
                }
                iArr = new int[16];
                int[] iArr2 = du3.a;
                int length2 = iArr2.length;
                System.arraycopy(iArr2, 0, iArr, 0, length2);
                System.arraycopy(this.a, 0, iArr, length2, 8);
                iArr[12] = i;
                System.arraycopy(iArrC, 0, iArr, 13, 3);
                break;
            default:
                int length3 = iArrC.length;
                if (length3 != 6) {
                    throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length3 * 32)));
                }
                iArr = new int[16];
                int[] iArrD = du3.d(this.a, iArrC);
                int[] iArr3 = du3.a;
                int length4 = iArr3.length;
                System.arraycopy(iArr3, 0, iArr, 0, length4);
                System.arraycopy(iArrD, 0, iArr, length4, 8);
                iArr[12] = i;
                iArr[13] = 0;
                iArr[14] = iArrC[4];
                iArr[15] = iArrC[5];
                break;
        }
        int[] iArr4 = (int[]) iArr.clone();
        du3.a(iArr4);
        for (int i2 = 0; i2 < 16; i2++) {
            iArr[i2] = iArr[i2] + iArr4[i2];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArr, 0, 16);
        return byteBufferOrder;
    }
}

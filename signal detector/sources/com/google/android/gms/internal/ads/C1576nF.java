package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidKeyException;

/* renamed from: com.google.android.gms.internal.ads.nF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1576nF {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f15760a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15761b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15762c;

    public C1576nF(int i, int i3, byte[] bArr) throws InvalidKeyException {
        this.f15762c = i3;
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f15760a = AbstractC1522mF.c(bArr);
        this.f15761b = i;
    }

    public final int a() {
        switch (this.f15762c) {
            case 0:
                return 12;
            default:
                return 24;
        }
    }

    public final ByteBuffer b(int i, byte[] bArr) {
        int[] iArr;
        int[] iArrC = AbstractC1522mF.c(bArr);
        int i3 = this.f15762c;
        int[] iArr2 = this.f15760a;
        switch (i3) {
            case 0:
                int length = iArrC.length;
                if (length != 3) {
                    throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
                }
                iArr = new int[16];
                int[] iArr3 = AbstractC1522mF.f15602a;
                int length2 = iArr3.length;
                System.arraycopy(iArr3, 0, iArr, 0, length2);
                System.arraycopy(iArr2, 0, iArr, length2, 8);
                iArr[12] = i;
                System.arraycopy(iArrC, 0, iArr, 13, 3);
                break;
            default:
                int length3 = iArrC.length;
                if (length3 != 6) {
                    throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length3 * 32)));
                }
                iArr = new int[16];
                int[] iArrD = AbstractC1522mF.d(iArr2, iArrC);
                int[] iArr4 = AbstractC1522mF.f15602a;
                int length4 = iArr4.length;
                System.arraycopy(iArr4, 0, iArr, 0, length4);
                System.arraycopy(iArrD, 0, iArr, length4, 8);
                iArr[12] = i;
                iArr[13] = 0;
                iArr[14] = iArrC[4];
                iArr[15] = iArrC[5];
                break;
        }
        int[] iArr5 = (int[]) iArr.clone();
        AbstractC1522mF.a(iArr5);
        for (int i6 = 0; i6 < 16; i6++) {
            iArr[i6] = iArr[i6] + iArr5[i6];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArr, 0, 16);
        return byteBufferOrder;
    }
}

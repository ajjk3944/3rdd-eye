package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ac1 extends androidx.datastore.preferences.protobuf.j {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9303c;

    public ac1(byte[] bArr, int i4, int i10) throws InvalidKeyException {
        this.f9303c = i10;
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f996b = zb1.c(bArr);
        this.f995a = i4;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int[] E(int i4, int[] iArr) {
        switch (this.f9303c) {
            case 0:
                int length = iArr.length;
                if (length != 3) {
                    throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
                }
                int[] iArr2 = new int[16];
                int[] iArr3 = (int[]) this.f996b;
                int[] iArr4 = zb1.f19056a;
                int length2 = iArr4.length;
                System.arraycopy(iArr4, 0, iArr2, 0, length2);
                System.arraycopy(iArr3, 0, iArr2, length2, 8);
                iArr2[12] = i4;
                System.arraycopy(iArr, 0, iArr2, 13, 3);
                return iArr2;
            default:
                int length3 = iArr.length;
                if (length3 != 6) {
                    throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length3 * 32)));
                }
                int[] iArr5 = new int[16];
                int[] iArrD = zb1.d((int[]) this.f996b, iArr);
                int[] iArr6 = zb1.f19056a;
                int length4 = iArr6.length;
                System.arraycopy(iArr6, 0, iArr5, 0, length4);
                System.arraycopy(iArrD, 0, iArr5, length4, 8);
                iArr5[12] = i4;
                iArr5[13] = 0;
                iArr5[14] = iArr[4];
                iArr5[15] = iArr[5];
                return iArr5;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int F() {
        switch (this.f9303c) {
            case 0:
                return 12;
            default:
                return 24;
        }
    }
}

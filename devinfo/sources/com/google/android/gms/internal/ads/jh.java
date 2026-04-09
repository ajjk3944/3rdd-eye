package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class jh extends hp1 {

    /* renamed from: c, reason: collision with root package name */
    public MessageDigest f12745c;

    public final byte[] v1(String str) {
        byte[] bArr;
        byte[] bArrArray;
        String[] strArrSplit = str.split(" ");
        int length = strArrSplit.length;
        int i4 = 4;
        if (length == 1) {
            int iA = jz.a(strArrSplit[0]);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putInt(iA);
            bArrArray = byteBufferAllocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i10 = 0; i10 < strArrSplit.length; i10++) {
                    int iA2 = jz.a(strArrSplit[i10]);
                    int i11 = (iA2 >> 16) ^ ((char) iA2);
                    byte b10 = (byte) i11;
                    byte b11 = (byte) (i11 >> 8);
                    int i12 = i10 + i10;
                    bArr[i12] = new byte[]{b10, b11}[0];
                    bArr[i12 + 1] = b11;
                }
            } else {
                bArr = new byte[length];
                for (int i13 = 0; i13 < strArrSplit.length; i13++) {
                    int iA3 = jz.a(strArrSplit[i13]);
                    bArr[i13] = (byte) ((iA3 >> 24) ^ (((iA3 & 255) ^ ((iA3 >> 8) & 255)) ^ ((iA3 >> 16) & 255)));
                }
            }
            bArrArray = bArr;
        }
        this.f12745c = H();
        synchronized (this.f11937a) {
            try {
                MessageDigest messageDigest = this.f12745c;
                if (messageDigest == null) {
                    return new byte[0];
                }
                messageDigest.reset();
                this.f12745c.update(bArrArray);
                byte[] bArrDigest = this.f12745c.digest();
                int length2 = bArrDigest.length;
                if (length2 <= 4) {
                    i4 = length2;
                }
                byte[] bArr2 = new byte[i4];
                System.arraycopy(bArrDigest, 0, bArr2, 0, i4);
                return bArr2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

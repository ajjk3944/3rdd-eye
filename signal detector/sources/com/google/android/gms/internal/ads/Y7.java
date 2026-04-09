package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class Y7 extends VL {

    /* renamed from: c, reason: collision with root package name */
    public MessageDigest f12597c;

    public final byte[] H1(String str) {
        byte[] bArr;
        byte[] bArrArray;
        String[] strArrSplit = str.split(" ");
        int length = strArrSplit.length;
        int i = 4;
        if (length == 1) {
            int iA = AbstractC1114el.a(strArrSplit[0]);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putInt(iA);
            bArrArray = byteBufferAllocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i3 = 0; i3 < strArrSplit.length; i3++) {
                    int iA2 = AbstractC1114el.a(strArrSplit[i3]);
                    int i6 = (iA2 >> 16) ^ ((char) iA2);
                    byte b5 = (byte) i6;
                    byte b6 = (byte) (i6 >> 8);
                    int i7 = i3 + i3;
                    bArr[i7] = new byte[]{b5, b6}[0];
                    bArr[i7 + 1] = b6;
                }
            } else {
                bArr = new byte[length];
                for (int i8 = 0; i8 < strArrSplit.length; i8++) {
                    int iA3 = AbstractC1114el.a(strArrSplit[i8]);
                    bArr[i8] = (byte) ((iA3 >> 24) ^ (((iA3 & 255) ^ ((iA3 >> 8) & 255)) ^ ((iA3 >> 16) & 255)));
                }
            }
            bArrArray = bArr;
        }
        this.f12597c = S();
        synchronized (this.f11985a) {
            try {
                MessageDigest messageDigest = this.f12597c;
                if (messageDigest == null) {
                    return new byte[0];
                }
                messageDigest.reset();
                this.f12597c.update(bArrArray);
                byte[] bArrDigest = this.f12597c.digest();
                int length2 = bArrDigest.length;
                if (length2 <= 4) {
                    i = length2;
                }
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArrDigest, 0, bArr2, 0, i);
                return bArr2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

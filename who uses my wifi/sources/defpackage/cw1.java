package defpackage;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class cw1 extends f74 {
    public MessageDigest i;

    public final byte[] U1(String str) throws UnsupportedEncodingException {
        byte[] bArr;
        byte[] bArrArray;
        String[] strArrSplit = str.split(" ");
        int length = strArrSplit.length;
        int i = 4;
        if (length == 1) {
            int iZ = zt0.z(strArrSplit[0]);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putInt(iZ);
            bArrArray = byteBufferAllocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                    int iZ2 = zt0.z(strArrSplit[i2]);
                    int i3 = (iZ2 >> 16) ^ ((char) iZ2);
                    byte b = (byte) i3;
                    byte b2 = (byte) (i3 >> 8);
                    int i4 = i2 + i2;
                    bArr[i4] = new byte[]{b, b2}[0];
                    bArr[i4 + 1] = b2;
                }
            } else {
                bArr = new byte[length];
                for (int i5 = 0; i5 < strArrSplit.length; i5++) {
                    int iZ3 = zt0.z(strArrSplit[i5]);
                    bArr[i5] = (byte) ((iZ3 >> 24) ^ (((iZ3 & 255) ^ ((iZ3 >> 8) & 255)) ^ ((iZ3 >> 16) & 255)));
                }
            }
            bArrArray = bArr;
        }
        this.i = s1();
        synchronized (this.g) {
            try {
                MessageDigest messageDigest = this.i;
                if (messageDigest == null) {
                    return new byte[0];
                }
                messageDigest.reset();
                this.i.update(bArrArray);
                byte[] bArrDigest = this.i.digest();
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

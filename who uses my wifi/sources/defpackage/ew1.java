package defpackage;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ew1 extends f74 {
    public MessageDigest i;
    public final int j;
    public final int k;

    public ew1(int i) {
        super(7);
        int i2 = i >> 3;
        this.j = (i & 7) > 0 ? i2 + 1 : i2;
        this.k = i;
    }

    public final byte[] U1(String str) {
        synchronized (this.g) {
            try {
                MessageDigest messageDigestS1 = s1();
                this.i = messageDigestS1;
                if (messageDigestS1 == null) {
                    return new byte[0];
                }
                messageDigestS1.reset();
                this.i.update(str.getBytes(Charset.forName("UTF-8")));
                byte[] bArrDigest = this.i.digest();
                int length = bArrDigest.length;
                int i = this.j;
                if (length > i) {
                    length = i;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(bArrDigest, 0, bArr, 0, length);
                int i2 = this.k & 7;
                if (i2 > 0) {
                    long j = 0;
                    for (int i3 = 0; i3 < length; i3++) {
                        if (i3 > 0) {
                            j <<= 8;
                        }
                        j += bArr[i3] & 255;
                    }
                    long j2 = j >>> (8 - i2);
                    while (true) {
                        i--;
                        if (i < 0) {
                            break;
                        }
                        bArr[i] = (byte) (255 & j2);
                        j2 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

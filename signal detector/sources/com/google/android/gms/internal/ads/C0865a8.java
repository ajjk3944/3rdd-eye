package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* renamed from: com.google.android.gms.internal.ads.a8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0865a8 extends VL {

    /* renamed from: c, reason: collision with root package name */
    public MessageDigest f13074c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13075d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13076e;

    public C0865a8(int i) {
        super(2);
        int i3 = i >> 3;
        this.f13075d = (i & 7) > 0 ? i3 + 1 : i3;
        this.f13076e = i;
    }

    public final byte[] H1(String str) {
        synchronized (this.f11985a) {
            try {
                MessageDigest messageDigestS = S();
                this.f13074c = messageDigestS;
                if (messageDigestS == null) {
                    return new byte[0];
                }
                messageDigestS.reset();
                this.f13074c.update(str.getBytes(StandardCharsets.UTF_8));
                byte[] bArrDigest = this.f13074c.digest();
                int length = bArrDigest.length;
                int i = this.f13075d;
                if (length > i) {
                    length = i;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(bArrDigest, 0, bArr, 0, length);
                int i3 = this.f13076e & 7;
                if (i3 > 0) {
                    long j6 = 0;
                    for (int i6 = 0; i6 < length; i6++) {
                        if (i6 > 0) {
                            j6 <<= 8;
                        }
                        j6 += bArr[i6] & 255;
                    }
                    long j7 = j6 >>> (8 - i3);
                    while (true) {
                        i--;
                        if (i < 0) {
                            break;
                        }
                        bArr[i] = (byte) (255 & j7);
                        j7 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

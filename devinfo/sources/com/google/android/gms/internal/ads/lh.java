package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class lh extends hp1 {

    /* renamed from: c, reason: collision with root package name */
    public MessageDigest f13489c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13490d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13491e;

    public lh(int i4) {
        super(2);
        int i10 = i4 >> 3;
        this.f13490d = (i4 & 7) > 0 ? i10 + 1 : i10;
        this.f13491e = i4;
    }

    public final byte[] v1(String str) {
        synchronized (this.f11937a) {
            try {
                MessageDigest messageDigestH = H();
                this.f13489c = messageDigestH;
                if (messageDigestH == null) {
                    return new byte[0];
                }
                messageDigestH.reset();
                this.f13489c.update(str.getBytes(StandardCharsets.UTF_8));
                byte[] bArrDigest = this.f13489c.digest();
                int length = bArrDigest.length;
                int i4 = this.f13490d;
                if (length > i4) {
                    length = i4;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(bArrDigest, 0, bArr, 0, length);
                int i10 = this.f13491e & 7;
                if (i10 > 0) {
                    long j = 0;
                    for (int i11 = 0; i11 < length; i11++) {
                        if (i11 > 0) {
                            j <<= 8;
                        }
                        j += bArr[i11] & 255;
                    }
                    long j8 = j >>> (8 - i10);
                    while (true) {
                        i4--;
                        if (i4 < 0) {
                            break;
                        }
                        bArr[i4] = (byte) (255 & j8);
                        j8 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

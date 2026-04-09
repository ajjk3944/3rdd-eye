package com.google.android.gms.internal.ads;

import com.singular.sdk.internal.Constants;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbal extends zzbac {
    private MessageDigest zzb;
    private final int zzc;
    private final int zzd;

    public zzbal(int i) {
        int i10 = i >> 3;
        this.zzc = (i & 7) > 0 ? i10 + 1 : i10;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzbac
    public final byte[] zzb(String str) {
        synchronized (this.zza) {
            try {
                MessageDigest messageDigestZza = zza();
                this.zzb = messageDigestZza;
                if (messageDigestZza == null) {
                    return new byte[0];
                }
                messageDigestZza.reset();
                this.zzb.update(str.getBytes(Charset.forName(Constants.ENCODING)));
                byte[] bArrDigest = this.zzb.digest();
                int length = bArrDigest.length;
                int i = this.zzc;
                if (length > i) {
                    length = i;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(bArrDigest, 0, bArr, 0, length);
                int i10 = this.zzd & 7;
                if (i10 > 0) {
                    long j4 = 0;
                    for (int i11 = 0; i11 < length; i11++) {
                        if (i11 > 0) {
                            j4 <<= 8;
                        }
                        j4 += bArr[i11] & 255;
                    }
                    long j10 = j4 >>> (8 - i10);
                    while (true) {
                        i--;
                        if (i < 0) {
                            break;
                        }
                        bArr[i] = (byte) (255 & j10);
                        j10 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

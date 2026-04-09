package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbah extends zzbac {
    private MessageDigest zzb;

    @Override // com.google.android.gms.internal.ads.zzbac
    public final byte[] zzb(String str) throws UnsupportedEncodingException {
        byte[] bArr;
        byte[] bArrArray;
        String[] strArrSplit = str.split(" ");
        int length = strArrSplit.length;
        int i = 4;
        if (length == 1) {
            int iZza = zzbag.zza(strArrSplit[0]);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putInt(iZza);
            bArrArray = byteBufferAllocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i10 = 0; i10 < strArrSplit.length; i10++) {
                    int iZza2 = zzbag.zza(strArrSplit[i10]);
                    int i11 = (iZza2 >> 16) ^ ((char) iZza2);
                    byte b10 = (byte) i11;
                    byte b11 = (byte) (i11 >> 8);
                    int i12 = i10 + i10;
                    bArr[i12] = new byte[]{b10, b11}[0];
                    bArr[i12 + 1] = b11;
                }
            } else {
                bArr = new byte[length];
                for (int i13 = 0; i13 < strArrSplit.length; i13++) {
                    int iZza3 = zzbag.zza(strArrSplit[i13]);
                    bArr[i13] = (byte) ((iZza3 >> 24) ^ (((iZza3 & KotlinVersion.MAX_COMPONENT_VALUE) ^ ((iZza3 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE)) ^ ((iZza3 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE)));
                }
            }
            bArrArray = bArr;
        }
        this.zzb = zza();
        synchronized (this.zza) {
            try {
                MessageDigest messageDigest = this.zzb;
                if (messageDigest == null) {
                    return new byte[0];
                }
                messageDigest.reset();
                this.zzb.update(bArrArray);
                byte[] bArrDigest = this.zzb.digest();
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

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
abstract class zzhbu {
    public static final String zzc(ByteBuffer byteBuffer, int i, int i10) throws zzgzk {
        int i11;
        if ((((byteBuffer.limit() - i) - i10) | i | i10) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i10)));
        }
        int i12 = i + i10;
        char[] cArr = new char[i10];
        int i13 = 0;
        while (i < i12) {
            byte b10 = byteBuffer.get(i);
            if (!zzhbt.zzd(b10)) {
                break;
            }
            i++;
            cArr[i13] = (char) b10;
            i13++;
        }
        int i14 = i13;
        while (i < i12) {
            int i15 = i + 1;
            byte b11 = byteBuffer.get(i);
            if (zzhbt.zzd(b11)) {
                cArr[i14] = (char) b11;
                i14++;
                i = i15;
                while (i < i12) {
                    byte b12 = byteBuffer.get(i);
                    if (zzhbt.zzd(b12)) {
                        i++;
                        cArr[i14] = (char) b12;
                        i14++;
                    }
                }
            } else {
                if (zzhbt.zzf(b11)) {
                    if (i15 >= i12) {
                        throw new zzgzk("Protocol message had invalid UTF-8.");
                    }
                    i11 = i14 + 1;
                    i += 2;
                    zzhbt.zzc(b11, byteBuffer.get(i15), cArr, i14);
                } else if (zzhbt.zze(b11)) {
                    if (i15 >= i12 - 1) {
                        throw new zzgzk("Protocol message had invalid UTF-8.");
                    }
                    i11 = i14 + 1;
                    int i16 = i + 2;
                    i += 3;
                    zzhbt.zzb(b11, byteBuffer.get(i15), byteBuffer.get(i16), cArr, i14);
                } else {
                    if (i15 >= i12 - 2) {
                        throw new zzgzk("Protocol message had invalid UTF-8.");
                    }
                    byte b13 = byteBuffer.get(i15);
                    int i17 = i + 3;
                    byte b14 = byteBuffer.get(i + 2);
                    i += 4;
                    zzhbt.zza(b11, b13, b14, byteBuffer.get(i17), cArr, i14);
                    i14 += 2;
                }
                i14 = i11;
            }
        }
        return new String(cArr, 0, i14);
    }

    public abstract int zza(int i, byte[] bArr, int i10, int i11);

    public abstract String zzb(byte[] bArr, int i, int i10) throws zzgzk;
}

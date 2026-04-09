package com.google.android.gms.internal.ads;

import N7.C1154e9;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgws {
    private final byte[] zza;

    private zzgws(byte[] bArr, int i, int i10) {
        byte[] bArr2 = new byte[i10];
        this.zza = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i10);
    }

    public static zzgws zzb(byte[] bArr) {
        if (bArr != null) {
            return zzc(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public static zzgws zzc(byte[] bArr, int i, int i10) {
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        int length = bArr.length;
        if (i10 > length) {
            i10 = length;
        }
        return new zzgws(bArr, 0, i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgws) {
            return Arrays.equals(((zzgws) obj).zza, this.zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b10 : bArr) {
            sb.append("0123456789abcdef".charAt((b10 & 255) >> 4));
            sb.append("0123456789abcdef".charAt(b10 & 15));
        }
        return C1154e9.i("Bytes(", sb.toString(), ")");
    }

    public final int zza() {
        return this.zza.length;
    }

    public final byte[] zzd() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzaon {
    public static int zza(byte[] bArr, int i, int i10) {
        while (i < i10 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long zzb(zzen zzenVar, int i, int i10) {
        zzenVar.zzL(i);
        if (zzenVar.zza() < 5) {
            return -9223372036854775807L;
        }
        int iZzg = zzenVar.zzg();
        if ((8388608 & iZzg) != 0 || ((iZzg >> 8) & 8191) != i10 || (iZzg & 32) == 0 || zzenVar.zzm() < 7 || zzenVar.zza() < 7 || (zzenVar.zzm() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        zzenVar.zzH(bArr, 0, 6);
        long j4 = bArr[0];
        long j10 = bArr[1];
        long j11 = bArr[2];
        long j12 = bArr[3] & 255;
        return ((j4 & 255) << 25) | ((j10 & 255) << 17) | ((j11 & 255) << 9) | (j12 + j12) | ((bArr[4] & 255) >> 7);
    }
}

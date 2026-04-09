package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzgxc {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i, zzgxb zzgxbVar) throws zzgzk {
        int iZzh = zzh(bArr, i, zzgxbVar);
        int i10 = zzgxbVar.zza;
        if (i10 < 0) {
            throw new zzgzk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i10 > bArr.length - iZzh) {
            throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i10 == 0) {
            zzgxbVar.zzc = zzgxn.zzb;
            return iZzh;
        }
        zzgxbVar.zzc = zzgxn.zzv(bArr, iZzh, i10);
        return iZzh + i10;
    }

    public static int zzb(byte[] bArr, int i) {
        int i10 = bArr[i] & 255;
        int i11 = bArr[i + 1] & 255;
        int i12 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public static int zzc(zzhaz zzhazVar, byte[] bArr, int i, int i10, int i11, zzgxb zzgxbVar) throws IOException {
        Object objZze = zzhazVar.zze();
        int iZzl = zzl(objZze, zzhazVar, bArr, i, i10, i11, zzgxbVar);
        zzhazVar.zzf(objZze);
        zzgxbVar.zzc = objZze;
        return iZzl;
    }

    public static int zzd(zzhaz zzhazVar, byte[] bArr, int i, int i10, zzgxb zzgxbVar) throws IOException {
        Object objZze = zzhazVar.zze();
        int iZzm = zzm(objZze, zzhazVar, bArr, i, i10, zzgxbVar);
        zzhazVar.zzf(objZze);
        zzgxbVar.zzc = objZze;
        return iZzm;
    }

    public static int zze(zzhaz zzhazVar, int i, byte[] bArr, int i10, int i11, zzgzh zzgzhVar, zzgxb zzgxbVar) throws IOException {
        int iZzd = zzd(zzhazVar, bArr, i10, i11, zzgxbVar);
        zzgzhVar.add(zzgxbVar.zzc);
        while (iZzd < i11) {
            int iZzh = zzh(bArr, iZzd, zzgxbVar);
            if (i != zzgxbVar.zza) {
                break;
            }
            iZzd = zzd(zzhazVar, bArr, iZzh, i11, zzgxbVar);
            zzgzhVar.add(zzgxbVar.zzc);
        }
        return iZzd;
    }

    public static int zzf(byte[] bArr, int i, zzgzh zzgzhVar, zzgxb zzgxbVar) throws IOException {
        zzgyw zzgywVar = (zzgyw) zzgzhVar;
        int iZzh = zzh(bArr, i, zzgxbVar);
        int i10 = zzgxbVar.zza + iZzh;
        while (iZzh < i10) {
            iZzh = zzh(bArr, iZzh, zzgxbVar);
            zzgywVar.zzi(zzgxbVar.zza);
        }
        if (iZzh == i10) {
            return iZzh;
        }
        throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzg(int i, byte[] bArr, int i10, int i11, zzhbm zzhbmVar, zzgxb zzgxbVar) throws zzgzk {
        if ((i >>> 3) == 0) {
            throw new zzgzk("Protocol message contained an invalid tag (zero).");
        }
        int i12 = i & 7;
        if (i12 == 0) {
            int iZzk = zzk(bArr, i10, zzgxbVar);
            zzhbmVar.zzj(i, Long.valueOf(zzgxbVar.zzb));
            return iZzk;
        }
        if (i12 == 1) {
            zzhbmVar.zzj(i, Long.valueOf(zzn(bArr, i10)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int iZzh = zzh(bArr, i10, zzgxbVar);
            int i13 = zzgxbVar.zza;
            if (i13 < 0) {
                throw new zzgzk("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i13 > bArr.length - iZzh) {
                throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i13 == 0) {
                zzhbmVar.zzj(i, zzgxn.zzb);
            } else {
                zzhbmVar.zzj(i, zzgxn.zzv(bArr, iZzh, i13));
            }
            return iZzh + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw new zzgzk("Protocol message contained an invalid tag (zero).");
            }
            zzhbmVar.zzj(i, Integer.valueOf(zzb(bArr, i10)));
            return i10 + 4;
        }
        int i14 = (i & (-8)) | 4;
        zzhbm zzhbmVarZzf = zzhbm.zzf();
        int i15 = zzgxbVar.zze + 1;
        zzgxbVar.zze = i15;
        zzo(i15);
        int i16 = 0;
        while (true) {
            if (i10 >= i11) {
                break;
            }
            int iZzh2 = zzh(bArr, i10, zzgxbVar);
            int i17 = zzgxbVar.zza;
            if (i17 == i14) {
                i16 = i17;
                i10 = iZzh2;
                break;
            }
            i10 = zzg(i17, bArr, iZzh2, i11, zzhbmVarZzf, zzgxbVar);
            i16 = i17;
        }
        zzgxbVar.zze--;
        if (i10 > i11 || i16 != i14) {
            throw new zzgzk("Failed to parse the message.");
        }
        zzhbmVar.zzj(i, zzhbmVarZzf);
        return i10;
    }

    public static int zzh(byte[] bArr, int i, zzgxb zzgxbVar) {
        int i10 = i + 1;
        byte b10 = bArr[i];
        if (b10 < 0) {
            return zzi(b10, bArr, i10, zzgxbVar);
        }
        zzgxbVar.zza = b10;
        return i10;
    }

    public static int zzi(int i, byte[] bArr, int i10, zzgxb zzgxbVar) {
        byte b10 = bArr[i10];
        int i11 = i10 + 1;
        int i12 = i & 127;
        if (b10 >= 0) {
            zzgxbVar.zza = i12 | (b10 << 7);
            return i11;
        }
        int i13 = i12 | ((b10 & 127) << 7);
        int i14 = i10 + 2;
        byte b11 = bArr[i11];
        if (b11 >= 0) {
            zzgxbVar.zza = i13 | (b11 << 14);
            return i14;
        }
        int i15 = i13 | ((b11 & 127) << 14);
        int i16 = i10 + 3;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            zzgxbVar.zza = i15 | (b12 << 21);
            return i16;
        }
        int i17 = i15 | ((b12 & 127) << 21);
        int i18 = i10 + 4;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            zzgxbVar.zza = i17 | (b13 << 28);
            return i18;
        }
        int i19 = i17 | ((b13 & 127) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                zzgxbVar.zza = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static int zzj(int i, byte[] bArr, int i10, int i11, zzgzh zzgzhVar, zzgxb zzgxbVar) {
        zzgyw zzgywVar = (zzgyw) zzgzhVar;
        int iZzh = zzh(bArr, i10, zzgxbVar);
        zzgywVar.zzi(zzgxbVar.zza);
        while (iZzh < i11) {
            int iZzh2 = zzh(bArr, iZzh, zzgxbVar);
            if (i != zzgxbVar.zza) {
                break;
            }
            iZzh = zzh(bArr, iZzh2, zzgxbVar);
            zzgywVar.zzi(zzgxbVar.zza);
        }
        return iZzh;
    }

    public static int zzk(byte[] bArr, int i, zzgxb zzgxbVar) {
        long j4 = bArr[i];
        int i10 = i + 1;
        if (j4 >= 0) {
            zzgxbVar.zzb = j4;
            return i10;
        }
        int i11 = i + 2;
        byte b10 = bArr[i10];
        long j10 = (j4 & 127) | ((b10 & 127) << 7);
        int i12 = 7;
        while (b10 < 0) {
            int i13 = i11 + 1;
            i12 += 7;
            j10 |= (r10 & 127) << i12;
            b10 = bArr[i11];
            i11 = i13;
        }
        zzgxbVar.zzb = j10;
        return i11;
    }

    public static int zzl(Object obj, zzhaz zzhazVar, byte[] bArr, int i, int i10, int i11, zzgxb zzgxbVar) throws IOException {
        int i12 = zzgxbVar.zze + 1;
        zzgxbVar.zze = i12;
        zzo(i12);
        int iZzc = ((zzhaj) zzhazVar).zzc(obj, bArr, i, i10, i11, zzgxbVar);
        zzgxbVar.zze--;
        zzgxbVar.zzc = obj;
        return iZzc;
    }

    public static int zzm(Object obj, zzhaz zzhazVar, byte[] bArr, int i, int i10, zzgxb zzgxbVar) throws IOException {
        int iZzi = i + 1;
        int i11 = bArr[i];
        if (i11 < 0) {
            iZzi = zzi(i11, bArr, iZzi, zzgxbVar);
            i11 = zzgxbVar.zza;
        }
        int i12 = iZzi;
        if (i11 < 0 || i11 > i10 - i12) {
            throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i13 = zzgxbVar.zze + 1;
        zzgxbVar.zze = i13;
        zzo(i13);
        int i14 = i12 + i11;
        zzhazVar.zzi(obj, bArr, i12, i14, zzgxbVar);
        zzgxbVar.zze--;
        zzgxbVar.zzc = obj;
        return i14;
    }

    public static long zzn(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    private static void zzo(int i) throws zzgzk {
        if (i >= zzb) {
            throw new zzgzk("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}

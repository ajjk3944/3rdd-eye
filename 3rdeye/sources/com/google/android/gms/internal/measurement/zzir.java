package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.1.1 */
/* loaded from: classes2.dex */
final class zzir {
    public static int zza(byte[] bArr, int i, zziq zziqVar) throws zzko {
        int iZzj = zzj(bArr, i, zziqVar);
        int i10 = zziqVar.zza;
        if (i10 < 0) {
            throw zzko.zzd();
        }
        if (i10 > bArr.length - iZzj) {
            throw zzko.zzf();
        }
        if (i10 == 0) {
            zziqVar.zzc = zzjd.zzb;
            return iZzj;
        }
        zziqVar.zzc = zzjd.zzl(bArr, iZzj, i10);
        return iZzj + i10;
    }

    public static int zzb(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int zzc(zzlw zzlwVar, byte[] bArr, int i, int i10, int i11, zziq zziqVar) throws IOException {
        zzlo zzloVar = (zzlo) zzlwVar;
        Object objZze = zzloVar.zze();
        int iZzc = zzloVar.zzc(objZze, bArr, i, i10, i11, zziqVar);
        zzloVar.zzf(objZze);
        zziqVar.zzc = objZze;
        return iZzc;
    }

    public static int zzd(zzlw zzlwVar, byte[] bArr, int i, int i10, zziq zziqVar) throws IOException {
        int iZzk = i + 1;
        int i11 = bArr[i];
        if (i11 < 0) {
            iZzk = zzk(i11, bArr, iZzk, zziqVar);
            i11 = zziqVar.zza;
        }
        int i12 = iZzk;
        if (i11 < 0 || i11 > i10 - i12) {
            throw zzko.zzf();
        }
        Object objZze = zzlwVar.zze();
        int i13 = i12 + i11;
        zzlwVar.zzh(objZze, bArr, i12, i13, zziqVar);
        zzlwVar.zzf(objZze);
        zziqVar.zzc = objZze;
        return i13;
    }

    public static int zze(zzlw zzlwVar, int i, byte[] bArr, int i10, int i11, zzkl zzklVar, zziq zziqVar) throws IOException {
        int iZzd = zzd(zzlwVar, bArr, i10, i11, zziqVar);
        zzklVar.add(zziqVar.zzc);
        while (iZzd < i11) {
            int iZzj = zzj(bArr, iZzd, zziqVar);
            if (i != zziqVar.zza) {
                break;
            }
            iZzd = zzd(zzlwVar, bArr, iZzj, i11, zziqVar);
            zzklVar.add(zziqVar.zzc);
        }
        return iZzd;
    }

    public static int zzf(byte[] bArr, int i, zzkl zzklVar, zziq zziqVar) throws IOException {
        zzkf zzkfVar = (zzkf) zzklVar;
        int iZzj = zzj(bArr, i, zziqVar);
        int i10 = zziqVar.zza + iZzj;
        while (iZzj < i10) {
            iZzj = zzj(bArr, iZzj, zziqVar);
            zzkfVar.zzh(zziqVar.zza);
        }
        if (iZzj == i10) {
            return iZzj;
        }
        throw zzko.zzf();
    }

    public static int zzg(byte[] bArr, int i, zziq zziqVar) throws zzko {
        int iZzj = zzj(bArr, i, zziqVar);
        int i10 = zziqVar.zza;
        if (i10 < 0) {
            throw zzko.zzd();
        }
        if (i10 == 0) {
            zziqVar.zzc = "";
            return iZzj;
        }
        zziqVar.zzc = new String(bArr, iZzj, i10, zzkm.zzb);
        return iZzj + i10;
    }

    public static int zzh(byte[] bArr, int i, zziq zziqVar) throws zzko {
        int iZzj = zzj(bArr, i, zziqVar);
        int i10 = zziqVar.zza;
        if (i10 < 0) {
            throw zzko.zzd();
        }
        if (i10 == 0) {
            zziqVar.zzc = "";
            return iZzj;
        }
        zziqVar.zzc = zznc.zzd(bArr, iZzj, i10);
        return iZzj + i10;
    }

    public static int zzi(int i, byte[] bArr, int i10, int i11, zzmo zzmoVar, zziq zziqVar) throws zzko {
        if ((i >>> 3) == 0) {
            throw zzko.zzb();
        }
        int i12 = i & 7;
        if (i12 == 0) {
            int iZzm = zzm(bArr, i10, zziqVar);
            zzmoVar.zzh(i, Long.valueOf(zziqVar.zzb));
            return iZzm;
        }
        if (i12 == 1) {
            zzmoVar.zzh(i, Long.valueOf(zzn(bArr, i10)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int iZzj = zzj(bArr, i10, zziqVar);
            int i13 = zziqVar.zza;
            if (i13 < 0) {
                throw zzko.zzd();
            }
            if (i13 > bArr.length - iZzj) {
                throw zzko.zzf();
            }
            if (i13 == 0) {
                zzmoVar.zzh(i, zzjd.zzb);
            } else {
                zzmoVar.zzh(i, zzjd.zzl(bArr, iZzj, i13));
            }
            return iZzj + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw zzko.zzb();
            }
            zzmoVar.zzh(i, Integer.valueOf(zzb(bArr, i10)));
            return i10 + 4;
        }
        int i14 = (i & (-8)) | 4;
        zzmo zzmoVarZze = zzmo.zze();
        int i15 = 0;
        while (true) {
            if (i10 >= i11) {
                break;
            }
            int iZzj2 = zzj(bArr, i10, zziqVar);
            i15 = zziqVar.zza;
            if (i15 == i14) {
                i10 = iZzj2;
                break;
            }
            i10 = zzi(i15, bArr, iZzj2, i11, zzmoVarZze, zziqVar);
        }
        if (i10 > i11 || i15 != i14) {
            throw zzko.zze();
        }
        zzmoVar.zzh(i, zzmoVarZze);
        return i10;
    }

    public static int zzj(byte[] bArr, int i, zziq zziqVar) {
        int i10 = i + 1;
        byte b10 = bArr[i];
        if (b10 < 0) {
            return zzk(b10, bArr, i10, zziqVar);
        }
        zziqVar.zza = b10;
        return i10;
    }

    public static int zzk(int i, byte[] bArr, int i10, zziq zziqVar) {
        int i11 = i & 127;
        int i12 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            zziqVar.zza = i11 | (b10 << 7);
            return i12;
        }
        int i13 = i11 | ((b10 & 127) << 7);
        int i14 = i10 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zziqVar.zza = i13 | (b11 << 14);
            return i14;
        }
        int i15 = i13 | ((b11 & 127) << 14);
        int i16 = i10 + 3;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            zziqVar.zza = i15 | (b12 << 21);
            return i16;
        }
        int i17 = i15 | ((b12 & 127) << 21);
        int i18 = i10 + 4;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            zziqVar.zza = i17 | (b13 << 28);
            return i18;
        }
        int i19 = i17 | ((b13 & 127) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                zziqVar.zza = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static int zzl(int i, byte[] bArr, int i10, int i11, zzkl zzklVar, zziq zziqVar) {
        zzkf zzkfVar = (zzkf) zzklVar;
        int iZzj = zzj(bArr, i10, zziqVar);
        zzkfVar.zzh(zziqVar.zza);
        while (iZzj < i11) {
            int iZzj2 = zzj(bArr, iZzj, zziqVar);
            if (i != zziqVar.zza) {
                break;
            }
            iZzj = zzj(bArr, iZzj2, zziqVar);
            zzkfVar.zzh(zziqVar.zza);
        }
        return iZzj;
    }

    public static int zzm(byte[] bArr, int i, zziq zziqVar) {
        int i10 = i + 1;
        long j4 = bArr[i];
        if (j4 >= 0) {
            zziqVar.zzb = j4;
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
        zziqVar.zzb = j10;
        return i11;
    }

    public static long zzn(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }
}

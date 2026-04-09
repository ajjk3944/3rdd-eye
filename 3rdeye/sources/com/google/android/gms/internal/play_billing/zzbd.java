package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
final class zzbd {
    public static int zza(byte[] bArr, int i, zzbc zzbcVar) throws zzdc {
        int iZzh = zzh(bArr, i, zzbcVar);
        int i10 = zzbcVar.zza;
        if (i10 < 0) {
            throw zzdc.zzd();
        }
        if (i10 > bArr.length - iZzh) {
            throw zzdc.zzg();
        }
        if (i10 == 0) {
            zzbcVar.zzc = zzbq.zzb;
            return iZzh;
        }
        zzbcVar.zzc = zzbq.zzl(bArr, iZzh, i10);
        return iZzh + i10;
    }

    public static int zzb(byte[] bArr, int i) {
        int i10 = bArr[i] & 255;
        int i11 = bArr[i + 1] & 255;
        int i12 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public static int zzc(zzeo zzeoVar, byte[] bArr, int i, int i10, int i11, zzbc zzbcVar) throws IOException {
        Object objZze = zzeoVar.zze();
        int iZzl = zzl(objZze, zzeoVar, bArr, i, i10, i11, zzbcVar);
        zzeoVar.zzf(objZze);
        zzbcVar.zzc = objZze;
        return iZzl;
    }

    public static int zzd(zzeo zzeoVar, byte[] bArr, int i, int i10, zzbc zzbcVar) throws IOException {
        Object objZze = zzeoVar.zze();
        int iZzm = zzm(objZze, zzeoVar, bArr, i, i10, zzbcVar);
        zzeoVar.zzf(objZze);
        zzbcVar.zzc = objZze;
        return iZzm;
    }

    public static int zze(zzeo zzeoVar, int i, byte[] bArr, int i10, int i11, zzcz zzczVar, zzbc zzbcVar) throws IOException {
        int iZzd = zzd(zzeoVar, bArr, i10, i11, zzbcVar);
        zzczVar.add(zzbcVar.zzc);
        while (iZzd < i11) {
            int iZzh = zzh(bArr, iZzd, zzbcVar);
            if (i != zzbcVar.zza) {
                break;
            }
            iZzd = zzd(zzeoVar, bArr, iZzh, i11, zzbcVar);
            zzczVar.add(zzbcVar.zzc);
        }
        return iZzd;
    }

    public static int zzf(byte[] bArr, int i, zzcz zzczVar, zzbc zzbcVar) throws IOException {
        zzct zzctVar = (zzct) zzczVar;
        int iZzh = zzh(bArr, i, zzbcVar);
        int i10 = zzbcVar.zza + iZzh;
        while (iZzh < i10) {
            iZzh = zzh(bArr, iZzh, zzbcVar);
            zzctVar.zzg(zzbcVar.zza);
        }
        if (iZzh == i10) {
            return iZzh;
        }
        throw zzdc.zzg();
    }

    public static int zzg(int i, byte[] bArr, int i10, int i11, zzfg zzfgVar, zzbc zzbcVar) throws zzdc {
        if ((i >>> 3) == 0) {
            throw zzdc.zzb();
        }
        int i12 = i & 7;
        if (i12 == 0) {
            int iZzk = zzk(bArr, i10, zzbcVar);
            zzfgVar.zzj(i, Long.valueOf(zzbcVar.zzb));
            return iZzk;
        }
        if (i12 == 1) {
            zzfgVar.zzj(i, Long.valueOf(zzn(bArr, i10)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int iZzh = zzh(bArr, i10, zzbcVar);
            int i13 = zzbcVar.zza;
            if (i13 < 0) {
                throw zzdc.zzd();
            }
            if (i13 > bArr.length - iZzh) {
                throw zzdc.zzg();
            }
            if (i13 == 0) {
                zzfgVar.zzj(i, zzbq.zzb);
            } else {
                zzfgVar.zzj(i, zzbq.zzl(bArr, iZzh, i13));
            }
            return iZzh + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw zzdc.zzb();
            }
            zzfgVar.zzj(i, Integer.valueOf(zzb(bArr, i10)));
            return i10 + 4;
        }
        int i14 = (i & (-8)) | 4;
        zzfg zzfgVarZzf = zzfg.zzf();
        int i15 = 0;
        while (true) {
            if (i10 >= i11) {
                break;
            }
            int iZzh2 = zzh(bArr, i10, zzbcVar);
            i15 = zzbcVar.zza;
            if (i15 == i14) {
                i10 = iZzh2;
                break;
            }
            i10 = zzg(i15, bArr, iZzh2, i11, zzfgVarZzf, zzbcVar);
        }
        if (i10 > i11 || i15 != i14) {
            throw zzdc.zze();
        }
        zzfgVar.zzj(i, zzfgVarZzf);
        return i10;
    }

    public static int zzh(byte[] bArr, int i, zzbc zzbcVar) {
        int i10 = i + 1;
        byte b10 = bArr[i];
        if (b10 < 0) {
            return zzi(b10, bArr, i10, zzbcVar);
        }
        zzbcVar.zza = b10;
        return i10;
    }

    public static int zzi(int i, byte[] bArr, int i10, zzbc zzbcVar) {
        byte b10 = bArr[i10];
        int i11 = i10 + 1;
        int i12 = i & 127;
        if (b10 >= 0) {
            zzbcVar.zza = i12 | (b10 << 7);
            return i11;
        }
        int i13 = i12 | ((b10 & 127) << 7);
        int i14 = i10 + 2;
        byte b11 = bArr[i11];
        if (b11 >= 0) {
            zzbcVar.zza = i13 | (b11 << 14);
            return i14;
        }
        int i15 = i13 | ((b11 & 127) << 14);
        int i16 = i10 + 3;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            zzbcVar.zza = i15 | (b12 << 21);
            return i16;
        }
        int i17 = i15 | ((b12 & 127) << 21);
        int i18 = i10 + 4;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            zzbcVar.zza = i17 | (b13 << 28);
            return i18;
        }
        int i19 = i17 | ((b13 & 127) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                zzbcVar.zza = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static int zzj(int i, byte[] bArr, int i10, int i11, zzcz zzczVar, zzbc zzbcVar) {
        zzct zzctVar = (zzct) zzczVar;
        int iZzh = zzh(bArr, i10, zzbcVar);
        zzctVar.zzg(zzbcVar.zza);
        while (iZzh < i11) {
            int iZzh2 = zzh(bArr, iZzh, zzbcVar);
            if (i != zzbcVar.zza) {
                break;
            }
            iZzh = zzh(bArr, iZzh2, zzbcVar);
            zzctVar.zzg(zzbcVar.zza);
        }
        return iZzh;
    }

    public static int zzk(byte[] bArr, int i, zzbc zzbcVar) {
        long j4 = bArr[i];
        int i10 = i + 1;
        if (j4 >= 0) {
            zzbcVar.zzb = j4;
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
        zzbcVar.zzb = j10;
        return i11;
    }

    public static int zzl(Object obj, zzeo zzeoVar, byte[] bArr, int i, int i10, int i11, zzbc zzbcVar) throws IOException {
        int iZzc = ((zzef) zzeoVar).zzc(obj, bArr, i, i10, i11, zzbcVar);
        zzbcVar.zzc = obj;
        return iZzc;
    }

    public static int zzm(Object obj, zzeo zzeoVar, byte[] bArr, int i, int i10, zzbc zzbcVar) throws IOException {
        int iZzi = i + 1;
        int i11 = bArr[i];
        if (i11 < 0) {
            iZzi = zzi(i11, bArr, iZzi, zzbcVar);
            i11 = zzbcVar.zza;
        }
        int i12 = iZzi;
        if (i11 < 0 || i11 > i10 - i12) {
            throw zzdc.zzg();
        }
        int i13 = i12 + i11;
        zzeoVar.zzh(obj, bArr, i12, i13, zzbcVar);
        zzbcVar.zzc = obj;
        return i13;
    }

    public static long zzn(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }
}

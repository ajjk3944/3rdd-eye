package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.util.Arrays;
import org.xbill.DNS.TTL;

/* loaded from: classes2.dex */
final class zzaqn {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};
    private static final byte[] zzc = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean zza(zzaev zzaevVar) throws IOException {
        zzer zzerVar = new zzer(8);
        int i10 = zzaqm.zza(zzaevVar, zzerVar).zza;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        zzaevVar.zzi(zzerVar.zzi(), 0, 4);
        zzerVar.zzh(0);
        int iZzB = zzerVar.zzB();
        if (iZzB == 1463899717) {
            return true;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iZzB).length() + 23);
        sb.append("Unsupported form type: ");
        sb.append(iZzB);
        zzee.zze("WavHeaderReader", sb.toString());
        return false;
    }

    public static zzaql zzb(zzaev zzaevVar) throws IOException {
        byte[] bArr;
        int i10;
        byte[] bArr2;
        zzer zzerVar = new zzer(16);
        long j10 = zzd(1718449184, zzaevVar, zzerVar).zzb;
        zzgrc.zzi(j10 >= 16);
        zzaevVar.zzi(zzerVar.zzi(), 0, 16);
        zzerVar.zzh(0);
        int iZzu = zzerVar.zzu();
        int iZzu2 = zzerVar.zzu();
        int iZzI = zzerVar.zzI();
        int iZzI2 = zzerVar.zzI();
        int iZzu3 = zzerVar.zzu();
        int iZzu4 = zzerVar.zzu();
        int i11 = ((int) j10) - 16;
        if (i11 > 0) {
            bArr = new byte[i11];
            zzaevVar.zzi(bArr, 0, i11);
            if (iZzu == 65534) {
                if (i11 == 24) {
                    zzer zzerVar2 = new zzer(bArr);
                    zzerVar2.zzu();
                    int iZzu5 = zzerVar2.zzu();
                    if (iZzu5 != 0 && iZzu5 != iZzu4) {
                        StringBuilder sb = new StringBuilder(String.valueOf(iZzu5).length() + 33 + String.valueOf(iZzu4).length() + 19);
                        sb.append("validBits ( ");
                        sb.append(iZzu5);
                        sb.append(")  != bitsPerSample( ");
                        sb.append(iZzu4);
                        sb.append(") are not supported");
                        throw zzat.zzc(sb.toString());
                    }
                    int iZzI3 = zzerVar2.zzI();
                    if ((iZzI3 >> 18) != 0) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzI3).length() + 21);
                        sb2.append("invalid channel mask ");
                        sb2.append(iZzI3);
                        throw zzat.zzc(sb2.toString());
                    }
                    if (iZzI3 != 0 && Integer.bitCount(iZzI3) != iZzu2) {
                        int iBitCount = Integer.bitCount(iZzI3);
                        StringBuilder sb3 = new StringBuilder(String.valueOf(iBitCount).length() + 46 + String.valueOf(iZzI3).length());
                        sb3.append("invalid number of channels (");
                        sb3.append(iBitCount);
                        sb3.append(") in channel mask ");
                        sb3.append(iZzI3);
                        throw zzat.zzc(sb3.toString());
                    }
                    iZzu = zzerVar2.zzu();
                    byte[] bArr3 = new byte[14];
                    zzerVar2.zzm(bArr3, 0, 14);
                    if (!Arrays.equals(bArr3, zzb) && !Arrays.equals(bArr3, zzc)) {
                        throw zzat.zzc("invalid wav format extension guid");
                    }
                } else {
                    bArr2 = bArr;
                    i10 = 65534;
                }
            }
            zzaevVar.zzf((int) (zzaevVar.zzm() - zzaevVar.zzn()));
            return new zzaql(i10, iZzu2, iZzI, iZzI2, iZzu3, iZzu4, bArr2);
        }
        bArr = zzfj.zzb;
        i10 = iZzu;
        bArr2 = bArr;
        zzaevVar.zzf((int) (zzaevVar.zzm() - zzaevVar.zzn()));
        return new zzaql(i10, iZzu2, iZzI, iZzI2, iZzu3, iZzu4, bArr2);
    }

    public static Pair zzc(zzaev zzaevVar) throws IOException {
        zzaevVar.zzl();
        zzaqm zzaqmVarZzd = zzd(1684108385, zzaevVar, new zzer(8));
        zzaevVar.zzf(8);
        return Pair.create(Long.valueOf(zzaevVar.zzn()), Long.valueOf(zzaqmVarZzd.zzb));
    }

    private static zzaqm zzd(int i10, zzaev zzaevVar, zzer zzerVar) throws IOException {
        zzaqm zzaqmVarZza = zzaqm.zza(zzaevVar, zzerVar);
        while (true) {
            int i11 = zzaqmVarZza.zza;
            if (i11 == i10) {
                return zzaqmVarZza;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(i11).length() + 28);
            sb.append("Ignoring unknown WAV chunk: ");
            sb.append(i11);
            zzee.zzc("WavHeaderReader", sb.toString());
            long j10 = zzaqmVarZza.zzb;
            long j11 = 8 + j10;
            if ((1 & j10) != 0) {
                j11 = 9 + j10;
            }
            if (j11 > TTL.MAX_VALUE) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 40);
                sb2.append("Chunk is too large (~2GB+) to skip; id: ");
                sb2.append(i11);
                throw zzat.zzc(sb2.toString());
            }
            zzaevVar.zzf((int) j11);
            zzaqmVarZza = zzaqm.zza(zzaevVar, zzerVar);
        }
    }
}

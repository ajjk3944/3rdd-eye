package com.google.android.gms.internal.ads;

import N7.H7;
import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzaow {
    public static Pair zza(zzadu zzaduVar) throws IOException {
        zzaduVar.zzj();
        zzaov zzaovVarZzd = zzd(1684108385, zzaduVar, new zzen(8));
        zzaduVar.zzk(8);
        return Pair.create(Long.valueOf(zzaduVar.zzf()), Long.valueOf(zzaovVarZzd.zzb));
    }

    public static zzaou zzb(zzadu zzaduVar) throws IOException {
        byte[] bArr;
        zzen zzenVar = new zzen(16);
        long j4 = zzd(1718449184, zzaduVar, zzenVar).zzb;
        zzdd.zzf(j4 >= 16);
        zzaduVar.zzh(zzenVar.zzN(), 0, 16);
        zzenVar.zzL(0);
        int iZzk = zzenVar.zzk();
        int iZzk2 = zzenVar.zzk();
        int iZzj = zzenVar.zzj();
        int iZzj2 = zzenVar.zzj();
        int iZzk3 = zzenVar.zzk();
        int iZzk4 = zzenVar.zzk();
        int i = ((int) j4) - 16;
        if (i > 0) {
            bArr = new byte[i];
            zzaduVar.zzh(bArr, 0, i);
        } else {
            bArr = zzex.zzb;
        }
        byte[] bArr2 = bArr;
        zzaduVar.zzk((int) (zzaduVar.zze() - zzaduVar.zzf()));
        return new zzaou(iZzk, iZzk2, iZzj, iZzj2, iZzk3, iZzk4, bArr2);
    }

    public static boolean zzc(zzadu zzaduVar) throws IOException {
        zzen zzenVar = new zzen(8);
        int i = zzaov.zza(zzaduVar, zzenVar).zza;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        zzaduVar.zzh(zzenVar.zzN(), 0, 4);
        zzenVar.zzL(0);
        int iZzg = zzenVar.zzg();
        if (iZzg == 1463899717) {
            return true;
        }
        zzea.zzc("WavHeaderReader", "Unsupported form type: " + iZzg);
        return false;
    }

    private static zzaov zzd(int i, zzadu zzaduVar, zzen zzenVar) throws IOException {
        zzaov zzaovVarZza = zzaov.zza(zzaduVar, zzenVar);
        while (true) {
            int i10 = zzaovVarZza.zza;
            if (i10 == i) {
                return zzaovVarZza;
            }
            H7.r(i10, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j4 = zzaovVarZza.zzb;
            long j10 = 8 + j4;
            if ((1 & j4) != 0) {
                j10 = 9 + j4;
            }
            if (j10 > 2147483647L) {
                throw zzaz.zzc("Chunk is too large (~2GB+) to skip; id: " + i10);
            }
            zzaduVar.zzk((int) j10);
            zzaovVarZza = zzaov.zza(zzaduVar, zzenVar);
        }
    }
}

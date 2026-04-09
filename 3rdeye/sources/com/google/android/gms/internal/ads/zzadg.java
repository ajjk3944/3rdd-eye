package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzadg {
    public static void zza(long j4, zzen zzenVar, zzaez[] zzaezVarArr) {
        int iZzg;
        while (true) {
            if (zzenVar.zza() <= 1) {
                return;
            }
            int iZzc = zzc(zzenVar);
            int iZzc2 = zzc(zzenVar);
            int iZzc3 = zzenVar.zzc() + iZzc2;
            if (iZzc2 == -1 || iZzc2 > zzenVar.zza()) {
                zzea.zzf("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iZzc3 = zzenVar.zzd();
            } else if (iZzc == 4 && iZzc2 >= 8) {
                int iZzm = zzenVar.zzm();
                int iZzq = zzenVar.zzq();
                if (iZzq == 49) {
                    iZzg = zzenVar.zzg();
                    iZzq = 49;
                } else {
                    iZzg = 0;
                }
                int iZzm2 = zzenVar.zzm();
                if (iZzq == 47) {
                    zzenVar.zzM(1);
                    iZzq = 47;
                }
                boolean z10 = iZzm == 181 && (iZzq == 49 || iZzq == 47) && iZzm2 == 3;
                if (iZzq == 49) {
                    z10 &= iZzg == 1195456820;
                }
                if (z10) {
                    zzb(j4, zzenVar, zzaezVarArr);
                }
            }
            zzenVar.zzL(iZzc3);
        }
    }

    public static void zzb(long j4, zzen zzenVar, zzaez[] zzaezVarArr) {
        int iZzm = zzenVar.zzm();
        if ((iZzm & 64) != 0) {
            int i = iZzm & 31;
            zzenVar.zzM(1);
            int iZzc = zzenVar.zzc();
            for (zzaez zzaezVar : zzaezVarArr) {
                int i10 = i * 3;
                zzenVar.zzL(iZzc);
                zzaezVar.zzr(zzenVar, i10);
                zzdd.zzf(j4 != -9223372036854775807L);
                zzaezVar.zzt(j4, 1, i10, 0, null);
            }
        }
    }

    private static int zzc(zzen zzenVar) {
        int i = 0;
        while (zzenVar.zza() != 0) {
            int iZzm = zzenVar.zzm();
            i += iZzm;
            if (iZzm != 255) {
                return i;
            }
        }
        return -1;
    }
}

package com.google.android.gms.internal.ads;

import N7.C1094a9;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzael {
    public int zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    public zzael() {
    }

    public final boolean zza(int i) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (!zzaem.zzm(i) || (i10 = (i >>> 19) & 3) == 1 || (i11 = (i >>> 17) & 3) == 0 || (i12 = (i >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i14 = i12 - 1;
        this.zza = i10;
        this.zzb = zzaem.zza[3 - i11];
        int i15 = zzaem.zzb[i13];
        this.zzd = i15;
        if (i10 == 2) {
            i15 /= 2;
            this.zzd = i15;
        } else if (i10 == 0) {
            i15 /= 4;
            this.zzd = i15;
        }
        int i16 = (i >>> 9) & 1;
        this.zzg = zzaem.zzl(i10, i11);
        if (i11 == 3) {
            int i17 = i10 == 3 ? zzaem.zzc[i14] : zzaem.zzd[i14];
            this.zzf = i17;
            this.zzc = (((i17 * 12) / i15) + i16) * 4;
        } else {
            if (i10 == 3) {
                int i18 = i11 == 2 ? zzaem.zze[i14] : zzaem.zzf[i14];
                this.zzf = i18;
                this.zzc = C1094a9.d(i18, 144, i15, i16);
            } else {
                int i19 = zzaem.zzg[i14];
                this.zzf = i19;
                this.zzc = C1094a9.d(i11 == 1 ? 72 : 144, i19, i15, i16);
            }
        }
        this.zze = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }

    public zzael(zzael zzaelVar) {
        this.zza = zzaelVar.zza;
        this.zzb = zzaelVar.zzb;
        this.zzc = zzaelVar.zzc;
        this.zzd = zzaelVar.zzd;
        this.zze = zzaelVar.zze;
        this.zzf = zzaelVar.zzf;
        this.zzg = zzaelVar.zzg;
    }
}

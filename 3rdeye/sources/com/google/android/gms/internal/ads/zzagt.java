package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzagt implements zzau {
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final boolean zze;
    public final int zzf;

    public zzagt(int i, String str, String str2, String str3, boolean z10, int i10) {
        boolean z11 = true;
        if (i10 != -1 && i10 <= 0) {
            z11 = false;
        }
        zzdd.zzd(z11);
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z10;
        this.zzf = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagt.class == obj.getClass()) {
            zzagt zzagtVar = (zzagt) obj;
            if (this.zza == zzagtVar.zza && Objects.equals(this.zzb, zzagtVar.zzb) && Objects.equals(this.zzc, zzagtVar.zzc) && Objects.equals(this.zzd, zzagtVar.zzd) && this.zze == zzagtVar.zze && this.zzf == zzagtVar.zzf) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzb;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i = this.zza;
        String str2 = this.zzc;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i10 = ((i + 527) * 31) + iHashCode;
        String str3 = this.zzd;
        return (((((((i10 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.zze ? 1 : 0)) * 31) + this.zzf;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.zzc + "\", genre=\"" + this.zzb + "\", bitrate=" + this.zza + ", metadataInterval=" + this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzau
    public final void zza(zzar zzarVar) {
        String str = this.zzc;
        if (str != null) {
            zzarVar.zzq(str);
        }
        String str2 = this.zzb;
        if (str2 != null) {
            zzarVar.zzj(str2);
        }
    }
}

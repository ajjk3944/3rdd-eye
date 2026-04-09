package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzanb {
    private final zzaez zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;

    public zzanb(zzaez zzaezVar) {
        this.zza = zzaezVar;
    }

    public final void zza(byte[] bArr, int i, int i10) {
        if (this.zzc) {
            int i11 = this.zzf;
            int i12 = (i + 1) - i11;
            if (i12 >= i10) {
                this.zzf = (i10 - i) + i11;
            } else {
                this.zzd = ((bArr[i12] & 192) >> 6) == 0;
                this.zzc = false;
            }
        }
    }

    public final void zzb(long j4, int i, boolean z10) {
        zzdd.zzf(this.zzh != -9223372036854775807L);
        if (this.zze == 182 && z10 && this.zzb) {
            this.zza.zzt(this.zzh, this.zzd ? 1 : 0, (int) (j4 - this.zzg), i, null);
        }
        if (this.zze != 179) {
            this.zzg = j4;
        }
    }

    public final void zzc(int i, long j4) {
        boolean z10;
        this.zze = i;
        this.zzd = false;
        if (i == 182) {
            z10 = true;
        } else if (i == 179) {
            i = 179;
            z10 = true;
        } else {
            z10 = false;
        }
        this.zzb = z10;
        this.zzc = i == 182;
        this.zzf = 0;
        this.zzh = j4;
    }

    public final void zzd() {
        this.zzb = false;
        this.zzc = false;
        this.zzd = false;
        this.zze = -1;
    }
}

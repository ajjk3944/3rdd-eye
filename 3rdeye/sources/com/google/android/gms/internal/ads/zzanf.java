package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzanf {
    private final zzaez zza;
    private long zzb;
    private boolean zzc;
    private int zzd;
    private long zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private long zzk;
    private long zzl;
    private boolean zzm;

    public zzanf(zzaez zzaezVar) {
        this.zza = zzaezVar;
    }

    private final void zze(int i) {
        long j4 = this.zzl;
        if (j4 != -9223372036854775807L) {
            long j10 = this.zzb;
            long j11 = this.zzk;
            if (j10 == j11) {
                return;
            }
            int i10 = (int) (j10 - j11);
            this.zza.zzt(j4, this.zzm ? 1 : 0, i10, i, null);
        }
    }

    public final void zza(long j4, int i, boolean z10) {
        if (this.zzj && this.zzg) {
            this.zzm = this.zzc;
            this.zzj = false;
        } else if (this.zzh || this.zzg) {
            if (z10 && this.zzi) {
                zze(i + ((int) (j4 - this.zzb)));
            }
            this.zzk = this.zzb;
            this.zzl = this.zze;
            this.zzm = this.zzc;
            this.zzi = true;
        }
    }

    public final void zzb(byte[] bArr, int i, int i10) {
        if (this.zzf) {
            int i11 = this.zzd;
            int i12 = (i + 2) - i11;
            if (i12 >= i10) {
                this.zzd = (i10 - i) + i11;
            } else {
                this.zzg = (bArr[i12] & 128) != 0;
                this.zzf = false;
            }
        }
    }

    public final void zzc() {
        this.zzf = false;
        this.zzg = false;
        this.zzh = false;
        this.zzi = false;
        this.zzj = false;
    }

    public final void zzd(long j4, int i, int i10, long j10, boolean z10) {
        this.zzg = false;
        this.zzh = false;
        this.zze = j10;
        this.zzd = 0;
        this.zzb = j4;
        if (i10 >= 32 && i10 != 40) {
            if (this.zzi && !this.zzj) {
                if (z10) {
                    zze(i);
                }
                this.zzi = false;
            }
            if (i10 <= 35 || i10 == 39) {
                this.zzh = !this.zzj;
                this.zzj = true;
            }
        }
        boolean z11 = i10 >= 16 && i10 <= 21;
        this.zzc = z11;
        this.zzf = z11 || i10 <= 9;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzabr {
    private final zzabq zza;
    private final zzabv zzb;
    private boolean zzc;
    private long zzf;
    private boolean zzi;
    private boolean zzl;
    private boolean zzm;
    private int zzd = 0;
    private long zze = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private float zzj = 1.0f;
    private zzdj zzk = zzdj.zza;

    public zzabr(Context context, zzabq zzabqVar, long j4) {
        this.zza = zzabqVar;
        this.zzb = new zzabv(context);
    }

    private final void zzo(int i) {
        this.zzd = Math.min(this.zzd, i);
    }

    public final int zza(long j4, long j10, long j11, long j12, boolean z10, boolean z11, zzabp zzabpVar) throws zzin {
        boolean z12;
        zzabp.zzg(zzabpVar);
        if (this.zzc && this.zze == -9223372036854775807L) {
            this.zze = j10;
        }
        if (this.zzg != j4) {
            this.zzb.zzd(j4);
            this.zzg = j4;
        }
        long jZzs = (long) ((j4 - j10) / this.zzj);
        if (this.zzc) {
            jZzs -= zzex.zzs(this.zzk.zzb()) - j11;
        }
        zzabpVar.zza = jZzs;
        if (z10 && !z11) {
            return 3;
        }
        if (!this.zzl) {
            this.zzm = true;
            if (this.zza.zzaY(zzabpVar.zza, j10, j11, z11, true)) {
                return 4;
            }
            return (!this.zzc || zzabpVar.zza >= 30000) ? 5 : 3;
        }
        long j13 = zzabpVar.zza;
        if (this.zzh == -9223372036854775807L || this.zzi) {
            int i = this.zzd;
            if (i == 0) {
                z12 = false;
                if (this.zzc) {
                    return 0;
                }
            } else {
                if (i == 1) {
                    return 0;
                }
                if (i == 2) {
                    z12 = false;
                    if (j10 >= j12) {
                        return 0;
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException();
                    }
                    z12 = false;
                    long jZzs2 = zzex.zzs(this.zzk.zzb()) - this.zzf;
                    if (this.zzc) {
                        long j14 = this.zze;
                        if (j14 != -9223372036854775807L && j14 != j10 && j13 < -30000 && jZzs2 > 100000) {
                            return 0;
                        }
                    }
                }
            }
        } else {
            z12 = false;
        }
        if (!this.zzc || j10 == this.zze) {
            return 5;
        }
        long jZzc = this.zzk.zzc();
        zzabpVar.zzb = this.zzb.zza((zzabpVar.zza * 1000) + jZzc);
        zzabpVar.zza = (zzabpVar.zzb - jZzc) / 1000;
        boolean z13 = (this.zzh == -9223372036854775807L || this.zzi) ? z12 : true;
        if (this.zza.zzaY(zzabpVar.zza, j10, j11, z11, z13)) {
            return 4;
        }
        return (zzabpVar.zza >= -30000 || z11) ? zzabpVar.zza > 50000 ? 5 : 1 : z13 ? 3 : 2;
    }

    public final void zzb() {
        if (this.zzd == 0) {
            this.zzd = 1;
        }
    }

    public final void zzc(boolean z10) {
        this.zzi = z10;
        this.zzh = -9223372036854775807L;
    }

    public final void zzd() {
        this.zzc = true;
        this.zzf = zzex.zzs(this.zzk.zzb());
        this.zzb.zzg();
    }

    public final void zze() {
        this.zzc = false;
        this.zzh = -9223372036854775807L;
        this.zzb.zzh();
    }

    public final void zzf(int i) {
        if (i == 0) {
            this.zzd = 1;
        } else if (i != 1) {
            zzo(2);
        } else {
            this.zzd = 0;
        }
    }

    public final void zzg() {
        this.zzb.zzf();
        this.zzg = -9223372036854775807L;
        this.zze = -9223372036854775807L;
        zzo(1);
        this.zzh = -9223372036854775807L;
    }

    public final void zzh(int i) {
        this.zzb.zzj(i);
    }

    public final void zzi(zzdj zzdjVar) {
        this.zzk = zzdjVar;
    }

    public final void zzj(float f10) {
        this.zzb.zzc(f10);
    }

    public final void zzk(Surface surface) {
        this.zzl = surface != null;
        this.zzm = false;
        this.zzb.zzi(surface);
        zzo(1);
    }

    public final void zzl(float f10) {
        zzdd.zzd(f10 > 0.0f);
        if (f10 == this.zzj) {
            return;
        }
        this.zzj = f10;
        this.zzb.zze(f10);
    }

    public final boolean zzm(boolean z10) {
        if (z10 && (this.zzd == 3 || (!this.zzl && this.zzm))) {
            this.zzh = -9223372036854775807L;
            return true;
        }
        if (this.zzh == -9223372036854775807L) {
            return false;
        }
        if (this.zzk.zzb() < this.zzh) {
            return true;
        }
        this.zzh = -9223372036854775807L;
        return false;
    }

    public final boolean zzn() {
        int i = this.zzd;
        this.zzd = 3;
        this.zzf = zzex.zzs(this.zzk.zzb());
        return i != 3;
    }
}

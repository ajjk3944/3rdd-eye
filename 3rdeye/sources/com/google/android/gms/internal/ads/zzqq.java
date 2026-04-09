package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzqq {
    private final zzqp zza;
    private final int zzb;
    private final zzqr zzc;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;

    public zzqq(AudioTrack audioTrack, zzqr zzqrVar) {
        this.zza = new zzqp(audioTrack);
        this.zzb = audioTrack.getSampleRate();
        this.zzc = zzqrVar;
        zzh(0);
    }

    private final long zzf(long j4, float f10) {
        zzqp zzqpVar = this.zza;
        return zzg(zzqpVar.zza(), zzqpVar.zzb(), j4, f10);
    }

    private final long zzg(long j4, long j10, long j11, float f10) {
        long j12 = j11 - j10;
        return zzex.zzq(j12, f10) + zzex.zzt(j4, this.zzb);
    }

    private final void zzh(int i) {
        this.zzd = i;
        long j4 = 10000;
        if (i == 0) {
            this.zzg = 0L;
            this.zzh = -1L;
            this.zzi = -9223372036854775807L;
            this.zze = System.nanoTime() / 1000;
        } else {
            if (i == 1) {
                this.zzf = 10000L;
                return;
            }
            j4 = (i == 2 || i == 3) ? 10000000L : 500000L;
        }
        this.zzf = j4;
    }

    public final long zza(long j4, float f10) {
        return zzf(j4, f10);
    }

    public final void zzb(long j4, float f10, long j10) {
        if (j4 - this.zzg < this.zzf) {
            return;
        }
        this.zzg = j4;
        zzqp zzqpVar = this.zza;
        boolean zZzc = zzqpVar.zzc();
        if (zZzc) {
            long jZzb = zzqpVar.zzb();
            long jZzf = zzf(j4, f10);
            if (Math.abs(jZzb - j4) > 5000000) {
                this.zzc.zzd(zzqpVar.zza(), jZzb, j4, j10);
                zzh(4);
            } else if (Math.abs(jZzf - j10) > 5000000) {
                this.zzc.zzc(zzqpVar.zza(), jZzb, j4, j10);
                zzh(4);
            } else if (this.zzd == 4) {
                zzh(0);
            }
        }
        int i = this.zzd;
        if (i == 0) {
            if (!zZzc) {
                if (j4 - this.zze > 500000) {
                    zzh(3);
                    return;
                }
                return;
            } else {
                if (zzqpVar.zzb() >= this.zze) {
                    this.zzh = zzqpVar.zza();
                    this.zzi = zzqpVar.zzb();
                    zzh(1);
                    return;
                }
                return;
            }
        }
        if (i != 1) {
            if (i == 2) {
                if (zZzc) {
                    return;
                }
                zzh(0);
                return;
            } else {
                if (i == 3 && zZzc) {
                    zzh(0);
                    return;
                }
                return;
            }
        }
        if (!zZzc) {
            zzh(0);
            return;
        }
        long jZza = zzqpVar.zza();
        long j11 = this.zzh;
        if (jZza > j11) {
            if (Math.abs(zzf(j4, f10) - zzg(j11, this.zzi, j4, f10)) < 1000) {
                zzh(2);
                return;
            }
        }
        if (j4 - this.zze > 2000000) {
            zzh(3);
        } else {
            this.zzh = zzqpVar.zza();
            this.zzi = zzqpVar.zzb();
        }
    }

    public final void zzc() {
        zzh(0);
    }

    public final boolean zzd() {
        return this.zzd == 2;
    }

    public final boolean zze() {
        int i = this.zzd;
        return i == 0 || i == 1;
    }
}

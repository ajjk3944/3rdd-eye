package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzand {
    private final zzaez zza;
    private final SparseArray zzb = new SparseArray();
    private final SparseArray zzc = new SparseArray();
    private final byte[] zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private boolean zzl;

    public zzand(zzaez zzaezVar, boolean z10, boolean z11) {
        this.zza = zzaezVar;
        byte[] bArr = new byte[128];
        this.zzd = bArr;
        new zzfw(bArr, 0, 0);
        this.zzh = false;
    }

    public final void zza(zzft zzftVar) {
        this.zzc.append(zzftVar.zza, zzftVar);
    }

    public final void zzb(zzfu zzfuVar) {
        this.zzb.append(zzfuVar.zzd, zzfuVar);
    }

    public final void zzc() {
        this.zzh = false;
    }

    public final void zzd(long j4, int i, long j10, boolean z10) {
        this.zze = i;
        this.zzg = j10;
        this.zzf = j4;
        this.zzl = z10;
    }

    public final boolean zze(long j4, int i, boolean z10) {
        boolean z11 = false;
        if (this.zze == 9) {
            if (z10 && this.zzh) {
                long j10 = this.zzf;
                int i10 = i + ((int) (j4 - j10));
                long j11 = this.zzj;
                if (j11 != -9223372036854775807L) {
                    long j12 = this.zzi;
                    if (j10 != j12) {
                        this.zza.zzt(j11, this.zzk ? 1 : 0, (int) (j10 - j12), i10, null);
                    }
                }
            }
            this.zzi = this.zzf;
            this.zzj = this.zzg;
            this.zzk = false;
            this.zzh = true;
        }
        boolean z12 = this.zzl;
        boolean z13 = this.zzk;
        int i11 = this.zze;
        if (i11 == 5 || (z12 && i11 == 1)) {
            z11 = true;
        }
        boolean z14 = z13 | z11;
        this.zzk = z14;
        this.zze = 24;
        return z14;
    }
}

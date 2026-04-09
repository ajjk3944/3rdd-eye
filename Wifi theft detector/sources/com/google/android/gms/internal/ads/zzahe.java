package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
final class zzahe extends zzaeg {
    public zzahe(final zzafh zzafhVar, int i10, long j10, long j11) {
        long j12;
        Objects.requireNonNull(zzafhVar);
        zzaed zzaedVar = new zzaed() { // from class: com.google.android.gms.internal.ads.zzahc
            @Override // com.google.android.gms.internal.ads.zzaed
            public final /* synthetic */ long zza(long j13) {
                return zzafhVar.zzb(j13);
            }
        };
        zzahd zzahdVar = new zzahd(zzafhVar, i10, null);
        long jZza = zzafhVar.zza();
        long j13 = zzafhVar.zzj;
        int i11 = zzafhVar.zzd;
        if (i11 > 0) {
            j12 = ((i11 + zzafhVar.zzc) / 2) + 1;
        } else {
            int i12 = zzafhVar.zza;
            long j14 = 4096;
            if (i12 == zzafhVar.zzb && i12 > 0) {
                j14 = i12;
            }
            j12 = 64 + (((j14 * zzafhVar.zzg) * zzafhVar.zzh) / 8);
        }
        super(zzaedVar, zzahdVar, jZza, 0L, j13, j10, j11, j12, Math.max(6, zzafhVar.zzc));
    }
}

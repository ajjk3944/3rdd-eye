package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzafx extends zzadf {
    public zzafx(final zzaee zzaeeVar, int i, long j4, long j10) {
        long j11;
        Objects.requireNonNull(zzaeeVar);
        zzadc zzadcVar = new zzadc() { // from class: com.google.android.gms.internal.ads.zzafu
            @Override // com.google.android.gms.internal.ads.zzadc
            public final long zza(long j12) {
                return zzaeeVar.zzb(j12);
            }
        };
        zzafv zzafvVar = new zzafv(zzaeeVar, i, null);
        long jZza = zzaeeVar.zza();
        long j12 = zzaeeVar.zzj;
        int i10 = zzaeeVar.zzd;
        if (i10 > 0) {
            j11 = ((i10 + zzaeeVar.zzc) / 2) + 1;
        } else {
            int i11 = zzaeeVar.zza;
            long j13 = 4096;
            if (i11 == zzaeeVar.zzb && i11 > 0) {
                j13 = i11;
            }
            j11 = 64 + (((j13 * zzaeeVar.zzg) * zzaeeVar.zzh) / 8);
        }
        super(zzadcVar, zzafvVar, jZza, 0L, j12, j4, j10, j11, Math.max(6, zzaeeVar.zzc));
    }
}

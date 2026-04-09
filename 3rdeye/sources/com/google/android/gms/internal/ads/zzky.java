package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzky {
    private long zza;
    private float zzb;
    private long zzc;

    public zzky() {
        this.zza = -9223372036854775807L;
        this.zzb = -3.4028235E38f;
        this.zzc = -9223372036854775807L;
    }

    public final zzky zzd(long j4) {
        boolean z10 = true;
        if (j4 < 0) {
            if (j4 == -9223372036854775807L) {
                j4 = -9223372036854775807L;
            } else {
                z10 = false;
            }
        }
        zzdd.zzd(z10);
        this.zzc = j4;
        return this;
    }

    public final zzky zze(long j4) {
        this.zza = j4;
        return this;
    }

    public final zzky zzf(float f10) {
        boolean z10 = true;
        if (f10 <= 0.0f && f10 != -3.4028235E38f) {
            z10 = false;
        }
        zzdd.zzd(z10);
        this.zzb = f10;
        return this;
    }

    public final zzla zzg() {
        return new zzla(this, null);
    }

    public /* synthetic */ zzky(zzla zzlaVar, zzkz zzkzVar) {
        this.zza = zzlaVar.zza;
        this.zzb = zzlaVar.zzb;
        this.zzc = zzlaVar.zzc;
    }
}

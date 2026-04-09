package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfez {
    private final long zza;
    private long zzc;
    private final zzfey zzb = new zzfey();
    private int zzd = 0;
    private int zze = 0;
    private int zzf = 0;

    public zzfez() {
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis();
        this.zza = jCurrentTimeMillis;
        this.zzc = jCurrentTimeMillis;
    }

    public final int zza() {
        return this.zzd;
    }

    public final long zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final zzfey zzd() {
        zzfey zzfeyVar = this.zzb;
        zzfey zzfeyVarClone = zzfeyVar.clone();
        zzfeyVar.zza = false;
        zzfeyVar.zzb = 0;
        return zzfeyVarClone;
    }

    public final String zze() {
        return "Created: " + this.zza + " Last accessed: " + this.zzc + " Accesses: " + this.zzd + "\nEntries retrieved: Valid: " + this.zze + " Stale: " + this.zzf;
    }

    public final void zzf() {
        this.zzc = com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis();
        this.zzd++;
    }

    public final void zzg() {
        this.zzf++;
        this.zzb.zzb++;
    }

    public final void zzh() {
        this.zze++;
        this.zzb.zza = true;
    }
}

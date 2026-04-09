package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzaik {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzen zzf;
    private final zzen zzg;
    private int zzh;
    private int zzi;

    public zzaik(zzen zzenVar, zzen zzenVar2, boolean z10) throws zzaz {
        this.zzg = zzenVar;
        this.zzf = zzenVar2;
        this.zze = z10;
        zzenVar2.zzL(12);
        this.zza = zzenVar2.zzp();
        zzenVar.zzL(12);
        this.zzi = zzenVar.zzp();
        zzadx.zzb(zzenVar.zzg() == 1, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        int i = this.zzb + 1;
        this.zzb = i;
        if (i == this.zza) {
            return false;
        }
        this.zzd = this.zze ? this.zzf.zzw() : this.zzf.zzu();
        if (this.zzb == this.zzh) {
            zzen zzenVar = this.zzg;
            this.zzc = zzenVar.zzp();
            zzenVar.zzM(4);
            int i10 = this.zzi - 1;
            this.zzi = i10;
            this.zzh = i10 > 0 ? (-1) + zzenVar.zzp() : -1;
        }
        return true;
    }
}

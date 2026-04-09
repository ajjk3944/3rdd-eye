package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzciu {
    private zzchc zza;
    private zzcjo zzb;
    private zzfgw zzc;
    private zzckb zzd;
    private zzfdq zze;

    private zzciu() {
        throw null;
    }

    public final zzcgz zza() {
        zzhgg.zzc(this.zza, zzchc.class);
        zzhgg.zzc(this.zzb, zzcjo.class);
        if (this.zzc == null) {
            this.zzc = new zzfgw();
        }
        if (this.zzd == null) {
            this.zzd = new zzckb();
        }
        if (this.zze == null) {
            this.zze = new zzfdq();
        }
        return new zzcij(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final zzciu zzb(zzchc zzchcVar) {
        this.zza = zzchcVar;
        return this;
    }

    public final zzciu zzc(zzcjo zzcjoVar) {
        this.zzb = zzcjoVar;
        return this;
    }

    public /* synthetic */ zzciu(zzcjn zzcjnVar) {
    }
}

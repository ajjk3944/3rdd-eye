package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbio {
    private final com.google.android.gms.ads.formats.zzg zza;
    private final com.google.android.gms.ads.formats.zzf zzb;
    private zzbhi zzc;

    public zzbio(com.google.android.gms.ads.formats.zzg zzgVar, com.google.android.gms.ads.formats.zzf zzfVar) {
        this.zza = zzgVar;
        this.zzb = zzfVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized zzbhi zzf(zzbhh zzbhhVar) {
        zzbhi zzbhiVar = this.zzc;
        if (zzbhiVar != null) {
            return zzbhiVar;
        }
        zzbhi zzbhiVar2 = new zzbhi(zzbhhVar);
        this.zzc = zzbhiVar2;
        return zzbhiVar2;
    }

    public final zzbhr zzc() {
        zzbin zzbinVar = null;
        if (this.zzb == null) {
            return null;
        }
        return new zzbil(this, zzbinVar);
    }

    public final zzbhu zzd() {
        return new zzbim(this, null);
    }
}

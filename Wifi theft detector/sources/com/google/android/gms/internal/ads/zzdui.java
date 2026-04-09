package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzdui implements zzikg {
    private final zzikp zza;

    private zzdui(zzikp zzikpVar) {
        this.zza = zzikpVar;
    }

    public static zzdui zza(zzikp zzikpVar) {
        return new zzdui(zzikpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((zzdaw) this.zza).zza().zzp.zza == 3 ? "rewarded_interstitial" : com.vungle.ads.internal.b.PLACEMENT_TYPE_REWARDED;
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeab {
    private final zzbvi zza;

    public zzeab(zzbvi zzbviVar) {
        this.zza = zzbviVar;
    }

    public final void zza() {
        A4.a aVarZza = this.zza.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhU)).booleanValue()) {
            zzcag.zzb(aVarZza, "persistFlags");
        } else {
            zzcag.zza(aVarZza, "persistFlags");
        }
    }
}

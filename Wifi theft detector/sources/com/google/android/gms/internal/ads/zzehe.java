package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzehe {
    private final zzbzn zza;

    public zzehe(zzbzn zzbznVar) {
        this.zza = zzbznVar;
    }

    public final void zza() {
        com.google.common.util.concurrent.a aVarZza = this.zza.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziL)).booleanValue()) {
            zzcel.zzb(aVarZza, "persistFlags");
        } else {
            zzcel.zza(aVarZza, "persistFlags");
        }
    }
}

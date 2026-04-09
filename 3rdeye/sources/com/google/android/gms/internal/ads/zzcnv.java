package com.google.android.gms.internal.ads;

import com.singular.sdk.internal.SingularParamsBase;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcnv {
    private final zzdsc zza;
    private final zzfcf zzb;

    public zzcnv(zzdsc zzdscVar, zzfcf zzfcfVar) {
        this.zza = zzdscVar;
        this.zzb = zzfcfVar;
    }

    public final void zza(long j4, int i) {
        zzdsb zzdsbVarZza = this.zza.zza();
        zzdsbVarZza.zzd(this.zzb.zzb.zzb);
        zzdsbVarZza.zzb("action", "ad_closed");
        zzdsbVarZza.zzb("show_time", String.valueOf(j4));
        zzdsbVarZza.zzb("ad_format", "app_open_ad");
        int i10 = i - 1;
        zzdsbVarZza.zzb("acr", i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? SingularParamsBase.Constants.IDENTIFIER_UNIQUE_ID_KEY : "ac" : "cb" : "cc" : "bb" : "h");
        zzdsbVarZza.zzj();
    }
}

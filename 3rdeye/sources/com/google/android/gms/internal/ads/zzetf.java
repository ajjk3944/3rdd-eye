package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzetf implements zzett {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final Long zze;

    public zzetf(String str, String str2, String str3, String str4, Long l5) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = l5;
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzfdc.zzc(((zzcut) obj).zzb, "fbs_aeid", this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcut) obj).zza;
        zzfdc.zzc(bundle, "gmp_app_id", this.zza);
        zzfdc.zzc(bundle, "fbs_aiid", this.zzb);
        zzfdc.zzc(bundle, "fbs_aeid", this.zzc);
        zzfdc.zzc(bundle, "apm_id_origin", this.zzd);
        Long l5 = this.zze;
        if (l5 != null) {
            bundle.putLong("sai_timeout", l5.longValue());
        }
    }
}

package com.google.android.gms.internal.ads;

import android.view.View;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdjo {
    private final zzdsc zza;

    public zzdjo(zzdsc zzdscVar) {
        this.zza = zzdscVar;
    }

    public final void zza(View view, zzfbt zzfbtVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zznc)).booleanValue() || view == null) {
            return;
        }
        String str = true != com.google.android.gms.ads.internal.util.zzac.zza(view) ? CommonUrlParts.Values.FALSE_INTEGER : "1";
        zzdsb zzdsbVarZza = this.zza.zza();
        zzdsbVarZza.zzb("action", "hcp");
        zzdsbVarZza.zzb("hcp", str);
        zzdsbVarZza.zzc(zzfbtVar);
        zzdsbVarZza.zzj();
    }
}

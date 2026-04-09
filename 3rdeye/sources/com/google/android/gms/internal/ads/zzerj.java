package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzerj implements zzetu {
    private final Context zza;
    private final Intent zzb;

    public zzerj(Context context, Intent intent) {
        this.zza = context;
        this.zzb = intent;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 60;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final A4.a zzb() {
        com.google.android.gms.ads.internal.util.zze.zza("HsdpMigrationSignal.produce");
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzmY)).booleanValue()) {
            return zzgdb.zzh(new zzerk(null));
        }
        boolean z10 = false;
        try {
            if (this.zzb.resolveActivity(this.zza.getPackageManager()) != null) {
                com.google.android.gms.ads.internal.util.zze.zza("HSDP intent is supported");
                z10 = true;
            }
        } catch (Exception e4) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "HsdpMigrationSignal.isHsdpMigrationSupported");
        }
        return zzgdb.zzh(new zzerk(Boolean.valueOf(z10)));
    }
}

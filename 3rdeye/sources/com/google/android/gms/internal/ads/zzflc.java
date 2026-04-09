package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzflc {
    private boolean zza;

    public final void zza(Context context) {
        zzfmz.zzc(context, "Application Context cannot be null");
        if (this.zza) {
            return;
        }
        this.zza = true;
        zzfmh.zzb().zzd(context);
        zzfly.zza().zzd(context);
        zzfmu.zzb(context);
        zzfmv.zzd(context);
        zzfmy.zza(context);
        zzfme.zzb().zzc(context);
        zzflx.zza().zzd(context);
        zzfmj.zza().zze(context);
    }

    public final boolean zzb() {
        return this.zza;
    }
}

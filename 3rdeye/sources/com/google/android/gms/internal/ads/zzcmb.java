package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcmb implements zzcwm {
    private final zzfdm zza;

    public zzcmb(zzfdm zzfdmVar) {
        this.zza = zzfdmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdj(Context context) {
        try {
            this.zza.zzg();
        } catch (zzfcv e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Cannot invoke onDestroy for the mediation adapter.", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdl(Context context) {
        try {
            this.zza.zzt();
        } catch (zzfcv e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Cannot invoke onPause for the mediation adapter.", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdm(Context context) {
        try {
            zzfdm zzfdmVar = this.zza;
            zzfdmVar.zzu();
            if (context != null) {
                zzfdmVar.zzs(context);
            }
        } catch (zzfcv e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Cannot invoke onResume for the mediation adapter.", e4);
        }
    }
}

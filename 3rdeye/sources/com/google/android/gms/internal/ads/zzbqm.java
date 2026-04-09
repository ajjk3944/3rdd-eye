package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.NativeAdMapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzbqm implements MediationAdLoadCallback {
    final /* synthetic */ zzbpu zza;
    final /* synthetic */ zzbqp zzb;

    public zzbqm(zzbqp zzbqpVar, zzbpu zzbpuVar) {
        this.zza = zzbpuVar;
        this.zzb = zzbqpVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            com.google.android.gms.ads.internal.util.client.zzo.zze(this.zzb.zza.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + adError.getCode() + ". ErrorMessage = " + adError.getMessage() + ". ErrorDomain = " + adError.getDomain());
            zzbpu zzbpuVar = this.zza;
            zzbpuVar.zzh(adError.zza());
            zzbpuVar.zzi(adError.getCode(), adError.getMessage());
            zzbpuVar.zzg(adError.getCode());
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e4);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        try {
            this.zzb.zzh = (NativeAdMapper) obj;
            this.zza.zzo();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e4);
        }
        return new zzbqf(this.zza);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        onFailure(new AdError(0, str, "undefined"));
    }
}

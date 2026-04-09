package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.1.1 */
/* loaded from: classes2.dex */
final class zzo implements zzgy {
    public final com.google.android.gms.internal.measurement.zzci zza;
    final /* synthetic */ AppMeasurementDynamiteService zzb;

    public zzo(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzci zzciVar) {
        this.zzb = appMeasurementDynamiteService;
        this.zza = zzciVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final void interceptEvent(String str, String str2, Bundle bundle, long j4) {
        try {
            this.zza.zze(str, str2, bundle, j4);
        } catch (RemoteException e4) {
            zzfy zzfyVar = this.zzb.zza;
            if (zzfyVar != null) {
                zzfyVar.zzay().zzk().zzb("Event interceptor threw exception", e4);
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzbbg implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzbbi zza;

    public zzbbg(zzbbi zzbbiVar) {
        this.zza = zzbbiVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzbbi zzbbiVar = this.zza;
        synchronized (zzbbiVar.zzc) {
            try {
            } catch (DeadObjectException e4) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to obtain a cache service instance.", e4);
                zzbbi.zzh(this.zza);
            }
            if (zzbbiVar.zzd != null) {
                zzbbiVar.zzf = zzbbiVar.zzd.zzq();
                this.zza.zzc.notifyAll();
            } else {
                this.zza.zzc.notifyAll();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        zzbbi zzbbiVar = this.zza;
        synchronized (zzbbiVar.zzc) {
            zzbbiVar.zzf = null;
            zzbbiVar.zzc.notifyAll();
        }
    }
}

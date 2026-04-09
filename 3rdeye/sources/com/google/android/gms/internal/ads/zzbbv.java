package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzbbv implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzcai zza;
    final /* synthetic */ zzbbw zzb;

    public zzbbv(zzbbw zzbbwVar, zzcai zzcaiVar) {
        this.zza = zzcaiVar;
        this.zzb = zzbbwVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (this.zzb.zzd) {
            this.zza.zzd(new RuntimeException("Connection failed."));
        }
    }
}

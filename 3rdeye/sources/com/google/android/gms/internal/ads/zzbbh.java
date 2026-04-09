package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzbbh implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzbbi zza;

    public zzbbh(zzbbi zzbbiVar) {
        this.zza = zzbbiVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zzbbi zzbbiVar = this.zza;
        synchronized (zzbbiVar.zzc) {
            try {
                zzbbiVar.zzf = null;
                if (zzbbiVar.zzd != null) {
                    zzbbiVar.zzd = null;
                }
                zzbbiVar.zzc.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

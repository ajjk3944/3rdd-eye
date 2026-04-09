package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes.dex */
final class zzfl implements Runnable {
    final /* synthetic */ zzfm zza;

    public zzfl(zzfm zzfmVar) {
        this.zza = zzfmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfm zzfmVar = this.zza;
        if (zzfmVar.zza != null) {
            try {
                zzfmVar.zza.zze(1);
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not notify onAdFailedToLoad event.", e4);
            }
        }
    }
}

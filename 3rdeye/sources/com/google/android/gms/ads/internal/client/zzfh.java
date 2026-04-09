package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes.dex */
final class zzfh implements Runnable {
    final /* synthetic */ zzfi zza;

    public zzfh(zzfi zzfiVar) {
        this.zza = zzfiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfk zzfkVar = this.zza.zza;
        if (zzfkVar.zza != null) {
            try {
                zzfkVar.zza.zze(1);
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not notify onAdFailedToLoad event.", e4);
            }
        }
    }
}

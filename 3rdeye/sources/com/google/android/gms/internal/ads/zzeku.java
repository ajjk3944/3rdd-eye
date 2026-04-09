package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeku implements com.google.android.gms.ads.internal.client.zza, zzddw {
    private com.google.android.gms.ads.internal.client.zzbh zza;

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        com.google.android.gms.ads.internal.client.zzbh zzbhVar = this.zza;
        if (zzbhVar != null) {
            try {
                zzbhVar.zzb();
            } catch (RemoteException e4) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Remote Exception at onAdClicked.", e4);
            }
        }
    }

    public final synchronized void zza(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zza = zzbhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final synchronized void zzdf() {
        com.google.android.gms.ads.internal.client.zzbh zzbhVar = this.zza;
        if (zzbhVar != null) {
            try {
                zzbhVar.zzb();
            } catch (RemoteException e4) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Remote Exception at onPhysicalClick.", e4);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final synchronized void zzu() {
    }
}

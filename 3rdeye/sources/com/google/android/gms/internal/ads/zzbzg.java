package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzbzg implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzcai zzb;

    public zzbzg(zzbzh zzbzhVar, Context context, zzcai zzcaiVar) {
        this.zza = context;
        this.zzb = zzcaiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzc(AdvertisingIdClient.getAdvertisingIdInfo(this.zza));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e4) {
            this.zzb.zzd(e4);
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception while getting advertising Id info", e4);
        }
    }
}

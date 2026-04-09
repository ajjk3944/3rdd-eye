package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfjx extends zzfkv {
    public zzfjx(ClientApi clientApi, Context context, int i, zzbpo zzbpoVar, com.google.android.gms.ads.internal.client.zzfv zzfvVar, com.google.android.gms.ads.internal.client.zzce zzceVar, ScheduledExecutorService scheduledExecutorService, zzfjy zzfjyVar, Clock clock) {
        super(clientApi, context, i, zzbpoVar, zzfvVar, zzceVar, scheduledExecutorService, zzfjyVar, clock);
    }

    @Override // com.google.android.gms.internal.ads.zzfkv
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzea zza(Object obj) {
        try {
            return ((zzbau) obj).zzf();
        } catch (RemoteException e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get response info for the app open ad.", e4);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfkv
    public final A4.a zzb(Context context) {
        zzgdv zzgdvVarZze = zzgdv.zze();
        com.google.android.gms.ads.internal.client.zzbx zzbxVarZzc = this.zza.zzc(ObjectWrapper.wrap(context), com.google.android.gms.ads.internal.client.zzr.zzb(), this.zze.zza, this.zzd, this.zzc);
        if (zzbxVarZzc == null) {
            zzgdvVarZze.zzd(new zzfjs(1, "Failed to create an app open ad manager."));
            return zzgdvVarZze;
        }
        try {
            zzbxVarZzc.zzH(new zzfjw(this, zzgdvVarZze, this.zze));
            zzbxVarZzc.zzab(this.zze.zzc);
            return zzgdvVarZze;
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to load app open ad.", e4);
            zzgdvVarZze.zzd(new zzfjs(1, "remote exception"));
            return zzgdvVarZze;
        }
    }

    public zzfjx(String str, ClientApi clientApi, Context context, int i, zzbpo zzbpoVar, com.google.android.gms.ads.internal.client.zzfv zzfvVar, com.google.android.gms.ads.internal.client.zzch zzchVar, ScheduledExecutorService scheduledExecutorService, zzfjy zzfjyVar, Clock clock) {
        super(str, clientApi, context, i, zzbpoVar, zzfvVar, zzchVar, scheduledExecutorService, zzfjyVar, clock);
    }
}

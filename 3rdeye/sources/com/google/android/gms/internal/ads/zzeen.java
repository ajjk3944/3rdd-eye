package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzeen extends zzbra {
    final /* synthetic */ zzeep zza;
    private final zzedh zzb;

    public /* synthetic */ zzeen(zzeep zzeepVar, zzedh zzedhVar, zzeeo zzeeoVar) {
        this.zza = zzeepVar;
        this.zzb = zzedhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrb
    public final void zze(String str) throws RemoteException {
        ((zzeev) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbrb
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzeev) this.zzb.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbrb
    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        this.zza.zzc = (View) ObjectWrapper.unwrap(iObjectWrapper);
        ((zzeev) this.zzb.zzc).zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbrb
    public final void zzh(zzbpx zzbpxVar) throws RemoteException {
        this.zza.zzd = zzbpxVar;
        ((zzeev) this.zzb.zzc).zzo();
    }
}

package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzefx extends zzbrg {
    final /* synthetic */ zzefz zza;
    private final zzedh zzb;

    public /* synthetic */ zzefx(zzefz zzefzVar, zzedh zzedhVar, zzefy zzefyVar) {
        this.zza = zzefzVar;
        this.zzb = zzedhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zze(String str) throws RemoteException {
        ((zzeev) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzeev) this.zzb.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzg(zzbqd zzbqdVar) throws RemoteException {
        this.zza.zzc = zzbqdVar;
        ((zzeev) this.zzb.zzc).zzo();
    }
}

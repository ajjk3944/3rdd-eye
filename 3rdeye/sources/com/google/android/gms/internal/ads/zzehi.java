package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzehi extends zzbrj {
    private final zzedh zza;

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zze(String str) throws RemoteException {
        ((zzeev) this.zza.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzeev) this.zza.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbrk
    public final void zzg() throws RemoteException {
        ((zzeev) this.zza.zzc).zzo();
    }
}

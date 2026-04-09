package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdtt implements zzdtd {
    private final long zza;
    private final zzdti zzb;
    private final zzfbk zzc;

    public zzdtt(long j4, Context context, zzdti zzdtiVar, zzcgz zzcgzVar, String str) {
        this.zza = j4;
        this.zzb = zzdtiVar;
        zzfbm zzfbmVarZzv = zzcgzVar.zzv();
        zzfbmVarZzv.zzb(context);
        zzfbmVarZzv.zza(str);
        this.zzc = zzfbmVarZzv.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzdtd
    public final void zzb(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        try {
            this.zzc.zzg(zzmVar, new zzdtr(this));
        } catch (RemoteException e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdtd
    public final void zzc() {
        try {
            zzfbk zzfbkVar = this.zzc;
            zzfbkVar.zzl(new zzdts(this));
            zzfbkVar.zzn(ObjectWrapper.wrap(null));
        } catch (RemoteException e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdtd
    public final void zza() {
    }
}

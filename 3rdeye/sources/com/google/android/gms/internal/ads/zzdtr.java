package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzdtr extends zzbwz {
    final /* synthetic */ zzdtt zza;

    public zzdtr(zzdtt zzdttVar) {
        this.zza = zzdttVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxa
    public final void zze(int i) throws JSONException, RemoteException {
        zzdtt zzdttVar = this.zza;
        zzdttVar.zzb.zzm(zzdttVar.zza, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbxa
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws JSONException, RemoteException {
        zzdtt zzdttVar = this.zza;
        zzdttVar.zzb.zzm(zzdttVar.zza, zzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxa
    public final void zzg() throws JSONException, RemoteException {
        zzdtt zzdttVar = this.zza;
        zzdttVar.zzb.zzp(zzdttVar.zza);
    }
}

package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzdts extends zzbwv {
    final /* synthetic */ zzdtt zza;

    public zzdts(zzdtt zzdttVar) {
        this.zza = zzdttVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zze() throws JSONException, RemoteException {
        zzdtt zzdttVar = this.zza;
        zzdttVar.zzb.zzj(zzdttVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzf() throws JSONException, RemoteException {
        zzdtt zzdttVar = this.zza;
        zzdttVar.zzb.zzo(zzdttVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzg() throws JSONException, RemoteException {
        zzdtt zzdttVar = this.zza;
        zzdttVar.zzb.zzk(zzdttVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzh(int i) throws JSONException, RemoteException {
        zzdtt zzdttVar = this.zza;
        zzdttVar.zzb.zzn(zzdttVar.zza, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) throws JSONException, RemoteException {
        zzdtt zzdttVar = this.zza;
        zzdttVar.zzb.zzn(zzdttVar.zza, zzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzj() throws JSONException, RemoteException {
        zzdtt zzdttVar = this.zza;
        zzdttVar.zzb.zzr(zzdttVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzk(zzbwq zzbwqVar) throws JSONException, RemoteException {
        zzdtt zzdttVar = this.zza;
        zzdttVar.zzb.zzl(zzdttVar.zza, zzbwqVar);
    }
}

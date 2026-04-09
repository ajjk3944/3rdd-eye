package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;
import org.json.JSONException;

/* loaded from: classes2.dex */
final class zzdzs extends com.google.android.gms.ads.internal.client.zzbj {
    final /* synthetic */ zzdzm zza;
    final /* synthetic */ zzdzt zzb;

    public zzdzs(zzdzt zzdztVar, zzdzm zzdzmVar) {
        this.zza = zzdzmVar;
        Objects.requireNonNull(zzdztVar);
        this.zzb = zzdztVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzb() throws JSONException, RemoteException {
        this.zza.zzi(this.zzb.zzd());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzc(int i10) throws JSONException, RemoteException {
        this.zza.zzf(this.zzb.zzd(), i10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) throws JSONException, RemoteException {
        this.zza.zzf(this.zzb.zzd(), zzeVar.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzf() throws JSONException, RemoteException {
        this.zza.zze(this.zzb.zzd());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzg() throws JSONException, RemoteException {
        this.zza.zzg(this.zzb.zzd());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzh() throws JSONException, RemoteException {
        this.zza.zzh(this.zzb.zzd());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzi() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzj() {
    }
}

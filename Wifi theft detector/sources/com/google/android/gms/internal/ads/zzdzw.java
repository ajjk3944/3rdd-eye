package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;
import org.json.JSONException;

/* loaded from: classes2.dex */
final class zzdzw extends zzcbb {
    final /* synthetic */ zzdzx zza;

    public zzdzw(zzdzx zzdzxVar) {
        Objects.requireNonNull(zzdzxVar);
        this.zza = zzdzxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zze() throws JSONException, RemoteException {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzm(zzdzxVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zzf() throws JSONException, RemoteException {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzo(zzdzxVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zzg(zzcaw zzcawVar) throws JSONException, RemoteException {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzp(zzdzxVar.zzd(), zzcawVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zzh(int i10) throws JSONException, RemoteException {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzn(zzdzxVar.zzd(), i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) throws JSONException, RemoteException {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzn(zzdzxVar.zzd(), zzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zzj() throws JSONException, RemoteException {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzq(zzdzxVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zzk() throws JSONException, RemoteException {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzr(zzdzxVar.zzd());
    }
}

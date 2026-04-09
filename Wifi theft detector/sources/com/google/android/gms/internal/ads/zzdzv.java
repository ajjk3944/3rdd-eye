package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;
import org.json.JSONException;

/* loaded from: classes2.dex */
final class zzdzv extends zzcbf {
    final /* synthetic */ zzdzx zza;

    public zzdzv(zzdzx zzdzxVar) {
        Objects.requireNonNull(zzdzxVar);
        this.zza = zzdzxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zze() throws JSONException, RemoteException {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzk(zzdzxVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzf(int i10) throws JSONException, RemoteException {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzl(zzdzxVar.zzd(), i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws JSONException, RemoteException {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzl(zzdzxVar.zzd(), zzeVar.zza);
    }
}

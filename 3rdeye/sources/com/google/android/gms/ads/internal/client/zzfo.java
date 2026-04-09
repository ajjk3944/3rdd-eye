package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbmi;
import com.google.android.gms.internal.ads.zzbpo;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes.dex */
public final class zzfo extends zzda {
    private zzbmi zza;

    public static /* synthetic */ void zzb(zzfo zzfoVar) {
        zzbmi zzbmiVar = zzfoVar.zza;
        if (zzbmiVar != null) {
            try {
                zzbmiVar.zzb(Collections.EMPTY_LIST);
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not notify onComplete event.", e4);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final float zze() throws RemoteException {
        return 1.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final String zzf() {
        return "";
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final List zzg() throws RemoteException {
        return Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzk() throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.zzg("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzfn
            @Override // java.lang.Runnable
            public final void run() {
                zzfo.zzb(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzs(zzbmi zzbmiVar) throws RemoteException {
        this.zza = zzbmiVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final boolean zzv() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzi() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzh(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzj(boolean z10) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzm(zzdn zzdnVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzo(zzbpo zzbpoVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzp(boolean z10) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzq(float f10) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzr(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzt(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzu(zzfx zzfxVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzl(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzdb
    public final void zzn(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
    }
}

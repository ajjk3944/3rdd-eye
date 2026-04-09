package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbqs extends zzbpt {
    private final Adapter zza;
    private final zzbwl zzb;

    public zzbqs(Adapter adapter, zzbwl zzbwlVar) {
        this.zza = adapter;
        this.zzb = zzbwlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zze() throws RemoteException {
        zzbwl zzbwlVar = this.zzb;
        if (zzbwlVar != null) {
            zzbwlVar.zze(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzf() throws RemoteException {
        zzbwl zzbwlVar = this.zzb;
        if (zzbwlVar != null) {
            zzbwlVar.zzf(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzg(int i) throws RemoteException {
        zzbwl zzbwlVar = this.zzb;
        if (zzbwlVar != null) {
            zzbwlVar.zzg(ObjectWrapper.wrap(this.zza), i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzo() throws RemoteException {
        zzbwl zzbwlVar = this.zzb;
        if (zzbwlVar != null) {
            zzbwlVar.zzi(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzp() throws RemoteException {
        zzbwl zzbwlVar = this.zzb;
        if (zzbwlVar != null) {
            zzbwlVar.zzj(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzt(zzbwq zzbwqVar) throws RemoteException {
        zzbwl zzbwlVar = this.zzb;
        if (zzbwlVar != null) {
            zzbwlVar.zzm(ObjectWrapper.wrap(this.zza), new zzbwm(zzbwqVar.zzf(), zzbwqVar.zze()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzu() throws RemoteException {
        zzbwl zzbwlVar = this.zzb;
        if (zzbwlVar != null) {
            zzbwlVar.zzn(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzv() throws RemoteException {
        zzbwl zzbwlVar = this.zzb;
        if (zzbwlVar != null) {
            zzbwlVar.zzo(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzz() throws RemoteException {
        zzbwl zzbwlVar = this.zzb;
        if (zzbwlVar != null) {
            zzbwlVar.zzp(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzm() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzn() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzw() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzx() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzy() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzj(int i) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzl(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzs(zzbwm zzbwmVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzi(int i, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzq(String str, String str2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final void zzr(zzbhh zzbhhVar, String str) throws RemoteException {
    }
}

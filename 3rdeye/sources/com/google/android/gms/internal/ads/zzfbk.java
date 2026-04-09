package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfbk extends zzbws {
    private final zzfbg zza;
    private final zzfaw zzb;
    private final String zzc;
    private final zzfcg zzd;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private final zzavs zzg;
    private final zzdsc zzh;
    private zzdog zzi;
    private boolean zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzaQ)).booleanValue();

    public zzfbk(String str, zzfbg zzfbgVar, Context context, zzfaw zzfawVar, zzfcg zzfcgVar, VersionInfoParcel versionInfoParcel, zzavs zzavsVar, zzdsc zzdscVar) {
        this.zzc = str;
        this.zza = zzfbgVar;
        this.zzb = zzfawVar;
        this.zzd = zzfcgVar;
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzg = zzavsVar;
        this.zzh = zzdscVar;
    }

    private final synchronized void zzv(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbxa zzbxaVar, int i) throws RemoteException {
        try {
            if (!zzmVar.zzb()) {
                boolean z10 = false;
                if (((Boolean) zzbfa.zzk.zze()).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzlu)).booleanValue()) {
                        z10 = true;
                    }
                }
                if (this.zzf.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzlv)).intValue() || !z10) {
                    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
                }
            }
            zzfaw zzfawVar = this.zzb;
            zzfawVar.zzk(zzbxaVar);
            com.google.android.gms.ads.internal.zzv.zzr();
            if (com.google.android.gms.ads.internal.util.zzs.zzI(this.zze) && zzmVar.zzs == null) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to load the ad because app ID is missing.");
                zzfawVar.zzdD(zzfdp.zzd(4, null, null));
                return;
            }
            if (this.zzi != null) {
                return;
            }
            zzfay zzfayVar = new zzfay(null);
            zzfbg zzfbgVar = this.zza;
            zzfbgVar.zzj(i);
            zzfbgVar.zzb(zzmVar, this.zzc, zzfayVar, new zzfbj(this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final Bundle zzb() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdog zzdogVar = this.zzi;
        return zzdogVar != null ? zzdogVar.zza() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final com.google.android.gms.ads.internal.client.zzea zzc() {
        zzdog zzdogVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgR)).booleanValue() && (zzdogVar = this.zzi) != null) {
            return zzdogVar.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final zzbwq zzd() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdog zzdogVar = this.zzi;
        if (zzdogVar != null) {
            return zzdogVar.zzc();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final String zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final synchronized String zzf() throws RemoteException {
        zzdog zzdogVar = this.zzi;
        if (zzdogVar == null || zzdogVar.zzl() == null) {
            return null;
        }
        return zzdogVar.zzl().zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final synchronized void zzg(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbxa zzbxaVar) throws RemoteException {
        zzv(zzmVar, zzbxaVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbxa zzbxaVar) throws RemoteException {
        zzv(zzmVar, zzbxaVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final synchronized void zzi(boolean z10) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzj = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzj(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        if (zzdqVar == null) {
            this.zzb.zzg(null);
        } else {
            this.zzb.zzg(new zzfbi(this, zzdqVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzk(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdtVar.zzf()) {
                this.zzh.zze();
            }
        } catch (RemoteException e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Error in making CSI ping for reporting paid event callback", e4);
        }
        this.zzb.zzi(zzdtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzl(zzbww zzbwwVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzj(zzbwwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final synchronized void zzm(zzbxh zzbxhVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzfcg zzfcgVar = this.zzd;
        zzfcgVar.zza = zzbxhVar.zza;
        zzfcgVar.zzb = zzbxhVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final synchronized void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzo(iObjectWrapper, this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final synchronized void zzo(IObjectWrapper iObjectWrapper, boolean z10) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzi == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Rewarded can not be shown before loaded");
            this.zzb.zzr(zzfdp.zzd(9, null, null));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzdb)).booleanValue()) {
                this.zzg.zzc().zzn(new Throwable().getStackTrace());
            }
            this.zzi.zzh(z10, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final boolean zzp() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdog zzdogVar = this.zzi;
        return (zzdogVar == null || zzdogVar.zzf()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzq(zzbxb zzbxbVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzo(zzbxbVar);
    }
}

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcoi extends zzbat {
    private final zzcoh zza;
    private final com.google.android.gms.ads.internal.client.zzbx zzb;
    private final zzexr zzc;
    private boolean zzd = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzaT)).booleanValue();
    private final zzdsc zze;

    public zzcoi(zzcoh zzcohVar, com.google.android.gms.ads.internal.client.zzbx zzbxVar, zzexr zzexrVar, zzdsc zzdscVar) {
        this.zza = zzcohVar;
        this.zzb = zzbxVar;
        this.zzc = zzexrVar;
        this.zze = zzdscVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final com.google.android.gms.ads.internal.client.zzbx zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final com.google.android.gms.ads.internal.client.zzea zzf() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgR)).booleanValue()) {
            return this.zza.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final String zzg() {
        try {
            return this.zzb.zzr();
        } catch (RemoteException e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final void zzh(boolean z10) {
        this.zzd = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final void zzi(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        if (this.zzc != null) {
            try {
                if (!zzdtVar.zzf()) {
                    this.zze.zze();
                }
            } catch (RemoteException e4) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Error in making CSI ping for reporting paid event callback", e4);
            }
            this.zzc.zzn(zzdtVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final void zzj(IObjectWrapper iObjectWrapper, zzbbb zzbbbVar) {
        try {
            this.zzc.zzp(zzbbbVar);
            this.zza.zzd((Activity) ObjectWrapper.unwrap(iObjectWrapper), zzbbbVar, this.zzd);
        } catch (RemoteException e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
        }
    }
}

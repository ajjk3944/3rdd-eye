package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdnb extends zzbig {
    private final String zza;
    private final zzdih zzb;
    private final zzdim zzc;
    private final zzdsc zzd;

    public zzdnb(String str, zzdih zzdihVar, zzdim zzdimVar, zzdsc zzdscVar) {
        this.zza = str;
        this.zzb = zzdihVar;
        this.zzc = zzdimVar;
        this.zzd = zzdscVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzA() {
        this.zzb.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzB(Bundle bundle) throws JSONException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzng)).booleanValue()) {
            this.zzb.zzI(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzC(Bundle bundle) throws RemoteException {
        this.zzb.zzM(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzD() {
        this.zzb.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzE(com.google.android.gms.ads.internal.client.zzdf zzdfVar) throws RemoteException {
        this.zzb.zzP(zzdfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzF(com.google.android.gms.ads.internal.client.zzdt zzdtVar) throws RemoteException {
        try {
            if (!zzdtVar.zzf()) {
                this.zzd.zze();
            }
        } catch (RemoteException e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Error in making CSI ping for reporting paid event callback", e4);
        }
        this.zzb.zzQ(zzdtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzG(zzbie zzbieVar) throws RemoteException {
        this.zzb.zzR(zzbieVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final boolean zzH() {
        return this.zzb.zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final boolean zzI() throws RemoteException {
        zzdim zzdimVar = this.zzc;
        return (zzdimVar.zzH().isEmpty() || zzdimVar.zzk() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final boolean zzJ(Bundle bundle) throws RemoteException {
        return this.zzb.zzZ(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final double zze() throws RemoteException {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final Bundle zzf() throws RemoteException {
        return this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final com.google.android.gms.ads.internal.client.zzea zzg() throws RemoteException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgR)).booleanValue()) {
            return this.zzb.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final com.google.android.gms.ads.internal.client.zzed zzh() throws RemoteException {
        return this.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final zzbgg zzi() throws RemoteException {
        return this.zzc.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final zzbgk zzj() throws RemoteException {
        return this.zzb.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final zzbgn zzk() throws RemoteException {
        return this.zzc.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final IObjectWrapper zzl() throws RemoteException {
        return this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final IObjectWrapper zzm() throws RemoteException {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final String zzn() throws RemoteException {
        return this.zzc.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final String zzo() throws RemoteException {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final String zzp() throws RemoteException {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final String zzq() throws RemoteException {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final String zzr() throws RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final String zzs() throws RemoteException {
        return this.zzc.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final String zzt() throws RemoteException {
        return this.zzc.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final List zzu() throws RemoteException {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final List zzv() throws RemoteException {
        return zzI() ? this.zzc.zzH() : Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzw() throws RemoteException {
        this.zzb.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzx() throws RemoteException {
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzy(com.google.android.gms.ads.internal.client.zzdj zzdjVar) throws RemoteException {
        this.zzb.zzC(zzdjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final void zzz(Bundle bundle) throws RemoteException {
        this.zzb.zzG(bundle);
    }
}

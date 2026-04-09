package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeyf implements zzelg {
    private final Context zza;
    private final Executor zzb;
    private final zzcgz zzc;
    private final zzekq zzd;
    private final zzeku zze;
    private final ViewGroup zzf;
    private zzbdx zzg;
    private final zzcyo zzh;
    private final zzfhp zzi;
    private final zzdau zzj;
    private final zzfcm zzk;
    private A4.a zzl;
    private boolean zzm;
    private com.google.android.gms.ads.internal.client.zze zzn;
    private zzelf zzo;

    public zzeyf(Context context, Executor executor, com.google.android.gms.ads.internal.client.zzr zzrVar, zzcgz zzcgzVar, zzekq zzekqVar, zzeku zzekuVar, zzfcm zzfcmVar, zzdau zzdauVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcgzVar;
        this.zzd = zzekqVar;
        this.zze = zzekuVar;
        this.zzk = zzfcmVar;
        this.zzh = zzcgzVar.zze();
        this.zzi = zzcgzVar.zzy();
        this.zzf = new FrameLayout(context);
        this.zzj = zzdauVar;
        zzfcmVar.zzs(zzrVar);
        this.zzm = true;
        this.zzn = null;
        this.zzo = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzt() {
        this.zzl = null;
        final com.google.android.gms.ads.internal.client.zze zzeVar = this.zzn;
        this.zzn = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzis)).booleanValue() && zzeVar != null) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyb
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzd.zzdD(zzeVar);
                }
            });
        }
        zzelf zzelfVar = this.zzo;
        if (zzelfVar != null) {
            zzelfVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final boolean zza() {
        A4.a aVar = this.zzl;
        return (aVar == null || aVar.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzele zzeleVar, zzelf zzelfVar) throws JSONException, RemoteException {
        zzcps zzcpsVarZzk;
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Ad unit ID should not be null for banner ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyd
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzd.zzdD(zzfdp.zzd(6, null, null));
                }
            });
            return false;
        }
        if (!zza()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjg)).booleanValue() && zzmVar.zzf) {
                this.zzc.zzk().zzo(true);
            }
            Bundle bundleZza = zzdrm.zza(new Pair(zzdrk.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar.zzz)), new Pair(zzdrk.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis())));
            zzfcm zzfcmVar = this.zzk;
            zzfcmVar.zzt(str);
            zzfcmVar.zzH(zzmVar);
            zzfcmVar.zzA(bundleZza);
            Context context = this.zza;
            zzfco zzfcoVarZzJ = zzfcmVar.zzJ();
            zzfhb zzfhbVarZzb = zzfha.zzb(context, zzfhl.zzf(zzfcoVarZzJ), 3, zzmVar);
            zzfhm zzfhmVarZzh = null;
            if (!((Boolean) zzbfi.zzd.zze()).booleanValue() || !zzfcmVar.zzh().zzk) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzis)).booleanValue()) {
                    zzcpr zzcprVarZzd = this.zzc.zzd();
                    zzcuy zzcuyVar = new zzcuy();
                    zzcuyVar.zzf(context);
                    zzcuyVar.zzk(zzfcoVarZzJ);
                    zzcprVarZzd.zzi(zzcuyVar.zzl());
                    zzdbn zzdbnVar = new zzdbn();
                    zzekq zzekqVar = this.zzd;
                    Executor executor = this.zzb;
                    zzdbnVar.zzj(zzekqVar, executor);
                    zzdbnVar.zzk(zzekqVar, executor);
                    zzcprVarZzd.zzf(zzdbnVar.zzn());
                    zzcprVarZzd.zze(new zzeiz(this.zzg));
                    zzcprVarZzd.zzd(new zzdgp(zzdix.zza, null));
                    zzcprVarZzd.zzg(new zzcqn(this.zzh, this.zzj));
                    zzcprVarZzd.zzc(new zzcok(this.zzf));
                    zzcpsVarZzk = zzcprVarZzd.zzh();
                } else {
                    zzcpr zzcprVarZzd2 = this.zzc.zzd();
                    zzcuy zzcuyVar2 = new zzcuy();
                    zzcuyVar2.zzf(context);
                    zzcuyVar2.zzk(zzfcoVarZzJ);
                    zzcprVarZzd2.zzi(zzcuyVar2.zzl());
                    zzdbn zzdbnVar2 = new zzdbn();
                    zzekq zzekqVar2 = this.zzd;
                    Executor executor2 = this.zzb;
                    zzdbnVar2.zzj(zzekqVar2, executor2);
                    zzdbnVar2.zza(zzekqVar2, executor2);
                    zzdbnVar2.zza(this.zze, executor2);
                    zzdbnVar2.zzl(zzekqVar2, executor2);
                    zzdbnVar2.zzd(zzekqVar2, executor2);
                    zzdbnVar2.zze(zzekqVar2, executor2);
                    zzdbnVar2.zzf(zzekqVar2, executor2);
                    zzdbnVar2.zzb(zzekqVar2, executor2);
                    zzdbnVar2.zzk(zzekqVar2, executor2);
                    zzdbnVar2.zzi(zzekqVar2, executor2);
                    zzcprVarZzd2.zzf(zzdbnVar2.zzn());
                    zzcprVarZzd2.zze(new zzeiz(this.zzg));
                    zzcprVarZzd2.zzd(new zzdgp(zzdix.zza, null));
                    zzcprVarZzd2.zzg(new zzcqn(this.zzh, this.zzj));
                    zzcprVarZzd2.zzc(new zzcok(this.zzf));
                    zzcpsVarZzk = zzcprVarZzd2.zzh();
                }
                if (((Boolean) zzbev.zzc.zze()).booleanValue()) {
                    zzfhmVarZzh = zzcpsVarZzk.zzh();
                    zzfhmVarZzh.zzi(3);
                    zzfhmVarZzh.zzb(zzmVar.zzp);
                    zzfhmVarZzh.zzf(zzmVar.zzm);
                }
                this.zzo = zzelfVar;
                zzcrz zzcrzVarZzc = zzcpsVarZzk.zzc();
                A4.a aVarZzh = zzcrzVarZzc.zzh(zzcrzVarZzc.zzi());
                this.zzl = aVarZzh;
                zzgdb.zzr(aVarZzh, new zzeye(this, zzfhmVarZzh, zzfhbVarZzb, zzcpsVarZzk), this.zzb);
                return true;
            }
            zzekq zzekqVar3 = this.zzd;
            if (zzekqVar3 != null) {
                zzekqVar3.zzdD(zzfdp.zzd(7, null, null));
            }
        } else if (!this.zzk.zzS()) {
            this.zzm = true;
        }
        return false;
    }

    public final ViewGroup zzc() {
        return this.zzf;
    }

    public final zzfcm zzf() {
        return this.zzk;
    }

    public final void zzl() {
        this.zzh.zzd(this.zzj.zzc());
    }

    public final void zzm() {
        this.zzh.zze(this.zzj.zzd());
    }

    public final void zzn(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zze.zza(zzbhVar);
    }

    public final void zzo(zzcyi zzcyiVar) {
        this.zzh.zzo(zzcyiVar, this.zzb);
    }

    public final void zzp(zzbdx zzbdxVar) {
        this.zzg = zzbdxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzq() {
        synchronized (this) {
            try {
                A4.a aVar = this.zzl;
                if (aVar != null && aVar.isDone()) {
                    try {
                        zzcon zzconVar = (zzcon) this.zzl.get();
                        this.zzl = null;
                        ViewGroup viewGroup = this.zzf;
                        viewGroup.removeAllViews();
                        zzconVar.zzd();
                        ViewParent parent = zzconVar.zzd().getParent();
                        if (parent instanceof ViewGroup) {
                            String str = "Banner view provided from " + (zzconVar.zzl() != null ? zzconVar.zzl().zzg() : "") + " already has a parent view. Removing its old parent.";
                            int i = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzj(str);
                            ((ViewGroup) parent).removeView(zzconVar.zzd());
                        }
                        zzbct zzbctVar = zzbdc.zzis;
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbctVar)).booleanValue()) {
                            zzdac zzdacVarZzn = zzconVar.zzn();
                            zzdacVarZzn.zza(this.zzd);
                            zzdacVarZzn.zzc(this.zze);
                        }
                        viewGroup.addView(zzconVar.zzd());
                        zzelf zzelfVar = this.zzo;
                        if (zzelfVar != null) {
                            zzelfVar.zzb(zzconVar);
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbctVar)).booleanValue()) {
                            Executor executor = this.zzb;
                            final zzekq zzekqVar = this.zzd;
                            Objects.requireNonNull(zzekqVar);
                            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyc
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzekqVar.zzt();
                                }
                            });
                        }
                        if (zzconVar.zza() >= 0) {
                            this.zzm = false;
                            zzcyo zzcyoVar = this.zzh;
                            zzcyoVar.zzd(zzconVar.zza());
                            zzcyoVar.zze(zzconVar.zzc());
                        } else {
                            this.zzm = true;
                            this.zzh.zzd(zzconVar.zzc());
                        }
                    } catch (InterruptedException e4) {
                        e = e4;
                        zzt();
                        com.google.android.gms.ads.internal.util.zze.zzb("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.zzm = true;
                        this.zzh.zza();
                    } catch (ExecutionException e10) {
                        e = e10;
                        zzt();
                        com.google.android.gms.ads.internal.util.zze.zzb("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.zzm = true;
                        this.zzh.zza();
                    }
                } else if (this.zzl != null) {
                    com.google.android.gms.ads.internal.util.zze.zza("Show timer went off but there is an ongoing ad request.");
                    this.zzm = true;
                } else {
                    com.google.android.gms.ads.internal.util.zze.zza("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                    this.zzm = true;
                    this.zzh.zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzs() {
        Object parent = this.zzf.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        com.google.android.gms.ads.internal.zzv.zzr();
        return com.google.android.gms.ads.internal.util.zzs.zzX(view, view.getContext());
    }
}

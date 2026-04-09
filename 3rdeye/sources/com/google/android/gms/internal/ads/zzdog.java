package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdog extends zzcqv {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdgg zze;
    private final zzdda zzf;
    private final zzcwe zzg;
    private final zzcxl zzh;
    private final zzcrq zzi;
    private final zzbwq zzj;
    private final zzfok zzk;
    private final zzfch zzl;
    private boolean zzm;

    public zzdog(zzcqu zzcquVar, Context context, zzcfe zzcfeVar, zzdgg zzdggVar, zzdda zzddaVar, zzcwe zzcweVar, zzcxl zzcxlVar, zzcrq zzcrqVar, zzfbt zzfbtVar, zzfok zzfokVar, zzfch zzfchVar) {
        super(zzcquVar);
        this.zzm = false;
        this.zzc = context;
        this.zze = zzdggVar;
        this.zzd = new WeakReference(zzcfeVar);
        this.zzf = zzddaVar;
        this.zzg = zzcweVar;
        this.zzh = zzcxlVar;
        this.zzi = zzcrqVar;
        this.zzk = zzfokVar;
        zzbwm zzbwmVar = zzfbtVar.zzl;
        this.zzj = new zzbxk(zzbwmVar != null ? zzbwmVar.zza : "", zzbwmVar != null ? zzbwmVar.zzb : 1);
        this.zzl = zzfchVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcfe zzcfeVar = (zzcfe) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzgP)).booleanValue()) {
                if (!this.zzm && zzcfeVar != null) {
                    zzcad.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdof
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcfeVar.destroy();
                        }
                    });
                }
            } else if (zzcfeVar != null) {
                zzcfeVar.destroy();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public final Bundle zza() {
        return this.zzh.zzb();
    }

    public final zzbwq zzc() {
        return this.zzj;
    }

    public final zzfch zzd() {
        return this.zzl;
    }

    public final boolean zze() {
        return this.zzi.zzg();
    }

    public final boolean zzf() {
        return this.zzm;
    }

    public final boolean zzg() {
        zzcfe zzcfeVar = (zzcfe) this.zzd.get();
        return (zzcfeVar == null || zzcfeVar.zzaG()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.content.Context] */
    public final boolean zzh(boolean z10, Activity activity) {
        com.google.android.gms.ads.internal.zzv.zzr();
        zzdgg zzdggVar = this.zze;
        if (!com.google.android.gms.ads.internal.util.zzs.zzO(zzdggVar.zza())) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzaO)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzr();
                if (com.google.android.gms.ads.internal.util.zzs.zzH(this.zzc)) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                    this.zzg.zzd();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzaP)).booleanValue()) {
                        this.zzk.zza(this.zza.zzb.zzb.zzb);
                    }
                    return false;
                }
            }
        }
        if (this.zzm) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("The rewarded ad have been showed.");
            this.zzg.zzc(zzfdp.zzd(10, null, null));
            return false;
        }
        this.zzm = true;
        zzdda zzddaVar = this.zzf;
        zzddaVar.zzb();
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.zzc;
        }
        try {
            zzdggVar.zzb(z10, activity2, this.zzg);
            zzddaVar.zza();
            return true;
        } catch (zzdgf e4) {
            this.zzg.zze(e4);
            return false;
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzcoq extends zzcon {
    private final Context zzc;
    private final View zzd;
    private final zzcfe zze;
    private final zzfbu zzf;
    private final zzcqt zzg;
    private final zzdix zzh;
    private final zzddy zzi;
    private final zzhfs zzj;
    private final Executor zzk;
    private com.google.android.gms.ads.internal.client.zzr zzl;

    public zzcoq(zzcqu zzcquVar, Context context, zzfbu zzfbuVar, View view, zzcfe zzcfeVar, zzcqt zzcqtVar, zzdix zzdixVar, zzddy zzddyVar, zzhfs zzhfsVar, Executor executor) {
        super(zzcquVar);
        this.zzc = context;
        this.zzd = view;
        this.zze = zzcfeVar;
        this.zzf = zzfbuVar;
        this.zzg = zzcqtVar;
        this.zzh = zzdixVar;
        this.zzi = zzddyVar;
        this.zzj = zzhfsVar;
        this.zzk = executor;
    }

    public static /* synthetic */ void zzj(zzcoq zzcoqVar) {
        zzbhy zzbhyVarZze = zzcoqVar.zzh.zze();
        if (zzbhyVarZze == null) {
            return;
        }
        try {
            zzbhyVarZze.zze((com.google.android.gms.ads.internal.client.zzbx) zzcoqVar.zzj.zzb(), ObjectWrapper.wrap(zzcoqVar.zzc));
        } catch (RemoteException e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("RemoteException when notifyAdLoad is called", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcon
    public final int zza() {
        return this.zza.zzb.zzb.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcon
    public final int zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzic)).booleanValue() && this.zzb.zzag) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzid)).booleanValue()) {
                return 0;
            }
        }
        return this.zza.zzb.zzb.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcon
    public final View zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcon
    public final com.google.android.gms.ads.internal.client.zzed zze() {
        try {
            return this.zzg.zza();
        } catch (zzfcv unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcon
    public final zzfbu zzf() {
        com.google.android.gms.ads.internal.client.zzr zzrVar = this.zzl;
        if (zzrVar != null) {
            return zzfcu.zzb(zzrVar);
        }
        zzfbt zzfbtVar = this.zzb;
        if (zzfbtVar.zzac) {
            for (String str : zzfbtVar.zza) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.zzd;
            return new zzfbu(view.getWidth(), view.getHeight(), false);
        }
        return (zzfbu) zzfbtVar.zzr.get(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcon
    public final zzfbu zzg() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcon
    public final void zzh() {
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcon
    public final void zzi(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        zzcfe zzcfeVar;
        if (viewGroup == null || (zzcfeVar = this.zze) == null) {
            return;
        }
        zzcfeVar.zzaj(zzcgy.zzc(zzrVar));
        viewGroup.setMinimumHeight(zzrVar.zzc);
        viewGroup.setMinimumWidth(zzrVar.zzf);
        this.zzl = zzrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqv
    public final void zzk() {
        this.zzk.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcop
            @Override // java.lang.Runnable
            public final void run() {
                zzcoq.zzj(this.zza);
            }
        });
        super.zzk();
    }
}

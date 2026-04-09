package com.google.android.gms.internal.ads;

import N7.C1154e9;
import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeef implements zzede {
    private final zzcps zza;
    private final Context zzb;
    private final zzdpc zzc;
    private final zzfco zzd;
    private final Executor zze;
    private final zzfut zzf;
    private final zzdrw zzg;

    public zzeef(zzcps zzcpsVar, Context context, Executor executor, zzdpc zzdpcVar, zzfco zzfcoVar, zzfut zzfutVar, zzdrw zzdrwVar) {
        this.zzb = context;
        this.zza = zzcpsVar;
        this.zze = executor;
        this.zzc = zzdpcVar;
        this.zzd = zzfcoVar;
        this.zzf = zzfutVar;
        this.zzg = zzdrwVar;
    }

    public static /* synthetic */ A4.a zzc(final zzeef zzeefVar, zzfcf zzfcfVar, zzfbt zzfbtVar, Object obj) throws zzcfq {
        zzbct zzbctVar = zzbdc.zzcr;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbctVar)).booleanValue()) {
            C1154e9.l(zzeefVar.zzg.zza(), zzdrk.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        Context context = zzeefVar.zzb;
        com.google.android.gms.ads.internal.client.zzr zzrVarZza = zzfcu.zza(context, zzfbtVar.zzu);
        final zzcfe zzcfeVarZza = zzeefVar.zzc.zza(zzrVarZza, zzfbtVar, zzfcfVar.zzb.zzb);
        zzcfeVarZza.zzac(zzfbtVar.zzW);
        View viewZza = (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzic)).booleanValue() && zzfbtVar.zzag) ? zzcqh.zza(context, zzcfeVarZza.zzF(), zzfbtVar) : new zzdpf(context, zzcfeVarZza.zzF(), (com.google.android.gms.ads.internal.util.zzau) zzeefVar.zzf.apply(zzfbtVar));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbctVar)).booleanValue()) {
            C1154e9.l(zzeefVar.zzg.zza(), zzdrk.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        final zzcoo zzcooVarZza = zzeefVar.zza.zza(new zzcrl(zzfcfVar, zzfbtVar, null), new zzcou(viewZza, zzcfeVarZza, new zzcqt() { // from class: com.google.android.gms.internal.ads.zzedz
            @Override // com.google.android.gms.internal.ads.zzcqt
            public final com.google.android.gms.ads.internal.client.zzed zza() {
                return zzcfeVarZza.zzq();
            }
        }, zzfcu.zzb(zzrVarZza)));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbctVar)).booleanValue()) {
            C1154e9.l(zzeefVar.zzg.zza(), zzdrk.RENDERING_AD_COMPONENT_CREATION_END.zza());
        }
        zzdpb zzdpbVarZzi = zzcooVarZza.zzi();
        zzdrw zzdrwVar = zzeefVar.zzg;
        zzdpbVarZzi.zzi(zzcfeVarZza, false, null, zzdrwVar.zza());
        zzcwj zzcwjVarZzc = zzcooVarZza.zzc();
        zzcwl zzcwlVar = new zzcwl() { // from class: com.google.android.gms.internal.ads.zzeea
            @Override // com.google.android.gms.internal.ads.zzcwl
            public final void zzs() {
                zzcfe zzcfeVar = zzcfeVarZza;
                if (zzcfeVar.zzN() != null) {
                    zzcfeVar.zzN().zzs();
                }
            }
        };
        zzgdm zzgdmVar = zzcad.zzg;
        zzcwjVarZzc.zzo(zzcwlVar, zzgdmVar);
        zzfby zzfbyVar = zzfbtVar.zzs;
        String strZzb = zzfbyVar.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfx)).booleanValue() && zzcooVarZza.zzl().zze(true)) {
            strZzb = zzcgp.zzb(strZzb, zzcgp.zza(zzfbtVar));
        }
        zzcooVarZza.zzi();
        A4.a aVarZzj = zzdpb.zzj(zzcfeVarZza, zzfbyVar.zzb, strZzb, zzdrwVar.zza());
        if (zzfbtVar.zzM) {
            aVarZzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeeb
                @Override // java.lang.Runnable
                public final void run() {
                    zzcfeVarZza.zzah();
                }
            }, zzeefVar.zze);
        }
        aVarZzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeec
            @Override // java.lang.Runnable
            public final void run() {
                zzeef.zzd(this.zza, zzcfeVarZza);
            }
        }, zzeefVar.zze);
        return zzgdb.zzm(aVarZzj, new zzfut() { // from class: com.google.android.gms.internal.ads.zzeed
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj2) {
                return zzcooVarZza.zza();
            }
        }, zzgdmVar);
    }

    public static /* synthetic */ void zzd(zzeef zzeefVar, zzcfe zzcfeVar) {
        zzcfeVar.zzab();
        zzfco zzfcoVar = zzeefVar.zzd;
        zzcgg zzcggVarZzq = zzcfeVar.zzq();
        com.google.android.gms.ads.internal.client.zzgc zzgcVar = zzfcoVar.zza;
        if (zzgcVar != null && zzcggVarZzq != null) {
            zzcggVarZzq.zzs(zzgcVar);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzbt)).booleanValue() || zzcfeVar.isAttachedToWindow()) {
            return;
        }
        zzcfeVar.onPause();
        zzcfeVar.zzav(true);
    }

    @Override // com.google.android.gms.internal.ads.zzede
    public final A4.a zza(final zzfcf zzfcfVar, final zzfbt zzfbtVar) {
        return zzgdb.zzn(zzgdb.zzh(null), new zzgci() { // from class: com.google.android.gms.internal.ads.zzeee
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) {
                return zzeef.zzc(this.zza, zzfcfVar, zzfbtVar, obj);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzede
    public final boolean zzb(zzfcf zzfcfVar, zzfbt zzfbtVar) {
        zzfby zzfbyVar = zzfbtVar.zzs;
        return (zzfbyVar == null || zzfbyVar.zza == null) ? false : true;
    }
}

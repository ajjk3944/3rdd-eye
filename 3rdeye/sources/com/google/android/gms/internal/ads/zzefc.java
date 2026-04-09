package com.google.android.gms.internal.ads;

import N7.C1154e9;
import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzefc implements zzede {
    private final Context zza;
    private final zzdpc zzb;
    private final zzdfy zzc;
    private final zzfco zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbkg zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjf)).booleanValue();
    private final zzecd zzi;
    private final zzdrw zzj;
    private final zzdsc zzk;

    public zzefc(Context context, VersionInfoParcel versionInfoParcel, zzfco zzfcoVar, Executor executor, zzdfy zzdfyVar, zzdpc zzdpcVar, zzbkg zzbkgVar, zzecd zzecdVar, zzdrw zzdrwVar, zzdsc zzdscVar) {
        this.zza = context;
        this.zzd = zzfcoVar;
        this.zzc = zzdfyVar;
        this.zze = executor;
        this.zzf = versionInfoParcel;
        this.zzb = zzdpcVar;
        this.zzg = zzbkgVar;
        this.zzi = zzecdVar;
        this.zzj = zzdrwVar;
        this.zzk = zzdscVar;
    }

    public static /* synthetic */ A4.a zzc(final zzefc zzefcVar, final zzfbt zzfbtVar, zzfcf zzfcfVar, zzdpg zzdpgVar, Object obj) throws zzcfq {
        zzbct zzbctVar = zzbdc.zzcr;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbctVar)).booleanValue()) {
            C1154e9.l(zzefcVar.zzj.zza(), zzdrk.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        zzdpc zzdpcVar = zzefcVar.zzb;
        zzfco zzfcoVar = zzefcVar.zzd;
        final zzcfe zzcfeVarZza = zzdpcVar.zza(zzfcoVar.zze, zzfbtVar, zzfcfVar.zzb.zzb);
        zzcfeVarZza.zzac(zzfbtVar.zzW);
        Context context = zzefcVar.zza;
        zzdpgVar.zza(context, zzcfeVarZza.zzF());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbctVar)).booleanValue()) {
            C1154e9.l(zzefcVar.zzj.zza(), zzdrk.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        zzcai zzcaiVar = new zzcai();
        zzdfy zzdfyVar = zzefcVar.zzc;
        zzcrl zzcrlVar = new zzcrl(zzfcfVar, zzfbtVar, null);
        VersionInfoParcel versionInfoParcel = zzefcVar.zzf;
        boolean z10 = zzefcVar.zzh;
        zzbkg zzbkgVar = zzefcVar.zzg;
        final zzdev zzdevVarZzd = zzdfyVar.zzd(zzcrlVar, new zzdey(new zzefb(context, versionInfoParcel, zzcaiVar, zzfbtVar, zzcfeVarZza, zzfcoVar, z10, zzbkgVar, zzefcVar.zzi, zzefcVar.zzk), zzcfeVarZza));
        zzcaiVar.zzc(zzdevVarZzd);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbctVar)).booleanValue()) {
            C1154e9.l(zzefcVar.zzj.zza(), zzdrk.RENDERING_AD_COMPONENT_CREATION_END.zza());
        }
        zzdevVarZzd.zzc().zzo(new zzcwl() { // from class: com.google.android.gms.internal.ads.zzeez
            @Override // com.google.android.gms.internal.ads.zzcwl
            public final void zzs() {
                zzcfe zzcfeVar = zzcfeVarZza;
                if (zzcfeVar.zzN() != null) {
                    zzcfeVar.zzN().zzs();
                }
            }
        }, zzcad.zzg);
        zzfby zzfbyVar = zzfbtVar.zzs;
        String strZzb = zzfbyVar.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfx)).booleanValue() && zzdevVarZzd.zzl().zze(true)) {
            strZzb = zzcgp.zzb(strZzb, zzcgp.zza(zzfbtVar));
        }
        zzdpb zzdpbVarZzi = zzdevVarZzd.zzi();
        zzbkg zzbkgVar2 = true != z10 ? null : zzbkgVar;
        zzdrw zzdrwVar = zzefcVar.zzj;
        zzdpbVarZzi.zzi(zzcfeVarZza, true, zzbkgVar2, zzdrwVar.zza());
        zzdevVarZzd.zzi();
        return zzgdb.zzm(zzdpb.zzj(zzcfeVarZza, zzfbyVar.zzb, strZzb, zzdrwVar.zza()), new zzfut(zzefcVar) { // from class: com.google.android.gms.internal.ads.zzefa
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj2) {
                zzcfe zzcfeVar = zzcfeVarZza;
                if (zzfbtVar.zzM) {
                    zzcfeVar.zzah();
                }
                zzdev zzdevVar = zzdevVarZzd;
                zzcfeVar.zzab();
                zzcfeVar.onPause();
                return zzdevVar.zzg();
            }
        }, zzefcVar.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzede
    public final A4.a zza(final zzfcf zzfcfVar, final zzfbt zzfbtVar) {
        final zzdpg zzdpgVar = new zzdpg();
        A4.a aVarZzh = zzgdb.zzh(null);
        zzgci zzgciVar = new zzgci() { // from class: com.google.android.gms.internal.ads.zzeex
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) {
                return zzefc.zzc(this.zza, zzfbtVar, zzfcfVar, zzdpgVar, obj);
            }
        };
        Executor executor = this.zze;
        A4.a aVarZzn = zzgdb.zzn(aVarZzh, zzgciVar, executor);
        aVarZzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeey
            @Override // java.lang.Runnable
            public final void run() {
                zzdpgVar.zzb();
            }
        }, executor);
        return aVarZzn;
    }

    @Override // com.google.android.gms.internal.ads.zzede
    public final boolean zzb(zzfcf zzfcfVar, zzfbt zzfbtVar) {
        zzfby zzfbyVar = zzfbtVar.zzs;
        return (zzfbyVar == null || zzfbyVar.zza == null) ? false : true;
    }
}

package com.google.android.gms.internal.ads;

import N7.C1154e9;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdmn {
    private final zzfco zza;
    private final Executor zzb;
    private final zzdpc zzc;
    private final zzdnx zzd;
    private final Context zze;
    private final zzdsc zzf;
    private final zzfjq zzg;
    private final zzebs zzh;
    private final zzdrw zzi;

    public zzdmn(zzfco zzfcoVar, Executor executor, zzdpc zzdpcVar, Context context, zzdsc zzdscVar, zzfjq zzfjqVar, zzebs zzebsVar, zzdnx zzdnxVar, zzdrw zzdrwVar) {
        this.zza = zzfcoVar;
        this.zzb = executor;
        this.zzc = zzdpcVar;
        this.zze = context;
        this.zzf = zzdscVar;
        this.zzg = zzfjqVar;
        this.zzh = zzebsVar;
        this.zzd = zzdnxVar;
        this.zzi = zzdrwVar;
    }

    public static /* synthetic */ A4.a zza(zzdmn zzdmnVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbxy zzbxyVar, Object obj) throws zzcfq {
        zzcfe zzcfeVarZza = zzdmnVar.zzc.zza(com.google.android.gms.ads.internal.client.zzr.zzc(), null, null);
        final zzcah zzcahVarZza = zzcah.zza(zzcfeVarZza);
        zzdmnVar.zzh(zzcfeVarZza, zzbVar, zzbxyVar);
        zzcfeVarZza.zzN().zzK(new zzcgv() { // from class: com.google.android.gms.internal.ads.zzdmf
            @Override // com.google.android.gms.internal.ads.zzcgv
            public final void zza() {
                zzcahVarZza.zzb();
            }
        });
        zzcfeVarZza.loadUrl((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzdZ));
        return zzcahVarZza;
    }

    public static /* synthetic */ A4.a zzb(final zzdmn zzdmnVar, JSONObject jSONObject, final zzcfe zzcfeVar) {
        zzbmn zzbmnVar = zzdmnVar.zza.zzb;
        final zzcah zzcahVarZza = zzcah.zza(zzcfeVar);
        if (zzbmnVar != null) {
            zzcfeVar.zzaj(zzcgy.zzd());
        } else {
            zzcfeVar.zzaj(zzcgy.zze());
        }
        zzcfeVar.zzN().zzC(new zzcgu() { // from class: com.google.android.gms.internal.ads.zzdme
            @Override // com.google.android.gms.internal.ads.zzcgu
            public final void zza(boolean z10, int i, String str, String str2) {
                zzdmn.zzg(this.zza, zzcfeVar, zzcahVarZza, z10, i, str, str2);
            }
        });
        zzcfeVar.zzp("google.afma.nativeAds.renderVideo", jSONObject);
        return zzcahVarZza;
    }

    public static /* synthetic */ A4.a zzc(final zzdmn zzdmnVar, com.google.android.gms.ads.internal.client.zzr zzrVar, zzfbt zzfbtVar, zzfbw zzfbwVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbxy zzbxyVar, String str, String str2, Object obj) throws zzcfq {
        final zzcfe zzcfeVarZza = zzdmnVar.zzc.zza(zzrVar, zzfbtVar, zzfbwVar);
        final zzcah zzcahVarZza = zzcah.zza(zzcfeVarZza);
        if (zzdmnVar.zza.zzb != null) {
            zzdmnVar.zzh(zzcfeVarZza, zzbVar, zzbxyVar);
            zzcfeVarZza.zzaj(zzcgy.zzd());
        } else {
            zzdnu zzdnuVarZzb = zzdmnVar.zzd.zzb();
            zzcgw zzcgwVarZzN = zzcfeVarZza.zzN();
            zzbct zzbctVar = zzbdc.zznE;
            zzcgwVarZzN.zzX(zzdnuVarZzb, zzdnuVarZzb, zzdnuVarZzb, zzdnuVarZzb, zzdnuVarZzb, false, null, !((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbctVar)).booleanValue() ? new com.google.android.gms.ads.internal.zzb(zzdmnVar.zze, null, null) : zzbVar, null, true != ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbctVar)).booleanValue() ? null : zzbxyVar, zzdmnVar.zzh, zzdmnVar.zzg, zzdmnVar.zzf, null, zzdnuVarZzb, null, null, null, null);
            zzj(zzcfeVarZza);
        }
        zzcfeVarZza.zzN().zzC(new zzcgu() { // from class: com.google.android.gms.internal.ads.zzdmc
            @Override // com.google.android.gms.internal.ads.zzcgu
            public final void zza(boolean z10, int i, String str3, String str4) {
                zzdmn.zzf(this.zza, zzcfeVarZza, zzcahVarZza, z10, i, str3, str4);
            }
        });
        zzcfeVarZza.zzae(str, str2, null);
        return zzcahVarZza;
    }

    public static /* synthetic */ void zzf(zzdmn zzdmnVar, zzcfe zzcfeVar, zzcah zzcahVar, boolean z10, int i, String str, String str2) {
        if (z10) {
            com.google.android.gms.ads.internal.client.zzgc zzgcVar = zzdmnVar.zza.zza;
            if (zzgcVar != null && zzcfeVar.zzq() != null) {
                zzcfeVar.zzq().zzs(zzgcVar);
            }
            zzcahVar.zzb();
            return;
        }
        zzcahVar.zzd(new zzegx(1, "Html video Web View failed to load. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2));
    }

    public static /* synthetic */ void zzg(zzdmn zzdmnVar, zzcfe zzcfeVar, zzcah zzcahVar, boolean z10, int i, String str, String str2) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzeh)).booleanValue()) {
            zzdmnVar.zzi(zzcfeVar, zzcahVar);
            return;
        }
        if (z10) {
            zzdmnVar.zzi(zzcfeVar, zzcahVar);
            return;
        }
        zzcahVar.zzd(new zzegx(1, "Native Video WebView failed to load. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2));
    }

    private final void zzh(zzcfe zzcfeVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbxy zzbxyVar) {
        zzj(zzcfeVar);
        zzcfeVar.zzag("/video", zzbkc.zzl);
        zzcfeVar.zzag("/videoMeta", zzbkc.zzm);
        zzcfeVar.zzag("/precache", new zzcdm());
        zzcfeVar.zzag("/delayPageLoaded", zzbkc.zzp);
        zzcfeVar.zzag("/instrument", zzbkc.zzn);
        zzcfeVar.zzag("/log", zzbkc.zzg);
        zzcfeVar.zzag("/click", new zzbjb(null, 0 == true ? 1 : 0));
        if (this.zza.zzb != null) {
            zzcfeVar.zzN().zzH(true);
            zzcfeVar.zzag("/open", new zzbkp(true != ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zznE)).booleanValue() ? null : zzbVar, null, null, null, null));
        } else {
            zzcfeVar.zzN().zzH(false);
        }
        if (com.google.android.gms.ads.internal.zzv.zzo().zzp(zzcfeVar.getContext())) {
            Map map = new HashMap();
            if (zzcfeVar.zzD() != null) {
                map = zzcfeVar.zzD().zzaw;
            }
            zzcfeVar.zzag("/logScionEvent", new zzbkj(zzcfeVar.getContext(), map));
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zznE)).booleanValue()) {
            zzcfeVar.zzN().zzD(zzbVar);
            zzcfeVar.zzN().zzL(zzbxyVar);
        }
    }

    private final void zzi(zzcfe zzcfeVar, zzcah zzcahVar) {
        com.google.android.gms.ads.internal.client.zzgc zzgcVar = this.zza.zza;
        if (zzgcVar != null && zzcfeVar.zzq() != null) {
            zzcfeVar.zzq().zzs(zzgcVar);
        }
        zzcahVar.zzb();
    }

    private static final void zzj(zzcfe zzcfeVar) {
        zzcfeVar.zzag("/videoClicked", zzbkc.zzh);
        zzcfeVar.zzN().zzJ(true);
        zzcfeVar.zzag("/getNativeAdViewSignals", zzbkc.zzs);
        zzcfeVar.zzag("/getNativeClickMeta", zzbkc.zzt);
    }

    public final A4.a zzd(final JSONObject jSONObject, final com.google.android.gms.ads.internal.zzb zzbVar, final zzbxy zzbxyVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcv)).booleanValue()) {
            C1154e9.l(this.zzi.zza(), zzdrk.NATIVE_ASSETS_LOADING_VIDEO_START.zza());
        }
        A4.a aVarZzh = zzgdb.zzh(null);
        zzgci zzgciVar = new zzgci() { // from class: com.google.android.gms.internal.ads.zzdmh
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) {
                return zzdmn.zza(this.zza, zzbVar, zzbxyVar, obj);
            }
        };
        Executor executor = this.zzb;
        return zzgdb.zzn(zzgdb.zzn(aVarZzh, zzgciVar, executor), new zzgci() { // from class: com.google.android.gms.internal.ads.zzdmg
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) {
                return zzdmn.zzb(this.zza, jSONObject, (zzcfe) obj);
            }
        }, executor);
    }

    public final A4.a zze(final String str, final String str2, final zzfbt zzfbtVar, final zzfbw zzfbwVar, final com.google.android.gms.ads.internal.client.zzr zzrVar, final com.google.android.gms.ads.internal.zzb zzbVar, final zzbxy zzbxyVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcv)).booleanValue()) {
            C1154e9.l(this.zzi.zza(), zzdrk.NATIVE_ASSETS_LOADING_VIDEO_COMPOSITION_START.zza());
        }
        return zzgdb.zzn(zzgdb.zzh(null), new zzgci() { // from class: com.google.android.gms.internal.ads.zzdmd
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) {
                return zzdmn.zzc(this.zza, zzrVar, zzfbtVar, zzfbwVar, zzbVar, zzbxyVar, str, str2, obj);
            }
        }, this.zzb);
    }
}

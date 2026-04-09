package com.google.android.gms.internal.ads;

import N7.C1154e9;
import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeft implements zzefn {
    private final zzdgu zza;
    private final zzgdm zzb;
    private final zzdlg zzc;
    private final zzfdn zzd;
    private final zzdnx zze;
    private final zzdrw zzf;
    private final VersionInfoParcel zzg;
    private final Context zzh;
    private final zzbxu zzi;

    public zzeft(zzdgu zzdguVar, zzgdm zzgdmVar, zzdlg zzdlgVar, zzfdn zzfdnVar, zzdnx zzdnxVar, zzdrw zzdrwVar, VersionInfoParcel versionInfoParcel, Context context, zzbxu zzbxuVar) {
        this.zzg = versionInfoParcel;
        this.zzh = context;
        this.zzi = zzbxuVar;
        this.zza = zzdguVar;
        this.zzb = zzgdmVar;
        this.zzc = zzdlgVar;
        this.zzd = zzfdnVar;
        this.zze = zzdnxVar;
        this.zzf = zzdrwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ zzdih zzc(zzeft zzeftVar, A4.a aVar, A4.a aVar2, zzfcf zzfcfVar, zzfbt zzfbtVar, JSONObject jSONObject, com.google.android.gms.ads.internal.zzb zzbVar, zzbxy zzbxyVar) throws Throwable {
        zzdim zzdimVar = (zzdim) aVar.get();
        zzdnr zzdnrVar = (zzdnr) aVar2.get();
        zzbct zzbctVar = zzbdc.zzcr;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbctVar)).booleanValue()) {
            C1154e9.l(zzeftVar.zzf.zza(), zzdrk.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        zzdin zzdinVarZzd = zzeftVar.zza.zzd(new zzcrl(zzfcfVar, zzfbtVar, null), new zzdiy(zzdimVar), new zzdhi(jSONObject, zzdnrVar, zzbVar, zzbxyVar));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbctVar)).booleanValue()) {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis();
            zzdrw zzdrwVar = zzeftVar.zzf;
            zzdrwVar.zza().putLong(zzdrk.RENDERING_AD_COMPONENT_CREATION_END.zza(), jCurrentTimeMillis);
            zzdrwVar.zza().putLong(zzdrk.RENDERING_CONFIGURE_WEBVIEW_START.zza(), jCurrentTimeMillis);
        }
        zzdinVarZzd.zzh().zzb();
        zzdinVarZzd.zzi().zza(zzdnrVar);
        zzdinVarZzd.zzg().zzc(zzdimVar.zzs());
        zzdinVarZzd.zzl().zza(zzeftVar.zze, zzdimVar.zzq());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbctVar)).booleanValue()) {
            C1154e9.l(zzeftVar.zzf.zza(), zzdrk.RENDERING_CONFIGURE_WEBVIEW_END.zza());
        }
        return zzdinVarZzd.zza();
    }

    public static /* synthetic */ A4.a zzd(zzeft zzeftVar, zzfcf zzfcfVar, zzfbt zzfbtVar, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return zzgdb.zzg(new zzdwe(3));
        }
        int i = zzfcfVar.zza.zza.zzk;
        if (i <= 1) {
            return zzgdb.zzm(zzeftVar.zzg(zzfcfVar, zzfbtVar, jSONArray.getJSONObject(0)), new zzfut() { // from class: com.google.android.gms.internal.ads.zzefs
                @Override // com.google.android.gms.internal.ads.zzfut
                public final Object apply(Object obj) {
                    return Collections.singletonList(zzgdb.zzh((zzdih) obj));
                }
            }, zzeftVar.zzb);
        }
        int length = jSONArray.length();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcs)).booleanValue()) {
            zzeftVar.zzf.zzd("nsl", String.valueOf(length));
        }
        zzeftVar.zzd.zzc(Math.min(length, i));
        ArrayList arrayList = new ArrayList(i);
        for (int i10 = 0; i10 < i; i10++) {
            if (i10 < length) {
                arrayList.add(zzeftVar.zzg(zzfcfVar, zzfbtVar, jSONArray.getJSONObject(i10)));
            } else {
                arrayList.add(zzgdb.zzg(new zzdwe(3)));
            }
        }
        return zzgdb.zzh(arrayList);
    }

    public static /* synthetic */ A4.a zze(final zzeft zzeftVar, zzfbt zzfbtVar, final zzdnr zzdnrVar) throws JSONException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcq)).booleanValue()) {
            C1154e9.l(zzeftVar.zzf.zza(), zzdrk.RENDERING_NATIVE_ADS_PREPROCESS_START.zza());
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zziT)).booleanValue() && PlatformVersion.isAtLeastR()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", zzfbtVar.zzs.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return zzgdb.zzn(zzdnrVar.zzg("google.afma.nativeAds.preProcessJson", jSONObject2), new zzgci() { // from class: com.google.android.gms.internal.ads.zzefp
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) {
                return zzeft.zzf(this.zza, zzdnrVar, (JSONObject) obj);
            }
        }, zzeftVar.zzb);
    }

    public static /* synthetic */ A4.a zzf(zzeft zzeftVar, zzdnr zzdnrVar, JSONObject jSONObject) throws zzboj {
        zzeftVar.zzd.zzb(zzgdb.zzh(zzdnrVar));
        if (!jSONObject.optBoolean("success")) {
            throw new zzboj("process json failed");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcq)).booleanValue()) {
            C1154e9.l(zzeftVar.zzf.zza(), zzdrk.RENDERING_NATIVE_ADS_PREPROCESS_END.zza());
        }
        return zzgdb.zzh(jSONObject.getJSONObject("json").getJSONArray("ads"));
    }

    private final A4.a zzg(final zzfcf zzfcfVar, final zzfbt zzfbtVar, final JSONObject jSONObject) {
        com.google.android.gms.ads.internal.zzb zzbVar;
        zzbxy zzbxyVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcr)).booleanValue()) {
            C1154e9.l(this.zzf.zza(), zzdrk.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        final A4.a aVarZza = this.zzd.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zznE)).booleanValue()) {
            Context context = this.zzh;
            zzbxy zzbxyVarZza = zzcvm.zza(context, this.zzg, zzfbtVar, this.zzi);
            zzbVar = new com.google.android.gms.ads.internal.zzb(context, zzbxyVarZza, null);
            zzbxyVar = zzbxyVarZza;
        } else {
            zzbVar = new com.google.android.gms.ads.internal.zzb(this.zzh, null, null);
            zzbxyVar = null;
        }
        final com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar;
        final zzbxy zzbxyVar2 = zzbxyVar;
        final A4.a aVarZzd = this.zzc.zzd(zzfcfVar, zzfbtVar, jSONObject, zzbVar2, zzbxyVar2);
        return zzgdb.zzc(aVarZza, aVarZzd).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzefo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeft.zzc(this.zza, aVarZzd, aVarZza, zzfcfVar, zzfbtVar, jSONObject, zzbVar2, zzbxyVar2);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzede
    public final A4.a zza(final zzfcf zzfcfVar, final zzfbt zzfbtVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcq)).booleanValue()) {
            C1154e9.l(this.zzf.zza(), zzdrk.RENDERING_NATIVE_ADS_NATIVE_JS_WEBVIEW_START.zza());
        }
        A4.a aVarZza = this.zzd.zza();
        zzgci zzgciVar = new zzgci() { // from class: com.google.android.gms.internal.ads.zzefq
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) {
                return zzeft.zze(this.zza, zzfbtVar, (zzdnr) obj);
            }
        };
        zzgdm zzgdmVar = this.zzb;
        return zzgdb.zzn(zzgdb.zzn(aVarZza, zzgciVar, zzgdmVar), new zzgci() { // from class: com.google.android.gms.internal.ads.zzefr
            @Override // com.google.android.gms.internal.ads.zzgci
            public final A4.a zza(Object obj) {
                return zzeft.zzd(this.zza, zzfcfVar, zzfbtVar, (JSONArray) obj);
            }
        }, zzgdmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzede
    public final boolean zzb(zzfcf zzfcfVar, zzfbt zzfbtVar) {
        zzfby zzfbyVar = zzfbtVar.zzs;
        return (zzfbyVar == null || zzfbyVar.zzc == null) ? false : true;
    }
}

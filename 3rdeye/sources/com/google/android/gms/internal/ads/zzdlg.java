package com.google.android.gms.internal.ads;

import B4.g;
import N7.C1154e9;
import android.os.Bundle;
import g0.C4356c;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdlg {
    private final zzgdm zza;
    private final zzdlv zzb;
    private final zzdma zzc;
    private final zzdrw zzd;

    public zzdlg(zzgdm zzgdmVar, zzdlv zzdlvVar, zzdma zzdmaVar, zzdrw zzdrwVar) {
        this.zza = zzgdmVar;
        this.zzb = zzdlvVar;
        this.zzc = zzdmaVar;
        this.zzd = zzdrwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ zzdim zza(zzdlg zzdlgVar, A4.a aVar, A4.a aVar2, A4.a aVar3, A4.a aVar4, A4.a aVar5, JSONObject jSONObject, A4.a aVar6, A4.a aVar7, A4.a aVar8, A4.a aVar9, A4.a aVar10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcq)).booleanValue()) {
            C1154e9.l(zzdlgVar.zzd.zza(), zzdrk.RENDERING_NATIVE_ASSETS_LOADING_END.zza());
        }
        zzdim zzdimVar = (zzdim) aVar.get();
        zzdimVar.zzP((List) aVar2.get());
        zzdimVar.zzM((zzbgn) aVar3.get());
        zzdimVar.zzQ((zzbgn) aVar4.get());
        zzdimVar.zzJ((zzbgg) aVar5.get());
        zzdimVar.zzS(zzdlv.zzl(jSONObject));
        zzdimVar.zzL(zzdlv.zzk(jSONObject));
        zzcfe zzcfeVar = (zzcfe) aVar6.get();
        if (zzcfeVar != null) {
            zzdimVar.zzad(zzcfeVar);
            zzdimVar.zzac(zzcfeVar.zzF());
            zzdimVar.zzab(zzcfeVar.zzq());
        }
        zzdimVar.zzd().putAll((Bundle) aVar7.get());
        zzcfe zzcfeVar2 = (zzcfe) aVar8.get();
        if (zzcfeVar2 != null) {
            zzdimVar.zzO(zzcfeVar2);
            zzdimVar.zzae(zzcfeVar2.zzF());
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfB)).booleanValue() || zzf(jSONObject)) {
            zzcfe zzcfeVar3 = (zzcfe) aVar9.get();
            if (zzcfeVar3 != null) {
                zzdimVar.zzT(zzcfeVar3);
            }
        } else {
            zzdimVar.zzU(aVar9);
            zzdimVar.zzX(new zzcai());
        }
        for (zzdlz zzdlzVar : (List) aVar10.get()) {
            if (zzdlzVar.zza != 1) {
                zzdimVar.zzN(zzdlzVar.zzb, zzdlzVar.zzd);
            } else {
                zzdimVar.zzZ(zzdlzVar.zzb, zzdlzVar.zzc);
            }
        }
        return zzdimVar;
    }

    public static /* synthetic */ zzdim zzb(zzdlg zzdlgVar, zzfcf zzfcfVar, zzfbt zzfbtVar, JSONObject jSONObject) throws zzegx {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcv)).booleanValue()) {
            C1154e9.l(zzdlgVar.zzd.zza(), zzdrk.NATIVE_ASSETS_LOADING_BASIC_START.zza());
        }
        zzdim zzdimVar = new zzdim();
        zzdimVar.zzaa(jSONObject.optInt("template_id", -1));
        zzdimVar.zzK(jSONObject.optString("custom_template_id"));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings");
        zzdimVar.zzV(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("omid_partner_name") : null);
        zzfco zzfcoVar = zzfcfVar.zza.zza;
        if (!zzfcoVar.zzg.contains(Integer.toString(zzdimVar.zzc()))) {
            throw new zzegx(1, C4356c.h(zzdimVar.zzc(), "Invalid template ID: "));
        }
        if (zzdimVar.zzc() == 3) {
            if (zzdimVar.zzA() == null) {
                throw new zzegx(1, "No custom template id for custom template ad response.");
            }
            if (!zzfcoVar.zzh.contains(zzdimVar.zzA())) {
                throw new zzegx(1, "Unexpected custom template id in the response.");
            }
        }
        zzdimVar.zzY(jSONObject.optDouble("rating", -1.0d));
        String strOptString = jSONObject.optString("headline", null);
        if (zzfbtVar.zzM) {
            com.google.android.gms.ads.internal.zzv.zzr();
            strOptString = g.o(com.google.android.gms.ads.internal.util.zzs.zzz(), " : ", strOptString);
        }
        zzdimVar.zzZ("headline", strOptString);
        zzdimVar.zzZ("body", jSONObject.optString("body", null));
        zzdimVar.zzZ("call_to_action", jSONObject.optString("call_to_action", null));
        zzdimVar.zzZ("store", jSONObject.optString("store", null));
        zzdimVar.zzZ("price", jSONObject.optString("price", null));
        zzdimVar.zzZ("advertiser", jSONObject.optString("advertiser", null));
        return zzdimVar;
    }

    private final A4.a zze(A4.a aVar, zzdrk zzdrkVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcv)).booleanValue()) {
            zzgdb.zzr(aVar, new zzdlf(this, zzdrkVar), this.zza);
        }
        return aVar;
    }

    private static final boolean zzf(JSONObject jSONObject) {
        return jSONObject.optInt("template_id") == 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final A4.a zzd(final com.google.android.gms.internal.ads.zzfcf r15, final com.google.android.gms.internal.ads.zzfbt r16, final org.json.JSONObject r17, com.google.android.gms.ads.internal.zzb r18, com.google.android.gms.internal.ads.zzbxy r19) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdlg.zzd(com.google.android.gms.internal.ads.zzfcf, com.google.android.gms.internal.ads.zzfbt, org.json.JSONObject, com.google.android.gms.ads.internal.zzb, com.google.android.gms.internal.ads.zzbxy):A4.a");
    }
}

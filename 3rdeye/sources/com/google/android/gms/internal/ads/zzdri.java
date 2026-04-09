package com.google.android.gms.internal.ads;

import A2.l;
import N7.C1154e9;
import android.os.Bundle;
import android.text.TextUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdri implements zzcyt, zzcxf, zzcvu, zzdei {
    private final zzdrw zza;
    private final zzdsh zzb;
    private final int zzc;

    public zzdri(zzdrw zzdrwVar, zzdsh zzdshVar, int i) {
        this.zza = zzdrwVar;
        this.zzb = zzdshVar;
        this.zzc = i;
    }

    private final void zzc(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j4 = bundle.getLong(str);
            if (j4 >= 0) {
                this.zza.zzd(str, String.valueOf(j4));
            }
        }
    }

    private final void zzd(Bundle bundle, zzfyf zzfyfVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzco)).booleanValue() || bundle == null) {
            return;
        }
        C1154e9.l(bundle, zzdrk.PUBLIC_API_CALLBACK.zza());
        zzdrw zzdrwVar = this.zza;
        zzdrwVar.zzc();
        if (bundle.containsKey("ls")) {
            zzdrwVar.zzd("ls", true != bundle.getBoolean("ls") ? CommonUrlParts.Values.FALSE_INTEGER : "1");
        }
        int size = zzfyfVar.size();
        for (int i = 0; i < size; i++) {
            zzdrl zzdrlVar = (zzdrl) zzfyfVar.get(i);
            long j4 = bundle.getLong(zzdrlVar.zza().zza(), -1L);
            long j10 = bundle.getLong(zzdrlVar.zzb().zza(), -1L);
            if (j4 > 0 && j10 > 0) {
                zzdrwVar.zzd(zzdrlVar.zzc(), String.valueOf(j10 - j4));
            }
        }
        zzc(bundle.getBundle("client_sig_latency_key"));
        zzc(bundle.getBundle("gms_sig_latency_key"));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhH)).booleanValue()) {
            if (bundle.containsKey("sod_h")) {
                zzdrwVar.zzd("sod_h", true != bundle.getBoolean("sod_h") ? CommonUrlParts.Values.FALSE_INTEGER : "1");
            }
            if (bundle.containsKey("cmr")) {
                zzdrwVar.zzd("cmr", String.valueOf(bundle.getInt("cmr")));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvu
    public final void zzdD(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzdrw zzdrwVar = this.zza;
        zzdrwVar.zzb().put("action", "ftl");
        zzdrwVar.zzd("ftl", String.valueOf(zzeVar.zza));
        zzdrwVar.zzd("ed", zzeVar.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhp)).booleanValue()) {
            zzdrwVar.zzd("emsg", zzeVar.zzb);
        }
        this.zzb.zzg(zzdrwVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdn(zzbvo zzbvoVar) {
        this.zza.zzf(zzbvoVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdo(zzfcf zzfcfVar) {
        this.zza.zze(zzfcfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final void zze(com.google.android.gms.ads.nonagon.signalgeneration.zzbk zzbkVar) {
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhb)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhH)).booleanValue()) {
                this.zza.zzb().put("sgw", String.valueOf(this.zzc));
            }
            if (zzbkVar == null) {
                zzdrw zzdrwVar = this.zza;
                zzdrwVar.zzb().put("action", "sgs");
                zzdrwVar.zzb().put(CommonUrlParts.REQUEST_ID, "-1");
                this.zzb.zzg(zzdrwVar.zzb());
                return;
            }
            zzbvo zzbvoVar = zzbkVar.zzd;
            Bundle bundle = zzbkVar.zze;
            if (zzbvoVar != null) {
                zzd(zzbvoVar.zzm, zzdrl.zza);
            } else if (bundle != null && !bundle.isEmpty()) {
                zzd(bundle, zzdrl.zza);
            }
            try {
                JSONObject jSONObject = new JSONObject(TextUtils.isEmpty(zzbkVar.zzc) ? zzbkVar.zzb : zzbkVar.zzc);
                zzdrw zzdrwVar2 = this.zza;
                zzdrwVar2.zzb().put("action", "sgs");
                Map mapZzb = zzdrwVar2.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzjT)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : CommonUrlParts.Values.FALSE_INTEGER;
                    } catch (JSONException e4) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Error retrieving JSONObject from the requestJson, ", e4);
                    }
                } else {
                    str = "na";
                }
                mapZzb.put("tpc", str);
                zzbvo zzbvoVar2 = zzbkVar.zzd;
                if (zzbvoVar2 != null) {
                    this.zza.zzf(zzbvoVar2.zza);
                }
                this.zzb.zzg(this.zza.zzb());
            } catch (JSONException unused) {
                zzdrw zzdrwVar3 = this.zza;
                zzdrwVar3.zzb().put("action", "sgf");
                zzdrwVar3.zzb().put("sgf_reason", "request_invalid");
                this.zzb.zzg(zzdrwVar3.zzb());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final void zzf(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhb)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhH)).booleanValue()) {
                this.zza.zzb().put("sgw", String.valueOf(this.zzc));
            }
            zzdrw zzdrwVar = this.zza;
            zzdrwVar.zzb().put("action", "sgf");
            zzdrwVar.zzd("sgf_reason", str);
            this.zzb.zzg(zzdrwVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxf
    public final void zzt() {
        zzdrw zzdrwVar = this.zza;
        zzdrwVar.zzb().put("action", "loaded");
        zzd(zzdrwVar.zza(), zzdrl.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzmP)).booleanValue()) {
            zzdrwVar.zzb().put("mafe", true != l.B("MUTE_AUDIO") ? CommonUrlParts.Values.FALSE_INTEGER : "1");
        }
        this.zzb.zzg(zzdrwVar.zzb());
    }
}

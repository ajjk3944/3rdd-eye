package com.google.android.gms.ads.nonagon.signalgeneration;

import A4.a;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbyv;
import com.google.android.gms.internal.ads.zzbzc;
import com.google.android.gms.internal.ads.zzfhb;
import com.google.android.gms.internal.ads.zzfhm;
import com.google.android.gms.internal.ads.zzgcx;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes.dex */
final class zzaq implements zzgcx {
    final /* synthetic */ a zza;
    final /* synthetic */ zzbzc zzb;
    final /* synthetic */ zzbyv zzc;
    final /* synthetic */ zzfhb zzd;
    final /* synthetic */ zzau zze;

    public zzaq(zzau zzauVar, a aVar, zzbzc zzbzcVar, zzbyv zzbyvVar, zzfhb zzfhbVar) {
        this.zza = aVar;
        this.zzb = zzbzcVar;
        this.zzc = zzbyvVar;
        this.zzd = zzfhbVar;
        this.zze = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th) {
        String message = th.getMessage();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhU)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzp().zzv(th, "SignalGeneratorImpl.generateSignals");
        } else {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "SignalGeneratorImpl.generateSignals");
        }
        zzfhm zzfhmVarZzs = zzau.zzs(this.zza, this.zzb);
        if (((Boolean) zzbev.zze.zze()).booleanValue() && zzfhmVarZzs != null) {
            zzfhb zzfhbVar = this.zzd;
            zzfhbVar.zzh(th);
            zzfhbVar.zzg(false);
            zzfhmVarZzs.zza(zzfhbVar);
            zzfhmVarZzs.zzh();
        }
        zzbyv zzbyvVar = this.zzc;
        if (zzbyvVar == null) {
            return;
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                message = "Internal error. " + message;
            }
            zzbyvVar.zzb(message);
        } catch (RemoteException e4) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzbk zzbkVar = (zzbk) obj;
        zzfhm zzfhmVarZzs = zzau.zzs(this.zza, this.zzb);
        this.zze.zzG.set(true);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzhO)).booleanValue()) {
            try {
                zzbyv zzbyvVar = this.zzc;
                if (zzbyvVar != null) {
                    zzbyvVar.zzb("QueryInfo generation has been disabled.");
                }
            } catch (RemoteException e4) {
                String strConcat = "QueryInfo generation has been disabled.".concat(e4.toString());
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg(strConcat);
            }
            if (!((Boolean) zzbev.zze.zze()).booleanValue() || zzfhmVarZzs == null) {
                return;
            }
            zzfhb zzfhbVar = this.zzd;
            zzfhbVar.zzc("QueryInfo generation has been disabled.");
            zzfhbVar.zzg(false);
            zzfhmVarZzs.zza(zzfhbVar);
            zzfhmVarZzs.zzh();
            return;
        }
        try {
            try {
                if (zzbkVar == null) {
                    zzbyv zzbyvVar2 = this.zzc;
                    if (zzbyvVar2 != null) {
                        zzbyvVar2.zzc(null, null, null);
                    }
                    zzfhb zzfhbVar2 = this.zzd;
                    zzfhbVar2.zzg(true);
                    if (!((Boolean) zzbev.zze.zze()).booleanValue() || zzfhmVarZzs == null) {
                        return;
                    }
                    zzfhmVarZzs.zza(zzfhbVar2);
                    zzfhmVarZzs.zzh();
                    return;
                }
                try {
                    if (TextUtils.isEmpty((!TextUtils.isEmpty(zzbkVar.zzc) ? new JSONObject(zzbkVar.zzc) : new JSONObject(zzbkVar.zzb)).optString(CommonUrlParts.REQUEST_ID, ""))) {
                        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("The request ID is empty in request JSON.");
                        zzbyv zzbyvVar3 = this.zzc;
                        if (zzbyvVar3 != null) {
                            zzbyvVar3.zzb("Internal error: request ID is empty in request JSON.");
                        }
                        zzfhb zzfhbVar3 = this.zzd;
                        zzfhbVar3.zzc("Request ID empty");
                        zzfhbVar3.zzg(false);
                        if (!((Boolean) zzbev.zze.zze()).booleanValue() || zzfhmVarZzs == null) {
                            return;
                        }
                        zzfhmVarZzs.zza(zzfhbVar3);
                        zzfhmVarZzs.zzh();
                        return;
                    }
                    Bundle bundle = zzbkVar.zzf;
                    zzau zzauVar = this.zze;
                    if (zzauVar.zzu && bundle != null && bundle.getInt(zzauVar.zzw, -1) == -1) {
                        bundle.putInt(zzauVar.zzw, zzauVar.zzx.get());
                    }
                    if (zzauVar.zzt && bundle != null && TextUtils.isEmpty(bundle.getString(zzauVar.zzv))) {
                        if (TextUtils.isEmpty(zzauVar.zzz)) {
                            zzauVar.zzz = com.google.android.gms.ads.internal.zzv.zzr().zzc(zzauVar.zzg, zzauVar.zzy.afmaVersion);
                        }
                        bundle.putString(zzauVar.zzv, zzauVar.zzz);
                    }
                    zzbyv zzbyvVar4 = this.zzc;
                    if (zzbyvVar4 != null) {
                        if (TextUtils.isEmpty(zzbkVar.zzc)) {
                            zzbyvVar4.zzc(zzbkVar.zza, zzbkVar.zzb, bundle);
                        } else {
                            zzbyvVar4.zzc(zzbkVar.zza, zzbkVar.zzc, bundle);
                        }
                    }
                    this.zzd.zzg(true);
                    if (!((Boolean) zzbev.zze.zze()).booleanValue() || zzfhmVarZzs == null) {
                        return;
                    }
                    zzfhmVarZzs.zza(this.zzd);
                    zzfhmVarZzs.zzh();
                } catch (JSONException e10) {
                    int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to create JSON object from the request string.");
                    zzbyv zzbyvVar5 = this.zzc;
                    if (zzbyvVar5 != null) {
                        zzbyvVar5.zzb("Internal error for request JSON: " + e10.toString());
                    }
                    zzfhb zzfhbVar4 = this.zzd;
                    zzfhbVar4.zzh(e10);
                    zzfhbVar4.zzg(false);
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e10, "SignalGeneratorImpl.generateSignals.onSuccess");
                    if (!((Boolean) zzbev.zze.zze()).booleanValue() || zzfhmVarZzs == null) {
                        return;
                    }
                    zzfhmVarZzs.zza(zzfhbVar4);
                    zzfhmVarZzs.zzh();
                }
            } catch (RemoteException e11) {
                zzfhb zzfhbVar5 = this.zzd;
                zzfhbVar5.zzh(e11);
                zzfhbVar5.zzg(false);
                int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", e11);
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e11, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((Boolean) zzbev.zze.zze()).booleanValue() || zzfhmVarZzs == null) {
                    return;
                }
                zzfhmVarZzs.zza(this.zzd);
                zzfhmVarZzs.zzh();
            }
        } catch (Throwable th) {
            if (((Boolean) zzbev.zze.zze()).booleanValue() && zzfhmVarZzs != null) {
                zzfhmVarZzs.zza(this.zzd);
                zzfhmVarZzs.zzh();
            }
            throw th;
        }
    }
}

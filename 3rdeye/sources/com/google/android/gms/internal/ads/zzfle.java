package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfle {
    private final zzflp zza;
    private final zzflp zzb;
    private final boolean zzc;
    private final zzfli zzd;
    private final zzfll zze;

    private zzfle(zzfli zzfliVar, zzfll zzfllVar, zzflp zzflpVar, zzflp zzflpVar2, boolean z10) {
        this.zzd = zzfliVar;
        this.zze = zzfllVar;
        this.zza = zzflpVar;
        if (zzflpVar2 == null) {
            this.zzb = zzflp.NONE;
        } else {
            this.zzb = zzflpVar2;
        }
        this.zzc = z10;
    }

    public static zzfle zza(zzfli zzfliVar, zzfll zzfllVar, zzflp zzflpVar, zzflp zzflpVar2, boolean z10) {
        zzfmz.zzc(zzfliVar, "CreativeType is null");
        zzfmz.zzc(zzfllVar, "ImpressionType is null");
        zzfmz.zzc(zzflpVar, "Impression owner is null");
        if (zzflpVar == zzflp.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (zzfliVar == zzfli.DEFINED_BY_JAVASCRIPT && zzflpVar == zzflp.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (zzfllVar == zzfll.DEFINED_BY_JAVASCRIPT && zzflpVar == zzflp.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new zzfle(zzfliVar, zzfllVar, zzflpVar, zzflpVar2, z10);
    }

    public final JSONObject zzb() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        zzfmv.zze(jSONObject, "impressionOwner", this.zza);
        zzfmv.zze(jSONObject, "mediaEventsOwner", this.zzb);
        zzfmv.zze(jSONObject, "creativeType", this.zzd);
        zzfmv.zze(jSONObject, "impressionType", this.zze);
        zzfmv.zze(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.zzc));
        return jSONObject;
    }
}

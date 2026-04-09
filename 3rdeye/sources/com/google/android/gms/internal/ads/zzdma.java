package com.google.android.gms.internal.ads;

import N7.C1154e9;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdma {
    private final Executor zza;
    private final zzdlv zzb;
    private final zzdrw zzc;

    public zzdma(Executor executor, zzdlv zzdlvVar, zzdrw zzdrwVar) {
        this.zza = executor;
        this.zzb = zzdlvVar;
        this.zzc = zzdrwVar;
    }

    public final A4.a zza(JSONObject jSONObject, String str) {
        A4.a aVarZzh;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("custom_assets");
        if (jSONArrayOptJSONArray == null) {
            return zzgdb.zzh(Collections.EMPTY_LIST);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcv)).booleanValue()) {
            C1154e9.l(this.zzc.zza(), zzdrk.NATIVE_ASSETS_LOADING_CUSTOM_START.zza());
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject == null) {
                aVarZzh = zzgdb.zzh(null);
            } else {
                final String strOptString = jSONObjectOptJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                if (strOptString == null) {
                    aVarZzh = zzgdb.zzh(null);
                } else {
                    String strOptString2 = jSONObjectOptJSONObject.optString("type");
                    aVarZzh = "string".equals(strOptString2) ? zzgdb.zzh(new zzdlz(strOptString, jSONObjectOptJSONObject.optString("string_value"))) : "image".equals(strOptString2) ? zzgdb.zzm(this.zzb.zze(jSONObjectOptJSONObject, "image_value", null), new zzfut() { // from class: com.google.android.gms.internal.ads.zzdlx
                        @Override // com.google.android.gms.internal.ads.zzfut
                        public final Object apply(Object obj) {
                            return new zzdlz(strOptString, (zzbga) obj);
                        }
                    }, this.zza) : zzgdb.zzh(null);
                }
            }
            arrayList.add(aVarZzh);
        }
        return zzgdb.zzm(zzgdb.zzd(arrayList), new zzfut() { // from class: com.google.android.gms.internal.ads.zzdly
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzdlz zzdlzVar : (List) obj) {
                    if (zzdlzVar != null) {
                        arrayList2.add(zzdlzVar);
                    }
                }
                return arrayList2;
            }
        }, this.zza);
    }
}

package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzeaa implements zzffw {
    private static final Pattern zza = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zzb;
    private final zzfhb zzc;
    private final zzfhm zzd;

    public zzeaa(String str, zzfhm zzfhmVar, zzfhb zzfhbVar) {
        this.zzb = str;
        this.zzd = zzfhmVar;
        this.zzc = zzfhbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzffw
    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        zzdwe zzdweVar;
        JSONObject jSONObject;
        String strConcat;
        zzdzz zzdzzVar = (zzdzz) obj;
        int iOptInt = zzdzzVar.zza.optInt("http_timeout_millis", 60000);
        zzbvq zzbvqVar = zzdzzVar.zzb;
        String strJoin = "";
        if (zzbvqVar.zza() != -2) {
            if (zzbvqVar.zza() == 1) {
                if (zzbvqVar.zzh() != null) {
                    strJoin = TextUtils.join(", ", zzbvqVar.zzh());
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg(strJoin);
                }
                zzdweVar = new zzdwe(2, "Error building request URL: ".concat(String.valueOf(strJoin)));
            } else {
                zzdweVar = new zzdwe(1);
            }
            zzfhm zzfhmVar = this.zzd;
            zzfhb zzfhbVar = this.zzc;
            zzfhbVar.zzh(zzdweVar);
            zzfhbVar.zzg(false);
            zzfhmVar.zza(zzfhbVar);
            throw zzdweVar;
        }
        HashMap map = new HashMap();
        if (zzdzzVar.zzb.zzj()) {
            String str = this.zzb;
            if (!TextUtils.isEmpty(str)) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzbb)).booleanValue()) {
                    if (TextUtils.isEmpty(str)) {
                        strConcat = "";
                    } else {
                        Matcher matcher = zza.matcher(str);
                        strConcat = "";
                        while (matcher.find()) {
                            String strGroup = matcher.group(1);
                            if (strGroup != null) {
                                Locale locale = Locale.ROOT;
                                if (strGroup.toLowerCase(locale).startsWith("id=") || strGroup.toLowerCase(locale).startsWith("ide=")) {
                                    if (!TextUtils.isEmpty(strConcat)) {
                                        strConcat = strConcat.concat("; ");
                                    }
                                    strConcat = strConcat.concat(strGroup);
                                }
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(strConcat)) {
                        map.put("Cookie", strConcat);
                    }
                } else {
                    map.put("Cookie", str);
                }
            }
        }
        if (zzdzzVar.zzb.zzk() && (jSONObject = zzdzzVar.zza) != null) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("pii");
            if (jSONObjectOptJSONObject != null) {
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos", ""))) {
                    map.put("x-afma-drt-cookie", jSONObjectOptJSONObject.optString("doritos", ""));
                }
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos_v2", ""))) {
                    map.put("x-afma-drt-v2-cookie", jSONObjectOptJSONObject.optString("doritos_v2", ""));
                }
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("DSID signal does not exist.");
            }
        }
        if (zzdzzVar.zzb != null && !TextUtils.isEmpty(zzdzzVar.zzb.zzf())) {
            strJoin = zzdzzVar.zzb.zzf();
        }
        zzfhm zzfhmVar2 = this.zzd;
        zzfhb zzfhbVar2 = this.zzc;
        zzfhbVar2.zzg(true);
        zzfhmVar2.zza(zzfhbVar2);
        return new zzdzv(zzdzzVar.zzb.zzg(), iOptInt, map, strJoin.getBytes(StandardCharsets.UTF_8), "", zzdzzVar.zzb.zzk());
    }
}

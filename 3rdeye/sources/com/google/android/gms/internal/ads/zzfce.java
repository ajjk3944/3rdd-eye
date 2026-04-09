package com.google.android.gms.internal.ads;

import N7.C1154e9;
import android.os.Bundle;
import android.util.JsonReader;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfce {
    public final List zza;
    public final zzfbw zzb;
    public final List zzc;
    public final Bundle zzd;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public zzfce(JsonReader jsonReader, Bundle bundle) throws IllegalStateException, JSONException, IOException, NumberFormatException, AssertionError {
        this.zzd = bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzco)).booleanValue() && bundle != null) {
            C1154e9.l(bundle, zzdrk.SERVER_RESPONSE_PARSE_START.zza());
        }
        ?? arrayList = Collections.EMPTY_LIST;
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        zzfbw zzfbwVar = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("responses".equals(strNextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(strNextName2)) {
                        arrayList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            arrayList.add(new zzfbt(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (strNextName2.equals("common")) {
                        zzfbwVar = new zzfbw(jsonReader);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcp)).booleanValue() && bundle != null) {
                            bundle.putLong(zzdrk.NORMALIZATION_AD_RESPONSE_START.zza(), zzfbwVar.zzs);
                            bundle.putLong(zzdrk.NORMALIZATION_AD_RESPONSE_END.zza(), zzfbwVar.zzt);
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (strNextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String strNextString = null;
                    JSONObject jSONObjectZzi = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        if (AppMeasurementSdk.ConditionalUserProperty.NAME.equals(strNextName3)) {
                            strNextString = jsonReader.nextString();
                        } else if ("info".equals(strNextName3)) {
                            jSONObjectZzi = com.google.android.gms.ads.internal.util.zzbs.zzi(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (strNextString != null) {
                        arrayList2.add(new zzfcd(strNextString, jSONObjectZzi));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.zzc = arrayList2;
        this.zza = arrayList;
        this.zzb = zzfbwVar == null ? new zzfbw(new JsonReader(new StringReader(JsonUtils.EMPTY_JSON))) : zzfbwVar;
    }

    public static zzfce zza(Reader reader, Bundle bundle) throws IOException, zzfbx {
        try {
            try {
                return new zzfce(new JsonReader(reader), bundle);
            } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e4) {
                throw new zzfbx("unable to parse ServerResponse", e4);
            }
        } finally {
            IOUtils.closeQuietly(reader);
        }
    }
}

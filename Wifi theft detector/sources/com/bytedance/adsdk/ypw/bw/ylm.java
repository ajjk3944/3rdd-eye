package com.bytedance.adsdk.ypw.bw;

import android.util.JsonReader;
import android.util.JsonToken;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class ylm {
    public static <T> List<com.bytedance.adsdk.ypw.uym.emc<T>> emc(JsonReader jsonReader, com.bytedance.adsdk.ypw.uym uymVar, float f10, wo<T> woVar, boolean z10) throws IOException {
        JsonReader jsonReader2;
        com.bytedance.adsdk.ypw.uym uymVar2;
        float f11;
        wo<T> woVar2;
        boolean z11;
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            uymVar.emc("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals(CampaignEx.JSON_KEY_AD_K)) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                if (jsonReader.peek() == JsonToken.NUMBER) {
                    JsonReader jsonReader3 = jsonReader;
                    com.bytedance.adsdk.ypw.uym uymVar3 = uymVar;
                    float f12 = f10;
                    wo<T> woVar3 = woVar;
                    boolean z12 = z10;
                    com.bytedance.adsdk.ypw.uym.emc emcVarEmc = ul.emc(jsonReader3, uymVar3, f12, woVar3, false, z12);
                    jsonReader2 = jsonReader3;
                    uymVar2 = uymVar3;
                    f11 = f12;
                    woVar2 = woVar3;
                    z11 = z12;
                    arrayList.add(emcVarEmc);
                } else {
                    jsonReader2 = jsonReader;
                    uymVar2 = uymVar;
                    f11 = f10;
                    woVar2 = woVar;
                    z11 = z10;
                    while (jsonReader2.hasNext()) {
                        arrayList.add(ul.emc(jsonReader2, uymVar2, f11, woVar2, true, z11));
                    }
                }
                jsonReader2.endArray();
                jsonReader = jsonReader2;
                uymVar = uymVar2;
                f10 = f11;
                woVar = woVar2;
                z10 = z11;
            } else {
                JsonReader jsonReader4 = jsonReader;
                arrayList.add(ul.emc(jsonReader4, uymVar, f10, woVar, false, z10));
                jsonReader = jsonReader4;
            }
        }
        jsonReader.endObject();
        emc(arrayList);
        return arrayList;
    }

    public static <T> void emc(List<? extends com.bytedance.adsdk.ypw.uym.emc<T>> list) {
        int i10;
        T t10;
        int size = list.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            com.bytedance.adsdk.ypw.uym.emc<T> emcVar = list.get(i11);
            i11++;
            com.bytedance.adsdk.ypw.uym.emc<T> emcVar2 = list.get(i11);
            emcVar.uym = Float.valueOf(emcVar2.ycc);
            if (emcVar.ypw == null && (t10 = emcVar2.emc) != null) {
                emcVar.ypw = t10;
                if (emcVar instanceof com.bytedance.adsdk.ypw.emc.ypw.zz) {
                    ((com.bytedance.adsdk.ypw.emc.ypw.zz) emcVar).emc();
                }
            }
        }
        com.bytedance.adsdk.ypw.uym.emc<T> emcVar3 = list.get(i10);
        if ((emcVar3.emc == null || emcVar3.ypw == null) && list.size() > 1) {
            list.remove(emcVar3);
        }
    }
}

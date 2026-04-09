package com.bytedance.adsdk.ypw.bw;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class ylm {
    public static <T> List<com.bytedance.adsdk.ypw.uym.emc<T>> emc(JsonReader jsonReader, com.bytedance.adsdk.ypw.uym uymVar, float f2, wo<T> woVar, boolean z6) throws IOException {
        JsonReader jsonReader2;
        com.bytedance.adsdk.ypw.uym uymVar2;
        float f5;
        wo<T> woVar2;
        boolean z7;
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            uymVar.emc("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals("k")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                if (jsonReader.peek() == JsonToken.NUMBER) {
                    JsonReader jsonReader3 = jsonReader;
                    com.bytedance.adsdk.ypw.uym uymVar3 = uymVar;
                    float f6 = f2;
                    wo<T> woVar3 = woVar;
                    boolean z8 = z6;
                    com.bytedance.adsdk.ypw.uym.emc emcVarEmc = ul.emc(jsonReader3, uymVar3, f6, woVar3, false, z8);
                    jsonReader2 = jsonReader3;
                    uymVar2 = uymVar3;
                    f5 = f6;
                    woVar2 = woVar3;
                    z7 = z8;
                    arrayList.add(emcVarEmc);
                } else {
                    jsonReader2 = jsonReader;
                    uymVar2 = uymVar;
                    f5 = f2;
                    woVar2 = woVar;
                    z7 = z6;
                    while (jsonReader2.hasNext()) {
                        arrayList.add(ul.emc(jsonReader2, uymVar2, f5, woVar2, true, z7));
                    }
                }
                jsonReader2.endArray();
                jsonReader = jsonReader2;
                uymVar = uymVar2;
                f2 = f5;
                woVar = woVar2;
                z6 = z7;
            } else {
                JsonReader jsonReader4 = jsonReader;
                arrayList.add(ul.emc(jsonReader4, uymVar, f2, woVar, false, z6));
                jsonReader = jsonReader4;
            }
        }
        jsonReader.endObject();
        emc(arrayList);
        return arrayList;
    }

    public static <T> void emc(List<? extends com.bytedance.adsdk.ypw.uym.emc<T>> list) {
        int i;
        T t6;
        int size = list.size();
        int i3 = 0;
        while (true) {
            i = size - 1;
            if (i3 >= i) {
                break;
            }
            com.bytedance.adsdk.ypw.uym.emc<T> emcVar = list.get(i3);
            i3++;
            com.bytedance.adsdk.ypw.uym.emc<T> emcVar2 = list.get(i3);
            emcVar.uym = Float.valueOf(emcVar2.ycc);
            if (emcVar.ypw == null && (t6 = emcVar2.emc) != null) {
                emcVar.ypw = t6;
                if (emcVar instanceof com.bytedance.adsdk.ypw.emc.ypw.zz) {
                    ((com.bytedance.adsdk.ypw.emc.ypw.zz) emcVar).emc();
                }
            }
        }
        com.bytedance.adsdk.ypw.uym.emc<T> emcVar3 = list.get(i);
        if ((emcVar3.emc == null || emcVar3.ypw == null) && list.size() > 1) {
            list.remove(emcVar3);
        }
    }
}

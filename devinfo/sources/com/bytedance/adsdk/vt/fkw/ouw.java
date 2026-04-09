package com.bytedance.adsdk.vt.fkw;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {
    public static com.bytedance.adsdk.vt.lh.ouw.fkw ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                JsonReader jsonReader2 = jsonReader;
                com.bytedance.adsdk.vt.ra raVar2 = raVar;
                arrayList.add(new com.bytedance.adsdk.vt.ouw.vt.bly(raVar2, vm.ouw(jsonReader2, raVar2, com.bytedance.adsdk.vt.le.pno.ouw(), ex.ouw, jsonReader.peek() == JsonToken.BEGIN_OBJECT, false)));
                jsonReader = jsonReader2;
                raVar = raVar2;
            }
            jsonReader.endArray();
            th.ouw(arrayList);
        } else {
            arrayList.add(new com.bytedance.adsdk.vt.ra.ouw(zih.vt(jsonReader, com.bytedance.adsdk.vt.le.pno.ouw())));
        }
        return new com.bytedance.adsdk.vt.lh.ouw.fkw(arrayList);
    }

    public static com.bytedance.adsdk.vt.lh.ouw.mwh<PointF, PointF> vt(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.vt.lh.ouw.fkw fkwVarOuw = null;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVarOuw = null;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVarOuw2 = null;
        boolean z3 = false;
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "k":
                    fkwVarOuw = ouw(jsonReader, raVar);
                    break;
                case "x":
                    if (jsonReader.peek() != JsonToken.STRING) {
                        vtVarOuw = yu.ouw(jsonReader, raVar, true);
                        break;
                    } else {
                        z3 = true;
                        jsonReader.skipValue();
                        break;
                    }
                case "y":
                    if (jsonReader.peek() != JsonToken.STRING) {
                        vtVarOuw2 = yu.ouw(jsonReader, raVar, true);
                        break;
                    } else {
                        z3 = true;
                        jsonReader.skipValue();
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z3) {
            raVar.ouw("Lottie doesn't support expressions.");
        }
        return fkwVarOuw != null ? fkwVarOuw : new com.bytedance.adsdk.vt.lh.ouw.bly(vtVarOuw, vtVarOuw2);
    }
}

package com.bytedance.adsdk.vt.fkw;

import android.util.JsonReader;
import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt {
    public static com.bytedance.adsdk.vt.lh.ouw.cf ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.vt.lh.ouw.cf cfVar = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("a")) {
                jsonReader.beginObject();
                com.bytedance.adsdk.vt.lh.ouw.ouw ouwVarYu = null;
                com.bytedance.adsdk.vt.lh.ouw.ouw ouwVarYu2 = null;
                com.bytedance.adsdk.vt.lh.ouw.vt vtVarOuw = null;
                com.bytedance.adsdk.vt.lh.ouw.vt vtVarOuw2 = null;
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    strNextName2.getClass();
                    switch (strNextName2) {
                        case "t":
                            vtVarOuw2 = yu.ouw(jsonReader, raVar, true);
                            break;
                        case "fc":
                            ouwVarYu = yu.yu(jsonReader, raVar);
                            break;
                        case "sc":
                            ouwVarYu2 = yu.yu(jsonReader, raVar);
                            break;
                        case "sw":
                            vtVarOuw = yu.ouw(jsonReader, raVar, true);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                cfVar = new com.bytedance.adsdk.vt.lh.ouw.cf(ouwVarYu, ouwVarYu2, vtVarOuw, vtVarOuw2);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return cfVar == null ? new com.bytedance.adsdk.vt.lh.ouw.cf(null, null, null, null) : cfVar;
    }
}

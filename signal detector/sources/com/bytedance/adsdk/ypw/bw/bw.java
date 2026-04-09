package com.bytedance.adsdk.ypw.bw;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
class bw {
    public static com.bytedance.adsdk.ypw.xq.ypw.emc emc(JsonReader jsonReader, com.bytedance.adsdk.ypw.uym uymVar) throws IOException {
        com.bytedance.adsdk.ypw.xq.ypw.emc emcVar = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("ef")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.bytedance.adsdk.ypw.xq.ypw.emc emcVarYpw = ypw(jsonReader, uymVar);
                    if (emcVarYpw != null) {
                        emcVar = emcVarYpw;
                    }
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        return emcVar;
    }

    private static com.bytedance.adsdk.ypw.xq.ypw.emc ypw(JsonReader jsonReader, com.bytedance.adsdk.ypw.uym uymVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.ypw.xq.ypw.emc emcVar = null;
        while (true) {
            boolean z6 = false;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("v")) {
                    if (z6) {
                        emcVar = new com.bytedance.adsdk.ypw.xq.ypw.emc(dg.emc(jsonReader, uymVar));
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (!strNextName.equals("ty")) {
                    jsonReader.skipValue();
                } else if (jsonReader.nextInt() == 0) {
                    z6 = true;
                }
            }
            jsonReader.endObject();
            return emcVar;
        }
    }
}

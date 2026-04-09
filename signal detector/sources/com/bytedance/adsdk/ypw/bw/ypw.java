package com.bytedance.adsdk.ypw.bw;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
public class ypw {
    public static com.bytedance.adsdk.ypw.xq.emc.gbl emc(JsonReader jsonReader, com.bytedance.adsdk.ypw.uym uymVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.ypw.xq.emc.gbl gblVarYpw = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("a")) {
                gblVarYpw = ypw(jsonReader, uymVar);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return gblVarYpw == null ? new com.bytedance.adsdk.ypw.xq.emc.gbl(null, null, null, null) : gblVarYpw;
    }

    private static com.bytedance.adsdk.ypw.xq.emc.gbl ypw(JsonReader jsonReader, com.bytedance.adsdk.ypw.uym uymVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.ypw.xq.emc.emc emcVarUym = null;
        com.bytedance.adsdk.ypw.xq.emc.emc emcVarUym2 = null;
        com.bytedance.adsdk.ypw.xq.emc.ypw ypwVarEmc = null;
        com.bytedance.adsdk.ypw.xq.emc.ypw ypwVarEmc2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "t":
                    ypwVarEmc2 = dg.emc(jsonReader, uymVar);
                    break;
                case "fc":
                    emcVarUym = dg.uym(jsonReader, uymVar);
                    break;
                case "sc":
                    emcVarUym2 = dg.uym(jsonReader, uymVar);
                    break;
                case "sw":
                    ypwVarEmc = dg.emc(jsonReader, uymVar);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.ypw.xq.emc.gbl(emcVarUym, emcVarUym2, ypwVarEmc, ypwVarEmc2);
    }
}

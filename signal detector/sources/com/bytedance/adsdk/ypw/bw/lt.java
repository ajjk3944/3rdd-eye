package com.bytedance.adsdk.ypw.bw;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
class lt {
    public static com.bytedance.adsdk.ypw.xq.ypw.sup emc(JsonReader jsonReader, com.bytedance.adsdk.ypw.uym uymVar) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.ypw.xq.emc.ypw ypwVarEmc = null;
        com.bytedance.adsdk.ypw.xq.emc.ypw ypwVarEmc2 = null;
        com.bytedance.adsdk.ypw.xq.emc.sup supVarEmc = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "c":
                    ypwVarEmc = dg.emc(jsonReader, uymVar, false);
                    break;
                case "o":
                    ypwVarEmc2 = dg.emc(jsonReader, uymVar, false);
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                case "tr":
                    supVarEmc = xq.emc(jsonReader, uymVar);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.ypw.xq.ypw.sup(strNextString, ypwVarEmc, ypwVarEmc2, supVarEmc, zNextBoolean);
    }
}

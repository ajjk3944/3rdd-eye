package com.bytedance.adsdk.ypw.bw;

import android.util.JsonReader;
import com.bytedance.adsdk.ypw.xq.ypw.yzg;
import java.io.IOException;

/* loaded from: classes.dex */
class ra {
    public static com.bytedance.adsdk.ypw.xq.ypw.yzg emc(JsonReader jsonReader, com.bytedance.adsdk.ypw.uym uymVar) throws IOException {
        String strNextString = null;
        yzg.emc emcVarEmc = null;
        com.bytedance.adsdk.ypw.xq.emc.ypw ypwVarEmc = null;
        com.bytedance.adsdk.ypw.xq.emc.ypw ypwVarEmc2 = null;
        com.bytedance.adsdk.ypw.xq.emc.ypw ypwVarEmc3 = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "e":
                    ypwVarEmc2 = dg.emc(jsonReader, uymVar, false);
                    break;
                case "m":
                    emcVarEmc = yzg.emc.emc(jsonReader.nextInt());
                    break;
                case "o":
                    ypwVarEmc3 = dg.emc(jsonReader, uymVar, false);
                    break;
                case "s":
                    ypwVarEmc = dg.emc(jsonReader, uymVar, false);
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.ypw.xq.ypw.yzg(strNextString, emcVarEmc, ypwVarEmc, ypwVarEmc2, ypwVarEmc3, zNextBoolean);
    }
}

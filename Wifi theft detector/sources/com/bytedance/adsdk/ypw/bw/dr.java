package com.bytedance.adsdk.ypw.bw;

import android.graphics.PointF;
import android.util.JsonReader;
import com.bytedance.adsdk.ypw.xq.ypw.ru;
import java.io.IOException;

/* loaded from: classes.dex */
class dr {
    public static com.bytedance.adsdk.ypw.xq.ypw.ru emc(JsonReader jsonReader, com.bytedance.adsdk.ypw.uym uymVar, int i10) throws IOException {
        boolean zNextBoolean = false;
        boolean z10 = i10 == 3;
        String strNextString = null;
        ru.emc emcVarEmc = null;
        com.bytedance.adsdk.ypw.xq.emc.ypw ypwVarEmc = null;
        com.bytedance.adsdk.ypw.xq.emc.sz<PointF, PointF> szVarYpw = null;
        com.bytedance.adsdk.ypw.xq.emc.ypw ypwVarEmc2 = null;
        com.bytedance.adsdk.ypw.xq.emc.ypw ypwVarEmc3 = null;
        com.bytedance.adsdk.ypw.xq.emc.ypw ypwVarEmc4 = null;
        com.bytedance.adsdk.ypw.xq.emc.ypw ypwVarEmc5 = null;
        com.bytedance.adsdk.ypw.xq.emc.ypw ypwVarEmc6 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "d":
                    if (jsonReader.nextInt() != 3) {
                        z10 = false;
                        break;
                    } else {
                        z10 = true;
                        break;
                    }
                case "p":
                    szVarYpw = emc.ypw(jsonReader, uymVar);
                    break;
                case "r":
                    ypwVarEmc2 = dg.emc(jsonReader, uymVar, false);
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "ir":
                    ypwVarEmc3 = dg.emc(jsonReader, uymVar);
                    break;
                case "is":
                    ypwVarEmc5 = dg.emc(jsonReader, uymVar, false);
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                case "or":
                    ypwVarEmc4 = dg.emc(jsonReader, uymVar);
                    break;
                case "os":
                    ypwVarEmc6 = dg.emc(jsonReader, uymVar, false);
                    break;
                case "pt":
                    ypwVarEmc = dg.emc(jsonReader, uymVar, false);
                    break;
                case "sy":
                    emcVarEmc = ru.emc.emc(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.ypw.xq.ypw.ru(strNextString, emcVarEmc, ypwVarEmc, szVarYpw, ypwVarEmc2, ypwVarEmc3, ypwVarEmc4, ypwVarEmc5, ypwVarEmc6, zNextBoolean, z10);
    }
}

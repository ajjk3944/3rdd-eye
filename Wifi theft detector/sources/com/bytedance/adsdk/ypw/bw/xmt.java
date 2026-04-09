package com.bytedance.adsdk.ypw.bw;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
class xmt {
    public static com.bytedance.adsdk.ypw.xq.ypw.gbl emc(JsonReader jsonReader, com.bytedance.adsdk.ypw.uym uymVar) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.ypw.xq.emc.sz<PointF, PointF> szVarYpw = null;
        com.bytedance.adsdk.ypw.xq.emc.ycc yccVarXq = null;
        com.bytedance.adsdk.ypw.xq.emc.ypw ypwVarEmc = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "p":
                    szVarYpw = emc.ypw(jsonReader, uymVar);
                    break;
                case "r":
                    ypwVarEmc = dg.emc(jsonReader, uymVar);
                    break;
                case "s":
                    yccVarXq = dg.xq(jsonReader, uymVar);
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
        return new com.bytedance.adsdk.ypw.xq.ypw.gbl(strNextString, szVarYpw, yccVarXq, ypwVarEmc, zNextBoolean);
    }
}

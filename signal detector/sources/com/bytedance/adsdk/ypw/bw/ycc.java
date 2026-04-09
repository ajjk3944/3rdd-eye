package com.bytedance.adsdk.ypw.bw;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
class ycc {
    public static com.bytedance.adsdk.ypw.xq.ypw.ypw emc(JsonReader jsonReader, com.bytedance.adsdk.ypw.uym uymVar, int i) throws IOException {
        boolean z6 = i == 3;
        boolean zNextBoolean = false;
        String strNextString = null;
        com.bytedance.adsdk.ypw.xq.emc.sz<PointF, PointF> szVarYpw = null;
        com.bytedance.adsdk.ypw.xq.emc.ycc yccVarXq = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "d":
                    if (jsonReader.nextInt() != 3) {
                        z6 = false;
                        break;
                    } else {
                        z6 = true;
                        break;
                    }
                case "p":
                    szVarYpw = emc.ypw(jsonReader, uymVar);
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
        return new com.bytedance.adsdk.ypw.xq.ypw.ypw(strNextString, szVarYpw, yccVarXq, z6, zNextBoolean);
    }
}

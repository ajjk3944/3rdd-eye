package com.bytedance.adsdk.ypw.bw;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
public class cuf {
    public static com.bytedance.adsdk.ypw.xq.ypw.sz emc(JsonReader jsonReader, com.bytedance.adsdk.ypw.uym uymVar) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.ypw.xq.emc.ypw ypwVarEmc = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "r":
                    ypwVarEmc = dg.emc(jsonReader, uymVar, true);
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
        if (zNextBoolean) {
            return null;
        }
        return new com.bytedance.adsdk.ypw.xq.ypw.sz(strNextString, ypwVarEmc);
    }
}

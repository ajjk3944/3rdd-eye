package com.bytedance.adsdk.ypw.bw;

import android.util.JsonReader;
import com.bytedance.adsdk.ypw.xq.ypw.zz;
import java.io.IOException;

/* loaded from: classes.dex */
class ee {
    public static com.bytedance.adsdk.ypw.xq.ypw.zz emc(JsonReader jsonReader) throws IOException {
        String strNextString = null;
        zz.emc emcVarEmc = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "mm":
                    emcVarEmc = zz.emc.emc(jsonReader.nextInt());
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.ypw.xq.ypw.zz(strNextString, emcVarEmc, zNextBoolean);
    }
}

package com.bytedance.adsdk.ypw.bw;

import android.graphics.Path;
import android.util.JsonReader;
import java.io.IOException;
import java.util.Collections;

/* loaded from: classes.dex */
class iyl {
    public static com.bytedance.adsdk.ypw.xq.ypw.cf emc(JsonReader jsonReader, com.bytedance.adsdk.ypw.uym uymVar) throws IOException {
        com.bytedance.adsdk.ypw.xq.emc.dg dgVar = null;
        String strNextString = null;
        com.bytedance.adsdk.ypw.xq.emc.emc emcVarUym = null;
        boolean zNextBoolean = false;
        boolean zNextBoolean2 = false;
        int iNextInt = 1;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "fillEnabled":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "c":
                    emcVarUym = dg.uym(jsonReader, uymVar);
                    break;
                case "o":
                    dgVar = dg.ypw(jsonReader, uymVar);
                    break;
                case "r":
                    iNextInt = jsonReader.nextInt();
                    break;
                case "hd":
                    zNextBoolean2 = jsonReader.nextBoolean();
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        if (dgVar == null) {
            dgVar = new com.bytedance.adsdk.ypw.xq.emc.dg(Collections.singletonList(new com.bytedance.adsdk.ypw.uym.emc(100)));
        }
        return new com.bytedance.adsdk.ypw.xq.ypw.cf(strNextString, zNextBoolean, iNextInt == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, emcVarUym, dgVar, zNextBoolean2);
    }
}

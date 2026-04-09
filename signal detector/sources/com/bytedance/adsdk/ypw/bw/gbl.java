package com.bytedance.adsdk.ypw.bw;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes.dex */
public class gbl {
    private com.bytedance.adsdk.ypw.xq.emc.ypw bw;
    private com.bytedance.adsdk.ypw.xq.emc.ypw dg;
    private com.bytedance.adsdk.ypw.xq.emc.emc emc;
    private com.bytedance.adsdk.ypw.xq.emc.ypw xq;
    private com.bytedance.adsdk.ypw.xq.emc.ypw ypw;

    private void ypw(JsonReader jsonReader, com.bytedance.adsdk.ypw.uym uymVar) throws IOException {
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("v")) {
                strNextString.getClass();
                switch (strNextString) {
                    case "Distance":
                        this.dg = dg.emc(jsonReader, uymVar);
                        break;
                    case "Opacity":
                        this.ypw = dg.emc(jsonReader, uymVar, false);
                        break;
                    case "Direction":
                        this.xq = dg.emc(jsonReader, uymVar, false);
                        break;
                    case "Shadow Color":
                        this.emc = dg.uym(jsonReader, uymVar);
                        break;
                    case "Softness":
                        this.bw = dg.emc(jsonReader, uymVar);
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            } else if (strNextName.equals("nm")) {
                strNextString = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    public ru emc(JsonReader jsonReader, com.bytedance.adsdk.ypw.uym uymVar) throws IOException {
        com.bytedance.adsdk.ypw.xq.emc.ypw ypwVar;
        com.bytedance.adsdk.ypw.xq.emc.ypw ypwVar2;
        com.bytedance.adsdk.ypw.xq.emc.ypw ypwVar3;
        com.bytedance.adsdk.ypw.xq.emc.ypw ypwVar4;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("ef")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    ypw(jsonReader, uymVar);
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        com.bytedance.adsdk.ypw.xq.emc.emc emcVar = this.emc;
        if (emcVar == null || (ypwVar = this.ypw) == null || (ypwVar2 = this.xq) == null || (ypwVar3 = this.dg) == null || (ypwVar4 = this.bw) == null) {
            return null;
        }
        return new ru(emcVar, ypwVar, ypwVar2, ypwVar3, ypwVar4);
    }
}

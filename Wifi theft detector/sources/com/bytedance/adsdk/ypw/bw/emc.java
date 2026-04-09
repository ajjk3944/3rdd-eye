package com.bytedance.adsdk.ypw.bw;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class emc {
    public static com.bytedance.adsdk.ypw.xq.emc.bw emc(JsonReader jsonReader, com.bytedance.adsdk.ypw.uym uymVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(db.emc(jsonReader, uymVar));
            }
            jsonReader.endArray();
            ylm.emc(arrayList);
        } else {
            arrayList.add(new com.bytedance.adsdk.ypw.uym.emc(yzg.ypw(jsonReader, com.bytedance.adsdk.ypw.ycc.ycc.emc())));
        }
        return new com.bytedance.adsdk.ypw.xq.emc.bw(arrayList);
    }

    public static com.bytedance.adsdk.ypw.xq.emc.sz<PointF, PointF> ypw(JsonReader jsonReader, com.bytedance.adsdk.ypw.uym uymVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.ypw.xq.emc.bw bwVarEmc = null;
        com.bytedance.adsdk.ypw.xq.emc.ypw ypwVarEmc = null;
        com.bytedance.adsdk.ypw.xq.emc.ypw ypwVarEmc2 = null;
        boolean z10 = false;
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "k":
                    bwVarEmc = emc(jsonReader, uymVar);
                    break;
                case "x":
                    if (jsonReader.peek() != JsonToken.STRING) {
                        ypwVarEmc = dg.emc(jsonReader, uymVar);
                        break;
                    } else {
                        z10 = true;
                        jsonReader.skipValue();
                        break;
                    }
                case "y":
                    if (jsonReader.peek() != JsonToken.STRING) {
                        ypwVarEmc2 = dg.emc(jsonReader, uymVar);
                        break;
                    } else {
                        z10 = true;
                        jsonReader.skipValue();
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z10) {
            uymVar.emc("Lottie doesn't support expressions.");
        }
        return bwVarEmc != null ? bwVarEmc : new com.bytedance.adsdk.ypw.xq.emc.zz(ypwVarEmc, ypwVarEmc2);
    }
}

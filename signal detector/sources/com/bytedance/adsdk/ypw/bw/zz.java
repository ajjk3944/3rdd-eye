package com.bytedance.adsdk.ypw.bw;

import android.graphics.PointF;
import android.util.JsonReader;
import com.bytedance.adsdk.ypw.xq.ypw;
import java.io.IOException;

/* loaded from: classes.dex */
public class zz implements wo<com.bytedance.adsdk.ypw.xq.ypw> {
    public static final zz emc = new zz();

    private zz() {
    }

    @Override // com.bytedance.adsdk.ypw.bw.wo
    /* renamed from: emc, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ypw.xq.ypw ypw(JsonReader jsonReader, float f2) throws IOException {
        ypw.emc emcVar = ypw.emc.CENTER;
        jsonReader.beginObject();
        ypw.emc emcVar2 = emcVar;
        String strNextString = null;
        String strNextString2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        int iNextInt = 0;
        int iEmc = 0;
        int iEmc2 = 0;
        boolean zNextBoolean = true;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "f":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "j":
                    int iNextInt2 = jsonReader.nextInt();
                    emcVar2 = ypw.emc.CENTER;
                    if (iNextInt2 <= emcVar2.ordinal() && iNextInt2 >= 0) {
                        emcVar2 = ypw.emc.values()[iNextInt2];
                        break;
                    } else {
                        break;
                    }
                    break;
                case "s":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "t":
                    strNextString = jsonReader.nextString();
                    break;
                case "fc":
                    iEmc = yzg.emc(jsonReader);
                    break;
                case "lh":
                    fNextDouble2 = (float) jsonReader.nextDouble();
                    break;
                case "ls":
                    fNextDouble3 = (float) jsonReader.nextDouble();
                    break;
                case "of":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "ps":
                    jsonReader.beginArray();
                    PointF pointF3 = new PointF(((float) jsonReader.nextDouble()) * f2, ((float) jsonReader.nextDouble()) * f2);
                    jsonReader.endArray();
                    pointF = pointF3;
                    break;
                case "sc":
                    iEmc2 = yzg.emc(jsonReader);
                    break;
                case "sw":
                    fNextDouble4 = (float) jsonReader.nextDouble();
                    break;
                case "sz":
                    jsonReader.beginArray();
                    PointF pointF4 = new PointF(((float) jsonReader.nextDouble()) * f2, ((float) jsonReader.nextDouble()) * f2);
                    jsonReader.endArray();
                    pointF2 = pointF4;
                    break;
                case "tr":
                    iNextInt = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.ypw.xq.ypw(strNextString, strNextString2, fNextDouble, emcVar2, iNextInt, fNextDouble2, fNextDouble3, iEmc, iEmc2, fNextDouble4, zNextBoolean, pointF, pointF2);
    }
}

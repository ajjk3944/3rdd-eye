package com.bytedance.adsdk.vt.fkw;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class jae {
    public static com.bytedance.adsdk.vt.lh.vt.cf ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.vt.lh.ouw.mwh<PointF, PointF> mwhVarVt = null;
        com.bytedance.adsdk.vt.lh.ouw.le leVarVt = null;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVarOuw = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "p":
                    mwhVarVt = ouw.vt(jsonReader, raVar);
                    break;
                case "r":
                    vtVarOuw = yu.ouw(jsonReader, raVar, true);
                    break;
                case "s":
                    leVarVt = yu.vt(jsonReader, raVar);
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
        return new com.bytedance.adsdk.vt.lh.vt.cf(strNextString, mwhVarVt, leVarVt, vtVarOuw, zNextBoolean);
    }
}

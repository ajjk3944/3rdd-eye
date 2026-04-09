package com.bytedance.adsdk.vt.fkw;

import android.util.JsonReader;
import com.bytedance.adsdk.vt.lh.vt.th;
import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class uoy {
    public static com.bytedance.adsdk.vt.lh.vt.th ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar) throws IOException {
        String strNextString = null;
        th.ouw ouwVarOuw = null;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVarOuw = null;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVarOuw2 = null;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVarOuw3 = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "e":
                    vtVarOuw2 = yu.ouw(jsonReader, raVar, false);
                    break;
                case "m":
                    ouwVarOuw = th.ouw.ouw(jsonReader.nextInt());
                    break;
                case "o":
                    vtVarOuw3 = yu.ouw(jsonReader, raVar, false);
                    break;
                case "s":
                    vtVarOuw = yu.ouw(jsonReader, raVar, false);
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
        return new com.bytedance.adsdk.vt.lh.vt.th(strNextString, ouwVarOuw, vtVarOuw, vtVarOuw2, vtVarOuw3, zNextBoolean);
    }
}

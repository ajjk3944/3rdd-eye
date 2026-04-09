package com.bytedance.adsdk.vt.fkw;

import android.util.JsonReader;
import com.bytedance.adsdk.vt.lh.vt.bly;
import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class jqy {
    public static com.bytedance.adsdk.vt.lh.vt.bly ouw(JsonReader jsonReader) throws IOException {
        String strNextString = null;
        bly.ouw ouwVarOuw = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "mm":
                    ouwVarOuw = bly.ouw.ouw(jsonReader.nextInt());
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.vt.lh.vt.bly(strNextString, ouwVarOuw, zNextBoolean);
    }
}

package com.bytedance.adsdk.vt.fkw;

import android.util.JsonReader;
import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class fkw {
    public static com.bytedance.adsdk.vt.lh.vt.ouw ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar) throws IOException {
        com.bytedance.adsdk.vt.lh.vt.ouw ouwVar = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("ef")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    com.bytedance.adsdk.vt.lh.vt.ouw ouwVar2 = null;
                    while (true) {
                        boolean z3 = false;
                        while (jsonReader.hasNext()) {
                            String strNextName2 = jsonReader.nextName();
                            strNextName2.getClass();
                            if (strNextName2.equals("v")) {
                                if (z3) {
                                    ouwVar2 = new com.bytedance.adsdk.vt.lh.vt.ouw(yu.ouw(jsonReader, raVar, true));
                                } else {
                                    jsonReader.skipValue();
                                }
                            } else if (!strNextName2.equals("ty")) {
                                jsonReader.skipValue();
                            } else if (jsonReader.nextInt() == 0) {
                                z3 = true;
                            }
                        }
                    }
                    jsonReader.endObject();
                    if (ouwVar2 != null) {
                        ouwVar = ouwVar2;
                    }
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        return ouwVar;
    }
}

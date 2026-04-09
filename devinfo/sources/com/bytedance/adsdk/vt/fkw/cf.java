package com.bytedance.adsdk.vt.fkw;

import android.util.JsonReader;
import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class cf {
    private com.bytedance.adsdk.vt.lh.ouw.vt fkw;

    /* renamed from: lh, reason: collision with root package name */
    private com.bytedance.adsdk.vt.lh.ouw.vt f7039lh;
    private com.bytedance.adsdk.vt.lh.ouw.ouw ouw;
    private com.bytedance.adsdk.vt.lh.ouw.vt vt;
    private com.bytedance.adsdk.vt.lh.ouw.vt yu;

    public final tlj ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar) throws IOException {
        com.bytedance.adsdk.vt.lh.ouw.vt vtVar;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVar2;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVar3;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVar4;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("ef")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String strNextString = "";
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("v")) {
                            strNextString.getClass();
                            switch (strNextString) {
                                case "Distance":
                                    this.yu = yu.ouw(jsonReader, raVar, true);
                                    break;
                                case "Opacity":
                                    this.vt = yu.ouw(jsonReader, raVar, false);
                                    break;
                                case "Direction":
                                    this.f7039lh = yu.ouw(jsonReader, raVar, false);
                                    break;
                                case "Shadow Color":
                                    this.ouw = yu.yu(jsonReader, raVar);
                                    break;
                                case "Softness":
                                    this.fkw = yu.ouw(jsonReader, raVar, true);
                                    break;
                                default:
                                    jsonReader.skipValue();
                                    break;
                            }
                        } else if (strNextName2.equals("nm")) {
                            strNextString = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        com.bytedance.adsdk.vt.lh.ouw.ouw ouwVar = this.ouw;
        if (ouwVar == null || (vtVar = this.vt) == null || (vtVar2 = this.f7039lh) == null || (vtVar3 = this.yu) == null || (vtVar4 = this.fkw) == null) {
            return null;
        }
        return new tlj(ouwVar, vtVar, vtVar2, vtVar3, vtVar4);
    }
}

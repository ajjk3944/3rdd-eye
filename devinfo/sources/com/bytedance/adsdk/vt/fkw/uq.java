package com.bytedance.adsdk.vt.fkw;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class uq implements osn<com.bytedance.adsdk.vt.ra.lh> {
    public static final uq ouw = new uq();

    private uq() {
    }

    @Override // com.bytedance.adsdk.vt.fkw.osn
    public final /* synthetic */ com.bytedance.adsdk.vt.ra.lh ouw(JsonReader jsonReader, float f10) throws IOException {
        boolean z3 = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z3) {
            jsonReader.beginArray();
        }
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z3) {
            jsonReader.endArray();
        }
        return new com.bytedance.adsdk.vt.ra.lh((fNextDouble / 100.0f) * f10, (fNextDouble2 / 100.0f) * f10);
    }
}

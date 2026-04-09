package com.bytedance.adsdk.ypw.bw;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* loaded from: classes.dex */
public class rtt implements wo<com.bytedance.adsdk.ypw.uym.xq> {
    public static final rtt emc = new rtt();

    private rtt() {
    }

    @Override // com.bytedance.adsdk.ypw.bw.wo
    /* renamed from: emc, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ypw.uym.xq ypw(JsonReader jsonReader, float f2) throws IOException {
        boolean z6 = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z6) {
            jsonReader.beginArray();
        }
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z6) {
            jsonReader.endArray();
        }
        return new com.bytedance.adsdk.ypw.uym.xq((fNextDouble / 100.0f) * f2, (fNextDouble2 / 100.0f) * f2);
    }
}

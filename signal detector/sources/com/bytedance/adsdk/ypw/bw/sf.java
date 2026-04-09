package com.bytedance.adsdk.ypw.bw;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* loaded from: classes.dex */
public class sf implements wo<PointF> {
    public static final sf emc = new sf();

    private sf() {
    }

    @Override // com.bytedance.adsdk.ypw.bw.wo
    /* renamed from: emc, reason: merged with bridge method [inline-methods] */
    public PointF ypw(JsonReader jsonReader, float f2) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        if (jsonTokenPeek == JsonToken.BEGIN_ARRAY) {
            return yzg.ypw(jsonReader, f2);
        }
        if (jsonTokenPeek == JsonToken.BEGIN_OBJECT) {
            return yzg.ypw(jsonReader, f2);
        }
        if (jsonTokenPeek != JsonToken.NUMBER) {
            throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(String.valueOf(jsonTokenPeek)));
        }
        PointF pointF = new PointF(((float) jsonReader.nextDouble()) * f2, ((float) jsonReader.nextDouble()) * f2);
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        return pointF;
    }
}

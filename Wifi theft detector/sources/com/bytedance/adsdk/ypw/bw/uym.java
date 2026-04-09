package com.bytedance.adsdk.ypw.bw;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* loaded from: classes.dex */
public class uym implements wo<Integer> {
    public static final uym emc = new uym();

    private uym() {
    }

    @Override // com.bytedance.adsdk.ypw.bw.wo
    /* renamed from: emc, reason: merged with bridge method [inline-methods] */
    public Integer ypw(JsonReader jsonReader, float f10) throws IOException {
        boolean z10 = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z10) {
            jsonReader.beginArray();
        }
        double dNextDouble = jsonReader.nextDouble();
        double dNextDouble2 = jsonReader.nextDouble();
        double dNextDouble3 = jsonReader.nextDouble();
        double dNextDouble4 = jsonReader.peek() == JsonToken.NUMBER ? jsonReader.nextDouble() : 1.0d;
        if (z10) {
            jsonReader.endArray();
        }
        if (dNextDouble <= 1.0d && dNextDouble2 <= 1.0d && dNextDouble3 <= 1.0d) {
            dNextDouble *= 255.0d;
            dNextDouble2 *= 255.0d;
            dNextDouble3 *= 255.0d;
            if (dNextDouble4 <= 1.0d) {
                dNextDouble4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dNextDouble4, (int) dNextDouble, (int) dNextDouble2, (int) dNextDouble3));
    }
}

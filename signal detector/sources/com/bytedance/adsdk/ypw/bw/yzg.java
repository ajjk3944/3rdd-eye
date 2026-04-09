package com.bytedance.adsdk.ypw.bw;

import android.graphics.Color;
import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class yzg {

    /* renamed from: com.bytedance.adsdk.ypw.bw.yzg$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] emc;

        static {
            int[] iArr = new int[JsonToken.values().length];
            emc = iArr;
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                emc[JsonToken.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                emc[JsonToken.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static PointF bw(JsonReader jsonReader, float f2) throws IOException {
        jsonReader.beginObject();
        float fYpw = 0.0f;
        float fYpw2 = 0.0f;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("x")) {
                fYpw = ypw(jsonReader);
            } else if (strNextName.equals("y")) {
                fYpw2 = ypw(jsonReader);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return new PointF(fYpw * f2, fYpw2 * f2);
    }

    private static PointF dg(JsonReader jsonReader, float f2) throws IOException {
        jsonReader.beginArray();
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.peek() != JsonToken.END_ARRAY) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return new PointF(fNextDouble * f2, fNextDouble2 * f2);
    }

    public static int emc(JsonReader jsonReader) throws IOException {
        jsonReader.beginArray();
        int iNextDouble = (int) (jsonReader.nextDouble() * 255.0d);
        int iNextDouble2 = (int) (jsonReader.nextDouble() * 255.0d);
        int iNextDouble3 = (int) (jsonReader.nextDouble() * 255.0d);
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return Color.argb(255, iNextDouble, iNextDouble2, iNextDouble3);
    }

    private static PointF xq(JsonReader jsonReader, float f2) throws IOException {
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        return new PointF(fNextDouble * f2, fNextDouble2 * f2);
    }

    public static PointF ypw(JsonReader jsonReader, float f2) {
        int i = AnonymousClass1.emc[jsonReader.peek().ordinal()];
        if (i == 1) {
            return xq(jsonReader, f2);
        }
        if (i == 2) {
            return dg(jsonReader, f2);
        }
        if (i == 3) {
            return bw(jsonReader, f2);
        }
        throw new IllegalArgumentException("Unknown point starts with " + jsonReader.peek());
    }

    public static float ypw(JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        int i = AnonymousClass1.emc[jsonTokenPeek.ordinal()];
        if (i == 1) {
            return (float) jsonReader.nextDouble();
        }
        if (i == 2) {
            jsonReader.beginArray();
            float fNextDouble = (float) jsonReader.nextDouble();
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            jsonReader.endArray();
            return fNextDouble;
        }
        throw new IllegalArgumentException("Unknown value for token of type ".concat(String.valueOf(jsonTokenPeek)));
    }

    public static List<PointF> emc(JsonReader jsonReader, float f2) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            arrayList.add(ypw(jsonReader, f2));
            jsonReader.endArray();
        }
        jsonReader.endArray();
        return arrayList;
    }
}

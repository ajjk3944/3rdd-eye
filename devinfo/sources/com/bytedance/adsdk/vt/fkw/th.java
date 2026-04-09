package com.bytedance.adsdk.vt.fkw;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class th {
    public static <T> List<com.bytedance.adsdk.vt.ra.ouw<T>> ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar, float f10, osn<T> osnVar, boolean z3) throws IOException {
        JsonReader jsonReader2;
        com.bytedance.adsdk.vt.ra raVar2;
        float f11;
        osn<T> osnVar2;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            raVar.ouw("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals("k")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                if (jsonReader.peek() == JsonToken.NUMBER) {
                    JsonReader jsonReader3 = jsonReader;
                    com.bytedance.adsdk.vt.ra raVar3 = raVar;
                    float f12 = f10;
                    osn<T> osnVar3 = osnVar;
                    boolean z11 = z3;
                    com.bytedance.adsdk.vt.ra.ouw ouwVarOuw = vm.ouw(jsonReader3, raVar3, f12, osnVar3, false, z11);
                    jsonReader2 = jsonReader3;
                    raVar2 = raVar3;
                    f11 = f12;
                    osnVar2 = osnVar3;
                    z10 = z11;
                    arrayList.add(ouwVarOuw);
                } else {
                    jsonReader2 = jsonReader;
                    raVar2 = raVar;
                    f11 = f10;
                    osnVar2 = osnVar;
                    z10 = z3;
                    while (jsonReader2.hasNext()) {
                        arrayList.add(vm.ouw(jsonReader2, raVar2, f11, osnVar2, true, z10));
                    }
                }
                jsonReader2.endArray();
                jsonReader = jsonReader2;
                raVar = raVar2;
                f10 = f11;
                osnVar = osnVar2;
                z3 = z10;
            } else {
                JsonReader jsonReader4 = jsonReader;
                arrayList.add(vm.ouw(jsonReader4, raVar, f10, osnVar, false, z3));
                jsonReader = jsonReader4;
            }
        }
        jsonReader.endObject();
        ouw(arrayList);
        return arrayList;
    }

    public static <T> void ouw(List<? extends com.bytedance.adsdk.vt.ra.ouw<T>> list) {
        int i4;
        T t10;
        int size = list.size();
        int i10 = 0;
        while (true) {
            i4 = size - 1;
            if (i10 >= i4) {
                break;
            }
            com.bytedance.adsdk.vt.ra.ouw<T> ouwVar = list.get(i10);
            i10++;
            com.bytedance.adsdk.vt.ra.ouw<T> ouwVar2 = list.get(i10);
            ouwVar.pno = Float.valueOf(ouwVar2.ra);
            if (ouwVar.f7205lh == null && (t10 = ouwVar2.vt) != null) {
                ouwVar.f7205lh = t10;
                if (ouwVar instanceof com.bytedance.adsdk.vt.ouw.vt.bly) {
                    ((com.bytedance.adsdk.vt.ouw.vt.bly) ouwVar).ouw();
                }
            }
        }
        com.bytedance.adsdk.vt.ra.ouw<T> ouwVar3 = list.get(i4);
        if ((ouwVar3.vt == null || ouwVar3.f7205lh == null) && list.size() > 1) {
            list.remove(ouwVar3);
        }
    }
}

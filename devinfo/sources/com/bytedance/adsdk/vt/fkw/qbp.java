package com.bytedance.adsdk.vt.fkw;

import android.graphics.Color;
import android.graphics.Rect;
import android.util.JsonReader;
import com.bytedance.adsdk.vt.lh.lh.fkw;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class qbp {

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.adsdk.vt.fkw.qbp$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ouw;

        static {
            int[] iArr = new int[fkw.vt.values().length];
            ouw = iArr;
            try {
                iArr[fkw.vt.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ouw[fkw.vt.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static com.bytedance.adsdk.vt.lh.lh.fkw ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar) throws IOException {
        Float f10;
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        fkw.vt vtVar = fkw.vt.NONE;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        fkw.vt vtVar2 = vtVar;
        String strNextString = null;
        com.bytedance.adsdk.vt.lh.ouw.ryl rylVarOuw = null;
        com.bytedance.adsdk.vt.lh.ouw.tlj tljVar = null;
        com.bytedance.adsdk.vt.lh.ouw.cf cfVarOuw = null;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVarOuw = null;
        com.bytedance.adsdk.vt.lh.vt.ouw ouwVarOuw = null;
        tlj tljVarOuw = null;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        float fNextDouble5 = 0.0f;
        long jNextInt = 0;
        long jNextInt2 = -1;
        int iOuw = 0;
        int iOuw2 = 0;
        int color = 0;
        boolean zNextBoolean = false;
        float fNextDouble6 = 1.0f;
        String strNextString2 = "UNSET";
        String strNextString3 = null;
        fkw.ouw ouwVar = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "parent":
                    jNextInt2 = jsonReader.nextInt();
                    break;
                case "shapes":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com.bytedance.adsdk.vt.lh.vt.lh lhVarOuw = pno.ouw(jsonReader, raVar);
                        if (lhVarOuw != null) {
                            arrayList2.add(lhVarOuw);
                        }
                    }
                    jsonReader.endArray();
                    break;
                case "h":
                    fNextDouble4 = (float) (jsonReader.nextDouble() * com.bytedance.adsdk.vt.le.pno.ouw());
                    break;
                case "t":
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("a")) {
                            jsonReader.beginArray();
                            if (jsonReader.hasNext()) {
                                cfVarOuw = vt.ouw(jsonReader, raVar);
                            }
                            while (jsonReader.hasNext()) {
                                jsonReader.skipValue();
                            }
                            jsonReader.endArray();
                        } else if (strNextName2.equals("d")) {
                            tljVar = new com.bytedance.adsdk.vt.lh.ouw.tlj(yu.ouw(jsonReader, com.bytedance.adsdk.vt.le.pno.ouw(), raVar, bly.ouw));
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    break;
                case "w":
                    fNextDouble3 = (float) (jsonReader.nextDouble() * com.bytedance.adsdk.vt.le.pno.ouw());
                    break;
                case "cl":
                    strNextString3 = jsonReader.nextString();
                    break;
                case "ef":
                    jsonReader.beginArray();
                    ArrayList arrayList3 = new ArrayList();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String strNextName3 = jsonReader.nextName();
                            strNextName3.getClass();
                            if (strNextName3.equals("nm")) {
                                arrayList3.add(jsonReader.nextString());
                            } else if (strNextName3.equals("ty")) {
                                int iNextInt = jsonReader.nextInt();
                                if (iNextInt == 29) {
                                    ouwVarOuw = fkw.ouw(jsonReader, raVar);
                                } else if (iNextInt == 25) {
                                    tljVarOuw = new cf().ouw(jsonReader, raVar);
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                    }
                    jsonReader.endArray();
                    raVar.ouw("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ".concat(String.valueOf(arrayList3)));
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "ip":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "ks":
                    rylVarOuw = lh.ouw(jsonReader, raVar);
                    break;
                case "nm":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "op":
                    fNextDouble2 = (float) jsonReader.nextDouble();
                    break;
                case "sc":
                    color = Color.parseColor(jsonReader.nextString());
                    break;
                case "sh":
                    iOuw2 = (int) (com.bytedance.adsdk.vt.le.pno.ouw() * jsonReader.nextInt());
                    break;
                case "sr":
                    fNextDouble6 = (float) jsonReader.nextDouble();
                    break;
                case "st":
                    fNextDouble5 = (float) jsonReader.nextDouble();
                    break;
                case "sw":
                    iOuw = (int) (com.bytedance.adsdk.vt.le.pno.ouw() * jsonReader.nextInt());
                    break;
                case "tm":
                    vtVarOuw = yu.ouw(jsonReader, raVar, false);
                    break;
                case "tt":
                    int iNextInt2 = jsonReader.nextInt();
                    if (iNextInt2 < fkw.vt.values().length) {
                        vtVar2 = fkw.vt.values()[iNextInt2];
                        int i4 = AnonymousClass1.ouw[vtVar2.ordinal()];
                        if (i4 == 1) {
                            raVar.ouw("Unsupported matte type: Luma");
                        } else if (i4 == 2) {
                            raVar.ouw("Unsupported matte type: Luma Inverted");
                        }
                        raVar.ouw(1);
                        break;
                    } else {
                        raVar.ouw("Unsupported matte type: ".concat(String.valueOf(iNextInt2)));
                        break;
                    }
                case "ty":
                    int iNextInt3 = jsonReader.nextInt();
                    ouwVar = fkw.ouw.UNKNOWN;
                    if (iNextInt3 >= ouwVar.ordinal()) {
                        break;
                    } else {
                        ouwVar = fkw.ouw.values()[iNextInt3];
                        break;
                    }
                case "ind":
                    jNextInt = jsonReader.nextInt();
                    break;
                case "refId":
                    strNextString = jsonReader.nextString();
                    break;
                case "masksProperties":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList.add(vpp.ouw(jsonReader, raVar));
                    }
                    raVar.ouw(arrayList.size());
                    jsonReader.endArray();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        ArrayList arrayList4 = new ArrayList();
        if (fNextDouble > 0.0f) {
            f10 = fValueOf;
            arrayList4.add(new com.bytedance.adsdk.vt.ra.ouw(raVar, fValueOf, fValueOf, null, 0.0f, Float.valueOf(fNextDouble)));
        } else {
            f10 = fValueOf;
        }
        if (fNextDouble2 <= 0.0f) {
            fNextDouble2 = raVar.f7195cf;
        }
        arrayList4.add(new com.bytedance.adsdk.vt.ra.ouw(raVar, fValueOf2, fValueOf2, null, fNextDouble, Float.valueOf(fNextDouble2)));
        arrayList4.add(new com.bytedance.adsdk.vt.ra.ouw(raVar, f10, f10, null, fNextDouble2, Float.valueOf(Float.MAX_VALUE)));
        if (strNextString2.endsWith(".ai") || "ai".equals(strNextString3)) {
            raVar.ouw("Convert your Illustrator layers to shape layers.");
        }
        return new com.bytedance.adsdk.vt.lh.lh.fkw(arrayList2, raVar, strNextString2, jNextInt, ouwVar, jNextInt2, strNextString, arrayList, rylVarOuw, iOuw, iOuw2, color, fNextDouble6, fNextDouble5, fNextDouble3, fNextDouble4, tljVar, cfVarOuw, arrayList4, vtVar2, vtVarOuw, zNextBoolean, ouwVarOuw, tljVarOuw);
    }

    public static com.bytedance.adsdk.vt.lh.lh.fkw ouw(com.bytedance.adsdk.vt.ra raVar) {
        Rect rect = raVar.bly;
        List list = Collections.EMPTY_LIST;
        return new com.bytedance.adsdk.vt.lh.lh.fkw(list, raVar, "__container", -1L, fkw.ouw.PRE_COMP, -1L, null, list, new com.bytedance.adsdk.vt.lh.ouw.ryl(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, list, fkw.vt.NONE, null, false, null, null);
    }
}

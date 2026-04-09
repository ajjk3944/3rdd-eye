package com.bytedance.adsdk.vt.fkw;

import android.util.JsonReader;
import android.util.LongSparseArray;
import android.util.SparseArray;
import com.bytedance.adsdk.vt.lh.lh.fkw;
import com.bytedance.adsdk.vt.ra;
import com.bytedance.adsdk.vt.tlj;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class zin {
    private static List<tlj.ouw> lh(JsonReader jsonReader) throws IOException {
        try {
            ArrayList arrayList = new ArrayList();
            while (jsonReader.hasNext()) {
                tlj.ouw ouwVar = new tlj.ouw();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    int iHashCode = strNextName.hashCode();
                    if (iHashCode != 99) {
                        if (iHashCode != 102) {
                            if (iHashCode != 108) {
                                if (iHashCode != 115) {
                                    if (iHashCode != 3153) {
                                        if (iHashCode != 3449) {
                                            if (iHashCode == 96670 && strNextName.equals("ali")) {
                                                ouwVar.ra = jsonReader.nextString();
                                            } else {
                                                jsonReader.skipValue();
                                            }
                                        } else if (strNextName.equals("le")) {
                                            ouwVar.vt = jsonReader.nextInt();
                                        } else {
                                            jsonReader.skipValue();
                                        }
                                    } else if (strNextName.equals("bs")) {
                                        ouwVar.f7214le = jsonReader.nextInt();
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                } else if (strNextName.equals("s")) {
                                    ouwVar.fkw = jsonReader.nextInt();
                                } else {
                                    jsonReader.skipValue();
                                }
                            } else if (strNextName.equals("l")) {
                                ouwVar.ouw = jsonReader.nextInt();
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if (strNextName.equals("f")) {
                            ouwVar.yu = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (strNextName.equals("c")) {
                        ouwVar.f7215lh = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                arrayList.add(ouwVar);
            }
            return arrayList;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static void ouw(JsonReader jsonReader, ra.vt vtVar) throws IOException {
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 3239) {
                    if (iHashCode != 107027) {
                        if (iHashCode == 3237004 && strNextName.equals("inel")) {
                            vtVar.vt = new int[][]{new int[]{-1, -1}};
                            jsonReader.beginArray();
                            if (jsonReader.hasNext()) {
                                jsonReader.beginArray();
                                for (int i4 = 0; i4 < 2; i4++) {
                                    if (jsonReader.hasNext()) {
                                        vtVar.vt[0][i4] = jsonReader.nextInt();
                                    }
                                }
                                jsonReader.endArray();
                            }
                            jsonReader.endArray();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (strNextName.equals("lel")) {
                        vtVar.f7208lh = vt(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (strNextName.equals("el")) {
                    vtVar.ouw = jsonReader.nextString();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static JSONArray vt(JsonReader jsonReader) throws JSONException, IOException {
        JSONArray jSONArray = new JSONArray();
        try {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                JSONObject jSONObject = new JSONObject();
                jSONArray.put(jSONObject);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    int iHashCode = strNextName.hashCode();
                    if (iHashCode != 3324) {
                        if (iHashCode == 116753 && strNextName.equals("vid")) {
                            try {
                                jSONObject.put("vid", jsonReader.nextString());
                            } catch (JSONException e2) {
                                e2.printStackTrace();
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (strNextName.equals("hd")) {
                        try {
                            jSONObject.put("hd", jsonReader.nextInt());
                        } catch (JSONException e10) {
                            e10.printStackTrace();
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
            }
            jsonReader.endArray();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONArray;
    }

    public static void ouw(JsonReader jsonReader, ra.ouw ouwVar) throws IOException {
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 3139) {
                    if (iHashCode != 3232) {
                        if (iHashCode != 3571) {
                            if (iHashCode != 3666) {
                                if (iHashCode == 98713 && strNextName.equals("cpf")) {
                                    try {
                                        jsonReader.beginObject();
                                        while (jsonReader.hasNext()) {
                                            String strNextName2 = jsonReader.nextName();
                                            int iHashCode2 = strNextName2.hashCode();
                                            if (iHashCode2 != 3239) {
                                                if (iHashCode2 != 3276) {
                                                    if (iHashCode2 == 107027 && strNextName2.equals("lel")) {
                                                        ouwVar.ra = vt(jsonReader);
                                                    } else {
                                                        jsonReader.skipValue();
                                                    }
                                                } else if (strNextName2.equals("fr")) {
                                                    ouwVar.fkw = jsonReader.nextInt();
                                                } else {
                                                    jsonReader.skipValue();
                                                }
                                            } else if (strNextName2.equals("el")) {
                                                ouwVar.f7206le = jsonReader.nextString();
                                            } else {
                                                jsonReader.skipValue();
                                            }
                                        }
                                        jsonReader.endObject();
                                    } catch (IOException e2) {
                                        e2.printStackTrace();
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                            } else if (strNextName.equals("se")) {
                                ouwVar.ouw = jsonReader.nextInt();
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if (strNextName.equals("pc")) {
                            ouwVar.yu = jsonReader.nextInt();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (strNextName.equals("ee")) {
                        ouwVar.f7207lh = ouw(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (strNextName.equals("be")) {
                    ouwVar.vt = ouw(jsonReader);
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private static Map<String, Object> ouw(JsonReader jsonReader) throws JSONException, IOException {
        HashMap map = new HashMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("lel")) {
                map.put("lel", vt(jsonReader));
            } else if (!strNextName.equals("lottie_back")) {
                jsonReader.skipValue();
            } else {
                JSONObject jSONObject = new JSONObject();
                map.put("lottie_back", jSONObject);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    strNextName2.getClass();
                    if (!strNextName2.equals("hd")) {
                        jsonReader.skipValue();
                    } else {
                        try {
                            jSONObject.putOpt("hd", Integer.valueOf(jsonReader.nextInt()));
                            jSONObject.putOpt("vid", "lottie_back");
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
                jsonReader.endObject();
            }
        }
        jsonReader.endObject();
        Object objRemove = map.remove("lottie_back");
        if (objRemove instanceof JSONObject) {
            Object obj = map.get("lel");
            if (obj instanceof JSONArray) {
                ((JSONArray) obj).put(objRemove);
            } else {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(objRemove);
                map.put("lel", jSONArray);
            }
        }
        return map;
    }

    public static void ouw(JsonReader jsonReader, ra.lh lhVar) throws IOException {
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 3123) {
                    if (iHashCode != 3239) {
                        if (iHashCode != 3355) {
                            if (iHashCode != 3418) {
                                if (iHashCode != 3704) {
                                    if (iHashCode != 107027) {
                                        if (iHashCode == 3237004 && strNextName.equals("inel")) {
                                            lhVar.fkw = new int[]{-1, -1};
                                            jsonReader.beginArray();
                                            for (int i4 = 0; i4 < 2; i4++) {
                                                if (jsonReader.hasNext()) {
                                                    lhVar.fkw[i4] = jsonReader.nextInt();
                                                }
                                            }
                                            jsonReader.endArray();
                                        } else {
                                            jsonReader.skipValue();
                                        }
                                    } else if (strNextName.equals("lel")) {
                                        lhVar.ra = vt(jsonReader);
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                } else if (strNextName.equals("tl")) {
                                    lhVar.f7201lh = jsonReader.nextString();
                                } else {
                                    jsonReader.skipValue();
                                }
                            } else if (strNextName.equals("ke")) {
                                lhVar.ouw = jsonReader.nextInt();
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if (strNextName.equals(FacebookMediationAdapter.KEY_ID)) {
                            lhVar.vt = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (strNextName.equals("el")) {
                        lhVar.f7200le = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (strNextName.equals("at")) {
                    lhVar.yu = jsonReader.nextString();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar, List<com.bytedance.adsdk.vt.lh.lh.fkw> list, LongSparseArray<com.bytedance.adsdk.vt.lh.lh.fkw> longSparseArray) throws IOException {
        jsonReader.beginArray();
        int i4 = 0;
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.vt.lh.lh.fkw fkwVarOuw = qbp.ouw(jsonReader, raVar);
            if (fkwVarOuw.fkw == fkw.ouw.IMAGE) {
                i4++;
            }
            list.add(fkwVarOuw);
            longSparseArray.put(fkwVarOuw.yu, fkwVarOuw);
            if (i4 > 4) {
                com.bytedance.adsdk.vt.le.yu.vt("You have " + i4 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        jsonReader.endArray();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void ouw(android.util.JsonReader r17, com.bytedance.adsdk.vt.ra r18, java.util.Map<java.lang.String, java.util.List<com.bytedance.adsdk.vt.lh.lh.fkw>> r19, java.util.Map<java.lang.String, com.bytedance.adsdk.vt.tlj> r20) throws org.json.JSONException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.vt.fkw.zin.ouw(android.util.JsonReader, com.bytedance.adsdk.vt.ra, java.util.Map, java.util.Map):void");
    }

    public static void ouw(JsonReader jsonReader, Map<String, com.bytedance.adsdk.vt.lh.lh> map) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals("list")) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String strNextString = null;
                    String strNextString2 = null;
                    float fNextDouble = 0.0f;
                    String strNextString3 = null;
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        switch (strNextName2) {
                            case "fFamily":
                                strNextString = jsonReader.nextString();
                                break;
                            case "ascent":
                                fNextDouble = (float) jsonReader.nextDouble();
                                break;
                            case "fStyle":
                                strNextString2 = jsonReader.nextString();
                                break;
                            case "fName":
                                strNextString3 = jsonReader.nextString();
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    com.bytedance.adsdk.vt.lh.lh lhVar = new com.bytedance.adsdk.vt.lh.lh(strNextString, strNextString3, strNextString2, fNextDouble);
                    map.put(lhVar.vt, lhVar);
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
    }

    public static void ouw(JsonReader jsonReader, com.bytedance.adsdk.vt.ra raVar, SparseArray<com.bytedance.adsdk.vt.lh.yu> sparseArray) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            jsonReader.beginObject();
            String strNextString = null;
            String strNextString2 = null;
            double dNextDouble = 0.0d;
            char cCharAt = 0;
            double dNextDouble2 = 0.0d;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "fFamily":
                        strNextString2 = jsonReader.nextString();
                        break;
                    case "w":
                        dNextDouble = jsonReader.nextDouble();
                        break;
                    case "ch":
                        cCharAt = jsonReader.nextString().charAt(0);
                        break;
                    case "data":
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            if ("shapes".equals(jsonReader.nextName())) {
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add((com.bytedance.adsdk.vt.lh.vt.rn) pno.ouw(jsonReader, raVar));
                                }
                                jsonReader.endArray();
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        break;
                    case "size":
                        dNextDouble2 = jsonReader.nextDouble();
                        break;
                    case "style":
                        strNextString = jsonReader.nextString();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            com.bytedance.adsdk.vt.lh.yu yuVar = new com.bytedance.adsdk.vt.lh.yu(arrayList, cCharAt, dNextDouble2, dNextDouble, strNextString, strNextString2);
            sparseArray.put(yuVar.hashCode(), yuVar);
        }
        jsonReader.endArray();
    }

    public static void ouw(JsonReader jsonReader, List<com.bytedance.adsdk.vt.lh.le> list) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            float fNextDouble = 0.0f;
            String strNextString = null;
            float fNextDouble2 = 0.0f;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "cm":
                        strNextString = jsonReader.nextString();
                        break;
                    case "dr":
                        fNextDouble2 = (float) jsonReader.nextDouble();
                        break;
                    case "tm":
                        fNextDouble = (float) jsonReader.nextDouble();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            list.add(new com.bytedance.adsdk.vt.lh.le(strNextString, fNextDouble, fNextDouble2));
        }
        jsonReader.endArray();
    }
}

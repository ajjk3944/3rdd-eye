package com.bytedance.adsdk.ypw.bw;

import android.graphics.Color;
import android.graphics.Rect;
import android.util.JsonReader;
import com.bytedance.adsdk.ypw.xq.xq.bw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class sra {

    /* renamed from: com.bytedance.adsdk.ypw.bw.sra$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] emc;

        static {
            int[] iArr = new int[bw.ypw.values().length];
            emc = iArr;
            try {
                iArr[bw.ypw.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                emc[bw.ypw.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static com.bytedance.adsdk.ypw.xq.xq.bw emc(com.bytedance.adsdk.ypw.uym uymVar) {
        Rect rectDg = uymVar.dg();
        List list = Collections.EMPTY_LIST;
        return new com.bytedance.adsdk.ypw.xq.xq.bw(list, uymVar, "__container", -1L, bw.emc.PRE_COMP, -1L, null, list, new com.bytedance.adsdk.ypw.xq.emc.sup(), 0, 0, 0, 0.0f, 0.0f, rectDg.width(), rectDg.height(), null, null, list, bw.ypw.NONE, null, false, null, null);
    }

    public static com.bytedance.adsdk.ypw.xq.xq.bw emc(JsonReader jsonReader, com.bytedance.adsdk.ypw.uym uymVar) {
        Float f2;
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        bw.ypw ypwVar = bw.ypw.NONE;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        bw.ypw ypwVar2 = ypwVar;
        String strNextString = null;
        com.bytedance.adsdk.ypw.xq.emc.sup supVarEmc = null;
        com.bytedance.adsdk.ypw.xq.emc.ru ruVarYcc = null;
        com.bytedance.adsdk.ypw.xq.emc.gbl gblVarEmc = null;
        com.bytedance.adsdk.ypw.xq.emc.ypw ypwVarEmc = null;
        com.bytedance.adsdk.ypw.xq.ypw.emc emcVarEmc = null;
        ru ruVarEmc = null;
        float fNextDouble = 0.0f;
        float fUym = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        long jNextInt = 0;
        long jNextInt2 = -1;
        int iEmc = 0;
        int iEmc2 = 0;
        int color = 0;
        boolean zNextBoolean = false;
        float fNextDouble5 = 1.0f;
        String strNextString2 = "UNSET";
        String strNextString3 = null;
        bw.emc emcVar = null;
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
                        com.bytedance.adsdk.ypw.xq.ypw.xq xqVarEmc = msw.emc(jsonReader, uymVar);
                        if (xqVarEmc != null) {
                            arrayList2.add(xqVarEmc);
                        }
                    }
                    jsonReader.endArray();
                    break;
                case "h":
                    fNextDouble3 = (float) (jsonReader.nextDouble() * com.bytedance.adsdk.ypw.ycc.ycc.emc());
                    break;
                case "t":
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("a")) {
                            jsonReader.beginArray();
                            if (jsonReader.hasNext()) {
                                gblVarEmc = ypw.emc(jsonReader, uymVar);
                            }
                            while (jsonReader.hasNext()) {
                                jsonReader.skipValue();
                            }
                            jsonReader.endArray();
                        } else if (!strNextName2.equals("d")) {
                            jsonReader.skipValue();
                        } else {
                            ruVarYcc = dg.ycc(jsonReader, uymVar);
                        }
                    }
                    jsonReader.endObject();
                    break;
                case "w":
                    fNextDouble2 = (float) (jsonReader.nextDouble() * com.bytedance.adsdk.ypw.ycc.ycc.emc());
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
                            } else if (!strNextName3.equals("ty")) {
                                jsonReader.skipValue();
                            } else {
                                int iNextInt = jsonReader.nextInt();
                                if (iNextInt == 29) {
                                    emcVarEmc = bw.emc(jsonReader, uymVar);
                                } else if (iNextInt == 25) {
                                    ruVarEmc = new gbl().emc(jsonReader, uymVar);
                                }
                            }
                        }
                        jsonReader.endObject();
                    }
                    jsonReader.endArray();
                    uymVar.emc("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ".concat(String.valueOf(arrayList3)));
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "ip":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "ks":
                    supVarEmc = xq.emc(jsonReader, uymVar);
                    break;
                case "nm":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "op":
                    fUym = (float) jsonReader.nextDouble();
                    break;
                case "sc":
                    color = Color.parseColor(jsonReader.nextString());
                    break;
                case "sh":
                    iEmc2 = (int) (com.bytedance.adsdk.ypw.ycc.ycc.emc() * jsonReader.nextInt());
                    break;
                case "sr":
                    fNextDouble5 = (float) jsonReader.nextDouble();
                    break;
                case "st":
                    fNextDouble4 = (float) jsonReader.nextDouble();
                    break;
                case "sw":
                    iEmc = (int) (com.bytedance.adsdk.ypw.ycc.ycc.emc() * jsonReader.nextInt());
                    break;
                case "tm":
                    ypwVarEmc = dg.emc(jsonReader, uymVar, false);
                    break;
                case "tt":
                    int iNextInt2 = jsonReader.nextInt();
                    if (iNextInt2 >= bw.ypw.values().length) {
                        uymVar.emc("Unsupported matte type: ".concat(String.valueOf(iNextInt2)));
                        break;
                    } else {
                        ypwVar2 = bw.ypw.values()[iNextInt2];
                        int i = AnonymousClass1.emc[ypwVar2.ordinal()];
                        if (i == 1) {
                            uymVar.emc("Unsupported matte type: Luma");
                        } else if (i == 2) {
                            uymVar.emc("Unsupported matte type: Luma Inverted");
                        }
                        uymVar.emc(1);
                        break;
                    }
                case "ty":
                    int iNextInt3 = jsonReader.nextInt();
                    emcVar = bw.emc.UNKNOWN;
                    if (iNextInt3 >= emcVar.ordinal()) {
                        break;
                    } else {
                        emcVar = bw.emc.values()[iNextInt3];
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
                        arrayList.add(hxp.emc(jsonReader, uymVar));
                    }
                    uymVar.emc(arrayList.size());
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
            f2 = fValueOf;
            arrayList4.add(new com.bytedance.adsdk.ypw.uym.emc(uymVar, fValueOf, fValueOf, null, 0.0f, Float.valueOf(fNextDouble)));
        } else {
            f2 = fValueOf;
        }
        if (fUym <= 0.0f) {
            fUym = uymVar.uym();
        }
        arrayList4.add(new com.bytedance.adsdk.ypw.uym.emc(uymVar, fValueOf2, fValueOf2, null, fNextDouble, Float.valueOf(fUym)));
        arrayList4.add(new com.bytedance.adsdk.ypw.uym.emc(uymVar, f2, f2, null, fUym, Float.valueOf(Float.MAX_VALUE)));
        if (strNextString2.endsWith(".ai") || "ai".equals(strNextString3)) {
            uymVar.emc("Convert your Illustrator layers to shape layers.");
        }
        return new com.bytedance.adsdk.ypw.xq.xq.bw(arrayList2, uymVar, strNextString2, jNextInt, emcVar, jNextInt2, strNextString, arrayList, supVarEmc, iEmc, iEmc2, color, fNextDouble5, fNextDouble4, fNextDouble2, fNextDouble3, ruVarYcc, gblVarEmc, arrayList4, ypwVar2, ypwVarEmc, zNextBoolean, emcVarEmc, ruVarEmc);
    }
}

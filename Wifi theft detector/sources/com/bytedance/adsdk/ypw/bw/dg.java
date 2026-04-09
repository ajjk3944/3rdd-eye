package com.bytedance.adsdk.ypw.bw;

import android.util.JsonReader;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public class dg {
    public static com.bytedance.adsdk.ypw.xq.emc.msw bw(JsonReader jsonReader, com.bytedance.adsdk.ypw.uym uymVar) throws IOException {
        return new com.bytedance.adsdk.ypw.xq.emc.msw(emc(jsonReader, com.bytedance.adsdk.ypw.ycc.ycc.emc(), uymVar, mkp.emc));
    }

    public static com.bytedance.adsdk.ypw.xq.emc.uym dg(JsonReader jsonReader, com.bytedance.adsdk.ypw.uym uymVar) throws IOException {
        return new com.bytedance.adsdk.ypw.xq.emc.uym(emc(jsonReader, uymVar, rtt.emc));
    }

    public static com.bytedance.adsdk.ypw.xq.emc.ypw emc(JsonReader jsonReader, com.bytedance.adsdk.ypw.uym uymVar) throws IOException {
        return emc(jsonReader, uymVar, true);
    }

    public static com.bytedance.adsdk.ypw.xq.emc.emc uym(JsonReader jsonReader, com.bytedance.adsdk.ypw.uym uymVar) throws IOException {
        return new com.bytedance.adsdk.ypw.xq.emc.emc(emc(jsonReader, uymVar, uym.emc));
    }

    public static com.bytedance.adsdk.ypw.xq.emc.ycc xq(JsonReader jsonReader, com.bytedance.adsdk.ypw.uym uymVar) throws IOException {
        return new com.bytedance.adsdk.ypw.xq.emc.ycc(ylm.emc(jsonReader, uymVar, com.bytedance.adsdk.ypw.ycc.ycc.emc(), sf.emc, true));
    }

    public static com.bytedance.adsdk.ypw.xq.emc.ru ycc(JsonReader jsonReader, com.bytedance.adsdk.ypw.uym uymVar) throws IOException {
        return new com.bytedance.adsdk.ypw.xq.emc.ru(emc(jsonReader, com.bytedance.adsdk.ypw.ycc.ycc.emc(), uymVar, zz.emc));
    }

    public static com.bytedance.adsdk.ypw.xq.emc.dg ypw(JsonReader jsonReader, com.bytedance.adsdk.ypw.uym uymVar) throws IOException {
        return new com.bytedance.adsdk.ypw.xq.emc.dg(emc(jsonReader, uymVar, sba.emc));
    }

    public static com.bytedance.adsdk.ypw.xq.emc.ypw emc(JsonReader jsonReader, com.bytedance.adsdk.ypw.uym uymVar, boolean z10) throws IOException {
        return new com.bytedance.adsdk.ypw.xq.emc.ypw(emc(jsonReader, z10 ? com.bytedance.adsdk.ypw.ycc.ycc.emc() : 1.0f, uymVar, sup.emc));
    }

    public static com.bytedance.adsdk.ypw.xq.emc.xq emc(JsonReader jsonReader, com.bytedance.adsdk.ypw.uym uymVar, int i10) throws IOException {
        return new com.bytedance.adsdk.ypw.xq.emc.xq(emc(jsonReader, uymVar, new cf(i10)));
    }

    private static <T> List<com.bytedance.adsdk.ypw.uym.emc<T>> emc(JsonReader jsonReader, com.bytedance.adsdk.ypw.uym uymVar, wo<T> woVar) throws IOException {
        return ylm.emc(jsonReader, uymVar, 1.0f, woVar, false);
    }

    private static <T> List<com.bytedance.adsdk.ypw.uym.emc<T>> emc(JsonReader jsonReader, float f10, com.bytedance.adsdk.ypw.uym uymVar, wo<T> woVar) throws IOException {
        return ylm.emc(jsonReader, uymVar, f10, woVar, false);
    }
}

package com.bytedance.sdk.openadsdk.core.sup;

import A.f;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.sup.xq.emc;
import com.bytedance.sdk.openadsdk.core.sup.ypw.xq;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class xq {
    protected String bw;
    protected emc.ypw dg;
    protected int emc;
    protected String msw;
    private String ru;
    private rie sup;
    protected List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> uym;
    protected emc.EnumC0072emc xq;
    protected List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> ycc;
    protected int ypw;
    private final AtomicBoolean gbl = new AtomicBoolean(false);
    protected String zz = "endcard_click";

    /* renamed from: com.bytedance.sdk.openadsdk.core.sup.xq$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] emc;

        static {
            int[] iArr = new int[emc.ypw.values().length];
            emc = iArr;
            try {
                iArr[emc.ypw.STATIC_RESOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                emc[emc.ypw.HTML_RESOURCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                emc[emc.ypw.IFRAME_RESOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public xq(int i, int i3, emc.EnumC0072emc enumC0072emc, emc.ypw ypwVar, String str, List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> list, List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> list2, String str2) {
        this.ycc = new ArrayList();
        this.uym = new ArrayList();
        this.emc = i;
        this.ypw = i3;
        this.xq = enumC0072emc;
        this.dg = ypwVar;
        this.bw = str;
        this.ycc = list;
        this.uym = list2;
        this.msw = str2;
    }

    public String bw() {
        if (this.dg == emc.ypw.STATIC_RESOURCE && this.xq == emc.EnumC0072emc.IMAGE) {
            return this.bw;
        }
        return null;
    }

    public String dg() {
        int i = AnonymousClass1.emc[this.dg.ordinal()];
        if (i == 1) {
            emc.EnumC0072emc enumC0072emc = this.xq;
            if (enumC0072emc == emc.EnumC0072emc.IMAGE) {
                return f.p(new StringBuilder("<html><head></head><body style=\"margin:0;padding:0\"><img src=\""), this.bw, "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>");
            }
            if (enumC0072emc == emc.EnumC0072emc.JAVASCRIPT) {
                return f.p(new StringBuilder("<script src=\""), this.bw, "\"></script>");
            }
            return null;
        }
        if (i == 2) {
            return this.bw;
        }
        if (i != 3) {
            return null;
        }
        StringBuilder sb = new StringBuilder("<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"");
        sb.append(this.emc);
        sb.append("\" height=\"");
        sb.append(this.ypw);
        sb.append("\" src=\"");
        return f.p(sb, this.bw, "\"></iframe>");
    }

    public void emc(long j6) {
        com.bytedance.sdk.openadsdk.core.sup.ypw.xq.emc(null, this.ycc, null, j6, this.ru, new xq.ypw(this.zz, this.sup), null);
    }

    public int xq() {
        return this.ypw;
    }

    public String ycc() {
        return this.bw;
    }

    public int ypw() {
        return this.emc;
    }

    public static float emc(int i, int i3, int i6, int i7, emc.ypw ypwVar, emc.EnumC0072emc enumC0072emc) {
        if (i3 == 0 || i7 == 0) {
            return 0.0f;
        }
        float f2 = i;
        float f5 = i6;
        return emc(ypwVar, enumC0072emc) / ((Math.abs((f2 - f5) / f2) + Math.abs((f2 / i3) - (f5 / i7))) + 1.0f);
    }

    public void ypw(long j6) {
        if (this.gbl.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.core.sup.ypw.xq.ypw((rie) null, this.uym, (com.bytedance.sdk.openadsdk.core.sup.emc.emc) null, j6, this.ru, (String) null);
        }
    }

    public static xq ypw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("width");
        int iOptInt2 = jSONObject.optInt("height");
        String strOptString = jSONObject.optString("creativeType", emc.EnumC0072emc.NONE.toString());
        String strOptString2 = jSONObject.optString("resourceType", emc.ypw.HTML_RESOURCE.toString());
        String strOptString3 = jSONObject.optString("contentUrl");
        String strOptString4 = jSONObject.optString("clickThroughUri");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("clickTrackers");
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("creativeViewTrackers");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            arrayList.add(new xq.emc(jSONArrayOptJSONArray.optString(i)).emc());
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
            arrayList2.add(new xq.emc(jSONArrayOptJSONArray2.optString(i3)).emc());
        }
        return new xq(iOptInt, iOptInt2, emc.EnumC0072emc.valueOf(strOptString), emc.ypw.valueOf(strOptString2), strOptString3, arrayList, arrayList2, strOptString4);
    }

    private static float emc(emc.ypw ypwVar, emc.EnumC0072emc enumC0072emc) {
        int i = AnonymousClass1.emc[ypwVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return i != 3 ? 0.0f : 1.0f;
            }
            return 1.2f;
        }
        if (emc.EnumC0072emc.JAVASCRIPT.equals(enumC0072emc)) {
            return 1.0f;
        }
        return emc.EnumC0072emc.IMAGE.equals(enumC0072emc) ? 0.8f : 0.0f;
    }

    public void emc(String str) {
        this.ru = str;
    }

    public JSONObject emc() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", this.emc);
        jSONObject.put("height", this.ypw);
        jSONObject.put("creativeType", this.xq.toString());
        jSONObject.put("resourceType", this.dg.toString());
        jSONObject.put("contentUrl", this.bw);
        jSONObject.put("clickThroughUri", this.msw);
        jSONObject.put("clickTrackers", com.bytedance.sdk.openadsdk.core.sup.ypw.xq.emc(this.ycc));
        jSONObject.put("creativeViewTrackers", com.bytedance.sdk.openadsdk.core.sup.ypw.xq.emc(this.uym));
        return jSONObject;
    }

    public void emc(rie rieVar) {
        this.sup = rieVar;
    }
}

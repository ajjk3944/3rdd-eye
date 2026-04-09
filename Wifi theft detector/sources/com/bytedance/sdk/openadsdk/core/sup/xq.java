package com.bytedance.sdk.openadsdk.core.sup;

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
    protected emc.EnumC0157emc xq;
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

    public xq(int i10, int i11, emc.EnumC0157emc enumC0157emc, emc.ypw ypwVar, String str, List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> list, List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> list2, String str2) {
        this.ycc = new ArrayList();
        this.uym = new ArrayList();
        this.emc = i10;
        this.ypw = i11;
        this.xq = enumC0157emc;
        this.dg = ypwVar;
        this.bw = str;
        this.ycc = list;
        this.uym = list2;
        this.msw = str2;
    }

    public String bw() {
        if (this.dg == emc.ypw.STATIC_RESOURCE && this.xq == emc.EnumC0157emc.IMAGE) {
            return this.bw;
        }
        return null;
    }

    public String dg() {
        int i10 = AnonymousClass1.emc[this.dg.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return this.bw;
            }
            if (i10 != 3) {
                return null;
            }
            return "<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"" + this.emc + "\" height=\"" + this.ypw + "\" src=\"" + this.bw + "\"></iframe>";
        }
        emc.EnumC0157emc enumC0157emc = this.xq;
        if (enumC0157emc == emc.EnumC0157emc.IMAGE) {
            return "<html><head></head><body style=\"margin:0;padding:0\"><img src=\"" + this.bw + "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>";
        }
        if (enumC0157emc != emc.EnumC0157emc.JAVASCRIPT) {
            return null;
        }
        return "<script src=\"" + this.bw + "\"></script>";
    }

    public void emc(long j10) {
        com.bytedance.sdk.openadsdk.core.sup.ypw.xq.emc(null, this.ycc, null, j10, this.ru, new xq.ypw(this.zz, this.sup), null);
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

    public static float emc(int i10, int i11, int i12, int i13, emc.ypw ypwVar, emc.EnumC0157emc enumC0157emc) {
        if (i11 == 0 || i13 == 0) {
            return 0.0f;
        }
        float f10 = i10;
        float f11 = i12;
        return emc(ypwVar, enumC0157emc) / ((Math.abs((f10 / i11) - (f11 / i13)) + Math.abs((f10 - f11) / f10)) + 1.0f);
    }

    public void ypw(long j10) {
        if (this.gbl.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.core.sup.ypw.xq.ypw((rie) null, this.uym, (com.bytedance.sdk.openadsdk.core.sup.emc.emc) null, j10, this.ru, (String) null);
        }
    }

    public static xq ypw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("width");
        int iOptInt2 = jSONObject.optInt("height");
        String strOptString = jSONObject.optString("creativeType", emc.EnumC0157emc.NONE.toString());
        String strOptString2 = jSONObject.optString("resourceType", emc.ypw.HTML_RESOURCE.toString());
        String strOptString3 = jSONObject.optString("contentUrl");
        String strOptString4 = jSONObject.optString("clickThroughUri");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("clickTrackers");
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("creativeViewTrackers");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            arrayList.add(new xq.emc(jSONArrayOptJSONArray.optString(i10)).emc());
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
            arrayList2.add(new xq.emc(jSONArrayOptJSONArray2.optString(i11)).emc());
        }
        return new xq(iOptInt, iOptInt2, emc.EnumC0157emc.valueOf(strOptString), emc.ypw.valueOf(strOptString2), strOptString3, arrayList, arrayList2, strOptString4);
    }

    private static float emc(emc.ypw ypwVar, emc.EnumC0157emc enumC0157emc) {
        int i10 = AnonymousClass1.emc[ypwVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return i10 != 3 ? 0.0f : 1.0f;
            }
            return 1.2f;
        }
        if (emc.EnumC0157emc.JAVASCRIPT.equals(enumC0157emc)) {
            return 1.0f;
        }
        return emc.EnumC0157emc.IMAGE.equals(enumC0157emc) ? 0.8f : 0.0f;
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

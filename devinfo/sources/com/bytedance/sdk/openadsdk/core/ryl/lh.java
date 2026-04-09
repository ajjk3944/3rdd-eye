package com.bytedance.sdk.openadsdk.core.ryl;

import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.ryl.lh.ouw;
import com.bytedance.sdk.openadsdk.core.ryl.vt.lh;
import d.h;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class lh {
    String bly;

    /* renamed from: cf, reason: collision with root package name */
    public vpp f8397cf;
    protected String fkw;

    /* renamed from: le, reason: collision with root package name */
    protected List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> f8398le;

    /* renamed from: lh, reason: collision with root package name */
    protected ouw.EnumC0095ouw f8399lh;
    protected int ouw;
    protected String pno;
    protected List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> ra;
    private final AtomicBoolean ryl = new AtomicBoolean(false);
    protected String tlj = "endcard_click";
    protected int vt;
    protected ouw.vt yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.openadsdk.core.ryl.lh$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ouw;

        static {
            int[] iArr = new int[ouw.vt.values().length];
            ouw = iArr;
            try {
                iArr[ouw.vt.STATIC_RESOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ouw[ouw.vt.HTML_RESOURCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ouw[ouw.vt.IFRAME_RESOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public lh(int i4, int i10, ouw.EnumC0095ouw enumC0095ouw, ouw.vt vtVar, String str, List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> list, List<com.bytedance.sdk.openadsdk.core.ryl.vt.lh> list2, String str2) {
        this.f8398le = new ArrayList();
        this.ra = new ArrayList();
        this.ouw = i4;
        this.vt = i10;
        this.f8399lh = enumC0095ouw;
        this.yu = vtVar;
        this.fkw = str;
        this.f8398le = list;
        this.ra = list2;
        this.pno = str2;
    }

    public final String fkw() {
        if (this.yu == ouw.vt.STATIC_RESOURCE && this.f8399lh == ouw.EnumC0095ouw.IMAGE) {
            return this.fkw;
        }
        return null;
    }

    public final String le() {
        return this.fkw;
    }

    public final int lh() {
        return this.vt;
    }

    public final void ouw(long j) {
        com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(null, this.f8398le, null, j, this.bly, new lh.vt(this.tlj, this.f8397cf), null);
    }

    public final int vt() {
        return this.ouw;
    }

    public final String yu() {
        int i4 = AnonymousClass1.ouw[this.yu.ordinal()];
        if (i4 == 1) {
            ouw.EnumC0095ouw enumC0095ouw = this.f8399lh;
            if (enumC0095ouw == ouw.EnumC0095ouw.IMAGE) {
                return h.w(new StringBuilder("<html><head></head><body style=\"margin:0;padding:0\"><img src=\""), this.fkw, "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>");
            }
            if (enumC0095ouw == ouw.EnumC0095ouw.JAVASCRIPT) {
                return h.w(new StringBuilder("<script src=\""), this.fkw, "\"></script>");
            }
            return null;
        }
        if (i4 == 2) {
            return this.fkw;
        }
        if (i4 != 3) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder("<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"");
        sb2.append(this.ouw);
        sb2.append("\" height=\"");
        sb2.append(this.vt);
        sb2.append("\" src=\"");
        return h.w(sb2, this.fkw, "\"></iframe>");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static float ouw(int r1, int r2, int r3, int r4, com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.vt r5, com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.EnumC0095ouw r6) {
        /*
            r0 = 0
            if (r2 == 0) goto L4b
            if (r4 != 0) goto L6
            goto L4b
        L6:
            float r1 = (float) r1
            float r2 = (float) r2
            float r2 = r1 / r2
            float r3 = (float) r3
            float r4 = (float) r4
            float r4 = r3 / r4
            float r2 = r2 - r4
            float r2 = java.lang.Math.abs(r2)
            float r3 = r1 - r3
            float r3 = r3 / r1
            float r1 = java.lang.Math.abs(r3)
            float r1 = r1 + r2
            int[] r2 = com.bytedance.sdk.openadsdk.core.ryl.lh.AnonymousClass1.ouw
            int r3 = r5.ordinal()
            r2 = r2[r3]
            r3 = 1
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r2 == r3) goto L35
            r3 = 2
            if (r2 == r3) goto L31
            r3 = 3
            if (r2 == r3) goto L2f
            goto L49
        L2f:
            r0 = r4
            goto L49
        L31:
            r0 = 1067030938(0x3f99999a, float:1.2)
            goto L49
        L35:
            com.bytedance.sdk.openadsdk.core.ryl.lh.ouw$ouw r2 = com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.EnumC0095ouw.JAVASCRIPT
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L3e
            goto L2f
        L3e:
            com.bytedance.sdk.openadsdk.core.ryl.lh.ouw$ouw r2 = com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.EnumC0095ouw.IMAGE
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L49
            r0 = 1061997773(0x3f4ccccd, float:0.8)
        L49:
            float r1 = r1 + r4
            float r0 = r0 / r1
        L4b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.ryl.lh.ouw(int, int, int, int, com.bytedance.sdk.openadsdk.core.ryl.lh.ouw$vt, com.bytedance.sdk.openadsdk.core.ryl.lh.ouw$ouw):float");
    }

    public final void vt(long j) {
        if (this.ryl.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.core.ryl.vt.lh.vt(null, this.ra, null, j, this.bly, null);
        }
    }

    public static lh vt(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("width");
        int iOptInt2 = jSONObject.optInt("height");
        String strOptString = jSONObject.optString("creativeType", ouw.EnumC0095ouw.NONE.toString());
        String strOptString2 = jSONObject.optString("resourceType", ouw.vt.HTML_RESOURCE.toString());
        String strOptString3 = jSONObject.optString("contentUrl");
        String strOptString4 = jSONObject.optString("clickThroughUri");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("clickTrackers");
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("creativeViewTrackers");
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < jSONArrayOptJSONArray.length(); i4++) {
            arrayList.add(new lh.ouw(jSONArrayOptJSONArray.optString(i4)).ouw());
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayOptJSONArray2.length(); i10++) {
            arrayList2.add(new lh.ouw(jSONArrayOptJSONArray2.optString(i10)).ouw());
        }
        return new lh(iOptInt, iOptInt2, ouw.EnumC0095ouw.valueOf(strOptString), ouw.vt.valueOf(strOptString2), strOptString3, arrayList, arrayList2, strOptString4);
    }

    public JSONObject ouw() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", this.ouw);
        jSONObject.put("height", this.vt);
        jSONObject.put("creativeType", this.f8399lh.toString());
        jSONObject.put("resourceType", this.yu.toString());
        jSONObject.put("contentUrl", this.fkw);
        jSONObject.put("clickThroughUri", this.pno);
        jSONObject.put("clickTrackers", com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(this.f8398le));
        jSONObject.put("creativeViewTrackers", com.bytedance.sdk.openadsdk.core.ryl.vt.lh.ouw(this.ra));
        return jSONObject;
    }
}

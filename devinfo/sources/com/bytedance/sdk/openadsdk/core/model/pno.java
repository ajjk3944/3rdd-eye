package com.bytedance.sdk.openadsdk.core.model;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class pno {
    public List<String> fkw;

    /* renamed from: le, reason: collision with root package name */
    public int f8257le;

    /* renamed from: lh, reason: collision with root package name */
    public List<Integer> f8258lh;
    public int ouw;
    public int ra;
    public int vt;
    public int yu;

    public final int ouw() {
        int i4 = this.ra;
        if (i4 >= 2) {
            return i4;
        }
        return 0;
    }

    public final JSONObject vt() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("interceptor_x", this.ouw);
            jSONObject.put("interceptor_y", this.vt);
            if (this.f8258lh != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator<Integer> it = this.f8258lh.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().intValue());
                }
                jSONObject.put("interceptor_page", jSONArray);
            }
            jSONObject.put("interceptor_interval_time", this.yu);
            if (this.fkw != null) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator<String> it2 = this.fkw.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(it2.next());
                }
                jSONObject.put("url_regular", jSONArray2);
            }
            jSONObject.put("is_act", this.f8257le);
            jSONObject.put("boc_index", this.ra);
            return jSONObject;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.yu(th2.getMessage(), new Object[0]);
            return jSONObject;
        }
    }
}

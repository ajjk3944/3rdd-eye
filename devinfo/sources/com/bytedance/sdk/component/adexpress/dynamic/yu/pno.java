package com.bytedance.sdk.component.adexpress.dynamic.yu;

import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class pno {
    public fkw bly;

    /* renamed from: cf, reason: collision with root package name */
    public pno f7303cf;
    public float fkw;

    /* renamed from: jg, reason: collision with root package name */
    public boolean f7304jg;

    /* renamed from: le, reason: collision with root package name */
    public float f7305le;

    /* renamed from: lh, reason: collision with root package name */
    public float f7306lh;
    public String mwh;
    public String ouw;
    public float pno;
    public float ra;
    public List<List<pno>> ryl;
    public List<pno> tlj;
    public float vt;
    public float yu;
    public Map<String, String> ko = new HashMap();
    public Map<Integer, String> rn = new HashMap();

    public final boolean fkw() {
        List<pno> list = this.tlj;
        return list == null || list.size() <= 0;
    }

    public final void le() {
        List<List<pno>> list = this.ryl;
        if (list == null || list.size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (List<pno> list2 : this.ryl) {
            if (list2 != null && list2.size() > 0) {
                arrayList.add(list2);
            }
        }
        this.ryl = arrayList;
    }

    public final float lh() {
        le leVar = this.bly.f7280lh;
        return (leVar.vt * 2.0f) + ouw() + leVar.fkw + leVar.f7287le;
    }

    public final void ouw(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() == 0) {
                    return;
                }
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i4);
                    this.rn.put(Integer.valueOf(jSONObjectOptJSONObject.optInt(FacebookMediationAdapter.KEY_ID)), jSONObjectOptJSONObject.optString("value"));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final String pno() {
        return this.bly.f7280lh.mwh;
    }

    public final boolean ra() {
        return TextUtils.equals(this.bly.f7280lh.zih, "flex");
    }

    public String toString() {
        return "DynamicLayoutUnit{id='" + this.ouw + "', x=" + this.vt + ", y=" + this.f7306lh + ", width=" + this.f7305le + ", height=" + this.ra + ", remainWidth=" + this.pno + ", rootBrick=" + this.bly + ", childrenBrickUnits=" + this.tlj + '}';
    }

    public final int vt() {
        le leVar = this.bly.f7280lh;
        return leVar.fvf + leVar.bs;
    }

    public final float yu() {
        le leVar = this.bly.f7280lh;
        return (leVar.vt * 2.0f) + vt() + leVar.ra + leVar.yu;
    }

    public final int ouw() {
        le leVar = this.bly.f7280lh;
        return leVar.fak + leVar.uoy;
    }

    public final void ouw(String str, String str2) {
        this.ko.put(str, str2);
    }
}

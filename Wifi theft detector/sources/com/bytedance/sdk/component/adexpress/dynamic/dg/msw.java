package com.bytedance.sdk.component.adexpress.dynamic.dg;

import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class msw {
    private float bw;
    private float dg;
    private String emc;
    private msw gbl;
    private float msw;
    private boolean qh;
    private List<msw> ru;
    private List<List<msw>> sup;
    private String sz;
    private float uym;
    private float xq;
    private float ycc;
    private float ypw;
    private bw zz;
    private Map<String, String> cf = new HashMap();
    private Map<Integer, String> vk = new HashMap();

    public List<List<msw>> aa() {
        return this.sup;
    }

    public float bw() {
        return this.bw;
    }

    public float cf() {
        ycc yccVarBw = this.zz.bw();
        return sz() + yccVarBw.cf() + yccVarBw.vk() + (yccVarBw.sup() * 2.0f);
    }

    public float dg() {
        return this.dg;
    }

    public String emc() {
        return this.sz;
    }

    public List<msw> gbl() {
        return this.ru;
    }

    public boolean hxp() {
        return this.zz.bw().rgy() < 0 || this.zz.bw().jxk() < 0 || this.zz.bw().pm() < 0 || this.zz.bw().ipv() < 0;
    }

    public float msw() {
        return this.ycc;
    }

    public int qh() {
        ycc yccVarBw = this.zz.bw();
        return yccVarBw.wpn() + yccVarBw.pxa();
    }

    public String rie() {
        return this.zz.bw().rie();
    }

    public bw ru() {
        return this.zz;
    }

    public boolean sba() {
        List<msw> list = this.ru;
        return list == null || list.size() <= 0;
    }

    public boolean sra() {
        return TextUtils.equals(this.zz.bw().sf(), "flex");
    }

    public msw sup() {
        return this.gbl;
    }

    public int sz() {
        ycc yccVarBw = this.zz.bw();
        return yccVarBw.wa() + yccVarBw.rqm();
    }

    public String toString() {
        return "DynamicLayoutUnit{id='" + this.emc + "', x=" + this.ypw + ", y=" + this.xq + ", width=" + this.ycc + ", height=" + this.uym + ", remainWidth=" + this.msw + ", rootBrick=" + this.zz + ", childrenBrickUnits=" + this.ru + '}';
    }

    public Map<String, String> ul() {
        return this.cf;
    }

    public float uym() {
        return this.xq;
    }

    public float vk() {
        ycc yccVarBw = this.zz.bw();
        return qh() + yccVarBw.aa() + yccVarBw.qh() + (yccVarBw.sup() * 2.0f);
    }

    public String xq() {
        return this.emc;
    }

    public float ycc() {
        return this.ypw;
    }

    public void ylm() {
        List<List<msw>> list = this.sup;
        if (list == null || list.size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (List<msw> list2 : this.sup) {
            if (list2 != null && list2.size() > 0) {
                arrayList.add(list2);
            }
        }
        this.sup = arrayList;
    }

    public Map<Integer, String> ypw() {
        return this.vk;
    }

    public boolean yzg() {
        return this.qh;
    }

    public float zz() {
        return this.uym;
    }

    public void bw(float f10) {
        this.ycc = f10;
    }

    public void dg(float f10) {
        this.xq = f10;
    }

    public void emc(String str) {
        this.sz = str;
    }

    public void uym(float f10) {
        this.msw = f10;
    }

    public void xq(float f10) {
        this.ypw = f10;
    }

    public void ycc(float f10) {
        this.uym = f10;
    }

    public void ypw(String str) {
        this.emc = str;
    }

    public void emc(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() == 0) {
                    return;
                }
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    this.vk.put(Integer.valueOf(jSONObjectOptJSONObject.optInt("id")), jSONObjectOptJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void xq(String str) {
        this.zz.bw().ycc(str);
    }

    public void ypw(float f10) {
        this.bw = f10;
    }

    public void ypw(List<List<msw>> list) {
        this.sup = list;
    }

    public void emc(float f10) {
        this.dg = f10;
    }

    public void emc(bw bwVar) {
        this.zz = bwVar;
    }

    public void emc(List<msw> list) {
        this.ru = list;
    }

    public void emc(msw mswVar) {
        this.gbl = mswVar;
    }

    public void emc(boolean z10) {
        this.qh = z10;
    }

    public void emc(String str, String str2) {
        this.cf.put(str, str2);
    }

    public String emc(int i10) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.zz.ypw());
        sb.append(":");
        sb.append(this.emc);
        if (this.zz.bw() != null) {
            sb.append(":");
            sb.append(this.zz.bw().zhk());
        }
        sb.append(":");
        sb.append(i10);
        return sb.toString();
    }
}

package com.bytedance.sdk.component.ycc.emc.dg.emc;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc implements com.bytedance.sdk.component.ycc.emc.dg.emc {
    private long bw;
    private byte dg;
    protected JSONObject emc;
    private String gbl;
    private String msw;
    private byte ru;
    private int sup;
    private long uym;
    private byte xq;
    private long ycc;
    private ypw ypw;
    private String zz;

    public emc(String str, JSONObject jSONObject) {
        this.zz = str;
        this.emc = jSONObject;
    }

    public static com.bytedance.sdk.component.ycc.emc.dg.emc xq(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("type");
            int iOptInt2 = jSONObject.optInt("priority");
            emc emcVar = new emc();
            emcVar.emc((byte) iOptInt);
            emcVar.ypw((byte) iOptInt2);
            emcVar.emc(jSONObject.optJSONObject("event"));
            emcVar.emc(jSONObject.optString("localId"));
            emcVar.ypw(jSONObject.optString("genTime"));
            emcVar.emc(jSONObject.optInt("channel"));
            return emcVar;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.ycc.emc.dg.emc
    public byte bw() {
        return this.dg;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.dg.emc
    public byte dg() {
        return this.xq;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.dg.emc
    public ypw emc() {
        return this.ypw;
    }

    public String gbl() {
        return this.gbl;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.dg.emc
    public long msw() {
        return this.bw;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.dg.emc
    public int ru() {
        return this.sup;
    }

    public String sup() {
        return this.msw;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.dg.emc
    public synchronized JSONObject uym() {
        ypw ypwVar;
        try {
            if (this.emc == null && (ypwVar = this.ypw) != null) {
                this.emc = ypwVar.emc(gbl());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.emc;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.dg.emc
    public String ycc() {
        if (TextUtils.isEmpty(this.zz)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("localId", this.zz);
            jSONObject.put("event", uym());
            jSONObject.put("genTime", sup());
            jSONObject.put("priority", (int) this.dg);
            jSONObject.put("type", (int) this.xq);
            jSONObject.put("channel", this.sup);
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.ycc.emc.dg.emc
    public byte ypw() {
        return this.ru;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.dg.emc
    public long zz() {
        return this.ycc;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.dg.emc
    public void emc(JSONObject jSONObject) {
        this.emc = jSONObject;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.dg.emc
    public void ypw(String str) {
        this.msw = str;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.dg.emc
    public void emc(byte b5) {
        this.xq = b5;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.dg.emc
    public void ypw(long j6) {
        this.ycc = j6;
    }

    public emc(String str, ypw ypwVar) {
        this.zz = str;
        this.ypw = ypwVar;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.dg.emc
    public void emc(String str) {
        this.zz = str;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.dg.emc
    public void ypw(byte b5) {
        this.dg = b5;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.dg.emc
    public void emc(long j6) {
        this.bw = j6;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.dg.emc
    public void emc(int i) {
        this.sup = i;
    }

    private emc() {
    }

    public void xq(byte b5) {
        this.ru = b5;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.dg.emc
    public String xq() {
        return this.zz;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.dg.emc
    public void xq(long j6) {
        this.uym = j6;
    }
}

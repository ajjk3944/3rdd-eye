package com.bytedance.sdk.component.ycc.emc.dg.emc;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
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
            int iOptInt = jSONObject.optInt(HandleInvocationsFromAdViewer.KEY_AD_TYPE);
            int iOptInt2 = jSONObject.optInt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
            emc emcVar = new emc();
            emcVar.emc((byte) iOptInt);
            emcVar.ypw((byte) iOptInt2);
            emcVar.emc(jSONObject.optJSONObject(NotificationCompat.CATEGORY_EVENT));
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
            jSONObject.put(NotificationCompat.CATEGORY_EVENT, uym());
            jSONObject.put("genTime", sup());
            jSONObject.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, (int) this.dg);
            jSONObject.put(HandleInvocationsFromAdViewer.KEY_AD_TYPE, (int) this.xq);
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
    public void emc(byte b10) {
        this.xq = b10;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.dg.emc
    public void ypw(long j10) {
        this.ycc = j10;
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
    public void ypw(byte b10) {
        this.dg = b10;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.dg.emc
    public void emc(long j10) {
        this.bw = j10;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.dg.emc
    public void emc(int i10) {
        this.sup = i10;
    }

    private emc() {
    }

    public void xq(byte b10) {
        this.ru = b10;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.dg.emc
    public String xq() {
        return this.zz;
    }

    @Override // com.bytedance.sdk.component.ycc.emc.dg.emc
    public void xq(long j10) {
        this.uym = j10;
    }
}

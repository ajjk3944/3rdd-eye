package com.bytedance.sdk.component.le.ouw.yu.ouw;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw implements com.bytedance.sdk.component.le.ouw.yu.ouw {
    private String bly;
    public int fkw;

    /* renamed from: le, reason: collision with root package name */
    private vt f7585le;

    /* renamed from: lh, reason: collision with root package name */
    protected JSONObject f7586lh;
    public byte ouw;
    private long pno;
    private long ra;
    private String tlj;
    public byte vt;
    public byte yu;

    public ouw(String str, JSONObject jSONObject) {
        this.tlj = str;
        this.f7586lh = jSONObject;
    }

    public static com.bytedance.sdk.component.le.ouw.yu.ouw lh(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("type");
            int iOptInt2 = jSONObject.optInt("priority");
            ouw ouwVar = new ouw();
            ouwVar.ouw((byte) iOptInt);
            ouwVar.vt((byte) iOptInt2);
            ouwVar.ouw(jSONObject.optJSONObject("event"));
            ouwVar.ouw(jSONObject.optString("localId"));
            ouwVar.vt(jSONObject.optString("genTime"));
            ouwVar.ouw(jSONObject.optInt("channel"));
            return ouwVar;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.le.ouw.yu.ouw
    public final byte fkw() {
        return this.vt;
    }

    @Override // com.bytedance.sdk.component.le.ouw.yu.ouw
    public final String le() {
        if (TextUtils.isEmpty(this.tlj)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("localId", this.tlj);
            jSONObject.put("event", ra());
            jSONObject.put("genTime", this.bly);
            jSONObject.put("priority", (int) this.vt);
            jSONObject.put("type", (int) this.ouw);
            jSONObject.put("channel", this.fkw);
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.le.ouw.yu.ouw
    public final vt ouw() {
        return this.f7585le;
    }

    @Override // com.bytedance.sdk.component.le.ouw.yu.ouw
    public final int pno() {
        return this.fkw;
    }

    @Override // com.bytedance.sdk.component.le.ouw.yu.ouw
    public final synchronized JSONObject ra() {
        vt vtVar;
        try {
            if (this.f7586lh == null && (vtVar = this.f7585le) != null) {
                this.f7586lh = vtVar.ouw();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f7586lh;
    }

    @Override // com.bytedance.sdk.component.le.ouw.yu.ouw
    public final byte vt() {
        return this.yu;
    }

    @Override // com.bytedance.sdk.component.le.ouw.yu.ouw
    public final byte yu() {
        return this.ouw;
    }

    @Override // com.bytedance.sdk.component.le.ouw.yu.ouw
    public final void ouw(JSONObject jSONObject) {
        this.f7586lh = jSONObject;
    }

    @Override // com.bytedance.sdk.component.le.ouw.yu.ouw
    public final void vt(String str) {
        this.bly = str;
    }

    @Override // com.bytedance.sdk.component.le.ouw.yu.ouw
    public final void ouw(byte b10) {
        this.ouw = b10;
    }

    @Override // com.bytedance.sdk.component.le.ouw.yu.ouw
    public final void vt(long j) {
        this.pno = j;
    }

    public ouw(String str, vt vtVar) {
        this.tlj = str;
        this.f7585le = vtVar;
    }

    @Override // com.bytedance.sdk.component.le.ouw.yu.ouw
    public final void ouw(String str) {
        this.tlj = str;
    }

    @Override // com.bytedance.sdk.component.le.ouw.yu.ouw
    public final void vt(byte b10) {
        this.vt = b10;
    }

    @Override // com.bytedance.sdk.component.le.ouw.yu.ouw
    public final void ouw(long j) {
        this.ra = j;
    }

    @Override // com.bytedance.sdk.component.le.ouw.yu.ouw
    public final void ouw(int i4) {
        this.fkw = i4;
    }

    private ouw() {
    }

    @Override // com.bytedance.sdk.component.le.ouw.yu.ouw
    public final String lh() {
        return this.tlj;
    }
}

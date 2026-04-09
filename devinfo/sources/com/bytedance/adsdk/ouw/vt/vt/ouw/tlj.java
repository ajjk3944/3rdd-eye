package com.bytedance.adsdk.ouw.vt.vt.ouw;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class tlj implements com.bytedance.adsdk.ouw.vt.vt.ouw {

    /* renamed from: lh, reason: collision with root package name */
    private String f6814lh;
    public com.bytedance.adsdk.ouw.vt.vt.ouw[] ouw;
    public boolean vt;
    private com.bytedance.adsdk.ouw.vt.ouw.ouw yu;

    public tlj(String str) {
        this.f6814lh = str;
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final Object ouw(Map<String, JSONObject> map) {
        com.bytedance.adsdk.ouw.vt.ouw.ouw ouwVar = new com.bytedance.adsdk.ouw.vt.ouw.ouw();
        this.yu = ouwVar;
        ouwVar.ouw = this.f6814lh;
        Object[] objArr = new Object[this.ouw.length];
        int i4 = 0;
        while (true) {
            com.bytedance.adsdk.ouw.vt.vt.ouw[] ouwVarArr = this.ouw;
            if (i4 >= ouwVarArr.length) {
                this.yu.vt = objArr;
                return com.bytedance.adsdk.ouw.rn.ouw(this.f6814lh).ouw(map.get("default_key"), objArr);
            }
            com.bytedance.adsdk.ouw.vt.vt.ouw ouwVar2 = ouwVarArr[i4];
            if (ouwVar2 != null) {
                objArr[i4] = ouwVar2.ouw(map);
            }
            i4++;
        }
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final String vt() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f6814lh);
        sb2.append("(");
        com.bytedance.adsdk.ouw.vt.vt.ouw[] ouwVarArr = this.ouw;
        if (ouwVarArr != null && ouwVarArr.length > 0) {
            int i4 = 0;
            while (true) {
                com.bytedance.adsdk.ouw.vt.vt.ouw[] ouwVarArr2 = this.ouw;
                if (i4 >= ouwVarArr2.length) {
                    break;
                }
                sb2.append(ouwVarArr2[i4].vt());
                sb2.append(",");
                i4++;
            }
        }
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final com.bytedance.adsdk.ouw.vt.yu.fkw ouw() {
        return com.bytedance.adsdk.ouw.vt.yu.vt.METHOD;
    }
}

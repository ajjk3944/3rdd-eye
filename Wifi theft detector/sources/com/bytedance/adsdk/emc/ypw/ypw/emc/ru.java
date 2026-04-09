package com.bytedance.adsdk.emc.ypw.ypw.emc;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ru implements com.bytedance.adsdk.emc.ypw.ypw.emc {
    private boolean dg;
    private com.bytedance.adsdk.emc.ypw.ypw.emc[] emc;
    private com.bytedance.adsdk.emc.ypw.emc.emc xq;
    private String ypw;

    public ru(String str) {
        this.ypw = str;
    }

    public void emc(com.bytedance.adsdk.emc.ypw.ypw.emc[] emcVarArr) {
        this.emc = emcVarArr;
    }

    public boolean xq() {
        return this.dg;
    }

    @Override // com.bytedance.adsdk.emc.ypw.ypw.emc
    public String ypw() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.ypw);
        sb.append("(");
        com.bytedance.adsdk.emc.ypw.ypw.emc[] emcVarArr = this.emc;
        if (emcVarArr != null && emcVarArr.length > 0) {
            int i10 = 0;
            while (true) {
                com.bytedance.adsdk.emc.ypw.ypw.emc[] emcVarArr2 = this.emc;
                if (i10 >= emcVarArr2.length) {
                    break;
                }
                sb.append(emcVarArr2[i10].ypw());
                sb.append(",");
                i10++;
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public void emc(boolean z10) {
        this.dg = z10;
    }

    @Override // com.bytedance.adsdk.emc.ypw.ypw.emc
    public Object emc(Map<String, JSONObject> map) {
        com.bytedance.adsdk.emc.ypw.emc.emc emcVar = new com.bytedance.adsdk.emc.ypw.emc.emc();
        this.xq = emcVar;
        emcVar.emc(this.ypw);
        Object[] objArr = new Object[this.emc.length];
        int i10 = 0;
        while (true) {
            com.bytedance.adsdk.emc.ypw.ypw.emc[] emcVarArr = this.emc;
            if (i10 < emcVarArr.length) {
                com.bytedance.adsdk.emc.ypw.ypw.emc emcVar2 = emcVarArr[i10];
                if (emcVar2 != null) {
                    objArr[i10] = emcVar2.emc(map);
                }
                i10++;
            } else {
                this.xq.emc(objArr);
                return com.bytedance.adsdk.emc.vk.emc(this.ypw).emc(map.get("default_key"), objArr);
            }
        }
    }

    @Override // com.bytedance.adsdk.emc.ypw.ypw.emc
    public com.bytedance.adsdk.emc.ypw.dg.bw emc() {
        return com.bytedance.adsdk.emc.ypw.dg.ypw.METHOD;
    }
}

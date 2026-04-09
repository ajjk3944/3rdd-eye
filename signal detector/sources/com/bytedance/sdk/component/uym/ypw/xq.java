package com.bytedance.sdk.component.uym.ypw;

import android.text.TextUtils;
import com.bytedance.sdk.component.ypw.emc.gbl;
import com.bytedance.sdk.component.ypw.emc.sup;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class xq {
    String bw;
    protected gbl xq;
    int ycc;
    protected String dg = null;
    protected final Map<String, String> uym = new HashMap();
    protected String msw = null;
    protected boolean zz = false;

    public xq(gbl gblVar) {
        this.xq = gblVar;
        try {
            xq(UUID.randomUUID().toString());
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void dg(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.uym.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public void emc(String str) {
        this.bw = str;
    }

    public void xq(String str) {
        this.dg = str;
    }

    public void ypw(String str) {
        this.msw = str;
    }

    public void emc(int i) {
        this.ycc = i;
    }

    public String xq() {
        return this.dg;
    }

    public void ypw(String str, String str2) {
        this.uym.put(str, str2);
    }

    public String dg() {
        return this.msw;
    }

    public void emc(sup.emc emcVar) {
        if (emcVar != null && this.uym.size() > 0) {
            for (Map.Entry<String, String> entry : this.uym.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key)) {
                    String value = entry.getValue();
                    if (value == null) {
                        value = "";
                    }
                    emcVar.ypw(key, value);
                }
            }
        }
    }

    public void ypw() {
        gbl gblVar;
        if (this.dg == null || (gblVar = this.xq) == null) {
            return;
        }
        com.bytedance.sdk.component.ypw.emc.dg dgVarEmc = gblVar.emc();
        synchronized (dgVarEmc) {
            try {
                for (com.bytedance.sdk.component.ypw.emc.ypw ypwVar : dgVarEmc.xq()) {
                    if (this.dg.equals(ypwVar.emc().emc())) {
                        ypwVar.xq();
                    }
                }
                for (com.bytedance.sdk.component.ypw.emc.ypw ypwVar2 : dgVarEmc.dg()) {
                    if (this.dg.equals(ypwVar2.emc().emc())) {
                        ypwVar2.xq();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

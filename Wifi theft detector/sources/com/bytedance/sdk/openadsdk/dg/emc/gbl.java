package com.bytedance.sdk.openadsdk.dg.emc;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class gbl {
    public static gbl emc = new gbl();
    private volatile boolean dg;
    private final Map<String, emc> xq = new HashMap();
    private emc ypw;

    public static class emc {
        private final int emc;
        private final int ypw;

        public emc(int i10, int i11) {
            this.emc = (i10 < 0 || i10 > 5) ? 3 : i10;
            this.ypw = i11 < 10 ? 30 : i11;
        }

        public int emc() {
            return this.emc;
        }

        public int ypw() {
            return this.ypw;
        }
    }

    private int xq() {
        emc emcVar = this.ypw;
        if (emcVar != null) {
            return emcVar.ypw();
        }
        return 30;
    }

    private int ypw() {
        emc emcVar = this.ypw;
        if (emcVar != null) {
            return emcVar.emc();
        }
        return 3;
    }

    public void emc(emc emcVar) {
        this.ypw = emcVar;
    }

    public void emc(String str, emc emcVar) {
        if (TextUtils.isEmpty(str) || emcVar == null) {
            return;
        }
        this.xq.put(str, emcVar);
    }

    public int ypw(String str) {
        emc emcVar = this.xq.get(str);
        if (emcVar == null) {
            return xq();
        }
        return emcVar.ypw();
    }

    public int emc(String str) {
        if (!emc()) {
            return 4;
        }
        emc emcVar = this.xq.get(str);
        if (emcVar == null) {
            return ypw();
        }
        return emcVar.emc();
    }

    public boolean emc() {
        return this.dg;
    }

    public void emc(boolean z10) {
        this.dg = z10;
    }
}

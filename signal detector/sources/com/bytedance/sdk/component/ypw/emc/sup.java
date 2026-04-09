package com.bytedance.sdk.component.ypw.emc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class sup {
    public gbl emc;
    public com.bytedance.sdk.component.xq.emc.emc ypw = new com.bytedance.sdk.component.xq.emc.emc();

    public static class emc {
        Object bw;
        String dg;
        com.bytedance.sdk.component.ypw.emc.emc emc;
        String msw;
        int uym;
        uym xq;
        sz ycc;
        Map<String, List<String>> ypw;

        public emc() {
            this.ypw = new HashMap();
        }

        public emc emc(com.bytedance.sdk.component.ypw.emc.emc emcVar) {
            this.emc = emcVar;
            return this;
        }

        public emc ypw(String str) {
            return emc(uym.xq(str));
        }

        public emc emc(String str) {
            this.msw = str;
            return this;
        }

        public emc ypw(String str, String str2) {
            if (!this.ypw.containsKey(str)) {
                this.ypw.put(str, new ArrayList());
            }
            this.ypw.get(str).add(str2);
            return this;
        }

        public emc(sup supVar) {
            this.xq = supVar.ypw();
            this.dg = supVar.xq();
            this.ypw = supVar.dg();
            this.bw = supVar.emc();
            this.ycc = supVar.msw();
            this.emc = supVar.bw();
            this.uym = supVar.uym();
            this.msw = supVar.ycc();
        }

        public emc emc(int i) {
            this.uym = i;
            return this;
        }

        public emc emc(Object obj) {
            this.bw = obj;
            return this;
        }

        public emc emc(uym uymVar) {
            this.xq = uymVar;
            return this;
        }

        public sup ypw() {
            return new sup() { // from class: com.bytedance.sdk.component.ypw.emc.sup.emc.1
                @Override // com.bytedance.sdk.component.ypw.emc.sup
                public com.bytedance.sdk.component.ypw.emc.emc bw() {
                    return emc.this.emc;
                }

                @Override // com.bytedance.sdk.component.ypw.emc.sup
                public Map dg() {
                    return emc.this.ypw;
                }

                @Override // com.bytedance.sdk.component.ypw.emc.sup
                public Object emc() {
                    return emc.this.bw;
                }

                @Override // com.bytedance.sdk.component.ypw.emc.sup
                public sz msw() {
                    return emc.this.ycc;
                }

                public String toString() {
                    return "";
                }

                @Override // com.bytedance.sdk.component.ypw.emc.sup
                public int uym() {
                    return emc.this.uym;
                }

                @Override // com.bytedance.sdk.component.ypw.emc.sup
                public String xq() {
                    return emc.this.dg;
                }

                @Override // com.bytedance.sdk.component.ypw.emc.sup
                public String ycc() {
                    return emc.this.msw;
                }

                @Override // com.bytedance.sdk.component.ypw.emc.sup
                public uym ypw() {
                    return emc.this.xq;
                }
            };
        }

        public emc emc(String str, String str2) {
            return ypw(str, str2);
        }

        public emc emc() {
            return emc("GET", (sz) null);
        }

        private emc emc(String str, sz szVar) {
            this.dg = str;
            this.ycc = szVar;
            return this;
        }

        public emc emc(sz szVar) {
            return emc("POST", szVar);
        }
    }

    public abstract com.bytedance.sdk.component.ypw.emc.emc bw();

    public abstract Map<String, List<String>> dg();

    public abstract Object emc();

    public void emc(gbl gblVar) {
        this.emc = gblVar;
    }

    public sz msw() {
        return null;
    }

    public abstract int uym();

    public abstract String xq();

    public abstract String ycc();

    public abstract uym ypw();

    public emc zz() {
        return new emc(this);
    }
}

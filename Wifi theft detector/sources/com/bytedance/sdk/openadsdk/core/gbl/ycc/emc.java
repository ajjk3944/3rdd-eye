package com.bytedance.sdk.openadsdk.core.gbl.ycc;

import com.bytedance.adsdk.ugeno.core.sba;
import com.bytedance.sdk.component.adexpress.ypw.sz;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc extends sz {
    private boolean bw;
    private float dg;
    private JSONObject emc;
    private float xq;
    private sba ypw;

    /* renamed from: com.bytedance.sdk.openadsdk.core.gbl.ycc.emc$emc, reason: collision with other inner class name */
    public static class C0146emc extends sz.emc {
        private boolean bw;
        private float dg;
        private JSONObject emc;
        private float xq;
        private sba ypw;

        public C0146emc ycc(boolean z10) {
            this.bw = z10;
            return this;
        }

        public C0146emc ypw(float f10) {
            this.dg = f10;
            return this;
        }

        public C0146emc emc(JSONObject jSONObject) {
            this.emc = jSONObject;
            return this;
        }

        @Override // com.bytedance.sdk.component.adexpress.ypw.sz.emc
        /* renamed from: ypw, reason: merged with bridge method [inline-methods] */
        public emc emc() {
            return new emc(this);
        }

        public C0146emc emc(sba sbaVar) {
            this.ypw = sbaVar;
            return this;
        }

        public C0146emc emc(float f10) {
            this.xq = f10;
            return this;
        }
    }

    public emc(C0146emc c0146emc) {
        super(c0146emc);
        this.emc = c0146emc.emc;
        this.ypw = c0146emc.ypw;
        this.xq = c0146emc.xq;
        this.dg = c0146emc.dg;
        this.bw = c0146emc.bw;
    }

    public sba cuf() {
        return this.ypw;
    }

    public float dr() {
        return this.xq;
    }

    public JSONObject lt() {
        return this.emc;
    }

    public boolean rtt() {
        return this.bw;
    }

    public float xmt() {
        return this.dg;
    }
}

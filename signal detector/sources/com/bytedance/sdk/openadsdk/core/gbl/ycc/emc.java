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
    public static class C0061emc extends sz.emc {
        private boolean bw;
        private float dg;
        private JSONObject emc;
        private float xq;
        private sba ypw;

        public C0061emc ycc(boolean z6) {
            this.bw = z6;
            return this;
        }

        public C0061emc ypw(float f2) {
            this.dg = f2;
            return this;
        }

        public C0061emc emc(JSONObject jSONObject) {
            this.emc = jSONObject;
            return this;
        }

        @Override // com.bytedance.sdk.component.adexpress.ypw.sz.emc
        /* renamed from: ypw, reason: merged with bridge method [inline-methods] */
        public emc emc() {
            return new emc(this);
        }

        public C0061emc emc(sba sbaVar) {
            this.ypw = sbaVar;
            return this;
        }

        public C0061emc emc(float f2) {
            this.xq = f2;
            return this;
        }
    }

    public emc(C0061emc c0061emc) {
        super(c0061emc);
        this.emc = c0061emc.emc;
        this.ypw = c0061emc.ypw;
        this.xq = c0061emc.xq;
        this.dg = c0061emc.dg;
        this.bw = c0061emc.bw;
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

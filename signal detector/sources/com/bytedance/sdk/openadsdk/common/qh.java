package com.bytedance.sdk.openadsdk.common;

import com.bytedance.sdk.openadsdk.common.emc;

/* loaded from: classes.dex */
public class qh {
    private boolean bw;
    private final emc.ypw dg;
    private final com.bytedance.sdk.openadsdk.component.reward.emc.emc emc;
    private emc.InterfaceC0050emc uym;
    private final Runnable xq;
    private vk ycc;
    private final String ypw;

    public static class emc {
        private final emc.ypw dg;
        private final com.bytedance.sdk.openadsdk.component.reward.emc.emc emc;
        private final Runnable xq;
        private final String ypw;
        private boolean bw = false;
        private vk ycc = null;
        private emc.InterfaceC0050emc uym = null;

        public emc(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar, String str, Runnable runnable, emc.ypw ypwVar) {
            this.emc = emcVar;
            this.ypw = str;
            this.xq = runnable;
            this.dg = ypwVar;
        }

        public emc emc(boolean z6) {
            this.bw = z6;
            return this;
        }

        public emc emc(vk vkVar) {
            this.ycc = vkVar;
            return this;
        }

        public emc emc(emc.InterfaceC0050emc interfaceC0050emc) {
            this.uym = interfaceC0050emc;
            return this;
        }

        public qh emc() {
            if (this.emc != null) {
                if (this.xq != null) {
                    if (this.dg != null) {
                        return new qh(this);
                    }
                    throw new IllegalArgumentException("SkipResultHandler cannot be null");
                }
                throw new IllegalArgumentException("Runnable finishAction cannot be null");
            }
            throw new IllegalArgumentException("RewardFullContext cannot be null");
        }
    }

    public boolean bw() {
        return this.bw;
    }

    public emc.ypw dg() {
        return this.dg;
    }

    public com.bytedance.sdk.openadsdk.component.reward.emc.emc emc() {
        return this.emc;
    }

    public emc.InterfaceC0050emc uym() {
        return this.uym;
    }

    public Runnable xq() {
        return this.xq;
    }

    public vk ycc() {
        return this.ycc;
    }

    public String ypw() {
        return this.ypw;
    }

    private qh(emc emcVar) {
        this.emc = emcVar.emc;
        this.ypw = emcVar.ypw;
        this.xq = emcVar.xq;
        this.dg = emcVar.dg;
        this.bw = emcVar.bw;
        this.ycc = emcVar.ycc;
        this.uym = emcVar.uym;
    }
}

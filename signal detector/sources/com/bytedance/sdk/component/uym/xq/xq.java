package com.bytedance.sdk.component.uym.xq;

/* loaded from: classes.dex */
public class xq {
    private emc emc;
    private ypw ypw;

    public enum emc {
        DEBUG,
        INFO,
        ERROR,
        OFF
    }

    /* renamed from: com.bytedance.sdk.component.uym.xq.xq$xq, reason: collision with other inner class name */
    public static class C0039xq {
        private static final xq emc = new xq();
    }

    public interface ypw {
    }

    public static void emc(emc emcVar) {
        synchronized (xq.class) {
            C0039xq.emc.emc = emcVar;
        }
    }

    private xq() {
        this.emc = emc.OFF;
        this.ypw = new com.bytedance.sdk.component.uym.xq.ypw();
    }
}

package com.bytedance.sdk.component.emc;

/* loaded from: classes.dex */
public abstract class xq<P, R> extends com.bytedance.sdk.component.emc.ypw<P, R> {
    private boolean emc = true;
    private bw xq;
    private emc ypw;

    public interface emc {
        void emc(Object obj);

        void emc(Throwable th);
    }

    public interface ypw {
        xq emc();
    }

    private boolean ycc() {
        if (this.emc) {
            return true;
        }
        msw.emc(new IllegalStateException("Jsb async call already finished: " + emc() + ", hashcode: " + hashCode()));
        return false;
    }

    public void bw() {
        dg();
    }

    public void dg() {
        this.emc = false;
        this.xq = null;
    }

    @Override // com.bytedance.sdk.component.emc.ypw
    public /* bridge */ /* synthetic */ String emc() {
        return super.emc();
    }

    public abstract void emc(P p10, bw bwVar) throws Exception;

    public final void xq() {
        emc((Throwable) null);
    }

    public final void emc(R r10) {
        if (ycc()) {
            this.ypw.emc(r10);
            dg();
        }
    }

    public final void emc(Throwable th) {
        if (ycc()) {
            this.ypw.emc(th);
            dg();
        }
    }

    public void emc(P p10, bw bwVar, emc emcVar) throws Exception {
        this.xq = bwVar;
        this.ypw = emcVar;
        emc(p10, bwVar);
    }
}

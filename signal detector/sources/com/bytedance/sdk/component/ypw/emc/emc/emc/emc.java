package com.bytedance.sdk.component.ypw.emc.emc.emc;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class emc extends com.bytedance.sdk.component.ypw.emc.dg {
    public static volatile ru emc;
    private ExecutorService dg;
    private List<com.bytedance.sdk.component.ypw.emc.ypw> ypw = new CopyOnWriteArrayList();
    private List<com.bytedance.sdk.component.ypw.emc.ypw> xq = new CopyOnWriteArrayList();

    public emc(ExecutorService executorService) {
        this.dg = executorService;
    }

    public boolean bw() {
        return (emc == null || emc.emc() == null) ? false : true;
    }

    @Override // com.bytedance.sdk.component.ypw.emc.dg
    public List<com.bytedance.sdk.component.ypw.emc.ypw> dg() {
        return this.xq;
    }

    @Override // com.bytedance.sdk.component.ypw.emc.dg
    public int emc() {
        return 0;
    }

    @Override // com.bytedance.sdk.component.ypw.emc.dg
    public List<com.bytedance.sdk.component.ypw.emc.ypw> xq() {
        return this.ypw;
    }

    @Override // com.bytedance.sdk.component.ypw.emc.dg
    public ExecutorService ypw() {
        ExecutorService executorServiceEmc = emc != null ? emc.emc() : null;
        return executorServiceEmc != null ? executorServiceEmc : this.dg;
    }

    @Override // com.bytedance.sdk.component.ypw.emc.dg
    public void emc(int i) {
    }

    public static void emc(ru ruVar) {
        emc = ruVar;
    }
}

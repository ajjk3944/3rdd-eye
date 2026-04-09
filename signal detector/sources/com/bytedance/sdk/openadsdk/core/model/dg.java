package com.bytedance.sdk.openadsdk.core.model;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class dg {
    private com.bytedance.sdk.openadsdk.core.sup.dg emc = new com.bytedance.sdk.openadsdk.core.sup.dg();
    private Set<com.bytedance.sdk.openadsdk.core.sup.ru> ypw = new HashSet();

    public com.bytedance.sdk.openadsdk.core.sup.dg emc() {
        return this.emc;
    }

    public Set<com.bytedance.sdk.openadsdk.core.sup.ru> ypw() {
        return this.ypw;
    }

    public void emc(com.bytedance.sdk.openadsdk.core.sup.dg dgVar) {
        if (dgVar == null) {
            dgVar = new com.bytedance.sdk.openadsdk.core.sup.dg();
        }
        this.emc = dgVar;
    }

    public void ypw(Set<com.bytedance.sdk.openadsdk.core.sup.ru> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        this.ypw.addAll(set);
    }

    public void emc(Set<com.bytedance.sdk.openadsdk.core.sup.ru> set) {
        this.ypw = set;
    }

    public void emc(rie rieVar) {
        com.bytedance.sdk.openadsdk.core.sup.dg dgVar = this.emc;
        if (dgVar != null) {
            dgVar.emc(rieVar);
        }
    }
}

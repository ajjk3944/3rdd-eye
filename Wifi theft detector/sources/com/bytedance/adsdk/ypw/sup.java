package com.bytedance.adsdk.ypw;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class sup<V> {
    private final V emc;
    private final Throwable ypw;

    public sup(V v10) {
        this.emc = v10;
        this.ypw = null;
    }

    public V emc() {
        return this.emc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sup)) {
            return false;
        }
        sup supVar = (sup) obj;
        if (emc() != null && emc().equals(supVar.emc())) {
            return true;
        }
        if (ypw() == null || supVar.ypw() == null) {
            return false;
        }
        return ypw().toString().equals(ypw().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{emc(), ypw()});
    }

    public Throwable ypw() {
        return this.ypw;
    }

    public sup(Throwable th) {
        this.ypw = th;
        this.emc = null;
    }
}

package com.bytedance.adsdk.emc.ypw.emc;

import java.util.Arrays;

/* loaded from: classes.dex */
public class emc {
    private String emc;
    private Object[] ypw;

    public String emc() {
        return this.emc;
    }

    public String toString() {
        return "MethodResult{methodName='" + this.emc + "', args=" + Arrays.toString(this.ypw) + '}';
    }

    public Object[] ypw() {
        return this.ypw;
    }

    public void emc(String str) {
        this.emc = str;
    }

    public void emc(Object[] objArr) {
        this.ypw = objArr;
    }
}

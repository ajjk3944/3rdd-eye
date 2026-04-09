package com.bytedance.sdk.component.adexpress.dynamic.dg;

import java.util.Arrays;

/* loaded from: classes.dex */
public class zz {
    public float emc;
    public float ypw;

    public zz(float f10, float f11) {
        this.emc = f10;
        this.ypw = f11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zz zzVar = (zz) obj;
            if (Float.compare(zzVar.emc, this.emc) == 0 && Float.compare(zzVar.ypw, this.ypw) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.emc), Float.valueOf(this.ypw)});
    }
}

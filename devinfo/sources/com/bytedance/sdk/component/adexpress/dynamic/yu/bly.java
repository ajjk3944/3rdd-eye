package com.bytedance.sdk.component.adexpress.dynamic.yu;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class bly {
    public float ouw;
    public float vt;

    public bly(float f10, float f11) {
        this.ouw = f10;
        this.vt = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bly.class == obj.getClass()) {
            bly blyVar = (bly) obj;
            if (Float.compare(blyVar.ouw, this.ouw) == 0 && Float.compare(blyVar.vt, this.vt) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.ouw), Float.valueOf(this.vt)});
    }
}

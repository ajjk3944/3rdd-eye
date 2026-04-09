package com.bytedance.adsdk.vt;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class mwh<V> {
    public final V ouw;
    final Throwable vt;

    public mwh(V v10) {
        this.ouw = v10;
        this.vt = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwh)) {
            return false;
        }
        mwh mwhVar = (mwh) obj;
        V v10 = this.ouw;
        if (v10 != null && v10.equals(mwhVar.ouw)) {
            return true;
        }
        Throwable th2 = this.vt;
        if (th2 == null || mwhVar.vt == null) {
            return false;
        }
        return th2.toString().equals(this.vt.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.ouw, this.vt});
    }

    public mwh(Throwable th2) {
        this.vt = th2;
        this.ouw = null;
    }
}

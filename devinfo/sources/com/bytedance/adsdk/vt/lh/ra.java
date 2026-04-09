package com.bytedance.adsdk.vt.lh;

import android.util.Pair;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ra<T> {
    public T ouw;
    public T vt;

    private static boolean ouw(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return ouw(pair.first, this.ouw) && ouw(pair.second, this.vt);
    }

    public final int hashCode() {
        T t10 = this.ouw;
        int iHashCode = t10 == null ? 0 : t10.hashCode();
        T t11 = this.vt;
        return iHashCode ^ (t11 != null ? t11.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + this.ouw + " " + this.vt + "}";
    }
}

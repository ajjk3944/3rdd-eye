package com.bytedance.adsdk.ypw.xq;

import android.util.Pair;

/* loaded from: classes.dex */
public class uym<T> {
    T emc;
    T ypw;

    private static boolean ypw(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public void emc(T t10, T t11) {
        this.emc = t10;
        this.ypw = t11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return ypw(pair.first, this.emc) && ypw(pair.second, this.ypw);
    }

    public int hashCode() {
        T t10 = this.emc;
        int iHashCode = t10 == null ? 0 : t10.hashCode();
        T t11 = this.ypw;
        return iHashCode ^ (t11 != null ? t11.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.emc + " " + this.ypw + "}";
    }
}

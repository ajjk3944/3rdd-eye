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

    public void emc(T t6, T t7) {
        this.emc = t6;
        this.ypw = t7;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return ypw(pair.first, this.emc) && ypw(pair.second, this.ypw);
    }

    public int hashCode() {
        T t6 = this.emc;
        int iHashCode = t6 == null ? 0 : t6.hashCode();
        T t7 = this.ypw;
        return iHashCode ^ (t7 != null ? t7.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.emc + " " + this.ypw + "}";
    }
}

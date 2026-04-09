package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class BB extends AbstractC1087eC implements Serializable {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        Integer num2 = (Integer) obj;
        if (num2.intValue() == -1) {
            return num.intValue() == -1 ? 0 : -1;
        }
        if (num.intValue() == -1) {
            return 1;
        }
        return num2.intValue() - num.intValue();
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BB)) {
            return false;
        }
        Object obj2 = C2045w.f17388l;
        ((BB) obj).getClass();
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return C2045w.f17388l.hashCode();
    }

    public final String toString() {
        return C2045w.f17388l.toString();
    }
}

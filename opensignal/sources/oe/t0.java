package oe;

import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class t0 implements Comparator {
    public static t0 a(Comparator comparator) {
        return comparator instanceof t0 ? (t0) comparator : new x(comparator);
    }

    public t0 b() {
        return new b1(this);
    }
}

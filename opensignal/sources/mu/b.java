package mu;

import lf.t1;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f17008a;

    static {
        Object objK;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            br.l.d(property, "getProperty(...)");
            objK = tt.s.o0(property);
        } catch (Throwable th2) {
            objK = t1.k(th2);
        }
        if (objK instanceof lq.n) {
            objK = null;
        }
        Integer num = (Integer) objK;
        f17008a = num != null ? num.intValue() : 2097152;
    }
}

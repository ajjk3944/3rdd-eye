package ol;

import vk.p;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f30581a;

    static {
        Object objH;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            nk.k.d(property, "getProperty(...)");
            objH = p.x0(property);
        } catch (Throwable th2) {
            objH = ci.b.h(th2);
        }
        if (objH instanceof yj.k) {
            objH = null;
        }
        Integer num = (Integer) objH;
        f30581a = num != null ? num.intValue() : 2097152;
    }
}

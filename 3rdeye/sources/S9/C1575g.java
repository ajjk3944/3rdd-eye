package S9;

import b9.m;

/* compiled from: ArrayPools.kt */
/* renamed from: S9.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1575g {

    /* renamed from: a, reason: collision with root package name */
    public static final int f12085a;

    static {
        Object objA;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            kotlin.jvm.internal.l.e(property, "getProperty(\"kotlinx.ser…lization.json.pool.size\")");
            objA = y9.m.Q(property);
        } catch (Throwable th) {
            objA = b9.n.a(th);
        }
        if (objA instanceof m.a) {
            objA = null;
        }
        Integer num = (Integer) objA;
        f12085a = num != null ? num.intValue() : 2097152;
    }
}

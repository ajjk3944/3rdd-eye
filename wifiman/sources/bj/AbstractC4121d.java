package bj;

import Yg.u;

/* renamed from: bj.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4121d {

    /* renamed from: a, reason: collision with root package name */
    private static final int f33439a;

    static {
        Object objC;
        try {
            u.a aVar = Yg.u.f25017b;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            objC = Yg.u.c(property != null ? kotlin.text.t.q(property) : null);
        } catch (Throwable th2) {
            u.a aVar2 = Yg.u.f25017b;
            objC = Yg.u.c(Yg.v.a(th2));
        }
        Integer num = (Integer) (Yg.u.l(objC) ? null : objC);
        f33439a = num != null ? num.intValue() : 2097152;
    }
}

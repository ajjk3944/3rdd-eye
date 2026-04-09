package wh;

import Yg.u;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* renamed from: wh.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8350b {
    static {
        Object objC;
        try {
            u.a aVar = Yg.u.f25017b;
            objC = Yg.u.c(Class.forName("java.lang.ClassValue"));
        } catch (Throwable th2) {
            u.a aVar2 = Yg.u.f25017b;
            objC = Yg.u.c(Yg.v.a(th2));
        }
        if (Yg.u.m(objC)) {
            objC = Boolean.TRUE;
        }
        Object objC2 = Yg.u.c(objC);
        Boolean bool = Boolean.FALSE;
        if (Yg.u.l(objC2)) {
            objC2 = bool;
        }
        ((Boolean) objC2).booleanValue();
    }

    public static final AbstractC8348a a(InterfaceC6835l compute) {
        AbstractC6492s.i(compute, "compute");
        return new C8364i(compute);
    }
}

package N;

import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import r.C7517a;
import r.C7548x;
import r.InterfaceC7533i;
import y.InterfaceC8555j;

/* loaded from: classes.dex */
public abstract class L {

    /* renamed from: a, reason: collision with root package name */
    private static final r.r0 f13785a = new r.r0(120, 0, r.G.c(), 2, null);

    /* renamed from: b, reason: collision with root package name */
    private static final r.r0 f13786b = new r.r0(150, 0, new C7548x(0.4f, 0.0f, 0.6f, 1.0f), 2, null);

    /* renamed from: c, reason: collision with root package name */
    private static final r.r0 f13787c = new r.r0(120, 0, new C7548x(0.4f, 0.0f, 0.6f, 1.0f), 2, null);

    public static final Object d(C7517a c7517a, float f10, InterfaceC8555j interfaceC8555j, InterfaceC8555j interfaceC8555j2, InterfaceC5380e interfaceC5380e) {
        InterfaceC7533i interfaceC7533iA = interfaceC8555j2 != null ? K.f13782a.a(interfaceC8555j2) : interfaceC8555j != null ? K.f13782a.b(interfaceC8555j) : null;
        if (interfaceC7533iA != null) {
            Object objF = C7517a.f(c7517a, Y0.h.d(f10), interfaceC7533iA, null, null, interfaceC5380e, 12, null);
            return objF == AbstractC5467b.g() ? objF : Yg.J.f24997a;
        }
        Object objT = c7517a.t(Y0.h.d(f10), interfaceC5380e);
        return objT == AbstractC5467b.g() ? objT : Yg.J.f24997a;
    }
}

package Q0;

import Q0.AbstractC3442t;
import Q0.C3430g;
import Yg.u;
import Zg.AbstractC3689v;
import java.util.List;
import mh.InterfaceC6835l;

/* renamed from: Q0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3441s {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.s b(List list, S s10, C3430g c3430g, G g10, InterfaceC6835l interfaceC6835l) {
        Object objA;
        InterfaceC3433j interfaceC3433j;
        Object objC;
        InterfaceC3433j interfaceC3433j2;
        int size = list.size();
        List listR = null;
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC3433j interfaceC3433j3 = (InterfaceC3433j) list.get(i10);
            int iA = interfaceC3433j3.a();
            AbstractC3442t.a aVar = AbstractC3442t.f19096a;
            if (AbstractC3442t.e(iA, aVar.b())) {
                synchronized (c3430g.f19059d) {
                    try {
                        C3430g.b bVar = new C3430g.b(interfaceC3433j3, g10.c());
                        C3430g.a aVar2 = (C3430g.a) c3430g.f19057b.d(bVar);
                        if (aVar2 == null) {
                            aVar2 = (C3430g.a) c3430g.f19058c.b(bVar);
                        }
                        if (aVar2 != null) {
                            objA = aVar2.g();
                            interfaceC3433j = interfaceC3433j3;
                        } else {
                            Yg.J j10 = Yg.J.f24997a;
                            try {
                                objA = g10.a(interfaceC3433j3);
                                interfaceC3433j = interfaceC3433j3;
                                C3430g.f(c3430g, interfaceC3433j3, g10, objA, false, 8, null);
                            } catch (Exception e10) {
                                throw new IllegalStateException("Unable to load font " + interfaceC3433j3, e10);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (objA != null) {
                    return Yg.z.a(listR, x.a(s10.e(), objA, interfaceC3433j, s10.f(), s10.d()));
                }
                throw new IllegalStateException("Unable to load font " + interfaceC3433j);
            }
            if (AbstractC3442t.e(iA, aVar.c())) {
                synchronized (c3430g.f19059d) {
                    try {
                        C3430g.b bVar2 = new C3430g.b(interfaceC3433j3, g10.c());
                        C3430g.a aVar3 = (C3430g.a) c3430g.f19057b.d(bVar2);
                        if (aVar3 == null) {
                            aVar3 = (C3430g.a) c3430g.f19058c.b(bVar2);
                        }
                        if (aVar3 != null) {
                            objC = aVar3.g();
                            interfaceC3433j2 = interfaceC3433j3;
                        } else {
                            Yg.J j11 = Yg.J.f24997a;
                            try {
                                u.a aVar4 = Yg.u.f25017b;
                                objC = Yg.u.c(g10.a(interfaceC3433j3));
                            } catch (Throwable th3) {
                                u.a aVar5 = Yg.u.f25017b;
                                objC = Yg.u.c(Yg.v.a(th3));
                            }
                            if (Yg.u.l(objC)) {
                                objC = null;
                            }
                            interfaceC3433j2 = interfaceC3433j3;
                            C3430g.f(c3430g, interfaceC3433j3, g10, objC, false, 8, null);
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                if (objC != null) {
                    return Yg.z.a(listR, x.a(s10.e(), objC, interfaceC3433j2, s10.f(), s10.d()));
                }
            } else {
                if (!AbstractC3442t.e(iA, aVar.a())) {
                    throw new IllegalStateException("Unknown font type " + interfaceC3433j3);
                }
                C3430g.a aVarD = c3430g.d(interfaceC3433j3, g10);
                if (aVarD != null) {
                    if (!C3430g.a.e(aVarD.g()) && aVarD.g() != null) {
                        return Yg.z.a(listR, x.a(s10.e(), aVarD.g(), interfaceC3433j3, s10.f(), s10.d()));
                    }
                } else if (listR == null) {
                    listR = AbstractC3689v.r(interfaceC3433j3);
                } else {
                    listR.add(interfaceC3433j3);
                }
            }
        }
        return Yg.z.a(listR, interfaceC6835l.invoke(s10));
    }
}

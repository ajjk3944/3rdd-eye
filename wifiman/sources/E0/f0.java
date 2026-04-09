package E0;

import androidx.compose.ui.e;
import androidx.compose.ui.focus.FocusTargetNode;
import j0.InterfaceC6236g;
import k0.InterfaceC6354b;
import o.C7006E;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.transport.TLSTM;
import w0.InterfaceC8251e;
import y0.InterfaceC8566F;

/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    private static final C7006E f3915a = o.L.b();

    public static final void a(e.c cVar) {
        if (!cVar.k2()) {
            B0.a.b("autoInvalidateInsertedNode called on unattached node");
        }
        b(cVar, -1, 1);
    }

    public static final void b(e.c cVar, int i10, int i11) {
        if (!(cVar instanceof AbstractC2635m)) {
            c(cVar, i10 & cVar.f2(), i11);
            return;
        }
        AbstractC2635m abstractC2635m = (AbstractC2635m) cVar;
        c(cVar, abstractC2635m.F2() & i10, i11);
        int i12 = (~abstractC2635m.F2()) & i10;
        for (e.c cVarE2 = abstractC2635m.E2(); cVarE2 != null; cVarE2 = cVarE2.b2()) {
            b(cVarE2, i12, i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void c(e.c cVar, int i10, int i11) {
        if (i11 != 0 || cVar.i2()) {
            if ((e0.a(2) & i10) != 0 && (cVar instanceof B)) {
                E.b((B) cVar);
                if (i11 == 2) {
                    AbstractC2633k.h(cVar, e0.a(2)).b3();
                }
            }
            if ((e0.a(128) & i10) != 0 && (cVar instanceof A) && i11 != 2) {
                AbstractC2633k.m(cVar).F0();
            }
            if ((e0.a(PSKKeyManager.MAX_KEY_LENGTH_BYTES) & i10) != 0 && (cVar instanceof InterfaceC2641t) && i11 != 2) {
                AbstractC2633k.m(cVar).G0();
            }
            if ((e0.a(4) & i10) != 0 && (cVar instanceof r)) {
                AbstractC2640s.a((r) cVar);
            }
            if ((e0.a(8) & i10) != 0 && (cVar instanceof v0)) {
                w0.b((v0) cVar);
            }
            if ((e0.a(64) & i10) != 0 && (cVar instanceof p0)) {
                q0.a((p0) cVar);
            }
            if ((e0.a(1024) & i10) != 0 && (cVar instanceof FocusTargetNode) && i11 != 2) {
                k0.p.c((FocusTargetNode) cVar);
            }
            if ((e0.a(2048) & i10) != 0 && (cVar instanceof k0.h)) {
                k0.h hVar = (k0.h) cVar;
                if (k(hVar)) {
                    if (i11 == 2) {
                        j(hVar);
                    } else {
                        k0.i.a(hVar);
                    }
                }
            }
            if ((i10 & e0.a(4096)) == 0 || !(cVar instanceof InterfaceC6354b)) {
                return;
            }
            k0.c.b((InterfaceC6354b) cVar);
        }
    }

    public static final void d(e.c cVar) {
        if (!cVar.k2()) {
            B0.a.b("autoInvalidateRemovedNode called on unattached node");
        }
        b(cVar, -1, 2);
    }

    public static final void e(e.c cVar) {
        if (!cVar.k2()) {
            B0.a.b("autoInvalidateUpdatedNode called on unattached node");
        }
        b(cVar, -1, 0);
    }

    public static final int f(e.b bVar) {
        int iA = e0.a(1);
        if (bVar instanceof C0.x) {
            iA |= e0.a(2);
        }
        if (bVar instanceof InterfaceC6236g) {
            iA |= e0.a(4);
        }
        if (bVar instanceof J0.l) {
            iA |= e0.a(8);
        }
        if (bVar instanceof InterfaceC8566F) {
            iA |= e0.a(16);
        }
        if ((bVar instanceof D0.d) || (bVar instanceof D0.j)) {
            iA |= e0.a(32);
        }
        if (bVar instanceof C0.J) {
            iA |= e0.a(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
        return bVar instanceof C0.K ? iA | e0.a(64) : iA;
    }

    public static final int g(e.c cVar) {
        if (cVar.f2() != 0) {
            return cVar.f2();
        }
        C7006E c7006e = f3915a;
        Object objB = f0.b.b(cVar);
        int iA = c7006e.a(objB);
        if (iA >= 0) {
            return c7006e.f54906c[iA];
        }
        int iA2 = e0.a(1);
        if (cVar instanceof B) {
            iA2 |= e0.a(2);
        }
        if (cVar instanceof r) {
            iA2 |= e0.a(4);
        }
        if (cVar instanceof v0) {
            iA2 |= e0.a(8);
        }
        if (cVar instanceof s0) {
            iA2 |= e0.a(16);
        }
        if (cVar instanceof D0.h) {
            iA2 |= e0.a(32);
        }
        if (cVar instanceof p0) {
            iA2 |= e0.a(64);
        }
        if (cVar instanceof A) {
            iA2 |= e0.a(128);
        }
        if (cVar instanceof InterfaceC2641t) {
            iA2 |= e0.a(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
        if (cVar instanceof androidx.compose.ui.layout.b) {
            iA2 |= e0.a(512);
        }
        if (cVar instanceof FocusTargetNode) {
            iA2 |= e0.a(1024);
        }
        if (cVar instanceof k0.h) {
            iA2 |= e0.a(2048);
        }
        if (cVar instanceof InterfaceC6354b) {
            iA2 |= e0.a(4096);
        }
        if (cVar instanceof InterfaceC8251e) {
            iA2 |= e0.a(8192);
        }
        if (cVar instanceof A0.a) {
            iA2 |= e0.a(TLSTM.TLS_MAX_FRAGMENT_SIZE);
        }
        if (cVar instanceof InterfaceC2630h) {
            iA2 |= e0.a(32768);
        }
        int iA3 = cVar instanceof A0 ? e0.a(262144) | iA2 : iA2;
        c7006e.r(objB, iA3);
        return iA3;
    }

    public static final int h(e.c cVar) {
        if (!(cVar instanceof AbstractC2635m)) {
            return g(cVar);
        }
        AbstractC2635m abstractC2635m = (AbstractC2635m) cVar;
        int iF2 = abstractC2635m.F2();
        for (e.c cVarE2 = abstractC2635m.E2(); cVarE2 != null; cVarE2 = cVarE2.b2()) {
            iF2 |= h(cVarE2);
        }
        return iF2;
    }

    public static final boolean i(int i10) {
        return (i10 & e0.a(128)) != 0;
    }

    private static final void j(k0.h hVar) {
        int iA = e0.a(1024);
        if (!hVar.h1().k2()) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        V.b bVar = new V.b(new e.c[16], 0);
        e.c cVarB2 = hVar.h1().b2();
        if (cVarB2 == null) {
            AbstractC2633k.c(bVar, hVar.h1());
        } else {
            bVar.b(cVarB2);
        }
        while (bVar.u()) {
            e.c cVarG = (e.c) bVar.z(bVar.o() - 1);
            if ((cVarG.a2() & iA) == 0) {
                AbstractC2633k.c(bVar, cVarG);
            } else {
                while (true) {
                    if (cVarG == null) {
                        break;
                    }
                    if ((cVarG.f2() & iA) != 0) {
                        V.b bVar2 = null;
                        while (cVarG != null) {
                            if (cVarG instanceof FocusTargetNode) {
                                k0.p.c((FocusTargetNode) cVarG);
                            } else if ((cVarG.f2() & iA) != 0 && (cVarG instanceof AbstractC2635m)) {
                                int i10 = 0;
                                for (e.c cVarE2 = ((AbstractC2635m) cVarG).E2(); cVarE2 != null; cVarE2 = cVarE2.b2()) {
                                    if ((cVarE2.f2() & iA) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            cVarG = cVarE2;
                                        } else {
                                            if (bVar2 == null) {
                                                bVar2 = new V.b(new e.c[16], 0);
                                            }
                                            if (cVarG != null) {
                                                bVar2.b(cVarG);
                                                cVarG = null;
                                            }
                                            bVar2.b(cVarE2);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            cVarG = AbstractC2633k.g(bVar2);
                        }
                    } else {
                        cVarG = cVarG.b2();
                    }
                }
            }
        }
    }

    private static final boolean k(k0.h hVar) {
        C2627e c2627e = C2627e.f3913a;
        c2627e.b();
        hVar.o0(c2627e);
        return c2627e.a();
    }
}

package m0;

import kotlin.NoWhenBranchMatchedException;
import l0.AbstractC6525a;
import l0.AbstractC6526b;
import l0.AbstractC6532h;
import l0.AbstractC6538n;
import l0.C6533i;
import l0.C6535k;
import m0.Q0;
import o0.AbstractC7040g;
import o0.C7043j;
import o0.InterfaceC7039f;

/* loaded from: classes.dex */
public abstract class R0 {
    public static final void a(InterfaceC7039f interfaceC7039f, Q0 q02, AbstractC6713l0 abstractC6713l0, float f10, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10) {
        U0 u0B;
        if (q02 instanceof Q0.b) {
            C6533i c6533iB = ((Q0.b) q02).b();
            interfaceC7039f.p0(abstractC6713l0, g(c6533iB), e(c6533iB), f10, abstractC7040g, abstractC6735w0, i10);
            return;
        }
        if (q02 instanceof Q0.c) {
            Q0.c cVar = (Q0.c) q02;
            u0B = cVar.c();
            if (u0B == null) {
                C6535k c6535kB = cVar.b();
                interfaceC7039f.m1(abstractC6713l0, h(c6535kB), f(c6535kB), AbstractC6526b.b(AbstractC6525a.d(c6535kB.b()), 0.0f, 2, null), f10, abstractC7040g, abstractC6735w0, i10);
                return;
            }
        } else {
            if (!(q02 instanceof Q0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            u0B = ((Q0.a) q02).b();
        }
        interfaceC7039f.l1(u0B, abstractC6713l0, f10, abstractC7040g, abstractC6735w0, i10);
    }

    public static /* synthetic */ void b(InterfaceC7039f interfaceC7039f, Q0 q02, AbstractC6713l0 abstractC6713l0, float f10, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i11 & 8) != 0) {
            abstractC7040g = C7043j.f55038a;
        }
        AbstractC7040g abstractC7040g2 = abstractC7040g;
        if ((i11 & 16) != 0) {
            abstractC6735w0 = null;
        }
        AbstractC6735w0 abstractC6735w02 = abstractC6735w0;
        if ((i11 & 32) != 0) {
            i10 = InterfaceC7039f.f55034d1.a();
        }
        a(interfaceC7039f, q02, abstractC6713l0, f11, abstractC7040g2, abstractC6735w02, i10);
    }

    public static final void c(InterfaceC7039f interfaceC7039f, Q0 q02, long j10, float f10, AbstractC7040g abstractC7040g, AbstractC6735w0 abstractC6735w0, int i10) {
        U0 u0B;
        if (q02 instanceof Q0.b) {
            C6533i c6533iB = ((Q0.b) q02).b();
            interfaceC7039f.j0(j10, g(c6533iB), e(c6533iB), f10, abstractC7040g, abstractC6735w0, i10);
            return;
        }
        if (q02 instanceof Q0.c) {
            Q0.c cVar = (Q0.c) q02;
            u0B = cVar.c();
            if (u0B == null) {
                C6535k c6535kB = cVar.b();
                interfaceC7039f.j1(j10, h(c6535kB), f(c6535kB), AbstractC6526b.b(AbstractC6525a.d(c6535kB.b()), 0.0f, 2, null), abstractC7040g, f10, abstractC6735w0, i10);
                return;
            }
        } else {
            if (!(q02 instanceof Q0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            u0B = ((Q0.a) q02).b();
        }
        interfaceC7039f.t0(u0B, j10, f10, abstractC7040g, abstractC6735w0, i10);
    }

    private static final long e(C6533i c6533i) {
        return AbstractC6538n.a(c6533i.r(), c6533i.j());
    }

    private static final long f(C6535k c6535k) {
        return AbstractC6538n.a(c6535k.j(), c6535k.d());
    }

    private static final long g(C6533i c6533i) {
        return AbstractC6532h.a(c6533i.k(), c6533i.n());
    }

    private static final long h(C6535k c6535k) {
        return AbstractC6532h.a(c6535k.e(), c6535k.g());
    }
}

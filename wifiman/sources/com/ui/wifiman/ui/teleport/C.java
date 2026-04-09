package com.ui.wifiman.ui.teleport;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.z1;
import com.ui.wifiman.ui.teleport.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import m0.C6733v0;
import m8.AbstractC6780c;
import q.AbstractC7381B;
import q.AbstractC7402u;
import r.AbstractC7535j;
import r.EnumC7520b0;
import r.P;
import s9.d;

/* loaded from: classes4.dex */
public abstract class C {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44944a;

        static {
            int[] iArr = new int[z.values().length];
            try {
                iArr[z.ONLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[z.OFFLINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[z.UNSTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[z.LOADING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f44944a = iArr;
        }
    }

    public static final long a(y yVar, InterfaceC3540l interfaceC3540l, int i10) {
        long jF;
        AbstractC6492s.i(yVar, "<this>");
        interfaceC3540l.U(-508491269);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-508491269, i10, -1, "com.ui.wifiman.ui.teleport.color (TeleportTunnelCommons.kt:16)");
        }
        if (yVar instanceof y.c) {
            interfaceC3540l.U(1904961254);
            jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().g().i();
            interfaceC3540l.J();
        } else if (yVar instanceof y.b) {
            interfaceC3540l.U(1904963814);
            jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().b().f();
            interfaceC3540l.J();
        } else {
            if (!(yVar instanceof y.a)) {
                interfaceC3540l.U(1904958440);
                interfaceC3540l.J();
                throw new NoWhenBranchMatchedException();
            }
            interfaceC3540l.U(1904966374);
            jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().d().f();
            interfaceC3540l.J();
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return jF;
    }

    public static final long b(z zVar, InterfaceC3540l interfaceC3540l, int i10) {
        long jF;
        AbstractC6492s.i(zVar, "<this>");
        interfaceC3540l.U(-51085770);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-51085770, i10, -1, "com.ui.wifiman.ui.teleport.color (TeleportTunnelCommons.kt:24)");
        }
        int i11 = a.f44944a[zVar.ordinal()];
        if (i11 == 1) {
            interfaceC3540l.U(1904972134);
            jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().d().f();
            interfaceC3540l.J();
        } else if (i11 == 2) {
            interfaceC3540l.U(1904974854);
            jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().g().g();
            interfaceC3540l.J();
        } else if (i11 == 3) {
            interfaceC3540l.U(1904977574);
            jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().h().f();
            interfaceC3540l.J();
        } else {
            if (i11 != 4) {
                interfaceC3540l.U(1904969512);
                interfaceC3540l.J();
                throw new NoWhenBranchMatchedException();
            }
            interfaceC3540l.U(1904980294);
            jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().g().e();
            interfaceC3540l.J();
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return jF;
    }

    public static final z1 c(z zVar, InterfaceC3540l interfaceC3540l, int i10) {
        z1 z1VarA;
        interfaceC3540l.U(839733003);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(839733003, i10, -1, "com.ui.wifiman.ui.teleport.colorAnimated (TeleportTunnelCommons.kt:32)");
        }
        r.O oC = P.c("connectionState loading transition", interfaceC3540l, 6, 0);
        if (zVar != null) {
            interfaceC3540l.U(825376300);
            z1VarA = AbstractC7402u.a(b(zVar, interfaceC3540l, i10 & 14), null, "connection state loaded", null, interfaceC3540l, 384, 10);
            interfaceC3540l.J();
        } else {
            interfaceC3540l.U(825469889);
            z1VarA = AbstractC7381B.a(oC, C6733v0.k(C6733v0.f52951b.f(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().g().g(), AbstractC7535j.e(AbstractC7535j.l(1000, 0, null, 6, null), EnumC7520b0.Reverse, 0L, 4, null), "connection state loading", interfaceC3540l, r.O.f59497f | 24624 | (r.N.f59493d << 9), 0);
            interfaceC3540l.J();
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return z1VarA;
    }

    public static final s9.d d(z zVar) {
        AbstractC6492s.i(zVar, "<this>");
        int i10 = a.f44944a[zVar.ordinal()];
        if (i10 == 1) {
            return new d.b(AbstractC6780c.f53406T3);
        }
        if (i10 == 2) {
            return new d.b(AbstractC6780c.f53399S3);
        }
        if (i10 == 3) {
            return new d.b(AbstractC6780c.f53413U3);
        }
        if (i10 == 4) {
            return new d.b(AbstractC6780c.f53620y4);
        }
        throw new NoWhenBranchMatchedException();
    }
}

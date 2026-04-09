package Sh;

import Bh.InterfaceC2495e;
import Bh.M;
import Th.a;
import Zg.AbstractC3689v;
import Zg.d0;
import ii.InterfaceC6164k;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import li.C6631i;
import li.C6636n;
import li.C6647y;
import ni.C6962M;
import ni.EnumC6986r;
import xi.AbstractC8536c;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final a f20777b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Set f20778c = d0.c(a.EnumC0806a.CLASS);

    /* renamed from: d, reason: collision with root package name */
    private static final Set f20779d = d0.i(a.EnumC0806a.FILE_FACADE, a.EnumC0806a.MULTIFILE_CLASS_PART);

    /* renamed from: e, reason: collision with root package name */
    private static final Yh.e f20780e = new Yh.e(1, 1, 2);

    /* renamed from: f, reason: collision with root package name */
    private static final Yh.e f20781f = new Yh.e(1, 1, 11);

    /* renamed from: g, reason: collision with root package name */
    private static final Yh.e f20782g = new Yh.e(1, 1, 13);

    /* renamed from: a, reason: collision with root package name */
    public C6636n f20783a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Yh.e a() {
            return n.f20782g;
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection d() {
        return AbstractC3689v.l();
    }

    private final EnumC6986r e(x xVar) {
        if (!f().g().b() && xVar.a().j()) {
            return EnumC6986r.UNSTABLE;
        }
        return EnumC6986r.STABLE;
    }

    private final C6647y g(x xVar) {
        if (i() || xVar.a().d().h(h())) {
            return null;
        }
        return new C6647y(xVar.a().d(), Yh.e.f25044i, h(), h().k(xVar.a().d().j()), xVar.getLocation(), xVar.b());
    }

    private final Yh.e h() {
        return AbstractC8536c.a(f().g());
    }

    private final boolean i() {
        return f().g().e();
    }

    private final boolean j(x xVar) {
        return !f().g().c() && xVar.a().i() && AbstractC6492s.d(xVar.a().d(), f20781f);
    }

    private final boolean k(x xVar) {
        return (f().g().f() && (xVar.a().i() || AbstractC6492s.d(xVar.a().d(), f20780e))) || j(xVar);
    }

    private final String[] m(x xVar, Set set) {
        Th.a aVarA = xVar.a();
        String[] strArrA = aVarA.a();
        if (strArrA == null) {
            strArrA = aVarA.b();
        }
        if (strArrA == null || !set.contains(aVarA.c())) {
            return null;
        }
        return strArrA;
    }

    public final InterfaceC6164k c(M descriptor, x kotlinClass) {
        String[] strArrG;
        Yg.s sVarM;
        AbstractC6492s.i(descriptor, "descriptor");
        AbstractC6492s.i(kotlinClass, "kotlinClass");
        String[] strArrM = m(kotlinClass, f20779d);
        if (strArrM == null || (strArrG = kotlinClass.a().g()) == null) {
            return null;
        }
        try {
            try {
                sVarM = Yh.i.m(strArrM, strArrG);
            } catch (InvalidProtocolBufferException e10) {
                throw new IllegalStateException("Could not read data from " + kotlinClass.getLocation(), e10);
            }
        } catch (Throwable th2) {
            if (i() || kotlinClass.a().d().h(h())) {
                throw th2;
            }
            sVarM = null;
        }
        if (sVarM == null) {
            return null;
        }
        Yh.f fVar = (Yh.f) sVarM.a();
        Uh.l lVar = (Uh.l) sVarM.c();
        r rVar = new r(kotlinClass, lVar, fVar, g(kotlinClass), k(kotlinClass), e(kotlinClass));
        return new C6962M(descriptor, lVar, fVar, kotlinClass.a().d(), rVar, f(), "scope for " + rVar + " in " + descriptor, m.f20776a);
    }

    public final C6636n f() {
        C6636n c6636n = this.f20783a;
        if (c6636n != null) {
            return c6636n;
        }
        AbstractC6492s.v("components");
        return null;
    }

    public final C6631i l(x kotlinClass) {
        String[] strArrG;
        Yg.s sVarI;
        AbstractC6492s.i(kotlinClass, "kotlinClass");
        String[] strArrM = m(kotlinClass, f20778c);
        if (strArrM == null || (strArrG = kotlinClass.a().g()) == null) {
            return null;
        }
        try {
            try {
                sVarI = Yh.i.i(strArrM, strArrG);
            } catch (InvalidProtocolBufferException e10) {
                throw new IllegalStateException("Could not read data from " + kotlinClass.getLocation(), e10);
            }
        } catch (Throwable th2) {
            if (i() || kotlinClass.a().d().h(h())) {
                throw th2;
            }
            sVarI = null;
        }
        if (sVarI == null) {
            return null;
        }
        return new C6631i((Yh.f) sVarI.a(), (Uh.c) sVarI.c(), kotlinClass.a().d(), new z(kotlinClass, g(kotlinClass), k(kotlinClass), e(kotlinClass)));
    }

    public final InterfaceC2495e n(x kotlinClass) {
        AbstractC6492s.i(kotlinClass, "kotlinClass");
        C6631i c6631iL = l(kotlinClass);
        if (c6631iL == null) {
            return null;
        }
        return f().f().e(kotlinClass.b(), c6631iL);
    }

    public final void o(k components) {
        AbstractC6492s.i(components, "components");
        p(components.a());
    }

    public final void p(C6636n c6636n) {
        AbstractC6492s.i(c6636n, "<set-?>");
        this.f20783a = c6636n;
    }
}

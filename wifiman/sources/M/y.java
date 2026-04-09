package M;

import L0.S;
import M.C3243l;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public abstract class y {

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.J f12308a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.jvm.internal.J j10) {
            super(1);
            this.f12308a = j10;
        }

        public final void a(C3242k c3242k) {
            if (c3242k.c().length() > 0) {
                this.f12308a.f51685a = false;
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C3242k) obj);
            return Yg.J.f24997a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final W0.i b(L0.M m10, int i10) {
        return e(m10, i10) ? m10.y(i10) : m10.c(i10);
    }

    public static final x c(L0.M m10, int i10, int i11, int i12, long j10, boolean z10, boolean z11) {
        return new E(z11, 1, 1, z10 ? null : new C3243l(new C3243l.a(b(m10, S.n(j10)), S.n(j10), 1L), new C3243l.a(b(m10, S.i(j10)), S.i(j10), 1L), S.m(j10)), new C3242k(1L, 1, i10, i11, i12, m10));
    }

    public static final boolean d(C3243l c3243l, x xVar) {
        if (c3243l == null || xVar == null) {
            return true;
        }
        if (c3243l.e().d() == c3243l.c().d()) {
            return c3243l.e().c() == c3243l.c().c();
        }
        if ((c3243l.d() ? c3243l.e() : c3243l.c()).c() != 0) {
            return false;
        }
        if (xVar.e().l() != (c3243l.d() ? c3243l.c() : c3243l.e()).c()) {
            return false;
        }
        kotlin.jvm.internal.J j10 = new kotlin.jvm.internal.J();
        j10.f51685a = true;
        xVar.f(new a(j10));
        return j10.f51685a;
    }

    private static final boolean e(L0.M m10, int i10) {
        if (m10.l().j().length() == 0) {
            return true;
        }
        int iQ = m10.q(i10);
        return (i10 == 0 || iQ != m10.q(i10 + (-1))) && (i10 == m10.l().j().length() || iQ != m10.q(i10 + 1));
    }
}

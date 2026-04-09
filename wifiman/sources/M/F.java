package M;

import F.j0;
import L0.S;
import R0.C3448a;
import R0.InterfaceC3456i;
import R0.P;
import R0.Q;
import Zg.AbstractC3689v;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class F extends AbstractC3233b {

    /* renamed from: j, reason: collision with root package name */
    private final Q f12083j;

    /* renamed from: k, reason: collision with root package name */
    private final j0 f12084k;

    public F(Q q10, R0.H h10, j0 j0Var, J j10) {
        super(q10.f(), q10.h(), j0Var != null ? j0Var.f() : null, h10, j10, null);
        this.f12083j = q10;
        this.f12084k = j0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int a0(F.j0 r6, int r7) {
        /*
            r5 = this;
            C0.r r0 = r6.c()
            if (r0 == 0) goto L15
            C0.r r1 = r6.b()
            r2 = 0
            if (r1 == 0) goto L13
            r3 = 0
            r4 = 2
            l0.i r2 = C0.r.c0(r1, r0, r3, r4, r2)
        L13:
            if (r2 != 0) goto L1b
        L15:
            l0.i$a r0 = l0.C6533i.f52340e
            l0.i r2 = r0.a()
        L1b:
            R0.H r0 = r5.p()
            R0.Q r1 = r5.f12083j
            long r3 = r1.h()
            int r1 = L0.S.i(r3)
            int r0 = r0.b(r1)
            L0.M r1 = r6.f()
            l0.i r0 = r1.e(r0)
            float r1 = r0.k()
            float r0 = r0.n()
            long r2 = r2.m()
            float r2 = l0.C6537m.g(r2)
            float r7 = (float) r7
            float r2 = r2 * r7
            float r0 = r0 + r2
            R0.H r7 = r5.p()
            L0.M r6 = r6.f()
            long r0 = l0.AbstractC6532h.a(r1, r0)
            int r6 = r6.x(r0)
            int r6 = r7.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: M.F.a0(F.j0, int):int");
    }

    public final List Y(InterfaceC6835l interfaceC6835l) {
        if (!S.h(u())) {
            return AbstractC3689v.o(new C3448a("", 0), new P(S.l(u()), S.l(u())));
        }
        InterfaceC3456i interfaceC3456i = (InterfaceC3456i) interfaceC6835l.invoke(this);
        if (interfaceC3456i != null) {
            return AbstractC3689v.e(interfaceC3456i);
        }
        return null;
    }

    public final Q Z() {
        return Q.d(this.f12083j, e(), u(), null, 4, null);
    }

    public final F b0() {
        j0 j0Var;
        if (w().length() > 0 && (j0Var = this.f12084k) != null) {
            T(a0(j0Var, 1));
        }
        AbstractC6492s.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final F c0() {
        j0 j0Var;
        if (w().length() > 0 && (j0Var = this.f12084k) != null) {
            T(a0(j0Var, -1));
        }
        AbstractC6492s.g(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }
}

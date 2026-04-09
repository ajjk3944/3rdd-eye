package T;

import mh.InterfaceC6824a;

/* loaded from: classes.dex */
public abstract class H0 extends AbstractC3557u {
    public H0(InterfaceC6824a interfaceC6824a) {
        super(interfaceC6824a, null);
    }

    private final F1 f(I0 i02) {
        if (!i02.i()) {
            return i02.c() != null ? new D(i02.c()) : i02.f() != null ? new N(i02.f()) : new B1(i02.d());
        }
        InterfaceC3551q0 interfaceC3551q0F = i02.f();
        if (interfaceC3551q0F == null) {
            Object objG = i02.g();
            n1 n1VarE = i02.e();
            if (n1VarE == null) {
                n1VarE = o1.p();
            }
            interfaceC3551q0F = o1.h(objG, n1VarE);
        }
        return new N(interfaceC3551q0F);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034 A[PHI: r5
  0x0034: PHI (r5v2 T.N) = (r5v5 T.N), (r5v6 T.N) binds: [B:17:0x0044, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // T.AbstractC3557u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public T.F1 b(T.I0 r4, T.F1 r5) {
        /*
            r3 = this;
            boolean r0 = r5 instanceof T.N
            r1 = 0
            if (r0 == 0) goto L1a
            boolean r0 = r4.i()
            if (r0 == 0) goto L47
            r1 = r5
            T.N r1 = (T.N) r1
            T.q0 r5 = r1.b()
            java.lang.Object r0 = r4.d()
            r5.setValue(r0)
            goto L47
        L1a:
            boolean r0 = r5 instanceof T.B1
            if (r0 == 0) goto L36
            boolean r0 = r4.j()
            if (r0 == 0) goto L47
            java.lang.Object r0 = r4.d()
            T.B1 r5 = (T.B1) r5
            java.lang.Object r2 = r5.b()
            boolean r0 = kotlin.jvm.internal.AbstractC6492s.d(r0, r2)
            if (r0 == 0) goto L47
        L34:
            r1 = r5
            goto L47
        L36:
            boolean r0 = r5 instanceof T.D
            if (r0 == 0) goto L47
            mh.l r0 = r4.c()
            T.D r5 = (T.D) r5
            mh.l r2 = r5.b()
            if (r0 != r2) goto L47
            goto L34
        L47:
            if (r1 != 0) goto L4d
            T.F1 r1 = r3.f(r4)
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: T.H0.b(T.I0, T.F1):T.F1");
    }

    public abstract I0 c(Object obj);

    public final I0 d(Object obj) {
        return c(obj);
    }

    public final I0 e(Object obj) {
        return c(obj).h();
    }
}

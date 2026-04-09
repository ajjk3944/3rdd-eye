package jt;

import ht.c1;
import ht.k0;

/* loaded from: classes.dex */
public enum n {
    START { // from class: jt.n.c
        @Override // jt.n
        public n combine(c1 c1Var) {
            br.l.e(c1Var, "nextType");
            return getResultNullability(c1Var);
        }
    },
    ACCEPT_NULL { // from class: jt.n.a
        @Override // jt.n
        public n combine(c1 c1Var) {
            br.l.e(c1Var, "nextType");
            return getResultNullability(c1Var);
        }
    },
    UNKNOWN { // from class: jt.n.d
        @Override // jt.n
        public n combine(c1 c1Var) {
            br.l.e(c1Var, "nextType");
            n resultNullability = getResultNullability(c1Var);
            return resultNullability == n.ACCEPT_NULL ? this : resultNullability;
        }
    },
    NOT_NULL { // from class: jt.n.b
        @Override // jt.n
        public b combine(c1 c1Var) {
            br.l.e(c1Var, "nextType");
            return this;
        }
    };

    /* synthetic */ n(br.g gVar) {
        this();
    }

    public abstract n combine(c1 c1Var);

    public final n getResultNullability(c1 c1Var) {
        br.l.e(c1Var, "<this>");
        if (c1Var.c0()) {
            return ACCEPT_NULL;
        }
        if (c1Var instanceof ht.n) {
        }
        return ht.c.f(g.l(false, null, 24), ht.c.k(c1Var), k0.f10917b) ? NOT_NULL : UNKNOWN;
    }
}

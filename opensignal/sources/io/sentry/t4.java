package io.sentry;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class t4 extends g4 implements c2 {
    public Date L;
    public io.sentry.protocol.l M;
    public String N;
    public fh.f O;
    public fh.f P;
    public b5 Q;
    public String R;
    public List S;
    public ConcurrentHashMap T;
    public AbstractMap U;

    public t4(Throwable th2) {
        this();
        this.F = th2;
    }

    public final io.sentry.protocol.s c() {
        Boolean bool;
        fh.f fVar = this.P;
        if (fVar == null) {
            return null;
        }
        Iterator it = fVar.f8871a.iterator();
        while (it.hasNext()) {
            io.sentry.protocol.s sVar = (io.sentry.protocol.s) it.next();
            io.sentry.protocol.k kVar = sVar.f12635y;
            if (kVar != null && (bool = kVar.f12583r) != null && !bool.booleanValue()) {
                return sVar;
            }
        }
        return null;
    }

    public final boolean d() {
        fh.f fVar = this.P;
        return (fVar == null || fVar.f8871a.isEmpty()) ? false : true;
    }

    @Override // io.sentry.c2
    public final void serialize(y2 y2Var, u0 u0Var) throws IOException {
        i4.b bVar = (i4.b) y2Var;
        bVar.C();
        bVar.I("timestamp");
        bVar.S(u0Var, this.L);
        if (this.M != null) {
            bVar.I("message");
            bVar.S(u0Var, this.M);
        }
        if (this.N != null) {
            bVar.I("logger");
            bVar.V(this.N);
        }
        fh.f fVar = this.O;
        if (fVar != null && !fVar.f8871a.isEmpty()) {
            bVar.I("threads");
            bVar.C();
            bVar.I("values");
            bVar.S(u0Var, this.O.f8871a);
            bVar.F();
        }
        fh.f fVar2 = this.P;
        if (fVar2 != null && !fVar2.f8871a.isEmpty()) {
            bVar.I("exception");
            bVar.C();
            bVar.I("values");
            bVar.S(u0Var, this.P.f8871a);
            bVar.F();
        }
        if (this.Q != null) {
            bVar.I("level");
            bVar.S(u0Var, this.Q);
        }
        if (this.R != null) {
            bVar.I("transaction");
            bVar.V(this.R);
        }
        if (this.S != null) {
            bVar.I("fingerprint");
            bVar.S(u0Var, this.S);
        }
        if (this.U != null) {
            bVar.I("modules");
            bVar.S(u0Var, this.U);
        }
        ic.a.J(this, bVar, u0Var);
        ConcurrentHashMap concurrentHashMap = this.T;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                h0.b.D(this.T, str, bVar, str, u0Var);
            }
        }
        bVar.F();
    }

    public t4() {
        io.sentry.protocol.t tVar = new io.sentry.protocol.t();
        Date dateQ = dr.a.q();
        super(tVar);
        this.L = dateQ;
    }
}

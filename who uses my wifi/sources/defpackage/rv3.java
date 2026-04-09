package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rv3 {
    public static final rv3 b;
    public final AtomicReference a = new AtomicReference(new nw3(new p21(25)));

    static {
        try {
            rv3 rv3Var = new rv3();
            rv3Var.a(new zu3(fv3.class, vt3.r));
            b = rv3Var;
        } catch (Exception e) {
            throw new rg(e);
        }
    }

    public final synchronized void a(zu3 zu3Var) {
        AtomicReference atomicReference = this.a;
        p21 p21Var = new p21((nw3) atomicReference.get());
        p21Var.B(zu3Var);
        atomicReference.set(new nw3(p21Var));
    }

    public final synchronized void b(wu3 wu3Var) {
        AtomicReference atomicReference = this.a;
        p21 p21Var = new p21((nw3) atomicReference.get());
        p21Var.E(wu3Var);
        atomicReference.set(new nw3(p21Var));
    }

    public final synchronized void c(vv3 vv3Var) {
        AtomicReference atomicReference = this.a;
        p21 p21Var = new p21((nw3) atomicReference.get());
        p21Var.G(vv3Var);
        atomicReference.set(new nw3(p21Var));
    }

    public final synchronized void d(tv3 tv3Var) {
        AtomicReference atomicReference = this.a;
        p21 p21Var = new p21((nw3) atomicReference.get());
        p21Var.H(tv3Var);
        atomicReference.set(new nw3(p21Var));
    }

    public final gi2 e(fw3 fw3Var) throws GeneralSecurityException {
        nw3 nw3Var = (nw3) this.a.get();
        nw3Var.getClass();
        lw3 lw3Var = new lw3(fw3.class, (v34) fw3Var.h);
        HashMap map = nw3Var.b;
        if (map.containsKey(lw3Var)) {
            return ((wu3) map.get(lw3Var)).b.g(fw3Var);
        }
        String string = lw3Var.toString();
        throw new GeneralSecurityException(ex0.l(new StringBuilder(string.length() + 47), "No Key Parser for requested key type ", string, " available"));
    }

    public final kw3 f(gi2 gi2Var) throws GeneralSecurityException {
        nw3 nw3Var = (nw3) this.a.get();
        nw3Var.getClass();
        mw3 mw3Var = new mw3(gi2Var.getClass(), fw3.class);
        HashMap map = nw3Var.a;
        if (map.containsKey(mw3Var)) {
            return ((zu3) map.get(mw3Var)).b.b(gi2Var);
        }
        String string = mw3Var.toString();
        throw new GeneralSecurityException(ex0.l(new StringBuilder(string.length() + 32), "No Key serializer for ", string, " available"));
    }

    public final mr3 g(gw3 gw3Var) throws GeneralSecurityException {
        nw3 nw3Var = (nw3) this.a.get();
        nw3Var.getClass();
        lw3 lw3Var = new lw3(gw3.class, (v34) gw3Var.g);
        HashMap map = nw3Var.d;
        if (map.containsKey(lw3Var)) {
            return ((tv3) map.get(lw3Var)).b.e(gw3Var);
        }
        String string = lw3Var.toString();
        throw new GeneralSecurityException(ex0.l(new StringBuilder(string.length() + 54), "No Parameters Parser for requested key type ", string, " available"));
    }

    public final kw3 h(mr3 mr3Var) throws GeneralSecurityException {
        nw3 nw3Var = (nw3) this.a.get();
        nw3Var.getClass();
        mw3 mw3Var = new mw3(mr3Var.getClass(), gw3.class);
        HashMap map = nw3Var.c;
        if (map.containsKey(mw3Var)) {
            return ((vv3) map.get(mw3Var)).b.f(mr3Var);
        }
        String string = mw3Var.toString();
        throw new GeneralSecurityException(ex0.l(new StringBuilder(string.length() + 39), "No Key Format serializer for ", string, " available"));
    }
}

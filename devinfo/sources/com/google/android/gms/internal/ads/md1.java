package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class md1 {

    /* renamed from: b, reason: collision with root package name */
    public static final md1 f13875b;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f13876a = new AtomicReference(new ie1(new oa1(2)));

    static {
        try {
            md1 md1Var = new md1();
            md1Var.a(new wc1(cd1.class, ub1.f17162s));
            f13875b = md1Var;
        } catch (Exception e2) {
            throw new ac.m(e2);
        }
    }

    public final synchronized void a(wc1 wc1Var) {
        AtomicReference atomicReference = this.f13876a;
        oa1 oa1Var = new oa1((ie1) atomicReference.get());
        oa1Var.b(wc1Var);
        atomicReference.set(new ie1(oa1Var));
    }

    public final synchronized void b(uc1 uc1Var) {
        AtomicReference atomicReference = this.f13876a;
        oa1 oa1Var = new oa1((ie1) atomicReference.get());
        oa1Var.e(uc1Var);
        atomicReference.set(new ie1(oa1Var));
    }

    public final synchronized void c(qd1 qd1Var) {
        AtomicReference atomicReference = this.f13876a;
        oa1 oa1Var = new oa1((ie1) atomicReference.get());
        oa1Var.g(qd1Var);
        atomicReference.set(new ie1(oa1Var));
    }

    public final synchronized void d(od1 od1Var) {
        AtomicReference atomicReference = this.f13876a;
        oa1 oa1Var = new oa1((ie1) atomicReference.get());
        oa1Var.h(od1Var);
        atomicReference.set(new ie1(oa1Var));
    }

    public final al0 e(be1 be1Var) throws GeneralSecurityException {
        ie1 ie1Var = (ie1) this.f13876a.get();
        ie1Var.getClass();
        ge1 ge1Var = new ge1(be1.class, (vl1) be1Var.f9659c);
        HashMap map = ie1Var.f12317b;
        if (map.containsKey(ge1Var)) {
            return ((uc1) map.get(ge1Var)).f17173b.h(be1Var);
        }
        String string = ge1Var.toString();
        throw new GeneralSecurityException(r5.c.m(new StringBuilder(string.length() + 47), "No Key Parser for requested key type ", string, " available"));
    }

    public final fe1 f(al0 al0Var) throws GeneralSecurityException {
        ie1 ie1Var = (ie1) this.f13876a.get();
        ie1Var.getClass();
        he1 he1Var = new he1(al0Var.getClass(), be1.class);
        HashMap map = ie1Var.f12316a;
        if (map.containsKey(he1Var)) {
            return ((wc1) map.get(he1Var)).f17982b.a(al0Var);
        }
        String string = he1Var.toString();
        throw new GeneralSecurityException(r5.c.m(new StringBuilder(string.length() + 32), "No Key serializer for ", string, " available"));
    }

    public final s91 g(ce1 ce1Var) throws GeneralSecurityException {
        ie1 ie1Var = (ie1) this.f13876a.get();
        ie1Var.getClass();
        ge1 ge1Var = new ge1(ce1.class, (vl1) ce1Var.f10094b);
        HashMap map = ie1Var.f12319d;
        if (map.containsKey(ge1Var)) {
            return ((od1) map.get(ge1Var)).f14681b.f(ce1Var);
        }
        String string = ge1Var.toString();
        throw new GeneralSecurityException(r5.c.m(new StringBuilder(string.length() + 54), "No Parameters Parser for requested key type ", string, " available"));
    }

    public final fe1 h(s91 s91Var) throws GeneralSecurityException {
        ie1 ie1Var = (ie1) this.f13876a.get();
        ie1Var.getClass();
        he1 he1Var = new he1(s91Var.getClass(), ce1.class);
        HashMap map = ie1Var.f12318c;
        if (map.containsKey(he1Var)) {
            return ((qd1) map.get(he1Var)).f15319b.i(s91Var);
        }
        String string = he1Var.toString();
        throw new GeneralSecurityException(r5.c.m(new StringBuilder(string.length() + 39), "No Key Format serializer for ", string, " available"));
    }
}

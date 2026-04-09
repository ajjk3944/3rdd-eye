package vg;

import Dg.f;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: vg.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8229a implements f {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f63630a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f63631b = new AtomicReference();

    /* renamed from: vg.a$a, reason: collision with other inner class name */
    static final class C2262a extends AtomicReference {

        /* renamed from: a, reason: collision with root package name */
        private Object f63632a;

        C2262a() {
        }

        public Object a() {
            Object objC = c();
            h(null);
            return objC;
        }

        public Object c() {
            return this.f63632a;
        }

        public C2262a d() {
            return (C2262a) get();
        }

        public void g(C2262a c2262a) {
            lazySet(c2262a);
        }

        public void h(Object obj) {
            this.f63632a = obj;
        }

        C2262a(Object obj) {
            h(obj);
        }
    }

    public C8229a() {
        C2262a c2262a = new C2262a();
        d(c2262a);
        e(c2262a);
    }

    C2262a a() {
        return (C2262a) this.f63631b.get();
    }

    C2262a b() {
        return (C2262a) this.f63631b.get();
    }

    C2262a c() {
        return (C2262a) this.f63630a.get();
    }

    @Override // Dg.g
    public void clear() {
        while (poll() != null && !isEmpty()) {
        }
    }

    void d(C2262a c2262a) {
        this.f63631b.lazySet(c2262a);
    }

    C2262a e(C2262a c2262a) {
        return (C2262a) this.f63630a.getAndSet(c2262a);
    }

    @Override // Dg.g
    public boolean isEmpty() {
        return b() == c();
    }

    @Override // Dg.g
    public boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        C2262a c2262a = new C2262a(obj);
        e(c2262a).g(c2262a);
        return true;
    }

    @Override // Dg.f, Dg.g
    public Object poll() {
        C2262a c2262aD;
        C2262a c2262aA = a();
        C2262a c2262aD2 = c2262aA.d();
        if (c2262aD2 != null) {
            Object objA = c2262aD2.a();
            d(c2262aD2);
            c2262aA.g(null);
            return objA;
        }
        if (c2262aA == c()) {
            return null;
        }
        do {
            c2262aD = c2262aA.d();
        } while (c2262aD == null);
        Object objA2 = c2262aD.a();
        d(c2262aD);
        c2262aA.g(null);
        return objA2;
    }
}

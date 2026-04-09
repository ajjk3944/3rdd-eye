package X8;

import C.f0;
import F3.h;
import I9.g;
import T1.B;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SingleCreate.java */
/* loaded from: classes3.dex */
public final class a<T> extends g {

    /* renamed from: b, reason: collision with root package name */
    public final f0 f13660b;

    /* compiled from: SingleCreate.java */
    /* renamed from: X8.a$a, reason: collision with other inner class name */
    public static final class C0198a<T> extends AtomicReference<R8.a> implements R8.a {

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReference f13661b;

        /* JADX WARN: Multi-variable type inference failed */
        public C0198a(P8.b<? super T> bVar) {
            this.f13661b = (AtomicReference) bVar;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [P8.b, java.util.concurrent.atomic.AtomicReference] */
        public final boolean a(Throwable th) {
            R8.a andSet;
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            R8.a aVar = get();
            U8.b bVar = U8.b.DISPOSED;
            if (aVar == bVar || (andSet = getAndSet(bVar)) == bVar) {
                return false;
            }
            try {
                this.f13661b.onError(th);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // R8.a
        public final void dispose() {
            U8.b.dispose(this);
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return h.i(C0198a.class.getSimpleName(), "{", super.toString(), "}");
        }
    }

    public a(f0 f0Var) {
        this.f13660b = f0Var;
    }

    @Override // I9.g
    public final void c0(P8.b<? super T> bVar) {
        C0198a c0198a = new C0198a(bVar);
        bVar.a(c0198a);
        try {
            this.f13660b.b(c0198a);
        } catch (Throwable th) {
            B.A(th);
            if (c0198a.a(th)) {
                return;
            }
            Z8.a.a(th);
        }
    }
}

package K9;

import A9.C0583j;
import A9.I;
import A9.InterfaceC0581i;
import A9.U0;
import F9.w;
import F9.y;
import b9.C1992A;
import f9.InterfaceC4350h;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.m;
import p9.l;
import p9.q;

/* compiled from: Mutex.kt */
/* loaded from: classes3.dex */
public final class d extends g implements K9.a {
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    /* compiled from: Mutex.kt */
    public final class a implements InterfaceC0581i<C1992A>, U0 {

        /* renamed from: b, reason: collision with root package name */
        public final C0583j<C1992A> f3756b;

        public a(C0583j c0583j) {
            this.f3756b = c0583j;
        }

        @Override // A9.U0
        public final void c(w<?> wVar, int i) {
            this.f3756b.c(wVar, i);
        }

        @Override // A9.InterfaceC0581i
        public final void g(C1992A c1992a, l lVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.i;
            d dVar = d.this;
            atomicReferenceFieldUpdater.set(dVar, null);
            K9.b bVar = new K9.b(dVar, this);
            this.f3756b.g(c1992a, bVar);
        }

        @Override // f9.InterfaceC4347e
        public final InterfaceC4350h getContext() {
            return this.f3756b.f253f;
        }

        @Override // A9.InterfaceC0581i
        public final boolean isActive() {
            return this.f3756b.isActive();
        }

        @Override // A9.InterfaceC0581i
        public final y j(Object obj, l lVar) {
            d dVar = d.this;
            c cVar = new c(dVar, this);
            y yVarD = this.f3756b.D((C1992A) obj, cVar);
            if (yVarD != null) {
                d.i.set(dVar, null);
            }
            return yVarD;
        }

        @Override // A9.InterfaceC0581i
        public final void p(Object obj) {
            this.f3756b.p(obj);
        }

        @Override // f9.InterfaceC4347e
        public final void resumeWith(Object obj) {
            this.f3756b.resumeWith(obj);
        }
    }

    /* compiled from: Mutex.kt */
    public static final class b extends m implements q<J9.c<?>, Object, Object, l<? super Throwable, ? extends C1992A>> {
        public b() {
            super(3);
        }

        @Override // p9.q
        public final l<? super Throwable, ? extends C1992A> invoke(J9.c<?> cVar, Object obj, Object obj2) {
            return new e(d.this, obj);
        }
    }

    public d(boolean z10) {
        super(1, z10 ? 1 : 0);
        this.owner$volatile = z10 ? null : f.f3761a;
        new b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        r0.g(b9.C1992A.f18074a, r3.f3768c);
     */
    @Override // K9.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(h9.c r4) {
        /*
            r3 = this;
            boolean r0 = r3.tryLock()
            if (r0 == 0) goto L9
            b9.A r4 = b9.C1992A.f18074a
            return r4
        L9:
            f9.e r4 = com.google.gson.internal.c.r(r4)
            A9.j r4 = T1.B.l(r4)
            K9.d$a r0 = new K9.d$a     // Catch: java.lang.Throwable -> L41
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L41
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = K9.g.f3766h     // Catch: java.lang.Throwable -> L41
            int r1 = r1.getAndDecrement(r3)     // Catch: java.lang.Throwable -> L41
            int r2 = r3.f3767b     // Catch: java.lang.Throwable -> L41
            if (r1 > r2) goto L16
            if (r1 <= 0) goto L2a
            b9.A r1 = b9.C1992A.f18074a     // Catch: java.lang.Throwable -> L41
            K9.g$b r2 = r3.f3768c     // Catch: java.lang.Throwable -> L41
            r0.g(r1, r2)     // Catch: java.lang.Throwable -> L41
            goto L30
        L2a:
            boolean r1 = r3.b(r0)     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L16
        L30:
            java.lang.Object r4 = r4.r()
            g9.a r0 = g9.a.COROUTINE_SUSPENDED
            if (r4 != r0) goto L39
            goto L3b
        L39:
            b9.A r4 = b9.C1992A.f18074a
        L3b:
            if (r4 != r0) goto L3e
            return r4
        L3e:
            b9.A r4 = b9.C1992A.f18074a
            return r4
        L41:
            r0 = move-exception
            r4.z()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: K9.d.a(h9.c):java.lang.Object");
    }

    @Override // K9.a
    public final void c(Object obj) {
        while (e()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            y yVar = f.f3761a;
            if (obj2 != yVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, yVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    d();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final boolean e() {
        return Math.max(g.f3766h.get(this), 0) == 0;
    }

    public final String toString() {
        return "Mutex@" + I.x(this) + "[isLocked=" + e() + ",owner=" + i.get(this) + ']';
    }

    @Override // K9.a
    public final boolean tryLock() {
        int i10;
        char c10;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g.f3766h;
            int i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = this.f3767b;
            if (i11 > i12) {
                do {
                    i10 = atomicIntegerFieldUpdater.get(this);
                    if (i10 > i12) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i12));
            } else {
                if (i11 <= 0) {
                    c10 = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i11, i11 - 1)) {
                    i.set(this, null);
                    c10 = 0;
                    break;
                }
            }
        }
        if (c10 == 0) {
            return true;
        }
        if (c10 == 1) {
            return false;
        }
        if (c10 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
    }
}

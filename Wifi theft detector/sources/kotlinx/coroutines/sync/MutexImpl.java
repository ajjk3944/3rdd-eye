package kotlinx.coroutines.sync;

import d9.e;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.z;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.o;
import kotlinx.coroutines.p;
import kotlinx.coroutines.r;
import kotlinx.coroutines.selects.h;
import kotlinx.coroutines.u2;
import l9.l;
import l9.q;
import y8.s;

/* loaded from: classes4.dex */
public class MutexImpl extends SemaphoreImpl implements a {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f22668i = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, "owner$volatile");

    /* renamed from: h, reason: collision with root package name */
    public final q f22669h;
    private volatile /* synthetic */ Object owner$volatile;

    public final class CancellableContinuationWithOwner implements o, u2 {

        /* renamed from: a, reason: collision with root package name */
        public final p f22670a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f22671b;

        public CancellableContinuationWithOwner(p pVar, Object obj) {
            this.f22670a = pVar;
            this.f22671b = obj;
        }

        @Override // kotlinx.coroutines.o
        public void C(Object obj) {
            this.f22670a.C(obj);
        }

        @Override // kotlinx.coroutines.u2
        public void a(z zVar, int i10) {
            this.f22670a.a(zVar, i10);
        }

        @Override // kotlinx.coroutines.o
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void y(s sVar, l lVar) {
            MutexImpl.r().set(MutexImpl.this, this.f22671b);
            p pVar = this.f22670a;
            final MutexImpl mutexImpl = MutexImpl.this;
            pVar.y(sVar, new l() { // from class: kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner$resume$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // l9.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return s.f25199a;
                }

                public final void invoke(Throwable th) {
                    mutexImpl.b(this.f22671b);
                }
            });
        }

        @Override // kotlinx.coroutines.o
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void z(CoroutineDispatcher coroutineDispatcher, s sVar) {
            this.f22670a.z(coroutineDispatcher, sVar);
        }

        @Override // kotlinx.coroutines.o
        public boolean d() {
            return this.f22670a.d();
        }

        @Override // kotlinx.coroutines.o
        public void e(l lVar) {
            this.f22670a.e(lVar);
        }

        @Override // kotlinx.coroutines.o
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Object s(s sVar, Object obj, l lVar) {
            final MutexImpl mutexImpl = MutexImpl.this;
            Object objS = this.f22670a.s(sVar, obj, new l() { // from class: kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner$tryResume$token$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // l9.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Throwable) obj2);
                    return s.f25199a;
                }

                public final void invoke(Throwable th) {
                    MutexImpl.r().set(mutexImpl, this.f22671b);
                    mutexImpl.b(this.f22671b);
                }
            });
            if (objS != null) {
                MutexImpl.r().set(MutexImpl.this, this.f22671b);
            }
            return objS;
        }

        @Override // c9.c
        public kotlin.coroutines.d getContext() {
            return this.f22670a.getContext();
        }

        @Override // kotlinx.coroutines.o
        public Object i(Throwable th) {
            return this.f22670a.i(th);
        }

        @Override // kotlinx.coroutines.o
        public boolean isActive() {
            return this.f22670a.isActive();
        }

        @Override // kotlinx.coroutines.o
        public boolean k(Throwable th) {
            return this.f22670a.k(th);
        }

        @Override // c9.c
        public void resumeWith(Object obj) {
            this.f22670a.resumeWith(obj);
        }
    }

    public MutexImpl(boolean z10) {
        super(1, z10 ? 1 : 0);
        this.owner$volatile = z10 ? null : b.f22682a;
        this.f22669h = new q() { // from class: kotlinx.coroutines.sync.MutexImpl$onSelectCancellationUnlockConstructor$1
            {
                super(3);
            }

            @Override // l9.q
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final l invoke(h hVar, final Object obj, Object obj2) {
                final MutexImpl mutexImpl = this.this$0;
                return new l() { // from class: kotlinx.coroutines.sync.MutexImpl$onSelectCancellationUnlockConstructor$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // l9.l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                        invoke((Throwable) obj3);
                        return s.f25199a;
                    }

                    public final void invoke(Throwable th) {
                        mutexImpl.b(obj);
                    }
                };
            }
        };
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater r() {
        return f22668i;
    }

    public static /* synthetic */ Object u(MutexImpl mutexImpl, Object obj, c9.c cVar) {
        if (mutexImpl.w(obj)) {
            return s.f25199a;
        }
        Object objV = mutexImpl.v(obj, cVar);
        return objV == kotlin.coroutines.intrinsics.a.f() ? objV : s.f25199a;
    }

    @Override // kotlinx.coroutines.sync.a
    public Object a(Object obj, c9.c cVar) {
        return u(this, obj, cVar);
    }

    @Override // kotlinx.coroutines.sync.a
    public void b(Object obj) {
        while (t()) {
            Object obj2 = f22668i.get(this);
            if (obj2 != b.f22682a) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                if (t.a.a(f22668i, this, obj2, b.f22682a)) {
                    m();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final int s(Object obj) {
        while (t()) {
            Object obj2 = f22668i.get(this);
            if (obj2 != b.f22682a) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    public boolean t() {
        return g() == 0;
    }

    public String toString() {
        return "Mutex@" + l0.b(this) + "[isLocked=" + t() + ",owner=" + f22668i.get(this) + ']';
    }

    public final Object v(Object obj, c9.c cVar) {
        p pVarB = r.b(IntrinsicsKt__IntrinsicsJvmKt.c(cVar));
        try {
            c(new CancellableContinuationWithOwner(pVarB, obj));
            Object objW = pVarB.w();
            if (objW == kotlin.coroutines.intrinsics.a.f()) {
                e.c(cVar);
            }
            return objW == kotlin.coroutines.intrinsics.a.f() ? objW : s.f25199a;
        } catch (Throwable th) {
            pVarB.N();
            throw th;
        }
    }

    public boolean w(Object obj) {
        int iX = x(obj);
        if (iX == 0) {
            return true;
        }
        if (iX == 1) {
            return false;
        }
        if (iX != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    public final int x(Object obj) {
        while (!n()) {
            if (obj == null) {
                return 1;
            }
            int iS = s(obj);
            if (iS == 1) {
                return 2;
            }
            if (iS == 2) {
                return 1;
            }
        }
        f22668i.set(this, obj);
        return 0;
    }
}

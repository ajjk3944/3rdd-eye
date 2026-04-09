package f0;

import Ii.A0;
import Ii.InterfaceC3091y0;
import Ii.N;
import Ii.O;
import Yg.J;
import Yg.v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.concurrent.atomic.AtomicReference;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import r.Y;

/* loaded from: classes.dex */
public abstract class k {

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC3091y0 f46658a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f46659b;

        public a(InterfaceC3091y0 interfaceC3091y0, Object obj) {
            this.f46658a = interfaceC3091y0;
            this.f46659b = obj;
        }

        public final InterfaceC3091y0 a() {
            return this.f46658a;
        }

        public final Object b() {
            return this.f46659b;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f46660a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f46661b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f46662c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AtomicReference f46663d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f46664e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC6835l interfaceC6835l, AtomicReference atomicReference, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f46662c = interfaceC6835l;
            this.f46663d = atomicReference;
            this.f46664e = interfaceC6839p;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            b bVar = new b(this.f46662c, this.f46663d, this.f46664e, interfaceC5380e);
            bVar.f46661b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            a aVar;
            InterfaceC3091y0 interfaceC3091y0A;
            a aVar2;
            Object objG = AbstractC5467b.g();
            int i10 = this.f46660a;
            try {
                if (i10 == 0) {
                    v.b(obj);
                    N n10 = (N) this.f46661b;
                    aVar = new a(A0.m(n10.getCoroutineContext()), this.f46662c.invoke(n10));
                    a aVar3 = (a) this.f46663d.getAndSet(aVar);
                    if (aVar3 != null && (interfaceC3091y0A = aVar3.a()) != null) {
                        this.f46661b = aVar;
                        this.f46660a = 1;
                        if (A0.g(interfaceC3091y0A, this) == objG) {
                            return objG;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar2 = (a) this.f46661b;
                        try {
                            v.b(obj);
                            Y.a(this.f46663d, aVar2, null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            Y.a(this.f46663d, aVar2, null);
                            throw th;
                        }
                    }
                    aVar = (a) this.f46661b;
                    v.b(obj);
                }
                InterfaceC6839p interfaceC6839p = this.f46664e;
                Object objB = aVar.b();
                this.f46661b = aVar;
                this.f46660a = 2;
                obj = interfaceC6839p.invoke(objB, this);
                if (obj == objG) {
                    return objG;
                }
                aVar2 = aVar;
                Y.a(this.f46663d, aVar2, null);
                return obj;
            } catch (Throwable th3) {
                th = th3;
                aVar2 = aVar;
                Y.a(this.f46663d, aVar2, null);
                throw th;
            }
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public static AtomicReference a() {
        return b(new AtomicReference(null));
    }

    private static AtomicReference b(AtomicReference atomicReference) {
        return atomicReference;
    }

    public static final Object c(AtomicReference atomicReference) {
        a aVar = (a) atomicReference.get();
        if (aVar != null) {
            return aVar.b();
        }
        return null;
    }

    public static final Object d(AtomicReference atomicReference, InterfaceC6835l interfaceC6835l, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
        return O.g(new b(interfaceC6835l, atomicReference, interfaceC6839p, null), interfaceC5380e);
    }
}

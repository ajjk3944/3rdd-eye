package N;

import Ii.InterfaceC3091y0;
import Ti.a;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import s.EnumC7839L;

/* renamed from: N.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3315d0 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f14391a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    private final Ti.a f14392b = Ti.g.b(false, 1, null);

    /* renamed from: N.d0$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final EnumC7839L f14393a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3091y0 f14394b;

        public a(EnumC7839L enumC7839L, InterfaceC3091y0 interfaceC3091y0) {
            this.f14393a = enumC7839L;
            this.f14394b = interfaceC3091y0;
        }

        public final boolean a(a aVar) {
            return this.f14393a.compareTo(aVar.f14393a) >= 0;
        }

        public final void b() {
            InterfaceC3091y0.a.b(this.f14394b, null, 1, null);
        }
    }

    /* renamed from: N.d0$b */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        Object f14395a;

        /* renamed from: b, reason: collision with root package name */
        Object f14396b;

        /* renamed from: c, reason: collision with root package name */
        Object f14397c;

        /* renamed from: d, reason: collision with root package name */
        int f14398d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f14399e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EnumC7839L f14400f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C3315d0 f14401g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f14402h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(EnumC7839L enumC7839L, C3315d0 c3315d0, InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f14400f = enumC7839L;
            this.f14401g = c3315d0;
            this.f14402h = interfaceC6835l;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            b bVar = new b(this.f14400f, this.f14401g, this.f14402h, interfaceC5380e);
            bVar.f14399e = obj;
            return bVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Ti.a, int] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Ti.a aVar;
            InterfaceC6835l interfaceC6835l;
            a aVar2;
            C3315d0 c3315d0;
            a aVar3;
            Throwable th2;
            C3315d0 c3315d02;
            Ti.a aVar4;
            Object objG = AbstractC5467b.g();
            ?? r12 = this.f14398d;
            try {
                try {
                    if (r12 == 0) {
                        Yg.v.b(obj);
                        Ii.N n10 = (Ii.N) this.f14399e;
                        EnumC7839L enumC7839L = this.f14400f;
                        InterfaceC5384i.b bVar = n10.getCoroutineContext().get(InterfaceC3091y0.f9363O);
                        AbstractC6492s.f(bVar);
                        a aVar5 = new a(enumC7839L, (InterfaceC3091y0) bVar);
                        this.f14401g.f(aVar5);
                        aVar = this.f14401g.f14392b;
                        InterfaceC6835l interfaceC6835l2 = this.f14402h;
                        C3315d0 c3315d03 = this.f14401g;
                        this.f14399e = aVar5;
                        this.f14395a = aVar;
                        this.f14396b = interfaceC6835l2;
                        this.f14397c = c3315d03;
                        this.f14398d = 1;
                        if (aVar.a(null, this) == objG) {
                            return objG;
                        }
                        interfaceC6835l = interfaceC6835l2;
                        aVar2 = aVar5;
                        c3315d0 = c3315d03;
                    } else {
                        if (r12 != 1) {
                            if (r12 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c3315d02 = (C3315d0) this.f14396b;
                            aVar4 = (Ti.a) this.f14395a;
                            aVar3 = (a) this.f14399e;
                            try {
                                Yg.v.b(obj);
                                r.Y.a(c3315d02.f14391a, aVar3, null);
                                aVar4.d(null);
                                return obj;
                            } catch (Throwable th3) {
                                th2 = th3;
                                r.Y.a(c3315d02.f14391a, aVar3, null);
                                throw th2;
                            }
                        }
                        c3315d0 = (C3315d0) this.f14397c;
                        interfaceC6835l = (InterfaceC6835l) this.f14396b;
                        Ti.a aVar6 = (Ti.a) this.f14395a;
                        aVar2 = (a) this.f14399e;
                        Yg.v.b(obj);
                        aVar = aVar6;
                    }
                    this.f14399e = aVar2;
                    this.f14395a = aVar;
                    this.f14396b = c3315d0;
                    this.f14397c = null;
                    this.f14398d = 2;
                    Object objInvoke = interfaceC6835l.invoke(this);
                    if (objInvoke == objG) {
                        return objG;
                    }
                    c3315d02 = c3315d0;
                    aVar4 = aVar;
                    obj = objInvoke;
                    aVar3 = aVar2;
                    r.Y.a(c3315d02.f14391a, aVar3, null);
                    aVar4.d(null);
                    return obj;
                } catch (Throwable th4) {
                    aVar3 = aVar2;
                    th2 = th4;
                    c3315d02 = c3315d0;
                    r.Y.a(c3315d02.f14391a, aVar3, null);
                    throw th2;
                }
            } catch (Throwable th5) {
                r12.d(null);
                throw th5;
            }
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((b) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(a aVar) {
        a aVar2;
        do {
            aVar2 = (a) this.f14391a.get();
            if (aVar2 != null && !aVar.a(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!r.Y.a(this.f14391a, aVar2, aVar));
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    public final Object d(EnumC7839L enumC7839L, InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
        return Ii.O.g(new b(enumC7839L, this, interfaceC6835l, null), interfaceC5380e);
    }

    public final boolean e(InterfaceC6824a interfaceC6824a) {
        boolean zB = a.C0811a.b(this.f14392b, null, 1, null);
        if (zB) {
            try {
                interfaceC6824a.invoke();
            } finally {
                a.C0811a.c(this.f14392b, null, 1, null);
            }
        }
        return zB;
    }
}

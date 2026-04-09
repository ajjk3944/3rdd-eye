package s;

import Ii.InterfaceC3091y0;
import androidx.compose.foundation.MutationInterruptedException;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f60665a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    private final Ti.a f60666b = Ti.g.b(false, 1, null);

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final EnumC7839L f60667a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3091y0 f60668b;

        public a(EnumC7839L enumC7839L, InterfaceC3091y0 interfaceC3091y0) {
            this.f60667a = enumC7839L;
            this.f60668b = interfaceC3091y0;
        }

        public final boolean a(a aVar) {
            return this.f60667a.compareTo(aVar.f60667a) >= 0;
        }

        public final void b() {
            this.f60668b.cancel((CancellationException) new MutationInterruptedException());
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        Object f60669a;

        /* renamed from: b, reason: collision with root package name */
        Object f60670b;

        /* renamed from: c, reason: collision with root package name */
        Object f60671c;

        /* renamed from: d, reason: collision with root package name */
        int f60672d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f60673e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EnumC7839L f60674f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ M f60675g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f60676h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(EnumC7839L enumC7839L, M m10, InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f60674f = enumC7839L;
            this.f60675g = m10;
            this.f60676h = interfaceC6835l;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            b bVar = new b(this.f60674f, this.f60675g, this.f60676h, interfaceC5380e);
            bVar.f60673e = obj;
            return bVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Ti.a, int] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Ti.a aVar;
            InterfaceC6835l interfaceC6835l;
            a aVar2;
            M m10;
            a aVar3;
            Throwable th2;
            M m11;
            Ti.a aVar4;
            Object objG = AbstractC5467b.g();
            ?? r12 = this.f60672d;
            try {
                try {
                    if (r12 == 0) {
                        Yg.v.b(obj);
                        Ii.N n10 = (Ii.N) this.f60673e;
                        EnumC7839L enumC7839L = this.f60674f;
                        InterfaceC5384i.b bVar = n10.getCoroutineContext().get(InterfaceC3091y0.f9363O);
                        AbstractC6492s.f(bVar);
                        a aVar5 = new a(enumC7839L, (InterfaceC3091y0) bVar);
                        this.f60675g.g(aVar5);
                        aVar = this.f60675g.f60666b;
                        InterfaceC6835l interfaceC6835l2 = this.f60676h;
                        M m12 = this.f60675g;
                        this.f60673e = aVar5;
                        this.f60669a = aVar;
                        this.f60670b = interfaceC6835l2;
                        this.f60671c = m12;
                        this.f60672d = 1;
                        if (aVar.a(null, this) == objG) {
                            return objG;
                        }
                        interfaceC6835l = interfaceC6835l2;
                        aVar2 = aVar5;
                        m10 = m12;
                    } else {
                        if (r12 != 1) {
                            if (r12 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            m11 = (M) this.f60670b;
                            aVar4 = (Ti.a) this.f60669a;
                            aVar3 = (a) this.f60673e;
                            try {
                                Yg.v.b(obj);
                                r.Y.a(m11.f60665a, aVar3, null);
                                aVar4.d(null);
                                return obj;
                            } catch (Throwable th3) {
                                th2 = th3;
                                r.Y.a(m11.f60665a, aVar3, null);
                                throw th2;
                            }
                        }
                        m10 = (M) this.f60671c;
                        interfaceC6835l = (InterfaceC6835l) this.f60670b;
                        Ti.a aVar6 = (Ti.a) this.f60669a;
                        aVar2 = (a) this.f60673e;
                        Yg.v.b(obj);
                        aVar = aVar6;
                    }
                    this.f60673e = aVar2;
                    this.f60669a = aVar;
                    this.f60670b = m10;
                    this.f60671c = null;
                    this.f60672d = 2;
                    Object objInvoke = interfaceC6835l.invoke(this);
                    if (objInvoke == objG) {
                        return objG;
                    }
                    m11 = m10;
                    aVar4 = aVar;
                    obj = objInvoke;
                    aVar3 = aVar2;
                    r.Y.a(m11.f60665a, aVar3, null);
                    aVar4.d(null);
                    return obj;
                } catch (Throwable th4) {
                    aVar3 = aVar2;
                    th2 = th4;
                    m11 = m10;
                    r.Y.a(m11.f60665a, aVar3, null);
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

    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        Object f60677a;

        /* renamed from: b, reason: collision with root package name */
        Object f60678b;

        /* renamed from: c, reason: collision with root package name */
        Object f60679c;

        /* renamed from: d, reason: collision with root package name */
        Object f60680d;

        /* renamed from: e, reason: collision with root package name */
        int f60681e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f60682f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ EnumC7839L f60683g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ M f60684h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f60685i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Object f60686j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(EnumC7839L enumC7839L, M m10, InterfaceC6839p interfaceC6839p, Object obj, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f60683g = enumC7839L;
            this.f60684h = m10;
            this.f60685i = interfaceC6839p;
            this.f60686j = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            c cVar = new c(this.f60683g, this.f60684h, this.f60685i, this.f60686j, interfaceC5380e);
            cVar.f60682f = obj;
            return cVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Ti.a, int] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Ti.a aVar;
            InterfaceC6839p interfaceC6839p;
            Object obj2;
            a aVar2;
            M m10;
            a aVar3;
            Throwable th2;
            M m11;
            Ti.a aVar4;
            Object objG = AbstractC5467b.g();
            ?? r12 = this.f60681e;
            try {
                try {
                    if (r12 == 0) {
                        Yg.v.b(obj);
                        Ii.N n10 = (Ii.N) this.f60682f;
                        EnumC7839L enumC7839L = this.f60683g;
                        InterfaceC5384i.b bVar = n10.getCoroutineContext().get(InterfaceC3091y0.f9363O);
                        AbstractC6492s.f(bVar);
                        a aVar5 = new a(enumC7839L, (InterfaceC3091y0) bVar);
                        this.f60684h.g(aVar5);
                        aVar = this.f60684h.f60666b;
                        interfaceC6839p = this.f60685i;
                        Object obj3 = this.f60686j;
                        M m12 = this.f60684h;
                        this.f60682f = aVar5;
                        this.f60677a = aVar;
                        this.f60678b = interfaceC6839p;
                        this.f60679c = obj3;
                        this.f60680d = m12;
                        this.f60681e = 1;
                        if (aVar.a(null, this) == objG) {
                            return objG;
                        }
                        obj2 = obj3;
                        aVar2 = aVar5;
                        m10 = m12;
                    } else {
                        if (r12 != 1) {
                            if (r12 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            m11 = (M) this.f60678b;
                            aVar4 = (Ti.a) this.f60677a;
                            aVar3 = (a) this.f60682f;
                            try {
                                Yg.v.b(obj);
                                r.Y.a(m11.f60665a, aVar3, null);
                                aVar4.d(null);
                                return obj;
                            } catch (Throwable th3) {
                                th2 = th3;
                                r.Y.a(m11.f60665a, aVar3, null);
                                throw th2;
                            }
                        }
                        m10 = (M) this.f60680d;
                        obj2 = this.f60679c;
                        interfaceC6839p = (InterfaceC6839p) this.f60678b;
                        Ti.a aVar6 = (Ti.a) this.f60677a;
                        aVar2 = (a) this.f60682f;
                        Yg.v.b(obj);
                        aVar = aVar6;
                    }
                    this.f60682f = aVar2;
                    this.f60677a = aVar;
                    this.f60678b = m10;
                    this.f60679c = null;
                    this.f60680d = null;
                    this.f60681e = 2;
                    Object objInvoke = interfaceC6839p.invoke(obj2, this);
                    if (objInvoke == objG) {
                        return objG;
                    }
                    m11 = m10;
                    aVar4 = aVar;
                    obj = objInvoke;
                    aVar3 = aVar2;
                    r.Y.a(m11.f60665a, aVar3, null);
                    aVar4.d(null);
                    return obj;
                } catch (Throwable th4) {
                    aVar3 = aVar2;
                    th2 = th4;
                    m11 = m10;
                    r.Y.a(m11.f60665a, aVar3, null);
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
            return ((c) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    public static /* synthetic */ Object e(M m10, EnumC7839L enumC7839L, InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC7839L = EnumC7839L.Default;
        }
        return m10.d(enumC7839L, interfaceC6835l, interfaceC5380e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(a aVar) {
        a aVar2;
        do {
            aVar2 = (a) this.f60665a.get();
            if (aVar2 != null && !aVar.a(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!r.Y.a(this.f60665a, aVar2, aVar));
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    public final Object d(EnumC7839L enumC7839L, InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
        return Ii.O.g(new b(enumC7839L, this, interfaceC6835l, null), interfaceC5380e);
    }

    public final Object f(Object obj, EnumC7839L enumC7839L, InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
        return Ii.O.g(new c(enumC7839L, this, interfaceC6839p, obj, null), interfaceC5380e);
    }
}

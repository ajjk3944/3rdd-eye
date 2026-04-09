package r;

import Ii.InterfaceC3091y0;
import androidx.compose.animation.core.MutationInterruptedException;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f59546a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    private final Ti.a f59547b = Ti.g.b(false, 1, null);

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final X f59548a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3091y0 f59549b;

        public a(X x10, InterfaceC3091y0 interfaceC3091y0) {
            this.f59548a = x10;
            this.f59549b = interfaceC3091y0;
        }

        public final boolean a(a aVar) {
            return this.f59548a.compareTo(aVar.f59548a) >= 0;
        }

        public final void b() {
            this.f59549b.cancel((CancellationException) new MutationInterruptedException());
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        Object f59550a;

        /* renamed from: b, reason: collision with root package name */
        Object f59551b;

        /* renamed from: c, reason: collision with root package name */
        Object f59552c;

        /* renamed from: d, reason: collision with root package name */
        int f59553d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f59554e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ X f59555f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Z f59556g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f59557h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(X x10, Z z10, InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f59555f = x10;
            this.f59556g = z10;
            this.f59557h = interfaceC6835l;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            b bVar = new b(this.f59555f, this.f59556g, this.f59557h, interfaceC5380e);
            bVar.f59554e = obj;
            return bVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Ti.a, int] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Ti.a aVar;
            InterfaceC6835l interfaceC6835l;
            a aVar2;
            Z z10;
            a aVar3;
            Throwable th2;
            Z z11;
            Ti.a aVar4;
            Object objG = AbstractC5467b.g();
            ?? r12 = this.f59553d;
            try {
                try {
                    if (r12 == 0) {
                        Yg.v.b(obj);
                        Ii.N n10 = (Ii.N) this.f59554e;
                        X x10 = this.f59555f;
                        InterfaceC5384i.b bVar = n10.getCoroutineContext().get(InterfaceC3091y0.f9363O);
                        AbstractC6492s.f(bVar);
                        a aVar5 = new a(x10, (InterfaceC3091y0) bVar);
                        this.f59556g.f(aVar5);
                        aVar = this.f59556g.f59547b;
                        InterfaceC6835l interfaceC6835l2 = this.f59557h;
                        Z z12 = this.f59556g;
                        this.f59554e = aVar5;
                        this.f59550a = aVar;
                        this.f59551b = interfaceC6835l2;
                        this.f59552c = z12;
                        this.f59553d = 1;
                        if (aVar.a(null, this) == objG) {
                            return objG;
                        }
                        interfaceC6835l = interfaceC6835l2;
                        aVar2 = aVar5;
                        z10 = z12;
                    } else {
                        if (r12 != 1) {
                            if (r12 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            z11 = (Z) this.f59551b;
                            aVar4 = (Ti.a) this.f59550a;
                            aVar3 = (a) this.f59554e;
                            try {
                                Yg.v.b(obj);
                                Y.a(z11.f59546a, aVar3, null);
                                aVar4.d(null);
                                return obj;
                            } catch (Throwable th3) {
                                th2 = th3;
                                Y.a(z11.f59546a, aVar3, null);
                                throw th2;
                            }
                        }
                        z10 = (Z) this.f59552c;
                        interfaceC6835l = (InterfaceC6835l) this.f59551b;
                        Ti.a aVar6 = (Ti.a) this.f59550a;
                        aVar2 = (a) this.f59554e;
                        Yg.v.b(obj);
                        aVar = aVar6;
                    }
                    this.f59554e = aVar2;
                    this.f59550a = aVar;
                    this.f59551b = z10;
                    this.f59552c = null;
                    this.f59553d = 2;
                    Object objInvoke = interfaceC6835l.invoke(this);
                    if (objInvoke == objG) {
                        return objG;
                    }
                    z11 = z10;
                    aVar4 = aVar;
                    obj = objInvoke;
                    aVar3 = aVar2;
                    Y.a(z11.f59546a, aVar3, null);
                    aVar4.d(null);
                    return obj;
                } catch (Throwable th4) {
                    aVar3 = aVar2;
                    th2 = th4;
                    z11 = z10;
                    Y.a(z11.f59546a, aVar3, null);
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

    public static /* synthetic */ Object e(Z z10, X x10, InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            x10 = X.Default;
        }
        return z10.d(x10, interfaceC6835l, interfaceC5380e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(a aVar) {
        a aVar2;
        do {
            aVar2 = (a) this.f59546a.get();
            if (aVar2 != null && !aVar.a(aVar2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!Y.a(this.f59546a, aVar2, aVar));
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    public final Object d(X x10, InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
        return Ii.O.g(new b(x10, this, interfaceC6835l, null), interfaceC5380e);
    }
}

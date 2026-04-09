package P7;

import A9.C0575f;
import A9.C0585k;
import A9.L;
import A9.M;
import J8.E;
import P7.x;
import b9.C1992A;
import f9.InterfaceC4347e;
import java.util.List;

/* compiled from: PhConsentManager.kt */
@h9.e(c = "com.zipoapps.ads.PhConsentManager$waitForConsentForm$2", f = "PhConsentManager.kt", l = {174}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class D extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super E.c<C1992A>>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f10680l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f10681m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ x f10682n;

    /* compiled from: PhConsentManager.kt */
    @h9.e(c = "com.zipoapps.ads.PhConsentManager$waitForConsentForm$2$1", f = "PhConsentManager.kt", l = {174}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super List<? extends Boolean>>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f10683l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ M f10684m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(M m10, InterfaceC4347e interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f10684m = m10;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new a(this.f10684m, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super List<? extends Boolean>> interfaceC4347e) {
            return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f10683l;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b9.n.b(obj);
                return obj;
            }
            b9.n.b(obj);
            L[] lArr = {this.f10684m};
            this.f10683l = 1;
            Object objI = A9.I.i(lArr, this);
            return objI == aVar ? aVar : objI;
        }
    }

    /* compiled from: PhConsentManager.kt */
    @h9.e(c = "com.zipoapps.ads.PhConsentManager$waitForConsentForm$2$loadFormAction$1", f = "PhConsentManager.kt", l = {170}, m = "invokeSuspend")
    public static final class b extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super Boolean>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f10685l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ x f10686m;

        /* compiled from: PhConsentManager.kt */
        @h9.e(c = "com.zipoapps.ads.PhConsentManager$waitForConsentForm$2$loadFormAction$1$1", f = "PhConsentManager.kt", l = {}, m = "invokeSuspend")
        public static final class a extends h9.i implements p9.p<x.d, InterfaceC4347e<? super Boolean>, Object> {

            /* renamed from: l, reason: collision with root package name */
            public /* synthetic */ Object f10687l;

            public a() {
                throw null;
            }

            @Override // h9.AbstractC4424a
            public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
                a aVar = new a(2, interfaceC4347e);
                aVar.f10687l = obj;
                return aVar;
            }

            @Override // p9.p
            public final Object invoke(x.d dVar, InterfaceC4347e<? super Boolean> interfaceC4347e) {
                return ((a) create(dVar, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
            }

            @Override // h9.AbstractC4424a
            public final Object invokeSuspend(Object obj) {
                g9.a aVar = g9.a.COROUTINE_SUSPENDED;
                b9.n.b(obj);
                return Boolean.valueOf(((x.d) this.f10687l) != null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x xVar, InterfaceC4347e<? super b> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f10686m = xVar;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new b(this.f10686m, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super Boolean> interfaceC4347e) {
            return ((b) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f10685l;
            if (i == 0) {
                b9.n.b(obj);
                x xVar = this.f10686m;
                if (xVar.f10830g.getValue() == null) {
                    a aVar2 = new a(2, null);
                    this.f10685l = 1;
                    if (D9.H.e(xVar.f10830g, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b9.n.b(obj);
            }
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(x xVar, InterfaceC4347e<? super D> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f10682n = xVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        D d10 = new D(this.f10682n, interfaceC4347e);
        d10.f10681m = obj;
        return d10;
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super E.c<C1992A>> interfaceC4347e) {
        return ((D) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f10680l;
        if (i == 0) {
            b9.n.b(obj);
            a aVar2 = new a(C0575f.b((A9.E) this.f10681m, null, new b(this.f10682n, null), 3), null);
            this.f10680l = 1;
            if (C0585k.b(5000L, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b9.n.b(obj);
        }
        return new E.c(C1992A.f18074a);
    }
}

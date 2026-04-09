package P7;

import A9.C0575f;
import A9.L;
import J8.E;
import b9.C1992A;
import f9.InterfaceC4347e;

/* compiled from: PhConsentManager.kt */
@h9.e(c = "com.zipoapps.ads.PhConsentManager$waitForInitComplete$2", f = "PhConsentManager.kt", l = {311}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class F extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super E.c<C1992A>>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f10691l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f10692m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ x f10693n;

    /* compiled from: PhConsentManager.kt */
    @h9.e(c = "com.zipoapps.ads.PhConsentManager$waitForInitComplete$2$initProcess$1", f = "PhConsentManager.kt", l = {307}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super Boolean>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f10694l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ x f10695m;

        /* compiled from: PhConsentManager.kt */
        @h9.e(c = "com.zipoapps.ads.PhConsentManager$waitForInitComplete$2$initProcess$1$1", f = "PhConsentManager.kt", l = {}, m = "invokeSuspend")
        /* renamed from: P7.F$a$a, reason: collision with other inner class name */
        public static final class C0121a extends h9.i implements p9.p<Boolean, InterfaceC4347e<? super Boolean>, Object> {

            /* renamed from: l, reason: collision with root package name */
            public /* synthetic */ boolean f10696l;

            public C0121a() {
                throw null;
            }

            @Override // h9.AbstractC4424a
            public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
                C0121a c0121a = new C0121a(2, interfaceC4347e);
                c0121a.f10696l = ((Boolean) obj).booleanValue();
                return c0121a;
            }

            @Override // p9.p
            public final Object invoke(Boolean bool, InterfaceC4347e<? super Boolean> interfaceC4347e) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((C0121a) create(bool2, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
            }

            @Override // h9.AbstractC4424a
            public final Object invokeSuspend(Object obj) {
                g9.a aVar = g9.a.COROUTINE_SUSPENDED;
                b9.n.b(obj);
                return Boolean.valueOf(this.f10696l);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x xVar, InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f10695m = xVar;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new a(this.f10695m, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super Boolean> interfaceC4347e) {
            return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f10694l;
            if (i == 0) {
                b9.n.b(obj);
                x xVar = this.f10695m;
                if (!((Boolean) xVar.f10827d.getValue()).booleanValue()) {
                    C0121a c0121a = new C0121a(2, null);
                    this.f10694l = 1;
                    if (D9.H.e(xVar.f10827d, c0121a, this) == aVar) {
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
    public F(x xVar, InterfaceC4347e<? super F> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f10693n = xVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        F f10 = new F(this.f10693n, interfaceC4347e);
        f10.f10692m = obj;
        return f10;
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super E.c<C1992A>> interfaceC4347e) {
        return ((F) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f10691l;
        if (i == 0) {
            b9.n.b(obj);
            L[] lArr = {C0575f.b((A9.E) this.f10692m, null, new a(this.f10693n, null), 3)};
            this.f10691l = 1;
            if (A9.I.i(lArr, this) == aVar) {
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

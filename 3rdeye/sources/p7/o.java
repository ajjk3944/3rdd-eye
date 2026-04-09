package P7;

import A9.C0575f;
import A9.L;
import J8.E;
import b9.C1992A;
import f9.InterfaceC4347e;
import va.a;

/* compiled from: AdManager.kt */
@h9.e(c = "com.zipoapps.ads.AdManager$waitForConfiguration$2", f = "AdManager.kt", l = {340}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class o extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super E.c<C1992A>>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f10779l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f10780m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1484a f10781n;

    /* compiled from: AdManager.kt */
    @h9.e(c = "com.zipoapps.ads.AdManager$waitForConfiguration$2$initProcess$1", f = "AdManager.kt", l = {335}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super Boolean>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f10782l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C1484a f10783m;

        /* compiled from: AdManager.kt */
        @h9.e(c = "com.zipoapps.ads.AdManager$waitForConfiguration$2$initProcess$1$1", f = "AdManager.kt", l = {}, m = "invokeSuspend")
        /* renamed from: P7.o$a$a, reason: collision with other inner class name */
        public static final class C0128a extends h9.i implements p9.p<Boolean, InterfaceC4347e<? super Boolean>, Object> {

            /* renamed from: l, reason: collision with root package name */
            public /* synthetic */ Object f10784l;

            public C0128a() {
                throw null;
            }

            @Override // h9.AbstractC4424a
            public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
                C0128a c0128a = new C0128a(2, interfaceC4347e);
                c0128a.f10784l = obj;
                return c0128a;
            }

            @Override // p9.p
            public final Object invoke(Boolean bool, InterfaceC4347e<? super Boolean> interfaceC4347e) {
                return ((C0128a) create(bool, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
            }

            @Override // h9.AbstractC4424a
            public final Object invokeSuspend(Object obj) {
                g9.a aVar = g9.a.COROUTINE_SUSPENDED;
                b9.n.b(obj);
                return Boolean.valueOf(((Boolean) this.f10784l) != null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1484a c1484a, InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f10783m = c1484a;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new a(this.f10783m, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super Boolean> interfaceC4347e) {
            return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f10782l;
            if (i == 0) {
                b9.n.b(obj);
                C1484a c1484a = this.f10783m;
                if (c1484a.f10724l.getValue() == null) {
                    C0128a c0128a = new C0128a(2, null);
                    this.f10782l = 1;
                    if (D9.H.e(c1484a.f10724l, c0128a, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b9.n.b(obj);
            }
            a.b bVar = va.a.f47104a;
            bVar.o("PhConsentManager");
            bVar.a("Waiting for configuration complete", new Object[0]);
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(C1484a c1484a, InterfaceC4347e<? super o> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f10781n = c1484a;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        o oVar = new o(this.f10781n, interfaceC4347e);
        oVar.f10780m = obj;
        return oVar;
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super E.c<C1992A>> interfaceC4347e) {
        return ((o) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f10779l;
        if (i == 0) {
            b9.n.b(obj);
            A9.E e4 = (A9.E) this.f10780m;
            a.b bVar = va.a.f47104a;
            bVar.o("PhConsentManager");
            bVar.a("Start to wait for configuration", new Object[0]);
            L[] lArr = {C0575f.b(e4, null, new a(this.f10781n, null), 3)};
            this.f10779l = 1;
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

package P7;

import A9.C0575f;
import A9.L;
import J8.E;
import b9.C1992A;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import f9.InterfaceC4347e;

/* compiled from: AdManager.kt */
@h9.e(c = "com.zipoapps.ads.AdManager$waitForPremiumStatus$2", f = "AdManager.kt", l = {Sdk$SDKError.b.WEBVIEW_ERROR_VALUE}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class q extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super E.c<C1992A>>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f10788l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f10789m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1484a f10790n;

    /* compiled from: AdManager.kt */
    @h9.e(c = "com.zipoapps.ads.AdManager$waitForPremiumStatus$2$initProcess$1", f = "AdManager.kt", l = {316}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super Boolean>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f10791l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C1484a f10792m;

        /* compiled from: AdManager.kt */
        @h9.e(c = "com.zipoapps.ads.AdManager$waitForPremiumStatus$2$initProcess$1$1", f = "AdManager.kt", l = {}, m = "invokeSuspend")
        /* renamed from: P7.q$a$a, reason: collision with other inner class name */
        public static final class C0129a extends h9.i implements p9.p<Boolean, InterfaceC4347e<? super Boolean>, Object> {

            /* renamed from: l, reason: collision with root package name */
            public /* synthetic */ Object f10793l;

            public C0129a() {
                throw null;
            }

            @Override // h9.AbstractC4424a
            public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
                C0129a c0129a = new C0129a(2, interfaceC4347e);
                c0129a.f10793l = obj;
                return c0129a;
            }

            @Override // p9.p
            public final Object invoke(Boolean bool, InterfaceC4347e<? super Boolean> interfaceC4347e) {
                return ((C0129a) create(bool, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
            }

            @Override // h9.AbstractC4424a
            public final Object invokeSuspend(Object obj) {
                g9.a aVar = g9.a.COROUTINE_SUSPENDED;
                b9.n.b(obj);
                return Boolean.valueOf(((Boolean) this.f10793l) != null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1484a c1484a, InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f10792m = c1484a;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new a(this.f10792m, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super Boolean> interfaceC4347e) {
            return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f10791l;
            if (i == 0) {
                b9.n.b(obj);
                C1484a c1484a = this.f10792m;
                if (c1484a.f10723k.getValue() == null) {
                    C0129a c0129a = new C0129a(2, null);
                    this.f10791l = 1;
                    if (D9.H.e(c1484a.f10723k, c0129a, this) == aVar) {
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
    public q(C1484a c1484a, InterfaceC4347e<? super q> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f10790n = c1484a;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        q qVar = new q(this.f10790n, interfaceC4347e);
        qVar.f10789m = obj;
        return qVar;
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super E.c<C1992A>> interfaceC4347e) {
        return ((q) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f10788l;
        if (i == 0) {
            b9.n.b(obj);
            L[] lArr = {C0575f.b((A9.E) this.f10789m, null, new a(this.f10790n, null), 3)};
            this.f10788l = 1;
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

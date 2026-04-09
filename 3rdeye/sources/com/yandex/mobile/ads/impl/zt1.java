package com.yandex.mobile.ads.impl;

import b9.C1992A;
import com.yandex.mobile.ads.impl.gv1;
import f9.InterfaceC4347e;

@h9.e(c = "com.monetization.ads.base.bidder.SdkBidderTokenLoader$loadBidderToken$1", f = "SdkBidderTokenLoader.kt", l = {108, 77, 82}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class zt1 extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: b, reason: collision with root package name */
    EnumC4191r4 f36724b;

    /* renamed from: c, reason: collision with root package name */
    au1 f36725c;

    /* renamed from: d, reason: collision with root package name */
    xk f36726d;

    /* renamed from: e, reason: collision with root package name */
    int f36727e;

    /* renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f36728f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ au1 f36729g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ xk f36730h;
    final /* synthetic */ us i;

    @h9.e(c = "com.monetization.ads.base.bidder.SdkBidderTokenLoader$loadBidderToken$1$1", f = "SdkBidderTokenLoader.kt", l = {}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ us f36731b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f52 f36732c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(us usVar, f52 f52Var, InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f36731b = usVar;
            this.f36732c = f52Var;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new a(this.f36731b, this.f36732c, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return new a(this.f36731b, this.f36732c, interfaceC4347e).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            b9.n.b(obj);
            this.f36731b.onBidderTokenLoaded(this.f36732c.a());
            return C1992A.f18074a;
        }
    }

    @h9.e(c = "com.monetization.ads.base.bidder.SdkBidderTokenLoader$loadBidderToken$1$2", f = "SdkBidderTokenLoader.kt", l = {}, m = "invokeSuspend")
    public static final class b extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ us f36733b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(us usVar, InterfaceC4347e<? super b> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f36733b = usVar;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new b(this.f36733b, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return new b(this.f36733b, interfaceC4347e).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            b9.n.b(obj);
            this.f36733b.a();
            return C1992A.f18074a;
        }
    }

    @h9.e(c = "com.monetization.ads.base.bidder.SdkBidderTokenLoader$loadBidderToken$1$tokenResult$1$stubReason$1$1", f = "SdkBidderTokenLoader.kt", l = {55}, m = "invokeSuspend")
    public static final class c extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f36734b;

        public c(InterfaceC4347e<? super c> interfaceC4347e) {
            super(2, interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new c(interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return new c(interfaceC4347e).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f36734b;
            if (i == 0) {
                b9.n.b(obj);
                this.f36734b = 1;
                if (A9.O.a(2000L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b9.n.b(obj);
            }
            return C1992A.f18074a;
        }
    }

    @h9.e(c = "com.monetization.ads.base.bidder.SdkBidderTokenLoader$loadBidderToken$1$tokenResult$1$stubReason$1$2", f = "SdkBidderTokenLoader.kt", l = {}, m = "invokeSuspend")
    public static final class d extends h9.i implements p9.l<InterfaceC4347e<? super bu1>, Object> {
        public d(InterfaceC4347e<? super d> interfaceC4347e) {
            super(1, interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(InterfaceC4347e<?> interfaceC4347e) {
            return new d(interfaceC4347e);
        }

        @Override // p9.l
        public final Object invoke(InterfaceC4347e<? super bu1> interfaceC4347e) {
            new d(interfaceC4347e);
            C1992A c1992a = C1992A.f18074a;
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            b9.n.b(c1992a);
            return bu1.f25397d;
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            b9.n.b(obj);
            return bu1.f25397d;
        }
    }

    @h9.e(c = "com.monetization.ads.base.bidder.SdkBidderTokenLoader$loadBidderToken$1$tokenResult$1$stubReason$1$3", f = "SdkBidderTokenLoader.kt", l = {61}, m = "invokeSuspend")
    public static final class e extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super bu1>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f36735b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ au1 f36736c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(au1 au1Var, InterfaceC4347e<? super e> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f36736c = au1Var;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new e(this.f36736c, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super bu1> interfaceC4347e) {
            return new e(this.f36736c, interfaceC4347e).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f36735b;
            if (i == 0) {
                b9.n.b(obj);
                jv1 jv1Var = this.f36736c.f24815f;
                tk0 tk0Var = tk0.f33656f;
                this.f36735b = 1;
                obj = jv1Var.a(tk0Var, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b9.n.b(obj);
            }
            gv1 gv1Var = (gv1) obj;
            if (gv1Var instanceof gv1.b) {
                return null;
            }
            if (gv1Var instanceof gv1.a) {
                return bu1.f25396c;
            }
            throw new b9.j();
        }
    }

    @h9.e(c = "com.monetization.ads.base.bidder.SdkBidderTokenLoader$loadBidderToken$1$tokenResult$1$stubReason$1$4", f = "SdkBidderTokenLoader.kt", l = {}, m = "invokeSuspend")
    public static final class f extends h9.i implements p9.p<bu1, InterfaceC4347e<? super bu1>, Object> {

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f36737b;

        public f(InterfaceC4347e<? super f> interfaceC4347e) {
            super(2, interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            f fVar = new f(interfaceC4347e);
            fVar.f36737b = obj;
            return fVar;
        }

        @Override // p9.p
        public final Object invoke(bu1 bu1Var, InterfaceC4347e<? super bu1> interfaceC4347e) {
            f fVar = new f(interfaceC4347e);
            fVar.f36737b = bu1Var;
            return fVar.invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            b9.n.b(obj);
            return (bu1) this.f36737b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt1(au1 au1Var, xk xkVar, us usVar, InterfaceC4347e<? super zt1> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f36729g = au1Var;
        this.f36730h = xkVar;
        this.i = usVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        zt1 zt1Var = new zt1(this.f36729g, this.f36730h, this.i, interfaceC4347e);
        zt1Var.f36728f = obj;
        return zt1Var;
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((zt1) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0140, code lost:
    
        if (A9.C0575f.h(r2, r4, r20) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x016b, code lost:
    
        if (A9.C0575f.h(r2, r5, r20) == r1) goto L27;
     */
    @Override // h9.AbstractC4424a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.zt1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

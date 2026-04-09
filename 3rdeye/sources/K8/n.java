package k8;

import J8.E;
import b9.C1992A;
import com.android.billingclient.api.BillingClient;
import f9.InterfaceC4347e;

/* compiled from: Billing.kt */
@h9.e(c = "com.zipoapps.premiumhelper.billing.Billing$hasHistoryPurchases$2$1", f = "Billing.kt", l = {497, 497}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class n extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super E.c<Boolean>>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f43537l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f43538m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t f43539n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ BillingClient f43540o;

    /* compiled from: Billing.kt */
    @h9.e(c = "com.zipoapps.premiumhelper.billing.Billing$hasHistoryPurchases$2$1$inapp$1", f = "Billing.kt", l = {494}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super Boolean>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f43541l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ t f43542m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ BillingClient f43543n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t tVar, BillingClient billingClient, InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f43542m = tVar;
            this.f43543n = billingClient;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new a(this.f43542m, this.f43543n, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super Boolean> interfaceC4347e) {
            return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f43541l;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b9.n.b(obj);
                return obj;
            }
            b9.n.b(obj);
            this.f43541l = 1;
            Object objB = t.b(this.f43542m, this.f43543n, "inapp", this);
            return objB == aVar ? aVar : objB;
        }
    }

    /* compiled from: Billing.kt */
    @h9.e(c = "com.zipoapps.premiumhelper.billing.Billing$hasHistoryPurchases$2$1$subs$1", f = "Billing.kt", l = {495}, m = "invokeSuspend")
    public static final class b extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super Boolean>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f43544l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ t f43545m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ BillingClient f43546n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(t tVar, BillingClient billingClient, InterfaceC4347e<? super b> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f43545m = tVar;
            this.f43546n = billingClient;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new b(this.f43545m, this.f43546n, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super Boolean> interfaceC4347e) {
            return ((b) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f43544l;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b9.n.b(obj);
                return obj;
            }
            b9.n.b(obj);
            this.f43544l = 1;
            Object objB = t.b(this.f43545m, this.f43546n, "subs", this);
            return objB == aVar ? aVar : objB;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(t tVar, BillingClient billingClient, InterfaceC4347e<? super n> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f43539n = tVar;
        this.f43540o = billingClient;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        n nVar = new n(this.f43539n, this.f43540o, interfaceC4347e);
        nVar.f43538m = obj;
        return nVar;
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super E.c<Boolean>> interfaceC4347e) {
        return ((n) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        if (r11 == r0) goto L18;
     */
    @Override // h9.AbstractC4424a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            g9.a r0 = g9.a.COROUTINE_SUSPENDED
            int r1 = r10.f43537l
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L21
            if (r1 == r4) goto L19
            if (r1 != r3) goto L11
            b9.n.b(r11)
            goto L60
        L11:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L19:
            java.lang.Object r1 = r10.f43538m
            A9.L r1 = (A9.L) r1
            b9.n.b(r11)
            goto L4d
        L21:
            b9.n.b(r11)
            java.lang.Object r11 = r10.f43538m
            A9.E r11 = (A9.E) r11
            k8.n$a r1 = new k8.n$a
            k8.t r5 = r10.f43539n
            com.android.billingclient.api.BillingClient r6 = r10.f43540o
            r1.<init>(r5, r6, r2)
            r7 = 3
            A9.M r1 = A9.C0575f.b(r11, r2, r1, r7)
            k8.n$b r8 = new k8.n$b
            r8.<init>(r5, r6, r2)
            A9.M r11 = A9.C0575f.b(r11, r2, r8, r7)
            r10.f43538m = r11
            r10.f43537l = r4
            java.lang.Object r1 = r1.t(r10)
            if (r1 != r0) goto L4a
            goto L5f
        L4a:
            r9 = r1
            r1 = r11
            r11 = r9
        L4d:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L6a
            r10.f43538m = r2
            r10.f43537l = r3
            java.lang.Object r11 = r1.l(r10)
            if (r11 != r0) goto L60
        L5f:
            return r0
        L60:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L69
            goto L6a
        L69:
            r4 = 0
        L6a:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r4)
            J8.E$c r0 = new J8.E$c
            r0.<init>(r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

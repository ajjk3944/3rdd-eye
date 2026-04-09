package k8;

import A9.C0575f;
import A9.L;
import A9.M;
import b9.C1992A;
import c9.C2097r;
import com.android.billingclient.api.BillingClient;
import f9.InterfaceC4347e;
import java.util.Collection;
import java.util.List;

/* compiled from: Billing.kt */
@h9.e(c = "com.zipoapps.premiumhelper.billing.Billing$queryActivePurchases$2", f = "Billing.kt", l = {679, 679}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class u extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super List<? extends C5251a>>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f43598l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f43599m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t f43600n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ BillingClient f43601o;

    /* compiled from: Billing.kt */
    @h9.e(c = "com.zipoapps.premiumhelper.billing.Billing$queryActivePurchases$2$inapp$1", f = "Billing.kt", l = {677}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super List<? extends C5251a>>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f43602l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ t f43603m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ BillingClient f43604n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t tVar, BillingClient billingClient, InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f43603m = tVar;
            this.f43604n = billingClient;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new a(this.f43603m, this.f43604n, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super List<? extends C5251a>> interfaceC4347e) {
            return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f43602l;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b9.n.b(obj);
                return obj;
            }
            b9.n.b(obj);
            this.f43602l = 1;
            w9.i<Object>[] iVarArr = t.f43568n;
            Object objW = this.f43603m.w(this.f43604n, "inapp", this);
            return objW == aVar ? aVar : objW;
        }
    }

    /* compiled from: Billing.kt */
    @h9.e(c = "com.zipoapps.premiumhelper.billing.Billing$queryActivePurchases$2$subs$1", f = "Billing.kt", l = {678}, m = "invokeSuspend")
    public static final class b extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super List<? extends C5251a>>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f43605l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ t f43606m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ BillingClient f43607n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(t tVar, BillingClient billingClient, InterfaceC4347e<? super b> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f43606m = tVar;
            this.f43607n = billingClient;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new b(this.f43606m, this.f43607n, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super List<? extends C5251a>> interfaceC4347e) {
            return ((b) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f43605l;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b9.n.b(obj);
                return obj;
            }
            b9.n.b(obj);
            this.f43605l = 1;
            w9.i<Object>[] iVarArr = t.f43568n;
            Object objW = this.f43606m.w(this.f43607n, "subs", this);
            return objW == aVar ? aVar : objW;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(t tVar, BillingClient billingClient, InterfaceC4347e<? super u> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f43600n = tVar;
        this.f43601o = billingClient;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        u uVar = new u(this.f43600n, this.f43601o, interfaceC4347e);
        uVar.f43599m = obj;
        return uVar;
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super List<? extends C5251a>> interfaceC4347e) {
        return ((u) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) throws Throwable {
        L l5;
        Collection collection;
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f43598l;
        if (i == 0) {
            b9.n.b(obj);
            A9.E e4 = (A9.E) this.f43599m;
            t tVar = this.f43600n;
            BillingClient billingClient = this.f43601o;
            M mB = C0575f.b(e4, null, new a(tVar, billingClient, null), 3);
            M mB2 = C0575f.b(e4, null, new b(tVar, billingClient, null), 3);
            this.f43599m = mB2;
            this.f43598l = 1;
            Object objT = mB.t(this);
            if (objT != aVar) {
                l5 = mB2;
                obj = objT;
            }
            return aVar;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collection = (Collection) this.f43599m;
            b9.n.b(obj);
            return C2097r.y0((Iterable) obj, collection);
        }
        l5 = (L) this.f43599m;
        b9.n.b(obj);
        Collection collection2 = (Collection) obj;
        this.f43599m = collection2;
        this.f43598l = 2;
        Object objL = l5.l(this);
        if (objL != aVar) {
            collection = collection2;
            obj = objL;
            return C2097r.y0((Iterable) obj, collection);
        }
        return aVar;
    }
}

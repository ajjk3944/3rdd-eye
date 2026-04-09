package k8;

import A9.C0575f;
import A9.L;
import A9.M;
import A9.U;
import D9.J;
import J8.E;
import android.content.SharedPreferences;
import b9.C1992A;
import c9.C2097r;
import com.android.billingclient.api.BillingClient;
import com.zipoapps.premiumhelper.AcknowledgePurchaseWorker;
import com.zipoapps.premiumhelper.e;
import com.zipoapps.premiumhelper.toto.TotoManager;
import f9.InterfaceC4347e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: Billing.kt */
@h9.e(c = "com.zipoapps.premiumhelper.billing.Billing$getActivePurchases$2$1", f = "Billing.kt", l = {163, 163}, m = "invokeSuspend")
/* renamed from: k8.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5258h extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super E.c<List<? extends C5251a>>>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public Object f43496l;

    /* renamed from: m, reason: collision with root package name */
    public int f43497m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f43498n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ t f43499o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ BillingClient f43500p;

    /* compiled from: Billing.kt */
    @h9.e(c = "com.zipoapps.premiumhelper.billing.Billing$getActivePurchases$2$1$1", f = "Billing.kt", l = {176}, m = "invokeSuspend")
    /* renamed from: k8.h$a */
    public static final class a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f43501l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ t f43502m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ ArrayList f43503n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t tVar, ArrayList arrayList, InterfaceC4347e interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f43502m = tVar;
            this.f43503n = arrayList;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new a(this.f43502m, this.f43503n, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f43501l;
            if (i == 0) {
                b9.n.b(obj);
                t tVar = this.f43502m;
                String value = tVar.f43579l.getValue();
                ArrayList arrayList = this.f43503n;
                t.f(tVar, arrayList, value);
                if (!arrayList.isEmpty()) {
                    com.zipoapps.premiumhelper.d dVar = tVar.f43569a;
                    this.f43501l = 1;
                    if (AcknowledgePurchaseWorker.a.a(dVar, this) == aVar) {
                        return aVar;
                    }
                }
                return C1992A.f18074a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b9.n.b(obj);
            com.zipoapps.premiumhelper.e.f37006D.getClass();
            TotoManager.scheduleRegister$default(e.a.a().f37033w, false, 1, null);
            return C1992A.f18074a;
        }
    }

    /* compiled from: Billing.kt */
    @h9.e(c = "com.zipoapps.premiumhelper.billing.Billing$getActivePurchases$2$1$inapp$1", f = "Billing.kt", l = {160}, m = "invokeSuspend")
    /* renamed from: k8.h$b */
    public static final class b extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super List<? extends C5251a>>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f43504l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ t f43505m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ BillingClient f43506n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(t tVar, BillingClient billingClient, InterfaceC4347e<? super b> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f43505m = tVar;
            this.f43506n = billingClient;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new b(this.f43505m, this.f43506n, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super List<? extends C5251a>> interfaceC4347e) {
            return ((b) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f43504l;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b9.n.b(obj);
                return obj;
            }
            b9.n.b(obj);
            this.f43504l = 1;
            w9.i<Object>[] iVarArr = t.f43568n;
            Object objW = this.f43505m.w(this.f43506n, "inapp", this);
            return objW == aVar ? aVar : objW;
        }
    }

    /* compiled from: Billing.kt */
    @h9.e(c = "com.zipoapps.premiumhelper.billing.Billing$getActivePurchases$2$1$subs$1", f = "Billing.kt", l = {161}, m = "invokeSuspend")
    /* renamed from: k8.h$c */
    public static final class c extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super List<? extends C5251a>>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f43507l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ t f43508m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ BillingClient f43509n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(t tVar, BillingClient billingClient, InterfaceC4347e<? super c> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f43508m = tVar;
            this.f43509n = billingClient;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new c(this.f43508m, this.f43509n, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super List<? extends C5251a>> interfaceC4347e) {
            return ((c) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f43507l;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b9.n.b(obj);
                return obj;
            }
            b9.n.b(obj);
            this.f43507l = 1;
            w9.i<Object>[] iVarArr = t.f43568n;
            Object objW = this.f43508m.w(this.f43509n, "subs", this);
            return objW == aVar ? aVar : objW;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5258h(t tVar, BillingClient billingClient, InterfaceC4347e<? super C5258h> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f43499o = tVar;
        this.f43500p = billingClient;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        C5258h c5258h = new C5258h(this.f43499o, this.f43500p, interfaceC4347e);
        c5258h.f43498n = obj;
        return c5258h;
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super E.c<List<? extends C5251a>>> interfaceC4347e) {
        return ((C5258h) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) throws Throwable {
        A9.E e4;
        L l5;
        Collection collection;
        A9.E e10;
        ArrayList arrayListY0;
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f43497m;
        boolean z10 = true;
        t tVar = this.f43499o;
        if (i == 0) {
            b9.n.b(obj);
            A9.E e11 = (A9.E) this.f43498n;
            BillingClient billingClient = this.f43500p;
            M mB = C0575f.b(e11, null, new b(tVar, billingClient, null), 3);
            M mB2 = C0575f.b(e11, null, new c(tVar, billingClient, null), 3);
            this.f43498n = e11;
            this.f43496l = mB2;
            this.f43497m = 1;
            Object objT = mB.t(this);
            if (objT != aVar) {
                e4 = e11;
                obj = objT;
                l5 = mB2;
            }
            return aVar;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collection = (Collection) this.f43496l;
            e10 = (A9.E) this.f43498n;
            b9.n.b(obj);
            arrayListY0 = C2097r.y0((Iterable) obj, collection);
            com.zipoapps.premiumhelper.d dVar = tVar.f43569a;
            l8.b bVar = tVar.f43570b;
            l8.d<String> PH_PREMIUM_PACKAGES = i8.d.f38532L;
            kotlin.jvm.internal.l.e(PH_PREMIUM_PACKAGES, "PH_PREMIUM_PACKAGES");
            Object objH = bVar.h(PH_PREMIUM_PACKAGES);
            kotlin.jvm.internal.l.e(objH, "get(...)");
            boolean zQ = tVar.q(dVar, (String) objH);
            com.zipoapps.premiumhelper.c cVar = tVar.f43571c;
            if (arrayListY0.isEmpty() && !zQ) {
                z10 = false;
            }
            SharedPreferences.Editor editorEdit = cVar.f37004a.edit();
            editorEdit.putBoolean("has_active_purchase", z10);
            editorEdit.apply();
            Boolean boolValueOf = Boolean.valueOf(cVar.j());
            J j4 = tVar.f43575g;
            j4.getClass();
            j4.g(null, boolValueOf);
            C0575f.e(e10, U.f212b, null, new a(tVar, arrayListY0, null), 2);
            tVar.m().g("Purchases: " + arrayListY0, new Object[0]);
            return new E.c(arrayListY0);
        }
        l5 = (L) this.f43496l;
        e4 = (A9.E) this.f43498n;
        b9.n.b(obj);
        Collection collection2 = (Collection) obj;
        this.f43498n = e4;
        this.f43496l = collection2;
        this.f43497m = 2;
        Object objL = l5.l(this);
        if (objL != aVar) {
            collection = collection2;
            obj = objL;
            e10 = e4;
            arrayListY0 = C2097r.y0((Iterable) obj, collection);
            com.zipoapps.premiumhelper.d dVar2 = tVar.f43569a;
            l8.b bVar2 = tVar.f43570b;
            l8.d<String> PH_PREMIUM_PACKAGES2 = i8.d.f38532L;
            kotlin.jvm.internal.l.e(PH_PREMIUM_PACKAGES2, "PH_PREMIUM_PACKAGES");
            Object objH2 = bVar2.h(PH_PREMIUM_PACKAGES2);
            kotlin.jvm.internal.l.e(objH2, "get(...)");
            boolean zQ2 = tVar.q(dVar2, (String) objH2);
            com.zipoapps.premiumhelper.c cVar2 = tVar.f43571c;
            if (arrayListY0.isEmpty()) {
                z10 = false;
            }
            SharedPreferences.Editor editorEdit2 = cVar2.f37004a.edit();
            editorEdit2.putBoolean("has_active_purchase", z10);
            editorEdit2.apply();
            Boolean boolValueOf2 = Boolean.valueOf(cVar2.j());
            J j42 = tVar.f43575g;
            j42.getClass();
            j42.g(null, boolValueOf2);
            C0575f.e(e10, U.f212b, null, new a(tVar, arrayListY0, null), 2);
            tVar.m().g("Purchases: " + arrayListY0, new Object[0]);
            return new E.c(arrayListY0);
        }
        return aVar;
    }
}

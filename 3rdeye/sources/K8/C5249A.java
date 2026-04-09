package k8;

import A9.C0575f;
import A9.C0583j;
import A9.U;
import b9.C1992A;
import c9.C2099t;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import f9.InterfaceC4347e;
import g0.C4356c;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: Billing.kt */
/* renamed from: k8.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5249A implements PurchasesResponseListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0583j f43430a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f43431b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BillingClient f43432c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f43433d;

    /* compiled from: Billing.kt */
    @h9.e(c = "com.zipoapps.premiumhelper.billing.Billing$queryPurchases$2$1$1", f = "Billing.kt", l = {234}, m = "invokeSuspend")
    /* renamed from: k8.A$a */
    public static final class a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public t f43434l;

        /* renamed from: m, reason: collision with root package name */
        public BillingClient f43435m;

        /* renamed from: n, reason: collision with root package name */
        public String f43436n;

        /* renamed from: o, reason: collision with root package name */
        public Collection f43437o;

        /* renamed from: p, reason: collision with root package name */
        public Iterator f43438p;

        /* renamed from: q, reason: collision with root package name */
        public Purchase f43439q;

        /* renamed from: r, reason: collision with root package name */
        public int f43440r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ List<Purchase> f43441s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C0583j f43442t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ t f43443u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ BillingClient f43444v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f43445w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List list, C0583j c0583j, t tVar, BillingClient billingClient, String str, InterfaceC4347e interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f43441s = list;
            this.f43442t = c0583j;
            this.f43443u = tVar;
            this.f43444v = billingClient;
            this.f43445w = str;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new a(this.f43441s, this.f43442t, this.f43443u, this.f43444v, this.f43445w, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x004a A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:6:0x0019, B:19:0x007b, B:21:0x007f, B:14:0x0044, B:16:0x004a, B:25:0x00a4, B:27:0x00ac, B:24:0x00a0, B:22:0x008f, B:13:0x002b), top: B:34:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x007f A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:6:0x0019, B:19:0x007b, B:21:0x007f, B:14:0x0044, B:16:0x004a, B:25:0x00a4, B:27:0x00ac, B:24:0x00a0, B:22:0x008f, B:13:0x002b), top: B:34:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x008f A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:6:0x0019, B:19:0x007b, B:21:0x007f, B:14:0x0044, B:16:0x004a, B:25:0x00a4, B:27:0x00ac, B:24:0x00a0, B:22:0x008f, B:13:0x002b), top: B:34:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00a0 A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:6:0x0019, B:19:0x007b, B:21:0x007f, B:14:0x0044, B:16:0x004a, B:25:0x00a4, B:27:0x00ac, B:24:0x00a0, B:22:0x008f, B:13:0x002b), top: B:34:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00a4 A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:6:0x0019, B:19:0x007b, B:21:0x007f, B:14:0x0044, B:16:0x004a, B:25:0x00a4, B:27:0x00ac, B:24:0x00a0, B:22:0x008f, B:13:0x002b), top: B:34:0x0007 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0078 -> B:19:0x007b). Please report as a decompilation issue!!! */
        @Override // h9.AbstractC4424a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                g9.a r0 = g9.a.COROUTINE_SUSPENDED
                int r1 = r11.f43440r
                A9.j r2 = r11.f43442t
                r3 = 1
                if (r1 == 0) goto L28
                if (r1 != r3) goto L20
                com.android.billingclient.api.Purchase r1 = r11.f43439q
                java.util.Iterator r4 = r11.f43438p
                java.util.Collection r5 = r11.f43437o
                java.util.Collection r5 = (java.util.Collection) r5
                java.lang.String r6 = r11.f43436n
                com.android.billingclient.api.BillingClient r7 = r11.f43435m
                k8.t r8 = r11.f43434l
                b9.n.b(r12)     // Catch: java.lang.Exception -> L1d
                goto L7b
            L1d:
                r12 = move-exception
                goto Lb0
            L20:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L28:
                b9.n.b(r12)
                java.util.List<com.android.billingclient.api.Purchase> r12 = r11.f43441s     // Catch: java.lang.Exception -> L1d
                java.lang.Iterable r12 = (java.lang.Iterable) r12     // Catch: java.lang.Exception -> L1d
                k8.t r1 = r11.f43443u     // Catch: java.lang.Exception -> L1d
                com.android.billingclient.api.BillingClient r4 = r11.f43444v     // Catch: java.lang.Exception -> L1d
                java.lang.String r5 = r11.f43445w     // Catch: java.lang.Exception -> L1d
                java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Exception -> L1d
                r6.<init>()     // Catch: java.lang.Exception -> L1d
                java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Exception -> L1d
                r7 = r6
                r6 = r5
                r5 = r7
                r8 = r1
                r7 = r4
                r4 = r12
            L44:
                boolean r12 = r4.hasNext()     // Catch: java.lang.Exception -> L1d
                if (r12 == 0) goto La4
                java.lang.Object r12 = r4.next()     // Catch: java.lang.Exception -> L1d
                r1 = r12
                com.android.billingclient.api.Purchase r1 = (com.android.billingclient.api.Purchase) r1     // Catch: java.lang.Exception -> L1d
                java.util.List r12 = r1.getProducts()     // Catch: java.lang.Exception -> L1d
                r9 = 0
                java.lang.Object r12 = r12.get(r9)     // Catch: java.lang.Exception -> L1d
                java.lang.String r9 = "get(...)"
                kotlin.jvm.internal.l.e(r12, r9)     // Catch: java.lang.Exception -> L1d
                java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Exception -> L1d
                r11.f43434l = r8     // Catch: java.lang.Exception -> L1d
                r11.f43435m = r7     // Catch: java.lang.Exception -> L1d
                r11.f43436n = r6     // Catch: java.lang.Exception -> L1d
                r9 = r5
                java.util.Collection r9 = (java.util.Collection) r9     // Catch: java.lang.Exception -> L1d
                r11.f43437o = r9     // Catch: java.lang.Exception -> L1d
                r11.f43438p = r4     // Catch: java.lang.Exception -> L1d
                r11.f43439q = r1     // Catch: java.lang.Exception -> L1d
                r11.f43440r = r3     // Catch: java.lang.Exception -> L1d
                w9.i<java.lang.Object>[] r9 = k8.t.f43568n     // Catch: java.lang.Exception -> L1d
                java.lang.Object r12 = r8.t(r7, r12, r6, r11)     // Catch: java.lang.Exception -> L1d
                if (r12 != r0) goto L7b
                return r0
            L7b:
                com.android.billingclient.api.ProductDetails r12 = (com.android.billingclient.api.ProductDetails) r12     // Catch: java.lang.Exception -> L1d
                if (r12 != 0) goto L8f
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L1d
                java.lang.String r1 = "Failed to get Product Details, productDetails = null."
                r12.<init>(r1)     // Catch: java.lang.Exception -> L1d
                K4.e r1 = K4.e.a()     // Catch: java.lang.Exception -> L1d
                r1.b(r12)     // Catch: java.lang.Exception -> L1d
                r12 = 0
                goto L9e
            L8f:
                k8.a r9 = new k8.a     // Catch: java.lang.Exception -> L1d
                kotlin.jvm.internal.l.c(r1)     // Catch: java.lang.Exception -> L1d
                w9.i<java.lang.Object>[] r10 = k8.t.f43568n     // Catch: java.lang.Exception -> L1d
                k8.I r10 = r8.o(r1, r12)     // Catch: java.lang.Exception -> L1d
                r9.<init>(r1, r12, r10)     // Catch: java.lang.Exception -> L1d
                r12 = r9
            L9e:
                if (r12 == 0) goto L44
                r5.add(r12)     // Catch: java.lang.Exception -> L1d
                goto L44
            La4:
                java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Exception -> L1d
                boolean r12 = r2.isActive()     // Catch: java.lang.Exception -> L1d
                if (r12 == 0) goto Lc2
                r2.resumeWith(r5)     // Catch: java.lang.Exception -> L1d
                goto Lc2
            Lb0:
                K4.e r0 = K4.e.a()
                r0.b(r12)
                boolean r12 = r2.isActive()
                if (r12 == 0) goto Lc2
                c9.t r12 = c9.C2099t.f18581b
                r2.resumeWith(r12)
            Lc2:
                b9.A r12 = b9.C1992A.f18074a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: k8.C5249A.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C5249A(C0583j c0583j, t tVar, BillingClient billingClient, String str) {
        this.f43430a = c0583j;
        this.f43431b = tVar;
        this.f43432c = billingClient;
        this.f43433d = str;
    }

    @Override // com.android.billingclient.api.PurchasesResponseListener
    public final void onQueryPurchasesResponse(BillingResult billingResult, List<Purchase> purchaseList) {
        kotlin.jvm.internal.l.f(billingResult, "billingResult");
        kotlin.jvm.internal.l.f(purchaseList, "purchaseList");
        int responseCode = billingResult.getResponseCode();
        C0583j c0583j = this.f43430a;
        if (responseCode == 0) {
            C0575f.e(A9.F.a(U.f211a), null, null, new a(purchaseList, c0583j, this.f43431b, this.f43432c, this.f43433d, null), 3);
            return;
        }
        K4.e.a().b(new IllegalStateException(C4356c.h(billingResult.getResponseCode(), "Failed to query purchases: ")));
        if (c0583j.isActive()) {
            c0583j.resumeWith(C2099t.f18581b);
        }
    }
}

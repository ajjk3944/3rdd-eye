package k8;

import A9.C0575f;
import A9.C0580h0;
import A9.C0583j;
import A9.U;
import D9.J;
import F9.C0663f;
import android.app.Activity;
import android.app.Application;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.d;
import b9.C1992A;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryPurchasesParams;
import com.google.gson.Gson;
import com.zipoapps.premiumhelper.billing.ActivePurchaseInfo;
import com.zipoapps.premiumhelper.e;
import com.zipoapps.premiumhelper.toto.TotoOffer;
import f9.InterfaceC4347e;
import i8.C4461a;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j8.C5201c;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import k8.G;

/* compiled from: Billing.kt */
/* loaded from: classes3.dex */
public final class t implements PurchasesUpdatedListener {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ w9.i<Object>[] f43568n;

    /* renamed from: a, reason: collision with root package name */
    public final com.zipoapps.premiumhelper.d f43569a;

    /* renamed from: b, reason: collision with root package name */
    public final l8.b f43570b;

    /* renamed from: c, reason: collision with root package name */
    public final com.zipoapps.premiumhelper.c f43571c;

    /* renamed from: d, reason: collision with root package name */
    public final C4461a f43572d;

    /* renamed from: e, reason: collision with root package name */
    public final r8.d f43573e = new r8.d("PremiumHelper");

    /* renamed from: f, reason: collision with root package name */
    public final E f43574f;

    /* renamed from: g, reason: collision with root package name */
    public final J f43575g;

    /* renamed from: h, reason: collision with root package name */
    public final D9.A f43576h;
    public final D9.C i;

    /* renamed from: j, reason: collision with root package name */
    public final D9.z f43577j;

    /* renamed from: k, reason: collision with root package name */
    public final Hashtable<String, G> f43578k;

    /* renamed from: l, reason: collision with root package name */
    public TotoOffer f43579l;

    /* renamed from: m, reason: collision with root package name */
    public G.c f43580m;

    /* compiled from: Billing.kt */
    @h9.e(c = "com.zipoapps.premiumhelper.billing.Billing$onPurchasesUpdated$1", f = "Billing.kt", l = {689, 695, 698, 700}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public List f43581l;

        /* renamed from: m, reason: collision with root package name */
        public int f43582m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ BillingResult f43583n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ List<Purchase> f43584o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ t f43585p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BillingResult billingResult, List<Purchase> list, t tVar, InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f43583n = billingResult;
            this.f43584o = list;
            this.f43585p = tVar;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new a(this.f43583n, this.f43584o, this.f43585p, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
        
            if (r8.emit(r10, r9) == r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
        
            if (r8.emit(r10, r9) == r0) goto L34;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
        @Override // h9.AbstractC4424a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws android.content.pm.PackageManager.NameNotFoundException {
            /*
                r9 = this;
                g9.a r0 = g9.a.COROUTINE_SUSPENDED
                int r1 = r9.f43582m
                com.android.billingclient.api.BillingResult r2 = r9.f43583n
                k8.t r3 = r9.f43585p
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                D9.C r8 = r3.i
                if (r1 == 0) goto L32
                if (r1 == r7) goto L2e
                if (r1 == r6) goto L26
                if (r1 == r5) goto L21
                if (r1 != r4) goto L19
                goto L21
            L19:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L21:
                b9.n.b(r10)
                goto La4
            L26:
                java.util.List r1 = r9.f43581l
                java.util.List r1 = (java.util.List) r1
                b9.n.b(r10)
                goto L85
            L2e:
                b9.n.b(r10)
                goto L52
            L32:
                b9.n.b(r10)
                int r10 = r2.getResponseCode()
                if (r10 != 0) goto L96
                java.util.List<com.android.billingclient.api.Purchase> r10 = r9.f43584o
                r1 = r10
                java.util.Collection r1 = (java.util.Collection) r1
                if (r1 == 0) goto L96
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L49
                goto L96
            L49:
                r9.f43582m = r7
                java.lang.Object r10 = k8.t.a(r3, r10, r9)
                if (r10 != r0) goto L52
                goto La3
            L52:
                r1 = r10
                java.util.List r1 = (java.util.List) r1
                com.zipoapps.premiumhelper.toto.TotoOffer r10 = r3.f43579l
                java.lang.String r10 = r10.getValue()
                k8.t.f(r3, r1, r10)
                r10 = r1
                java.util.Collection r10 = (java.util.Collection) r10
                boolean r10 = r10.isEmpty()
                if (r10 != 0) goto L85
                com.zipoapps.premiumhelper.e$a r10 = com.zipoapps.premiumhelper.e.f37006D
                r10.getClass()
                com.zipoapps.premiumhelper.e r10 = com.zipoapps.premiumhelper.e.a.a()
                com.zipoapps.premiumhelper.toto.TotoManager r10 = r10.f37033w
                r10.scheduleRegister(r7)
                com.zipoapps.premiumhelper.d r10 = r3.f43569a
                r3 = r1
                java.util.List r3 = (java.util.List) r3
                r9.f43581l = r3
                r9.f43582m = r6
                java.lang.Object r10 = com.zipoapps.premiumhelper.AcknowledgePurchaseWorker.a.a(r10, r9)
                if (r10 != r0) goto L85
                goto La3
            L85:
                k8.H r10 = new k8.H
                r10.<init>(r2, r1)
                r1 = 0
                r9.f43581l = r1
                r9.f43582m = r5
                java.lang.Object r10 = r8.emit(r10, r9)
                if (r10 != r0) goto La4
                goto La3
            L96:
                k8.H r10 = new k8.H
                r10.<init>(r2)
                r9.f43582m = r4
                java.lang.Object r10 = r8.emit(r10, r9)
                if (r10 != r0) goto La4
            La3:
                return r0
            La4:
                b9.A r10 = b9.C1992A.f18074a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: k8.t.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: Billing.kt */
    @h9.e(c = "com.zipoapps.premiumhelper.billing.Billing$updateOfferCache$1", f = "Billing.kt", l = {450}, m = "invokeSuspend")
    public static final class b extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f43586l;

        /* compiled from: Billing.kt */
        @h9.e(c = "com.zipoapps.premiumhelper.billing.Billing$updateOfferCache$1$1", f = "Billing.kt", l = {}, m = "invokeSuspend")
        public static final class a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

            /* renamed from: l, reason: collision with root package name */
            public /* synthetic */ Object f43588l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ t f43589m;

            /* compiled from: Billing.kt */
            @h9.e(c = "com.zipoapps.premiumhelper.billing.Billing$updateOfferCache$1$1$1", f = "Billing.kt", l = {454, 464}, m = "invokeSuspend")
            /* renamed from: k8.t$b$a$a, reason: collision with other inner class name */
            public static final class C0484a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

                /* renamed from: l, reason: collision with root package name */
                public t f43590l;

                /* renamed from: m, reason: collision with root package name */
                public BillingClient f43591m;

                /* renamed from: n, reason: collision with root package name */
                public Iterable f43592n;

                /* renamed from: o, reason: collision with root package name */
                public Iterator f43593o;

                /* renamed from: p, reason: collision with root package name */
                public l8.d f43594p;

                /* renamed from: q, reason: collision with root package name */
                public String f43595q;

                /* renamed from: r, reason: collision with root package name */
                public int f43596r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ t f43597s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0484a(t tVar, InterfaceC4347e<? super C0484a> interfaceC4347e) {
                    super(2, interfaceC4347e);
                    this.f43597s = tVar;
                }

                @Override // h9.AbstractC4424a
                public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
                    return new C0484a(this.f43597s, interfaceC4347e);
                }

                @Override // p9.p
                public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
                    return ((C0484a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:32:0x00bc, code lost:
                
                    if (r15 == r3) goto L33;
                 */
                /* JADX WARN: Removed duplicated region for block: B:28:0x0089 A[Catch: Exception -> 0x0031, TRY_LEAVE, TryCatch #1 {Exception -> 0x0031, blocks: (B:26:0x0083, B:28:0x0089, B:44:0x014e, B:46:0x015b, B:39:0x011a, B:41:0x0145, B:43:0x0149, B:13:0x002d, B:25:0x0064, B:18:0x0037, B:20:0x0044, B:22:0x0059, B:21:0x004b, B:7:0x001d, B:34:0x00bf, B:36:0x00c3, B:29:0x0090, B:31:0x00a5, B:37:0x00fc), top: B:53:0x0009, inners: #0 }] */
                /* JADX WARN: Removed duplicated region for block: B:46:0x015b A[Catch: Exception -> 0x0031, TRY_LEAVE, TryCatch #1 {Exception -> 0x0031, blocks: (B:26:0x0083, B:28:0x0089, B:44:0x014e, B:46:0x015b, B:39:0x011a, B:41:0x0145, B:43:0x0149, B:13:0x002d, B:25:0x0064, B:18:0x0037, B:20:0x0044, B:22:0x0059, B:21:0x004b, B:7:0x001d, B:34:0x00bf, B:36:0x00c3, B:29:0x0090, B:31:0x00a5, B:37:0x00fc), top: B:53:0x0009, inners: #0 }] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00bc -> B:34:0x00bf). Please report as a decompilation issue!!! */
                @Override // h9.AbstractC4424a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                    /*
                        Method dump skipped, instructions count: 370
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: k8.t.b.a.C0484a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(t tVar, InterfaceC4347e<? super a> interfaceC4347e) {
                super(2, interfaceC4347e);
                this.f43589m = tVar;
            }

            @Override // h9.AbstractC4424a
            public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
                a aVar = new a(this.f43589m, interfaceC4347e);
                aVar.f43588l = obj;
                return aVar;
            }

            @Override // p9.p
            public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
                return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
            }

            @Override // h9.AbstractC4424a
            public final Object invokeSuspend(Object obj) {
                g9.a aVar = g9.a.COROUTINE_SUSPENDED;
                b9.n.b(obj);
                C0575f.e((A9.E) this.f43588l, U.f211a, null, new C0484a(this.f43589m, null), 2);
                return C1992A.f18074a;
            }
        }

        public b(InterfaceC4347e<? super b> interfaceC4347e) {
            super(2, interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return t.this.new b(interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((b) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f43586l;
            if (i == 0) {
                b9.n.b(obj);
                a aVar2 = new a(t.this, null);
                this.f43586l = 1;
                if (A9.F.c(aVar2, this) == aVar) {
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

    static {
        kotlin.jvm.internal.q qVar = new kotlin.jvm.internal.q(t.class, "log", "getLog()Lcom/zipoapps/premiumhelper/log/TimberLogger;", 0);
        kotlin.jvm.internal.x.f43661a.getClass();
        f43568n = new w9.i[]{qVar};
    }

    public t(C0663f c0663f, com.zipoapps.premiumhelper.d dVar, l8.b bVar, com.zipoapps.premiumhelper.c cVar, C5201c c5201c, C4461a c4461a) {
        this.f43569a = dVar;
        this.f43570b = bVar;
        this.f43571c = cVar;
        this.f43572d = c4461a;
        this.f43574f = new E(dVar, this);
        J jC = D9.E.c(Boolean.valueOf(cVar.j()));
        this.f43575g = jC;
        this.f43576h = D9.H.a(jC);
        D9.C cA = D9.E.a((7 & 1) != 0 ? 0 : 1, C9.a.SUSPEND);
        this.i = cA;
        this.f43577j = new D9.z(cA);
        this.f43578k = new Hashtable<>();
        this.f43579l = TotoOffer.Onboarding;
        C0575f.e(c0663f, null, null, new s(this, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        if (r13 == r1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b2, code lost:
    
        if (r13 == r1) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b2 -> B:31:0x00b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0121 -> B:47:0x0122). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(k8.t r11, java.util.List r12, h9.c r13) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.t.a(k8.t, java.util.List, h9.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(k8.t r4, com.android.billingclient.api.BillingClient r5, java.lang.String r6, h9.c r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof k8.o
            if (r0 == 0) goto L16
            r0 = r7
            k8.o r0 = (k8.o) r0
            int r1 = r0.f43549n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f43549n = r1
            goto L1b
        L16:
            k8.o r0 = new k8.o
            r0.<init>(r4, r7)
        L1b:
            java.lang.Object r7 = r0.f43547l
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f43549n
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            b9.n.b(r7)
            goto L3e
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            b9.n.b(r7)
            r0.f43549n = r3
            java.lang.Object r7 = r4.v(r5, r6, r0)
            if (r7 != r1) goto L3e
            return r1
        L3e:
            java.util.Collection r7 = (java.util.Collection) r7
            if (r7 == 0) goto L4b
            boolean r4 = r7.isEmpty()
            if (r4 == 0) goto L49
            goto L4b
        L49:
            r4 = 0
            goto L4c
        L4b:
            r4 = r3
        L4c:
            r4 = r4 ^ r3
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.t.b(k8.t, com.android.billingclient.api.BillingClient, java.lang.String, h9.c):java.lang.Object");
    }

    public static final void c(final t tVar, Activity activity, final G.a aVar) {
        tVar.getClass();
        d.a aVar2 = new d.a(activity);
        AlertController.b bVar = aVar2.f14344a;
        bVar.f14317d = "Purchase debug offer?";
        bVar.f14319f = "You are trying to purchase a DEBUG offer. This purchase is for testing only, Google Play is not updated.";
        bVar.i = "Cancel";
        bVar.f14322j = null;
        aVar2.b("Test Purchase", new DialogInterface.OnClickListener() { // from class: k8.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C0575f.e(C0580h0.f248b, null, null, new q(this.f43464b, aVar, null), 3);
            }
        });
        aVar2.a().show();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(k8.t r6, android.app.Activity r7, k8.G.c r8, h9.c r9) {
        /*
            r6.getClass()
            boolean r0 = r9 instanceof k8.r
            if (r0 == 0) goto L16
            r0 = r9
            k8.r r0 = (k8.r) r0
            int r1 = r0.f43564r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f43564r = r1
            goto L1b
        L16:
            k8.r r0 = new k8.r
            r0.<init>(r6, r9)
        L1b:
            java.lang.Object r9 = r0.f43562p
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f43564r
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            com.android.billingclient.api.ProductDetails r6 = r0.f43561o
            k8.G$c r8 = r0.f43560n
            android.app.Activity r7 = r0.f43559m
            k8.t r0 = r0.f43558l
            b9.n.b(r9)
            goto L56
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            b9.n.b(r9)
            com.android.billingclient.api.ProductDetails r9 = r8.f43458d
            r0.f43558l = r6
            r0.f43559m = r7
            r0.f43560n = r8
            r0.f43561o = r9
            r0.f43564r = r3
            k8.E r2 = r6.f43574f
            java.lang.Object r0 = r2.a(r0)
            if (r0 != r1) goto L52
            return r1
        L52:
            r5 = r0
            r0 = r6
            r6 = r9
            r9 = r5
        L56:
            com.android.billingclient.api.BillingClient r9 = (com.android.billingclient.api.BillingClient) r9
            java.util.List r1 = r6.getSubscriptionOfferDetails()
            r2 = 0
            if (r1 == 0) goto L6c
            java.lang.Object r1 = r1.get(r2)
            com.android.billingclient.api.ProductDetails$SubscriptionOfferDetails r1 = (com.android.billingclient.api.ProductDetails.SubscriptionOfferDetails) r1
            if (r1 == 0) goto L6c
            java.lang.String r1 = r1.getOfferToken()
            goto L6d
        L6c:
            r1 = 0
        L6d:
            com.android.billingclient.api.BillingFlowParams$ProductDetailsParams$Builder r3 = com.android.billingclient.api.BillingFlowParams.ProductDetailsParams.newBuilder()
            com.android.billingclient.api.BillingFlowParams$ProductDetailsParams$Builder r6 = r3.setProductDetails(r6)
            java.lang.String r3 = "setProductDetails(...)"
            kotlin.jvm.internal.l.e(r6, r3)
            if (r1 == 0) goto L89
            java.lang.String r3 = r8.f43457c
            java.lang.String r4 = "inapp"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L89
            r6.setOfferToken(r1)
        L89:
            com.android.billingclient.api.BillingFlowParams$ProductDetailsParams r6 = r6.build()
            java.util.List r6 = E.u.G(r6)
            com.android.billingclient.api.BillingFlowParams$Builder r1 = com.android.billingclient.api.BillingFlowParams.newBuilder()
            com.android.billingclient.api.BillingFlowParams$Builder r6 = r1.setProductDetailsParamsList(r6)
            com.android.billingclient.api.BillingFlowParams r6 = r6.build()
            java.lang.String r1 = "build(...)"
            kotlin.jvm.internal.l.e(r6, r1)
            r8.c r1 = r0.m()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Launching billing flow for offer: "
            r3.<init>(r4)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1.g(r3, r2)
            r0.f43580m = r8
            r9.launchBillingFlow(r7, r6)
            b9.A r6 = b9.C1992A.f18074a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.t.d(k8.t, android.app.Activity, k8.G$c, h9.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(k8.t r5, java.lang.String r6, h9.c r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof k8.v
            if (r0 == 0) goto L16
            r0 = r7
            k8.v r0 = (k8.v) r0
            int r1 = r0.f43612p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f43612p = r1
            goto L1b
        L16:
            k8.v r0 = new k8.v
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.f43610n
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f43612p
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.f43608l
            java.lang.String r5 = (java.lang.String) r5
            b9.n.b(r7)
            goto L66
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            java.lang.String r6 = r0.f43609m
            java.lang.Object r5 = r0.f43608l
            k8.t r5 = (k8.t) r5
            b9.n.b(r7)
            goto L55
        L43:
            b9.n.b(r7)
            r0.f43608l = r5
            r0.f43609m = r6
            r0.f43612p = r4
            k8.E r7 = r5.f43574f
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L55
            goto L64
        L55:
            com.android.billingclient.api.BillingClient r7 = (com.android.billingclient.api.BillingClient) r7
            r0.f43608l = r6
            r2 = 0
            r0.f43609m = r2
            r0.f43612p = r3
            java.lang.Object r7 = r5.s(r7, r6, r0)
            if (r7 != r1) goto L65
        L64:
            return r1
        L65:
            r5 = r6
        L66:
            com.android.billingclient.api.ProductDetails r7 = (com.android.billingclient.api.ProductDetails) r7
            if (r7 != 0) goto L70
            k8.G$b r6 = new k8.G$b
            r6.<init>(r5)
            return r6
        L70:
            k8.G$c r5 = new k8.G$c
            java.lang.String r6 = r7.getProductId()
            java.lang.String r0 = "getProductId(...)"
            kotlin.jvm.internal.l.e(r6, r0)
            java.lang.String r0 = r7.getProductType()
            java.lang.String r1 = "getProductType(...)"
            kotlin.jvm.internal.l.e(r0, r1)
            r5.<init>(r6, r0, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.t.e(k8.t, java.lang.String, h9.c):java.lang.Object");
    }

    public static final void f(t tVar, List list, String str) {
        tVar.getClass();
        boolean zIsEmpty = list.isEmpty();
        com.zipoapps.premiumhelper.c cVar = tVar.f43571c;
        if (zIsEmpty) {
            SharedPreferences.Editor editorEdit = cVar.f37004a.edit();
            editorEdit.putString("active_purchase_info", "");
            editorEdit.apply();
            return;
        }
        C5251a c5251a = (C5251a) list.get(0);
        String str2 = c5251a.f43461a.getSkus().get(0);
        kotlin.jvm.internal.l.e(str2, "get(...)");
        String str3 = str2;
        Purchase purchase = c5251a.f43461a;
        String purchaseToken = purchase.getPurchaseToken();
        kotlin.jvm.internal.l.e(purchaseToken, "getPurchaseToken(...)");
        ActivePurchaseInfo activePurchaseInfo = new ActivePurchaseInfo(str3, purchaseToken, purchase.getPurchaseTime(), c5251a.f43463c, str);
        cVar.getClass();
        SharedPreferences.Editor editorEdit2 = cVar.f37004a.edit();
        editorEdit2.putString("active_purchase_info", new Gson().g(activePurchaseInfo));
        editorEdit2.apply();
    }

    public static Purchase i(com.zipoapps.premiumhelper.d dVar, String sku) {
        kotlin.jvm.internal.l.f(sku, "sku");
        return new Purchase("{\n\"orderId\":\"DEBUG.OFFER." + UUID.randomUUID() + "\",\n\"packageName\":\"" + dVar.getPackageName() + "\",\n\"productId\":\"" + sku + "\",\n\"purchaseTime\":" + System.currentTimeMillis() + ",\n\"purchaseState\":0,\n\"purchaseToken\":\"debugtoken." + UUID.randomUUID() + "\",\n\"obfuscatedAccountId\":\"debugaccount." + UUID.randomUUID() + "\",\n\"acknowledged\":true,\n\"autoRenewing\":true\n}", UUID.randomUUID().toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
    
        if (r8.isEmpty() != false) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac A[Catch: Exception -> 0x003c, TryCatch #1 {Exception -> 0x003c, blocks: (B:14:0x0037, B:47:0x00de, B:49:0x00e4, B:52:0x0109, B:21:0x004d, B:39:0x0096, B:40:0x009b, B:41:0x00a6, B:43:0x00ac, B:45:0x00bb, B:46:0x00bf, B:24:0x0057, B:31:0x0070, B:33:0x0077, B:35:0x007d), top: B:62:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e4 A[Catch: Exception -> 0x003c, TryCatch #1 {Exception -> 0x003c, blocks: (B:14:0x0037, B:47:0x00de, B:49:0x00e4, B:52:0x0109, B:21:0x004d, B:39:0x0096, B:40:0x009b, B:41:0x00a6, B:43:0x00ac, B:45:0x00bb, B:46:0x00bf, B:24:0x0057, B:31:0x0070, B:33:0x0077, B:35:0x007d), top: B:62:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v8, types: [k8.t] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(h9.c r11) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.t.g(h9.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(com.android.billingclient.api.BillingClient r5, java.lang.String r6, h9.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof k8.C5254d
            if (r0 == 0) goto L13
            r0 = r7
            k8.d r0 = (k8.C5254d) r0
            int r1 = r0.f43476o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f43476o = r1
            goto L18
        L13:
            k8.d r0 = new k8.d
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f43474m
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f43476o
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            k8.t r5 = r0.f43473l
            b9.n.b(r7)
            goto L51
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            b9.n.b(r7)
            com.android.billingclient.api.AcknowledgePurchaseParams$Builder r7 = com.android.billingclient.api.AcknowledgePurchaseParams.newBuilder()
            com.android.billingclient.api.AcknowledgePurchaseParams$Builder r6 = r7.setPurchaseToken(r6)
            com.android.billingclient.api.AcknowledgePurchaseParams r6 = r6.build()
            java.lang.String r7 = "build(...)"
            kotlin.jvm.internal.l.e(r6, r7)
            r0.f43473l = r4
            r0.f43476o = r3
            java.lang.Object r7 = com.android.billingclient.api.BillingClientKotlinKt.acknowledgePurchase(r5, r6, r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            r5 = r4
        L51:
            r6 = r7
            com.android.billingclient.api.BillingResult r6 = (com.android.billingclient.api.BillingResult) r6
            r8.c r5 = r5.m()
            boolean r6 = k8.F.i(r6)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Purchase acknowledged: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r5.g(r6, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.t.h(com.android.billingclient.api.BillingClient, java.lang.String, h9.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(h9.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof k8.C5255e
            if (r0 == 0) goto L13
            r0 = r9
            k8.e r0 = (k8.C5255e) r0
            int r1 = r0.f43482q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f43482q = r1
            goto L18
        L13:
            k8.e r0 = new k8.e
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f43480o
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f43482q
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L48
            if (r2 == r5) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            int r0 = r0.f43479n
            b9.n.b(r9)     // Catch: java.lang.Exception -> L2f
            goto L89
        L2f:
            r9 = move-exception
            goto L9b
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3a:
            com.android.billingclient.api.BillingClient r2 = r0.f43478m
            k8.t r4 = r0.f43477l
            b9.n.b(r9)     // Catch: java.lang.Exception -> L2f
            goto L6e
        L42:
            k8.t r2 = r0.f43477l
            b9.n.b(r9)     // Catch: java.lang.Exception -> L2f
            goto L59
        L48:
            b9.n.b(r9)
            k8.E r9 = r8.f43574f     // Catch: java.lang.Exception -> L2f
            r0.f43477l = r8     // Catch: java.lang.Exception -> L2f
            r0.f43482q = r5     // Catch: java.lang.Exception -> L2f
            java.lang.Object r9 = r9.a(r0)     // Catch: java.lang.Exception -> L2f
            if (r9 != r1) goto L58
            goto L85
        L58:
            r2 = r8
        L59:
            com.android.billingclient.api.BillingClient r9 = (com.android.billingclient.api.BillingClient) r9     // Catch: java.lang.Exception -> L2f
            java.lang.String r5 = "inapp"
            r0.f43477l = r2     // Catch: java.lang.Exception -> L2f
            r0.f43478m = r9     // Catch: java.lang.Exception -> L2f
            r0.f43482q = r4     // Catch: java.lang.Exception -> L2f
            java.lang.Object r4 = r2.k(r9, r5, r0)     // Catch: java.lang.Exception -> L2f
            if (r4 != r1) goto L6a
            goto L85
        L6a:
            r7 = r2
            r2 = r9
            r9 = r4
            r4 = r7
        L6e:
            java.lang.Number r9 = (java.lang.Number) r9     // Catch: java.lang.Exception -> L2f
            int r9 = r9.intValue()     // Catch: java.lang.Exception -> L2f
            java.lang.String r5 = "subs"
            r6 = 0
            r0.f43477l = r6     // Catch: java.lang.Exception -> L2f
            r0.f43478m = r6     // Catch: java.lang.Exception -> L2f
            r0.f43479n = r9     // Catch: java.lang.Exception -> L2f
            r0.f43482q = r3     // Catch: java.lang.Exception -> L2f
            java.lang.Object r0 = r4.k(r2, r5, r0)     // Catch: java.lang.Exception -> L2f
            if (r0 != r1) goto L86
        L85:
            return r1
        L86:
            r7 = r0
            r0 = r9
            r9 = r7
        L89:
            java.lang.Number r9 = (java.lang.Number) r9     // Catch: java.lang.Exception -> L2f
            int r9 = r9.intValue()     // Catch: java.lang.Exception -> L2f
            int r0 = r0 + r9
            J8.E$c r9 = new J8.E$c     // Catch: java.lang.Exception -> L2f
            java.lang.Integer r1 = new java.lang.Integer     // Catch: java.lang.Exception -> L2f
            r1.<init>(r0)     // Catch: java.lang.Exception -> L2f
            r9.<init>(r1)     // Catch: java.lang.Exception -> L2f
            return r9
        L9b:
            J8.E$b r0 = new J8.E$b
            r0.<init>(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.t.j(h9.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a4, code lost:
    
        if (r13 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00a4 -> B:26:0x00a7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(com.android.billingclient.api.BillingClient r11, java.lang.String r12, h9.c r13) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.t.k(com.android.billingclient.api.BillingClient, java.lang.String, h9.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ae, code lost:
    
        if (r10 == r2) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(h9.c r10) {
        /*
            r9 = this;
            java.lang.String r0 = "Purchases: "
            boolean r1 = r10 instanceof k8.C5257g
            if (r1 == 0) goto L15
            r1 = r10
            k8.g r1 = (k8.C5257g) r1
            int r2 = r1.f43495o
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f43495o = r2
            goto L1a
        L15:
            k8.g r1 = new k8.g
            r1.<init>(r9, r10)
        L1a:
            java.lang.Object r10 = r1.f43493m
            g9.a r2 = g9.a.COROUTINE_SUSPENDED
            int r3 = r1.f43495o
            r4 = 1
            r5 = 2
            r6 = 0
            if (r3 == 0) goto L3f
            if (r3 == r4) goto L39
            if (r3 != r5) goto L31
            b9.n.b(r10)     // Catch: java.lang.Exception -> L2e
            goto Lb1
        L2e:
            r10 = move-exception
            goto Lb4
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L39:
            k8.t r0 = r1.f43492l
            b9.n.b(r10)     // Catch: java.lang.Exception -> L2e
            goto L9f
        L3f:
            b9.n.b(r10)
            l8.b r10 = r9.f43570b     // Catch: java.lang.Exception -> L2e
            com.zipoapps.premiumhelper.configuration.appconfig.PremiumHelperConfiguration r10 = r10.f43910b     // Catch: java.lang.Exception -> L2e
            boolean r10 = r10.isDebugMode()     // Catch: java.lang.Exception -> L2e
            if (r10 == 0) goto L91
            com.zipoapps.premiumhelper.c r10 = r9.f43571c     // Catch: java.lang.Exception -> L2e
            com.zipoapps.premiumhelper.billing.ActivePurchaseInfo r10 = r10.h()     // Catch: java.lang.Exception -> L2e
            if (r10 == 0) goto L91
            java.lang.String r3 = r10.getPurchaseToken()     // Catch: java.lang.Exception -> L2e
            java.lang.String r7 = "debugtoken"
            r8 = 0
            boolean r3 = y9.n.a0(r3, r7, r8)     // Catch: java.lang.Exception -> L2e
            if (r3 == 0) goto L91
            k8.a r1 = new k8.a     // Catch: java.lang.Exception -> L2e
            com.zipoapps.premiumhelper.d r2 = r9.f43569a     // Catch: java.lang.Exception -> L2e
            java.lang.String r10 = r10.getSku()     // Catch: java.lang.Exception -> L2e
            com.android.billingclient.api.Purchase r10 = i(r2, r10)     // Catch: java.lang.Exception -> L2e
            k8.I r2 = k8.I.PAID     // Catch: java.lang.Exception -> L2e
            r1.<init>(r10, r6, r2)     // Catch: java.lang.Exception -> L2e
            java.util.List r10 = E.u.G(r1)     // Catch: java.lang.Exception -> L2e
            r8.c r1 = r9.m()     // Catch: java.lang.Exception -> L2e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2e
            r2.<init>(r0)     // Catch: java.lang.Exception -> L2e
            r2.append(r10)     // Catch: java.lang.Exception -> L2e
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> L2e
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch: java.lang.Exception -> L2e
            r1.g(r0, r2)     // Catch: java.lang.Exception -> L2e
            J8.E$c r0 = new J8.E$c     // Catch: java.lang.Exception -> L2e
            r0.<init>(r10)     // Catch: java.lang.Exception -> L2e
            return r0
        L91:
            k8.E r10 = r9.f43574f     // Catch: java.lang.Exception -> L2e
            r1.f43492l = r9     // Catch: java.lang.Exception -> L2e
            r1.f43495o = r4     // Catch: java.lang.Exception -> L2e
            java.lang.Object r10 = r10.a(r1)     // Catch: java.lang.Exception -> L2e
            if (r10 != r2) goto L9e
            goto Lb0
        L9e:
            r0 = r9
        L9f:
            com.android.billingclient.api.BillingClient r10 = (com.android.billingclient.api.BillingClient) r10     // Catch: java.lang.Exception -> L2e
            k8.h r3 = new k8.h     // Catch: java.lang.Exception -> L2e
            r3.<init>(r0, r10, r6)     // Catch: java.lang.Exception -> L2e
            r1.f43492l = r6     // Catch: java.lang.Exception -> L2e
            r1.f43495o = r5     // Catch: java.lang.Exception -> L2e
            java.lang.Object r10 = A9.F.c(r3, r1)     // Catch: java.lang.Exception -> L2e
            if (r10 != r2) goto Lb1
        Lb0:
            return r2
        Lb1:
            J8.E$c r10 = (J8.E.c) r10     // Catch: java.lang.Exception -> L2e
            return r10
        Lb4:
            J8.E$b r0 = new J8.E$b
            r0.<init>(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.t.l(h9.c):java.lang.Object");
    }

    public final r8.c m() {
        return this.f43573e.a(this, f43568n[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00df, code lost:
    
        if (A9.O.a(500, r0) == r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00df -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(l8.d r11, h9.c r12) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.t.n(l8.d, h9.c):java.lang.Object");
    }

    public final I o(Purchase purchase, ProductDetails productDetails) {
        return productDetails != null ? kotlin.jvm.internal.l.b(productDetails.getProductType(), "inapp") ? I.PAID : !purchase.isAutoRenewing() ? r(purchase, productDetails) ? I.SUBSCRIPTION_CANCELLED : I.TRIAL_CANCELLED : r(purchase, productDetails) ? I.PAID : I.TRIAL : I.UNKNOWN;
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public final void onPurchasesUpdated(BillingResult result, List<Purchase> list) {
        kotlin.jvm.internal.l.f(result, "result");
        m().g("onPurchaseUpdated: " + list + " Result: " + result.getResponseCode(), new Object[0]);
        try {
            C0575f.e(C0580h0.f248b, null, null, new a(result, list, this, null), 3);
        } catch (Exception e4) {
            m().d(e4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(h9.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof k8.m
            if (r0 == 0) goto L13
            r0 = r7
            k8.m r0 = (k8.m) r0
            int r1 = r0.f43536o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f43536o = r1
            goto L18
        L13:
            k8.m r0 = new k8.m
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f43534m
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f43536o
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            b9.n.b(r7)     // Catch: java.lang.Exception -> L2a
            goto L5e
        L2a:
            r7 = move-exception
            goto L61
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            k8.t r2 = r0.f43533l
            b9.n.b(r7)     // Catch: java.lang.Exception -> L2a
            goto L4b
        L3a:
            b9.n.b(r7)
            k8.E r7 = r6.f43574f     // Catch: java.lang.Exception -> L2a
            r0.f43533l = r6     // Catch: java.lang.Exception -> L2a
            r0.f43536o = r4     // Catch: java.lang.Exception -> L2a
            java.lang.Object r7 = r7.a(r0)     // Catch: java.lang.Exception -> L2a
            if (r7 != r1) goto L4a
            goto L5d
        L4a:
            r2 = r6
        L4b:
            com.android.billingclient.api.BillingClient r7 = (com.android.billingclient.api.BillingClient) r7     // Catch: java.lang.Exception -> L2a
            k8.n r4 = new k8.n     // Catch: java.lang.Exception -> L2a
            r5 = 0
            r4.<init>(r2, r7, r5)     // Catch: java.lang.Exception -> L2a
            r0.f43533l = r5     // Catch: java.lang.Exception -> L2a
            r0.f43536o = r3     // Catch: java.lang.Exception -> L2a
            java.lang.Object r7 = A9.F.c(r4, r0)     // Catch: java.lang.Exception -> L2a
            if (r7 != r1) goto L5e
        L5d:
            return r1
        L5e:
            J8.E$c r7 = (J8.E.c) r7     // Catch: java.lang.Exception -> L2a
            return r7
        L61:
            J8.E$b r0 = new J8.E$b
            r0.<init>(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.t.p(h9.c):java.lang.Object");
    }

    public final boolean q(Application application, String str) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo;
        if (str.length() == 0) {
            return false;
        }
        List<String> listR0 = y9.q.r0(str, new String[]{StringUtils.COMMA});
        if ((listR0 instanceof Collection) && listR0.isEmpty()) {
            return false;
        }
        for (String packageName : listR0) {
            kotlin.jvm.internal.l.f(packageName, "packageName");
            try {
                packageInfo = application.getPackageManager().getPackageInfo(y9.q.w0(packageName).toString(), 0);
            } catch (PackageManager.NameNotFoundException unused) {
                packageInfo = null;
            }
            if (packageInfo != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean r(Purchase purchase, ProductDetails productDetails) {
        List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails;
        try {
            List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails2 = productDetails.getSubscriptionOfferDetails();
            if (subscriptionOfferDetails2 != null) {
                List<ProductDetails.SubscriptionOfferDetails> list = subscriptionOfferDetails2;
                if ((list instanceof Collection) && list.isEmpty()) {
                    return true;
                }
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (kotlin.jvm.internal.l.b(((ProductDetails.SubscriptionOfferDetails) it.next()).getOfferId(), "freetrial")) {
                    }
                }
                return true;
            }
            subscriptionOfferDetails = productDetails.getSubscriptionOfferDetails();
        } catch (Exception e4) {
            m().e(e4, androidx.work.s.d("Trial check failed for ", productDetails.getProductId()), new Object[0]);
        }
        if (subscriptionOfferDetails == null) {
            return true;
        }
        for (Object obj : subscriptionOfferDetails) {
            if (kotlin.jvm.internal.l.b(((ProductDetails.SubscriptionOfferDetails) obj).getOfferId(), "freetrial")) {
                ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails3 = (ProductDetails.SubscriptionOfferDetails) obj;
                if (subscriptionOfferDetails3 == null) {
                    return true;
                }
                ma.d dVarL0 = ma.d.l0(purchase.getPurchaseTime());
                ma.l lVarJ0 = ma.l.j0(subscriptionOfferDetails3.getBasePlanId());
                dVarL0.getClass();
                ma.d dVar = (ma.d) lVarJ0.i0(dVarL0);
                ConcurrentHashMap concurrentHashMap = ma.q.f44146e;
                if (dVar.compareTo(ma.d.l0(System.currentTimeMillis())) < 0) {
                    return true;
                }
                return false;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        if (r8 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s(com.android.billingclient.api.BillingClient r6, java.lang.String r7, h9.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof k8.w
            if (r0 == 0) goto L13
            r0 = r8
            k8.w r0 = (k8.w) r0
            int r1 = r0.f43618q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f43618q = r1
            goto L18
        L13:
            k8.w r0 = new k8.w
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f43616o
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f43618q
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            b9.n.b(r8)
            goto L67
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r7 = r0.f43615n
            com.android.billingclient.api.BillingClient r6 = r0.f43614m
            k8.t r2 = r0.f43613l
            b9.n.b(r8)     // Catch: java.lang.Exception -> L55
            goto L51
        L3c:
            b9.n.b(r8)
            java.lang.String r8 = "subs"
            r0.f43613l = r5     // Catch: java.lang.Exception -> L54
            r0.f43614m = r6     // Catch: java.lang.Exception -> L54
            r0.f43615n = r7     // Catch: java.lang.Exception -> L54
            r0.f43618q = r4     // Catch: java.lang.Exception -> L54
            java.lang.Object r8 = r5.t(r6, r7, r8, r0)     // Catch: java.lang.Exception -> L54
            if (r8 != r1) goto L50
            goto L66
        L50:
            r2 = r5
        L51:
            com.android.billingclient.api.ProductDetails r8 = (com.android.billingclient.api.ProductDetails) r8     // Catch: java.lang.Exception -> L55
            return r8
        L54:
            r2 = r5
        L55:
            r8 = 0
            r0.f43613l = r8
            r0.f43614m = r8
            r0.f43615n = r8
            r0.f43618q = r3
            java.lang.String r8 = "inapp"
            java.lang.Object r8 = r2.t(r6, r7, r8, r0)
            if (r8 != r1) goto L67
        L66:
            return r1
        L67:
            com.android.billingclient.api.ProductDetails r8 = (com.android.billingclient.api.ProductDetails) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.t.s(com.android.billingclient.api.BillingClient, java.lang.String, h9.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(com.android.billingclient.api.BillingClient r6, java.lang.String r7, java.lang.String r8, h9.c r9) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.t.t(com.android.billingclient.api.BillingClient, java.lang.String, java.lang.String, h9.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b7, code lost:
    
        if (r13 != r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00b7 -> B:42:0x00ba). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u(com.android.billingclient.api.BillingClient r11, com.android.billingclient.api.QueryProductDetailsParams r12, h9.c r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof k8.y
            if (r0 == 0) goto L13
            r0 = r13
            k8.y r0 = (k8.y) r0
            int r1 = r0.f43630q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f43630q = r1
            goto L18
        L13:
            k8.y r0 = new k8.y
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f43628o
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f43630q
            r3 = 1
            r4 = 0
            r5 = 3
            r6 = 2
            if (r2 == 0) goto L52
            if (r2 == r3) goto L48
            if (r2 == r6) goto L3d
            if (r2 != r5) goto L35
            int r11 = r0.f43627n
            com.android.billingclient.api.QueryProductDetailsParams r12 = r0.f43626m
            com.android.billingclient.api.BillingClient r2 = r0.f43625l
            b9.n.b(r13)
            goto Lba
        L35:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3d:
            int r11 = r0.f43627n
            com.android.billingclient.api.QueryProductDetailsParams r12 = r0.f43626m
            com.android.billingclient.api.BillingClient r2 = r0.f43625l
            b9.n.b(r13)
            goto Lab
        L48:
            int r11 = r0.f43627n
            com.android.billingclient.api.QueryProductDetailsParams r12 = r0.f43626m
            com.android.billingclient.api.BillingClient r2 = r0.f43625l
            b9.n.b(r13)
            goto L66
        L52:
            b9.n.b(r13)
            r0.f43625l = r11
            r0.f43626m = r12
            r0.f43627n = r4
            r0.f43630q = r3
            java.lang.Object r13 = com.android.billingclient.api.BillingClientKotlinKt.queryProductDetails(r11, r12, r0)
            if (r13 != r1) goto L64
            goto Lb9
        L64:
            r2 = r11
            r11 = r4
        L66:
            com.android.billingclient.api.ProductDetailsResult r13 = (com.android.billingclient.api.ProductDetailsResult) r13
        L68:
            r7 = 5
            if (r11 >= r7) goto Lbd
            java.lang.String r7 = "<this>"
            kotlin.jvm.internal.l.f(r13, r7)
            com.android.billingclient.api.BillingResult r7 = r13.getBillingResult()
            boolean r7 = k8.F.i(r7)
            com.android.billingclient.api.BillingResult r8 = r13.getBillingResult()
            int r8 = r8.getResponseCode()
            if (r8 != 0) goto L84
            r8 = r3
            goto L85
        L84:
            r8 = r4
        L85:
            com.android.billingclient.api.BillingResult r9 = r13.getBillingResult()
            int r9 = r9.getResponseCode()
            if (r9 != r6) goto L91
            r9 = r3
            goto L92
        L91:
            r9 = r4
        L92:
            if (r7 != 0) goto Lbd
            if (r8 != 0) goto L98
            if (r9 == 0) goto Lbd
        L98:
            int r11 = r11 + 1
            r0.f43625l = r2
            r0.f43626m = r12
            r0.f43627n = r11
            r0.f43630q = r6
            r7 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r13 = A9.O.a(r7, r0)
            if (r13 != r1) goto Lab
            goto Lb9
        Lab:
            r0.f43625l = r2
            r0.f43626m = r12
            r0.f43627n = r11
            r0.f43630q = r5
            java.lang.Object r13 = com.android.billingclient.api.BillingClientKotlinKt.queryProductDetails(r2, r12, r0)
            if (r13 != r1) goto Lba
        Lb9:
            return r1
        Lba:
            com.android.billingclient.api.ProductDetailsResult r13 = (com.android.billingclient.api.ProductDetailsResult) r13
            goto L68
        Lbd:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.t.u(com.android.billingclient.api.BillingClient, com.android.billingclient.api.QueryProductDetailsParams, h9.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v(com.android.billingclient.api.BillingClient r5, java.lang.String r6, h9.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof k8.z
            if (r0 == 0) goto L13
            r0 = r7
            k8.z r0 = (k8.z) r0
            int r1 = r0.f43634o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f43634o = r1
            goto L18
        L13:
            k8.z r0 = new k8.z
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f43632m
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f43634o
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            k8.t r5 = r0.f43631l
            b9.n.b(r7)
            goto L40
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            b9.n.b(r7)
            r0.f43631l = r4
            r0.f43634o = r3
            java.lang.Object r7 = com.android.billingclient.api.BillingClientKotlinKt.queryPurchaseHistory(r5, r6, r0)
            if (r7 != r1) goto L3f
            return r1
        L3f:
            r5 = r4
        L40:
            com.android.billingclient.api.PurchaseHistoryResult r7 = (com.android.billingclient.api.PurchaseHistoryResult) r7
            com.android.billingclient.api.BillingResult r6 = r7.getBillingResult()
            boolean r6 = k8.F.i(r6)
            if (r6 == 0) goto L63
            java.util.List r6 = r7.getPurchaseHistoryRecordList()
            java.util.Collection r6 = (java.util.Collection) r6
            if (r6 == 0) goto L63
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L5b
            goto L63
        L5b:
            java.util.List r6 = r7.getPurchaseHistoryRecordList()
            kotlin.jvm.internal.l.c(r6)
            goto L65
        L63:
            c9.t r6 = c9.C2099t.f18581b
        L65:
            l8.b r7 = r5.f43570b
            com.zipoapps.premiumhelper.configuration.appconfig.PremiumHelperConfiguration r7 = r7.f43910b
            boolean r7 = r7.isDebugMode()
            if (r7 == 0) goto L9b
            r7 = r6
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L76:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L9b
            java.lang.Object r0 = r7.next()
            com.android.billingclient.api.PurchaseHistoryRecord r0 = (com.android.billingclient.api.PurchaseHistoryRecord) r0
            r8.c r1 = r5.m()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "History purchase: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1.g(r0, r2)
            goto L76
        L9b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.t.v(com.android.billingclient.api.BillingClient, java.lang.String, h9.c):java.lang.Object");
    }

    public final Object w(BillingClient billingClient, String str, h9.c cVar) {
        C0583j c0583j = new C0583j(1, com.google.gson.internal.c.r(cVar));
        c0583j.s();
        billingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType(str).build(), new C5249A(c0583j, this, billingClient, str));
        Object objR = c0583j.r();
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        return objR;
    }

    public final void x() {
        com.zipoapps.premiumhelper.e.f37006D.getClass();
        if (e.a.a().i.j()) {
            return;
        }
        C0575f.e(C0580h0.f248b, null, null, new b(null), 3);
    }
}

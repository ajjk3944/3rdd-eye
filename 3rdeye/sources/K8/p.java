package k8;

import android.app.Activity;
import b9.C1992A;
import f9.InterfaceC4347e;

/* compiled from: Billing.kt */
@h9.e(c = "com.zipoapps.premiumhelper.billing.Billing$launchBillingFlow$1", f = "Billing.kt", l = {573, 577}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class p extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f43550l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ G f43551m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t f43552n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Activity f43553o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(G g10, t tVar, Activity activity, InterfaceC4347e<? super p> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f43551m = g10;
        this.f43552n = tVar;
        this.f43553o = activity;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new p(this.f43551m, this.f43552n, this.f43553o, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((p) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        if (r1.emit(r2, r6) != r0) goto L35;
     */
    @Override // h9.AbstractC4424a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Exception {
        /*
            r6 = this;
            g9.a r0 = g9.a.COROUTINE_SUSPENDED
            int r1 = r6.f43550l
            r2 = 1
            r3 = 2
            k8.t r4 = r6.f43552n
            if (r1 == 0) goto L21
            if (r1 == r2) goto L1b
            if (r1 != r3) goto L13
            b9.n.b(r7)
            goto L8a
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            b9.n.b(r7)     // Catch: java.lang.Exception -> L1f
            goto L8a
        L1f:
            r7 = move-exception
            goto L53
        L21:
            b9.n.b(r7)
            k8.G r7 = r6.f43551m     // Catch: java.lang.Exception -> L1f
            boolean r1 = r7 instanceof k8.G.b     // Catch: java.lang.Exception -> L1f
            if (r1 != 0) goto L4b
            boolean r1 = r7 instanceof k8.G.a     // Catch: java.lang.Exception -> L1f
            android.app.Activity r5 = r6.f43553o
            if (r1 == 0) goto L36
            k8.G$a r7 = (k8.G.a) r7     // Catch: java.lang.Exception -> L1f
            k8.t.c(r4, r5, r7)     // Catch: java.lang.Exception -> L1f
            goto L8a
        L36:
            boolean r1 = r7 instanceof k8.G.c     // Catch: java.lang.Exception -> L1f
            if (r1 == 0) goto L45
            k8.G$c r7 = (k8.G.c) r7     // Catch: java.lang.Exception -> L1f
            r6.f43550l = r2     // Catch: java.lang.Exception -> L1f
            java.lang.Object r7 = k8.t.d(r4, r5, r7, r6)     // Catch: java.lang.Exception -> L1f
            if (r7 != r0) goto L8a
            goto L89
        L45:
            b9.j r7 = new b9.j     // Catch: java.lang.Exception -> L1f
            r7.<init>()     // Catch: java.lang.Exception -> L1f
            throw r7     // Catch: java.lang.Exception -> L1f
        L4b:
            java.lang.Exception r7 = new java.lang.Exception     // Catch: java.lang.Exception -> L1f
            java.lang.String r1 = "Cannot launch the billing flow due to a failure when querying the offer."
            r7.<init>(r1)     // Catch: java.lang.Exception -> L1f
            throw r7     // Catch: java.lang.Exception -> L1f
        L53:
            w9.i<java.lang.Object>[] r1 = k8.t.f43568n
            r8.c r1 = r4.m()
            r1.d(r7)
            D9.C r1 = r4.i
            k8.H r2 = new k8.H
            com.android.billingclient.api.BillingResult$Builder r4 = com.android.billingclient.api.BillingResult.newBuilder()
            java.lang.String r7 = r7.getMessage()
            if (r7 != 0) goto L6c
            java.lang.String r7 = ""
        L6c:
            com.android.billingclient.api.BillingResult$Builder r7 = r4.setDebugMessage(r7)
            r4 = 5
            com.android.billingclient.api.BillingResult$Builder r7 = r7.setResponseCode(r4)
            com.android.billingclient.api.BillingResult r7 = r7.build()
            java.lang.String r4 = "build(...)"
            kotlin.jvm.internal.l.e(r7, r4)
            r2.<init>(r7)
            r6.f43550l = r3
            java.lang.Object r7 = r1.emit(r2, r6)
            if (r7 != r0) goto L8a
        L89:
            return r0
        L8a:
            b9.A r7 = b9.C1992A.f18074a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

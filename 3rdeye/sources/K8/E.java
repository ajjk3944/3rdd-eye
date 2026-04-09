package k8;

import android.app.Application;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.PendingPurchasesParams;

/* compiled from: BillingConnection.kt */
/* loaded from: classes3.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final BillingClient f43453a;

    public E(Application application, t tVar) {
        BillingClient.Builder listener = BillingClient.newBuilder(application).setListener(tVar);
        PendingPurchasesParams pendingPurchasesParamsBuild = PendingPurchasesParams.newBuilder().enableOneTimeProducts().enablePrepaidPlans().build();
        kotlin.jvm.internal.l.e(pendingPurchasesParamsBuild, "build(...)");
        listener.enablePendingPurchases(pendingPurchasesParamsBuild);
        BillingClient billingClientBuild = listener.build();
        kotlin.jvm.internal.l.e(billingClientBuild, "build(...)");
        this.f43453a = billingClientBuild;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(h9.c r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof k8.C5250B
            if (r0 == 0) goto L14
            r0 = r12
            k8.B r0 = (k8.C5250B) r0
            int r1 = r0.f43449o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f43449o = r1
        L12:
            r9 = r0
            goto L1a
        L14:
            k8.B r0 = new k8.B
            r0.<init>(r11, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r9.f43447m
            g9.a r0 = g9.a.COROUTINE_SUSPENDED
            int r1 = r9.f43449o
            r10 = 0
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            k8.E r0 = r9.f43446l
            b9.n.b(r12)
            goto L59
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L34:
            b9.n.b(r12)
            com.android.billingclient.api.BillingClient r12 = r11.f43453a
            boolean r1 = r12.isReady()
            if (r1 == 0) goto L40
            return r12
        L40:
            k8.C r8 = new k8.C
            r8.<init>(r11, r10)
            r9.f43446l = r11
            r9.f43449o = r2
            r2 = 100
            r4 = 500(0x1f4, double:2.47E-321)
            r1 = 10
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            java.lang.Object r12 = J8.C0702q.f(r1, r2, r4, r6, r8, r9)
            if (r12 != r0) goto L58
            return r0
        L58:
            r0 = r11
        L59:
            J8.E r12 = (J8.E) r12
            boolean r1 = r12 instanceof J8.E.b
            if (r1 == 0) goto L79
            J8.E$b r12 = (J8.E.b) r12
            java.lang.Exception r12 = r12.f2814b
            if (r12 == 0) goto L69
            java.lang.String r10 = r12.getMessage()
        L69:
            java.lang.String r12 = "Connect failure: "
            java.lang.String r12 = androidx.work.s.d(r12, r10)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r12 = r12.toString()
            r0.<init>(r12)
            throw r0
        L79:
            com.android.billingclient.api.BillingClient r12 = r0.f43453a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.E.a(h9.c):java.lang.Object");
    }
}

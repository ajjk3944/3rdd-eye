package k8;

import A9.C0583j;
import J8.E;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import va.a;

/* compiled from: BillingConnection.kt */
/* loaded from: classes3.dex */
public final class D implements BillingClientStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0583j f43452a;

    public D(C0583j c0583j) {
        this.f43452a = c0583j;
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingServiceDisconnected() {
        C0583j c0583j = this.f43452a;
        try {
            if (c0583j.isActive()) {
                c0583j.resumeWith(new E.b(new IllegalStateException("-1")));
            }
        } catch (IllegalStateException e4) {
            a.b bVar = va.a.f47104a;
            bVar.o("BillingConnection");
            bVar.d(e4);
        }
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingSetupFinished(BillingResult result) {
        kotlin.jvm.internal.l.f(result, "result");
        C0583j c0583j = this.f43452a;
        if (c0583j.isActive()) {
            if (F.i(result)) {
                c0583j.resumeWith(new E.c(Integer.valueOf(result.getResponseCode())));
            } else {
                c0583j.resumeWith(new E.b(new IllegalStateException(String.valueOf(result.getResponseCode()))));
            }
        }
    }
}

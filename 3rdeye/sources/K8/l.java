package k8;

import b9.C1992A;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import f9.InterfaceC4347e;

/* compiled from: Billing.kt */
@h9.e(c = "com.zipoapps.premiumhelper.billing.Billing$handlePurchaseUpdate$2$activePurchases$1$1", f = "Billing.kt", l = {397}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class l extends h9.i implements p9.l<InterfaceC4347e<? super BillingResult>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f43529l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t f43530m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ BillingClient f43531n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Purchase f43532o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(t tVar, BillingClient billingClient, Purchase purchase, InterfaceC4347e<? super l> interfaceC4347e) {
        super(1, interfaceC4347e);
        this.f43530m = tVar;
        this.f43531n = billingClient;
        this.f43532o = purchase;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(InterfaceC4347e<?> interfaceC4347e) {
        return new l(this.f43530m, this.f43531n, this.f43532o, interfaceC4347e);
    }

    @Override // p9.l
    public final Object invoke(InterfaceC4347e<? super BillingResult> interfaceC4347e) {
        return ((l) create(interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f43529l;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b9.n.b(obj);
            return obj;
        }
        b9.n.b(obj);
        String purchaseToken = this.f43532o.getPurchaseToken();
        kotlin.jvm.internal.l.e(purchaseToken, "getPurchaseToken(...)");
        this.f43529l = 1;
        w9.i<Object>[] iVarArr = t.f43568n;
        Object objH = this.f43530m.h(this.f43531n, purchaseToken, this);
        return objH == aVar ? aVar : objH;
    }
}

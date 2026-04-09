package k8;

import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.QueryProductDetailsParams;

/* compiled from: Billing.kt */
@h9.e(c = "com.zipoapps.premiumhelper.billing.Billing", f = "Billing.kt", l = {328, 332, 333}, m = "queryProductWithRetries")
/* loaded from: classes3.dex */
public final class y extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public BillingClient f43625l;

    /* renamed from: m, reason: collision with root package name */
    public QueryProductDetailsParams f43626m;

    /* renamed from: n, reason: collision with root package name */
    public int f43627n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f43628o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ t f43629p;

    /* renamed from: q, reason: collision with root package name */
    public int f43630q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(t tVar, h9.c cVar) {
        super(cVar);
        this.f43629p = tVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f43628o = obj;
        this.f43630q |= RecyclerView.UNDEFINED_DURATION;
        w9.i<Object>[] iVarArr = t.f43568n;
        return this.f43629p.u(null, null, this);
    }
}

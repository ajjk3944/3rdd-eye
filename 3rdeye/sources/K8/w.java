package k8;

import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.BillingClient;

/* compiled from: Billing.kt */
@h9.e(c = "com.zipoapps.premiumhelper.billing.Billing", f = "Billing.kt", l = {281, 283}, m = "queryProductDetails")
/* loaded from: classes3.dex */
public final class w extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public t f43613l;

    /* renamed from: m, reason: collision with root package name */
    public BillingClient f43614m;

    /* renamed from: n, reason: collision with root package name */
    public String f43615n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f43616o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ t f43617p;

    /* renamed from: q, reason: collision with root package name */
    public int f43618q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(t tVar, h9.c cVar) {
        super(cVar);
        this.f43617p = tVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f43616o = obj;
        this.f43618q |= RecyclerView.UNDEFINED_DURATION;
        w9.i<Object>[] iVarArr = t.f43568n;
        return this.f43617p.s(null, null, this);
    }
}

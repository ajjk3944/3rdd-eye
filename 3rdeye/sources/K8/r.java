package k8;

import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.ProductDetails;
import k8.G;

/* compiled from: Billing.kt */
@h9.e(c = "com.zipoapps.premiumhelper.billing.Billing", f = "Billing.kt", l = {636}, m = "launchRealBillingFlowFlow")
/* loaded from: classes3.dex */
public final class r extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public t f43558l;

    /* renamed from: m, reason: collision with root package name */
    public Activity f43559m;

    /* renamed from: n, reason: collision with root package name */
    public G.c f43560n;

    /* renamed from: o, reason: collision with root package name */
    public ProductDetails f43561o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f43562p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ t f43563q;

    /* renamed from: r, reason: collision with root package name */
    public int f43564r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t tVar, h9.c cVar) {
        super(cVar);
        this.f43563q = tVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f43562p = obj;
        this.f43564r |= RecyclerView.UNDEFINED_DURATION;
        return t.d(this.f43563q, null, null, this);
    }
}

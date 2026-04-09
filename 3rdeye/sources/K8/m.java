package k8;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: Billing.kt */
@h9.e(c = "com.zipoapps.premiumhelper.billing.Billing", f = "Billing.kt", l = {492, 493}, m = "hasHistoryPurchases")
/* loaded from: classes3.dex */
public final class m extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public t f43533l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f43534m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t f43535n;

    /* renamed from: o, reason: collision with root package name */
    public int f43536o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(t tVar, h9.c cVar) {
        super(cVar);
        this.f43535n = tVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f43534m = obj;
        this.f43536o |= RecyclerView.UNDEFINED_DURATION;
        return this.f43535n.p(this);
    }
}

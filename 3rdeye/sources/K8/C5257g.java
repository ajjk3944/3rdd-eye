package k8;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: Billing.kt */
@h9.e(c = "com.zipoapps.premiumhelper.billing.Billing", f = "Billing.kt", l = {158, 159}, m = "getActivePurchases")
/* renamed from: k8.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5257g extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public t f43492l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f43493m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t f43494n;

    /* renamed from: o, reason: collision with root package name */
    public int f43495o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5257g(t tVar, h9.c cVar) {
        super(cVar);
        this.f43494n = tVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f43493m = obj;
        this.f43495o |= RecyclerView.UNDEFINED_DURATION;
        return this.f43494n.l(this);
    }
}

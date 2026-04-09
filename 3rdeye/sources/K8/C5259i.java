package k8;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: Billing.kt */
@h9.e(c = "com.zipoapps.premiumhelper.billing.Billing", f = "Billing.kt", l = {126, 132}, m = "getOffer")
/* renamed from: k8.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5259i extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public t f43510l;

    /* renamed from: m, reason: collision with root package name */
    public String f43511m;

    /* renamed from: n, reason: collision with root package name */
    public J8.E f43512n;

    /* renamed from: o, reason: collision with root package name */
    public int f43513o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f43514p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ t f43515q;

    /* renamed from: r, reason: collision with root package name */
    public int f43516r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5259i(t tVar, h9.c cVar) {
        super(cVar);
        this.f43515q = tVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f43514p = obj;
        this.f43516r |= RecyclerView.UNDEFINED_DURATION;
        return this.f43515q.n(null, this);
    }
}

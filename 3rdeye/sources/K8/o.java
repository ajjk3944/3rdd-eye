package k8;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: Billing.kt */
@h9.e(c = "com.zipoapps.premiumhelper.billing.Billing", f = "Billing.kt", l = {537}, m = "hasPurchased")
/* loaded from: classes3.dex */
public final class o extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f43547l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t f43548m;

    /* renamed from: n, reason: collision with root package name */
    public int f43549n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(t tVar, h9.c cVar) {
        super(cVar);
        this.f43548m = tVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f43547l = obj;
        this.f43549n |= RecyclerView.UNDEFINED_DURATION;
        return t.b(this.f43548m, null, null, this);
    }
}

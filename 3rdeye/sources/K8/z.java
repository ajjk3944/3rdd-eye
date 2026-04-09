package k8;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: Billing.kt */
@h9.e(c = "com.zipoapps.premiumhelper.billing.Billing", f = "Billing.kt", l = {544}, m = "queryPurchaseHistory")
/* loaded from: classes3.dex */
public final class z extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public t f43631l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f43632m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t f43633n;

    /* renamed from: o, reason: collision with root package name */
    public int f43634o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(t tVar, h9.c cVar) {
        super(cVar);
        this.f43633n = tVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f43632m = obj;
        this.f43634o |= RecyclerView.UNDEFINED_DURATION;
        w9.i<Object>[] iVarArr = t.f43568n;
        return this.f43633n.v(null, null, this);
    }
}

package k8;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: Billing.kt */
@h9.e(c = "com.zipoapps.premiumhelper.billing.Billing", f = "Billing.kt", l = {293, 307}, m = "queryProductDetails")
/* loaded from: classes3.dex */
public final class x extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public t f43619l;

    /* renamed from: m, reason: collision with root package name */
    public String f43620m;

    /* renamed from: n, reason: collision with root package name */
    public String f43621n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f43622o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ t f43623p;

    /* renamed from: q, reason: collision with root package name */
    public int f43624q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(t tVar, h9.c cVar) {
        super(cVar);
        this.f43623p = tVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f43622o = obj;
        this.f43624q |= RecyclerView.UNDEFINED_DURATION;
        w9.i<Object>[] iVarArr = t.f43568n;
        return this.f43623p.t(null, null, null, this);
    }
}

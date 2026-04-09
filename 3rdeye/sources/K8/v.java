package k8;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: Billing.kt */
@h9.e(c = "com.zipoapps.premiumhelper.billing.Billing", f = "Billing.kt", l = {273, 274}, m = "queryOffer")
/* loaded from: classes3.dex */
public final class v extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public Object f43608l;

    /* renamed from: m, reason: collision with root package name */
    public String f43609m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f43610n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ t f43611o;

    /* renamed from: p, reason: collision with root package name */
    public int f43612p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(t tVar, h9.c cVar) {
        super(cVar);
        this.f43611o = tVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f43610n = obj;
        this.f43612p |= RecyclerView.UNDEFINED_DURATION;
        return t.e(this.f43611o, null, this);
    }
}

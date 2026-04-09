package k8;

import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.Purchase;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: Billing.kt */
@h9.e(c = "com.zipoapps.premiumhelper.billing.Billing", f = "Billing.kt", l = {394, 397, 409}, m = "handlePurchaseUpdate")
/* loaded from: classes3.dex */
public final class k extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public t f43520l;

    /* renamed from: m, reason: collision with root package name */
    public Object f43521m;

    /* renamed from: n, reason: collision with root package name */
    public Iterable f43522n;

    /* renamed from: o, reason: collision with root package name */
    public Iterator f43523o;

    /* renamed from: p, reason: collision with root package name */
    public Purchase f43524p;

    /* renamed from: q, reason: collision with root package name */
    public Collection f43525q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f43526r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t f43527s;

    /* renamed from: t, reason: collision with root package name */
    public int f43528t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(t tVar, h9.c cVar) {
        super(cVar);
        this.f43527s = tVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f43526r = obj;
        this.f43528t |= RecyclerView.UNDEFINED_DURATION;
        return t.a(this.f43527s, null, this);
    }
}

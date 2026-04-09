package k8;

import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.BillingClient;
import java.util.Iterator;
import java.util.List;

/* compiled from: Billing.kt */
@h9.e(c = "com.zipoapps.premiumhelper.billing.Billing", f = "Billing.kt", l = {522, 524}, m = "consumePurchasesWithType")
/* renamed from: k8.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5256f extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public t f43483l;

    /* renamed from: m, reason: collision with root package name */
    public BillingClient f43484m;

    /* renamed from: n, reason: collision with root package name */
    public List f43485n;

    /* renamed from: o, reason: collision with root package name */
    public Iterable f43486o;

    /* renamed from: p, reason: collision with root package name */
    public Iterator f43487p;

    /* renamed from: q, reason: collision with root package name */
    public C5251a f43488q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f43489r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t f43490s;

    /* renamed from: t, reason: collision with root package name */
    public int f43491t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5256f(t tVar, h9.c cVar) {
        super(cVar);
        this.f43490s = tVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f43489r = obj;
        this.f43491t |= RecyclerView.UNDEFINED_DURATION;
        w9.i<Object>[] iVarArr = t.f43568n;
        return this.f43490s.k(null, null, this);
    }
}

package k8;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

/* compiled from: Billing.kt */
@h9.e(c = "com.zipoapps.premiumhelper.billing.Billing", f = "Billing.kt", l = {193, 195, 201}, m = "acknowledgeAll$premium_helper_5_0_3_regularRelease")
/* renamed from: k8.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5253c extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public t f43466l;

    /* renamed from: m, reason: collision with root package name */
    public Object f43467m;

    /* renamed from: n, reason: collision with root package name */
    public Iterable f43468n;

    /* renamed from: o, reason: collision with root package name */
    public Iterator f43469o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f43470p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ t f43471q;

    /* renamed from: r, reason: collision with root package name */
    public int f43472r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5253c(t tVar, h9.c cVar) {
        super(cVar);
        this.f43471q = tVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f43470p = obj;
        this.f43472r |= RecyclerView.UNDEFINED_DURATION;
        return this.f43471q.g(this);
    }
}

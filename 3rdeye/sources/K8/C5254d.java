package k8;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: Billing.kt */
@h9.e(c = "com.zipoapps.premiumhelper.billing.Billing", f = "Billing.kt", l = {213}, m = "acknowledgePurchase")
/* renamed from: k8.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5254d extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public t f43473l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f43474m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t f43475n;

    /* renamed from: o, reason: collision with root package name */
    public int f43476o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5254d(t tVar, h9.c cVar) {
        super(cVar);
        this.f43475n = tVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f43474m = obj;
        this.f43476o |= RecyclerView.UNDEFINED_DURATION;
        w9.i<Object>[] iVarArr = t.f43568n;
        return this.f43475n.h(null, null, this);
    }
}

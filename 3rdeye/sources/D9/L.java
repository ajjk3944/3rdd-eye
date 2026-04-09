package D9;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: Share.kt */
@h9.e(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {415, 419}, m = "onSubscription")
/* loaded from: classes3.dex */
public final class L extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public M f1170l;

    /* renamed from: m, reason: collision with root package name */
    public E9.o f1171m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f1172n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ M<Object> f1173o;

    /* renamed from: p, reason: collision with root package name */
    public int f1174p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(M m10, h9.c cVar) {
        super(cVar);
        this.f1173o = m10;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f1172n = obj;
        this.f1174p |= RecyclerView.UNDEFINED_DURATION;
        return this.f1173o.b(this);
    }
}

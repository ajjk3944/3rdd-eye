package y1;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ConnectionPoolImpl.kt */
@h9.e(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", l = {376, 380, 393, 393, 393}, m = "transaction")
/* loaded from: classes.dex */
public final class n<R> extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public Object f47986l;

    /* renamed from: m, reason: collision with root package name */
    public Object f47987m;

    /* renamed from: n, reason: collision with root package name */
    public int f47988n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f47989o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ k f47990p;

    /* renamed from: q, reason: collision with root package name */
    public int f47991q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(k kVar, h9.c cVar) {
        super(cVar);
        this.f47990p = kVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f47989o = obj;
        this.f47991q |= RecyclerView.UNDEFINED_DURATION;
        return this.f47990p.g(null, null, this);
    }
}

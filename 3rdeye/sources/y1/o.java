package y1;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ConnectionPoolImpl.kt */
@h9.e(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", l = {554}, m = "usePrepared")
/* loaded from: classes.dex */
public final class o<R> extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public k f47992l;

    /* renamed from: m, reason: collision with root package name */
    public String f47993m;

    /* renamed from: n, reason: collision with root package name */
    public p9.l f47994n;

    /* renamed from: o, reason: collision with root package name */
    public C5797h f47995o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f47996p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ k f47997q;

    /* renamed from: r, reason: collision with root package name */
    public int f47998r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(k kVar, h9.c cVar) {
        super(cVar);
        this.f47997q = kVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f47996p = obj;
        this.f47998r |= RecyclerView.UNDEFINED_DURATION;
        return this.f47997q.a(null, null, this);
    }
}

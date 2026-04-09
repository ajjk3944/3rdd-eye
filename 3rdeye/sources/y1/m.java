package y1;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ConnectionPoolImpl.kt */
@h9.e(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", l = {543}, m = "endTransaction")
/* loaded from: classes.dex */
public final class m extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public k f47980l;

    /* renamed from: m, reason: collision with root package name */
    public C5797h f47981m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f47982n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f47983o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ k f47984p;

    /* renamed from: q, reason: collision with root package name */
    public int f47985q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k kVar, h9.c cVar) {
        super(cVar);
        this.f47984p = kVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f47983o = obj;
        this.f47985q |= RecyclerView.UNDEFINED_DURATION;
        return this.f47984p.f(false, this);
    }
}

package y1;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ConnectionPoolImpl.kt */
@h9.e(c = "androidx.room.coroutines.Pool", f = "ConnectionPoolImpl.kt", l = {212}, m = "acquire")
/* renamed from: y1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5798i extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public j f47952l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f47953m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j f47954n;

    /* renamed from: o, reason: collision with root package name */
    public int f47955o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5798i(j jVar, h9.c cVar) {
        super(cVar);
        this.f47954n = jVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f47953m = obj;
        this.f47955o |= RecyclerView.UNDEFINED_DURATION;
        return this.f47954n.a(this);
    }
}

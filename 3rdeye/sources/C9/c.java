package C9;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: BufferedChannel.kt */
@h9.e(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {762}, m = "receiveCatching-JP2dKIU$suspendImpl")
/* loaded from: classes3.dex */
public final class c<E> extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f975l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b<E> f976m;

    /* renamed from: n, reason: collision with root package name */
    public int f977n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, h9.c cVar) {
        super(cVar);
        this.f976m = bVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f975l = obj;
        this.f977n |= RecyclerView.UNDEFINED_DURATION;
        Object objD = b.D(this.f976m, this);
        return objD == g9.a.COROUTINE_SUSPENDED ? objD : new k(objD);
    }
}

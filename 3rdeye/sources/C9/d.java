package C9;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* compiled from: BufferedChannel.kt */
@h9.e(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {3087}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk")
/* loaded from: classes3.dex */
public final class d extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f978l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b<Object> f979m;

    /* renamed from: n, reason: collision with root package name */
    public int f980n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, h9.c cVar) {
        super(cVar);
        this.f979m = bVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f978l = obj;
        this.f980n |= RecyclerView.UNDEFINED_DURATION;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f963c;
        Object objE = this.f979m.E(null, 0, 0L, this);
        return objE == g9.a.COROUTINE_SUSPENDED ? objE : new k(objE);
    }
}

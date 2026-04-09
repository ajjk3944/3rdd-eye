package bu;

/* loaded from: classes.dex */
public final class c implements wt.t {

    /* renamed from: a, reason: collision with root package name */
    public final pq.h f2960a;

    public c(pq.h hVar) {
        this.f2960a = hVar;
    }

    @Override // wt.t
    public final pq.h getCoroutineContext() {
        return this.f2960a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f2960a + ')';
    }
}

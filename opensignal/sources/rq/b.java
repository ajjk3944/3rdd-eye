package rq;

/* loaded from: classes.dex */
public final class b implements pq.c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f21665a = new b();

    @Override // pq.c
    public final void g(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // pq.c
    public final pq.h m() {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}

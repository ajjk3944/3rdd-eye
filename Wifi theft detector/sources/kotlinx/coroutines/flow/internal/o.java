package kotlinx.coroutines.flow.internal;

/* loaded from: classes4.dex */
public final class o implements c9.c, d9.c {

    /* renamed from: a, reason: collision with root package name */
    public final c9.c f22484a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.coroutines.d f22485b;

    public o(c9.c cVar, kotlin.coroutines.d dVar) {
        this.f22484a = cVar;
        this.f22485b = dVar;
    }

    @Override // d9.c
    public d9.c getCallerFrame() {
        c9.c cVar = this.f22484a;
        if (cVar instanceof d9.c) {
            return (d9.c) cVar;
        }
        return null;
    }

    @Override // c9.c
    public kotlin.coroutines.d getContext() {
        return this.f22485b;
    }

    @Override // c9.c
    public void resumeWith(Object obj) {
        this.f22484a.resumeWith(obj);
    }
}

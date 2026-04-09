package kotlinx.coroutines.internal;

/* loaded from: classes4.dex */
public final class f implements kotlinx.coroutines.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.coroutines.d f22530a;

    public f(kotlin.coroutines.d dVar) {
        this.f22530a = dVar;
    }

    @Override // kotlinx.coroutines.j0
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f22530a;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}

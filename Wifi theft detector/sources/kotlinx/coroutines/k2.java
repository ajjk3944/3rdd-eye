package kotlinx.coroutines;

/* loaded from: classes4.dex */
public final class k2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineDispatcher f22572a;

    /* renamed from: b, reason: collision with root package name */
    public final o f22573b;

    public k2(CoroutineDispatcher coroutineDispatcher, o oVar) {
        this.f22572a = coroutineDispatcher;
        this.f22573b = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f22573b.z(this.f22572a, y8.s.f25199a);
    }
}
